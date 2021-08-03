/**
 */
package rba.sound;

import rba.core.ContentOperator;
import rba.core.ExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sound Content Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.sound.RBASoundPackage#getSoundContentOperator()
 * @model abstract="true"
 * @generated
 */
public interface SoundContentOperator extends ContentOperator {
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

} // SoundContentOperator
