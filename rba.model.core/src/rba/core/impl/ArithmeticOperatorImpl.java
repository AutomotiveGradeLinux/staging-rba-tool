/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ArithmeticOperator;
import rba.core.ExpressionType;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Arithmetic Operator</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ArithmeticOperatorImpl extends OperatorImpl implements ArithmeticOperator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.ARITHMETIC_OPERATOR;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.ARITHMETIC_OPERATOR___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBACorePackage.ARITHMETIC_OPERATOR___GET_EXPRESSION_TEXT:
			return getExpressionText();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ArithmeticOperatorImpl
