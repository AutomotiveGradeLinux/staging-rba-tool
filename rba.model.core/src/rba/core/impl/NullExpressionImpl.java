/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ExpressionType;
import rba.core.NullExpression;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Null Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NullExpressionImpl extends ExpressionImpl implements NullExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NullExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.NULL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		return ExpressionType.NULL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionText() {
		return "NULL";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.NULL_EXPRESSION___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBACorePackage.NULL_EXPRESSION___GET_EXPRESSION_TEXT:
			return getExpressionText();
		}
		return super.eInvoke(operationID, arguments);
	}

} //NullExpressionImpl
