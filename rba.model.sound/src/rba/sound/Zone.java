/**
 */
package rba.sound;

import rba.core.Allocatable;
import rba.core.Expression;
import rba.core.ExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
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
 *   <li>{@link rba.sound.Zone#getAttenuate <em>Attenuate</em>}</li>
 * </ul>
 *
 * @see rba.sound.RBASoundPackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends Allocatable {
	/**
	 * Returns the value of the '<em><b>Attenuate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attenuate</em>' containment reference.
	 * @see #setAttenuate(Expression)
	 * @see rba.sound.RBASoundPackage#getZone_Attenuate()
	 * @model containment="true"
	 * @generated
	 */
	Expression getAttenuate();

	/**
	 * Sets the value of the '{@link rba.sound.Zone#getAttenuate <em>Attenuate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attenuate</em>' containment reference.
	 * @see #getAttenuate()
	 * @generated
	 */
	void setAttenuate(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.ZONE;'"
	 * @generated
	 */
	ExpressionType getExpressionType();

} // Zone
