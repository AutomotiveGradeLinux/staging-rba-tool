/**
 */
package rba.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype</b></em>'.
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
 *   <li>{@link rba.core.Stereotype#getTargetModelName <em>Target Model Name</em>}</li>
 *   <li>{@link rba.core.Stereotype#getVariables <em>Variables</em>}</li>
 *   <li>{@link rba.core.Stereotype#getBodyText <em>Body Text</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getStereotype()
 * @model
 * @generated
 */
public interface Stereotype extends PackagableElement {
	/**
	 * Returns the value of the '<em><b>Target Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Model Name</em>' attribute.
	 * @see #setTargetModelName(String)
	 * @see rba.core.RBACorePackage#getStereotype_TargetModelName()
	 * @model required="true"
	 * @generated
	 */
	String getTargetModelName();

	/**
	 * Sets the value of the '{@link rba.core.Stereotype#getTargetModelName <em>Target Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Model Name</em>' attribute.
	 * @see #getTargetModelName()
	 * @generated
	 */
	void setTargetModelName(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link rba.core.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see rba.core.RBACorePackage#getStereotype_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Body Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Text</em>' attribute.
	 * @see #setBodyText(String)
	 * @see rba.core.RBACorePackage#getStereotype_BodyText()
	 * @model required="true"
	 * @generated
	 */
	String getBodyText();

	/**
	 * Sets the value of the '{@link rba.core.Stereotype#getBodyText <em>Body Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Text</em>' attribute.
	 * @see #getBodyText()
	 * @generated
	 */
	void setBodyText(String value);

} // Stereotype
