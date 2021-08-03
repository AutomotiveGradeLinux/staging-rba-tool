package rba.tool.editor.ui.resource

import com.google.inject.Inject
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IStorage
import org.eclipse.core.resources.IWorkspace
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.ui.resource.DefaultResourceUIServiceProvider
import rba.tool.editor.ui.wizard.ExtendRBAModelProjectCreator

class RBAModelResourceUIServiceProvider extends DefaultResourceUIServiceProvider {

	@Inject private IWorkspace workspace;

	@Inject private ExtendRBAModelProjectCreator projectCreator;

	@Inject public new(IResourceServiceProvider delegate) {
		super(delegate)
	}

	override canHandle(URI uri, IStorage storage) {
		if(!super.canHandle(uri, storage)) {
			return false;
		}
		if(workspace !== null) {
			if(storage instanceof IFile) {
				val folderName = URI.decode(if(uri.segmentCount > 3) uri.segment(2) else null);
				if(!projectCreator.modelFolderName.equals(folderName)) {
					return false;
				}
			}
		}
		return true;
	}
}
