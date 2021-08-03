/**
 */
package rba.view.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rba.view.RBAViewPackage;
import rba.view.Size;
import rba.view.SizeReference;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Size Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.view.impl.SizeReferenceImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SizeReferenceImpl extends SizeIdentifierImpl implements SizeReference {
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Size size;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SizeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBAViewPackage.Literals.SIZE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		if (size != null && size.eIsProxy()) {
			InternalEObject oldSize = (InternalEObject) size;
			size = (Size) eResolveProxy(oldSize);
			if (size != oldSize) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RBAViewPackage.SIZE_REFERENCE__SIZE,
							oldSize, size));
			}
		}
		return size;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Size basicGetSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		Size oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBAViewPackage.SIZE_REFERENCE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RBAViewPackage.SIZE_REFERENCE__SIZE:
			if (resolve)
				return getSize();
			return basicGetSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RBAViewPackage.SIZE_REFERENCE__SIZE:
			setSize((Size) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RBAViewPackage.SIZE_REFERENCE__SIZE:
			setSize((Size) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RBAViewPackage.SIZE_REFERENCE__SIZE:
			return size != null;
		}
		return super.eIsSet(featureID);
	}

} // SizeReferenceImpl
