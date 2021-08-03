package rba.tool.editor.ui.wizard

import rba.tool.editor.ui.wizard.RBAModelProjectCreator
import rba.tool.editor.util.RBAModelEditorNameUtil

class ExtendRBAModelProjectCreator extends RBAModelProjectCreator {
	
	override public getModelFolderName() {
		return RBAModelEditorNameUtil.BUILD_FOLDER_NAME;
	}
	
}