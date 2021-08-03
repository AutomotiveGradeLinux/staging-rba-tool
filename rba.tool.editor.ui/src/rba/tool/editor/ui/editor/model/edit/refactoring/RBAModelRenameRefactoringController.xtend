package rba.tool.editor.ui.editor.model.edit.refactoring

import com.google.inject.Singleton
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.refactoring.ui.RenameRefactoringController

@Singleton
class RBAModelRenameRefactoringController extends RenameRefactoringController {

	private String newNameText;

	override protected getOriginalName(XtextEditor xtextEditor) {
		if(this instanceof RBAModelRenameRefactoringController) {
			return newNameText;
		} else {
			super.getOriginalName(xtextEditor);
		}
	}

	def public void setNewNameText(String name) {
		this.newNameText = name;
	}

}
