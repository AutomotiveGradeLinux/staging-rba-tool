/**
 */
package rba.view;

import org.eclipse.emf.common.util.EList;

import rba.core.ExpressionType;
import rba.core.PackagableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Area</b></em>'.
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
 *   <li>{@link rba.view.CompositeArea#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see rba.view.RBAViewPackage#getCompositeArea()
 * @model
 * @generated
 */
public interface CompositeArea extends PackagableElement {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(LayoutManager)
	 * @see rba.view.RBAViewPackage#getCompositeArea_Layout()
	 * @model containment="true"
	 * @generated
	 */
	LayoutManager getLayout();

	/**
	 * Sets the value of the '{@link rba.view.CompositeArea#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(LayoutManager value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @Override
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Set&lt;Area&gt; areas = new java.util.HashSet&lt;Area&gt;();\r\nif (layout != null) {\r\n    areas.addAll(layout.collectLeafArea());\r\n}\r\n\r\nreturn new org.eclipse.emf.common.util.BasicEList&lt;Area&gt;(areas);'"
	 * @generated
	 */
	EList<Area> collectLeafArea();

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

} // CompositeArea
