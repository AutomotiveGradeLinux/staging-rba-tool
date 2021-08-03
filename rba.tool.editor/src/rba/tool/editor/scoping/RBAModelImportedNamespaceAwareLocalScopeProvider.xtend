package rba.tool.editor.scoping

import java.util.Iterator
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.eclipse.xtext.scoping.impl.MultimapBasedSelectable
import org.eclipse.xtext.xbase.lib.Functions.Function1
import rba.core.RBACorePackage
import rba.core.Variable

class RBAModelImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

	private Function1<? super IEObjectDescription, Boolean> variableFilter = [ description |
		description.EClass !== RBACorePackage.Literals.VARIABLE
	];

	override protected getResourceScope(Resource res, EReference reference) {
		val context = res.getContents().get(0);
		var globalScope = getGlobalScope(res, reference, variableFilter);
		val normalizers = getImplicitImports(isIgnoreCase(reference));
		if(!normalizers.isEmpty()) {
			globalScope = createImportScope(globalScope, normalizers, null, reference.getEReferenceType(), isIgnoreCase(reference));
		}
		return getResourceScope(globalScope, context, reference);
	}

	override protected internalGetAllDescriptions(Resource resource) {
		val allContents = new Iterable<EObject>() {
			override Iterator<EObject> iterator() {
				return EcoreUtil.getAllContents(resource, false).filter(c|!(c instanceof Variable));
			}
		};
		val allDescriptions = Scopes.scopedElementsFor(allContents, qualifiedNameProvider);
		return new MultimapBasedSelectable(allDescriptions);
	}

}
