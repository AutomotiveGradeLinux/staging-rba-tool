/**
 */
package rba.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rba.core.RBACorePackage;
import rba.core.Stereotype;
import rba.core.Variable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Stereotype</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.core.impl.StereotypeImpl#getTargetModelName <em>Target Model Name</em>}</li>
 *   <li>{@link rba.core.impl.StereotypeImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link rba.core.impl.StereotypeImpl#getBodyText <em>Body Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StereotypeImpl extends PackagableElementImpl implements Stereotype {
	/**
	 * The default value of the '{@link #getTargetModelName() <em>Target Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetModelName() <em>Target Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModelName()
	 * @generated
	 * @ordered
	 */
	protected String targetModelName = TARGET_MODEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The default value of the '{@link #getBodyText() <em>Body Text</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * @see #getBodyText()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBodyText() <em>Body Text</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * @see #getBodyText()
	 * @generated
	 * @ordered
	 */
	protected String bodyText = BODY_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StereotypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.STEREOTYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetModelName() {
		return targetModelName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetModelName(String newTargetModelName) {
		String oldTargetModelName = targetModelName;
		targetModelName = newTargetModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACorePackage.STEREOTYPE__TARGET_MODEL_NAME,
					oldTargetModelName, targetModelName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getBodyText() {
		return bodyText;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyText(String newBodyText) {
		String oldBodyText = bodyText;
		bodyText = newBodyText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACorePackage.STEREOTYPE__BODY_TEXT, oldBodyText,
					bodyText));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this,
					RBACorePackage.STEREOTYPE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBACorePackage.STEREOTYPE__VARIABLES:
			return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs);
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
		case RBACorePackage.STEREOTYPE__TARGET_MODEL_NAME:
			return getTargetModelName();
		case RBACorePackage.STEREOTYPE__VARIABLES:
			return getVariables();
		case RBACorePackage.STEREOTYPE__BODY_TEXT:
			return getBodyText();
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
		case RBACorePackage.STEREOTYPE__TARGET_MODEL_NAME:
			setTargetModelName((String) newValue);
			return;
		case RBACorePackage.STEREOTYPE__VARIABLES:
			getVariables().clear();
			getVariables().addAll((Collection<? extends Variable>) newValue);
			return;
		case RBACorePackage.STEREOTYPE__BODY_TEXT:
			setBodyText((String) newValue);
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
		case RBACorePackage.STEREOTYPE__TARGET_MODEL_NAME:
			setTargetModelName(TARGET_MODEL_NAME_EDEFAULT);
			return;
		case RBACorePackage.STEREOTYPE__VARIABLES:
			getVariables().clear();
			return;
		case RBACorePackage.STEREOTYPE__BODY_TEXT:
			setBodyText(BODY_TEXT_EDEFAULT);
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
		case RBACorePackage.STEREOTYPE__TARGET_MODEL_NAME:
			return TARGET_MODEL_NAME_EDEFAULT == null ? targetModelName != null
					: !TARGET_MODEL_NAME_EDEFAULT.equals(targetModelName);
		case RBACorePackage.STEREOTYPE__VARIABLES:
			return variables != null && !variables.isEmpty();
		case RBACorePackage.STEREOTYPE__BODY_TEXT:
			return BODY_TEXT_EDEFAULT == null ? bodyText != null : !BODY_TEXT_EDEFAULT.equals(bodyText);
		}
		return super.eIsSet(featureID);
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
		result.append(" (targetModelName: ");
		result.append(targetModelName);
		result.append(", bodyText: ");
		result.append(bodyText);
		result.append(')');
		return result.toString();
	}

} // StereotypeImpl
