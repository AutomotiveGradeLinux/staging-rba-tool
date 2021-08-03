/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.core.RBACorePackage#getSelectOperator()
 * @model
 * @generated
 */
public interface SelectOperator extends LambdaContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='StringBuffer expressionText = new StringBuffer();\r\nEList&lt;rba.core.Expression&gt; expressions = getOperand();\r\nrba.core.LambdaExpression lambda = getLambda();\r\nexpressionText.append(expressions.size() &gt; 0 ? expressions.get(0).getExpressionText() : \"[Invalid_Expression]\");\r\nexpressionText.append(getSymbol());\r\nexpressionText.append(\"{ \");\r\nexpressionText.append(lambda != null ? lambda.getExpressionText() : \"[Invalid_Expression]\");\r\nexpressionText.append(\" }\");\r\nreturn expressionText.toString();'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".select\";'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (!getOperand().isEmpty()) {\r\n    &lt;%rba.core.Expression%&gt; first = getOperand().get(0);\r\n    return first.getType();\r\n}\r\nreturn ExpressionType.VALUE;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

} // SelectOperator
