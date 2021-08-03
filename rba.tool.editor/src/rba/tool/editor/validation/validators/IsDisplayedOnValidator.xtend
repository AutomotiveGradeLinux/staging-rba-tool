package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.IsDisplayedOn

class IsDisplayedOnValidator extends AbstractRBAModelValidator {
	private static final String OperatorName = IsDisplayedOn.simpleName

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsDisplayedOn(IsDisplayedOn isDisplayedOn) {
		if (isDisplayedOn.operand.size < 2) {
			error(String.format(Messages.OPERAND_SIZE_TWO, OperatorName), RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var firstOperand = isDisplayedOn.operand.get(0)
		if (firstOperand.type != ExpressionType::CONTENT) {
			error(String.format(Messages.FIRST_OPERAND_MUST_VIEWCONTENT, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var argument = isDisplayedOn.operand.get(1)
		if (argument.type != ExpressionType::AREA) {
			error(String.format(Messages.ARGUMENT_MUST_AREA, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
	}
}
