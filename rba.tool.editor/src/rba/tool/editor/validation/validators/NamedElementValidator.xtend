package rba.tool.editor.validation.validators

import com.google.common.collect.Sets
import com.google.inject.Inject
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CancelableDiagnostician
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.NamedElement
import rba.tool.editor.util.RBAModelEditorToolUtil
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.tool.editor.validation.UniqueNameValidationHelper

class NamedElementValidator extends AbstractRBAModelValidator {

	@Inject private UniqueNameValidationHelper helper;

	override register(EValidatorRegistrar registrar) {
		// library validator is not registered for a specific language
	}

	@Check(NORMAL)
	def public void checkUniqueNamesInResourceOf(NamedElement namedElement) {
		val context = getContext();
		val resource = namedElement.eResource();
		if (resource === null) {
			return;
		}

		if (context !== null) {
			var Object contextValue;
			if (context.containsKey(resource)) {
				contextValue = context.get(resource);
			}
			if (!(contextValue instanceof Set<?>)) {
				context.put(resource, Sets.newHashSet());
			}
			if (RBAModelEditorToolUtil.isValidated((contextValue), this)) {
				return; // resource was already validated
			}

			(contextValue as Set).add(this);
			doCheckUniqueNames(resource, context.get(CancelableDiagnostician.CANCEL_INDICATOR) as CancelIndicator);
			return;
		}
		doCheckUniqueNames(resource, null);
	}

	def public void doCheckUniqueNames(Resource resource, CancelIndicator cancelIndicator) {
		helper.checkUniqueNames(resource, cancelIndicator, this);
	}

	override protected checkIsFromCurrentlyCheckedResource(EObject object) {
		// do nothing
	}

}
