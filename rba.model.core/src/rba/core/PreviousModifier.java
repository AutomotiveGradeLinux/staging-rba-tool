/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Previous Modifier</b></em>'.
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
 *   <li>{@link rba.core.PreviousModifier#getObjReference <em>Obj Reference</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getPreviousModifier()
 * @model
 * @generated
 */
public interface PreviousModifier extends Expression {
	/**
	 * Returns the value of the '<em><b>Obj Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Reference</em>' containment reference.
	 * @see #setObjReference(ObjectReference)
	 * @see rba.core.RBACorePackage#getPreviousModifier_ObjReference()
	 * @model containment="true"
	 * @generated
	 */
	ObjectReference getObjReference();

	/**
	 * Sets the value of the '{@link rba.core.PreviousModifier#getObjReference <em>Obj Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Reference</em>' containment reference.
	 * @see #getObjReference()
	 * @generated
	 */
	void setObjReference(ObjectReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"(pre)\";'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ObjectReference objReference = getObjReference();\r\nif (objReference != null) {\r\n  return objReference.getUnderlyingType();\r\n} else {\r\n  return ExpressionType.VALUE;\r\n}'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='StringBuffer expressionText = new StringBuffer();\r\nif (getObjReference() != null &amp;&amp; getObjReference().getRefObject() != null) {\r\n    ObjectReference reference = getObjReference();\r\n    expressionText.append(getSymbol());\r\n    expressionText.append(reference.getExpressionText());\r\n} else {\r\n    expressionText.append(\"[Invalid_Expression]\");\r\n}\r\nreturn expressionText.toString();'"
	 * @generated
	 */
	String getExpressionText();

} // PreviousModifier
