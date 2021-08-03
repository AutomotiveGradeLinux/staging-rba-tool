/**
 */
package rba.sound;

import rba.core.ExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Outputted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.sound.RBASoundPackage#getIsOutputted()
 * @model
 * @generated
 */
public interface IsOutputted extends ZoneOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".isOutputted()\";'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.BOOLEAN;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

} // IsOutputted
