package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.RBAViewPackage

class SizeValidator extends AbstractRBAModelValidator {

	private String SIZE_NEGATIVE = Messages.SIZE_NEGATIVE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkSize(rba.view.Size size) {
		if (size.getWidth() < 0) {
			error(SIZE_NEGATIVE, RBAViewPackage.Literals.SIZE__WIDTH);
			return;
		}
		if (size.getHeight() < 0) {
			error(SIZE_NEGATIVE, RBAViewPackage.Literals.SIZE__HEIGHT);
			return;
		}
	}
}
