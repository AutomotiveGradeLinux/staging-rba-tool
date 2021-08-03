package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.sound.IsTranslatedSoundTo
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsTranslatedSoundToValidator extends AbstractRBAModelValidator {
	private static final String OperatorName = IsTranslatedSoundTo.simpleName

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsTranslatedSoundTo(IsTranslatedSoundTo isTranslatedSoundTo) {
		if (isTranslatedSoundTo.operand.size < 2) {
			error(String.format(Messages.OPERAND_SIZE_TWO, OperatorName), RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var firstOperand = isTranslatedSoundTo.operand.get(0)
		if (firstOperand.type != ExpressionType::ZONE) {
			error(String.format(Messages.FIRST_OPERAND_MUST_ZONE, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 0)
			return;
		}

		var argument = isTranslatedSoundTo.operand.get(1)
		if (argument.type != ExpressionType::SOUND) {
			error(String.format(Messages.ARGUMENT_MUST_SOUNDCONTENT, OperatorName),
				RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
	}
}
