/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ExpressionType;
import rba.core.RBACorePackage;
import rba.core.SetOfOperator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Set Of Operator</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class SetOfOperatorImpl extends OperatorImpl implements SetOfOperator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SetOfOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.SET_OF_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionText() {
		StringBuffer expressionText = new StringBuffer();
		EList<rba.core.Expression> expressions = getOperand();
		expressionText.append("{");
		for (int i = 0; i < expressions.size(); i++) {
			rba.core.Expression expression = expressions.get(i);
			expressionText.append(expression.getExpressionText());
			if (i == expressions.size() - 1) {
				expressionText.append("}");
			} else {
				expressionText.append(", ");
			}
		}
		return expressionText.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return "";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		EList<rba.core.Expression> expressions = getOperand();
		if (!expressions.isEmpty() && expressions.get(0) != null) {
			rba.core.Expression first = expressions.get(0);
			if ((first.getType() == ExpressionType.CONTENT) || (first.getType() == ExpressionType.SET_OF_CONTENT)) {
				return ExpressionType.SET_OF_CONTENT;
			} else if ((first.getType() == ExpressionType.AREA) || (first.getType() == ExpressionType.SET_OF_AREA)) {
				return ExpressionType.SET_OF_AREA;
			} else if ((first.getType() == ExpressionType.SOUND) || (first.getType() == ExpressionType.SET_OF_SOUND)) {
				return ExpressionType.SET_OF_SOUND;
			} else if ((first.getType() == ExpressionType.ZONE) || (first.getType() == ExpressionType.SET_OF_ZONE)) {
				return ExpressionType.SET_OF_ZONE;
			} else {
				return first.getType();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.SET_OF_OPERATOR___GET_EXPRESSION_TEXT:
			return getExpressionText();
		case RBACorePackage.SET_OF_OPERATOR___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.SET_OF_OPERATOR___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		}
		return super.eInvoke(operationID, arguments);
	}

} // SetOfOperatorImpl
