package rba.tool.editor.resource

import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription

class RBAModelEObjectDescription extends EObjectDescription {

	private final int[] additionalInfo;

	new(QualifiedName qualifiedName, EObject element, Map<String, String> userData) {
		this(qualifiedName, element, userData, newIntArrayOfSize(2));
	}

	new(QualifiedName qualifiedName, EObject element, Map<String, String> userData, int[] additionalInfo) {
		super(qualifiedName, element, userData);
		this.additionalInfo = additionalInfo ?: newIntArrayOfSize(2);
	}

	def public int[] getAdditionalInfo() {
		return this.additionalInfo;
	}
}
