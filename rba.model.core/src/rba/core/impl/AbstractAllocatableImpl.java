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
import rba.core.AbstractContent;
import rba.core.Allocatable;
import rba.core.AllocatableSet;
import rba.core.Content;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Allocatable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.core.impl.AbstractAllocatableImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link rba.core.impl.AbstractAllocatableImpl#getAllocatableGroup <em>Allocatable Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractAllocatableImpl extends RuleObjectImpl implements AbstractAllocatable {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractContent> contents;

	/**
	 * The cached value of the '{@link #getAllocatableGroup() <em>Allocatable Group</em>}' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getAllocatableGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocatableSet> allocatableGroup;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractAllocatableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.ABSTRACT_ALLOCATABLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractContent> getContents() {
		if (contents == null) {
			contents = new EObjectWithInverseResolvingEList.ManyInverse<AbstractContent>(AbstractContent.class, this,
					RBACorePackage.ABSTRACT_ALLOCATABLE__CONTENTS, RBACorePackage.ABSTRACT_CONTENT__ALLOCATABLE);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocatableSet> getAllocatableGroup() {
		if (allocatableGroup == null) {
			allocatableGroup = new EObjectWithInverseResolvingEList.ManyInverse<AllocatableSet>(AllocatableSet.class,
					this, RBACorePackage.ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP,
					RBACorePackage.ALLOCATABLE_SET__TARGET);
		}
		return allocatableGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Content> getContentsList() {
		java.util.Set<Content> contents = new java.util.LinkedHashSet<Content>();
		getContents().forEach(content -> contents.addAll(content.collectLeafContents()));
		getAllocatableGroup().forEach(allocatableSet -> contents.addAll(allocatableSet.getContentsList()));
		return new org.eclipse.emf.common.util.BasicEList<Content>(contents);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Allocatable> collectLeafAllocatable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBACorePackage.ABSTRACT_ALLOCATABLE__CONTENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContents()).basicAdd(otherEnd, msgs);
		case RBACorePackage.ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAllocatableGroup()).basicAdd(otherEnd, msgs);
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
		case RBACorePackage.ABSTRACT_ALLOCATABLE__CONTENTS:
			return ((InternalEList<?>) getContents()).basicRemove(otherEnd, msgs);
		case RBACorePackage.ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP:
			return ((InternalEList<?>) getAllocatableGroup()).basicRemove(otherEnd, msgs);
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
		case RBACorePackage.ABSTRACT_ALLOCATABLE__CONTENTS:
			return getContents();
		case RBACorePackage.ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP:
			return getAllocatableGroup();
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
		case RBACorePackage.ABSTRACT_ALLOCATABLE__CONTENTS:
			getContents().clear();
			getContents().addAll((Collection<? extends AbstractContent>) newValue);
			return;
		case RBACorePackage.ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP:
			getAllocatableGroup().clear();
			getAllocatableGroup().addAll((Collection<? extends AllocatableSet>) newValue);
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
		case RBACorePackage.ABSTRACT_ALLOCATABLE__CONTENTS:
			getContents().clear();
			return;
		case RBACorePackage.ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP:
			getAllocatableGroup().clear();
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
		case RBACorePackage.ABSTRACT_ALLOCATABLE__CONTENTS:
			return contents != null && !contents.isEmpty();
		case RBACorePackage.ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP:
			return allocatableGroup != null && !allocatableGroup.isEmpty();
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
		case RBACorePackage.ABSTRACT_ALLOCATABLE___GET_CONTENTS_LIST:
			return getContentsList();
		case RBACorePackage.ABSTRACT_ALLOCATABLE___COLLECT_LEAF_ALLOCATABLE:
			return collectLeafAllocatable();
		}
		return super.eInvoke(operationID, arguments);
	}

} // AbstractAllocatableImpl
