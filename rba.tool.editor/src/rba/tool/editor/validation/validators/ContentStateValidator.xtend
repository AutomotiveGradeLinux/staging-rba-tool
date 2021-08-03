package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ContentState
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class ContentStateValidator extends AbstractRBAModelValidator {

	private String CONTENTSTATE_TYPE = Messages.CONTENTSTATE_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkContentState(ContentState contentState) {
		if (contentState.value.type != ExpressionType.VALUE) {
			error(String.format(CONTENTSTATE_TYPE, contentState.name), RBACorePackage.Literals.CONTENT_STATE__VALUE)
			return;
		}
	}
}
