/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rba.core.AbstractAllocatable;
import rba.core.Allocatable;
import rba.core.AllocatableSet;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Allocatable Set</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.core.impl.AllocatableSetImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AllocatableSetImpl extends AbstractAllocatableImpl implements AllocatableSet {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractAllocatable> target;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocatableSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.ALLOCATABLE_SET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractAllocatable> getTarget() {
		if (target == null) {
			target = new EObjectWithInverseResolvingEList.ManyInverse<AbstractAllocatable>(AbstractAllocatable.class,
					this, RBACorePackage.ALLOCATABLE_SET__TARGET,
					RBACorePackage.ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Allocatable> collectLeafAllocatable() {
		java.util.Set<Allocatable> allocatables = new java.util.LinkedHashSet<Allocatable>();
		getTarget().forEach(allocatable -> allocatables.addAll(allocatable.collectLeafAllocatable()));
		return new org.eclipse.emf.common.util.BasicEList<Allocatable>(allocatables);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBACorePackage.ALLOCATABLE_SET__TARGET:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTarget()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBACorePackage.ALLOCATABLE_SET__TARGET:
			return ((InternalEList<?>) getTarget()).basicRemove(otherEnd, msgs);
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
		case RBACorePackage.ALLOCATABLE_SET__TARGET:
			return getTarget();
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
		case RBACorePackage.ALLOCATABLE_SET__TARGET:
			getTarget().clear();
			getTarget().addAll((Collection<? extends AbstractAllocatable>) newValue);
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
		case RBACorePackage.ALLOCATABLE_SET__TARGET:
			getTarget().clear();
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
		case RBACorePackage.ALLOCATABLE_SET__TARGET:
			return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.ALLOCATABLE_SET___COLLECT_LEAF_ALLOCATABLE:
			return collectLeafAllocatable();
		}
		return super.eInvoke(operationID, arguments);
	}

} // AllocatableSetImpl
