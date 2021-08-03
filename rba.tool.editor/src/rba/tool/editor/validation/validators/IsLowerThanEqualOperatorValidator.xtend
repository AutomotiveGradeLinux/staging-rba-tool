package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.IsLowerThanEqualOperator
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsLowerThanEqualOperatorValidator extends AbstractRBAModelValidator {

	private String ISLOWERTHANEQUAL_OPERAND_SIZE = Messages.ISLOWERTHANEQUAL_OPERAND_SIZE;

	private String ISLOWERTHANEQUAL_OPERAND_TYPE = Messages.ISLOWERTHANEQUAL_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsLowerThanEqualOperator(IsLowerThanEqualOperator isLowerThanEqualOperator) {
		if (isLowerThanEqualOperator.operand.size < 2) {
			error(ISLOWERTHANEQUAL_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (var i = 0; i < isLowerThanEqualOperator.operand.size; i++) {
			var operand = isLowerThanEqualOperator.operand.get(i)

			if (operand.type != ExpressionType.VALUE) {
				error(ISLOWERTHANEQUAL_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND, i, null)
				return;
			}
		}
	}
}
