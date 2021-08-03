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
import rba.core.Content;
import rba.core.ContentSet;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Content</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.core.impl.AbstractContentImpl#getContentGroup <em>Content Group</em>}</li>
 *   <li>{@link rba.core.impl.AbstractContentImpl#getAllocatable <em>Allocatable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractContentImpl extends RuleObjectImpl implements AbstractContent {
	/**
	 * The cached value of the '{@link #getContentGroup() <em>Content Group</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getContentGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentSet> contentGroup;

	/**
	 * The cached value of the '{@link #getAllocatable() <em>Allocatable</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAllocatable()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractAllocatable> allocatable;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.ABSTRACT_CONTENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentSet> getContentGroup() {
		if (contentGroup == null) {
			contentGroup = new EObjectWithInverseResolvingEList.ManyInverse<ContentSet>(ContentSet.class, this,
					RBACorePackage.ABSTRACT_CONTENT__CONTENT_GROUP, RBACorePackage.CONTENT_SET__TARGET);
		}
		return contentGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractAllocatable> getAllocatable() {
		if (allocatable == null) {
			allocatable = new EObjectWithInverseResolvingEList.ManyInverse<AbstractAllocatable>(
					AbstractAllocatable.class, this, RBACorePackage.ABSTRACT_CONTENT__ALLOCATABLE,
					RBACorePackage.ABSTRACT_ALLOCATABLE__CONTENTS);
		}
		return allocatable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Allocatable> getAllocatableList() {
		java.util.Set<Allocatable> allocatables = new java.util.LinkedHashSet<Allocatable>();
		getAllocatable().forEach(allocatable -> allocatables.addAll(allocatable.collectLeafAllocatable()));
		getContentGroup().forEach(contentSet -> allocatables.addAll(contentSet.getAllocatableList()));
		return new org.eclipse.emf.common.util.BasicEList<Allocatable>(allocatables);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Content> collectLeafContents() {
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
		case RBACorePackage.ABSTRACT_CONTENT__CONTENT_GROUP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContentGroup()).basicAdd(otherEnd, msgs);
		case RBACorePackage.ABSTRACT_CONTENT__ALLOCATABLE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAllocatable()).basicAdd(otherEnd, msgs);
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
		case RBACorePackage.ABSTRACT_CONTENT__CONTENT_GROUP:
			return ((InternalEList<?>) getContentGroup()).basicRemove(otherEnd, msgs);
		case RBACorePackage.ABSTRACT_CONTENT__ALLOCATABLE:
			return ((InternalEList<?>) getAllocatable()).basicRemove(otherEnd, msgs);
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
		case RBACorePackage.ABSTRACT_CONTENT__CONTENT_GROUP:
			return getContentGroup();
		case RBACorePackage.ABSTRACT_CONTENT__ALLOCATABLE:
			return getAllocatable();
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
		case RBACorePackage.ABSTRACT_CONTENT__CONTENT_GROUP:
			getContentGroup().clear();
			getContentGroup().addAll((Collection<? extends ContentSet>) newValue);
			return;
		case RBACorePackage.ABSTRACT_CONTENT__ALLOCATABLE:
			getAllocatable().clear();
			getAllocatable().addAll((Collection<? extends AbstractAllocatable>) newValue);
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
		case RBACorePackage.ABSTRACT_CONTENT__CONTENT_GROUP:
			getContentGroup().clear();
			return;
		case RBACorePackage.ABSTRACT_CONTENT__ALLOCATABLE:
			getAllocatable().clear();
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
		case RBACorePackage.ABSTRACT_CONTENT__CONTENT_GROUP:
			return contentGroup != null && !contentGroup.isEmpty();
		case RBACorePackage.ABSTRACT_CONTENT__ALLOCATABLE:
			return allocatable != null && !allocatable.isEmpty();
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
		case RBACorePackage.ABSTRACT_CONTENT___GET_ALLOCATABLE_LIST:
			return getAllocatableList();
		case RBACorePackage.ABSTRACT_CONTENT___COLLECT_LEAF_CONTENTS:
			return collectLeafContents();
		}
		return super.eInvoke(operationID, arguments);
	}

} // AbstractContentImpl
