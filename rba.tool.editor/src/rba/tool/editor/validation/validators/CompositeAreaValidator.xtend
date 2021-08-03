package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.CompositeArea
import rba.view.RBAViewPackage

class CompositeAreaValidator extends AbstractRBAModelValidator {

	private String COMPOSITE_AREA_CHECK = Messages.COMPOSITE_AREA_CHECK;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkCompositeArea(CompositeArea compositeArea) {
		if (compositeArea.layout === null) {
			error(String.format(COMPOSITE_AREA_CHECK, compositeArea.name),
				RBAViewPackage.Literals.COMPOSITE_AREA__LAYOUT);
			return;
		}
	}
}
