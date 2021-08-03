package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ContentValue
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class ContentValueValidator extends AbstractRBAModelValidator {

	private String CONTENTVALUE_SIZE = Messages.CONTENTVALUE_SIZE;

	private String CONTENTVALUE_TYPE = Messages.CONTENTVALUE_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkContentValue(ContentValue contentValue) {
		if (contentValue.operand.size > 1) {
			error(CONTENTVALUE_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (operand : contentValue.operand) {
			if (operand.type != ExpressionType.AREA && operand.type != ExpressionType.ZONE) {
				error(CONTENTVALUE_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
