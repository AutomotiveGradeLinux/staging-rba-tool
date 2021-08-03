/**
 */
package rba.view;

import rba.core.ExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Displaying Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see rba.view.RBAViewPackage#getDisplayingContent()
 * @model
 * @generated
 */
public interface DisplayingContent extends AreaOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \".displayingContent()\";'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.CONTENT;'"
	 * @generated
	 */
	ExpressionType getUnderlyingType();

} // DisplayingContent
