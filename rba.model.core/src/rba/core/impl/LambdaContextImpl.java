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
import rba.core.LambdaContext;
import rba.core.LambdaExpression;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Lambda Context</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.core.impl.LambdaContextImpl#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LambdaContextImpl extends SetOperatorImpl implements LambdaContext {
	/**
	 * The cached value of the '{@link #getLambda() <em>Lambda</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLambda()
	 * @generated
	 * @ordered
	 */
	protected LambdaExpression lambda;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LambdaContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.LAMBDA_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaExpression getLambda() {
		return lambda;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLambda(LambdaExpression newLambda, NotificationChain msgs) {
		LambdaExpression oldLambda = lambda;
		lambda = newLambda;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RBACorePackage.LAMBDA_CONTEXT__LAMBDA, oldLambda, newLambda);
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
	public void setLambda(LambdaExpression newLambda) {
		if (newLambda != lambda) {
			NotificationChain msgs = null;
			if (lambda != null)
				msgs = ((InternalEObject) lambda).eInverseRemove(this, RBACorePackage.LAMBDA_EXPRESSION__CONTEXT,
						LambdaExpression.class, msgs);
			if (newLambda != null)
				msgs = ((InternalEObject) newLambda).eInverseAdd(this, RBACorePackage.LAMBDA_EXPRESSION__CONTEXT,
						LambdaExpression.class, msgs);
			msgs = basicSetLambda(newLambda, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACorePackage.LAMBDA_CONTEXT__LAMBDA, newLambda,
					newLambda));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getContextType() {
		if (!getOperand().isEmpty()) {
			rba.core.Expression first = getOperand().get(0);
			if (first.getType() == ExpressionType.SET_OF_CONTENT) {
				return ExpressionType.CONTENT;
			} else if (first.getType() == ExpressionType.SET_OF_AREA) {
				return ExpressionType.AREA;
			} else if (first.getType() == ExpressionType.SET_OF_ZONE) {
				return ExpressionType.ZONE;
			} else if (first.getType() == ExpressionType.SET_OF_SOUND) {
				return ExpressionType.SOUND;
			} else {
				return first.getType();
			}
		}

		return ExpressionType.VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBACorePackage.LAMBDA_CONTEXT__LAMBDA:
			if (lambda != null)
				msgs = ((InternalEObject) lambda).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RBACorePackage.LAMBDA_CONTEXT__LAMBDA, null, msgs);
			return basicSetLambda((LambdaExpression) otherEnd, msgs);
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
		case RBACorePackage.LAMBDA_CONTEXT__LAMBDA:
			return basicSetLambda(null, msgs);
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
		case RBACorePackage.LAMBDA_CONTEXT__LAMBDA:
			return getLambda();
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
		case RBACorePackage.LAMBDA_CONTEXT__LAMBDA:
			setLambda((LambdaExpression) newValue);
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
		case RBACorePackage.LAMBDA_CONTEXT__LAMBDA:
			setLambda((LambdaExpression) null);
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
		case RBACorePackage.LAMBDA_CONTEXT__LAMBDA:
			return lambda != null;
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
		case RBACorePackage.LAMBDA_CONTEXT___GET_CONTEXT_TYPE:
			return getContextType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // LambdaContextImpl
