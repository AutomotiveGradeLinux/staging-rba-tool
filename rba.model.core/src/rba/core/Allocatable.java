/**
 */
package rba.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocatable</b></em>'.
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
 *   <li>{@link rba.core.Allocatable#getArbitrationPolicy <em>Arbitration Policy</em>}</li>
 *   <li>{@link rba.core.Allocatable#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getAllocatable()
 * @model abstract="true"
 * @generated
 */
public interface Allocatable extends AbstractAllocatable {
	/**
	 * Returns the value of the '<em><b>Arbitration Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link rba.core.ArbitrationPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arbitration Policy</em>' attribute.
	 * @see rba.core.ArbitrationPolicy
	 * @see #setArbitrationPolicy(ArbitrationPolicy)
	 * @see rba.core.RBACorePackage#getAllocatable_ArbitrationPolicy()
	 * @model
	 * @generated
	 */
	ArbitrationPolicy getArbitrationPolicy();

	/**
	 * Sets the value of the '{@link rba.core.Allocatable#getArbitrationPolicy <em>Arbitration Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arbitration Policy</em>' attribute.
	 * @see rba.core.ArbitrationPolicy
	 * @see #getArbitrationPolicy()
	 * @generated
	 */
	void setArbitrationPolicy(ArbitrationPolicy value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' containment reference.
	 * @see #setVisibility(Expression)
	 * @see rba.core.RBACorePackage#getAllocatable_Visibility()
	 * @model containment="true"
	 * @generated
	 */
	Expression getVisibility();

	/**
	 * Sets the value of the '{@link rba.core.Allocatable#getVisibility <em>Visibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' containment reference.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Set&lt;Allocatable&gt; allocatables = new java.util.HashSet&lt;Allocatable&gt;();\r\nallocatables.add(this);\r\nreturn new org.eclipse.emf.common.util.BasicEList&lt;Allocatable&gt;(allocatables);'"
	 * @generated
	 */
	EList<Allocatable> collectLeafAllocatable();

} // Allocatable
