package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.HorizontalLayout
import rba.view.RBAViewPackage

class HorizontalLayoutValidator extends AbstractRBAModelValidator {

	private String HORIZONTAL_LAYOUT_CHECK = Messages.HORIZONTAL_LAYOUT_CHECK;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkHorizontalLayout(HorizontalLayout horizontalLayout) {
		if (horizontalLayout.subarea.size == 0) {
			warning(HORIZONTAL_LAYOUT_CHECK, RBAViewPackage.Literals.ALIGNED_LAYOUT__SUBAREA);
			return;
		}
	}
}
