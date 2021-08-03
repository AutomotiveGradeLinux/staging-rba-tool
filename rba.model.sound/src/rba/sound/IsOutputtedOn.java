/**
 */
package rba.sound;

import rba.core.ExpressionType;
import rba.core.SugarExpressionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Outputted On</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rba.sound.RBASoundPackage#getIsOutputtedOn()
 * @model
 * @generated
 */
public interface IsOutputtedOn extends SoundContentOperator, SugarExpressionBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".isOutputtedOn\";'"
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

} // IsOutputtedOn
