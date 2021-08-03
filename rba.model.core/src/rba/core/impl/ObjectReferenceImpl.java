/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rba.core.AbstractProperty;
import rba.core.ContentState;
import rba.core.ExpressionType;
import rba.core.ObjectReference;
import rba.core.RBACorePackage;
import rba.core.RuleObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Object Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.core.impl.ObjectReferenceImpl#getRefObject <em>Ref Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectReferenceImpl extends ExpressionImpl implements ObjectReference {
	/**
	 * The cached value of the '{@link #getRefObject() <em>Ref Object</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRefObject()
	 * @generated
	 * @ordered
	 */
	protected RuleObject refObject;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.OBJECT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RuleObject getRefObject() {
		if (refObject != null && refObject.eIsProxy()) {
			InternalEObject oldRefObject = (InternalEObject) refObject;
			refObject = (RuleObject) eResolveProxy(oldRefObject);
			if (refObject != oldRefObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RBACorePackage.OBJECT_REFERENCE__REF_OBJECT, oldRefObject, refObject));
			}
		}
		return refObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RuleObject basicGetRefObject() {
		return refObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefObject(RuleObject newRefObject) {
		RuleObject oldRefObject = refObject;
		refObject = newRefObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACorePackage.OBJECT_REFERENCE__REF_OBJECT,
					oldRefObject, refObject));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		RuleObject obj = getRefObject();
		if (obj != null) {
			return obj.getExpressionType();
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
		RuleObject obj = getRefObject();
		if (obj instanceof ContentState) {
			ContentState state = (ContentState) obj;
			expressionText.append(state.getOwner().getName() + "." + state.getName());
		} else if (obj instanceof AbstractProperty) {
			AbstractProperty property = (AbstractProperty) obj;
			expressionText.append(property.getOwner().getName() + "." + property.getName());
		} else {
			expressionText.append(obj != null ? obj.getName() : "[Invalid_Expression]");
		}
		return expressionText.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RBACorePackage.OBJECT_REFERENCE__REF_OBJECT:
			if (resolve)
				return getRefObject();
			return basicGetRefObject();
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
		case RBACorePackage.OBJECT_REFERENCE__REF_OBJECT:
			setRefObject((RuleObject) newValue);
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
		case RBACorePackage.OBJECT_REFERENCE__REF_OBJECT:
			setRefObject((RuleObject) null);
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
		case RBACorePackage.OBJECT_REFERENCE__REF_OBJECT:
			return refObject != null;
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
		case RBACorePackage.OBJECT_REFERENCE___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBACorePackage.OBJECT_REFERENCE___GET_EXPRESSION_TEXT:
			return getExpressionText();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ObjectReferenceImpl
