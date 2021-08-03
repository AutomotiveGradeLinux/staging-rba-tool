/**
 */
package rba.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
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
 *   <li>{@link rba.core.Operator#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see rba.core.RBACorePackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends Expression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link rba.core.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see rba.core.RBACorePackage#getOperator_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getOperand();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSymbol();

} // Operator
