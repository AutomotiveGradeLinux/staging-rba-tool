package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.sound.IsChangedOutput
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsChangedOutputValidator extends AbstractRBAModelValidator {
	private static final String OperatorName = IsChangedOutput.simpleName

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsChangedOutput(IsChangedOutput isChangedOutput) {
		if (isChangedOutput.operand.size > 1) {
			error(String.format(Messages.OPERAND_SIZE_ONE, OperatorName), RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var firstOperand = isChangedOutput.operand.get(0)
		if (firstOperand.type != ExpressionType::ZONE) {
			error(String.format(Messages.FIRST_OPERAND_MUST_ZONE, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}
	}
}
