package rba.tool.editor.scoping.internal

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.SimpleScope
import rba.tool.editor.scoping.IExpressionScope

class RBAModelMemberOperationScopes implements IMemberFeatureScopes {

	private RBAModelMemberOperationRegistry operationRegistry;

	@Inject
	new(RBAModelMemberOperationRegistry operationRegistry) {
		this.operationRegistry = operationRegistry;
	}

	override createFeatureScope(EObject model) {
		return createFeatureScope(model, IExpressionScope.Anchor.UNKNOWN, IScope.NULLSCOPE);
	}

	override createFeatureScope(EObject model, IExpressionScope.Anchor anchor, IScope outer) {
		val descriptions = operationRegistry.getOperations(model, anchor);
		return new SimpleScope(outer, descriptions ?: newHashSet());
	}

}
