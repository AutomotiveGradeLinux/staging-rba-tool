/**
 */
package rba.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
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
 *   <li>{@link rba.core.Package#getPackagableelement <em>Packagableelement</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends PackagableElement {
	/**
	 * Returns the value of the '<em><b>Packagableelement</b></em>' containment reference list.
	 * The list contents are of type {@link rba.core.PackagableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packagableelement</em>' containment reference list.
	 * @see rba.core.RBACorePackage#getPackage_Packagableelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackagableElement> getPackagableelement();

} // Package
