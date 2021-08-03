package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.GetContentsList
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class GetContentsListValidator extends AbstractRBAModelValidator {

	private String GETCONTENTSLIST_SIZE = Messages.GETCONTENTSLIST_SIZE;

	private String GETCONTENTSLIST_TYPE = Messages.GETCONTENTSLIST_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkGetContentsList(GetContentsList getContentsList) {
		if (getContentsList.operand.size > 1) {
			error(GETCONTENTSLIST_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (operand : getContentsList.operand) {
			if (operand.type != ExpressionType.AREA && operand.type != ExpressionType.ZONE) {
				error(GETCONTENTSLIST_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
