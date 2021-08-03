package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.FixedPositionLayout
import rba.view.RBAViewPackage

class FixedPositionLayoutValidator extends AbstractRBAModelValidator {

	private String FIXEDPOSITION_LAYOUT_CHECK = Messages.FIXEDPOSITION_LAYOUT_CHECK;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkFixedPositionLayout(FixedPositionLayout fixedPositionLayout) {
		if (fixedPositionLayout.subAreaPosition.size == 0) {
			error(FIXEDPOSITION_LAYOUT_CHECK, RBAViewPackage.Literals.FIXED_POSITION_LAYOUT__SUB_AREA_POSITION);
			return;
		}
	}
}
