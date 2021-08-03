/**
 */
package rba.view;

import rba.core.PackagableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display</b></em>'.
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
 *   <li>{@link rba.view.Display#getRoot <em>Root</em>}</li>
 *   <li>{@link rba.view.Display#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see rba.view.RBAViewPackage#getDisplay()
 * @model
 * @generated
 */
public interface Display extends PackagableElement {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(CompositeArea)
	 * @see rba.view.RBAViewPackage#getDisplay_Root()
	 * @model containment="true"
	 * @generated
	 */
	CompositeArea getRoot();

	/**
	 * Sets the value of the '{@link rba.view.Display#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(CompositeArea value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(SizeIdentifier)
	 * @see rba.view.RBAViewPackage#getDisplay_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SizeIdentifier getSize();

	/**
	 * Sets the value of the '{@link rba.view.Display#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(SizeIdentifier value);

} // Display
