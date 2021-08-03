/**
 */
package rba.sound.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import rba.core.RBACoreFactory;
import rba.core.RBACorePackage;
import rba.core.provider.AllocatableItemProvider;
import rba.sound.RBASoundFactory;
import rba.sound.RBASoundPackage;
import rba.sound.Zone;

/**
 * This is the item provider adapter for a {@link rba.sound.Zone} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ZoneItemProvider extends AllocatableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RBASoundPackage.Literals.ZONE__ATTENUATE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Zone.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Zone"));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Zone) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Zone_type")
				: getString("_UI_Zone_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Zone.class)) {
		case RBASoundPackage.ZONE__ATTENUATE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBASoundFactory.eINSTANCE.createIsSounding()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBASoundFactory.eINSTANCE.createIsOutputted()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBASoundFactory.eINSTANCE.createIsMuted()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBASoundFactory.eINSTANCE.createIsAttenuated()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBASoundFactory.eINSTANCE.createOutputtingSound()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBASoundFactory.eINSTANCE.createAllInstanceOfZone()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBASoundFactory.eINSTANCE.createAllInstanceOfSoundContent()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBASoundFactory.eINSTANCE.createIsOutputtedOn()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBASoundFactory.eINSTANCE.createIsChangedOutput()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBASoundFactory.eINSTANCE.createIsTranslatedSoundTo()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBASoundFactory.eINSTANCE.createMuteLowerPriority()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBASoundFactory.eINSTANCE.createIsSounding()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBASoundFactory.eINSTANCE.createIsOutputted()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBASoundFactory.eINSTANCE.createIsMuted()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBASoundFactory.eINSTANCE.createIsAttenuated()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBASoundFactory.eINSTANCE.createOutputtingSound()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBASoundFactory.eINSTANCE.createAllInstanceOfZone()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBASoundFactory.eINSTANCE.createAllInstanceOfSoundContent()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBASoundFactory.eINSTANCE.createIsOutputtedOn()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBASoundFactory.eINSTANCE.createIsChangedOutput()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBASoundFactory.eINSTANCE.createIsTranslatedSoundTo()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBASoundFactory.eINSTANCE.createMuteLowerPriority()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createComplexExpression()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createIsTypeOf()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createObjectReference()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createPreviousModifier()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createGreaterThanOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createMuchGreaterThanOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createLowerThanOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createEqualToOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createComparisonAnd()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createAndOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createOrOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createNotOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createIsEqualToOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createIsGreaterThanOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createIsLowerThanOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createIsGreaterThanEqualOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createIsLowerThanEqualOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createPlusOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createImpliesOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createIsActive()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createGetAllocatables()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createHasBeenDisplayed()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createActiveState()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createObjectCompare()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createThatOfOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createMaxValue()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createMinValue()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createNoneValue()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createStandardValue()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createIntegerValue()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createLoserTypeExpression()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createArbitrationPolicyExpression()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createSizeOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createExistsOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createForAllOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createMaxOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createMinOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createSelectOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createSetOfOperator()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add(
				createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE, RBACoreFactory.eINSTANCE.createIsOn()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createAllocatedContent()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createContentValue()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createGetContentsList()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createActiveContents()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createGetProperty()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createStateValue()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createHasComeLaterThan()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createHasComeEarlierThan()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createObjectCompareNot()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createIsAllocatedTo()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createIsChanged()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createIsTranslatedTo()));

		newChildDescriptors.add(createChildParameter(RBASoundPackage.Literals.ZONE__ATTENUATE,
				RBACoreFactory.eINSTANCE.createNullExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == RBACorePackage.Literals.ALLOCATABLE__VISIBILITY
				|| childFeature == RBASoundPackage.Literals.ZONE__ATTENUATE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RbaSoundEditPlugin.INSTANCE;
	}

}
