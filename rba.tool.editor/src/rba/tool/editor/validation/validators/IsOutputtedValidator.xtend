package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.sound.IsOutputted
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsOutputtedValidator extends AbstractRBAModelValidator {

	private String ISOUTPUTTED_SIZE = Messages.ISOUTPUTTED_SIZE;

	private String ISOUTPUTTED_TYPE = Messages.ISOUTPUTTED_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsHidden(IsOutputted isOutputted) {
		if (isOutputted.operand.size > 1) {
			error(ISOUTPUTTED_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
		for (operand : isOutputted.operand) {
			if (operand.type != ExpressionType.ZONE) {
				error(ISOUTPUTTED_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
