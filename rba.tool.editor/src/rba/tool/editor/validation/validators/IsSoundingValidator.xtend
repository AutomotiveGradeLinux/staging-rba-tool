package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.sound.IsSounding
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsSoundingValidator extends AbstractRBAModelValidator {

	private String ISSOUNDING_SIZE = Messages.ISSOUNDING_SIZE;

	private String ISSOUNDING_TYPE = Messages.ISSOUNDING_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsHidden(IsSounding isSounding) {
		if (isSounding.operand.size > 1) {
			error(ISSOUNDING_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
		for (operand : isSounding.operand) {
			if (operand.type != ExpressionType.SOUND) {
				error(ISSOUNDING_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
