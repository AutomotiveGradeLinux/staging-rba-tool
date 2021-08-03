package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.HasComeEarlierThan
import rba.core.PreviousModifier
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class HasComeEarlierThanValidator extends AbstractRBAModelValidator {

	private static final String TargetOperatorName = HasComeEarlierThan.simpleName

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkContentValue(HasComeEarlierThan hasComeEarlierThan) {
		if (hasComeEarlierThan.operand.size < 2) {
			error(String.format(Messages.OPERAND_SIZE_TWO, TargetOperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		var firstOperand = hasComeEarlierThan.operand.get(0)
		if (firstOperand.type != ExpressionType::CONTENT && firstOperand.type != ExpressionType::SOUND) {
			error(String.format(Messages.FIRST_OPERAND_MUST_CONTENT, TargetOperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		var argument = hasComeEarlierThan.operand.get(1)
		if (argument.type != ExpressionType::CONTENT && argument.type != ExpressionType::SOUND) {
			error(String.format(Messages.ARGUMENT_MUST_CONTENT, TargetOperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
		if (firstOperand instanceof PreviousModifier) {
			error(String.format(Messages.OPERAND_CANNOT_USE_PRE, TargetOperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		if (argument instanceof PreviousModifier) {
			error(String.format(Messages.ARGUMENT_CANNOT_USE_PRE, TargetOperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}

	}
}
