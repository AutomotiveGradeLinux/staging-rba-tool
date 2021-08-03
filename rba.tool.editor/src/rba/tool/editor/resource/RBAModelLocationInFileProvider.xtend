package rba.tool.editor.resource

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.resource.DefaultLocationInFileProvider
import rba.tool.editor.util.RBAModelEditorToolUtil

class RBAModelLocationInFileProvider extends DefaultLocationInFileProvider {

	override getFullTextRegion(EObject owner, EStructuralFeature feature, int indexInList) {
		if (RBAModelEditorToolUtil.isSkippedSyntax(owner, feature)) {
			return null;
		}
		super.getFullTextRegion(owner, feature, indexInList);
	}

}
