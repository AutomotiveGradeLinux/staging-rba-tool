package rba.tool.editor.generator.json

import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer
import org.eclipse.xtext.generator.AbstractFileSystemAccess
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import rba.tool.editor.model.manager.ResourceManager
import rba.view.Display

abstract class AbstractJSONGenerator extends AbstractGenerator implements IJSONGenerator {

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		doGenerate(input.resourceSet, fsa, context);
	}

	override beforeGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}

	override afterGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}

	override doGenerate(ResourceSet resourceSet, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (resourceSet.resources.empty) {
			return;
		}
		val resource = resourceSet.resources.get(0);
		val file = WorkspaceSynchronizer.getFile(resource);
		if (!file.exists) {
			return;
		}

		val project = file.project;
		if (project === null) {
			return;
		}

		if (!(fsa instanceof AbstractFileSystemAccess)) {
			return;
		}

		val allDisplays = ResourceManager.INSTANCE.getRbaDisplays(resourceSet);

		fsa.generateFile("data.js", OUTPUT_CONFIGURATION.name, createJSONFile(allDisplays));
	}

	def abstract public String createJSONFile(List<Display> displays);

}
