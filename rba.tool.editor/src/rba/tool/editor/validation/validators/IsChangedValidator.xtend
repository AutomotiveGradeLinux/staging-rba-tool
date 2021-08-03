package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.IsChanged
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.core.ExpressionType

class IsChangedValidator extends AbstractRBAModelValidator {
	private static final String OperatorName = IsChanged.simpleName

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsChanged(IsChanged isChanged) {
		if (isChanged.operand.size > 1) {
			error(String.format(Messages.OPERAND_SIZE_ONE, OperatorName), RBACorePackage.Literals.OPERATOR__OPERAND, 0)
		}

		var firstOperand = isChanged.operand.get(0)
		if (firstOperand.type != ExpressionType::AREA && firstOperand.type != ExpressionType::ZONE) {
			error(String.format(Messages.FIRST_OPERAND_MUST_ALLOCATABLE, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}
	}
}
