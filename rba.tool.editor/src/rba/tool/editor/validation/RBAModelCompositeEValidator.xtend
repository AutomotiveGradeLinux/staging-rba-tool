package rba.tool.editor.validation

import java.util.Map
import org.eclipse.emf.common.util.DiagnosticChain
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EObjectValidator
import org.eclipse.xtext.validation.CompositeEValidator

class RBAModelCompositeEValidator extends CompositeEValidator {

	override protected initDefaults() {
		if (isUseEObjectValidator()) {
			this.addValidator(new EObjectValidator() {
				override validate_EveryProxyResolves(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
					// don't check, we have our own implementation, which creates nicer messages
					return true;
				}

				override validate_NoCircularContainment(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
					// don't check
					return true;
				}

				override validate_EveryBidirectionalReferenceIsPaired(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
					// don't check
					return true;
				}

				override validate_BidirectionalReferenceIsPaired(EObject eObject, EReference eReference, EReference eOpposite, DiagnosticChain diagnostics,
					Map<Object, Object> context) {
					// don't check
					return true;
				}
			});
		}
	}

}
