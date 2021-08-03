/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import rba.core.Content;
import rba.core.ContentState;
import rba.core.LoserType;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Content</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.core.impl.ContentImpl#getLoserType <em>Loser Type</em>}</li>
 *   <li>{@link rba.core.impl.ContentImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContentImpl extends AbstractContentImpl implements Content {
	/**
	 * The default value of the '{@link #getLoserType() <em>Loser Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLoserType()
	 * @generated
	 * @ordered
	 */
	protected static final LoserType LOSER_TYPE_EDEFAULT = LoserType.NEVER_GIVEUP;

	/**
	 * The cached value of the '{@link #getLoserType() <em>Loser Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLoserType()
	 * @generated
	 * @ordered
	 */
	protected LoserType loserType = LOSER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentState> states;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.CONTENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LoserType getLoserType() {
		return loserType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoserType(LoserType newLoserType) {
		LoserType oldLoserType = loserType;
		loserType = newLoserType == null ? LOSER_TYPE_EDEFAULT : newLoserType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACorePackage.CONTENT__LOSER_TYPE, oldLoserType,
					loserType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentState> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<ContentState>(ContentState.class, this,
					RBACorePackage.CONTENT__STATES, RBACorePackage.CONTENT_STATE__OWNER);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Content> collectLeafContents() {
		java.util.Set<Content> contents = new java.util.HashSet<Content>();
		contents.add(this);
		return new org.eclipse.emf.common.util.BasicEList<Content>(contents);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBACorePackage.CONTENT__STATES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStates()).basicAdd(otherEnd, msgs);
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
		case RBACorePackage.CONTENT__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
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
		case RBACorePackage.CONTENT__LOSER_TYPE:
			return getLoserType();
		case RBACorePackage.CONTENT__STATES:
			return getStates();
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
		case RBACorePackage.CONTENT__LOSER_TYPE:
			setLoserType((LoserType) newValue);
			return;
		case RBACorePackage.CONTENT__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends ContentState>) newValue);
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
		case RBACorePackage.CONTENT__LOSER_TYPE:
			setLoserType(LOSER_TYPE_EDEFAULT);
			return;
		case RBACorePackage.CONTENT__STATES:
			getStates().clear();
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
		case RBACorePackage.CONTENT__LOSER_TYPE:
			return loserType != LOSER_TYPE_EDEFAULT;
		case RBACorePackage.CONTENT__STATES:
			return states != null && !states.isEmpty();
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
		case RBACorePackage.CONTENT___COLLECT_LEAF_CONTENTS:
			return collectLeafContents();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (loserType: ");
		result.append(loserType);
		result.append(')');
		return result.toString();
	}

} // ContentImpl
