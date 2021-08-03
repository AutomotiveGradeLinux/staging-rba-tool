/**
 */
package rba.sound;

import rba.core.Operator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.sound.RBASoundPackage#getZoneOperator()
 * @model abstract="true"
 * @generated
 */
public interface ZoneOperator extends Operator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='StringBuffer expressionText = new StringBuffer();\r\nEList&lt;rba.core.Expression&gt; expressions = getOperand();\r\nexpressionText.append(expressions.size() &gt; 0 ? expressions.get(0).getExpressionText() : \"[Invalid_Expression]\");\r\nexpressionText.append(getSymbol());\r\nreturn expressionText.toString();'"
	 * @generated
	 */
	String getExpressionText();

} // ZoneOperator
