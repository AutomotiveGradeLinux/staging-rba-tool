/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ContentOperator;
import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.HasComeLaterThan;
import rba.core.Operator;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Has Come Later Than</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class HasComeLaterThanImpl extends ContentOperatorImpl implements HasComeLaterThan {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HasComeLaterThanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.HAS_COME_LATER_THAN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".hasComeLaterThan"; //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType getUnderlyingType() {
		return ExpressionType.BOOLEAN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionText() {
		StringBuffer expressionText = new StringBuffer();
		EList<rba.core.Expression> expressions = getOperand();
		expressionText.append(expressions.size() > 0 ? expressions.get(0).getExpressionText() : "[Invalid_Expression]");
		expressionText.append(getSymbol());
		expressionText.append("(");
		expressionText.append(expressions.size() > 1 ? expressions.get(1).getExpressionText() : "[Invalid_Expression]");
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
			case RBACorePackage.EXPRESSION___GET_UNDERLYING_TYPE:
				return RBACorePackage.HAS_COME_LATER_THAN___GET_UNDERLYING_TYPE;
			case RBACorePackage.EXPRESSION___GET_EXPRESSION_TEXT:
				return RBACorePackage.HAS_COME_LATER_THAN___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Operator.class) {
			switch (baseOperationID) {
			case RBACorePackage.OPERATOR___GET_SYMBOL:
				return RBACorePackage.HAS_COME_LATER_THAN___GET_SYMBOL;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ContentOperator.class) {
			switch (baseOperationID) {
			case RBACorePackage.CONTENT_OPERATOR___GET_EXPRESSION_TEXT:
				return RBACorePackage.HAS_COME_LATER_THAN___GET_EXPRESSION_TEXT;
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
		case RBACorePackage.HAS_COME_LATER_THAN___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.HAS_COME_LATER_THAN___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBACorePackage.HAS_COME_LATER_THAN___GET_EXPRESSION_TEXT:
			return getExpressionText();
		}
		return super.eInvoke(operationID, arguments);
	}

} // HasComeLaterThanImpl
