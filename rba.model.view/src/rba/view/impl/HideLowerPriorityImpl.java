/**
 */
package rba.view.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import rba.core.AndOperator;
import rba.core.ContentValue;
import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.ImpliesOperator;
import rba.core.IsGreaterThanOperator;
import rba.core.IsLowerThanOperator;
import rba.core.Operator;
import rba.core.RBACoreFactory;
import rba.core.RBACorePackage;
import rba.core.SugarExpression;
import rba.core.SugarExpressionBase;
import rba.core.impl.OperatorImpl;
import rba.view.HideLowerPriority;
import rba.view.IsHidden;
import rba.view.RBAViewFactory;
import rba.view.RBAViewPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Hide Lower Priority</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class HideLowerPriorityImpl extends OperatorImpl implements HideLowerPriority {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HideLowerPriorityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBAViewPackage.Literals.HIDE_LOWER_PRIORITY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return "HideLowerPriority";
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
		expressionText.append(getSymbol());
		expressionText.append("(");
		expressionText.append(expressions.size() > 0 ? expressions.get(0).getExpressionText() : "[Invalid_Expression]");
		expressionText.append(",");
		expressionText.append(expressions.size() > 1 ? expressions.get(1).getExpressionText() : "[Invalid_Expression]");
		expressionText.append(")");
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
		AndOperator AND = RBACoreFactory.eINSTANCE.createAndOperator();
		ImpliesOperator implies = RBACoreFactory.eINSTANCE.createImpliesOperator();
		IsLowerThanOperator lowerThan = RBACoreFactory.eINSTANCE.createIsLowerThanOperator();
		ContentValue contentValue1 = RBACoreFactory.eINSTANCE.createContentValue();
		ContentValue contentValue2 = RBACoreFactory.eINSTANCE.createContentValue();
		IsHidden hidden = RBAViewFactory.eINSTANCE.createIsHidden();
		IsGreaterThanOperator greaterThan = RBACoreFactory.eINSTANCE.createIsGreaterThanOperator();

		contentValue1.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		contentValue2.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(1)));
		lowerThan.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(contentValue1));
		lowerThan.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(contentValue2));
		implies.getOperand().add(lowerThan);
		hidden.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		implies.getOperand().add(hidden);
		AND.getOperand().add(implies);

		implies = RBACoreFactory.eINSTANCE.createImpliesOperator();
		greaterThan.getOperand().add(contentValue1);
		greaterThan.getOperand().add(contentValue2);
		implies.getOperand().add(greaterThan);

		hidden = RBAViewFactory.eINSTANCE.createIsHidden();
		hidden.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(1)));
		implies.getOperand().add(hidden);
		AND.getOperand().add(implies);

		return AND;
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
				return RBAViewPackage.HIDE_LOWER_PRIORITY___GET_UNDERLYING_TYPE;
			case RBACorePackage.EXPRESSION___GET_EXPRESSION_TEXT:
				return RBAViewPackage.HIDE_LOWER_PRIORITY___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Operator.class) {
			switch (baseOperationID) {
			case RBACorePackage.OPERATOR___GET_SYMBOL:
				return RBAViewPackage.HIDE_LOWER_PRIORITY___GET_SYMBOL;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SugarExpression.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION___CAN_EXPAND:
				return RBAViewPackage.HIDE_LOWER_PRIORITY___CAN_EXPAND;
			case RBACorePackage.SUGAR_EXPRESSION___GET_EXPANDED:
				return RBAViewPackage.HIDE_LOWER_PRIORITY___GET_EXPANDED;
			default:
				return -1;
			}
		}
		if (baseClass == SugarExpressionBase.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION_BASE___CAN_EXPAND:
				return RBAViewPackage.HIDE_LOWER_PRIORITY___CAN_EXPAND;
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
		case RBAViewPackage.HIDE_LOWER_PRIORITY___GET_SYMBOL:
			return getSymbol();
		case RBAViewPackage.HIDE_LOWER_PRIORITY___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBAViewPackage.HIDE_LOWER_PRIORITY___GET_EXPRESSION_TEXT:
			return getExpressionText();
		case RBAViewPackage.HIDE_LOWER_PRIORITY___CAN_EXPAND:
			return canExpand();
		case RBAViewPackage.HIDE_LOWER_PRIORITY___GET_EXPANDED:
			return getExpanded();
		}
		return super.eInvoke(operationID, arguments);
	}

} // HideLowerPriorityImpl
