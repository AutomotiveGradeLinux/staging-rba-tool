package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.sound.IsOutputtedOn
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsOutputtedOnValidator extends AbstractRBAModelValidator {
	private static final String OperatorName = IsOutputtedOn.simpleName

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsOutputtedOn(IsOutputtedOn isOutputtedOn) {
		if (isOutputtedOn.operand.size < 2) {
			error(String.format(Messages.OPERAND_SIZE_TWO, OperatorName), RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var firstOperand = isOutputtedOn.operand.get(0)
		if (firstOperand.type != ExpressionType::SOUND) {
			error(String.format(Messages.FIRST_OPERAND_MUST_SOUNDCONTENT, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var argument = isOutputtedOn.operand.get(1)
		if (argument.type != ExpressionType::ZONE) {
			error(String.format(Messages.ARGUMENT_MUST_ZONE, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
	}
}
