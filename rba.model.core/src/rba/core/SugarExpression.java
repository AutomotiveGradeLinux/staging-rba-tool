/**
 */
package rba.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sugar Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rba.core.RBACorePackage#getSugarExpression()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SugarExpression extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean canExpand();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @return Expression that expanded the syntax sugar expression.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Expression getExpanded();

} // SugarExpression
