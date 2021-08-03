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

import org.eclipse.emf.ecore.util.EcoreUtil;
import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.LambdaContext;
import rba.core.LambdaExpression;
import rba.core.RBACorePackage;
import rba.core.Variable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Lambda Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rba.core.impl.LambdaExpressionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link rba.core.impl.LambdaExpressionImpl#getX <em>X</em>}</li>
 *   <li>{@link rba.core.impl.LambdaExpressionImpl#getBodyText <em>Body Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LambdaExpressionImpl extends ExpressionImpl implements LambdaExpression {
	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Variable x;

	/**
	 * The cached value of the '{@link #getBodyText() <em>Body Text</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBodyText()
	 * @generated
	 * @ordered
	 */
	protected Expression bodyText;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LambdaExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.LAMBDA_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaContext getContext() {
		if (eContainerFeatureID() != RBACorePackage.LAMBDA_EXPRESSION__CONTEXT)
			return null;
		return (LambdaContext) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(LambdaContext newContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContext, RBACorePackage.LAMBDA_EXPRESSION__CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(LambdaContext newContext) {
		if (newContext != eInternalContainer()
				|| (eContainerFeatureID() != RBACorePackage.LAMBDA_EXPRESSION__CONTEXT && newContext != null)) {
			if (EcoreUtil.isAncestor(this, newContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContext != null)
				msgs = ((InternalEObject) newContext).eInverseAdd(this, RBACorePackage.LAMBDA_CONTEXT__LAMBDA,
						LambdaContext.class, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACorePackage.LAMBDA_EXPRESSION__CONTEXT, newContext,
					newContext));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX(Variable newX, NotificationChain msgs) {
		Variable oldX = x;
		x = newX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RBACorePackage.LAMBDA_EXPRESSION__X, oldX, newX);
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
	public void setX(Variable newX) {
		if (newX != x) {
			NotificationChain msgs = null;
			if (x != null)
				msgs = ((InternalEObject) x).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RBACorePackage.LAMBDA_EXPRESSION__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RBACorePackage.LAMBDA_EXPRESSION__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACorePackage.LAMBDA_EXPRESSION__X, newX, newX));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression getBodyText() {
		if (bodyText != null)
			bodyText.getLetStatements().addAll(getLetStatements());
		return bodyText;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodyText(Expression newBodyText, NotificationChain msgs) {
		Expression oldBodyText = bodyText;
		bodyText = newBodyText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RBACorePackage.LAMBDA_EXPRESSION__BODY_TEXT, oldBodyText, newBodyText);
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
	public void setBodyText(Expression newBodyText) {
		if (newBodyText != bodyText) {
			NotificationChain msgs = null;
			if (bodyText != null)
				msgs = ((InternalEObject) bodyText).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RBACorePackage.LAMBDA_EXPRESSION__BODY_TEXT, null, msgs);
			if (newBodyText != null)
				msgs = ((InternalEObject) newBodyText).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RBACorePackage.LAMBDA_EXPRESSION__BODY_TEXT, null, msgs);
			msgs = basicSetBodyText(newBodyText, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACorePackage.LAMBDA_EXPRESSION__BODY_TEXT,
					newBodyText, newBodyText));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionText() {
		StringBuilder expressionText = new StringBuilder();
		expressionText.append("{ ");
		expressionText.append(x != null ? x.getName() : "[Invalid_Expression]");
		expressionText.append(" | ");
		getLetStatements().forEach(let -> expressionText.append(let));
		expressionText.append(bodyText != null ? bodyText.getExpressionText() : "[Invalid_Expression]");
		expressionText.append(" }");
		return expressionText.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		return ExpressionType.LAMBDA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RBACorePackage.LAMBDA_EXPRESSION__CONTEXT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContext((LambdaContext) otherEnd, msgs);
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
		case RBACorePackage.LAMBDA_EXPRESSION__CONTEXT:
			return basicSetContext(null, msgs);
		case RBACorePackage.LAMBDA_EXPRESSION__X:
			return basicSetX(null, msgs);
		case RBACorePackage.LAMBDA_EXPRESSION__BODY_TEXT:
			return basicSetBodyText(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case RBACorePackage.LAMBDA_EXPRESSION__CONTEXT:
			return eInternalContainer().eInverseRemove(this, RBACorePackage.LAMBDA_CONTEXT__LAMBDA, LambdaContext.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RBACorePackage.LAMBDA_EXPRESSION__CONTEXT:
			return getContext();
		case RBACorePackage.LAMBDA_EXPRESSION__X:
			return getX();
		case RBACorePackage.LAMBDA_EXPRESSION__BODY_TEXT:
			return getBodyText();
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
		case RBACorePackage.LAMBDA_EXPRESSION__CONTEXT:
			setContext((LambdaContext) newValue);
			return;
		case RBACorePackage.LAMBDA_EXPRESSION__X:
			setX((Variable) newValue);
			return;
		case RBACorePackage.LAMBDA_EXPRESSION__BODY_TEXT:
			setBodyText((Expression) newValue);
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
		case RBACorePackage.LAMBDA_EXPRESSION__CONTEXT:
			setContext((LambdaContext) null);
			return;
		case RBACorePackage.LAMBDA_EXPRESSION__X:
			setX((Variable) null);
			return;
		case RBACorePackage.LAMBDA_EXPRESSION__BODY_TEXT:
			setBodyText((Expression) null);
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
		case RBACorePackage.LAMBDA_EXPRESSION__CONTEXT:
			return getContext() != null;
		case RBACorePackage.LAMBDA_EXPRESSION__X:
			return x != null;
		case RBACorePackage.LAMBDA_EXPRESSION__BODY_TEXT:
			return bodyText != null;
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
		case RBACorePackage.LAMBDA_EXPRESSION___GET_EXPRESSION_TEXT:
			return getExpressionText();
		case RBACorePackage.LAMBDA_EXPRESSION___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // LambdaExpressionImpl
