package rba.tool.editor.scoping.internal

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import rba.core.AbstractProperty
import rba.core.Content
import rba.core.ContentState
import rba.core.Scene
import rba.core.State
import rba.tool.editor.scoping.IExpressionScope

class RBAModelMemberFieldScopes implements IMemberFeatureScopes {

	override createFeatureScope(EObject model) {
		createFeatureScope(model, IExpressionScope.Anchor.UNKNOWN, IScope.NULLSCOPE);
	}

	override createFeatureScope(EObject model, IExpressionScope.Anchor anchor, IScope outer) {
		if (model instanceof Scene) {
			return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(model, AbstractProperty), outer);
		} else if (model instanceof Content) {
			return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(model, ContentState), outer);
		} else if (model instanceof State) {
			return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(model, State), outer);
		} else {
			return outer;
		}
	}
}
