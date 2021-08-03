package rba.tool.editor.ui.builder.resourceloader

import com.google.common.collect.Iterators
import com.google.inject.Inject
import java.util.AbstractQueue
import java.util.HashSet
import java.util.LinkedList
import java.util.Queue
import java.util.Set
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.common.util.WrappedException
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.builder.builderState.IBuilderState
import org.eclipse.xtext.builder.impl.QueuedBuildData
import org.eclipse.xtext.builder.impl.ToBeBuiltComputer
import org.eclipse.xtext.builder.resourceloader.IResourceLoader
import org.eclipse.xtext.builder.resourceloader.IResourceLoader.LoadOperation
import org.eclipse.xtext.builder.resourceloader.IResourceLoader.LoadResult
import org.eclipse.xtext.builder.resourceloader.IResourceLoader.Sorter
import org.eclipse.xtext.builder.resourceloader.SerialResourceLoader
import org.eclipse.xtext.ui.resource.IResourceSetProvider
import org.eclipse.xtext.util.CancelIndicator
import rba.tool.editor.resource.IRBAModelResourceLoader
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.builder.impl.BuildData

class RBAModelResourceLoader implements IRBAModelResourceLoader {

	@Inject
	private ToBeBuiltComputer toBeBuiltComputer;

	@Inject
	private QueuedBuildData queuedBuildData;

	@Inject
	private IBuilderState builderState;

	@Inject
	private IResourceSetProvider resourceSetProvider;

	@Inject
	private Sorter resourceSorter;

	private IResourceLoader globalIndexResourceLoader;

	private IResourceLoader crossLinkingResourceLoader;

	public new() {
	}

	override synchronized loadAndResolveResource(ResourceSet resourceSet, URI[] URIs, IProject project) {
		globalIndexResourceLoader = new SerialResourceLoader(resourceSetProvider, resourceSorter);
		crossLinkingResourceLoader = new SerialResourceLoader(resourceSetProvider, resourceSorter);
		loadResource(resourceSet, project, URIs);
		crossLinkingResource(resourceSet, project, URIs);
		EcoreUtil.resolveAll(resourceSet);

		resourceSet.getLoadOptions().put(ResourceDescriptionsProvider.NAMED_BUILDER_SCOPE, Boolean.TRUE);
		val progress = SubMonitor.convert(new NullProgressMonitor, 3);
		val toBeBuilt = toBeBuiltComputer.updateProject(project, progress.newChild(2));
		val buildData = new BuildData(project.getName(), resourceSet, toBeBuilt, queuedBuildData, false);
		builderState.update(buildData, progress.newChild(1));
	}

	def synchronized protected void loadResource(ResourceSet resourceSet, IProject project, URI[] URIs) {
		val Set<URI> toBeUpdated = new HashSet<URI>(URIs);
		var LoadOperation loadOperation = null;

		try {
			loadOperation = globalIndexResourceLoader.create(resourceSet, project);
			loadOperation.load(toBeUpdated);

			while(loadOperation.hasNext()) {
				var URI uri = null;
				var Resource resource = null;
				try {
					val LoadResult loadResult = loadOperation.next();
					uri = loadResult.getUri();
					resource = addResource(loadResult.getResource(), resourceSet);
				} catch(RuntimeException ex) {
					if(resource !== null) {
						resourceSet.getResources().remove(resource);
					}
				}
			}
		} finally {
			if(loadOperation !== null) loadOperation.cancel();
		}
	}

	def synchronized protected void crossLinkingResource(ResourceSet resourceSet, IProject project, URI[] URIs) {
		val Queue<URI> queue = getQueue(URIs);
		var LoadOperation loadOperation = null;

		try {
			loadOperation = crossLinkingResourceLoader.create(resourceSet, project);
			loadOperation.load(queue);
			while(!queue.isEmpty()) {
				var URI uri = null;
				var Resource resource = null;
				try {
					val LoadResult loadResult = loadOperation.next();
					uri = loadResult.getUri();
					resource = addResource(loadResult.getResource(), resourceSet);
					queue.remove(uri);
					EcoreUtil2.resolveLazyCrossReferences(resource, CancelIndicator.NullImpl);
				} catch(WrappedException ex) {
					if(resource !== null) {
						resourceSet.getResources().remove(resource);
					}
				}
			}

			loadOperation.cancel();
			if(queue.size() > 0) {
				loadOperation = crossLinkingResourceLoader.create(resourceSet, project);
				loadOperation.load(queue);
			}

			if(!queue.isEmpty()) {
				// clearResourceSet(resourceSet);
			}
		} finally {
			if(loadOperation !== null) loadOperation.cancel();
		}
	}

	def protected void clearResourceSet(ResourceSet resourceSet) {
		val boolean wasDeliver = resourceSet.eDeliver();
		try {
			resourceSet.eSetDeliver(false);
			resourceSet.getResources().clear();
		} finally {
			resourceSet.eSetDeliver(wasDeliver);
		}
	}

	def protected Resource addResource(Resource resource, ResourceSet resourceSet) {
		val URI uri = resource.getURI();
		val Resource r = resourceSet.getResource(uri, false);
		if(r === null) {
			resourceSet.getResources().add(resource);
			return resource;
		} else {
			return r;
		}
	}

	def protected Queue<URI> getQueue(URI[] URIs) {
		val LinkedList<URI> list = new LinkedList<URI>(URIs);
		return new AbstractQueue<URI>() {
			override offer(URI o) {
				return list.offer(o);
			}

			override poll() {
				if(list.isEmpty())
					return list.poll();
				return list.poll();
			}

			override peek() {
				if(list.isEmpty())
					return list.peek();
				return list.peek();
			}

			override iterator() {
				return Iterators.concat(list.iterator(), list.iterator());
			}

			override size() {
				return list.size() + list.size();
			}
		};
	}
}
