package rba.tool.editor.ui.builder

import com.google.common.base.Function
import com.google.inject.Inject
import com.google.inject.Provider
import java.util.ArrayList
import java.util.List
import java.util.Map
import java.util.Set
import java.util.concurrent.atomic.AtomicInteger
import org.eclipse.core.resources.IMarker
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.builder.BuilderParticipant
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.xtext.builder.IXtextBuilderParticipant.IBuildContext
import org.eclipse.xtext.builder.MonitorBasedCancelIndicator
import org.eclipse.xtext.builder.builderState.IMarkerUpdater
import org.eclipse.xtext.generator.GeneratorContext
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.OutputConfiguration
import org.eclipse.xtext.resource.IResourceDescription.Delta
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionDelta
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.util.internal.Stopwatches
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import rba.core.Tag
import rba.tool.editor.generator.RBAModelGeneratorDelegate
import rba.tool.editor.ui.editor.model.manager.ResourceManagerUI
import rba.tool.editor.ui.resource.RBAModelResourceSetProvider

import static com.google.common.collect.Maps.uniqueIndex

class RBAModelBuilderParticipant extends BuilderParticipant {

	@Inject extension ReflectExtensions

	@Inject private ResourceDescriptionsProvider resourceDescriptionsProvider;

	@Inject private Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider;

	@Inject private RBAModelGeneratorDelegate generatorDelegate;

	@Inject private RBAModelResourceSetProvider resourceSetProvider;

	@Inject private IMarkerUpdater markerUpdater;

	override build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		if(!isEnabled(context)) {
			return;
		}
		val deltas = getRelevantDeltas(context);
		if(deltas.isEmpty()) {
			return;
		}

		val task = Stopwatches.forTask("org.eclipse.xtext.builder.BuilderParticipant.build(IBuildContext, IProgressMonitor)");
		try {
			task.start();

			val builtProject = context.getBuiltProject();
			if(!ResourceManagerUI.INSTANCE.isCurrentProject(builtProject)) {
				return;
			}

			// monitor handling
			if(monitor.isCanceled()) {
				throw new OperationCanceledException();
			}
			val subMonitor = SubMonitor.convert(monitor, if(context.getBuildType() == BuildType.RECOVERY) 5 else 3);
			val access = fileSystemAccessProvider.get();
			access.setProject(builtProject);
			val outputConfigurations = getOutputConfigurations(context);
			refreshOutputFolders(context, outputConfigurations, subMonitor.newChild(1));
			if(subMonitor.isCanceled()) {
				throw new OperationCanceledException();
			}
			access.setOutputConfigurations(outputConfigurations);
			if(context.getBuildType() == BuildType.CLEAN || context.getBuildType() == BuildType.RECOVERY) {
				val cleanMonitor = SubMonitor.convert(subMonitor.newChild(2), outputConfigurations.size());
				for (config : outputConfigurations.values()) {
					cleanOutput(context, config, access, cleanMonitor.newChild(1));
				}
				if(context.getBuildType() == BuildType.CLEAN)
					return;
			}
			val generatorMarkers = getGeneratorMarkers(builtProject, outputConfigurations.values());
			if(subMonitor.isCanceled()) {
				throw new OperationCanceledException();
			}

			doBuild(deltas, outputConfigurations, generatorMarkers, context, access, subMonitor.newChild(2));
		} finally {
			task.stop();
		}
	}

	override protected getOutputConfigurations(IBuildContext context) {
		val Set<OutputConfiguration> configurations = outputConfigurationProvider.getOutputConfigurations(context.getBuiltProject());
		configurations.addAll(generatorDelegate.RBAModelGeneratorOutputConfigurations);
		return uniqueIndex(configurations, new Function<OutputConfiguration, String>() {
			override apply(OutputConfiguration from) {
				return from.getName();
			}
		});
	}

	override protected doBuild(List<Delta> deltas, Map<String, OutputConfiguration> outputConfigurations, Map<OutputConfiguration, Iterable<IMarker>> generatorMarkers, IBuildContext context,
		EclipseResourceFileSystemAccess2 access, IProgressMonitor progressMonitor) throws CoreException {
		if(generatorDelegate !== null) {
			generatorDelegate.setRBAModelInBuilding(false);
			super.doBuild(deltas, outputConfigurations, generatorMarkers, context, access, progressMonitor)
		}
	}

	override protected doGenerate(Delta delta, IBuildContext context, IFileSystemAccess access) {
		if(delta.getNew() !== null) {
			try {
				handleChangedContents(delta, context, access);
			} catch(OperationCanceledException e) {
				throw e;
			} catch(Exception e) {
				addMarkerAndLogError(delta.getUri(), e);
			}
			return true;
		} else {
			try {
				handleDeletedContents(delta, context, access);
			} catch(OperationCanceledException e) {
				throw e;
			} catch(Exception e) {
				// do nothing
			}
			return true;
		}
	}

	def protected void handleDeletedContents(Delta delta, IBuildContext context, IFileSystemAccess access) throws CoreException {
		handleDeletedContents(delta, context, access as EclipseResourceFileSystemAccess2);
	}

	override protected handleChangedContents(Delta delta, IBuildContext context, EclipseResourceFileSystemAccess2 fileSystemAccess) throws CoreException {
		if(generatorDelegate.isRBAModelInBuilding())
			return;
		val URI uri = delta.getUri();
		if(!getResourceServiceProvider().canHandle(uri))
			return;
		var resourceSet = context.getResourceSet();
		val resource = resourceSet.getResource(uri, true);
		registerCurrentSourceFolder(context, delta, fileSystemAccess);
		saveResourceStorage(resource, fileSystemAccess);
		demandGetResources(uri, resourceSet);
		if(shouldGenerate(resourceSet, context)) {
			try {
				val monitor = fileSystemAccess.invoke("getMonitor") ?: new NullProgressMonitor();
				val cancelIndicator = new MonitorBasedCancelIndicator(monitor as IProgressMonitor);
				val generatorContext = new GeneratorContext();
				generatorContext.setCancelIndicator(cancelIndicator);
				generatorDelegate.generate(resourceSet, fileSystemAccess, generatorContext);
			} catch(OperationCanceledException e) {
				// don't look into the cause for OCE
				throw e;
			} catch(RuntimeException e) {
				if(e.getCause() instanceof CoreException) {
					throw e.getCause() as CoreException;
				}
				throw e;
			}
		}
	}

	def protected boolean shouldGenerate(ResourceSet resourceSet, IBuildContext context) {
		for (resource : resourceSet.resources) {
			if(!super.shouldGenerate(resource, context)) {
				return false;
			}
		}
		return true;
	}

	def protected void handleDeletedContents(Delta delta, IBuildContext context, EclipseResourceFileSystemAccess2 fileSystemAccess) throws CoreException {
		if(generatorDelegate.isRBAModelInBuilding())
			return;
		val URI uri = delta.getUri();
		if(!getResourceServiceProvider().canHandle(uri))
			return;
		val resourceSet = context.getResourceSet();
		demandGetResources(uri, resourceSet);
		if(shouldGenerate(resourceSet, context)) {
			try {
				val monitor = fileSystemAccess.invoke("getMonitor") ?: new NullProgressMonitor();
				val cancelIndicator = new MonitorBasedCancelIndicator(monitor as IProgressMonitor);
				val generatorContext = new GeneratorContext();
				generatorContext.setCancelIndicator(cancelIndicator);
				generatorDelegate.generate(resourceSet, fileSystemAccess, generatorContext);
			} catch(OperationCanceledException e) {
				// don't look into the cause for OCE
				throw e;
			} catch(RuntimeException e) {
				if(e.getCause() instanceof CoreException) {
					throw e.getCause() as CoreException;
				}
				throw e;
			}
		}
	}

	@Deprecated
	override getGenerator() {
		return generatorDelegate;
	}

	override getGenerator2() {
		return generatorDelegate;
	}

	def private demandGetResources(URI uri, ResourceSet resourceSet) {
		val projectName = if(uri.segmentCount > 2) URI.decode(uri.segment(1)) else "";
		val resourceDescriptions = resourceDescriptionsProvider.createResourceDescriptions();
		val URIs = resourceDescriptions.allResourceDescriptions.map(d|d.URI).filter(u|projectName.equals(if(u.segmentCount > 2) URI.decode(u.segment(1)) else null));
		ResourceManagerUI.INSTANCE.loadAndResolveResource(resourceSet, URIs, ResourceManagerUI.INSTANCE.currentProject);
		resourceSet.reloadAllStereotypes;
		for (description : resourceDescriptions.allResourceDescriptions) {
			if(projectName.equals(if(description.URI.segmentCount > 2) URI.decode(description.URI.segment(1)) else null)) {
				markerUpdater.updateMarkers(new DefaultResourceDescriptionDelta(null, description), resourceSet, new NullProgressMonitor());
			}
		}
	}

	def private reloadAllStereotypes(ResourceSet resourceSet) {
		val appliedCounter = new AtomicInteger(0);
		val List<URI> URIs = new ArrayList<URI>();
		resourceSet.resources.forEach [ resource |
			val tags = resource.allContents.toIterable.filter(Tag);
			if(tags.empty) {
				URIs.add(URI.createURI(resource.URI.toString));
			} else {
				appliedCounter.incrementAndGet;
				URIs.add(URI.createURI(resource.URI.toString.replace("/model/", "/.applied/")));
			}
		]
		if(appliedCounter.get == 0)
			return;

		resourceSet.clearResourceSet;
		ResourceManagerUI.INSTANCE.loadAndResolveResource(resourceSet, URIs, ResourceManagerUI.INSTANCE.currentProject);
	}
}
