package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.core.ExpressionType
import rba.core.IfStatement
import org.eclipse.xtext.EcoreUtil2
import rba.core.SizeOperator

class SizeOperatorValidator extends AbstractRBAModelValidator {

	private String OPERAND_SIZE_ONE = Messages.OPERAND_SIZE_ONE;
	private String SIZE_OPERAND_TYPE = Messages.SIZE_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkSizeOperator(SizeOperator op) {
		if (op.operand.size > 1) {
			error(OPERAND_SIZE_ONE, RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
		var operand = op.operand.get(0)
		if ((operand instanceof IfStatement) ||
			(EcoreUtil2.getAllContentsOfType(operand, IfStatement).size != 0) || 
			operand.type != ExpressionType.SET_OF_CONTENT && operand.type != ExpressionType.SET_OF_AREA && operand.type != ExpressionType.SET_OF_SOUND &&
			operand.type != ExpressionType.SET_OF_ZONE) {
			error(String.format(SIZE_OPERAND_TYPE, op.symbol), RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
	}
}
