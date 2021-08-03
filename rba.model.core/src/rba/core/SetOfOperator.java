/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Of Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.core.RBACorePackage#getSetOfOperator()
 * @model
 * @generated
 */
public interface SetOfOperator extends Operator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='StringBuffer expressionText = new StringBuffer();\r\nEList&lt;rba.core.Expression&gt; expressions = getOperand();\r\nexpressionText.append(\"{\");\r\nfor (int i = 0; i &lt; expressions.size(); i++) {\r\n  rba.core.Expression expression = expressions.get(i);\r\n  expressionText.append(expression.getExpressionText());\r\n  if (i == expressions.size() - 1) {\r\n    expressionText.append(\"}\");\r\n  } else {\r\n    expressionText.append(\", \");\r\n  }\r\n}\r\nreturn expressionText.toString();'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"\";'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList&lt;rba.core.Expression&gt; expressions = getOperand();\r\nif (!expressions.isEmpty() &amp;&amp; expressions.get(0) != null) {\r\n    rba.core.Expression first = expressions.get(0);\r\n    if ((first.getType() == ExpressionType.CONTENT) || (first.getType() == ExpressionType.SET_OF_CONTENT)) {\r\n        return ExpressionType.SET_OF_CONTENT;\r\n    } else if ((first.getType() == ExpressionType.AREA) || (first.getType() == ExpressionType.SET_OF_AREA)) {\r\n        return ExpressionType.SET_OF_AREA;\r\n    } else if ((first.getType() == ExpressionType.SOUND) || (first.getType() == ExpressionType.SET_OF_SOUND)) {\r\n        return ExpressionType.SET_OF_SOUND;\r\n    } else if ((first.getType() == ExpressionType.ZONE) || (first.getType() == ExpressionType.SET_OF_ZONE)) {\r\n        return ExpressionType.SET_OF_ZONE;\r\n    } else {\r\n        return first.getType();\r\n    }\r\n}\r\nreturn null;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

} // SetOfOperator
