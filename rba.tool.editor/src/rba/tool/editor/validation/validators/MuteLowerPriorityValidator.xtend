package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.sound.MuteLowerPriority
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class MuteLowerPriorityValidator extends AbstractRBAModelValidator {
	private static final String OperatorName = MuteLowerPriority.simpleName

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkMuteLowerPriority(MuteLowerPriority muteLowerPriority) {
		if (muteLowerPriority.operand.size != 2) {
			error(String.format(Messages.OPERAND_SIZE_TWO, OperatorName), RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var firstArgument = muteLowerPriority.operand.get(0)
		if (firstArgument.type != ExpressionType::ZONE) {
			error(String.format(Messages.ARGUMENT_MUST_ZONE, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var secondArgument = muteLowerPriority.operand.get(1)
		if (secondArgument.type != ExpressionType::ZONE) {
			error(String.format(Messages.ARGUMENT_MUST_ZONE, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
	}
}
