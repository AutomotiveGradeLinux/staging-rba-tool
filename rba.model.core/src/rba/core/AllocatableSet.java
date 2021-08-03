/**
 */
package rba.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocatable Set</b></em>'.
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
 *   <li>{@link rba.core.AllocatableSet#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getAllocatableSet()
 * @model abstract="true"
 * @generated
 */
public interface AllocatableSet extends AbstractAllocatable {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link rba.core.AbstractAllocatable}.
	 * It is bidirectional and its opposite is '{@link rba.core.AbstractAllocatable#getAllocatableGroup <em>Allocatable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see rba.core.RBACorePackage#getAllocatableSet_Target()
	 * @see rba.core.AbstractAllocatable#getAllocatableGroup
	 * @model opposite="allocatableGroup"
	 * @generated
	 */
	EList<AbstractAllocatable> getTarget();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Set&lt;Allocatable&gt; allocatables = new java.util.LinkedHashSet&lt;Allocatable&gt;();\r\ngetTarget().forEach(allocatable -&gt; allocatables.addAll(allocatable.collectLeafAllocatable()));\r\nreturn new org.eclipse.emf.common.util.BasicEList&lt;Allocatable&gt;(allocatables);'"
	 * @generated
	 */
	EList<Allocatable> collectLeafAllocatable();

} // AllocatableSet
