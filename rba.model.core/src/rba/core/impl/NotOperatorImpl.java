/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.Expression;
import rba.core.LogicalOperator;
import rba.core.NotOperator;
import rba.core.Operator;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Not Operator</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class NotOperatorImpl extends LogicalOperatorImpl implements NotOperator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NotOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.NOT_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return "!";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionText() {
		StringBuilder expressionText = new StringBuilder();
		EList<rba.core.Expression> expressions = getOperand();
		expressionText.append(getSymbol());
		expressionText.append("(");
		expressionText.append(expressions.size() > 0 ? expressions.get(0).getExpressionText() : "[Invalid_Expression]");
		expressionText.append(")");
		return expressionText.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Expression.class) {
			switch (baseOperationID) {
			case RBACorePackage.EXPRESSION___GET_EXPRESSION_TEXT:
				return RBACorePackage.NOT_OPERATOR___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Operator.class) {
			switch (baseOperationID) {
			case RBACorePackage.OPERATOR___GET_SYMBOL:
				return RBACorePackage.NOT_OPERATOR___GET_SYMBOL;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == LogicalOperator.class) {
			switch (baseOperationID) {
			case RBACorePackage.LOGICAL_OPERATOR___GET_EXPRESSION_TEXT:
				return RBACorePackage.NOT_OPERATOR___GET_EXPRESSION_TEXT;
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
		case RBACorePackage.NOT_OPERATOR___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.NOT_OPERATOR___GET_EXPRESSION_TEXT:
			return getExpressionText();
		}
		return super.eInvoke(operationID, arguments);
	}

} // NotOperatorImpl
