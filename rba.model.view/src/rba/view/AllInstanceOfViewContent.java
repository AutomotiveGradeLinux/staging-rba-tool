/**
 */
package rba.view;

import rba.core.ExpressionType;
import rba.core.SetExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Instance Of View Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.view.RBAViewPackage#getAllInstanceOfViewContent()
 * @model
 * @generated
 */
public interface AllInstanceOfViewContent extends SetExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"ALL_VIEWCONTENTS\";'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.SET_OF_CONTENT;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

} // AllInstanceOfViewContent
