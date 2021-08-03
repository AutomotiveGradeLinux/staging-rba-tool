/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For All Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.core.RBACorePackage#getForAllOperator()
 * @model
 * @generated
 */
public interface ForAllOperator extends LambdaContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='StringBuffer expressionText = new StringBuffer();\r\nEList&lt;rba.core.Expression&gt; expressions = getOperand();\r\nrba.core.LambdaExpression lambda = getLambda();\r\nexpressionText.append(getSymbol());\r\nexpressionText.append(\" \");\r\nexpressionText.append(expressions.size() &gt; 0 ? expressions.get(0).getExpressionText() : \"[Invalid_Expression]\");\r\nexpressionText.append(\" \");\r\nexpressionText.append(lambda != null ? lambda.getExpressionText() : \"[Invalid_Expression]\");\r\nreturn expressionText.toString();'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"For All\";'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='rba.core.LambdaExpression lambda = getLambda();\r\nif (lambda != null &amp;&amp; lambda.getBodyText() != null) {\r\nreturn lambda.getBodyText().getUnderlyingType();\r\n}\r\nreturn ExpressionType.BOOLEAN;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

} // ForAllOperator
