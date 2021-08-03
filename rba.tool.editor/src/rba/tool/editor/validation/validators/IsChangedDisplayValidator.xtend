package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.IsChangedDisplay
import rba.core.ExpressionType

class IsChangedDisplayValidator extends AbstractRBAModelValidator {
	private static final String OperatorName = IsChangedDisplay.simpleName

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsChangedDisplay(IsChangedDisplay isChangedDisplay) {
		if (isChangedDisplay.operand.size > 1) {
			error(String.format(Messages.OPERAND_SIZE_ONE, OperatorName), RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var firstOperand = isChangedDisplay.operand.get(0)
		if (firstOperand.type != ExpressionType::AREA) {
			error(String.format(Messages.FIRST_OPERAND_MUST_AREA, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}
	}
}
