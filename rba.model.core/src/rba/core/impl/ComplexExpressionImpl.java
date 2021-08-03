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

import rba.core.ComplexExpression;
import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.RBACorePackage;
import rba.core.SugarExpression;
import rba.core.SugarExpressionBase;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Complex Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.core.impl.ComplexExpressionImpl#getOtherExpression <em>Other Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexExpressionImpl extends ExpressionImpl implements ComplexExpression {
	/**
	 * The cached value of the '{@link #getOtherExpression() <em>Other Expression</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOtherExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression otherExpression;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.COMPLEX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOtherExpression() {
		return otherExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherExpression(Expression newOtherExpression, NotificationChain msgs) {
		Expression oldOtherExpression = otherExpression;
		otherExpression = newOtherExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RBACorePackage.COMPLEX_EXPRESSION__OTHER_EXPRESSION, oldOtherExpression, newOtherExpression);
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
	public void setOtherExpression(Expression newOtherExpression) {
		if (newOtherExpression != otherExpression) {
			NotificationChain msgs = null;
			if (otherExpression != null)
				msgs = ((InternalEObject) otherExpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RBACorePackage.COMPLEX_EXPRESSION__OTHER_EXPRESSION, null, msgs);
			if (newOtherExpression != null)
				msgs = ((InternalEObject) newOtherExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RBACorePackage.COMPLEX_EXPRESSION__OTHER_EXPRESSION, null, msgs);
			msgs = basicSetOtherExpression(newOtherExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACorePackage.COMPLEX_EXPRESSION__OTHER_EXPRESSION,
					newOtherExpression, newOtherExpression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionText() {
		return otherExpression != null ? otherExpression.getExpressionText() : "[Invalid_Expression]";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		if (otherExpression != null) {
			return otherExpression.getType();
		} else {
			return ExpressionType.VALUE;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getType() {
		return getUnderlyingType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canExpand() {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression getExpanded() {
		otherExpression.getLetStatements().addAll(getLetStatements());
		return otherExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBACorePackage.COMPLEX_EXPRESSION__OTHER_EXPRESSION:
			return basicSetOtherExpression(null, msgs);
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
		case RBACorePackage.COMPLEX_EXPRESSION__OTHER_EXPRESSION:
			return getOtherExpression();
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
		case RBACorePackage.COMPLEX_EXPRESSION__OTHER_EXPRESSION:
			setOtherExpression((Expression) newValue);
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
		case RBACorePackage.COMPLEX_EXPRESSION__OTHER_EXPRESSION:
			setOtherExpression((Expression) null);
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
		case RBACorePackage.COMPLEX_EXPRESSION__OTHER_EXPRESSION:
			return otherExpression != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Expression.class) {
			switch (baseOperationID) {
			case RBACorePackage.EXPRESSION___GET_UNDERLYING_TYPE:
				return RBACorePackage.COMPLEX_EXPRESSION___GET_UNDERLYING_TYPE;
			case RBACorePackage.EXPRESSION___GET_EXPRESSION_TEXT:
				return RBACorePackage.COMPLEX_EXPRESSION___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SugarExpression.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION___CAN_EXPAND:
				return RBACorePackage.COMPLEX_EXPRESSION___CAN_EXPAND;
			case RBACorePackage.SUGAR_EXPRESSION___GET_EXPANDED:
				return RBACorePackage.COMPLEX_EXPRESSION___GET_EXPANDED;
			default:
				return -1;
			}
		}
		if (baseClass == SugarExpressionBase.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION_BASE___CAN_EXPAND:
				return RBACorePackage.COMPLEX_EXPRESSION___CAN_EXPAND;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.COMPLEX_EXPRESSION___GET_EXPRESSION_TEXT:
			return getExpressionText();
		case RBACorePackage.COMPLEX_EXPRESSION___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBACorePackage.COMPLEX_EXPRESSION___GET_TYPE:
			return getType();
		case RBACorePackage.COMPLEX_EXPRESSION___CAN_EXPAND:
			return canExpand();
		case RBACorePackage.COMPLEX_EXPRESSION___GET_EXPANDED:
			return getExpanded();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ComplexExpressionImpl
