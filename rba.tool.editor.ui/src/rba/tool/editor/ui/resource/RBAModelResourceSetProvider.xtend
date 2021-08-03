package rba.tool.editor.ui.resource

import com.google.inject.Singleton
import java.util.concurrent.ConcurrentHashMap
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.ui.resource.SimpleResourceSetProvider

@Singleton
class RBAModelResourceSetProvider extends SimpleResourceSetProvider {

	private ConcurrentHashMap<IProject, ResourceSet> projectXtextResourceSetMap = new ConcurrentHashMap<IProject, ResourceSet>();

	override get(IProject project) {
		val ResourceSet result = super.get(project);
		if(project !== null) {
			if(projectXtextResourceSetMap.containsKey(project)) {
				projectXtextResourceSetMap.remove(project);
			}
			projectXtextResourceSetMap.put(project, result);
		}
		return result;
	}

	def public ResourceSet getResourceSet(IProject project) {
		if(project === null) {
			return get(project);
		} else {
			return projectXtextResourceSetMap.get(project) ?: get(project);
		}
	}

	def public void setResourceSet(IProject project, ResourceSet resourceSet) {
		projectXtextResourceSetMap.put(project, resourceSet);
	}

}
