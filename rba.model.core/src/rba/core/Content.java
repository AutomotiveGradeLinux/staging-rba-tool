/**
 */
package rba.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
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
 *   <li>{@link rba.core.Content#getLoserType <em>Loser Type</em>}</li>
 *   <li>{@link rba.core.Content#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getContent()
 * @model abstract="true"
 * @generated
 */
public interface Content extends AbstractContent {
	/**
	 * Returns the value of the '<em><b>Loser Type</b></em>' attribute.
	 * The default value is <code>"NEVER_GIVEUP"</code>.
	 * The literals are from the enumeration {@link rba.core.LoserType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loser Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loser Type</em>' attribute.
	 * @see rba.core.LoserType
	 * @see #setLoserType(LoserType)
	 * @see rba.core.RBACorePackage#getContent_LoserType()
	 * @model default="NEVER_GIVEUP"
	 * @generated
	 */
	LoserType getLoserType();

	/**
	 * Sets the value of the '{@link rba.core.Content#getLoserType <em>Loser Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loser Type</em>' attribute.
	 * @see rba.core.LoserType
	 * @see #getLoserType()
	 * @generated
	 */
	void setLoserType(LoserType value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link rba.core.ContentState}.
	 * It is bidirectional and its opposite is '{@link rba.core.ContentState#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see rba.core.RBACorePackage#getContent_States()
	 * @see rba.core.ContentState#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<ContentState> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Set&lt;Content&gt; contents = new java.util.HashSet&lt;Content&gt;();\r\ncontents.add(this);\r\nreturn new org.eclipse.emf.common.util.BasicEList&lt;Content&gt;(contents);'"
	 * @generated
	 */
	EList<Content> collectLeafContents();

} // Content
