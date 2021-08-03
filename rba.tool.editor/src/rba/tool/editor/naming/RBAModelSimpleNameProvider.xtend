package rba.tool.editor.naming

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.util.SimpleAttributeResolver
import rba.core.AbstractProperty
import rba.core.ContentState
import rba.core.Package
import rba.core.State
import rba.view.Size

class RBAModelSimpleNameProvider extends IQualifiedNameProvider.AbstractImpl {

	@Inject private IQualifiedNameConverter qualifiedNameConverter

	override getFullyQualifiedName(EObject obj) {
		val String name = SimpleAttributeResolver.NAME_RESOLVER.apply(obj);
		if (name === null || name.length() === 0)
			return null;
		val QualifiedName qualifiedName = qualifiedNameConverter.toQualifiedName(name);

		if (obj instanceof ContentState || obj instanceof State) {
			val EObject parent = obj.eContainer;
			if (parent === null) {
				return null;
			}
			val QualifiedName parentQualifiedName = getFullyQualifiedName(obj.eContainer);
			if (parentQualifiedName === null || parentQualifiedName.empty) {
				return null;
			}
			return parentQualifiedName.append(qualifiedName);
		} else if (obj instanceof Size) {
			val EObject parent = obj.eContainer;
			if (parent === null) {
				return null;
			}
			if (!(parent instanceof Package)) {
				val QualifiedName parentQualifiedName = getFullyQualifiedName(obj.eContainer);
				if (parentQualifiedName === null || parentQualifiedName.empty) {
					return null;
				}
				return parentQualifiedName.append(qualifiedName);
			}
		} else if (obj instanceof AbstractProperty) {
			val EObject parent = obj.eContainer;
			if (parent === null) {
				return null;
			}
			val QualifiedName parentQualifiedName = getFullyQualifiedName(obj.eContainer);
			if (parentQualifiedName === null || parentQualifiedName.empty) {
				return null;
			}
			return parentQualifiedName.append(qualifiedName);
		}

		return qualifiedName;
	}

}
