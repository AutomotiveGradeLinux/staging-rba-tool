/**
 */
package rba.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rba.core.PackagableElement;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Package</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.core.impl.PackageImpl#getPackagableelement <em>Packagableelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends PackagableElementImpl implements rba.core.Package {
	/**
	 * The cached value of the '{@link #getPackagableelement() <em>Packagableelement</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPackagableelement()
	 * @generated
	 * @ordered
	 */
	protected EList<PackagableElement> packagableelement;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackagableElement> getPackagableelement() {
		if (packagableelement == null) {
			packagableelement = new EObjectContainmentEList<PackagableElement>(PackagableElement.class, this,
					RBACorePackage.PACKAGE__PACKAGABLEELEMENT);
		}
		return packagableelement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBACorePackage.PACKAGE__PACKAGABLEELEMENT:
			return ((InternalEList<?>) getPackagableelement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RBACorePackage.PACKAGE__PACKAGABLEELEMENT:
			return getPackagableelement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RBACorePackage.PACKAGE__PACKAGABLEELEMENT:
			getPackagableelement().clear();
			getPackagableelement().addAll((Collection<? extends PackagableElement>) newValue);
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
		case RBACorePackage.PACKAGE__PACKAGABLEELEMENT:
			getPackagableelement().clear();
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
		case RBACorePackage.PACKAGE__PACKAGABLEELEMENT:
			return packagableelement != null && !packagableelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // PackageImpl
