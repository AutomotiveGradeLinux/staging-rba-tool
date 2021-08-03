/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Property</b></em>'.
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
 *   <li>{@link rba.core.AbstractProperty#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getAbstractProperty()
 * @model abstract="true"
 * @generated
 */
public interface AbstractProperty extends RuleObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rba.core.Scene#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Scene)
	 * @see rba.core.RBACorePackage#getAbstractProperty_Owner()
	 * @see rba.core.Scene#getProperties
	 * @model opposite="properties" transient="false"
	 * @generated
	 */
	Scene getOwner();

	/**
	 * Sets the value of the '{@link rba.core.AbstractProperty#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Scene value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.PROPERTY;'"
	 * @generated
	 */
	ExpressionType getExpressionType();

} // AbstractProperty
