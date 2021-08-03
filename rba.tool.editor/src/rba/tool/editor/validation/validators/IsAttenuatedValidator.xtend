package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.sound.IsAttenuated
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsAttenuatedValidator extends AbstractRBAModelValidator {

	private String ISATTENUATED_SIZE = Messages.ISATTENUATED_SIZE;

	private String ISATTENUATED_TYPE = Messages.ISATTENUATED_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsHidden(IsAttenuated isAttenuated) {
		if (isAttenuated.operand.size > 1) {
			error(ISATTENUATED_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
		for (operand : isAttenuated.operand) {
			if (operand.type != ExpressionType.ZONE) {
				error(ISATTENUATED_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
