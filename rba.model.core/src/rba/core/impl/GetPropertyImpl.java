/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.GetProperty;
import rba.core.Operator;
import rba.core.PropertyOperator;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Get Property</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class GetPropertyImpl extends PropertyOperatorImpl implements GetProperty {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GetPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.GET_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".get()";
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
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Expression.class) {
			switch (baseOperationID) {
			case RBACorePackage.EXPRESSION___GET_UNDERLYING_TYPE:
				return RBACorePackage.GET_PROPERTY___GET_UNDERLYING_TYPE;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Operator.class) {
			switch (baseOperationID) {
			case RBACorePackage.OPERATOR___GET_SYMBOL:
				return RBACorePackage.GET_PROPERTY___GET_SYMBOL;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == PropertyOperator.class) {
			switch (baseOperationID) {
			case RBACorePackage.PROPERTY_OPERATOR___GET_UNDERLYING_TYPE:
				return RBACorePackage.GET_PROPERTY___GET_UNDERLYING_TYPE;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
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
		case RBACorePackage.GET_PROPERTY___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.GET_PROPERTY___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // GetPropertyImpl
