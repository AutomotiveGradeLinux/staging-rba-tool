package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.IsHidden

class IsHiddenValidator extends AbstractRBAModelValidator {

	private String ISHIDDEN_SIZE = Messages.ISHIDDEN_SIZE;

	private String ISHIDDEN_TYPE = Messages.ISHIDDEN_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsHidden(IsHidden IsHidden) {
		if (IsHidden.operand.size > 1) {
			error(ISHIDDEN_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (operand : IsHidden.operand) {
			if (operand.type != ExpressionType.AREA) {
				error(ISHIDDEN_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
