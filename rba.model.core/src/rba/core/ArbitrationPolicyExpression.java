/**
 */
package rba.core;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arbitration Policy Expression</b></em>'.
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
 *   <li>{@link rba.core.ArbitrationPolicyExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getArbitrationPolicyExpression()
 * @model
 * @generated
 */
public interface ArbitrationPolicyExpression extends EnumExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link rba.core.ArbitrationPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see rba.core.ArbitrationPolicy
	 * @see #setValue(ArbitrationPolicy)
	 * @see rba.core.RBACorePackage#getArbitrationPolicyExpression_Value()
	 * @model required="true"
	 * @generated
	 */
	ArbitrationPolicy getValue();

	/**
	 * Sets the value of the '{@link rba.core.ArbitrationPolicyExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see rba.core.ArbitrationPolicy
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ArbitrationPolicy value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(value instanceof ArbitrationPolicy) {\r\n    return value.getName();\r\n} else {\r\n    return \"[Invalid_Expression]\";\r\n}'"
	 * @generated
	 */
	String getExpressionText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return value;'"
	 * @generated
	 */
	Enumerator getExpressionValue();

} // ArbitrationPolicyExpression
