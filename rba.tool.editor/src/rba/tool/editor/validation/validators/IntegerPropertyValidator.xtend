package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.IntegerProperty
import rba.tool.editor.validation.AbstractRBAModelValidator

class IntegerPropertyValidator extends AbstractRBAModelValidator {

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkRequiredValue(IntegerProperty property) {
	}
}
