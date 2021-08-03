package rba.tool.editor.validation

import com.google.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.service.OperationCanceledManager
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.ValidationMessageAcceptor
import rba.core.AbstractContent
import rba.core.RBACorePackage
import rba.sound.SoundContent
import rba.tool.editor.messages.Messages
import rba.tool.editor.resource.IRBAModelResourceLoader
import rba.view.ViewContent

class ContentAllocatableListValidationHelper {

	@Inject
	private IResourceServiceProvider.Registry resourceServiceProviderRegistry = IResourceServiceProvider.Registry.INSTANCE;

	@Inject
	private ResourceDescriptionsProvider resourceDescriptionsProvider;

	@Inject
	private IRBAModelResourceLoader resourceLoader;

	@Inject
	private ResourceSetImpl resourceSet;

	@Inject
	private OperationCanceledManager operationCanceledManager = new OperationCanceledManager();

	private String CONTENT_ALLOCATABLE_SIZE = Messages.CONTENT_ALLOCATABLE_SIZE;

	private String SOUND_ALLOCATABLE_SIZE = Messages.SOUND_ALLOCATABLE_SIZE;

	def public void checkCrossReferenceEmpty(Resource resource, CancelIndicator cancelIndicator, ValidationMessageAcceptor acceptor) {
		val resourceServiceProvider = resourceServiceProviderRegistry.getResourceServiceProvider(resource.getURI());
		if (resourceServiceProvider === null) {
			return;
		}

		demandGetResources(resource.getURI());
		if (resourceSet === null) {
			return;
		}

		val loadedResource = resourceSet.getResource(resource.getURI(), false);
		if (loadedResource !== null) {
			checkForAbstractContent_getAllocatableList(loadedResource, cancelIndicator, acceptor);
		}
	}

	def private void demandGetResources(URI uri) {
		if (!resourceSet.resources.isEmpty()) {
			resourceSet.resources.clear();
		}

		val projectName = if (uri.segmentCount > 2) URI.decode(uri.segment(1)) else "";
		val resourceDescriptions = resourceDescriptionsProvider.createResourceDescriptions();
		val URIs = resourceDescriptions.allResourceDescriptions.map(d|d.URI).filter(u|projectName.equals(if (u.segmentCount > 2) URI.decode(u.segment(1)) else null));
		resourceLoader.loadAndResolveResource(resourceSet, URIs, null);
	}

	def protected void checkForAbstractContent_getAllocatableList(Resource resource, CancelIndicator cancelIndicator, ValidationMessageAcceptor acceptor) {
		resource.allContents.toIterable.filter(ViewContent).forEach [ viewContent |
			if (viewContent.allocatableList.isEmpty) {
				val feature = getContainmentFeature(viewContent);
				if (feature !== null) {
					acceptor.acceptError(String.format(CONTENT_ALLOCATABLE_SIZE, viewContent.name), viewContent, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
						getErrorCode());
				}
			}
			operationCanceledManager.checkCanceled(cancelIndicator);
		];
		resource.allContents.toIterable.filter(SoundContent).forEach [ soundContent |
			if (soundContent.allocatableList.isEmpty) {
				val feature = getContainmentFeature(soundContent);
				if (feature !== null) {
					acceptor.acceptError(String.format(SOUND_ALLOCATABLE_SIZE, soundContent.name), soundContent, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
						getErrorCode());
				}
			}
			operationCanceledManager.checkCanceled(cancelIndicator);
		];
	}

	def protected EStructuralFeature getContainmentFeature(EObject object) {
		switch (object) {
			AbstractContent:
				return RBACorePackage.Literals.ABSTRACT_CONTENT__ALLOCATABLE
			default:
				return null
		}
	}

	def protected String getErrorCode() {
		return null;
	}
}
