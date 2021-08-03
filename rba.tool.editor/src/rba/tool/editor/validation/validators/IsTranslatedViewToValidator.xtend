package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.IsTranslatedViewTo
import rba.core.ExpressionType

class IsTranslatedViewToValidator extends AbstractRBAModelValidator {
	private static final String OperatorName = IsTranslatedViewTo.simpleName

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsTranslatedViewTo(IsTranslatedViewTo isTranslatedViewTo) {
		if (isTranslatedViewTo.operand.size < 2) {
			error(String.format(Messages.OPERAND_SIZE_TWO, OperatorName), RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var firstOperand = isTranslatedViewTo.operand.get(0)
		if (firstOperand.type != ExpressionType::AREA) {
			error(String.format(Messages.FIRST_OPERAND_MUST_AREA, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var argument = isTranslatedViewTo.operand.get(1)
		if (argument.type != ExpressionType::CONTENT) {
			error(String.format(Messages.ARGUMENT_MUST_VIEWCONTENT, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
	}
}
