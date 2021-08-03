/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ExpressionType;
import rba.core.RBACorePackage;
import rba.core.ValueExpression;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Value Expression</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ValueExpressionImpl extends ExpressionImpl implements ValueExpression {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.VALUE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		return ExpressionType.VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpressionValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.VALUE_EXPRESSION___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBACorePackage.VALUE_EXPRESSION___GET_EXPRESSION_VALUE:
			return getExpressionValue();
		case RBACorePackage.VALUE_EXPRESSION___GET_TYPE:
			return getType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ValueExpressionImpl
