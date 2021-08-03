/**
 */
package rba.sound.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import rba.core.RBACorePackage;

import rba.core.provider.ContentStateItemProvider;

import rba.sound.RBASoundFactory;
import rba.sound.SoundContentState;

/**
 * This is the item provider adapter for a {@link rba.sound.SoundContentState} object. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * @generated
 */
public class SoundContentStateItemProvider extends ContentStateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SoundContentStateItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns SoundContentState.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SoundContentState"));
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
		String label = ((SoundContentState) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_SoundContentState_type")
				: getString("_UI_SoundContentState_type") + " " + label;
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
				RBASoundFactory.eINSTANCE.createIsSounding()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBASoundFactory.eINSTANCE.createIsOutputted()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBASoundFactory.eINSTANCE.createIsMuted()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBASoundFactory.eINSTANCE.createIsAttenuated()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBASoundFactory.eINSTANCE.createOutputtingSound()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBASoundFactory.eINSTANCE.createAllInstanceOfZone()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBASoundFactory.eINSTANCE.createAllInstanceOfSoundContent()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBASoundFactory.eINSTANCE.createIsOutputtedOn()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBASoundFactory.eINSTANCE.createIsChangedOutput()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBASoundFactory.eINSTANCE.createIsTranslatedSoundTo()));

		newChildDescriptors.add(createChildParameter(RBACorePackage.Literals.CONTENT_STATE__VALUE,
				RBASoundFactory.eINSTANCE.createMuteLowerPriority()));
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
