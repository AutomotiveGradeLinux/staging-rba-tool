package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.IsLowerThanOperator
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsLowerThanOperatorValidator extends AbstractRBAModelValidator {

	private String ISLOWERTHAN_OPERAND_SIZE = Messages.ISLOWERTHAN_OPERAND_SIZE;

	private String ISLOWERTHAN_OPERAND_TYPE = Messages.ISLOWERTHAN_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsLowerThanOperator(IsLowerThanOperator isLowerThanOperator) {
		if (isLowerThanOperator.operand.size < 2) {
			error(ISLOWERTHAN_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (var i = 0; i < isLowerThanOperator.operand.size; i++) {
			var operand = isLowerThanOperator.operand.get(i)

			if (operand.type != ExpressionType.VALUE) {
				error(ISLOWERTHAN_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND, i, null)
				return;
			}
		}
	}
}
