/**
 */
package rba.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Allocatable</b></em>'.
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
 *   <li>{@link rba.core.AbstractAllocatable#getContents <em>Contents</em>}</li>
 *   <li>{@link rba.core.AbstractAllocatable#getAllocatableGroup <em>Allocatable Group</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getAbstractAllocatable()
 * @model abstract="true"
 * @generated
 */
public interface AbstractAllocatable extends RuleObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link rba.core.AbstractContent}.
	 * It is bidirectional and its opposite is '{@link rba.core.AbstractContent#getAllocatable <em>Allocatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see rba.core.RBACorePackage#getAbstractAllocatable_Contents()
	 * @see rba.core.AbstractContent#getAllocatable
	 * @model opposite="allocatable"
	 * @generated
	 */
	EList<AbstractContent> getContents();

	/**
	 * Returns the value of the '<em><b>Allocatable Group</b></em>' reference list.
	 * The list contents are of type {@link rba.core.AllocatableSet}.
	 * It is bidirectional and its opposite is '{@link rba.core.AllocatableSet#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocatable Group</em>' reference list.
	 * @see rba.core.RBACorePackage#getAbstractAllocatable_AllocatableGroup()
	 * @see rba.core.AllocatableSet#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<AllocatableSet> getAllocatableGroup();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Set&lt;Content&gt; contents = new java.util.LinkedHashSet&lt;Content&gt;();\r\ngetContents().forEach(content -&gt; contents.addAll(content.collectLeafContents()));\r\ngetAllocatableGroup().forEach(allocatableSet -&gt; contents.addAll(allocatableSet.getContentsList()));\r\nreturn new org.eclipse.emf.common.util.BasicEList&lt;Content&gt;(contents);'"
	 * @generated
	 */
	EList<Content> getContentsList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Allocatable> collectLeafAllocatable();

} // AbstractAllocatable
