/**
 */
package rba.sound.impl;

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
import rba.sound.IsChangedOutput;
import rba.sound.IsOutputted;
import rba.sound.OutputtingSound;
import rba.sound.RBASoundFactory;
import rba.sound.RBASoundPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Is Changed Output</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class IsChangedOutputImpl extends ZoneOperatorImpl implements IsChangedOutput {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IsChangedOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBASoundPackage.Literals.IS_CHANGED_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".isChangedOutput()";
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
		OutputtingSound outSound = RBASoundFactory.eINSTANCE.createOutputtingSound();
		PreviousModifier pre = RBACoreFactory.eINSTANCE.createPreviousModifier();
		OrOperator leftOr = RBACoreFactory.eINSTANCE.createOrOperator();
		NotOperator leftnot = RBACoreFactory.eINSTANCE.createNotOperator();
		AndOperator and = RBACoreFactory.eINSTANCE.createAndOperator();
		IsOutputted outputted = RBASoundFactory.eINSTANCE.createIsOutputted();

		pre.setObjReference((ObjectReference) org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		outSound.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(pre));
		equal.getOperand().add(outSound);
		outSound = RBASoundFactory.eINSTANCE.createOutputtingSound();
		outSound.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		equal.getOperand().add(outSound);
		not.getOperand().add(equal);

		outputted.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(pre));
		and.getOperand().add(outputted);
		outputted = RBASoundFactory.eINSTANCE.createIsOutputted();
		outputted.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		leftnot.getOperand().add(outputted);
		and.getOperand().add(leftnot);
		leftOr.getOperand().add(and);

		leftnot = RBACoreFactory.eINSTANCE.createNotOperator();
		outputted = RBASoundFactory.eINSTANCE.createIsOutputted();
		outputted.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(pre));
		leftnot.getOperand().add(outputted);
		outputted = RBASoundFactory.eINSTANCE.createIsOutputted();
		outputted.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		and = RBACoreFactory.eINSTANCE.createAndOperator();
		and.getOperand().add(leftnot);
		and.getOperand().add(outputted);
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
				return RBASoundPackage.IS_CHANGED_OUTPUT___GET_UNDERLYING_TYPE;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Operator.class) {
			switch (baseOperationID) {
			case RBACorePackage.OPERATOR___GET_SYMBOL:
				return RBASoundPackage.IS_CHANGED_OUTPUT___GET_SYMBOL;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SugarExpression.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION___CAN_EXPAND:
				return RBASoundPackage.IS_CHANGED_OUTPUT___CAN_EXPAND;
			case RBACorePackage.SUGAR_EXPRESSION___GET_EXPANDED:
				return RBASoundPackage.IS_CHANGED_OUTPUT___GET_EXPANDED;
			default:
				return -1;
			}
		}
		if (baseClass == SugarExpressionBase.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION_BASE___CAN_EXPAND:
				return RBASoundPackage.IS_CHANGED_OUTPUT___CAN_EXPAND;
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
		case RBASoundPackage.IS_CHANGED_OUTPUT___GET_SYMBOL:
			return getSymbol();
		case RBASoundPackage.IS_CHANGED_OUTPUT___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBASoundPackage.IS_CHANGED_OUTPUT___CAN_EXPAND:
			return canExpand();
		case RBASoundPackage.IS_CHANGED_OUTPUT___GET_EXPANDED:
			return getExpanded();
		}
		return super.eInvoke(operationID, arguments);
	}

} // IsChangedOutputImpl
