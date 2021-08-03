/**
 */
package rba.sound;

import rba.core.Content;
import rba.core.ExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sound Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.sound.RBASoundPackage#getSoundContent()
 * @model
 * @generated
 */
public interface SoundContent extends Content {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.SOUND;'"
	 * @generated
	 */
	ExpressionType getExpressionType();

} // SoundContent
