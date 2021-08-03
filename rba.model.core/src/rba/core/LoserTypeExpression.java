/**
 */
package rba.core;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loser Type Expression</b></em>'.
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
 *   <li>{@link rba.core.LoserTypeExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getLoserTypeExpression()
 * @model
 * @generated
 */
public interface LoserTypeExpression extends EnumExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link rba.core.LoserType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see rba.core.LoserType
	 * @see #setValue(LoserType)
	 * @see rba.core.RBACorePackage#getLoserTypeExpression_Value()
	 * @model required="true"
	 * @generated
	 */
	LoserType getValue();

	/**
	 * Sets the value of the '{@link rba.core.LoserTypeExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see rba.core.LoserType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(LoserType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(value instanceof LoserType) {\r\n    return value.getName();\r\n} else {\r\n    return \"[Invalid_Expression]\";\r\n}'"
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

} // LoserTypeExpression
