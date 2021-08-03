/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.AllocatedContent;
import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.IsChanged;
import rba.core.NotOperator;
import rba.core.ObjectCompare;
import rba.core.ObjectReference;
import rba.core.Operator;
import rba.core.PreviousModifier;
import rba.core.RBACoreFactory;
import rba.core.RBACorePackage;
import rba.core.SugarExpression;
import rba.core.SugarExpressionBase;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Is Changed</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class IsChangedImpl extends AllocatableOperatorImpl implements IsChanged {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IsChangedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.IS_CHANGED;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".isChanged()";
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
		NotOperator not = RBACoreFactory.eINSTANCE.createNotOperator();
		ObjectCompare equal = RBACoreFactory.eINSTANCE.createObjectCompare();
		AllocatedContent content = RBACoreFactory.eINSTANCE.createAllocatedContent();
		PreviousModifier preModifier = RBACoreFactory.eINSTANCE.createPreviousModifier();

		preModifier.setObjReference((ObjectReference) org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		content.getOperand().add(preModifier);
		equal.getOperand().add(content);

		content = RBACoreFactory.eINSTANCE.createAllocatedContent();
		content.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));

		equal.getOperand().add(content);
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
				return RBACorePackage.IS_CHANGED___GET_UNDERLYING_TYPE;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Operator.class) {
			switch (baseOperationID) {
			case RBACorePackage.OPERATOR___GET_SYMBOL:
				return RBACorePackage.IS_CHANGED___GET_SYMBOL;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SugarExpression.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION___CAN_EXPAND:
				return RBACorePackage.IS_CHANGED___CAN_EXPAND;
			case RBACorePackage.SUGAR_EXPRESSION___GET_EXPANDED:
				return RBACorePackage.IS_CHANGED___GET_EXPANDED;
			default:
				return -1;
			}
		}
		if (baseClass == SugarExpressionBase.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION_BASE___CAN_EXPAND:
				return RBACorePackage.IS_CHANGED___CAN_EXPAND;
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
		case RBACorePackage.IS_CHANGED___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.IS_CHANGED___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBACorePackage.IS_CHANGED___CAN_EXPAND:
			return canExpand();
		case RBACorePackage.IS_CHANGED___GET_EXPANDED:
			return getExpanded();
		}
		return super.eInvoke(operationID, arguments);
	}

} // IsChangedImpl
