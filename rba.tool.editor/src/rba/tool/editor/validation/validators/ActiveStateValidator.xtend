package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.core.ExpressionType
import rba.core.ActiveState

class ActiveStateValidator extends AbstractRBAModelValidator {

	private String OPERAND_SIZE_ONE = Messages.OPERAND_SIZE_ONE;
	private String FIRST_OPERAND_MUST_CONTENT = Messages.FIRST_OPERAND_MUST_CONTENT;
	
	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkActiveState(ActiveState op) {
		if (op.operand.size < 1) {
			error(String.format(OPERAND_SIZE_ONE, op.symbol), RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
		var operand = op.operand.get(0)
		if (operand.type != ExpressionType.CONTENT && operand.type != ExpressionType.SOUND) {
			error(String.format(FIRST_OPERAND_MUST_CONTENT, op.symbol), RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
	}
}
