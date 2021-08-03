/**
 */
package rba.sound;

import rba.core.ContentSet;
import rba.core.ExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sound Content Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.sound.RBASoundPackage#getSoundContentSet()
 * @model
 * @generated
 */
public interface SoundContentSet extends ContentSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.SET_OF_SOUND;'"
	 * @generated
	 */
	ExpressionType getExpressionType();

} // SoundContentSet
