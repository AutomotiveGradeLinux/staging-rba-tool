/**
 */
package rba.sound.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.impl.AllocatableImpl;
import rba.sound.RBASoundPackage;
import rba.sound.Zone;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Zone</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.sound.impl.ZoneImpl#getAttenuate <em>Attenuate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneImpl extends AllocatableImpl implements Zone {
	/**
	 * The cached value of the '{@link #getAttenuate() <em>Attenuate</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAttenuate()
	 * @generated
	 * @ordered
	 */
	protected Expression attenuate;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBASoundPackage.Literals.ZONE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAttenuate() {
		return attenuate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttenuate(Expression newAttenuate, NotificationChain msgs) {
		Expression oldAttenuate = attenuate;
		attenuate = newAttenuate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RBASoundPackage.ZONE__ATTENUATE, oldAttenuate, newAttenuate);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttenuate(Expression newAttenuate) {
		if (newAttenuate != attenuate) {
			NotificationChain msgs = null;
			if (attenuate != null)
				msgs = ((InternalEObject) attenuate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RBASoundPackage.ZONE__ATTENUATE, null, msgs);
			if (newAttenuate != null)
				msgs = ((InternalEObject) newAttenuate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RBASoundPackage.ZONE__ATTENUATE, null, msgs);
			msgs = basicSetAttenuate(newAttenuate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBASoundPackage.ZONE__ATTENUATE, newAttenuate,
					newAttenuate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getExpressionType() {
		return ExpressionType.ZONE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBASoundPackage.ZONE__ATTENUATE:
			return basicSetAttenuate(null, msgs);
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
		case RBASoundPackage.ZONE__ATTENUATE:
			return getAttenuate();
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
		case RBASoundPackage.ZONE__ATTENUATE:
			setAttenuate((Expression) newValue);
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
		case RBASoundPackage.ZONE__ATTENUATE:
			setAttenuate((Expression) null);
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
		case RBASoundPackage.ZONE__ATTENUATE:
			return attenuate != null;
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
		case RBASoundPackage.ZONE___GET_EXPRESSION_TYPE:
			return getExpressionType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ZoneImpl
