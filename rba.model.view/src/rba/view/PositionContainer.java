/**
 */
package rba.view;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Container</b></em>'.
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
 *   <li>{@link rba.view.PositionContainer#getX <em>X</em>}</li>
 *   <li>{@link rba.view.PositionContainer#getY <em>Y</em>}</li>
 *   <li>{@link rba.view.PositionContainer#getBasePoint <em>Base Point</em>}</li>
 *   <li>{@link rba.view.PositionContainer#getArea <em>Area</em>}</li>
 *   <li>{@link rba.view.PositionContainer#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see rba.view.RBAViewPackage#getPositionContainer()
 * @model
 * @generated
 */
public interface PositionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(int)
	 * @see rba.view.RBAViewPackage#getPositionContainer_X()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link rba.view.PositionContainer#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Unsets the value of the '{@link rba.view.PositionContainer#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(int)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link rba.view.PositionContainer#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(int)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(int)
	 * @see rba.view.RBAViewPackage#getPositionContainer_Y()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link rba.view.PositionContainer#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Unsets the value of the '{@link rba.view.PositionContainer#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(int)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link rba.view.PositionContainer#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(int)
	 * @generated
	 */
	boolean isSetY();

	/**
	 * Returns the value of the '<em><b>Base Point</b></em>' attribute.
	 * The literals are from the enumeration {@link rba.view.BasePoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Point</em>' attribute.
	 * @see rba.view.BasePoint
	 * @see #setBasePoint(BasePoint)
	 * @see rba.view.RBAViewPackage#getPositionContainer_BasePoint()
	 * @model
	 * @generated
	 */
	BasePoint getBasePoint();

	/**
	 * Sets the value of the '{@link rba.view.PositionContainer#getBasePoint <em>Base Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Point</em>' attribute.
	 * @see rba.view.BasePoint
	 * @see #getBasePoint()
	 * @generated
	 */
	void setBasePoint(BasePoint value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' reference.
	 * @see #setArea(Area)
	 * @see rba.view.RBAViewPackage#getPositionContainer_Area()
	 * @model required="true"
	 * @generated
	 */
	Area getArea();

	/**
	 * Sets the value of the '{@link rba.view.PositionContainer#getArea <em>Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(Area value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference list.
	 * The list contents are of type {@link rba.view.Offset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference list.
	 * @see rba.view.RBAViewPackage#getPositionContainer_Offset()
	 * @model containment="true"
	 * @generated
	 */
	EList<Offset> getOffset();

} // PositionContainer
