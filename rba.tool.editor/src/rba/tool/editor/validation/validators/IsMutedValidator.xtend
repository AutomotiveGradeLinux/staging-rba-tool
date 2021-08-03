package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.sound.IsMuted
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsMutedValidator extends AbstractRBAModelValidator {

	private String ISMUTED_SIZE = Messages.ISMUTED_SIZE;

	private String ISMUTED_TYPE = Messages.ISMUTED_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsHidden(IsMuted isMuted) {
		if (isMuted.operand.size > 1) {
			error(ISMUTED_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
		for (operand : isMuted.operand) {
			if (operand.type != ExpressionType.ZONE) {
				error(ISMUTED_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
