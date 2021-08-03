/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
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
 *   <li>{@link rba.core.Project#getVersion <em>Version</em>}</li>
 *   <li>{@link rba.core.Project#getDummyName <em>Dummy Name</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getProject()
 * @model
 * @generated
 */
public interface Project extends rba.core.Package {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see rba.core.RBACorePackage#getProject_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link rba.core.Project#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Dummy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dummy Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dummy Name</em>' attribute.
	 * @see #setDummyName(String)
	 * @see rba.core.RBACorePackage#getProject_DummyName()
	 * @model
	 * @generated
	 */
	String getDummyName();

	/**
	 * Sets the value of the '{@link rba.core.Project#getDummyName <em>Dummy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dummy Name</em>' attribute.
	 * @see #getDummyName()
	 * @generated
	 */
	void setDummyName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this.eResource() != null) {\r\n    String segments[] = this.eResource().getURI().toString().split(\"/\");\r\n    return segments[2];\r\n} else {\r\n    return this.name;\r\n}   '"
	 * @generated
	 */
	String getName();

} // Project
