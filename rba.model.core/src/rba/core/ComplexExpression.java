/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Expression</b></em>'.
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
 *   <li>{@link rba.core.ComplexExpression#getOtherExpression <em>Other Expression</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getComplexExpression()
 * @model
 * @generated
 */
public interface ComplexExpression extends Expression, SugarExpressionBase {
	/**
	 * Returns the value of the '<em><b>Other Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Expression</em>' containment reference.
	 * @see #setOtherExpression(Expression)
	 * @see rba.core.RBACorePackage#getComplexExpression_OtherExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getOtherExpression();

	/**
	 * Sets the value of the '{@link rba.core.ComplexExpression#getOtherExpression <em>Other Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Expression</em>' containment reference.
	 * @see #getOtherExpression()
	 * @generated
	 */
	void setOtherExpression(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return otherExpression != null ? otherExpression.getExpressionText() : \"[Invalid_Expression]\";'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (otherExpression != null) {\r\n    return otherExpression.getType();\r\n} else {\r\n    return ExpressionType.VALUE;\r\n}'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getUnderlyingType();'"
	 * @generated
	 */
	ExpressionType getType();

} // ComplexExpression
