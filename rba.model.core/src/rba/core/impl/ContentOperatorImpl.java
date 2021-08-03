/**
 */
package rba.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import rba.core.ContentOperator;
import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Content Operator</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ContentOperatorImpl extends OperatorImpl implements ContentOperator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACorePackage.Literals.CONTENT_OPERATOR;
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
		return expressionText.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RBACorePackage.CONTENT_OPERATOR___GET_EXPRESSION_TEXT:
			return getExpressionText();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ContentOperatorImpl
