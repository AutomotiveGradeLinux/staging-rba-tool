/**
 */
package rba.view;

import org.eclipse.emf.common.util.EList;

import rba.core.Allocatable;
import rba.core.Expression;
import rba.core.ExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
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
 *   <li>{@link rba.view.Area#getZorder <em>Zorder</em>}</li>
 *   <li>{@link rba.view.Area#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see rba.view.RBAViewPackage#getArea()
 * @model
 * @generated
 */
public interface Area extends Allocatable {
	/**
	 * Returns the value of the '<em><b>Zorder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zorder</em>' containment reference.
	 * @see #setZorder(Expression)
	 * @see rba.view.RBAViewPackage#getArea_Zorder()
	 * @model containment="true"
	 * @generated
	 */
	Expression getZorder();

	/**
	 * Sets the value of the '{@link rba.view.Area#getZorder <em>Zorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zorder</em>' containment reference.
	 * @see #getZorder()
	 * @generated
	 */
	void setZorder(Expression value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference list.
	 * The list contents are of type {@link rba.view.SizeIdentifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' containment reference list.
	 * @see rba.view.RBAViewPackage#getArea_Size()
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExpressionType.AREA;'"
	 * @generated
	 */
	ExpressionType getExpressionType();

} // Area
