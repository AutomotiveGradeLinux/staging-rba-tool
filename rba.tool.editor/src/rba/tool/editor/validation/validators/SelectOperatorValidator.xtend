package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.core.SelectOperator
import rba.core.ExpressionType

class SelectOperatorValidator extends AbstractRBAModelValidator {

	private String SELECT_OPERAND_SIZE = Messages.SELECT_OPERAND_SIZE;
	private String SELECT_OPERAND_TYPE = Messages.SELECT_OPERAND_TYPE;
	
	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkSelectOperator(SelectOperator op) {
		if (op.operand.size == 0) {
			error(String.format(SELECT_OPERAND_SIZE, op.symbol), RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
		var operand = op.operand.get(0)
		if (operand.type != ExpressionType.SET_OF_CONTENT && operand.type != ExpressionType.SET_OF_AREA && operand.type != ExpressionType.SET_OF_SOUND &&
			operand.type != ExpressionType.SET_OF_ZONE) {
			error(String.format(SELECT_OPERAND_TYPE, op.symbol), RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
	}
}
