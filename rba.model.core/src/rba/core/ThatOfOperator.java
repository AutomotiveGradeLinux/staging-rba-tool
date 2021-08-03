/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>That Of Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.core.RBACorePackage#getThatOfOperator()
 * @model
 * @generated
 */
public interface ThatOfOperator extends Operator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='StringBuffer expressionText = new StringBuffer();\r\nEList&lt;rba.core.Expression&gt; expressions = getOperand();\r\nexpressionText.append(getSymbol());\r\nexpressionText.append(expressions.size() &gt; 0 ? expressions.get(0).getExpressionText() : \"[Invalid_Expression]\");\r\nreturn expressionText.toString();'"
	 * @generated
	 */
	String getExpressionText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"That of \";'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.VALUE;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

} // ThatOfOperator
