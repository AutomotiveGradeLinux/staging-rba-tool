package rba.tool.editor.validation

import com.google.common.collect.Maps
import com.google.inject.Inject
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IResourceDescriptionsProvider
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.service.OperationCanceledManager
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.util.SimpleAttributeResolver
import org.eclipse.xtext.validation.ValidationMessageAcceptor
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.rbaEditorModel.RbaEditorModelPackage
import java.util.List
import java.util.Arrays
import rba.core.impl.ProjectImpl

class UniqueNameValidationHelper {

	@Inject
	private IResourceServiceProvider.Registry resourceServiceProviderRegistry = IResourceServiceProvider.Registry.INSTANCE;

	@Inject
	private IResourceDescriptionsProvider resourceDescriptionsProvider;

	@Inject
	private OperationCanceledManager operationCanceledManager = new OperationCanceledManager();

	private static final List<String> RESTRICTED_NAMES = Arrays.asList(
		"AnyAreasOfContent",
		"AnyContentsOfArea",
		"NullExpression"
	);

	private String NAMEDELEMENT_NAME_DUPLICATE = Messages.NAMEDELEMENT_NAME_DUPLICATE;

	def public void checkUniqueNames(Resource resource, CancelIndicator cancelIndicator, ValidationMessageAcceptor acceptor) {
		val resourceServiceProvider = resourceServiceProviderRegistry.getResourceServiceProvider(resource.getURI());
		if(resourceServiceProvider === null) {
			return;
		}

		val manager = resourceServiceProvider.getResourceDescriptionManager();
		if(manager !== null) {
			val description = manager.getResourceDescription(resource);
			if(description !== null) {
				val descriptions = description.getExportedObjects();
				val currentIter = descriptions.iterator();
				if(!currentIter.hasNext()) {
					return;
				}
				val clusterToNames = Maps.newHashMap();

				val containerManager = resourceServiceProvider.getContainerManager();
				val resourceDescriptions = resourceDescriptionsProvider.getResourceDescriptions(resource.getResourceSet());
				for (container : containerManager.getVisibleContainers(description, resourceDescriptions)) {
					val siblingsResourceDescriptions = container.resourceDescriptions.filter(r|r.URI.toString !== description.URI.toString);
					val siblingsObjectDescriptions = siblingsResourceDescriptions.map(srd|srd.exportedObjects.filter[obj|
						obj.EClass !== RBACorePackage.Literals.TAG && obj.EClass !== RbaEditorModelPackage.Literals.CTAG
					]).flatten;
					for (siblingsObjectDescription : siblingsObjectDescriptions) {
						initDescriptionForDuplicatedName(siblingsObjectDescription, clusterToNames, acceptor);
					}
				}

				while(currentIter.hasNext()) {
					val objectDescription = currentIter.next();
					checkDescriptionForDuplicatedName(objectDescription, clusterToNames, acceptor);
					operationCanceledManager.checkCanceled(cancelIndicator);
				}
			}
		}
	}

	def protected void initDescriptionForDuplicatedName(IEObjectDescription description, Map<EClass, Map<QualifiedName, IEObjectDescription>> clusterTypeToName, ValidationMessageAcceptor acceptor) {
		val object = description.getEObjectOrProxy();
		val eClass = object.eClass();
		val qualifiedName = description.getName();
		val clusterType = getAssociatedClusterType(eClass);
		if(clusterType === null) {
			return;
		}

		val nameToDescription = clusterTypeToName.get(clusterType);
		if(nameToDescription === null) {
			val newNameToDescription = Maps.newHashMap();
			newNameToDescription.put(qualifiedName, description);
			clusterTypeToName.put(clusterType, newNameToDescription);
		} else if(!nameToDescription.containsKey(qualifiedName)) {
			nameToDescription.put(qualifiedName, description);
		}
	}

	def protected void checkDescriptionForDuplicatedName(IEObjectDescription description, Map<EClass, Map<QualifiedName, IEObjectDescription>> clusterTypeToName, ValidationMessageAcceptor acceptor) {
		val object = description.getEObjectOrProxy();
		val eClass = object.eClass();
		if(eClass === RBACorePackage.Literals.VARIABLE) {
			return;
		}

		if(eClass === RBACorePackage.Literals.TAG || eClass === RbaEditorModelPackage.Literals.CTAG) {
			return;
		}

		val qualifiedName = description.getName();
		val clusterType = getAssociatedClusterType(eClass);
		if(clusterType === null) {
			return;
		}

		val nameToDescription = clusterTypeToName.get(clusterType);
		if(nameToDescription === null) {
			val newNameToDescription = Maps.newHashMap();
			newNameToDescription.put(qualifiedName, description);
			clusterTypeToName.put(clusterType, newNameToDescription);
		} else {
			if(nameToDescription.containsKey(qualifiedName)) {
				val prevDescription = nameToDescription.get(qualifiedName);

				if(prevDescription !== null && !(prevDescription.getEObjectOrProxy() instanceof ProjectImpl)) {
					createDuplicateNameError(prevDescription, clusterType, acceptor);
					nameToDescription.put(qualifiedName, null);
				}
				createDuplicateNameError(description, clusterType, acceptor);
			} else if(isNamingRestricted(qualifiedName)){
				createNamingRestrictionError(description, clusterType, acceptor, qualifiedName)
			} else {
				nameToDescription.put(qualifiedName, description);
			}
		}
	}

	def protected void createDuplicateNameError(IEObjectDescription description, EClass clusterType, ValidationMessageAcceptor acceptor) {
		val object = description.getEObjectOrProxy();
		if(object.eIsProxy) {
			return;
		}

		val feature = getNameFeature(object);
		acceptor.acceptError(getDuplicateNameErrorMessage(description), object, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, getErrorCode());
	}

	def String getDuplicateNameErrorMessage(IEObjectDescription description) {
		val qualifiedName = description.getQualifiedName().toString();
		val shortName = String.valueOf(if(qualifiedName !== null && qualifiedName !== "") qualifiedName else "<unnamed>");
		return String.format(NAMEDELEMENT_NAME_DUPLICATE, shortName);
	}

	def protected boolean isContainerInformationHelpful(IEObjectDescription description, EObject container, String containerTypeLabel, EStructuralFeature containerNameFeature) {
		return containerTypeLabel !== null && containerNameFeature !== null;
	}

	def protected boolean isContainerInformationHelpful(IEObjectDescription description, String shortName) {
		return true;
	}

	def protected EObject getContainerForErrorMessage(EObject object) {
		return object.eContainer();
	}

	def protected String getTypeLabel(EClass eClass) {
		return eClass.getName();
	}

	def protected EStructuralFeature getNameFeature(EObject object) {
		return SimpleAttributeResolver.NAME_RESOLVER.getAttribute(object);
	}

	def protected EClass getAssociatedClusterType(EClass eClass) {
		val superTypes = eClass.getESuperTypes();
		if(superTypes.isEmpty()) {
			return null;
		}
		if(superTypes.contains(RBACorePackage.Literals.NAMED_ELEMENT)) {
			return RBACorePackage.Literals.NAMED_ELEMENT;
		}
		return getAssociatedClusterType(superTypes.get(0));
	}

	def protected String getErrorCode() {
		return null;
	}

	def protected boolean isNamingRestricted(QualifiedName qualifiedName){
		if ( qualifiedName.getSegments().size() > 0 ) {
			val i = qualifiedName.getSegments().size() - 1;
			if( RESTRICTED_NAMES.contains(qualifiedName.getSegments().get(i).toString) ) {
				return true;	
			}
		}
		return false;
	}

	def protected void createNamingRestrictionError(IEObjectDescription description, EClass clusterType,
		ValidationMessageAcceptor acceptor, QualifiedName qualifiedName) {
		val object = description.getEObjectOrProxy();
		if (object.eIsProxy) {
			return;
		}
		val feature = getNameFeature(object);
		val errorMessage = String.format(Messages.NAME_RESTRICTION, object.eClass.name, qualifiedName.toString)
		acceptor.acceptError(errorMessage, object, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX,getErrorCode());
	}
}
