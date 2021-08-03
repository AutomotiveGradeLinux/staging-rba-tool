/**
 */
package rba.sound;

import rba.core.ExpressionType;
import rba.core.SugarExpressionBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Changed Output</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see rba.sound.RBASoundPackage#getIsChangedOutput()
 * @model
 * @generated
 */
public interface IsChangedOutput extends ZoneOperator, SugarExpressionBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".isChangedOutput()\";'"
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

} // IsChangedOutput
