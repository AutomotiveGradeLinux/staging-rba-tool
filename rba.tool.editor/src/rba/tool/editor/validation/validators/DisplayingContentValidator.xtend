package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.DisplayingContent

class DisplayingContentValidator extends AbstractRBAModelValidator {

	private String DISPLAYINGCONTENT_SIZE = Messages.DISPLAYINGCONTENT_SIZE;

	private String DISPLAYINGCONTENT_TYPE = Messages.DISPLAYINGCONTENT_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkDisplayingContent(DisplayingContent displayingContent) {
		if (displayingContent.operand.size > 1) {
			error(DISPLAYINGCONTENT_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (operand : displayingContent.operand) {
			if (operand.type != ExpressionType.AREA) {
				error(DISPLAYINGCONTENT_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
