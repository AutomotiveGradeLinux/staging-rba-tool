package rba.tool.editor.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.IScope

interface IExpressionScope {

	enum Anchor {
		UNKNOWN,
		CONSTRAINT
	}

	def IScope getFeatureScope(EObject model, IExpressionScope.Anchor anchor);

	IExpressionScope NULL = new NullExpressionScope();

	class NullExpressionScope implements IExpressionScope {
		override getFeatureScope(EObject model, IExpressionScope.Anchor anchor) {
			return IScope.NULLSCOPE;
		}
	}
}
