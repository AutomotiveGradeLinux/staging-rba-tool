package rba.tool.editor.util

import java.util.Collection
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EValidator
import rba.core.AbstractAllocatable
import rba.core.AbstractContent
import rba.core.Expression
import rba.core.RBACorePackage

class RBAModelEditorToolUtil {

	def public static String getExpressionText(Expression expression) {
		return if (expression !== null) expression.getExpressionText() else "[Invalid_Expression]";
	}

	def public static boolean isSkippedSyntax(EObject obj, EStructuralFeature feature) {
		// AbstractAllocatable -> contents
		if (obj instanceof AbstractAllocatable && feature == RBACorePackage.Literals.ABSTRACT_ALLOCATABLE__CONTENTS) {
			return true;
		}
		// AbstractAllocatable -> group
		if (obj instanceof AbstractAllocatable && feature == RBACorePackage.Literals.ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP) {
			return true;
		}
		// AbstractContent -> group
		if (obj instanceof AbstractContent && feature == RBACorePackage.Literals.ABSTRACT_CONTENT__CONTENT_GROUP) {
			return true;
		}
		return false;
	}

	def public static boolean isValidated(Object context, EValidator validator) {
		if (context instanceof Collection<?>) {
			return (context as Collection<?>).contains(validator);
		}
		return false;
	}
}
