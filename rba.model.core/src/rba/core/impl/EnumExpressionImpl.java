/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;

import rba.core.EnumExpression;
import rba.core.ExpressionType;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Enum Expression</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EnumExpressionImpl extends ExpressionImpl implements EnumExpression {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.ENUM_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		return ExpressionType.ENUM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getExpressionValue() {
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
		case RBACorePackage.ENUM_EXPRESSION___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBACorePackage.ENUM_EXPRESSION___GET_EXPRESSION_VALUE:
			return getExpressionValue();
		case RBACorePackage.ENUM_EXPRESSION___GET_TYPE:
			return getType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // EnumExpressionImpl
