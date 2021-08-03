/**
 */
package rba.view;

import rba.core.ExpressionType;
import rba.core.SugarExpressionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Changed Display</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rba.view.RBAViewPackage#getIsChangedDisplay()
 * @model
 * @generated
 */
public interface IsChangedDisplay extends AreaOperator, SugarExpressionBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".isChangedDisplay()\";'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.BOOLEAN;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

} // IsChangedDisplay
