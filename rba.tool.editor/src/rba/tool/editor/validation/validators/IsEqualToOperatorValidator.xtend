package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.IsEqualToOperator
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsEqualToOperatorValidator extends AbstractRBAModelValidator {

	private String ISEQUALTO_OPERAND_SIZE = Messages.ISEQUALTO_OPERAND_SIZE;

	private String ISEQUALTO_OPERAND_TYPE = Messages.ISEQUALTO_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsEqualToOperator(IsEqualToOperator isEqualToOperator) {
		if (isEqualToOperator.operand.size < 2) {
			error(ISEQUALTO_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (var i = 0; i < isEqualToOperator.operand.size; i++) {
			var operand = isEqualToOperator.operand.get(i)

			if (operand.type != ExpressionType.VALUE) {
				error(ISEQUALTO_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND, i, null)
				return;
			}
		}
	}
}
