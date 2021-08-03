/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.IsGreaterThanOperator;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Is Greater Than Operator</b></em>'. <!-- end-user-doc
 * -->
 * @generated
 */
public class IsGreaterThanOperatorImpl extends LogicalOperatorImpl implements IsGreaterThanOperator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IsGreaterThanOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.IS_GREATER_THAN_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ">";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.IS_GREATER_THAN_OPERATOR___GET_SYMBOL:
			return getSymbol();
		}
		return super.eInvoke(operationID, arguments);
	}

} // IsGreaterThanOperatorImpl
