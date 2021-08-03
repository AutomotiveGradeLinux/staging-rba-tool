package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.IsActive
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsActiveValidator extends AbstractRBAModelValidator {

	private String ISACTIVE_SIZE = Messages.ISACTIVE_SIZE;

	private String ISACTIVE_TYPE = Messages.ISACTIVE_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsActive(IsActive isActive) {
		if (isActive.operand.size > 1) {
			error(ISACTIVE_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (operand : isActive.operand) {
			if (operand.type != ExpressionType.CONTENT && operand.type != ExpressionType.SOUND) {
				error(ISACTIVE_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
