/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
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
 *   <li>{@link rba.core.Constraint#isRuntime <em>Runtime</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends AbstractConstraint {
	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see #isSetRuntime()
	 * @see #unsetRuntime()
	 * @see #setRuntime(boolean)
	 * @see rba.core.RBACorePackage#getConstraint_Runtime()
	 * @model default="true" unsettable="true" required="true"
	 * @generated
	 */
	boolean isRuntime();

	/**
	 * Sets the value of the '{@link rba.core.Constraint#isRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see #isSetRuntime()
	 * @see #unsetRuntime()
	 * @see #isRuntime()
	 * @generated
	 */
	void setRuntime(boolean value);

	/**
	 * Unsets the value of the '{@link rba.core.Constraint#isRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRuntime()
	 * @see #isRuntime()
	 * @see #setRuntime(boolean)
	 * @generated
	 */
	void unsetRuntime();

	/**
	 * Returns whether the value of the '{@link rba.core.Constraint#isRuntime <em>Runtime</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Runtime</em>' attribute is set.
	 * @see #unsetRuntime()
	 * @see #isRuntime()
	 * @see #setRuntime(boolean)
	 * @generated
	 */
	boolean isSetRuntime();

} // Constraint
