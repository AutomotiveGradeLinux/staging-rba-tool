package rba.tool.editor.generator.rtmodel

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

abstract class AbstractRTModelUpdater extends AbstractGenerator implements IRTModelUpdater {

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		doGenerate(input.resourceSet, fsa, context);
	}

	override beforeGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}

	override afterGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}

//	override doGenerate(ResourceSet resourceSet, IFileSystemAccess2 fsa, IGeneratorContext context) {
//	}
}
