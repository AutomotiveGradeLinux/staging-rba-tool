/**
 */
package rba.sound.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.AndOperator;
import rba.core.ContentOperator;
import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.ObjectCompare;
import rba.core.Operator;
import rba.core.RBACoreFactory;
import rba.core.RBACorePackage;
import rba.core.SugarExpression;
import rba.core.SugarExpressionBase;
import rba.sound.IsOutputted;
import rba.sound.IsOutputtedOn;
import rba.sound.OutputtingSound;
import rba.sound.RBASoundFactory;
import rba.sound.RBASoundPackage;
import rba.sound.SoundContentOperator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Is Outputted On</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class IsOutputtedOnImpl extends SoundContentOperatorImpl implements IsOutputtedOn {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IsOutputtedOnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBASoundPackage.Literals.IS_OUTPUTTED_ON;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".isOutputtedOn";
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
		IsOutputted isOutputted = RBASoundFactory.eINSTANCE.createIsOutputted();
		ObjectCompare equal = RBACoreFactory.eINSTANCE.createObjectCompare();
		OutputtingSound outputtingSound = RBASoundFactory.eINSTANCE.createOutputtingSound();

		isOutputted.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(1)));
		AND.getOperand().add(isOutputted);

		outputtingSound.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(1)));
		equal.getOperand().add(outputtingSound);
		equal.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		AND.getOperand().add(equal);

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
				return RBASoundPackage.IS_OUTPUTTED_ON___GET_UNDERLYING_TYPE;
			case RBACorePackage.EXPRESSION___GET_EXPRESSION_TEXT:
				return RBASoundPackage.IS_OUTPUTTED_ON___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Operator.class) {
			switch (baseOperationID) {
			case RBACorePackage.OPERATOR___GET_SYMBOL:
				return RBASoundPackage.IS_OUTPUTTED_ON___GET_SYMBOL;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ContentOperator.class) {
			switch (baseOperationID) {
			case RBACorePackage.CONTENT_OPERATOR___GET_EXPRESSION_TEXT:
				return RBASoundPackage.IS_OUTPUTTED_ON___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SoundContentOperator.class) {
			switch (baseOperationID) {
			case RBASoundPackage.SOUND_CONTENT_OPERATOR___GET_UNDERLYING_TYPE:
				return RBASoundPackage.IS_OUTPUTTED_ON___GET_UNDERLYING_TYPE;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SugarExpression.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION___CAN_EXPAND:
				return RBASoundPackage.IS_OUTPUTTED_ON___CAN_EXPAND;
			case RBACorePackage.SUGAR_EXPRESSION___GET_EXPANDED:
				return RBASoundPackage.IS_OUTPUTTED_ON___GET_EXPANDED;
			default:
				return -1;
			}
		}
		if (baseClass == SugarExpressionBase.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION_BASE___CAN_EXPAND:
				return RBASoundPackage.IS_OUTPUTTED_ON___CAN_EXPAND;
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
		case RBASoundPackage.IS_OUTPUTTED_ON___GET_SYMBOL:
			return getSymbol();
		case RBASoundPackage.IS_OUTPUTTED_ON___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBASoundPackage.IS_OUTPUTTED_ON___GET_EXPRESSION_TEXT:
			return getExpressionText();
		case RBASoundPackage.IS_OUTPUTTED_ON___CAN_EXPAND:
			return canExpand();
		case RBASoundPackage.IS_OUTPUTTED_ON___GET_EXPANDED:
			return getExpanded();
		}
		return super.eInvoke(operationID, arguments);
	}

} // IsOutputtedOnImpl
