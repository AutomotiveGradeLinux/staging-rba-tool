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
class ConstraintGeneratorImpl extends AbstractGenerator implements IConstraintGenerator {

	private static ConstraintCodeGenerationSupporter generationSupporter = new ConstraintCodeGenerationSupporter();

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		doGenerate(input.resourceSet, fsa, context);
	}
	
	override beforeGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
	
	override afterGenerate(ResourceSet input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}

	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("ConstraintCalculation.java", resourceSet.compile);
	}

	def compile(ResourceSet resourceSet) '''
		«val allAreas = ResourceManager.INSTANCE.getRbaAreas(resourceSet)»
		«val allZones = ResourceManager.INSTANCE.getRbaZones(resourceSet)»
		«val allVContents = ResourceManager.INSTANCE.getRbaViewContents(resourceSet)»
		«val allSContents = ResourceManager.INSTANCE.getRbaSoundContents(resourceSet)»
		«val allAreaSets = ResourceManager.INSTANCE.getRbaAreaSets(resourceSet)»
		«val allZoneSets = ResourceManager.INSTANCE.getRbaZoneSets(resourceSet)»
		«val allVContentSets = ResourceManager.INSTANCE.getRbaViewContentSets(resourceSet)»
		«val allSContentSets = ResourceManager.INSTANCE.getRbaSoundContentSets(resourceSet)»
		«val allValiables = ResourceManager.INSTANCE.getRbaVariables(resourceSet)»
		«val allConstraints = ResourceManager.INSTANCE.getRbaConstraints(resourceSet)»
		«val allScenes = ResourceManager.INSTANCE.getRbaScenes(resourceSet)»
		«val allSetOfOperators = ResourceManager.INSTANCE.getRbaSetOfOperators(resourceSet)»
		«generationSupporter.generate(allVContents,allSContents, allAreas,allZones, allVContentSets,allSContentSets, allAreaSets,allZoneSets,  allValiables, allConstraints, allScenes, allSetOfOperators)»
	'''
}
