package rba.tool.editor.ui.resource

import com.google.inject.Singleton
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.swt.widgets.Display
import org.eclipse.xtext.ui.resource.SimpleResourceSetProvider
import rba.tool.editor.ui.editor.model.manager.ResourceManagerUI
import rba.tool.editor.ui.util.UnitOfProgressUtil

@Singleton
class RBADocumentResourceSetProvider extends SimpleResourceSetProvider {

	override get(IProject project) {
		val ResourceSet result = super.get(project);
		if(project !== null) {
			Display.getDefault().asyncExec(new Runnable() {
				override run() {
					if(ResourceManagerUI.INSTANCE.currentProject === null) {
						UnitOfProgressUtil.doProjectSwitchProgress(project, false);
					}
				}
			});
		}
		return result;
	}
}
