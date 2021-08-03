/**
 */
package rba.view;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import rba.core.RBACorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rba.view.RBAViewFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import RbaCore='../../rba.model.core/model/rbacore.ecore#/' ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface RBAViewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "view";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.denso.com/ict/rba/view";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RbaView";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RBAViewPackage eINSTANCE = rba.view.impl.RBAViewPackageImpl.init();

	/**
	 * The meta object id for the '{@link rba.view.impl.ViewContentImpl <em>View Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.ViewContentImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getViewContent()
	 * @generated
	 */
	int VIEW_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT__DESCRIPTION = RBACorePackage.CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT__NAME = RBACorePackage.CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT__TAGS = RBACorePackage.CONTENT__TAGS;

	/**
	 * The feature id for the '<em><b>Content Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT__CONTENT_GROUP = RBACorePackage.CONTENT__CONTENT_GROUP;

	/**
	 * The feature id for the '<em><b>Allocatable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT__ALLOCATABLE = RBACorePackage.CONTENT__ALLOCATABLE;

	/**
	 * The feature id for the '<em><b>Loser Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT__LOSER_TYPE = RBACorePackage.CONTENT__LOSER_TYPE;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT__STATES = RBACorePackage.CONTENT__STATES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT__SIZE = RBACorePackage.CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_FEATURE_COUNT = RBACorePackage.CONTENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Allocatable List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT___GET_ALLOCATABLE_LIST = RBACorePackage.CONTENT___GET_ALLOCATABLE_LIST;

	/**
	 * The operation id for the '<em>Collect Leaf Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT___COLLECT_LEAF_CONTENTS = RBACorePackage.CONTENT___COLLECT_LEAF_CONTENTS;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT___GET_EXPRESSION_TYPE = RBACorePackage.CONTENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>View Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_OPERATION_COUNT = RBACorePackage.CONTENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.view.impl.ViewContentSetImpl <em>View Content Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.ViewContentSetImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getViewContentSet()
	 * @generated
	 */
	int VIEW_CONTENT_SET = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_SET__DESCRIPTION = RBACorePackage.CONTENT_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_SET__NAME = RBACorePackage.CONTENT_SET__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_SET__TAGS = RBACorePackage.CONTENT_SET__TAGS;

	/**
	 * The feature id for the '<em><b>Content Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_SET__CONTENT_GROUP = RBACorePackage.CONTENT_SET__CONTENT_GROUP;

	/**
	 * The feature id for the '<em><b>Allocatable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_SET__ALLOCATABLE = RBACorePackage.CONTENT_SET__ALLOCATABLE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_SET__TARGET = RBACorePackage.CONTENT_SET__TARGET;

	/**
	 * The number of structural features of the '<em>View Content Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_SET_FEATURE_COUNT = RBACorePackage.CONTENT_SET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Allocatable List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_SET___GET_ALLOCATABLE_LIST = RBACorePackage.CONTENT_SET___GET_ALLOCATABLE_LIST;

	/**
	 * The operation id for the '<em>Collect Leaf Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_SET___COLLECT_LEAF_CONTENTS = RBACorePackage.CONTENT_SET___COLLECT_LEAF_CONTENTS;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_SET___GET_EXPRESSION_TYPE = RBACorePackage.CONTENT_SET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>View Content Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_SET_OPERATION_COUNT = RBACorePackage.CONTENT_SET_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.view.impl.ViewContentStateImpl <em>View Content State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.ViewContentStateImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getViewContentState()
	 * @generated
	 */
	int VIEW_CONTENT_STATE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_STATE__DESCRIPTION = RBACorePackage.CONTENT_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_STATE__NAME = RBACorePackage.CONTENT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_STATE__TAGS = RBACorePackage.CONTENT_STATE__TAGS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_STATE__VALUE = RBACorePackage.CONTENT_STATE__VALUE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_STATE__OWNER = RBACorePackage.CONTENT_STATE__OWNER;

	/**
	 * The number of structural features of the '<em>View Content State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_STATE_FEATURE_COUNT = RBACorePackage.CONTENT_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_STATE___GET_EXPRESSION_TYPE = RBACorePackage.CONTENT_STATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>View Content State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_STATE_OPERATION_COUNT = RBACorePackage.CONTENT_STATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.view.impl.LayoutManagerImpl <em>Layout Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.LayoutManagerImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getLayoutManager()
	 * @generated
	 */
	int LAYOUT_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Layout Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Collect Leaf Area</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_MANAGER___COLLECT_LEAF_AREA = 0;

	/**
	 * The number of operations of the '<em>Layout Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_MANAGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link rba.view.impl.AlignedLayoutImpl <em>Aligned Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.AlignedLayoutImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getAlignedLayout()
	 * @generated
	 */
	int ALIGNED_LAYOUT = 4;

	/**
	 * The feature id for the '<em><b>Subarea</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_LAYOUT__SUBAREA = LAYOUT_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_LAYOUT__BASE_POINT = LAYOUT_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aligned Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_LAYOUT_FEATURE_COUNT = LAYOUT_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect Leaf Area</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_LAYOUT___COLLECT_LEAF_AREA = LAYOUT_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aligned Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIGNED_LAYOUT_OPERATION_COUNT = LAYOUT_MANAGER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.view.impl.VerticalLayoutImpl <em>Vertical Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.VerticalLayoutImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getVerticalLayout()
	 * @generated
	 */
	int VERTICAL_LAYOUT = 5;

	/**
	 * The feature id for the '<em><b>Subarea</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LAYOUT__SUBAREA = ALIGNED_LAYOUT__SUBAREA;

	/**
	 * The feature id for the '<em><b>Base Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LAYOUT__BASE_POINT = ALIGNED_LAYOUT__BASE_POINT;

	/**
	 * The number of structural features of the '<em>Vertical Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LAYOUT_FEATURE_COUNT = ALIGNED_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect Leaf Area</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LAYOUT___COLLECT_LEAF_AREA = ALIGNED_LAYOUT___COLLECT_LEAF_AREA;

	/**
	 * The number of operations of the '<em>Vertical Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LAYOUT_OPERATION_COUNT = ALIGNED_LAYOUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.view.impl.HorizontalLayoutImpl <em>Horizontal Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.HorizontalLayoutImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getHorizontalLayout()
	 * @generated
	 */
	int HORIZONTAL_LAYOUT = 6;

	/**
	 * The feature id for the '<em><b>Subarea</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LAYOUT__SUBAREA = ALIGNED_LAYOUT__SUBAREA;

	/**
	 * The feature id for the '<em><b>Base Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LAYOUT__BASE_POINT = ALIGNED_LAYOUT__BASE_POINT;

	/**
	 * The number of structural features of the '<em>Horizontal Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LAYOUT_FEATURE_COUNT = ALIGNED_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect Leaf Area</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LAYOUT___COLLECT_LEAF_AREA = ALIGNED_LAYOUT___COLLECT_LEAF_AREA;

	/**
	 * The number of operations of the '<em>Horizontal Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LAYOUT_OPERATION_COUNT = ALIGNED_LAYOUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.view.impl.FixedPositionLayoutImpl <em>Fixed Position Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.FixedPositionLayoutImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getFixedPositionLayout()
	 * @generated
	 */
	int FIXED_POSITION_LAYOUT = 7;

	/**
	 * The feature id for the '<em><b>Sub Area Position</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POSITION_LAYOUT__SUB_AREA_POSITION = LAYOUT_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fixed Position Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POSITION_LAYOUT_FEATURE_COUNT = LAYOUT_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect Leaf Area</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POSITION_LAYOUT___COLLECT_LEAF_AREA = LAYOUT_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fixed Position Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_POSITION_LAYOUT_OPERATION_COUNT = LAYOUT_MANAGER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.view.impl.PositionContainerImpl <em>Position Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.PositionContainerImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getPositionContainer()
	 * @generated
	 */
	int POSITION_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CONTAINER__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CONTAINER__Y = 1;

	/**
	 * The feature id for the '<em><b>Base Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CONTAINER__BASE_POINT = 2;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CONTAINER__AREA = 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CONTAINER__OFFSET = 4;

	/**
	 * The number of structural features of the '<em>Position Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Position Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rba.view.impl.DisplayImpl <em>Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.DisplayImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__DESCRIPTION = RBACorePackage.PACKAGABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__NAME = RBACorePackage.PACKAGABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__ROOT = RBACorePackage.PACKAGABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__SIZE = RBACorePackage.PACKAGABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = RBACorePackage.PACKAGABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_OPERATION_COUNT = RBACorePackage.PACKAGABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.view.impl.CompositeAreaImpl <em>Composite Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.CompositeAreaImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getCompositeArea()
	 * @generated
	 */
	int COMPOSITE_AREA = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_AREA__DESCRIPTION = RBACorePackage.PACKAGABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_AREA__NAME = RBACorePackage.PACKAGABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_AREA__LAYOUT = RBACorePackage.PACKAGABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_AREA_FEATURE_COUNT = RBACorePackage.PACKAGABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect Leaf Area</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_AREA___COLLECT_LEAF_AREA = RBACorePackage.PACKAGABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_AREA___GET_EXPRESSION_TYPE = RBACorePackage.PACKAGABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_AREA_OPERATION_COUNT = RBACorePackage.PACKAGABLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.view.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.AreaImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__DESCRIPTION = RBACorePackage.ALLOCATABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__NAME = RBACorePackage.ALLOCATABLE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__TAGS = RBACorePackage.ALLOCATABLE__TAGS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__CONTENTS = RBACorePackage.ALLOCATABLE__CONTENTS;

	/**
	 * The feature id for the '<em><b>Allocatable Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ALLOCATABLE_GROUP = RBACorePackage.ALLOCATABLE__ALLOCATABLE_GROUP;

	/**
	 * The feature id for the '<em><b>Arbitration Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ARBITRATION_POLICY = RBACorePackage.ALLOCATABLE__ARBITRATION_POLICY;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__VISIBILITY = RBACorePackage.ALLOCATABLE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Zorder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ZORDER = RBACorePackage.ALLOCATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__SIZE = RBACorePackage.ALLOCATABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = RBACorePackage.ALLOCATABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Contents List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA___GET_CONTENTS_LIST = RBACorePackage.ALLOCATABLE___GET_CONTENTS_LIST;

	/**
	 * The operation id for the '<em>Collect Leaf Allocatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA___COLLECT_LEAF_ALLOCATABLE = RBACorePackage.ALLOCATABLE___COLLECT_LEAF_ALLOCATABLE;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA___GET_EXPRESSION_TYPE = RBACorePackage.ALLOCATABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = RBACorePackage.ALLOCATABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.view.impl.AreaSetImpl <em>Area Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.AreaSetImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getAreaSet()
	 * @generated
	 */
	int AREA_SET = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SET__DESCRIPTION = RBACorePackage.ALLOCATABLE_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SET__NAME = RBACorePackage.ALLOCATABLE_SET__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SET__TAGS = RBACorePackage.ALLOCATABLE_SET__TAGS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SET__CONTENTS = RBACorePackage.ALLOCATABLE_SET__CONTENTS;

	/**
	 * The feature id for the '<em><b>Allocatable Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SET__ALLOCATABLE_GROUP = RBACorePackage.ALLOCATABLE_SET__ALLOCATABLE_GROUP;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SET__TARGET = RBACorePackage.ALLOCATABLE_SET__TARGET;

	/**
	 * The number of structural features of the '<em>Area Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SET_FEATURE_COUNT = RBACorePackage.ALLOCATABLE_SET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Contents List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SET___GET_CONTENTS_LIST = RBACorePackage.ALLOCATABLE_SET___GET_CONTENTS_LIST;

	/**
	 * The operation id for the '<em>Collect Leaf Allocatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SET___COLLECT_LEAF_ALLOCATABLE = RBACorePackage.ALLOCATABLE_SET___COLLECT_LEAF_ALLOCATABLE;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SET___GET_EXPRESSION_TYPE = RBACorePackage.ALLOCATABLE_SET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Area Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_SET_OPERATION_COUNT = RBACorePackage.ALLOCATABLE_SET_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.view.impl.SizeIdentifierImpl <em>Size Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.SizeIdentifierImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getSizeIdentifier()
	 * @generated
	 */
	int SIZE_IDENTIFIER = 13;

	/**
	 * The number of structural features of the '<em>Size Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_IDENTIFIER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Size Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rba.view.impl.SizeImpl <em>Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.SizeImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__DESCRIPTION = RBACorePackage.PACKAGABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__NAME = RBACorePackage.PACKAGABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__WIDTH = RBACorePackage.PACKAGABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__HEIGHT = RBACorePackage.PACKAGABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FEATURE_COUNT = RBACorePackage.PACKAGABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATION_COUNT = RBACorePackage.PACKAGABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.view.impl.SizeReferenceImpl <em>Size Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.SizeReferenceImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getSizeReference()
	 * @generated
	 */
	int SIZE_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_REFERENCE__SIZE = SIZE_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Size Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_REFERENCE_FEATURE_COUNT = SIZE_IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Size Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_REFERENCE_OPERATION_COUNT = SIZE_IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.view.impl.OffsetImpl <em>Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.OffsetImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getOffset()
	 * @generated
	 */
	int OFFSET = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__DESCRIPTION = RBACorePackage.PACKAGABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__NAME = RBACorePackage.PACKAGABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__X = RBACorePackage.PACKAGABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__Y = RBACorePackage.PACKAGABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET__SIZE = RBACorePackage.PACKAGABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_FEATURE_COUNT = RBACorePackage.PACKAGABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_OPERATION_COUNT = RBACorePackage.PACKAGABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.view.impl.AreaOperatorImpl <em>Area Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.AreaOperatorImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getAreaOperator()
	 * @generated
	 */
	int AREA_OPERATOR = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATOR__TYPE = RBACorePackage.ALLOCATABLE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATOR__EXPRESSION = RBACorePackage.ALLOCATABLE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATOR__LET_STATEMENTS = RBACorePackage.ALLOCATABLE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATOR__OPERAND = RBACorePackage.ALLOCATABLE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Area Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATOR_FEATURE_COUNT = RBACorePackage.ALLOCATABLE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATOR___GET_UNDERLYING_TYPE = RBACorePackage.ALLOCATABLE_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATOR___GET_SYMBOL = RBACorePackage.ALLOCATABLE_OPERATOR___GET_SYMBOL;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATOR___GET_EXPRESSION_TEXT = RBACorePackage.ALLOCATABLE_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The number of operations of the '<em>Area Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATOR_OPERATION_COUNT = RBACorePackage.ALLOCATABLE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.view.impl.IsDisplayedImpl <em>Is Displayed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.IsDisplayedImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getIsDisplayed()
	 * @generated
	 */
	int IS_DISPLAYED = 18;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED__TYPE = AREA_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED__EXPRESSION = AREA_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED__LET_STATEMENTS = AREA_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED__OPERAND = AREA_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Displayed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED_FEATURE_COUNT = AREA_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED___GET_EXPRESSION_TEXT = AREA_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED___GET_SYMBOL = AREA_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED___GET_UNDERLYING_TYPE = AREA_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Is Displayed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED_OPERATION_COUNT = AREA_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.view.impl.DisplayingContentImpl <em>Displaying Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.DisplayingContentImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getDisplayingContent()
	 * @generated
	 */
	int DISPLAYING_CONTENT = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYING_CONTENT__TYPE = AREA_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYING_CONTENT__EXPRESSION = AREA_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYING_CONTENT__LET_STATEMENTS = AREA_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYING_CONTENT__OPERAND = AREA_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Displaying Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYING_CONTENT_FEATURE_COUNT = AREA_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYING_CONTENT___GET_EXPRESSION_TEXT = AREA_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYING_CONTENT___GET_SYMBOL = AREA_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYING_CONTENT___GET_UNDERLYING_TYPE = AREA_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Displaying Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYING_CONTENT_OPERATION_COUNT = AREA_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.view.impl.IsHiddenImpl <em>Is Hidden</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.IsHiddenImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getIsHidden()
	 * @generated
	 */
	int IS_HIDDEN = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_HIDDEN__TYPE = AREA_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_HIDDEN__EXPRESSION = AREA_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_HIDDEN__LET_STATEMENTS = AREA_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_HIDDEN__OPERAND = AREA_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Hidden</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_HIDDEN_FEATURE_COUNT = AREA_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_HIDDEN___GET_EXPRESSION_TEXT = AREA_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_HIDDEN___GET_SYMBOL = AREA_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_HIDDEN___GET_UNDERLYING_TYPE = AREA_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Is Hidden</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_HIDDEN_OPERATION_COUNT = AREA_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.view.impl.ViewContentOperatorImpl <em>View Content Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.ViewContentOperatorImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getViewContentOperator()
	 * @generated
	 */
	int VIEW_CONTENT_OPERATOR = 21;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_OPERATOR__TYPE = RBACorePackage.CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_OPERATOR__EXPRESSION = RBACorePackage.CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_OPERATOR__LET_STATEMENTS = RBACorePackage.CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_OPERATOR__OPERAND = RBACorePackage.CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>View Content Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_OPERATOR_FEATURE_COUNT = RBACorePackage.CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_OPERATOR___GET_SYMBOL = RBACorePackage.CONTENT_OPERATOR___GET_SYMBOL;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_OPERATOR___GET_EXPRESSION_TEXT = RBACorePackage.CONTENT_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_OPERATOR___GET_UNDERLYING_TYPE = RBACorePackage.CONTENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>View Content Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTENT_OPERATOR_OPERATION_COUNT = RBACorePackage.CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.view.impl.IsVisibleImpl <em>Is Visible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.IsVisibleImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getIsVisible()
	 * @generated
	 */
	int IS_VISIBLE = 22;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VISIBLE__TYPE = VIEW_CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VISIBLE__EXPRESSION = VIEW_CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VISIBLE__LET_STATEMENTS = VIEW_CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VISIBLE__OPERAND = VIEW_CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Visible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VISIBLE_FEATURE_COUNT = VIEW_CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VISIBLE___GET_EXPRESSION_TEXT = VIEW_CONTENT_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VISIBLE___GET_UNDERLYING_TYPE = VIEW_CONTENT_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VISIBLE___GET_SYMBOL = VIEW_CONTENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Visible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_VISIBLE_OPERATION_COUNT = VIEW_CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.view.impl.AllInstanceOfAreaImpl <em>All Instance Of Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.AllInstanceOfAreaImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getAllInstanceOfArea()
	 * @generated
	 */
	int ALL_INSTANCE_OF_AREA = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_AREA__TYPE = RBACorePackage.SET_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_AREA__EXPRESSION = RBACorePackage.SET_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_AREA__LET_STATEMENTS = RBACorePackage.SET_EXPRESSION__LET_STATEMENTS;

	/**
	 * The number of structural features of the '<em>All Instance Of Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_AREA_FEATURE_COUNT = RBACorePackage.SET_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_AREA___GET_EXPRESSION_TEXT = RBACorePackage.SET_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_AREA___GET_UNDERLYING_TYPE = RBACorePackage.SET_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Instance Of Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_AREA_OPERATION_COUNT = RBACorePackage.SET_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.view.impl.AllInstanceOfViewContentImpl <em>All Instance Of View Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.AllInstanceOfViewContentImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getAllInstanceOfViewContent()
	 * @generated
	 */
	int ALL_INSTANCE_OF_VIEW_CONTENT = 24;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_VIEW_CONTENT__TYPE = RBACorePackage.SET_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_VIEW_CONTENT__EXPRESSION = RBACorePackage.SET_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_VIEW_CONTENT__LET_STATEMENTS = RBACorePackage.SET_EXPRESSION__LET_STATEMENTS;

	/**
	 * The number of structural features of the '<em>All Instance Of View Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_VIEW_CONTENT_FEATURE_COUNT = RBACorePackage.SET_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_VIEW_CONTENT___GET_EXPRESSION_TEXT = RBACorePackage.SET_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_VIEW_CONTENT___GET_UNDERLYING_TYPE = RBACorePackage.SET_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Instance Of View Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_VIEW_CONTENT_OPERATION_COUNT = RBACorePackage.SET_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.view.impl.IsDisplayedOnImpl <em>Is Displayed On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.IsDisplayedOnImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getIsDisplayedOn()
	 * @generated
	 */
	int IS_DISPLAYED_ON = 25;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED_ON__TYPE = VIEW_CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED_ON__EXPRESSION = VIEW_CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED_ON__LET_STATEMENTS = VIEW_CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED_ON__OPERAND = VIEW_CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Displayed On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED_ON_FEATURE_COUNT = VIEW_CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED_ON___GET_EXPANDED = VIEW_CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED_ON___CAN_EXPAND = VIEW_CONTENT_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED_ON___GET_SYMBOL = VIEW_CONTENT_OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED_ON___GET_UNDERLYING_TYPE = VIEW_CONTENT_OPERATOR_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED_ON___GET_EXPRESSION_TEXT = VIEW_CONTENT_OPERATOR_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Is Displayed On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_DISPLAYED_ON_OPERATION_COUNT = VIEW_CONTENT_OPERATOR_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link rba.view.impl.IsChangedDisplayImpl <em>Is Changed Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.IsChangedDisplayImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getIsChangedDisplay()
	 * @generated
	 */
	int IS_CHANGED_DISPLAY = 26;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_DISPLAY__TYPE = AREA_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_DISPLAY__EXPRESSION = AREA_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_DISPLAY__LET_STATEMENTS = AREA_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_DISPLAY__OPERAND = AREA_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Changed Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_DISPLAY_FEATURE_COUNT = AREA_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_DISPLAY___GET_EXPRESSION_TEXT = AREA_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_DISPLAY___GET_EXPANDED = AREA_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_DISPLAY___CAN_EXPAND = AREA_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_DISPLAY___GET_SYMBOL = AREA_OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_DISPLAY___GET_UNDERLYING_TYPE = AREA_OPERATOR_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Is Changed Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_DISPLAY_OPERATION_COUNT = AREA_OPERATOR_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link rba.view.impl.IsTranslatedViewToImpl <em>Is Translated View To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.IsTranslatedViewToImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getIsTranslatedViewTo()
	 * @generated
	 */
	int IS_TRANSLATED_VIEW_TO = 27;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_VIEW_TO__TYPE = AREA_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_VIEW_TO__EXPRESSION = AREA_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_VIEW_TO__LET_STATEMENTS = AREA_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_VIEW_TO__OPERAND = AREA_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Translated View To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_VIEW_TO_FEATURE_COUNT = AREA_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_VIEW_TO___GET_EXPANDED = AREA_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_VIEW_TO___CAN_EXPAND = AREA_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_VIEW_TO___GET_SYMBOL = AREA_OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_VIEW_TO___GET_UNDERLYING_TYPE = AREA_OPERATOR_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_VIEW_TO___GET_EXPRESSION_TEXT = AREA_OPERATOR_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Is Translated View To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_VIEW_TO_OPERATION_COUNT = AREA_OPERATOR_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link rba.view.impl.HideLowerPriorityImpl <em>Hide Lower Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.impl.HideLowerPriorityImpl
	 * @see rba.view.impl.RBAViewPackageImpl#getHideLowerPriority()
	 * @generated
	 */
	int HIDE_LOWER_PRIORITY = 28;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_LOWER_PRIORITY__TYPE = RBACorePackage.OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_LOWER_PRIORITY__EXPRESSION = RBACorePackage.OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_LOWER_PRIORITY__LET_STATEMENTS = RBACorePackage.OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_LOWER_PRIORITY__OPERAND = RBACorePackage.OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Hide Lower Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_LOWER_PRIORITY_FEATURE_COUNT = RBACorePackage.OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_LOWER_PRIORITY___GET_EXPANDED = RBACorePackage.OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_LOWER_PRIORITY___CAN_EXPAND = RBACorePackage.OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_LOWER_PRIORITY___GET_SYMBOL = RBACorePackage.OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_LOWER_PRIORITY___GET_UNDERLYING_TYPE = RBACorePackage.OPERATOR_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_LOWER_PRIORITY___GET_EXPRESSION_TEXT = RBACorePackage.OPERATOR_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Hide Lower Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_LOWER_PRIORITY_OPERATION_COUNT = RBACorePackage.OPERATOR_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link rba.view.BasePoint <em>Base Point</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.view.BasePoint
	 * @see rba.view.impl.RBAViewPackageImpl#getBasePoint()
	 * @generated
	 */
	int BASE_POINT = 29;

	/**
	 * Returns the meta object for class '{@link rba.view.ViewContent <em>View Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Content</em>'.
	 * @see rba.view.ViewContent
	 * @generated
	 */
	EClass getViewContent();

	/**
	 * Returns the meta object for the containment reference list '{@link rba.view.ViewContent#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Size</em>'.
	 * @see rba.view.ViewContent#getSize()
	 * @see #getViewContent()
	 * @generated
	 */
	EReference getViewContent_Size();

	/**
	 * Returns the meta object for the '{@link rba.view.ViewContent#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.view.ViewContent#getExpressionType()
	 * @generated
	 */
	EOperation getViewContent__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.view.ViewContentSet <em>View Content Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Content Set</em>'.
	 * @see rba.view.ViewContentSet
	 * @generated
	 */
	EClass getViewContentSet();

	/**
	 * Returns the meta object for the '{@link rba.view.ViewContentSet#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.view.ViewContentSet#getExpressionType()
	 * @generated
	 */
	EOperation getViewContentSet__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.view.ViewContentState <em>View Content State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Content State</em>'.
	 * @see rba.view.ViewContentState
	 * @generated
	 */
	EClass getViewContentState();

	/**
	 * Returns the meta object for the '{@link rba.view.ViewContentState#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.view.ViewContentState#getExpressionType()
	 * @generated
	 */
	EOperation getViewContentState__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.view.LayoutManager <em>Layout Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Manager</em>'.
	 * @see rba.view.LayoutManager
	 * @generated
	 */
	EClass getLayoutManager();

	/**
	 * Returns the meta object for the '{@link rba.view.LayoutManager#collectLeafArea() <em>Collect Leaf Area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Leaf Area</em>' operation.
	 * @see rba.view.LayoutManager#collectLeafArea()
	 * @generated
	 */
	EOperation getLayoutManager__CollectLeafArea();

	/**
	 * Returns the meta object for class '{@link rba.view.AlignedLayout <em>Aligned Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aligned Layout</em>'.
	 * @see rba.view.AlignedLayout
	 * @generated
	 */
	EClass getAlignedLayout();

	/**
	 * Returns the meta object for the reference list '{@link rba.view.AlignedLayout#getSubarea <em>Subarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subarea</em>'.
	 * @see rba.view.AlignedLayout#getSubarea()
	 * @see #getAlignedLayout()
	 * @generated
	 */
	EReference getAlignedLayout_Subarea();

	/**
	 * Returns the meta object for the attribute '{@link rba.view.AlignedLayout#getBasePoint <em>Base Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Point</em>'.
	 * @see rba.view.AlignedLayout#getBasePoint()
	 * @see #getAlignedLayout()
	 * @generated
	 */
	EAttribute getAlignedLayout_BasePoint();

	/**
	 * Returns the meta object for the '{@link rba.view.AlignedLayout#collectLeafArea() <em>Collect Leaf Area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Leaf Area</em>' operation.
	 * @see rba.view.AlignedLayout#collectLeafArea()
	 * @generated
	 */
	EOperation getAlignedLayout__CollectLeafArea();

	/**
	 * Returns the meta object for class '{@link rba.view.VerticalLayout <em>Vertical Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Layout</em>'.
	 * @see rba.view.VerticalLayout
	 * @generated
	 */
	EClass getVerticalLayout();

	/**
	 * Returns the meta object for class '{@link rba.view.HorizontalLayout <em>Horizontal Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Layout</em>'.
	 * @see rba.view.HorizontalLayout
	 * @generated
	 */
	EClass getHorizontalLayout();

	/**
	 * Returns the meta object for class '{@link rba.view.FixedPositionLayout <em>Fixed Position Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Position Layout</em>'.
	 * @see rba.view.FixedPositionLayout
	 * @generated
	 */
	EClass getFixedPositionLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link rba.view.FixedPositionLayout#getSubAreaPosition <em>Sub Area Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Area Position</em>'.
	 * @see rba.view.FixedPositionLayout#getSubAreaPosition()
	 * @see #getFixedPositionLayout()
	 * @generated
	 */
	EReference getFixedPositionLayout_SubAreaPosition();

	/**
	 * Returns the meta object for the '{@link rba.view.FixedPositionLayout#collectLeafArea() <em>Collect Leaf Area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Leaf Area</em>' operation.
	 * @see rba.view.FixedPositionLayout#collectLeafArea()
	 * @generated
	 */
	EOperation getFixedPositionLayout__CollectLeafArea();

	/**
	 * Returns the meta object for class '{@link rba.view.PositionContainer <em>Position Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Container</em>'.
	 * @see rba.view.PositionContainer
	 * @generated
	 */
	EClass getPositionContainer();

	/**
	 * Returns the meta object for the attribute '{@link rba.view.PositionContainer#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see rba.view.PositionContainer#getX()
	 * @see #getPositionContainer()
	 * @generated
	 */
	EAttribute getPositionContainer_X();

	/**
	 * Returns the meta object for the attribute '{@link rba.view.PositionContainer#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see rba.view.PositionContainer#getY()
	 * @see #getPositionContainer()
	 * @generated
	 */
	EAttribute getPositionContainer_Y();

	/**
	 * Returns the meta object for the attribute '{@link rba.view.PositionContainer#getBasePoint <em>Base Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Point</em>'.
	 * @see rba.view.PositionContainer#getBasePoint()
	 * @see #getPositionContainer()
	 * @generated
	 */
	EAttribute getPositionContainer_BasePoint();

	/**
	 * Returns the meta object for the reference '{@link rba.view.PositionContainer#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Area</em>'.
	 * @see rba.view.PositionContainer#getArea()
	 * @see #getPositionContainer()
	 * @generated
	 */
	EReference getPositionContainer_Area();

	/**
	 * Returns the meta object for the containment reference list '{@link rba.view.PositionContainer#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offset</em>'.
	 * @see rba.view.PositionContainer#getOffset()
	 * @see #getPositionContainer()
	 * @generated
	 */
	EReference getPositionContainer_Offset();

	/**
	 * Returns the meta object for class '{@link rba.view.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display</em>'.
	 * @see rba.view.Display
	 * @generated
	 */
	EClass getDisplay();

	/**
	 * Returns the meta object for the containment reference '{@link rba.view.Display#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see rba.view.Display#getRoot()
	 * @see #getDisplay()
	 * @generated
	 */
	EReference getDisplay_Root();

	/**
	 * Returns the meta object for the containment reference '{@link rba.view.Display#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see rba.view.Display#getSize()
	 * @see #getDisplay()
	 * @generated
	 */
	EReference getDisplay_Size();

	/**
	 * Returns the meta object for class '{@link rba.view.CompositeArea <em>Composite Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Area</em>'.
	 * @see rba.view.CompositeArea
	 * @generated
	 */
	EClass getCompositeArea();

	/**
	 * Returns the meta object for the containment reference '{@link rba.view.CompositeArea#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see rba.view.CompositeArea#getLayout()
	 * @see #getCompositeArea()
	 * @generated
	 */
	EReference getCompositeArea_Layout();

	/**
	 * Returns the meta object for the '{@link rba.view.CompositeArea#collectLeafArea() <em>Collect Leaf Area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Leaf Area</em>' operation.
	 * @see rba.view.CompositeArea#collectLeafArea()
	 * @generated
	 */
	EOperation getCompositeArea__CollectLeafArea();

	/**
	 * Returns the meta object for the '{@link rba.view.CompositeArea#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.view.CompositeArea#getExpressionType()
	 * @generated
	 */
	EOperation getCompositeArea__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.view.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see rba.view.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference '{@link rba.view.Area#getZorder <em>Zorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zorder</em>'.
	 * @see rba.view.Area#getZorder()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Zorder();

	/**
	 * Returns the meta object for the containment reference list '{@link rba.view.Area#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Size</em>'.
	 * @see rba.view.Area#getSize()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Size();

	/**
	 * Returns the meta object for the '{@link rba.view.Area#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.view.Area#getExpressionType()
	 * @generated
	 */
	EOperation getArea__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.view.AreaSet <em>Area Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Set</em>'.
	 * @see rba.view.AreaSet
	 * @generated
	 */
	EClass getAreaSet();

	/**
	 * Returns the meta object for the '{@link rba.view.AreaSet#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.view.AreaSet#getExpressionType()
	 * @generated
	 */
	EOperation getAreaSet__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.view.SizeIdentifier <em>Size Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Identifier</em>'.
	 * @see rba.view.SizeIdentifier
	 * @generated
	 */
	EClass getSizeIdentifier();

	/**
	 * Returns the meta object for class '{@link rba.view.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size</em>'.
	 * @see rba.view.Size
	 * @generated
	 */
	EClass getSize();

	/**
	 * Returns the meta object for the attribute '{@link rba.view.Size#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see rba.view.Size#getWidth()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Width();

	/**
	 * Returns the meta object for the attribute '{@link rba.view.Size#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see rba.view.Size#getHeight()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Height();

	/**
	 * Returns the meta object for class '{@link rba.view.SizeReference <em>Size Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Reference</em>'.
	 * @see rba.view.SizeReference
	 * @generated
	 */
	EClass getSizeReference();

	/**
	 * Returns the meta object for the reference '{@link rba.view.SizeReference#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Size</em>'.
	 * @see rba.view.SizeReference#getSize()
	 * @see #getSizeReference()
	 * @generated
	 */
	EReference getSizeReference_Size();

	/**
	 * Returns the meta object for class '{@link rba.view.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset</em>'.
	 * @see rba.view.Offset
	 * @generated
	 */
	EClass getOffset();

	/**
	 * Returns the meta object for the attribute '{@link rba.view.Offset#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see rba.view.Offset#getX()
	 * @see #getOffset()
	 * @generated
	 */
	EAttribute getOffset_X();

	/**
	 * Returns the meta object for the attribute '{@link rba.view.Offset#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see rba.view.Offset#getY()
	 * @see #getOffset()
	 * @generated
	 */
	EAttribute getOffset_Y();

	/**
	 * Returns the meta object for the containment reference '{@link rba.view.Offset#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see rba.view.Offset#getSize()
	 * @see #getOffset()
	 * @generated
	 */
	EReference getOffset_Size();

	/**
	 * Returns the meta object for class '{@link rba.view.AreaOperator <em>Area Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Operator</em>'.
	 * @see rba.view.AreaOperator
	 * @generated
	 */
	EClass getAreaOperator();

	/**
	 * Returns the meta object for class '{@link rba.view.IsDisplayed <em>Is Displayed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Displayed</em>'.
	 * @see rba.view.IsDisplayed
	 * @generated
	 */
	EClass getIsDisplayed();

	/**
	 * Returns the meta object for the '{@link rba.view.IsDisplayed#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.view.IsDisplayed#getSymbol()
	 * @generated
	 */
	EOperation getIsDisplayed__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.view.IsDisplayed#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.view.IsDisplayed#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsDisplayed__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.view.DisplayingContent <em>Displaying Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Displaying Content</em>'.
	 * @see rba.view.DisplayingContent
	 * @generated
	 */
	EClass getDisplayingContent();

	/**
	 * Returns the meta object for the '{@link rba.view.DisplayingContent#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.view.DisplayingContent#getSymbol()
	 * @generated
	 */
	EOperation getDisplayingContent__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.view.DisplayingContent#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.view.DisplayingContent#getUnderlyingType()
	 * @generated
	 */
	EOperation getDisplayingContent__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.view.IsHidden <em>Is Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Hidden</em>'.
	 * @see rba.view.IsHidden
	 * @generated
	 */
	EClass getIsHidden();

	/**
	 * Returns the meta object for the '{@link rba.view.IsHidden#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.view.IsHidden#getSymbol()
	 * @generated
	 */
	EOperation getIsHidden__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.view.IsHidden#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.view.IsHidden#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsHidden__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.view.ViewContentOperator <em>View Content Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Content Operator</em>'.
	 * @see rba.view.ViewContentOperator
	 * @generated
	 */
	EClass getViewContentOperator();

	/**
	 * Returns the meta object for the '{@link rba.view.ViewContentOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.view.ViewContentOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getViewContentOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.view.IsVisible <em>Is Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Visible</em>'.
	 * @see rba.view.IsVisible
	 * @generated
	 */
	EClass getIsVisible();

	/**
	 * Returns the meta object for the '{@link rba.view.IsVisible#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.view.IsVisible#getSymbol()
	 * @generated
	 */
	EOperation getIsVisible__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.view.AllInstanceOfArea <em>All Instance Of Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Instance Of Area</em>'.
	 * @see rba.view.AllInstanceOfArea
	 * @generated
	 */
	EClass getAllInstanceOfArea();

	/**
	 * Returns the meta object for the '{@link rba.view.AllInstanceOfArea#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.view.AllInstanceOfArea#getExpressionText()
	 * @generated
	 */
	EOperation getAllInstanceOfArea__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.view.AllInstanceOfArea#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.view.AllInstanceOfArea#getUnderlyingType()
	 * @generated
	 */
	EOperation getAllInstanceOfArea__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.view.AllInstanceOfViewContent <em>All Instance Of View Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Instance Of View Content</em>'.
	 * @see rba.view.AllInstanceOfViewContent
	 * @generated
	 */
	EClass getAllInstanceOfViewContent();

	/**
	 * Returns the meta object for the '{@link rba.view.AllInstanceOfViewContent#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.view.AllInstanceOfViewContent#getExpressionText()
	 * @generated
	 */
	EOperation getAllInstanceOfViewContent__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.view.AllInstanceOfViewContent#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.view.AllInstanceOfViewContent#getUnderlyingType()
	 * @generated
	 */
	EOperation getAllInstanceOfViewContent__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.view.IsDisplayedOn <em>Is Displayed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Displayed On</em>'.
	 * @see rba.view.IsDisplayedOn
	 * @generated
	 */
	EClass getIsDisplayedOn();

	/**
	 * Returns the meta object for the '{@link rba.view.IsDisplayedOn#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.view.IsDisplayedOn#getSymbol()
	 * @generated
	 */
	EOperation getIsDisplayedOn__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.view.IsDisplayedOn#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.view.IsDisplayedOn#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsDisplayedOn__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.view.IsDisplayedOn#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.view.IsDisplayedOn#getExpressionText()
	 * @generated
	 */
	EOperation getIsDisplayedOn__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.view.IsChangedDisplay <em>Is Changed Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Changed Display</em>'.
	 * @see rba.view.IsChangedDisplay
	 * @generated
	 */
	EClass getIsChangedDisplay();

	/**
	 * Returns the meta object for the '{@link rba.view.IsChangedDisplay#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.view.IsChangedDisplay#getSymbol()
	 * @generated
	 */
	EOperation getIsChangedDisplay__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.view.IsChangedDisplay#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.view.IsChangedDisplay#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsChangedDisplay__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.view.IsTranslatedViewTo <em>Is Translated View To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Translated View To</em>'.
	 * @see rba.view.IsTranslatedViewTo
	 * @generated
	 */
	EClass getIsTranslatedViewTo();

	/**
	 * Returns the meta object for the '{@link rba.view.IsTranslatedViewTo#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.view.IsTranslatedViewTo#getSymbol()
	 * @generated
	 */
	EOperation getIsTranslatedViewTo__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.view.IsTranslatedViewTo#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.view.IsTranslatedViewTo#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsTranslatedViewTo__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.view.IsTranslatedViewTo#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.view.IsTranslatedViewTo#getExpressionText()
	 * @generated
	 */
	EOperation getIsTranslatedViewTo__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.view.HideLowerPriority <em>Hide Lower Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hide Lower Priority</em>'.
	 * @see rba.view.HideLowerPriority
	 * @generated
	 */
	EClass getHideLowerPriority();

	/**
	 * Returns the meta object for the '{@link rba.view.HideLowerPriority#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.view.HideLowerPriority#getSymbol()
	 * @generated
	 */
	EOperation getHideLowerPriority__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.view.HideLowerPriority#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.view.HideLowerPriority#getUnderlyingType()
	 * @generated
	 */
	EOperation getHideLowerPriority__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.view.HideLowerPriority#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.view.HideLowerPriority#getExpressionText()
	 * @generated
	 */
	EOperation getHideLowerPriority__GetExpressionText();

	/**
	 * Returns the meta object for enum '{@link rba.view.BasePoint <em>Base Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Base Point</em>'.
	 * @see rba.view.BasePoint
	 * @generated
	 */
	EEnum getBasePoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RBAViewFactory getRBAViewFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rba.view.impl.ViewContentImpl <em>View Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.ViewContentImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getViewContent()
		 * @generated
		 */
		EClass VIEW_CONTENT = eINSTANCE.getViewContent();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_CONTENT__SIZE = eINSTANCE.getViewContent_Size();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW_CONTENT___GET_EXPRESSION_TYPE = eINSTANCE.getViewContent__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.view.impl.ViewContentSetImpl <em>View Content Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.ViewContentSetImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getViewContentSet()
		 * @generated
		 */
		EClass VIEW_CONTENT_SET = eINSTANCE.getViewContentSet();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW_CONTENT_SET___GET_EXPRESSION_TYPE = eINSTANCE.getViewContentSet__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.view.impl.ViewContentStateImpl <em>View Content State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.ViewContentStateImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getViewContentState()
		 * @generated
		 */
		EClass VIEW_CONTENT_STATE = eINSTANCE.getViewContentState();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW_CONTENT_STATE___GET_EXPRESSION_TYPE = eINSTANCE.getViewContentState__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.view.impl.LayoutManagerImpl <em>Layout Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.LayoutManagerImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getLayoutManager()
		 * @generated
		 */
		EClass LAYOUT_MANAGER = eINSTANCE.getLayoutManager();

		/**
		 * The meta object literal for the '<em><b>Collect Leaf Area</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAYOUT_MANAGER___COLLECT_LEAF_AREA = eINSTANCE.getLayoutManager__CollectLeafArea();

		/**
		 * The meta object literal for the '{@link rba.view.impl.AlignedLayoutImpl <em>Aligned Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.AlignedLayoutImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getAlignedLayout()
		 * @generated
		 */
		EClass ALIGNED_LAYOUT = eINSTANCE.getAlignedLayout();

		/**
		 * The meta object literal for the '<em><b>Subarea</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIGNED_LAYOUT__SUBAREA = eINSTANCE.getAlignedLayout_Subarea();

		/**
		 * The meta object literal for the '<em><b>Base Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIGNED_LAYOUT__BASE_POINT = eINSTANCE.getAlignedLayout_BasePoint();

		/**
		 * The meta object literal for the '<em><b>Collect Leaf Area</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALIGNED_LAYOUT___COLLECT_LEAF_AREA = eINSTANCE.getAlignedLayout__CollectLeafArea();

		/**
		 * The meta object literal for the '{@link rba.view.impl.VerticalLayoutImpl <em>Vertical Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.VerticalLayoutImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getVerticalLayout()
		 * @generated
		 */
		EClass VERTICAL_LAYOUT = eINSTANCE.getVerticalLayout();

		/**
		 * The meta object literal for the '{@link rba.view.impl.HorizontalLayoutImpl <em>Horizontal Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.HorizontalLayoutImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getHorizontalLayout()
		 * @generated
		 */
		EClass HORIZONTAL_LAYOUT = eINSTANCE.getHorizontalLayout();

		/**
		 * The meta object literal for the '{@link rba.view.impl.FixedPositionLayoutImpl <em>Fixed Position Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.FixedPositionLayoutImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getFixedPositionLayout()
		 * @generated
		 */
		EClass FIXED_POSITION_LAYOUT = eINSTANCE.getFixedPositionLayout();

		/**
		 * The meta object literal for the '<em><b>Sub Area Position</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_POSITION_LAYOUT__SUB_AREA_POSITION = eINSTANCE.getFixedPositionLayout_SubAreaPosition();

		/**
		 * The meta object literal for the '<em><b>Collect Leaf Area</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FIXED_POSITION_LAYOUT___COLLECT_LEAF_AREA = eINSTANCE.getFixedPositionLayout__CollectLeafArea();

		/**
		 * The meta object literal for the '{@link rba.view.impl.PositionContainerImpl <em>Position Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.PositionContainerImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getPositionContainer()
		 * @generated
		 */
		EClass POSITION_CONTAINER = eINSTANCE.getPositionContainer();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_CONTAINER__X = eINSTANCE.getPositionContainer_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_CONTAINER__Y = eINSTANCE.getPositionContainer_Y();

		/**
		 * The meta object literal for the '<em><b>Base Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_CONTAINER__BASE_POINT = eINSTANCE.getPositionContainer_BasePoint();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_CONTAINER__AREA = eINSTANCE.getPositionContainer_Area();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_CONTAINER__OFFSET = eINSTANCE.getPositionContainer_Offset();

		/**
		 * The meta object literal for the '{@link rba.view.impl.DisplayImpl <em>Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.DisplayImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getDisplay()
		 * @generated
		 */
		EClass DISPLAY = eINSTANCE.getDisplay();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY__ROOT = eINSTANCE.getDisplay_Root();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY__SIZE = eINSTANCE.getDisplay_Size();

		/**
		 * The meta object literal for the '{@link rba.view.impl.CompositeAreaImpl <em>Composite Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.CompositeAreaImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getCompositeArea()
		 * @generated
		 */
		EClass COMPOSITE_AREA = eINSTANCE.getCompositeArea();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_AREA__LAYOUT = eINSTANCE.getCompositeArea_Layout();

		/**
		 * The meta object literal for the '<em><b>Collect Leaf Area</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE_AREA___COLLECT_LEAF_AREA = eINSTANCE.getCompositeArea__CollectLeafArea();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE_AREA___GET_EXPRESSION_TYPE = eINSTANCE.getCompositeArea__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.view.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.AreaImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Zorder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__ZORDER = eINSTANCE.getArea_Zorder();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__SIZE = eINSTANCE.getArea_Size();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AREA___GET_EXPRESSION_TYPE = eINSTANCE.getArea__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.view.impl.AreaSetImpl <em>Area Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.AreaSetImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getAreaSet()
		 * @generated
		 */
		EClass AREA_SET = eINSTANCE.getAreaSet();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AREA_SET___GET_EXPRESSION_TYPE = eINSTANCE.getAreaSet__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.view.impl.SizeIdentifierImpl <em>Size Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.SizeIdentifierImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getSizeIdentifier()
		 * @generated
		 */
		EClass SIZE_IDENTIFIER = eINSTANCE.getSizeIdentifier();

		/**
		 * The meta object literal for the '{@link rba.view.impl.SizeImpl <em>Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.SizeImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getSize()
		 * @generated
		 */
		EClass SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__WIDTH = eINSTANCE.getSize_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__HEIGHT = eINSTANCE.getSize_Height();

		/**
		 * The meta object literal for the '{@link rba.view.impl.SizeReferenceImpl <em>Size Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.SizeReferenceImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getSizeReference()
		 * @generated
		 */
		EClass SIZE_REFERENCE = eINSTANCE.getSizeReference();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIZE_REFERENCE__SIZE = eINSTANCE.getSizeReference_Size();

		/**
		 * The meta object literal for the '{@link rba.view.impl.OffsetImpl <em>Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.OffsetImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getOffset()
		 * @generated
		 */
		EClass OFFSET = eINSTANCE.getOffset();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFSET__X = eINSTANCE.getOffset_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFSET__Y = eINSTANCE.getOffset_Y();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFSET__SIZE = eINSTANCE.getOffset_Size();

		/**
		 * The meta object literal for the '{@link rba.view.impl.AreaOperatorImpl <em>Area Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.AreaOperatorImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getAreaOperator()
		 * @generated
		 */
		EClass AREA_OPERATOR = eINSTANCE.getAreaOperator();

		/**
		 * The meta object literal for the '{@link rba.view.impl.IsDisplayedImpl <em>Is Displayed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.IsDisplayedImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getIsDisplayed()
		 * @generated
		 */
		EClass IS_DISPLAYED = eINSTANCE.getIsDisplayed();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_DISPLAYED___GET_SYMBOL = eINSTANCE.getIsDisplayed__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_DISPLAYED___GET_UNDERLYING_TYPE = eINSTANCE.getIsDisplayed__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.view.impl.DisplayingContentImpl <em>Displaying Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.DisplayingContentImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getDisplayingContent()
		 * @generated
		 */
		EClass DISPLAYING_CONTENT = eINSTANCE.getDisplayingContent();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISPLAYING_CONTENT___GET_SYMBOL = eINSTANCE.getDisplayingContent__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISPLAYING_CONTENT___GET_UNDERLYING_TYPE = eINSTANCE.getDisplayingContent__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.view.impl.IsHiddenImpl <em>Is Hidden</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.IsHiddenImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getIsHidden()
		 * @generated
		 */
		EClass IS_HIDDEN = eINSTANCE.getIsHidden();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_HIDDEN___GET_SYMBOL = eINSTANCE.getIsHidden__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_HIDDEN___GET_UNDERLYING_TYPE = eINSTANCE.getIsHidden__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.view.impl.ViewContentOperatorImpl <em>View Content Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.ViewContentOperatorImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getViewContentOperator()
		 * @generated
		 */
		EClass VIEW_CONTENT_OPERATOR = eINSTANCE.getViewContentOperator();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW_CONTENT_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE.getViewContentOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.view.impl.IsVisibleImpl <em>Is Visible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.IsVisibleImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getIsVisible()
		 * @generated
		 */
		EClass IS_VISIBLE = eINSTANCE.getIsVisible();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_VISIBLE___GET_SYMBOL = eINSTANCE.getIsVisible__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.view.impl.AllInstanceOfAreaImpl <em>All Instance Of Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.AllInstanceOfAreaImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getAllInstanceOfArea()
		 * @generated
		 */
		EClass ALL_INSTANCE_OF_AREA = eINSTANCE.getAllInstanceOfArea();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALL_INSTANCE_OF_AREA___GET_EXPRESSION_TEXT = eINSTANCE.getAllInstanceOfArea__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALL_INSTANCE_OF_AREA___GET_UNDERLYING_TYPE = eINSTANCE.getAllInstanceOfArea__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.view.impl.AllInstanceOfViewContentImpl <em>All Instance Of View Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.AllInstanceOfViewContentImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getAllInstanceOfViewContent()
		 * @generated
		 */
		EClass ALL_INSTANCE_OF_VIEW_CONTENT = eINSTANCE.getAllInstanceOfViewContent();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALL_INSTANCE_OF_VIEW_CONTENT___GET_EXPRESSION_TEXT = eINSTANCE
				.getAllInstanceOfViewContent__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALL_INSTANCE_OF_VIEW_CONTENT___GET_UNDERLYING_TYPE = eINSTANCE
				.getAllInstanceOfViewContent__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.view.impl.IsDisplayedOnImpl <em>Is Displayed On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.IsDisplayedOnImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getIsDisplayedOn()
		 * @generated
		 */
		EClass IS_DISPLAYED_ON = eINSTANCE.getIsDisplayedOn();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_DISPLAYED_ON___GET_SYMBOL = eINSTANCE.getIsDisplayedOn__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_DISPLAYED_ON___GET_UNDERLYING_TYPE = eINSTANCE.getIsDisplayedOn__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_DISPLAYED_ON___GET_EXPRESSION_TEXT = eINSTANCE.getIsDisplayedOn__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.view.impl.IsChangedDisplayImpl <em>Is Changed Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.IsChangedDisplayImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getIsChangedDisplay()
		 * @generated
		 */
		EClass IS_CHANGED_DISPLAY = eINSTANCE.getIsChangedDisplay();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_CHANGED_DISPLAY___GET_SYMBOL = eINSTANCE.getIsChangedDisplay__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_CHANGED_DISPLAY___GET_UNDERLYING_TYPE = eINSTANCE.getIsChangedDisplay__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.view.impl.IsTranslatedViewToImpl <em>Is Translated View To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.IsTranslatedViewToImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getIsTranslatedViewTo()
		 * @generated
		 */
		EClass IS_TRANSLATED_VIEW_TO = eINSTANCE.getIsTranslatedViewTo();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_TRANSLATED_VIEW_TO___GET_SYMBOL = eINSTANCE.getIsTranslatedViewTo__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_TRANSLATED_VIEW_TO___GET_UNDERLYING_TYPE = eINSTANCE.getIsTranslatedViewTo__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_TRANSLATED_VIEW_TO___GET_EXPRESSION_TEXT = eINSTANCE.getIsTranslatedViewTo__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.view.impl.HideLowerPriorityImpl <em>Hide Lower Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.impl.HideLowerPriorityImpl
		 * @see rba.view.impl.RBAViewPackageImpl#getHideLowerPriority()
		 * @generated
		 */
		EClass HIDE_LOWER_PRIORITY = eINSTANCE.getHideLowerPriority();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIDE_LOWER_PRIORITY___GET_SYMBOL = eINSTANCE.getHideLowerPriority__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIDE_LOWER_PRIORITY___GET_UNDERLYING_TYPE = eINSTANCE.getHideLowerPriority__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HIDE_LOWER_PRIORITY___GET_EXPRESSION_TEXT = eINSTANCE.getHideLowerPriority__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.view.BasePoint <em>Base Point</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.view.BasePoint
		 * @see rba.view.impl.RBAViewPackageImpl#getBasePoint()
		 * @generated
		 */
		EEnum BASE_POINT = eINSTANCE.getBasePoint();

	}

} //RBAViewPackage
