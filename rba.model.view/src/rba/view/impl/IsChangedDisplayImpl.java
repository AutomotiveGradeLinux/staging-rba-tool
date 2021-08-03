/**
 */
package rba.view.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

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
import rba.view.IsChangedDisplay;
import rba.view.IsDisplayed;
import rba.view.RBAViewFactory;
import rba.view.RBAViewPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Is Changed Display</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class IsChangedDisplayImpl extends AreaOperatorImpl implements IsChangedDisplay {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IsChangedDisplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBAViewPackage.Literals.IS_CHANGED_DISPLAY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".isChangedDisplay()";
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
	public boolean canExpand() {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression getExpanded() {
		OrOperator or = RBACoreFactory.eINSTANCE.createOrOperator();
		NotOperator not = RBACoreFactory.eINSTANCE.createNotOperator();
		ObjectCompare equal = RBACoreFactory.eINSTANCE.createObjectCompare();
		DisplayingContent dispContent = RBAViewFactory.eINSTANCE.createDisplayingContent();
		PreviousModifier pre = RBACoreFactory.eINSTANCE.createPreviousModifier();
		OrOperator leftOr = RBACoreFactory.eINSTANCE.createOrOperator();
		NotOperator leftnot = RBACoreFactory.eINSTANCE.createNotOperator();
		AndOperator and = RBACoreFactory.eINSTANCE.createAndOperator();
		IsDisplayed isDisplayed = RBAViewFactory.eINSTANCE.createIsDisplayed();

		pre.setObjReference((ObjectReference) org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		dispContent.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(pre));
		equal.getOperand().add(dispContent);
		dispContent = RBAViewFactory.eINSTANCE.createDisplayingContent();
		dispContent.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		equal.getOperand().add(dispContent);
		not.getOperand().add(equal);

		isDisplayed.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(pre));
		and.getOperand().add(isDisplayed);
		isDisplayed = RBAViewFactory.eINSTANCE.createIsDisplayed();
		isDisplayed.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		leftnot.getOperand().add(isDisplayed);
		and.getOperand().add(leftnot);
		leftOr.getOperand().add(and);

		leftnot = RBACoreFactory.eINSTANCE.createNotOperator();
		isDisplayed = RBAViewFactory.eINSTANCE.createIsDisplayed();
		isDisplayed.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(pre));
		leftnot.getOperand().add(isDisplayed);
		isDisplayed = RBAViewFactory.eINSTANCE.createIsDisplayed();
		isDisplayed.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		and = RBACoreFactory.eINSTANCE.createAndOperator();
		and.getOperand().add(leftnot);
		and.getOperand().add(isDisplayed);
		leftOr.getOperand().add(and);

		or.getOperand().add(not);
		or.getOperand().add(leftOr);

		return or;
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
				return RBAViewPackage.IS_CHANGED_DISPLAY___GET_UNDERLYING_TYPE;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Operator.class) {
			switch (baseOperationID) {
			case RBACorePackage.OPERATOR___GET_SYMBOL:
				return RBAViewPackage.IS_CHANGED_DISPLAY___GET_SYMBOL;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SugarExpression.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION___CAN_EXPAND:
				return RBAViewPackage.IS_CHANGED_DISPLAY___CAN_EXPAND;
			case RBACorePackage.SUGAR_EXPRESSION___GET_EXPANDED:
				return RBAViewPackage.IS_CHANGED_DISPLAY___GET_EXPANDED;
			default:
				return -1;
			}
		}
		if (baseClass == SugarExpressionBase.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION_BASE___CAN_EXPAND:
				return RBAViewPackage.IS_CHANGED_DISPLAY___CAN_EXPAND;
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
		case RBAViewPackage.IS_CHANGED_DISPLAY___GET_SYMBOL:
			return getSymbol();
		case RBAViewPackage.IS_CHANGED_DISPLAY___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBAViewPackage.IS_CHANGED_DISPLAY___CAN_EXPAND:
			return canExpand();
		case RBAViewPackage.IS_CHANGED_DISPLAY___GET_EXPANDED:
			return getExpanded();
		}
		return super.eInvoke(operationID, arguments);
	}

} // IsChangedDisplayImpl
