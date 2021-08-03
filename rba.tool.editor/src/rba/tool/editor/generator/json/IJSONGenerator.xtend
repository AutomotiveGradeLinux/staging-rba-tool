package rba.tool.editor.generator.json

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.OutputConfiguration

interface IJSONGenerator extends IGenerator2 {

	static OutputConfiguration OUTPUT_CONFIGURATION = new JSONGeneratorOutputConfiguration();

	def void doGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context);

	def void beforeGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context);

	def void afterGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context);
}
