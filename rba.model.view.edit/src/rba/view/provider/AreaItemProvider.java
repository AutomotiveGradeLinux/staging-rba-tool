/**
 */
package rba.view.provider;

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
import rba.view.Area;
import rba.view.RBAViewFactory;
import rba.view.RBAViewPackage;

/**
 * This is the item provider adapter for a {@link rba.view.Area} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class AreaItemProvider extends AllocatableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AreaItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RBAViewPackage.Literals.AREA__ZORDER);
			childrenFeatures.add(RBAViewPackage.Literals.AREA__SIZE);
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
	 * This returns Area.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Area"));
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
		String label = ((Area) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Area_type")
				: getString("_UI_Area_type") + " " + label;
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

		switch (notification.getFeatureID(Area.class)) {
		case RBAViewPackage.AREA__ZORDER:
		case RBAViewPackage.AREA__SIZE:
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
				RBAViewFactory.eINSTANCE.createIsDisplayed()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBAViewFactory.eINSTANCE.createDisplayingContent()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBAViewFactory.eINSTANCE.createIsHidden()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBAViewFactory.eINSTANCE.createIsVisible()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBAViewFactory.eINSTANCE.createAllInstanceOfArea()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBAViewFactory.eINSTANCE.createAllInstanceOfViewContent()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBAViewFactory.eINSTANCE.createIsDisplayedOn()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBAViewFactory.eINSTANCE.createIsChangedDisplay()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBAViewFactory.eINSTANCE.createIsTranslatedViewTo()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.ALLOCATABLE__VISIBILITY,
				RBAViewFactory.eINSTANCE.createHideLowerPriority()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBAViewFactory.eINSTANCE.createIsDisplayed()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBAViewFactory.eINSTANCE.createDisplayingContent()));

		newChildDescriptors.add(
				createChildParameter(RBAViewPackage.Literals.AREA__ZORDER, RBAViewFactory.eINSTANCE.createIsHidden()));

		newChildDescriptors.add(
				createChildParameter(RBAViewPackage.Literals.AREA__ZORDER, RBAViewFactory.eINSTANCE.createIsVisible()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBAViewFactory.eINSTANCE.createAllInstanceOfArea()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBAViewFactory.eINSTANCE.createAllInstanceOfViewContent()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBAViewFactory.eINSTANCE.createIsDisplayedOn()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBAViewFactory.eINSTANCE.createIsChangedDisplay()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBAViewFactory.eINSTANCE.createIsTranslatedViewTo()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBAViewFactory.eINSTANCE.createHideLowerPriority()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createComplexExpression()));

		newChildDescriptors.add(
				createChildParameter(RBAViewPackage.Literals.AREA__ZORDER, RBACoreFactory.eINSTANCE.createIsTypeOf()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createObjectReference()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createPreviousModifier()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createGreaterThanOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createMuchGreaterThanOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createLowerThanOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createEqualToOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createComparisonAnd()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createAndOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createOrOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createNotOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createIsEqualToOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createIsGreaterThanOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createIsLowerThanOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createIsGreaterThanEqualOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createIsLowerThanEqualOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createPlusOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createImpliesOperator()));

		newChildDescriptors.add(
				createChildParameter(RBAViewPackage.Literals.AREA__ZORDER, RBACoreFactory.eINSTANCE.createIsActive()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createGetAllocatables()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createHasBeenDisplayed()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createActiveState()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createObjectCompare()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createThatOfOperator()));

		newChildDescriptors.add(
				createChildParameter(RBAViewPackage.Literals.AREA__ZORDER, RBACoreFactory.eINSTANCE.createMaxValue()));

		newChildDescriptors.add(
				createChildParameter(RBAViewPackage.Literals.AREA__ZORDER, RBACoreFactory.eINSTANCE.createMinValue()));

		newChildDescriptors.add(
				createChildParameter(RBAViewPackage.Literals.AREA__ZORDER, RBACoreFactory.eINSTANCE.createNoneValue()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createStandardValue()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createIntegerValue()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createLoserTypeExpression()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createArbitrationPolicyExpression()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createSizeOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createExistsOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createForAllOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createMaxOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createMinOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createSelectOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createSetOfOperator()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createLambdaExpression()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors
				.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER, RBACoreFactory.eINSTANCE.createIsOn()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createAllocatedContent()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createContentValue()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createGetContentsList()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createActiveContents()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createGetProperty()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createStateValue()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createHasComeLaterThan()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createHasComeEarlierThan()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createObjectCompareNot()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createIsAllocatedTo()));

		newChildDescriptors.add(
				createChildParameter(RBAViewPackage.Literals.AREA__ZORDER, RBACoreFactory.eINSTANCE.createIsChanged()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createIsTranslatedTo()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__ZORDER,
				RBACoreFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors
				.add(createChildParameter(RBAViewPackage.Literals.AREA__SIZE, RBAViewFactory.eINSTANCE.createSize()));

		newChildDescriptors.add(createChildParameter(RBAViewPackage.Literals.AREA__SIZE,
				RBAViewFactory.eINSTANCE.createSizeReference()));
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
				|| childFeature == RBAViewPackage.Literals.AREA__ZORDER;

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
		return RbaViewEditPlugin.INSTANCE;
	}

}
