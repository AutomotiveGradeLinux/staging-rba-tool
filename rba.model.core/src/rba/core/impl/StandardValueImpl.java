/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.RBACorePackage;
import rba.core.StandardValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Standard Value</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class StandardValueImpl extends ValueExpressionImpl implements StandardValue {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.STANDARD_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionText() {
		return "STANDARD";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpressionValue() {
		return 10;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.STANDARD_VALUE___GET_EXPRESSION_TEXT:
			return getExpressionText();
		case RBACorePackage.STANDARD_VALUE___GET_EXPRESSION_VALUE:
			return getExpressionValue();
		}
		return super.eInvoke(operationID, arguments);
	}

} // StandardValueImpl
