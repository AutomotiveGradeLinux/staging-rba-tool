/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.NotOperator;
import rba.core.ObjectCompare;
import rba.core.ObjectCompareNot;
import rba.core.Operator;
import rba.core.RBACoreFactory;
import rba.core.RBACorePackage;
import rba.core.SugarExpression;
import rba.core.SugarExpressionBase;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Object Compare Not</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ObjectCompareNotImpl extends OperatorImpl implements ObjectCompareNot {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectCompareNotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.OBJECT_COMPARE_NOT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return "!=";
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
		StringBuilder expressionText = new StringBuilder();
		EList<rba.core.Expression> expressions = getOperand();
		expressionText.append(expressions.size() > 0 ? expressions.get(0).getExpressionText() : "[Invalid_Expression]");
		expressionText.append(" ");
		expressionText.append(getSymbol());
		expressionText.append(" ");
		expressionText.append(expressions.size() > 1 ? expressions.get(1).getExpressionText() : "[Invalid_Expression]");
		return expressionText.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canExpand() {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression getExpanded() {
		NotOperator not = RBACoreFactory.eINSTANCE.createNotOperator();
		ObjectCompare equal = RBACoreFactory.eINSTANCE.createObjectCompare();
		getOperand().forEach(o -> equal.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(o)));
		not.getOperand().add(equal);
		return not;
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
				return RBACorePackage.OBJECT_COMPARE_NOT___GET_UNDERLYING_TYPE;
			case RBACorePackage.EXPRESSION___GET_EXPRESSION_TEXT:
				return RBACorePackage.OBJECT_COMPARE_NOT___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Operator.class) {
			switch (baseOperationID) {
			case RBACorePackage.OPERATOR___GET_SYMBOL:
				return RBACorePackage.OBJECT_COMPARE_NOT___GET_SYMBOL;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SugarExpression.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION___CAN_EXPAND:
				return RBACorePackage.OBJECT_COMPARE_NOT___CAN_EXPAND;
			case RBACorePackage.SUGAR_EXPRESSION___GET_EXPANDED:
				return RBACorePackage.OBJECT_COMPARE_NOT___GET_EXPANDED;
			default:
				return -1;
			}
		}
		if (baseClass == SugarExpressionBase.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION_BASE___CAN_EXPAND:
				return RBACorePackage.OBJECT_COMPARE_NOT___CAN_EXPAND;
			default:
				return -1;
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
		case RBACorePackage.OBJECT_COMPARE_NOT___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.OBJECT_COMPARE_NOT___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBACorePackage.OBJECT_COMPARE_NOT___GET_EXPRESSION_TEXT:
			return getExpressionText();
		case RBACorePackage.OBJECT_COMPARE_NOT___CAN_EXPAND:
			return canExpand();
		case RBACorePackage.OBJECT_COMPARE_NOT___GET_EXPANDED:
			return getExpanded();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ObjectCompareNotImpl
