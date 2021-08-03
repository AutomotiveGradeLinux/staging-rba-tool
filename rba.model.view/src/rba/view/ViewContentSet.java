/**
 */
package rba.view;

import rba.core.ContentSet;
import rba.core.ExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Content Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.view.RBAViewPackage#getViewContentSet()
 * @model
 * @generated
 */
public interface ViewContentSet extends ContentSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.SET_OF_CONTENT;'"
	 * @generated
	 */
	ExpressionType getExpressionType();

} // ViewContentSet
