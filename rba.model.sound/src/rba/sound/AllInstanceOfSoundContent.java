/**
 */
package rba.sound;

import rba.core.ExpressionType;
import rba.core.SetExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Instance Of Sound Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.sound.RBASoundPackage#getAllInstanceOfSoundContent()
 * @model
 * @generated
 */
public interface AllInstanceOfSoundContent extends SetExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"ALL_SOUNDCONTENTS\";'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.SET_OF_SOUND;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

} // AllInstanceOfSoundContent
