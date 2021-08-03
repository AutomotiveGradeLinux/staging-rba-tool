package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ComparisonOperator
import rba.core.ExpressionType
import rba.core.PlusOperator
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class PlusOperatorValidator extends AbstractRBAModelValidator {

	private String PLUS_OPERAND_SIZE = Messages.PLUS_OPERAND_SIZE;

	private String PLUS_OPERAND_TYPE = Messages.PLUS_OPERAND_TYPE;

	private String PLUS_OPERAND_TYPE_NOT_OPERATOR = Messages.PLUS_OPERAND_TYPE_NOT_OPERATOR;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(FAST)
	def checkPlusOperatorFast(PlusOperator plusOperator) {
		if (plusOperator.operand.size < 2) {
			error(PLUS_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
	}

	@Check(NORMAL)
	def checkPlusOperatorNormal(PlusOperator plusOperator) {
		for (var i = 0; i < plusOperator.operand.size; i++) {
			var operand = plusOperator.operand.get(i)
			if (operand instanceof ComparisonOperator) {
				error(PLUS_OPERAND_TYPE_NOT_OPERATOR, RBACorePackage.Literals.OPERATOR__OPERAND, i, null)
				return;
			}

			if (operand.type != ExpressionType.VALUE) {
				error(PLUS_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND, i, null)
				return;
			}
		}
	}
}
