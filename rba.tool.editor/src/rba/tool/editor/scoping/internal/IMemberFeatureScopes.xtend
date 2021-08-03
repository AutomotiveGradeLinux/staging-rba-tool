package rba.tool.editor.scoping.internal

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.IScope
import rba.tool.editor.scoping.IExpressionScope

interface IMemberFeatureScopes {

	def IScope createFeatureScope(EObject model);

	def IScope createFeatureScope(EObject model, IExpressionScope.Anchor anchor, IScope outer);
}
