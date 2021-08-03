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
import rba.core.AbstractContent
import rba.tool.editor.util.RBAModelEditorToolUtil
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.tool.editor.validation.ContentAllocatableListValidationHelper

abstract class AbstractContentValidator extends AbstractRBAModelValidator {

	@Inject private ContentAllocatableListValidationHelper helper;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def public void checkCircularContainment(AbstractContent abstractContent) {
		val context = getContext();
		val resource = abstractContent.eResource();
		if(resource === null) {
			return;
		}

		if(context !== null) {
			var Object contextValue;
			if(context.containsKey(resource)) {
				contextValue = context.get(resource);
			}
			if(!(contextValue instanceof Set<?>)) {
				context.put(resource, Sets.newHashSet());
			}
			if(RBAModelEditorToolUtil.isValidated((contextValue), this)) {
				return; // resource was already validated
			}

			(contextValue as Set).add(this);
			docheckCrossReferenceEmpty(resource, context.get(CancelableDiagnostician.CANCEL_INDICATOR) as CancelIndicator);
			return;
		}
		docheckCrossReferenceEmpty(resource, null);
	}

	def public void docheckCrossReferenceEmpty(Resource resource, CancelIndicator cancelIndicator) {
		helper.checkCrossReferenceEmpty(resource, cancelIndicator, this);
	}

	override protected checkIsFromCurrentlyCheckedResource(EObject object) {
		// do nothing
	}
}
