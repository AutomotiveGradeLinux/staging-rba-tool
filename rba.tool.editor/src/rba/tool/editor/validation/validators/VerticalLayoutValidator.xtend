package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.RBAViewPackage
import rba.view.VerticalLayout

class VerticalLayoutValidator extends AbstractRBAModelValidator {

	private String VERTICAL_LAYOUT_CHECK = Messages.VERTICAL_LAYOUT_CHECK;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkVerticalLayout(VerticalLayout verticalLayout) {
		if (verticalLayout.subarea.size == 0) {
			warning(VERTICAL_LAYOUT_CHECK, RBAViewPackage.Literals.ALIGNED_LAYOUT__SUBAREA);
			return;
		}
	}
}
