package rba.tool.editor.generator.rtmodel

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext

interface IRTModelUpdater extends IGenerator2 {

	def void doGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context);

	def void beforeGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context);

	def void afterGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context);
}
