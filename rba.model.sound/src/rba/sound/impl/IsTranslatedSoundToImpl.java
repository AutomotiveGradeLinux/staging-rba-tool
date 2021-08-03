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
import rba.sound.IsOutputted;
import rba.sound.IsTranslatedSoundTo;
import rba.sound.OutputtingSound;
import rba.sound.RBASoundFactory;
import rba.sound.RBASoundPackage;
import rba.sound.ZoneOperator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Is Translated Sound To</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class IsTranslatedSoundToImpl extends ZoneOperatorImpl implements IsTranslatedSoundTo {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IsTranslatedSoundToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBASoundPackage.Literals.IS_TRANSLATED_SOUND_TO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".isTranslatedSoundTo";
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
		OutputtingSound outSound = RBASoundFactory.eINSTANCE.createOutputtingSound();
		PreviousModifier pre = RBACoreFactory.eINSTANCE.createPreviousModifier();
		OrOperator or = RBACoreFactory.eINSTANCE.createOrOperator();
		NotOperator not = RBACoreFactory.eINSTANCE.createNotOperator();

		isOutputted.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		AND.getOperand().add(isOutputted);

		outSound.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		equal.getOperand().add(outSound);
		equal.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(1)));
		AND.getOperand().add(equal);

		pre.setObjReference((ObjectReference) org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		outSound = RBASoundFactory.eINSTANCE.createOutputtingSound();
		outSound.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(pre));
		equal = RBACoreFactory.eINSTANCE.createObjectCompare();
		equal.getOperand().add(outSound);
		equal.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(1)));
		not.getOperand().add(equal);
		or.getOperand().add(not);

		isOutputted = RBASoundFactory.eINSTANCE.createIsOutputted();
		isOutputted.getOperand().add(pre);
		not = RBACoreFactory.eINSTANCE.createNotOperator();
		not.getOperand().add(isOutputted);
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
				return RBASoundPackage.IS_TRANSLATED_SOUND_TO___GET_UNDERLYING_TYPE;
			case RBACorePackage.EXPRESSION___GET_EXPRESSION_TEXT:
				return RBASoundPackage.IS_TRANSLATED_SOUND_TO___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Operator.class) {
			switch (baseOperationID) {
			case RBACorePackage.OPERATOR___GET_SYMBOL:
				return RBASoundPackage.IS_TRANSLATED_SOUND_TO___GET_SYMBOL;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ZoneOperator.class) {
			switch (baseOperationID) {
			case RBASoundPackage.ZONE_OPERATOR___GET_EXPRESSION_TEXT:
				return RBASoundPackage.IS_TRANSLATED_SOUND_TO___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SugarExpression.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION___CAN_EXPAND:
				return RBASoundPackage.IS_TRANSLATED_SOUND_TO___CAN_EXPAND;
			case RBACorePackage.SUGAR_EXPRESSION___GET_EXPANDED:
				return RBASoundPackage.IS_TRANSLATED_SOUND_TO___GET_EXPANDED;
			default:
				return -1;
			}
		}
		if (baseClass == SugarExpressionBase.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION_BASE___CAN_EXPAND:
				return RBASoundPackage.IS_TRANSLATED_SOUND_TO___CAN_EXPAND;
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
		case RBASoundPackage.IS_TRANSLATED_SOUND_TO___GET_SYMBOL:
			return getSymbol();
		case RBASoundPackage.IS_TRANSLATED_SOUND_TO___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBASoundPackage.IS_TRANSLATED_SOUND_TO___GET_EXPRESSION_TEXT:
			return getExpressionText();
		case RBASoundPackage.IS_TRANSLATED_SOUND_TO___CAN_EXPAND:
			return canExpand();
		case RBASoundPackage.IS_TRANSLATED_SOUND_TO___GET_EXPANDED:
			return getExpanded();
		}
		return super.eInvoke(operationID, arguments);
	}

} // IsTranslatedSoundToImpl
