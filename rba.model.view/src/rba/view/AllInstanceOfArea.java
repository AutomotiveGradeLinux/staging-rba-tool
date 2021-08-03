/**
 */
package rba.view;

import rba.core.ExpressionType;
import rba.core.SetExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Instance Of Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.view.RBAViewPackage#getAllInstanceOfArea()
 * @model
 * @generated
 */
public interface AllInstanceOfArea extends SetExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"AREA\";'"
	 * @generated
	 */
	String getExpressionText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.SET_OF_AREA;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

} // AllInstanceOfArea
