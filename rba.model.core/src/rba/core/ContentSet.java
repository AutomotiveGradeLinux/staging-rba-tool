/**
 */
package rba.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Set</b></em>'.
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
 *   <li>{@link rba.core.ContentSet#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getContentSet()
 * @model abstract="true"
 * @generated
 */
public interface ContentSet extends AbstractContent {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link rba.core.AbstractContent}.
	 * It is bidirectional and its opposite is '{@link rba.core.AbstractContent#getContentGroup <em>Content Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see rba.core.RBACorePackage#getContentSet_Target()
	 * @see rba.core.AbstractContent#getContentGroup
	 * @model opposite="contentGroup"
	 * @generated
	 */
	EList<AbstractContent> getTarget();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Set&lt;Content&gt; contents = new java.util.LinkedHashSet&lt;Content&gt;();\r\ngetTarget().forEach(content -&gt; contents.addAll(content.collectLeafContents()));\r\nreturn new org.eclipse.emf.common.util.BasicEList&lt;Content&gt;(contents);'"
	 * @generated
	 */
	EList<Content> collectLeafContents();

} // ContentSet
