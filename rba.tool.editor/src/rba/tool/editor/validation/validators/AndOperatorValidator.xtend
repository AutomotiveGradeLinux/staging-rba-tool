package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.AndOperator
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class AndOperatorValidator extends AbstractRBAModelValidator {

	private String AND_OPERAND_SIZE = Messages.AND_OPERAND_SIZE;

	private String AND_OPERAND_TYPE = Messages.AND_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkAndOperator(AndOperator andOperator) {
		if (andOperator.operand.size < 2) {
			error(AND_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (var i = 0; i < andOperator.operand.size; i++) {
			var operand = andOperator.operand.get(i)
			if (operand.type != ExpressionType.BOOLEAN) {
				error(AND_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND, i, null)
				return;
			}
		}
	}
}
