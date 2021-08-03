/**
 */
package rba.view.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import rba.core.AllocatableOperator;
import rba.core.AndOperator;
import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.NotOperator;
import rba.core.ObjectCompare;
import rba.core.ObjectReference;
import rba.core.Operator;
import rba.core.OrOperator;
import rba.core.PreviousModifier;
import rba.core.RBACoreFactory;
import rba.core.RBACorePackage;
import rba.core.SugarExpression;
import rba.core.SugarExpressionBase;
import rba.view.DisplayingContent;
import rba.view.IsDisplayed;
import rba.view.IsTranslatedViewTo;
import rba.view.RBAViewFactory;
import rba.view.RBAViewPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Is Translated View To</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class IsTranslatedViewToImpl extends AreaOperatorImpl implements IsTranslatedViewTo {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IsTranslatedViewToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBAViewPackage.Literals.IS_TRANSLATED_VIEW_TO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".isTranslatedViewTo";
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
	public boolean canExpand() {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression getExpanded() {
		AndOperator AND = RBACoreFactory.eINSTANCE.createAndOperator();
		IsDisplayed isDisplayed = RBAViewFactory.eINSTANCE.createIsDisplayed();
		ObjectCompare equal = RBACoreFactory.eINSTANCE.createObjectCompare();
		DisplayingContent dispContent = RBAViewFactory.eINSTANCE.createDisplayingContent();
		PreviousModifier pre = RBACoreFactory.eINSTANCE.createPreviousModifier();
		OrOperator or = RBACoreFactory.eINSTANCE.createOrOperator();
		NotOperator not = RBACoreFactory.eINSTANCE.createNotOperator();

		isDisplayed.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		AND.getOperand().add(isDisplayed);

		dispContent.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		equal.getOperand().add(dispContent);
		equal.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(1)));
		AND.getOperand().add(equal);

		pre.setObjReference((ObjectReference) org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		dispContent = RBAViewFactory.eINSTANCE.createDisplayingContent();
		dispContent.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(pre));
		equal = RBACoreFactory.eINSTANCE.createObjectCompare();
		equal.getOperand().add(dispContent);
		equal.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(1)));
		not.getOperand().add(equal);
		or.getOperand().add(not);

		isDisplayed = RBAViewFactory.eINSTANCE.createIsDisplayed();
		isDisplayed.getOperand().add(pre);
		not = RBACoreFactory.eINSTANCE.createNotOperator();
		not.getOperand().add(isDisplayed);
		or.getOperand().add(not);
		AND.getOperand().add(or);
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
				return RBAViewPackage.IS_TRANSLATED_VIEW_TO___GET_UNDERLYING_TYPE;
			case RBACorePackage.EXPRESSION___GET_EXPRESSION_TEXT:
				return RBAViewPackage.IS_TRANSLATED_VIEW_TO___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Operator.class) {
			switch (baseOperationID) {
			case RBACorePackage.OPERATOR___GET_SYMBOL:
				return RBAViewPackage.IS_TRANSLATED_VIEW_TO___GET_SYMBOL;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == AllocatableOperator.class) {
			switch (baseOperationID) {
			case RBACorePackage.ALLOCATABLE_OPERATOR___GET_EXPRESSION_TEXT:
				return RBAViewPackage.IS_TRANSLATED_VIEW_TO___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SugarExpression.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION___CAN_EXPAND:
				return RBAViewPackage.IS_TRANSLATED_VIEW_TO___CAN_EXPAND;
			case RBACorePackage.SUGAR_EXPRESSION___GET_EXPANDED:
				return RBAViewPackage.IS_TRANSLATED_VIEW_TO___GET_EXPANDED;
			default:
				return -1;
			}
		}
		if (baseClass == SugarExpressionBase.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION_BASE___CAN_EXPAND:
				return RBAViewPackage.IS_TRANSLATED_VIEW_TO___CAN_EXPAND;
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
		case RBAViewPackage.IS_TRANSLATED_VIEW_TO___GET_SYMBOL:
			return getSymbol();
		case RBAViewPackage.IS_TRANSLATED_VIEW_TO___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBAViewPackage.IS_TRANSLATED_VIEW_TO___GET_EXPRESSION_TEXT:
			return getExpressionText();
		case RBAViewPackage.IS_TRANSLATED_VIEW_TO___CAN_EXPAND:
			return canExpand();
		case RBAViewPackage.IS_TRANSLATED_VIEW_TO___GET_EXPANDED:
			return getExpanded();
		}
		return super.eInvoke(operationID, arguments);
	}

} // IsTranslatedViewToImpl
