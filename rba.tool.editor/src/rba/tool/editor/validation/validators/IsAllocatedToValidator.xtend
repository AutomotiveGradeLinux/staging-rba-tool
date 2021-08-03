package rba.tool.editor.validation.validators

import rba.tool.editor.validation.AbstractRBAModelValidator
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.IsAllocatedTo
import rba.tool.editor.messages.Messages
import rba.core.RBACorePackage
import rba.core.ExpressionType
import org.eclipse.xtext.validation.Check

class IsAllocatedToValidator extends AbstractRBAModelValidator {
	private static final String OperatorName = IsAllocatedTo.simpleName

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsAllocatedTo(IsAllocatedTo isAllocatedTo) {
		if (isAllocatedTo.operand.size < 2) {
			error(String.format(Messages.OPERAND_SIZE_TWO, OperatorName), RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var firstOperand = isAllocatedTo.operand.get(0)
		if (firstOperand.type != ExpressionType::CONTENT && firstOperand.type != ExpressionType::SOUND) {
			error(String.format(Messages.FIRST_OPERAND_MUST_CONTENT, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var argument = isAllocatedTo.operand.get(1)
		if (argument.type != ExpressionType::AREA && argument.type != ExpressionType::ZONE) {
			error(String.format(Messages.ARGUMENT_MUST_ALLOCATABLE, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}

		if ((firstOperand.type == ExpressionType::CONTENT && argument.type == ExpressionType::ZONE) ||
			(firstOperand.type == ExpressionType::SOUND && argument.type == ExpressionType::AREA ) ||
			(argument.type == ExpressionType::ZONE ) ||
			(firstOperand.type == ExpressionType::SOUND )) {
			error(String.format(Messages.COMBINATION_OPERAND_ARGUMENT, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
	}
}
