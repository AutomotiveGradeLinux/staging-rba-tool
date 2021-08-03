package rba.tool.editor.scoping

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.IScope
import rba.tool.editor.scoping.internal.RBAModelMemberFieldScopes
import rba.tool.editor.scoping.internal.RBAModelMemberOperationScopes

@Singleton
class RBAModelExpressionScope implements IExpressionScope {

	@Inject private RBAModelMemberFieldScopes filedScopeCreator;
	@Inject private RBAModelMemberOperationScopes operationScopeCreator;

	override getFeatureScope(EObject model, IExpressionScope.Anchor anchor) {
		var IScope result = filedScopeCreator.createFeatureScope(model);
		result = operationScopeCreator.createFeatureScope(model, anchor, result);
		return result;
	}

}
