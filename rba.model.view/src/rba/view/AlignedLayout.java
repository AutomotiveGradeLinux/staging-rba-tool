/**
 */
package rba.view;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aligned Layout</b></em>'.
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
 *   <li>{@link rba.view.AlignedLayout#getSubarea <em>Subarea</em>}</li>
 *   <li>{@link rba.view.AlignedLayout#getBasePoint <em>Base Point</em>}</li>
 * </ul>
 *
 * @see rba.view.RBAViewPackage#getAlignedLayout()
 * @model abstract="true"
 * @generated
 */
public interface AlignedLayout extends LayoutManager {
	/**
	 * Returns the value of the '<em><b>Subarea</b></em>' reference list.
	 * The list contents are of type {@link rba.view.Area}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subarea</em>' reference list.
	 * @see rba.view.RBAViewPackage#getAlignedLayout_Subarea()
	 * @model
	 * @generated
	 */
	EList<Area> getSubarea();

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
	 * @see rba.view.RBAViewPackage#getAlignedLayout_BasePoint()
	 * @model
	 * @generated
	 */
	BasePoint getBasePoint();

	/**
	 * Sets the value of the '{@link rba.view.AlignedLayout#getBasePoint <em>Base Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Point</em>' attribute.
	 * @see rba.view.BasePoint
	 * @see #getBasePoint()
	 * @generated
	 */
	void setBasePoint(BasePoint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Set&lt;Area&gt; areas = new java.util.HashSet&lt;Area&gt;();\r\nfor (Area area : getSubarea()) {\r\n    areas.addAll(area.collectLeafAllocatable().stream().map(allocatable -&gt; (Area) allocatable).collect(java.util.stream.Collectors.toList()));\r\n}\r\nreturn new org.eclipse.emf.common.util.BasicEList&lt;Area&gt;(areas);'"
	 * @generated
	 */
	EList<Area> collectLeafArea();

} // AlignedLayout
