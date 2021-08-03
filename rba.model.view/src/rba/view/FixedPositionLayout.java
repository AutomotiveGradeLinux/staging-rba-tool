/**
 */
package rba.view;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Position Layout</b></em>'.
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
 *   <li>{@link rba.view.FixedPositionLayout#getSubAreaPosition <em>Sub Area Position</em>}</li>
 * </ul>
 *
 * @see rba.view.RBAViewPackage#getFixedPositionLayout()
 * @model
 * @generated
 */
public interface FixedPositionLayout extends LayoutManager {
	/**
	 * Returns the value of the '<em><b>Sub Area Position</b></em>' containment reference list.
	 * The list contents are of type {@link rba.view.PositionContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Area Position</em>' containment reference list.
	 * @see rba.view.RBAViewPackage#getFixedPositionLayout_SubAreaPosition()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositionContainer> getSubAreaPosition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.Set&lt;Area&gt; areas = new java.util.HashSet&lt;Area&gt;();\r\nfor (PositionContainer pc : getSubAreaPosition()) {\r\n    areas.addAll(pc.getArea().collectLeafAllocatable().stream().map(allocatable -&gt; (Area) allocatable).collect(java.util.stream.Collectors.toList()));\r\n}\r\nreturn new org.eclipse.emf.common.util.BasicEList&lt;Area&gt;(areas);'"
	 * @generated
	 */
	EList<Area> collectLeafArea();

} // FixedPositionLayout
