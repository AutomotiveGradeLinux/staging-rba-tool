/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rba.core.ExpressionType;
import rba.core.ObjectReference;
import rba.core.PreviousModifier;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Previous Modifier</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.core.impl.PreviousModifierImpl#getObjReference <em>Obj Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreviousModifierImpl extends ExpressionImpl implements PreviousModifier {
	/**
	 * The cached value of the '{@link #getObjReference() <em>Obj Reference</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getObjReference()
	 * @generated
	 * @ordered
	 */
	protected ObjectReference objReference;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PreviousModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.PREVIOUS_MODIFIER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectReference getObjReference() {
		return objReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjReference(ObjectReference newObjReference, NotificationChain msgs) {
		ObjectReference oldObjReference = objReference;
		objReference = newObjReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RBACorePackage.PREVIOUS_MODIFIER__OBJ_REFERENCE, oldObjReference, newObjReference);
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
	public void setObjReference(ObjectReference newObjReference) {
		if (newObjReference != objReference) {
			NotificationChain msgs = null;
			if (objReference != null)
				msgs = ((InternalEObject) objReference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RBACorePackage.PREVIOUS_MODIFIER__OBJ_REFERENCE, null, msgs);
			if (newObjReference != null)
				msgs = ((InternalEObject) newObjReference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RBACorePackage.PREVIOUS_MODIFIER__OBJ_REFERENCE, null, msgs);
			msgs = basicSetObjReference(newObjReference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACorePackage.PREVIOUS_MODIFIER__OBJ_REFERENCE,
					newObjReference, newObjReference));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return "(pre)";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		ObjectReference objReference = getObjReference();
		if (objReference != null) {
			return objReference.getUnderlyingType();
		} else {
			return ExpressionType.VALUE;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionText() {
		StringBuffer expressionText = new StringBuffer();
		if (getObjReference() != null && getObjReference().getRefObject() != null) {
			ObjectReference reference = getObjReference();
			expressionText.append(getSymbol());
			expressionText.append(reference.getExpressionText());
		} else {
			expressionText.append("[Invalid_Expression]");
		}
		return expressionText.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBACorePackage.PREVIOUS_MODIFIER__OBJ_REFERENCE:
			return basicSetObjReference(null, msgs);
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
		case RBACorePackage.PREVIOUS_MODIFIER__OBJ_REFERENCE:
			return getObjReference();
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
		case RBACorePackage.PREVIOUS_MODIFIER__OBJ_REFERENCE:
			setObjReference((ObjectReference) newValue);
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
		case RBACorePackage.PREVIOUS_MODIFIER__OBJ_REFERENCE:
			setObjReference((ObjectReference) null);
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
		case RBACorePackage.PREVIOUS_MODIFIER__OBJ_REFERENCE:
			return objReference != null;
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
		case RBACorePackage.PREVIOUS_MODIFIER___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.PREVIOUS_MODIFIER___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBACorePackage.PREVIOUS_MODIFIER___GET_EXPRESSION_TEXT:
			return getExpressionText();
		}
		return super.eInvoke(operationID, arguments);
	}

} // PreviousModifierImpl
