package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.IsGreaterThanOperator
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsGreaterThanOperatorValidator extends AbstractRBAModelValidator {

	private String ISGREATERTHAN_OPERAND_SIZE = Messages.ISGREATERTHAN_OPERAND_SIZE;

	private String ISGREATERTHAN_OPERAND_TYPE = Messages.ISGREATERTHAN_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsGreaterThanOperator(IsGreaterThanOperator isGreaterThanOperator) {
		if (isGreaterThanOperator.operand.size < 2) {
			error(ISGREATERTHAN_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (var i = 0; i < isGreaterThanOperator.operand.size; i++) {
			var operand = isGreaterThanOperator.operand.get(i)

			if (operand.type != ExpressionType.VALUE) {
				error(ISGREATERTHAN_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND, i, null)
				return;
			}
		}
	}
}
