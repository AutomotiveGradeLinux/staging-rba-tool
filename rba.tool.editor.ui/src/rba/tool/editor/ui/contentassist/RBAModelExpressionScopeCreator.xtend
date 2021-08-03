package rba.tool.editor.ui.contentassist

import com.google.inject.Inject
import java.util.List
import org.apache.commons.lang.StringUtils
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import rba.core.Constraint
import rba.core.ObjectReference
import rba.core.Operator
import rba.core.PreviousModifier
import rba.tool.editor.rbaEditorModel.MemberFeatureReference
import rba.tool.editor.scoping.IExpressionScope

class RBAModelExpressionScopeCreator {

	@Inject(optional=true) IExpressionScope expressionScope;

	def public IScope getExpressionScope(EObject model, ContentAssistContext contentAssistContext) {
		if (contentAssistContext.lastCompleteNode !== null) {
			val EObject grammarElement = contentAssistContext.lastCompleteNode.grammarElement;
			if (grammarElement instanceof Keyword && ".".equals((grammarElement as Keyword).value)) {
				val INode lastCompleteNodeParent = contentAssistContext.lastCompleteNode.parent;
				val semanticObject = NodeModelUtils.findActualSemanticObjectFor(lastCompleteNodeParent);
				val boolean inner = isInnerPrefix(lastCompleteNodeParent.text, contentAssistContext.offset, lastCompleteNodeParent.endOffset);
				val EObject eObject = getTargetObject(semanticObject, inner);
				return expressionScope.getFeatureScope(eObject, getOwnerAnchorType(model));
			}
		}
		return null;
	}

	def private EObject getTargetObject(EObject eObject, boolean inner) {
		if (eObject instanceof Operator) {
			return eObject;
		}

		var ObjectReference objectReference;
		if (eObject instanceof MemberFeatureReference) {
			val MemberFeatureReference reference = eObject as MemberFeatureReference;
			objectReference = ( if (reference.refObject === null) reference.operand.get(0) else reference) as ObjectReference;
		} else if (eObject instanceof ObjectReference) {
			objectReference = eObject;
		} else if (eObject instanceof PreviousModifier) {
			val List<ObjectReference> objectReferences = EcoreUtil2.getAllContentsOfType(eObject, ObjectReference);
			objectReference = if (objectReferences.size > 0) objectReferences.last else null;
		}

		if (inner && objectReference instanceof MemberFeatureReference) {
			val operand0 = (objectReference as MemberFeatureReference).operand.get(0);
			objectReference = if(operand0 instanceof ObjectReference) operand0 as ObjectReference else null;
		}
		return if (objectReference !== null) objectReference.refObject else null;
	}

	def private boolean isInnerPrefix(String text, int offset, int endOffset) {
		val boolean isInnerOffset = offset <= endOffset;
		val boolean isInnerPrefix = !StringUtils.endsWith(text, ".");
		return (isInnerOffset && isInnerPrefix);
	}

	def private IExpressionScope.Anchor getOwnerAnchorType(EObject model) {
		var EObject owner = EcoreUtil2.getContainerOfType(model, Constraint);
		if (owner !== null) {
			return IExpressionScope.Anchor.CONSTRAINT;
		}
		return IExpressionScope.Anchor.UNKNOWN;
	}
}
