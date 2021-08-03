package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ActiveContents
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.core.ExpressionType

class ActiveContentsValidator extends AbstractRBAModelValidator {

	private String OPERAND_SIZE_ONE = Messages.OPERAND_SIZE_ONE;
	private String FIRST_OPERAND_MUST_ALLOCATABLE = Messages.FIRST_OPERAND_MUST_ALLOCATABLE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkActivateContent(ActiveContents op) {
		if (op.operand.size != 1) {
			error(String.format(OPERAND_SIZE_ONE, op.symbol), RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
		var firstOperand = op.operand.get(0)
		if (firstOperand.type != ExpressionType::AREA && firstOperand.type != ExpressionType::ZONE) {
			error(String.format(FIRST_OPERAND_MUST_ALLOCATABLE, op.symbol),
				RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}
	}
}
