package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.sound.OutputtingSound
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class OutputtingSoundValidator extends AbstractRBAModelValidator {

	private String OUTPUTTINGSOUND_SIZE = Messages.OUTPUTTINGSOUND_SIZE;

	private String OUTPUTTINGSOUND_TYPE = Messages.OUTPUTTINGSOUND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsHidden(OutputtingSound outputtingSound) {
		if (outputtingSound.operand.size > 1) {
			error(OUTPUTTINGSOUND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
		for (operand : outputtingSound.operand) {
			if (operand.type != ExpressionType.ZONE) {
				error(OUTPUTTINGSOUND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
