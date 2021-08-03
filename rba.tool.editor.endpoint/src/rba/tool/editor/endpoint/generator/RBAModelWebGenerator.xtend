package rba.tool.editor.endpoint.generator

import java.util.List
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import groovy.lang.Binding;
import groovy.util.GroovyScriptEngine;
import org.codehaus.groovy.control.CompilerConfiguration;

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import rba.tool.editor.model.manager.ResourceManager
import rba.tool.core.sort.SortValueManager;

import rba.core.Allocatable;
import rba.view.Area;
import rba.sound.Zone;
import rba.view.AreaSet;
import rba.sound.ZoneSet;
import rba.core.Content;
import rba.view.ViewContent;
import rba.view.ViewContentSet;
import rba.sound.SoundContent;
import rba.sound.SoundContentSet;
import rba.core.State;
import rba.core.Scene;
import rba.view.Size;
import rba.view.Display
import rba.view.PositionContainer
import rba.core.Package;
import rba.core.Constraint;
import rba.core.Variable;
import rba.core.SetOfOperator;

import rba.tool.editor.generator.z3.SortValueCodeGenerationSupporter;
import rba.tool.core.sort.ISortValueCalculation;

import java.io.OutputStreamWriter
import java.io.FileOutputStream
import java.nio.charset.StandardCharsets
import rba.tool.core.sort.SortValue
import java.util.Arrays
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList
import org.eclipse.emf.ecore.util.EContentsEList
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.common.util.EList

class RBAModelWebGenerator extends AbstractGenerator {
		
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var isError = false
		
		for(r : resource.resourceSet.resources)
		{
			for(eo : r.allContents.toIterable)
			{				
				//to resolve cross reference 
				var EContentsEList.FeatureIterator<EObject> fi = eo.eCrossReferences.iterator as EContentsEList.FeatureIterator<EObject>;
				while( fi.hasNext() ) {
					var EObject o = fi.next();
					var EReference er = fi.feature() as EReference;
					if (er.getEOpposite() !== null) {
						//System.out.println(eo + "'s " + er.name + " --> " + o);
						if (er.getEOpposite().isMany) {
							var oppositeList =(o.eGet(er.getEOpposite()) as EList<EObject>);
							if (!oppositeList.contains(eo)) {
								oppositeList.add(eo)
							}
						} else {
							
						}
					}
				}
			}
			
			for(w : r.warnings)
			{
				System.err.println(w.toString)
			}
			for(e : r.errors)
			{
				var filename = new File(r.URI.toFileString).name;
				System.err.println("Error: " + filename + ":" + e.line + " " + e.message)
				isError = true
			}
		}	
		
		if(isError) 
		{
			return;	
		}
		
		runScript(WorkingDirectory.get() + "/script", "TemplateGenerator.groovy", resource.resourceSet);		
	}	
	
	def void runScript(String scriptDir, String fileName, ResourceSet resourceSet) {
		try {			
			var dir = new File(scriptDir)
			var file = new File(scriptDir + "/" + fileName)
			if (!dir.exists() || !file.exists()) {
				return;
			}
			var e = new GroovyScriptEngine(#[scriptDir], getClass().getClassLoader())
			var config = new CompilerConfiguration()
			config.setTargetDirectory(scriptDir)
			var RunScriptInternalUtil util = new RunScriptInternalUtil()
			util.setResourceManager(ResourceManager.INSTANCE)
			util.setResourceSet(resourceSet)
			util.loadZ3Lib();
			util.calculate();
			var Binding bind = new Binding()
			bind.setVariable("location", scriptDir)
			bind.setVariable("util", util)
			e.setConfig(config)
			var start_time = System.currentTimeMillis()
			e.run(fileName, bind)
			var finish_time = System.currentTimeMillis()
			removeClassFiles(scriptDir)
			new File(WorkingDirectory.get() + "/" + "success").createNewFile
		} catch (Throwable e) {
			e.printStackTrace()
			System.err.println("error:" + e.getMessage())
		}

	}
	
	def static void removeClassFiles(String folderPath) {
		var File folder = new File(folderPath)
		for (File file : folder.listFiles()) {
			var pattern = Pattern.compile(".class$")
			var Matcher m = pattern.matcher(file.getName())
			if (file.isFile() && m.find()) {
				file.delete()
			}
		}
	}

}

class WorkingDirectory {
	def static String get() {
		return new File(RBAModelWebGenerator.getProtectionDomain().getCodeSource().getLocation().toURI()).parent;
	}
}

class RunScriptInternalUtil {
	ResourceSet resourceSet;
	ResourceManager resourceManager
	private static SortValueCodeGenerationSupporter generationSupporter = new SortValueCodeGenerationSupporter();

	private SortValue areaZorderSortValue = new SortValue();
    private SortValue visibilitySortValue = new SortValue();
    private SortValue csPrioritySortValue = new SortValue();
    
    static String OS_NAME = System.getProperty("os.name").toLowerCase();
    def boolean isLinux() {
        return OS_NAME.startsWith("linux");
    }
    def boolean isWindows() {
        return OS_NAME.startsWith("windows");
    }

	def protected void setSortValueManager(SortValueManager sortValueManager) {
		this.sortValueManager = sortValueManager
	}

	def protected void setResourceManager(ResourceManager resourceManager) {
		this.resourceManager = resourceManager
	}
	
	def protected void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet
	}
	
	def boolean loadZ3Lib() {
		var z3Path = WorkingDirectory.get();
		
		if(isLinux()) {
			z3Path = z3Path + "/lib/linux/z3/bin";
		}
		else if(isWindows()) {
			z3Path = z3Path + "/lib/windows/z3";
		}
		else {
			print("error: Not supported OS");
			return false;
		}
        
        try {
            loadLibs(z3Path);
            addLibraryPath(z3Path);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    def void loadLibs(String z3Path) throws Exception {
    	if(isLinux()) {
    		System.load(z3Path + "/libz3.so");
        	System.load(z3Path + "/libz3java.so");
    	}
    	else if(isWindows()) {
	        System.load(z3Path + "/Microsoft.Z3.dll");
	        System.load(z3Path + "/msvcr110.dll");
	        System.load(z3Path + "/msvcp110.dll");
	        System.load(z3Path + "/vcomp110.dll");
	        System.load(z3Path + "/libz3.dll");
	        System.load(z3Path + "/libz3java.dll");
        }
    }

    def void addLibraryPath(String pathToAdd) throws Exception {
        val usrPathsField = ClassLoader.getDeclaredField("usr_paths");
        usrPathsField.setAccessible(true);
        val paths = usrPathsField.get(null) as String[];
        for (String path : paths) {
            if (path.equals(pathToAdd)) {
                return;
            }
        }
        val newPaths = Arrays.copyOf(paths, paths.length + 1);
        newPaths.set(newPaths.length - 1, pathToAdd);
        usrPathsField.set(null, newPaths);
    }
	
	def void calculate() {
		var code = resourceSet.compile.toString();
		val createdFile = new File("./SortValueCalculation.java");
		try { 
			var writer = new OutputStreamWriter(new FileOutputStream(createdFile), StandardCharsets.UTF_8);
			writer.write(code, 0, code.length());
	    	writer.flush();
	    	writer.close();
		}
		catch(Exception e) {
			System.out.println("error: " + e.toString());
		}
		
		var e = new GroovyScriptEngine("./", getClass().getClassLoader());
        e.loadScriptByName("./SortValueCalculation.java");
        var s = e.getGroovyClassLoader().loadClass("SortValueCalculation");

        var calc = s.newInstance() as ISortValueCalculation;
        calc.setUp();
        areaZorderSortValue.setSortValue(calc.calculateArea_zorder());
        visibilitySortValue.setSortValue(calc.calculateAllocatable_visibility());
        csPrioritySortValue.setSortValue(calc.calculateContentState_priority());
        calc.close();
        
        createdFile.delete();
	}
	
	def compile(ResourceSet resourceSet) '''
		«val allAllocatables = ResourceManager.INSTANCE.getRbaAllocatables(resourceSet)»
		
		«val allAreas = ResourceManager.INSTANCE.getRbaAreas(resourceSet)»
«««		«FOR area : allAreas»
«««			«area.name» : [ «FOR content : area.contents»«content.name», «ENDFOR»]
«««		«ENDFOR»
		«val allContents = ResourceManager.INSTANCE.getRbaContents(resourceSet)»
«««		«FOR content : allContents»
«««			«content.name» : [ «FOR area : content.allocatable»«area.name», «ENDFOR»]
«««		«ENDFOR»
		«generationSupporter.generate(allContents, allAllocatables, allAreas)»
	'''

	def void print(String message) {
		System.out.println(message)
	}

	def List<Allocatable> getAllocatables() {
		return resourceManager.getRbaAllocatables(resourceSet)
	}
	
	def List<Area> getAreas() {
		return resourceManager.getRbaAreas(resourceSet)
	}
	
	def List<Zone> getZones() {		
		return resourceManager.getRbaZones(resourceSet)
	}
	
	def List<AreaSet> getAreaSets() {
		return resourceManager.getRbaAreaSets(resourceSet)
	}
	
	def List<ZoneSet> getZoneSets() {
		return resourceManager.getRbaZoneSets(resourceSet)
	}

	def List<Content> getContents() {
		return resourceManager.getRbaContents(resourceSet)
	}
	
	def List<ViewContent> getViewContents() {
		return resourceManager.getRbaViewContents(resourceSet)
	}

	def List<ViewContentSet> getViewContentSets() {
		return resourceManager.getRbaViewContentSets(resourceSet)
	}
	
	def List<SoundContent> getSoundContents() {
		return resourceManager.getRbaSoundContents(resourceSet)
	}

	def List<SoundContentSet> getSoundContentSets() {
		return resourceManager.getRbaSoundContentSets(resourceSet)
	}
	
	def List<State> getStates() {
		return resourceManager.getRbaState(resourceSet)
	}
	
	def List<Scene> getScenes() {
		return resourceManager.getRbaScenes(resourceSet)
	}
	
	def List<Size> getSizes() {
		return resourceManager.getRbaSizes(resourceSet)
	} 
	
	def List<Display> getDisplays() {
		return resourceManager.getRbaDisplays(resourceSet)
	}

	def List<PositionContainer> getPositionContainers() {
		return resourceManager.getRbaPositionContainers(resourceSet)
	}

	def List<Package> getPackages() {
		return resourceManager.getRbaPackages(resourceSet)
	}

	def List<Package> getRootPackages() {
		return resourceManager.getRbaRootPackages(resourceSet)
	}

	def List<Constraint> getConstraints() {
		return resourceManager.getRbaConstraints(resourceSet)
	}

	def List<Constraint> getOnlineConstraints() {
		return resourceManager.getRbaOnlineConstraints(resourceSet)
	}

	def List<Constraint> getOfflineConstraints() {
		return resourceManager.getRbaOfflineConstraints(resourceSet)
	}
	
	def List<Constraint> getViewConstraints() {
		return resourceManager.getRbaViewConstraints(resourceSet)
	}

	def List<Constraint> getSoundConstraints() {
		return resourceManager.getRbaSoundConstraints(resourceSet)
	}


	def List<Variable> getVariables() {
		return resourceManager.getRbaVariables(resourceSet)
	}
	
	def List<SetOfOperator> getSetOfOperators() {
		return resourceManager.getRbaSetOfOperators(resourceSet)
	}	

	def int getVisibility(String areaName) {
		return visibilitySortValue.getValue(areaName);
	}

	def int getZorder(String areaName) {
		return areaZorderSortValue.getValue(areaName);
	}

	def int getPriority(String contentName, String contentStateName) {
		return csPrioritySortValue.getValue(contentName + "_" + contentStateName);
	}
	
	def <T extends EObject> List<T> collect(Class<T> clazz) {
       var results = new ArrayList<T>();
       var ite = resourceManager.getRbaAllContents(resourceSet).iterator();
       while (ite.hasNext()) {
           var obj = ite.next();
           if (clazz.isAssignableFrom(obj.getClass())) {
               results.add(obj as T);
           }
       }
       return results;
   }
}
