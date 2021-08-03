package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.OrOperator
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class OrOperatorValidator extends AbstractRBAModelValidator {

	private String OR_OPERAND_SIZE = Messages.OR_OPERAND_SIZE;

	private String OR_OPERAND_TYPE = Messages.OR_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkOrOperator(OrOperator orOperator) {
		if (orOperator.operand.size < 2) {
			error(OR_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (var i = 0; i < orOperator.operand.size; i++) {
			var operand = orOperator.operand.get(i)
			if (operand.type != ExpressionType.BOOLEAN) {
				error(OR_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND, i, null)
				return;
			}
		}
	}
}
