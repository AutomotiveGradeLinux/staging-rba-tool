package rba.tool.editor.generator.json

import org.eclipse.xtext.generator.OutputConfiguration

class JSONGeneratorOutputConfiguration extends OutputConfiguration {

	new() {
		super("RBAMODEL_JSONGENERATOR_OUTPUT");
		setDescription("Output Folder");
		setOutputDirectory("./.RBATool/graphicalview/data");
		setOverrideExistingResources(true);
		setCreateOutputDirectory(true);
		setCleanUpDerivedResources(true);
		setSetDerivedProperty(true);
		setKeepLocalHistory(true);
	}

}
