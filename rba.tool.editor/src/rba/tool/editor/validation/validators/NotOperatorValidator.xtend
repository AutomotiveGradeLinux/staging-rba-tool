package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.NotOperator
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class NotOperatorValidator extends AbstractRBAModelValidator {

	private String NOT_OPERAND_SIZE = Messages.NOT_OPERAND_SIZE;

	private String NOT_OPERAND_TYPE = Messages.NOT_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkNotOperator(NotOperator notOperator) {
		if (notOperator.operand.size > 1) {
			error(NOT_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (operand : notOperator.operand) {
			if (operand.type != ExpressionType.BOOLEAN) {
				error(NOT_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
