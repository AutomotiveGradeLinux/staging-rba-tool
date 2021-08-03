package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.IsGreaterThanEqualOperator
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsGreaterThanEqualOperatorValidator extends AbstractRBAModelValidator {

	private String ISGREATERTHANEQUAL_OPERAND_SIZE = Messages.ISGREATERTHANEQUAL_OPERAND_SIZE;

	private String ISGREATERTHANEQUAL_OPERAND_TYPE = Messages.ISGREATERTHANEQUAL_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsGreaterThanEqualOperator(IsGreaterThanEqualOperator isGreaterThanEqualOperator) {
		if (isGreaterThanEqualOperator.operand.size < 2) {
			error(ISGREATERTHANEQUAL_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (var i = 0; i < isGreaterThanEqualOperator.operand.size; i++) {
			var operand = isGreaterThanEqualOperator.operand.get(i)

			if (operand.type != ExpressionType.VALUE) {
				error(ISGREATERTHANEQUAL_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND, i, null)
				return;
			}
		}
	}
}
