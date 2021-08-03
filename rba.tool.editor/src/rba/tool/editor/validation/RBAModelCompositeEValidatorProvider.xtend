package rba.tool.editor.validation

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.xtext.service.OperationCanceledManager
import org.eclipse.xtext.validation.CompositeEValidator
import org.eclipse.xtext.validation.CompositeEValidator.EValidatorEqualitySupport
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions

class RBAModelCompositeEValidatorProvider implements Provider<CompositeEValidator> {

	@Inject extension ReflectExtensions;

	@Inject private Provider<EValidatorEqualitySupport> equalitySupportProvider;

	@Inject private OperationCanceledManager operationCanceledManager;

	override get() {
		val CompositeEValidator compositeValidator = new RBAModelCompositeEValidator()
		compositeValidator.equalitySupportProvider = equalitySupportProvider;
		compositeValidator.set("operationCanceledManager", operationCanceledManager)
		return compositeValidator;
	}

}
