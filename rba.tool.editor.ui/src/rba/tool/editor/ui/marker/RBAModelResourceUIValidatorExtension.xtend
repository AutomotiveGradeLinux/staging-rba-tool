package rba.tool.editor.ui.marker

import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.ui.validation.DefaultResourceUIValidatorExtension
import org.eclipse.xtext.validation.CheckMode
import rba.tool.editor.util.RBAModelEditorNameUtil

class RBAModelResourceUIValidatorExtension extends DefaultResourceUIValidatorExtension {

	private var path = new String

	override updateValidationMarkers(IFile file, Resource resource, CheckMode mode,
		IProgressMonitor monitor) throws OperationCanceledException {
		path = new String
		var exist = existInBuildFolder(file.parent)
		if (exist) {
			if (!path.equals("")) {
				path = "model" + "//" + path
			} else {
				path = "model"
			}
			val p = file.project
			val d = p.getFolder(path)
			val f = d.getFile(file.name)
			super.updateValidationMarkers(f, resource, mode, monitor)
		}
	}

	def boolean existInBuildFolder(IResource res) {
		if (res instanceof IFolder) {
			if (res.name.equals(RBAModelEditorNameUtil.BUILD_FOLDER_NAME)) {
				return true
			} else {
				if (!path.equals("")) {
					path = res.name + "//" + path
				} else {
					path = res.name
				}
				return existInBuildFolder(res.parent)
			}
		}
		return false
	}

	override deleteValidationMarkers(IFile file, CheckMode checkMode, IProgressMonitor monitor) {
		path = new String
		var exist = existInBuildFolder(file.parent)
		if (exist) {
			if (!path.equals("")) {
				path += "model" + "//" + path
			} else {
				path = "model"
			}
			val p = file.project
			val d = p.getFolder(path)
			val f = d.getFile(file.name)
			super.deleteValidationMarkers(f, checkMode, monitor)
		}
	}
}
