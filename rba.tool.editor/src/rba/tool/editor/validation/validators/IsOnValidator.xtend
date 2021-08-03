package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.IsOn
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class IsOnValidator extends AbstractRBAModelValidator {

	private String ISON_SIZE = Messages.ISON_SIZE;

	private String ISON_TYPE = Messages.ISON_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsOnOperator(IsOn isOn) {
		if (isOn.operand.size > 1) {
			error(ISON_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
		if (isOn.operand.get(0).type != ExpressionType.SCENE) {
			error(ISON_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
	}
}
