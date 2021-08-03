/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import rba.core.AllocatableOperator;
import rba.core.AllocatedContent;
import rba.core.AndOperator;
import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.IsTranslatedTo;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Is Translated To</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class IsTranslatedToImpl extends AllocatableOperatorImpl implements IsTranslatedTo {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IsTranslatedToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.IS_TRANSLATED_TO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return ".isTranslatedTo";
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
		NotOperator not = RBACoreFactory.eINSTANCE.createNotOperator();
		ObjectCompare equal = RBACoreFactory.eINSTANCE.createObjectCompare();
		AllocatedContent content = RBACoreFactory.eINSTANCE.createAllocatedContent();
		PreviousModifier preModifier = RBACoreFactory.eINSTANCE.createPreviousModifier();

		preModifier.setObjReference((ObjectReference) org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		content.getOperand().add(preModifier);
		equal.getOperand().add(content);
		equal.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(1)));
		not.getOperand().add(equal);
		AND.getOperand().add(not);

		content = RBACoreFactory.eINSTANCE.createAllocatedContent();
		equal = RBACoreFactory.eINSTANCE.createObjectCompare();

		content.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(0)));
		equal.getOperand().add(content);
		equal.getOperand().add(org.eclipse.emf.ecore.util.EcoreUtil.copy(getOperand().get(1)));

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
				return RBACorePackage.IS_TRANSLATED_TO___GET_UNDERLYING_TYPE;
			case RBACorePackage.EXPRESSION___GET_EXPRESSION_TEXT:
				return RBACorePackage.IS_TRANSLATED_TO___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Operator.class) {
			switch (baseOperationID) {
			case RBACorePackage.OPERATOR___GET_SYMBOL:
				return RBACorePackage.IS_TRANSLATED_TO___GET_SYMBOL;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == AllocatableOperator.class) {
			switch (baseOperationID) {
			case RBACorePackage.ALLOCATABLE_OPERATOR___GET_EXPRESSION_TEXT:
				return RBACorePackage.IS_TRANSLATED_TO___GET_EXPRESSION_TEXT;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == SugarExpression.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION___CAN_EXPAND:
				return RBACorePackage.IS_TRANSLATED_TO___CAN_EXPAND;
			case RBACorePackage.SUGAR_EXPRESSION___GET_EXPANDED:
				return RBACorePackage.IS_TRANSLATED_TO___GET_EXPANDED;
			default:
				return -1;
			}
		}
		if (baseClass == SugarExpressionBase.class) {
			switch (baseOperationID) {
			case RBACorePackage.SUGAR_EXPRESSION_BASE___CAN_EXPAND:
				return RBACorePackage.IS_TRANSLATED_TO___CAN_EXPAND;
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
		case RBACorePackage.IS_TRANSLATED_TO___GET_SYMBOL:
			return getSymbol();
		case RBACorePackage.IS_TRANSLATED_TO___GET_UNDERLYING_TYPE:
			return getUnderlyingType();
		case RBACorePackage.IS_TRANSLATED_TO___GET_EXPRESSION_TEXT:
			return getExpressionText();
		case RBACorePackage.IS_TRANSLATED_TO___CAN_EXPAND:
			return canExpand();
		case RBACorePackage.IS_TRANSLATED_TO___GET_EXPANDED:
			return getExpanded();
		}
		return super.eInvoke(operationID, arguments);
	}

} // IsTranslatedToImpl
