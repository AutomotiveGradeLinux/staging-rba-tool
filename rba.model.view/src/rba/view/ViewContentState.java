/**
 */
package rba.view;

import rba.core.ContentState;
import rba.core.ExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Content State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.view.RBAViewPackage#getViewContentState()
 * @model
 * @generated
 */
public interface ViewContentState extends ContentState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.CONTENT_STATE;'"
	 * @generated
	 */
	ExpressionType getExpressionType();

} // ViewContentState
