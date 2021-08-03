package rba.tool.editor.validation

import com.google.common.collect.Maps
import com.google.common.collect.Sets
import com.google.inject.Inject
import java.util.LinkedHashSet
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.impl.EObjectDescriptionLookUp
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.service.OperationCanceledManager
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.ValidationMessageAcceptor
import org.eclipse.xtext.xbase.lib.Functions.Function1
import rba.core.AbstractAllocatable
import rba.core.AbstractContent
import rba.core.AllocatableSet
import rba.core.ContentSet
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.model.manager.ResourceManager

class CircularContainmentValidationHelper {

	private final static Function1<? super IEObjectDescription, Boolean> containmentPredicate = [ d |
		d.EObjectOrProxy instanceof AbstractAllocatable || d.EObjectOrProxy instanceof AbstractContent
	];

	private final static Function1<? super EObject, Boolean> containerPredicate = [ eObject |
		eObject instanceof AllocatableSet || eObject instanceof ContentSet
	];

	@Inject
	private IResourceServiceProvider.Registry resourceServiceProviderRegistry = IResourceServiceProvider.Registry.INSTANCE;

	@Inject
	private ResourceDescriptionsProvider resourceDescriptionsProvider;

	@Inject
	private OperationCanceledManager operationCanceledManager = new OperationCanceledManager();

	private String CIRCULAR_CONTAINMENT_DETECTE = Messages.CIRCULAR_CONTAINMENT_DETECTE;

	def public void checkCircularContainment(Resource resource, CancelIndicator cancelIndicator, ValidationMessageAcceptor acceptor) {
		val resourceServiceProvider = resourceServiceProviderRegistry.getResourceServiceProvider(resource.getURI());
		if (resourceServiceProvider === null) {
			return;
		}

		val clusterToNames = Maps.newHashMap();
		val resourceDescriptions = resourceDescriptionsProvider.getResourceDescriptions(resource.resourceSet);
		var descriptionLookUp = new EObjectDescriptionLookUp(resourceDescriptions.exportedObjects.filter(containmentPredicate).toList);

		val descriptions = getAllObjectDescriptions(resource, descriptionLookUp);
		val currentIter = descriptions.iterator();
		if (!currentIter.hasNext()) {
			return;
		}

		initDescriptionForCircularContainment(resource.resourceSet, descriptionLookUp, clusterToNames, acceptor);

		while (currentIter.hasNext()) {
			val objectDescription = currentIter.next();
			checkDescriptionForCircularContainment(resource.resourceSet, descriptionLookUp, objectDescription, clusterToNames, acceptor);
			operationCanceledManager.checkCanceled(cancelIndicator);
		}
	}

	def private Iterable<IEObjectDescription> getAllObjectDescriptions(Resource resource, EObjectDescriptionLookUp descriptionLookUp) {
		val allObjectDescriptions = resource.allContents.toIterable.filter(containerPredicate).map(o|findEObjectDescription(o, descriptionLookUp));
		return allObjectDescriptions;
	}

	def protected void initDescriptionForCircularContainment(ResourceSet resourceSet, EObjectDescriptionLookUp descriptionLookUp,
		Map<EClass, Map<QualifiedName, Set<IEObjectDescription>>> clusterTypeToName, ValidationMessageAcceptor acceptor) {
		initDescriptionForAllocatableSet(resourceSet, descriptionLookUp, clusterTypeToName, acceptor);
		initDescriptionForContentSet(resourceSet, descriptionLookUp, clusterTypeToName, acceptor);
	}

	def protected void initDescriptionForAllocatableSet(ResourceSet resourceSet, EObjectDescriptionLookUp descriptionLookUp,
		Map<EClass, Map<QualifiedName, Set<IEObjectDescription>>> clusterTypeToName, ValidationMessageAcceptor acceptor) {
		val allocatableSetDescriptionsMap = Maps.newHashMap();
		clusterTypeToName.put(RBACorePackage.Literals.ALLOCATABLE_SET, allocatableSetDescriptionsMap);

		ResourceManager.INSTANCE.getRbaAreaSets(resourceSet).forEach [ areaSet |
			if (!areaSet.target.isEmpty) {
				val IEObjectDescription eObjectDescription = findEObjectDescription(areaSet, descriptionLookUp);
				if (eObjectDescription !== null) {
					val targets = Sets.newLinkedHashSet();
					var IEObjectDescription targetDescription;
					for (target : areaSet.target) {
						targetDescription = findEObjectDescription(target, descriptionLookUp);
						if (targetDescription !== null) {
							targets.add(targetDescription);
						}
					}
					allocatableSetDescriptionsMap.put(eObjectDescription.qualifiedName, targets);
				}
			}
		];
		ResourceManager.INSTANCE.getRbaZoneSets(resourceSet).forEach [ zoneSet |
			if (!zoneSet.target.isEmpty) {
				val IEObjectDescription eObjectDescription = findEObjectDescription(zoneSet, descriptionLookUp);
				if (eObjectDescription !== null) {
					val targets = Sets.newLinkedHashSet();
					var IEObjectDescription targetDescription;
					for (target : zoneSet.target) {
						targetDescription = findEObjectDescription(target, descriptionLookUp);
						if (targetDescription !== null) {
							targets.add(targetDescription);
						}
					}
					allocatableSetDescriptionsMap.put(eObjectDescription.qualifiedName, targets);
				}
			}
		];
	}

	def protected void initDescriptionForContentSet(ResourceSet resourceSet, EObjectDescriptionLookUp descriptionLookUp,
		Map<EClass, Map<QualifiedName, Set<IEObjectDescription>>> clusterTypeToName, ValidationMessageAcceptor acceptor) {
		val allocatableSetDescriptionsMap = Maps.newHashMap();
		clusterTypeToName.put(RBACorePackage.Literals.CONTENT_SET, allocatableSetDescriptionsMap);

		ResourceManager.INSTANCE.getRbaViewContentSets(resourceSet).forEach [ viewContentSet |
			if (!viewContentSet.target.isEmpty) {
				val IEObjectDescription eObjectDescription = findEObjectDescription(viewContentSet, descriptionLookUp);
				if (eObjectDescription !== null) {
					val targets = Sets.newLinkedHashSet();
					var IEObjectDescription targetDescription;
					for (target : viewContentSet.target) {
						targetDescription = findEObjectDescription(target, descriptionLookUp);
						if (targetDescription !== null) {
							targets.add(targetDescription);
						}
					}
					allocatableSetDescriptionsMap.put(eObjectDescription.qualifiedName, targets);
				}
			}
		];
		ResourceManager.INSTANCE.getRbaSoundContentSets(resourceSet).forEach [ soundContentSet |
			if (!soundContentSet.target.isEmpty) {
				val IEObjectDescription eObjectDescription = findEObjectDescription(soundContentSet, descriptionLookUp);
				if (eObjectDescription !== null) {
					val targets = Sets.newLinkedHashSet();
					var IEObjectDescription targetDescription;
					for (target : soundContentSet.target) {
						targetDescription = findEObjectDescription(target, descriptionLookUp);
						if (targetDescription !== null) {
							targets.add(targetDescription);
						}
					}
					allocatableSetDescriptionsMap.put(eObjectDescription.qualifiedName, targets);
				}
			}
		];
	}

	def private IEObjectDescription findEObjectDescription(EObject eObject, EObjectDescriptionLookUp descriptionLookUp) {
		val candidates = descriptionLookUp.getExportedObjectsByObject(eObject);
		if (!candidates.isEmpty) {
			return candidates.get(0);
		}
		return null;
	}

	def protected void checkDescriptionForCircularContainment(ResourceSet resourceSet, EObjectDescriptionLookUp descriptionLookUp, IEObjectDescription description,
		Map<EClass, Map<QualifiedName, Set<IEObjectDescription>>> clusterTypeToName, ValidationMessageAcceptor acceptor) {
		val object = description.getEObjectOrProxy();
		val eClass = object.eClass();
		val qualifiedName = description.getName();
		val clusterType = getAssociatedClusterType(eClass);
		if (clusterType === null) {
			return;
		}

		val nameToDescription = clusterTypeToName.get(clusterType);
		if (nameToDescription.containsKey(qualifiedName)) {
			val targetsDescription = nameToDescription.get(qualifiedName);

			val filtedTargets = targetsDescription.filter(d|!description.qualifiedName.equals(d.qualifiedName) && nameToDescription.containsKey(d.qualifiedName));
			for (target : filtedTargets) {
				val index = filtedTargets.toList.indexOf(target);
				val cycleConsistsElement = Sets.newLinkedHashSet(#[target.qualifiedName.toString]);
				checkCircularContainment(resourceSet, description, target, nameToDescription, cycleConsistsElement, acceptor, index);
			}
		}
	}

	def protected void checkCircularContainment(ResourceSet resourceSet, IEObjectDescription rootDescription, IEObjectDescription description,
		Map<QualifiedName, Set<IEObjectDescription>> nameToDescription, LinkedHashSet<String> cycleConsistsElement, ValidationMessageAcceptor acceptor, int index) {
		val targetsDescription = nameToDescription.get(description.qualifiedName);
		val filtedTargets = targetsDescription.filter(d|!description.qualifiedName.equals(d.qualifiedName) && nameToDescription.containsKey(d.qualifiedName));
		if (filtedTargets === null) {
			return;
		}

		for (target : filtedTargets.filter(d|d.qualifiedName.equals(rootDescription.qualifiedName))) {
			createCircularContainmentError(resourceSet, rootDescription, index, acceptor, appendCycleConsists(cycleConsistsElement, target.qualifiedName.toString()));
		}

		for (target : filtedTargets.filter(d|!d.qualifiedName.equals(rootDescription.qualifiedName))) {
			val subCycleConsistsElement = Sets.newLinkedHashSet(cycleConsistsElement);
			if (!subCycleConsistsElement.add(target.qualifiedName.toString())) {
				return;
			}

			checkCircularContainment(resourceSet, rootDescription, target, nameToDescription, subCycleConsistsElement, acceptor, index);
		}
	}

	def protected void createCircularContainmentError(ResourceSet resourceSet, IEObjectDescription description, int index, ValidationMessageAcceptor acceptor,
		LinkedHashSet<String> cycleConsists) {
		var object = description.getEObjectOrProxy();
		if (object.eIsProxy) {
			object = EcoreUtil2.resolve(object, resourceSet);
			if (object.eIsProxy) {
				return;
			}
		}

		val feature = getContainmentFeature(object);
		if (feature !== null) {
			acceptor.acceptError(getCircularContainmentErrorMessage(description, cycleConsists), object, feature, index, getErrorCode());
		}
	}

	def private LinkedHashSet<String> appendCycleConsists(LinkedHashSet<String> cycleConsists, String... args) {
		val LinkedHashSet<String> newCycleConsists = Sets.newLinkedHashSet(cycleConsists);
		if (args !== null && args.length > 0) {
			newCycleConsists.addAll(args);
		}
		return newCycleConsists;
	}

	def String getCircularContainmentErrorMessage(IEObjectDescription description, LinkedHashSet<String> cycleConsists) {
		val qualifiedName = description.getQualifiedName().toString();
		val shortName = String.valueOf(if (qualifiedName !== null && qualifiedName !== "") qualifiedName else "<unnamed>");
		return String.format(CIRCULAR_CONTAINMENT_DETECTE, shortName, cycleConsists.toString());
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

	def protected EStructuralFeature getContainmentFeature(EObject object) {
		switch (object) {
			AllocatableSet:
				return RBACorePackage.Literals.ALLOCATABLE_SET__TARGET
			ContentSet:
				return RBACorePackage.Literals.CONTENT_SET__TARGET
			default:
				return null
		}
	}

	def protected EClass getAssociatedClusterType(EClass eClass) {
		val superTypes = eClass.getESuperTypes();
		if (superTypes.isEmpty()) {
			return null;
		}
		if (superTypes.contains(RBACorePackage.Literals.ALLOCATABLE_SET)) {
			return RBACorePackage.Literals.ALLOCATABLE_SET;
		}
		if (superTypes.contains(RBACorePackage.Literals.CONTENT_SET)) {
			return RBACorePackage.Literals.CONTENT_SET;
		}
		return null;
	}

	def protected String getErrorCode() {
		return null;
	}
}
