/**
 */
package rba.view;

import org.eclipse.emf.common.util.EList;

import rba.core.Content;
import rba.core.ExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Content</b></em>'.
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
 *   <li>{@link rba.view.ViewContent#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see rba.view.RBAViewPackage#getViewContent()
 * @model
 * @generated
 */
public interface ViewContent extends Content {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference list.
	 * The list contents are of type {@link rba.view.SizeIdentifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' containment reference list.
	 * @see rba.view.RBAViewPackage#getViewContent_Size()
	 * @model containment="true"
	 * @generated
	 */
	EList<SizeIdentifier> getSize();

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
	ExpressionType getExpressionType();

} // ViewContent
