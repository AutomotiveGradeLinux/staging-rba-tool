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
import rba.core.ContentSet
import rba.tool.editor.util.RBAModelEditorToolUtil
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.tool.editor.validation.CircularContainmentValidationHelper

abstract class ContentSetValidator extends AbstractRBAModelValidator {

	@Inject private CircularContainmentValidationHelper helper;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def public void checkCircularContainment(ContentSet contentSet) {
		val context = getContext();
		val resource = contentSet.eResource();
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
			doCheckCircularContainment(resource, context.get(CancelableDiagnostician.CANCEL_INDICATOR) as CancelIndicator);
			return;
		}
		doCheckCircularContainment(resource, null);
	}

	def public void doCheckCircularContainment(Resource resource, CancelIndicator cancelIndicator) {
		helper.checkCircularContainment(resource, cancelIndicator, this);
	}

	override protected checkIsFromCurrentlyCheckedResource(EObject object) {
		// do nothing
	}
}
