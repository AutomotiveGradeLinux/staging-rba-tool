/**
 */
package rba.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Reference</b></em>'.
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
 *   <li>{@link rba.core.ObjectReference#getRefObject <em>Ref Object</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getObjectReference()
 * @model
 * @generated
 */
public interface ObjectReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Ref Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Object</em>' reference.
	 * @see #setRefObject(RuleObject)
	 * @see rba.core.RBACorePackage#getObjectReference_RefObject()
	 * @model
	 * @generated
	 */
	RuleObject getRefObject();

	/**
	 * Sets the value of the '{@link rba.core.ObjectReference#getRefObject <em>Ref Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Object</em>' reference.
	 * @see #getRefObject()
	 * @generated
	 */
	void setRefObject(RuleObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='RuleObject obj = getRefObject();\r\nif (obj != null) {\r\n  return obj.getExpressionType();\r\n} else {\r\n  return ExpressionType.VALUE;\r\n}'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='StringBuffer expressionText = new StringBuffer();\r\nRuleObject obj = getRefObject();\r\nif (obj instanceof &lt;%rba.core.ContentState%&gt;) {\r\n    ContentState state = (ContentState) obj;\r\n    expressionText.append(state.getOwner().getName() + \".\" + state.getName());\r\n} else if (obj instanceof &lt;%rba.core.AbstractProperty%&gt;) {\r\n    AbstractProperty property = (AbstractProperty) obj;\r\n    expressionText.append(property.getOwner().getName() + \".\" + property.getName());\r\n} else {\r\n    expressionText.append(obj != null ? obj.getName() : \"[Invalid_Expression]\");\r\n}\r\nreturn expressionText.toString();'"
	 * @generated
	 */
	String getExpressionText();

} // ObjectReference
