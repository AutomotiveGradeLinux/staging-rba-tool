package rba.tool.editor.ui.marker

import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.xtext.ui.editor.validation.MarkerCreator
import org.eclipse.xtext.validation.Issue
import rba.tool.editor.util.RBAModelEditorNameUtil

class RBAModelMarkerCreator extends MarkerCreator {

	override protected setMarkerAttributes(Issue issue, IResource resource, IMarker marker) throws CoreException {
		super.setMarkerAttributes(issue, resource, marker)
		var isInModelFolder = false
		var isInBuildFolder = false
		var uri = issue.uriToProblem
		if (uri !== null) {
			for (seg : uri.segments) {
				if (seg.equals(RBAModelEditorNameUtil.BUILD_FOLDER_NAME)) {
					isInBuildFolder = true
				}
			}
		}
		var path = marker.resource.fullPath
		if (path !== null) {
			for (seg : path.segments) {
				if (seg.equals(RBAModelEditorNameUtil.MODEL_FOLDER_NAME)) {
					isInModelFolder = true
				}
			}
		}
	}

}
