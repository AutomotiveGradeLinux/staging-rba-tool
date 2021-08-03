/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.IsGreaterThanEqualOperator;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Is Greater Than Equal Operator</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class IsGreaterThanEqualOperatorImpl extends LogicalOperatorImpl implements IsGreaterThanEqualOperator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IsGreaterThanEqualOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.IS_GREATER_THAN_EQUAL_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ">=";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.IS_GREATER_THAN_EQUAL_OPERATOR___GET_SYMBOL:
			return getSymbol();
		}
		return super.eInvoke(operationID, arguments);
	}

} // IsGreaterThanEqualOperatorImpl
