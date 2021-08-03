/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Allocated To</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rba.core.RBACorePackage#getIsAllocatedTo()
 * @model
 * @generated
 */
public interface IsAllocatedTo extends ContentOperator, SugarExpressionBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".isAllocatedTo\";'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.BOOLEAN;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='StringBuilder expressionText = new StringBuilder();\r\nEList&lt;rba.core.Expression&gt; expressions = getOperand();\r\nexpressionText.append(expressions.size() &gt; 0 ? expressions.get(0).getExpressionText() : \"[Invalid_Expression]\");\r\nexpressionText.append(getSymbol());\r\nexpressionText.append(\"(\");\r\nexpressionText.append(expressions.size() &gt; 1 ? expressions.get(1).getExpressionText() : \"[Invalid_Expression]\");\r\nexpressionText.append(\")\");\r\nreturn expressionText.toString();'"
	 * @generated
	 */
	String getExpressionText();

} // IsAllocatedTo
