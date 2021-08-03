/**
 */
package rba.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
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
 *   <li>{@link rba.core.Tag#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see rba.core.RBACorePackage#getTag_Values()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getValues();

} // Tag
