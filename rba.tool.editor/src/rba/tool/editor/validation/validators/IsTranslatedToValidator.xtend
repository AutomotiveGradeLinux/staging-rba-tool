package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.IsTranslatedTo
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsTranslatedToValidator extends AbstractRBAModelValidator {
	private static final String OperatorName = IsTranslatedTo.simpleName

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsTranslatedTo(IsTranslatedTo isTranslatedTo) {
		if (isTranslatedTo.operand.size < 2) {
			error(String.format(Messages.OPERAND_SIZE_TWO, OperatorName), RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var firstOperand = isTranslatedTo.operand.get(0)
		if (firstOperand.type != ExpressionType::AREA && firstOperand.type != ExpressionType::ZONE) {
			error(String.format(Messages.FIRST_OPERAND_MUST_ALLOCATABLE, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var argument = isTranslatedTo.operand.get(1)
		if (argument.type != ExpressionType::CONTENT && argument.type != ExpressionType::SOUND) {
			error(String.format(Messages.ARGUMENT_MUST_CONTENT, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}

		if ((firstOperand.type == ExpressionType::AREA && argument.type == ExpressionType::SOUND) ||
			(firstOperand.type == ExpressionType::ZONE && argument.type == ExpressionType::CONTENT ) ||
			(firstOperand.type == ExpressionType::ZONE ) ||
			(argument.type == ExpressionType::SOUND )) {
			error(String.format(Messages.COMBINATION_OPERAND_ARGUMENT, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
	}
}
