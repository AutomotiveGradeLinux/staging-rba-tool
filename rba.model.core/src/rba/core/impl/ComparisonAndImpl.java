/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ComparisonAnd;
import rba.core.ComparisonOperator;
import rba.core.Expression;
import rba.core.Operator;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Comparison And</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ComparisonAndImpl extends ComparisonOperatorImpl implements ComparisonAnd {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonAndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.COMPARISON_AND;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return "and";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionText() {
		StringBuffer expressionText = new StringBuffer();
		EList<rba.core.Expression> expressions = getOperand();
		expressionText.append("(");
		for (int i = 0; i < expressions.size(); i++) {
			rba.core.Expression expression = expressions.get(i);
			expressionText.append(expression.getExpressionText());
			if (i == expressions.size() - 1) {
				expressionText.append(")");
			} else {
				expressionText.append(" ");
				expressionText.append(getSymbol());
				expressionText.append(" ");
			}
		}
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
				return RBACorePackage.COMPARISON_AND___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Operator.class) {
			switch (baseOperationID) {
			case RBACorePackage.OPERATOR___GET_SYMBOL:
				return RBACorePackage.COMPARISON_AND___GET_SYMBOL;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ComparisonOperator.class) {
			switch (baseOperationID) {
			case RBACorePackage.COMPARISON_OPERATOR___GET_EXPRESSION_TEXT:
				return RBACorePackage.COMPARISON_AND___GET_EXPRESSION_TEXT;
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
		case RBACorePackage.COMPARISON_AND___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.COMPARISON_AND___GET_EXPRESSION_TEXT:
			return getExpressionText();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ComparisonAndImpl
