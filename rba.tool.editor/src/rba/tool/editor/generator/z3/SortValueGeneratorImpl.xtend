package rba.tool.editor.generator.z3

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import rba.tool.editor.model.manager.ResourceManager

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SortValueGeneratorImpl extends AbstractGenerator implements ISortValueGenerator {

	private static SortValueCodeGenerationSupporter generationSupporter = new SortValueCodeGenerationSupporter();

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		doGenerate(input.resourceSet, fsa, context);
	}
	
	override beforeGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
	
	override afterGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}

	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("SortValueCalculation.java", resourceSet.compile);
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
}
