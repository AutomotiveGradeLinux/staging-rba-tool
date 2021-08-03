/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.core.RBACorePackage#getComparisonAnd()
 * @model
 * @generated
 */
public interface ComparisonAnd extends ComparisonOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"and\";'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='StringBuffer expressionText = new StringBuffer();\r\nEList&lt;rba.core.Expression&gt; expressions = getOperand();\r\nexpressionText.append(\"(\");\r\nfor (int i = 0; i &lt; expressions.size(); i++) {\r\n  rba.core.Expression expression = expressions.get(i);\r\n  expressionText.append(expression.getExpressionText());\r\n  if (i == expressions.size() - 1) {\r\n    expressionText.append(\")\");\r\n  } else {\r\n     expressionText.append(\" \");\r\n     expressionText.append(getSymbol());\r\n     expressionText.append(\" \");\r\n  }\r\n}\r\nreturn expressionText.toString();'"
	 * @generated
	 */
	String getExpressionText();

} // ComparisonAnd
