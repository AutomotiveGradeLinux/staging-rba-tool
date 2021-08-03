package rba.tool.editor.resource

import org.eclipse.core.resources.IProject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet

interface IRBAModelResourceLoader {

	def void loadAndResolveResource(ResourceSet resourceSet, URI[] URIs, IProject project);

}
