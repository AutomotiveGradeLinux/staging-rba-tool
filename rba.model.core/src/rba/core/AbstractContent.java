/**
 */
package rba.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Content</b></em>'.
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
 *   <li>{@link rba.core.AbstractContent#getContentGroup <em>Content Group</em>}</li>
 *   <li>{@link rba.core.AbstractContent#getAllocatable <em>Allocatable</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getAbstractContent()
 * @model abstract="true"
 * @generated
 */
public interface AbstractContent extends RuleObject {
	/**
	 * Returns the value of the '<em><b>Content Group</b></em>' reference list.
	 * The list contents are of type {@link rba.core.ContentSet}.
	 * It is bidirectional and its opposite is '{@link rba.core.ContentSet#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Group</em>' reference list.
	 * @see rba.core.RBACorePackage#getAbstractContent_ContentGroup()
	 * @see rba.core.ContentSet#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ContentSet> getContentGroup();

	/**
	 * Returns the value of the '<em><b>Allocatable</b></em>' reference list.
	 * The list contents are of type {@link rba.core.AbstractAllocatable}.
	 * It is bidirectional and its opposite is '{@link rba.core.AbstractAllocatable#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocatable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocatable</em>' reference list.
	 * @see rba.core.RBACorePackage#getAbstractContent_Allocatable()
	 * @see rba.core.AbstractAllocatable#getContents
	 * @model opposite="contents"
	 * @generated
	 */
	EList<AbstractAllocatable> getAllocatable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Set&lt;Allocatable&gt; allocatables = new java.util.LinkedHashSet&lt;Allocatable&gt;();\r\ngetAllocatable().forEach(allocatable -&gt; allocatables.addAll(allocatable.collectLeafAllocatable()));\r\ngetContentGroup().forEach(contentSet -&gt; allocatables.addAll(contentSet.getAllocatableList()));\r\nreturn new org.eclipse.emf.common.util.BasicEList&lt;Allocatable&gt;(allocatables);'"
	 * @generated
	 */
	EList<Allocatable> getAllocatableList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Content> collectLeafContents();

} // AbstractContent
