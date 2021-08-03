/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rba.core.IfStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link rba.core.IfStatement#getThenExpression <em>Then Expression</em>}</li>
 *   <li>{@link rba.core.IfStatement#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Expression {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see rba.core.RBACorePackage#getIfStatement_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link rba.core.IfStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Then Expression</em>' containment reference.
	 * @see #setThenExpression(Expression)
	 * @see rba.core.RBACorePackage#getIfStatement_ThenExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getThenExpression();

	/**
	 * Sets the value of the '{@link rba.core.IfStatement#getThenExpression <em>Then Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expression</em>' containment reference.
	 * @see #getThenExpression()
	 * @generated
	 */
	void setThenExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Else Expression</em>' containment reference.
	 * @see #setElseExpression(Expression)
	 * @see rba.core.RBACorePackage#getIfStatement_ElseExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getElseExpression();

	/**
	 * Sets the value of the '{@link rba.core.IfStatement#getElseExpression <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expression</em>' containment reference.
	 * @see #getElseExpression()
	 * @generated
	 */
	void setElseExpression(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (thenExpression != null) {\r\n  return thenExpression.getUnderlyingType();\r\n}\r\nreturn ExpressionType.VALUE;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='StringBuffer expressionText = new StringBuffer();\r\nexpressionText.append(\"IF(\");\r\nexpressionText.append(condition != null ? condition.getExpressionText() : \"[Invalid_Expression]\");\r\nexpressionText.append(\") THEN \");\r\nexpressionText.append(thenExpression != null ? thenExpression.getExpressionText() : \"[Invalid_Expression]\");\r\nexpressionText.append(\" ELSE \");\r\nexpressionText.append(elseExpression != null ? elseExpression.getExpressionText() : \"[Invalid_Expression]\");\r\nreturn expressionText.toString();'"
	 * @generated
	 */
	String getExpressionText();

} // IfStatement
