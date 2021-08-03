/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ExpressionType;
import rba.core.ForAllOperator;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>For All Operator</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ForAllOperatorImpl extends LambdaContextImpl implements ForAllOperator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ForAllOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.FOR_ALL_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionText() {
		StringBuffer expressionText = new StringBuffer();
		EList<rba.core.Expression> expressions = getOperand();
		rba.core.LambdaExpression lambda = getLambda();
		expressionText.append(getSymbol());
		expressionText.append(" ");
		expressionText.append(expressions.size() > 0 ? expressions.get(0).getExpressionText() : "[Invalid_Expression]");
		expressionText.append(" ");
		expressionText.append(lambda != null ? lambda.getExpressionText() : "[Invalid_Expression]");
		return expressionText.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return "For All";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		rba.core.LambdaExpression lambda = getLambda();
		if (lambda != null && lambda.getBodyText() != null) {
			return lambda.getBodyText().getUnderlyingType();
		}
		return ExpressionType.BOOLEAN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.FOR_ALL_OPERATOR___GET_EXPRESSION_TEXT:
			return getExpressionText();
		case RBACorePackage.FOR_ALL_OPERATOR___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.FOR_ALL_OPERATOR___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ForAllOperatorImpl
