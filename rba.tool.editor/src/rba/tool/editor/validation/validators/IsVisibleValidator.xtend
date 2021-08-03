package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.IsVisible

class IsVisibleValidator extends AbstractRBAModelValidator {

	private String ISVISIBLE_SIZE = Messages.ISVISIBLE_SIZE;

	private String ISVISIBLE_TYPE = Messages.ISVISIBLE_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsVisible(IsVisible isVisible) {
		if (isVisible.operand.size > 1) {
			error(ISVISIBLE_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (operand : isVisible.operand) {
			if (operand.type != ExpressionType.CONTENT) {
				error(ISVISIBLE_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
