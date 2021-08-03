/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Expression</b></em>'.
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
 *   <li>{@link rba.core.LambdaExpression#getContext <em>Context</em>}</li>
 *   <li>{@link rba.core.LambdaExpression#getX <em>X</em>}</li>
 *   <li>{@link rba.core.LambdaExpression#getBodyText <em>Body Text</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getLambdaExpression()
 * @model
 * @generated
 */
public interface LambdaExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rba.core.LambdaContext#getLambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(LambdaContext)
	 * @see rba.core.RBACorePackage#getLambdaExpression_Context()
	 * @see rba.core.LambdaContext#getLambda
	 * @model opposite="lambda" transient="false"
	 * @generated
	 */
	LambdaContext getContext();

	/**
	 * Sets the value of the '{@link rba.core.LambdaExpression#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(LambdaContext value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(Variable)
	 * @see rba.core.RBACorePackage#getLambdaExpression_X()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getX();

	/**
	 * Sets the value of the '{@link rba.core.LambdaExpression#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(Variable value);

	/**
	 * Returns the value of the '<em><b>Body Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Text</em>' containment reference.
	 * @see #setBodyText(Expression)
	 * @see rba.core.RBACorePackage#getLambdaExpression_BodyText()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getBodyText();

	/**
	 * Sets the value of the '{@link rba.core.LambdaExpression#getBodyText <em>Body Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Text</em>' containment reference.
	 * @see #getBodyText()
	 * @generated
	 */
	void setBodyText(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='StringBuilder expressionText = new StringBuilder();\r\nexpressionText.append(\"{ \");\r\nexpressionText.append(x != null ? x.getName() : \"[Invalid_Expression]\");\r\nexpressionText.append(\" | \");\r\ngetLetStatements().forEach(let -&gt; expressionText.append(let));\r\nexpressionText.append(bodyText != null ? bodyText.getExpressionText() : \"[Invalid_Expression]\");\r\nexpressionText.append(\" }\");\r\nreturn expressionText.toString();'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.LAMBDA;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

} // LambdaExpression
