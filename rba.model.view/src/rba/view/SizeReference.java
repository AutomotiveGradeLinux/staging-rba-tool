/**
 */
package rba.view;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rba.view.SizeReference#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see rba.view.RBAViewPackage#getSizeReference()
 * @model
 * @generated
 */
public interface SizeReference extends SizeIdentifier {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' reference.
	 * @see #setSize(Size)
	 * @see rba.view.RBAViewPackage#getSizeReference_Size()
	 * @model
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link rba.view.SizeReference#getSize <em>Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

} // SizeReference
