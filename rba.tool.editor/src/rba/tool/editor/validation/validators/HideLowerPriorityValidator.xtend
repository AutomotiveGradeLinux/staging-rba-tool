package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.HideLowerPriority

class HideLowerPriorityValidator extends AbstractRBAModelValidator {
	private static final String OperatorName = HideLowerPriority.simpleName

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkHideLowerPriority(HideLowerPriority hideLowerPriority) {
		if (hideLowerPriority.operand.size != 2) {
			error(String.format(Messages.OPERAND_SIZE_TWO, OperatorName), RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var firstArgument = hideLowerPriority.operand.get(0)
		if (firstArgument.type != ExpressionType::AREA) {
			error(String.format(Messages.ARGUMENT_MUST_AREA, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var secondArgument = hideLowerPriority.operand.get(1)
		if (secondArgument.type != ExpressionType::AREA) {
			error(String.format(Messages.ARGUMENT_MUST_AREA, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
	}
}
