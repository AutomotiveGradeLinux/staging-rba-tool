/**
 */
package rba.view.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import rba.core.RBACorePackage;

import rba.core.provider.ContentStateItemProvider;

import rba.view.RBAViewFactory;
import rba.view.ViewContentState;

/**
 * This is the item provider adapter for a {@link rba.view.ViewContentState} object. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * @generated
 */
public class ViewContentStateItemProvider extends ContentStateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContentStateItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns ViewContentState.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ViewContentState"));
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
		String label = ((ViewContentState) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ViewContentState_type")
				: getString("_UI_ViewContentState_type") + " " + label;
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

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBAViewFactory.eINSTANCE.createIsDisplayed()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBAViewFactory.eINSTANCE.createDisplayingContent()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBAViewFactory.eINSTANCE.createIsHidden()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBAViewFactory.eINSTANCE.createIsVisible()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBAViewFactory.eINSTANCE.createAllInstanceOfArea()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBAViewFactory.eINSTANCE.createAllInstanceOfViewContent()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBAViewFactory.eINSTANCE.createIsDisplayedOn()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBAViewFactory.eINSTANCE.createIsChangedDisplay()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBAViewFactory.eINSTANCE.createIsTranslatedViewTo()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBAViewFactory.eINSTANCE.createHideLowerPriority()));
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
