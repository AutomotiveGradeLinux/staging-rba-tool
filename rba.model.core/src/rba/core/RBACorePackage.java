/**
 */
package rba.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see rba.core.RBACoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface RBACorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.denso.com/ict/rba/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RbaCore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RBACorePackage eINSTANCE = rba.core.impl.RBACorePackageImpl.init();

	/**
	 * The meta object id for the '{@link rba.core.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ModelElementImpl
	 * @see rba.core.impl.RBACorePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rba.core.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.NamedElementImpl
	 * @see rba.core.impl.RBACorePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.core.impl.PackagableElementImpl <em>Packagable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.PackagableElementImpl
	 * @see rba.core.impl.RBACorePackageImpl#getPackagableElement()
	 * @generated
	 */
	int PACKAGABLE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGABLE_ELEMENT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Packagable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Packagable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGABLE_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.core.impl.RuleObjectImpl <em>Rule Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.RuleObjectImpl
	 * @see rba.core.impl.RBACorePackageImpl#getRuleObject()
	 * @generated
	 */
	int RULE_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OBJECT__DESCRIPTION = PACKAGABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OBJECT__NAME = PACKAGABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OBJECT__TAGS = PACKAGABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OBJECT_FEATURE_COUNT = PACKAGABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OBJECT___GET_EXPRESSION_TYPE = PACKAGABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rule Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OBJECT_OPERATION_COUNT = PACKAGABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.AbstractAllocatableImpl <em>Abstract Allocatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.AbstractAllocatableImpl
	 * @see rba.core.impl.RBACorePackageImpl#getAbstractAllocatable()
	 * @generated
	 */
	int ABSTRACT_ALLOCATABLE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ALLOCATABLE__DESCRIPTION = RULE_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ALLOCATABLE__NAME = RULE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ALLOCATABLE__TAGS = RULE_OBJECT__TAGS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ALLOCATABLE__CONTENTS = RULE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocatable Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP = RULE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Allocatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ALLOCATABLE_FEATURE_COUNT = RULE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ALLOCATABLE___GET_EXPRESSION_TYPE = RULE_OBJECT___GET_EXPRESSION_TYPE;

	/**
	 * The operation id for the '<em>Get Contents List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ALLOCATABLE___GET_CONTENTS_LIST = RULE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect Leaf Allocatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ALLOCATABLE___COLLECT_LEAF_ALLOCATABLE = RULE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Allocatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ALLOCATABLE_OPERATION_COUNT = RULE_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.AllocatableImpl <em>Allocatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.AllocatableImpl
	 * @see rba.core.impl.RBACorePackageImpl#getAllocatable()
	 * @generated
	 */
	int ALLOCATABLE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE__DESCRIPTION = ABSTRACT_ALLOCATABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE__NAME = ABSTRACT_ALLOCATABLE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE__TAGS = ABSTRACT_ALLOCATABLE__TAGS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE__CONTENTS = ABSTRACT_ALLOCATABLE__CONTENTS;

	/**
	 * The feature id for the '<em><b>Allocatable Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE__ALLOCATABLE_GROUP = ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP;

	/**
	 * The feature id for the '<em><b>Arbitration Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE__ARBITRATION_POLICY = ABSTRACT_ALLOCATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE__VISIBILITY = ABSTRACT_ALLOCATABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Allocatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_FEATURE_COUNT = ABSTRACT_ALLOCATABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE___GET_EXPRESSION_TYPE = ABSTRACT_ALLOCATABLE___GET_EXPRESSION_TYPE;

	/**
	 * The operation id for the '<em>Get Contents List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE___GET_CONTENTS_LIST = ABSTRACT_ALLOCATABLE___GET_CONTENTS_LIST;

	/**
	 * The operation id for the '<em>Collect Leaf Allocatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE___COLLECT_LEAF_ALLOCATABLE = ABSTRACT_ALLOCATABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Allocatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_OPERATION_COUNT = ABSTRACT_ALLOCATABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.AllocatableSetImpl <em>Allocatable Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.AllocatableSetImpl
	 * @see rba.core.impl.RBACorePackageImpl#getAllocatableSet()
	 * @generated
	 */
	int ALLOCATABLE_SET = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_SET__DESCRIPTION = ABSTRACT_ALLOCATABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_SET__NAME = ABSTRACT_ALLOCATABLE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_SET__TAGS = ABSTRACT_ALLOCATABLE__TAGS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_SET__CONTENTS = ABSTRACT_ALLOCATABLE__CONTENTS;

	/**
	 * The feature id for the '<em><b>Allocatable Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_SET__ALLOCATABLE_GROUP = ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_SET__TARGET = ABSTRACT_ALLOCATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Allocatable Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_SET_FEATURE_COUNT = ABSTRACT_ALLOCATABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_SET___GET_EXPRESSION_TYPE = ABSTRACT_ALLOCATABLE___GET_EXPRESSION_TYPE;

	/**
	 * The operation id for the '<em>Get Contents List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_SET___GET_CONTENTS_LIST = ABSTRACT_ALLOCATABLE___GET_CONTENTS_LIST;

	/**
	 * The operation id for the '<em>Collect Leaf Allocatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_SET___COLLECT_LEAF_ALLOCATABLE = ABSTRACT_ALLOCATABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Allocatable Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_SET_OPERATION_COUNT = ABSTRACT_ALLOCATABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.PackageImpl
	 * @see rba.core.impl.RBACorePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = PACKAGABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = PACKAGABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Packagableelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGABLEELEMENT = PACKAGABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = PACKAGABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = PACKAGABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.core.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ProjectImpl
	 * @see rba.core.impl.RBACorePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Packagableelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PACKAGABLEELEMENT = PACKAGE__PACKAGABLEELEMENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VERSION = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dummy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DUMMY_NAME = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___GET_NAME = PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = PACKAGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.StereotypeImpl <em>Stereotype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.StereotypeImpl
	 * @see rba.core.impl.RBACorePackageImpl#getStereotype()
	 * @generated
	 */
	int STEREOTYPE = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__DESCRIPTION = PACKAGABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__NAME = PACKAGABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__TARGET_MODEL_NAME = PACKAGABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__VARIABLES = PACKAGABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__BODY_TEXT = PACKAGABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_FEATURE_COUNT = PACKAGABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_OPERATION_COUNT = PACKAGABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.core.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.TagImpl
	 * @see rba.core.impl.RBACorePackageImpl#getTag()
	 * @generated
	 */
	int TAG = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__VALUES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.core.impl.AbstractContentImpl <em>Abstract Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.AbstractContentImpl
	 * @see rba.core.impl.RBACorePackageImpl#getAbstractContent()
	 * @generated
	 */
	int ABSTRACT_CONTENT = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT__DESCRIPTION = RULE_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT__NAME = RULE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT__TAGS = RULE_OBJECT__TAGS;

	/**
	 * The feature id for the '<em><b>Content Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT__CONTENT_GROUP = RULE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocatable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT__ALLOCATABLE = RULE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_FEATURE_COUNT = RULE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT___GET_EXPRESSION_TYPE = RULE_OBJECT___GET_EXPRESSION_TYPE;

	/**
	 * The operation id for the '<em>Get Allocatable List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT___GET_ALLOCATABLE_LIST = RULE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect Leaf Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT___COLLECT_LEAF_CONTENTS = RULE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_OPERATION_COUNT = RULE_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.AbstractSceneImpl <em>Abstract Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.AbstractSceneImpl
	 * @see rba.core.impl.RBACorePackageImpl#getAbstractScene()
	 * @generated
	 */
	int ABSTRACT_SCENE = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SCENE__DESCRIPTION = RULE_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SCENE__NAME = RULE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SCENE__TAGS = RULE_OBJECT__TAGS;

	/**
	 * The number of structural features of the '<em>Abstract Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SCENE_FEATURE_COUNT = RULE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SCENE___GET_EXPRESSION_TYPE = RULE_OBJECT___GET_EXPRESSION_TYPE;

	/**
	 * The number of operations of the '<em>Abstract Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SCENE_OPERATION_COUNT = RULE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.core.impl.SceneImpl <em>Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.SceneImpl
	 * @see rba.core.impl.RBACorePackageImpl#getScene()
	 * @generated
	 */
	int SCENE = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__DESCRIPTION = ABSTRACT_SCENE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__NAME = ABSTRACT_SCENE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__TAGS = ABSTRACT_SCENE__TAGS;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__GLOBAL = ABSTRACT_SCENE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__PROPERTIES = ABSTRACT_SCENE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_FEATURE_COUNT = ABSTRACT_SCENE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE___GET_EXPRESSION_TYPE = ABSTRACT_SCENE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATION_COUNT = ABSTRACT_SCENE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ContentImpl
	 * @see rba.core.impl.RBACorePackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DESCRIPTION = ABSTRACT_CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__NAME = ABSTRACT_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__TAGS = ABSTRACT_CONTENT__TAGS;

	/**
	 * The feature id for the '<em><b>Content Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_GROUP = ABSTRACT_CONTENT__CONTENT_GROUP;

	/**
	 * The feature id for the '<em><b>Allocatable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__ALLOCATABLE = ABSTRACT_CONTENT__ALLOCATABLE;

	/**
	 * The feature id for the '<em><b>Loser Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__LOSER_TYPE = ABSTRACT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__STATES = ABSTRACT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = ABSTRACT_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_EXPRESSION_TYPE = ABSTRACT_CONTENT___GET_EXPRESSION_TYPE;

	/**
	 * The operation id for the '<em>Get Allocatable List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_ALLOCATABLE_LIST = ABSTRACT_CONTENT___GET_ALLOCATABLE_LIST;

	/**
	 * The operation id for the '<em>Collect Leaf Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___COLLECT_LEAF_CONTENTS = ABSTRACT_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = ABSTRACT_CONTENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.ContentSetImpl <em>Content Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ContentSetImpl
	 * @see rba.core.impl.RBACorePackageImpl#getContentSet()
	 * @generated
	 */
	int CONTENT_SET = 15;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SET__DESCRIPTION = ABSTRACT_CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SET__NAME = ABSTRACT_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SET__TAGS = ABSTRACT_CONTENT__TAGS;

	/**
	 * The feature id for the '<em><b>Content Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SET__CONTENT_GROUP = ABSTRACT_CONTENT__CONTENT_GROUP;

	/**
	 * The feature id for the '<em><b>Allocatable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SET__ALLOCATABLE = ABSTRACT_CONTENT__ALLOCATABLE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SET__TARGET = ABSTRACT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SET_FEATURE_COUNT = ABSTRACT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SET___GET_EXPRESSION_TYPE = ABSTRACT_CONTENT___GET_EXPRESSION_TYPE;

	/**
	 * The operation id for the '<em>Get Allocatable List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SET___GET_ALLOCATABLE_LIST = ABSTRACT_CONTENT___GET_ALLOCATABLE_LIST;

	/**
	 * The operation id for the '<em>Collect Leaf Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SET___COLLECT_LEAF_CONTENTS = ABSTRACT_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Content Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_SET_OPERATION_COUNT = ABSTRACT_CONTENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.ContentStateImpl <em>Content State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ContentStateImpl
	 * @see rba.core.impl.RBACorePackageImpl#getContentState()
	 * @generated
	 */
	int CONTENT_STATE = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE__DESCRIPTION = RULE_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE__NAME = RULE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE__TAGS = RULE_OBJECT__TAGS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE__VALUE = RULE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE__OWNER = RULE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Content State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE_FEATURE_COUNT = RULE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE___GET_EXPRESSION_TYPE = RULE_OBJECT___GET_EXPRESSION_TYPE;

	/**
	 * The number of operations of the '<em>Content State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE_OPERATION_COUNT = RULE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.core.impl.AbstractPropertyImpl <em>Abstract Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.AbstractPropertyImpl
	 * @see rba.core.impl.RBACorePackageImpl#getAbstractProperty()
	 * @generated
	 */
	int ABSTRACT_PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__DESCRIPTION = RULE_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__NAME = RULE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__TAGS = RULE_OBJECT__TAGS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY__OWNER = RULE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_FEATURE_COUNT = RULE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY___GET_EXPRESSION_TYPE = RULE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROPERTY_OPERATION_COUNT = RULE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.IntegerPropertyImpl <em>Integer Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IntegerPropertyImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIntegerProperty()
	 * @generated
	 */
	int INTEGER_PROPERTY = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY__DESCRIPTION = ABSTRACT_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY__NAME = ABSTRACT_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY__TAGS = ABSTRACT_PROPERTY__TAGS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY__OWNER = ABSTRACT_PROPERTY__OWNER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY__VALUE = ABSTRACT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY_FEATURE_COUNT = ABSTRACT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY___GET_EXPRESSION_TYPE = ABSTRACT_PROPERTY___GET_EXPRESSION_TYPE;

	/**
	 * The number of operations of the '<em>Integer Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY_OPERATION_COUNT = ABSTRACT_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.core.impl.AbstractConstraintImpl <em>Abstract Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.AbstractConstraintImpl
	 * @see rba.core.impl.RBACorePackageImpl#getAbstractConstraint()
	 * @generated
	 */
	int ABSTRACT_CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__DESCRIPTION = PACKAGABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__NAME = PACKAGABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__EXPRESSION = PACKAGABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT_FEATURE_COUNT = PACKAGABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT_OPERATION_COUNT = PACKAGABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.core.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ConstraintImpl
	 * @see rba.core.impl.RBACorePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = ABSTRACT_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = ABSTRACT_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPRESSION = ABSTRACT_CONSTRAINT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__RUNTIME = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = ABSTRACT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.core.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ExpressionImpl
	 * @see rba.core.impl.RBACorePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LET_STATEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___GET_UNDERLYING_TYPE = 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___GET_EXPRESSION_TEXT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.LetStatementImpl <em>Let Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.LetStatementImpl
	 * @see rba.core.impl.RBACorePackageImpl#getLetStatement()
	 * @generated
	 */
	int LET_STATEMENT = 22;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT__VARIABLE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT__BODY = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Let Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT___TO_STRING = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Let Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ComplexExpressionImpl
	 * @see rba.core.impl.RBACorePackageImpl#getComplexExpression()
	 * @generated
	 */
	int COMPLEX_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EXPRESSION__LET_STATEMENTS = EXPRESSION__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Other Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EXPRESSION__OTHER_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EXPRESSION___GET_EXPANDED = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EXPRESSION___CAN_EXPAND = EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EXPRESSION___GET_EXPRESSION_TEXT = EXPRESSION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EXPRESSION___GET_UNDERLYING_TYPE = EXPRESSION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EXPRESSION___GET_TYPE = EXPRESSION_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Complex Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link rba.core.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.OperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 24;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__EXPRESSION = EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__LET_STATEMENTS = EXPRESSION__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_UNDERLYING_TYPE = EXPRESSION___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_EXPRESSION_TEXT = EXPRESSION___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GET_SYMBOL = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.IsTypeOfImpl <em>Is Type Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IsTypeOfImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIsTypeOf()
	 * @generated
	 */
	int IS_TYPE_OF = 25;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF__OPERAND = OPERATOR__OPERAND;

	/**
	 * The feature id for the '<em><b>Tag Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF__TAG_NAME = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Type Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF___GET_EXPRESSION_TEXT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF___GET_SYMBOL = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF___GET_UNDERLYING_TYPE = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Is Type Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TYPE_OF_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.ObjectReferenceImpl <em>Object Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ObjectReferenceImpl
	 * @see rba.core.impl.RBACorePackageImpl#getObjectReference()
	 * @generated
	 */
	int OBJECT_REFERENCE = 26;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE__EXPRESSION = EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE__LET_STATEMENTS = EXPRESSION__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Ref Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE__REF_OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE___GET_UNDERLYING_TYPE = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE___GET_EXPRESSION_TEXT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.PreviousModifierImpl <em>Previous Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.PreviousModifierImpl
	 * @see rba.core.impl.RBACorePackageImpl#getPreviousModifier()
	 * @generated
	 */
	int PREVIOUS_MODIFIER = 27;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_MODIFIER__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_MODIFIER__EXPRESSION = EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_MODIFIER__LET_STATEMENTS = EXPRESSION__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Obj Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_MODIFIER__OBJ_REFERENCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Previous Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_MODIFIER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_MODIFIER___GET_SYMBOL = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_MODIFIER___GET_UNDERLYING_TYPE = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_MODIFIER___GET_EXPRESSION_TEXT = EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Previous Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_MODIFIER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.ComparisonOperatorImpl <em>Comparison Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ComparisonOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 31;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR__OPERAND = OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR___GET_SYMBOL = OPERATOR___GET_SYMBOL;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR___GET_UNDERLYING_TYPE = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR___GET_EXPRESSION_TEXT = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comparison Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.GreaterThanOperatorImpl <em>Greater Than Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.GreaterThanOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getGreaterThanOperator()
	 * @generated
	 */
	int GREATER_THAN_OPERATOR = 28;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR__TYPE = COMPARISON_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR__EXPRESSION = COMPARISON_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR__LET_STATEMENTS = COMPARISON_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR__OPERAND = COMPARISON_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Greater Than Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR___GET_UNDERLYING_TYPE = COMPARISON_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR___GET_EXPRESSION_TEXT = COMPARISON_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR___GET_SYMBOL = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Than Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OPERATOR_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.MuchGreaterThanOperatorImpl <em>Much Greater Than Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.MuchGreaterThanOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getMuchGreaterThanOperator()
	 * @generated
	 */
	int MUCH_GREATER_THAN_OPERATOR = 29;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUCH_GREATER_THAN_OPERATOR__TYPE = COMPARISON_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUCH_GREATER_THAN_OPERATOR__EXPRESSION = COMPARISON_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUCH_GREATER_THAN_OPERATOR__LET_STATEMENTS = COMPARISON_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUCH_GREATER_THAN_OPERATOR__OPERAND = COMPARISON_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Much Greater Than Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUCH_GREATER_THAN_OPERATOR_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUCH_GREATER_THAN_OPERATOR___GET_UNDERLYING_TYPE = COMPARISON_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUCH_GREATER_THAN_OPERATOR___GET_EXPRESSION_TEXT = COMPARISON_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUCH_GREATER_THAN_OPERATOR___GET_SYMBOL = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Much Greater Than Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUCH_GREATER_THAN_OPERATOR_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.LowerThanOperatorImpl <em>Lower Than Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.LowerThanOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getLowerThanOperator()
	 * @generated
	 */
	int LOWER_THAN_OPERATOR = 30;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_OPERATOR__TYPE = COMPARISON_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_OPERATOR__EXPRESSION = COMPARISON_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_OPERATOR__LET_STATEMENTS = COMPARISON_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_OPERATOR__OPERAND = COMPARISON_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Lower Than Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_OPERATOR_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_OPERATOR___GET_UNDERLYING_TYPE = COMPARISON_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_OPERATOR___GET_EXPRESSION_TEXT = COMPARISON_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_OPERATOR___GET_SYMBOL = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lower Than Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_THAN_OPERATOR_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.EqualToOperatorImpl <em>Equal To Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.EqualToOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getEqualToOperator()
	 * @generated
	 */
	int EQUAL_TO_OPERATOR = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_TO_OPERATOR__TYPE = COMPARISON_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_TO_OPERATOR__EXPRESSION = COMPARISON_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_TO_OPERATOR__LET_STATEMENTS = COMPARISON_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_TO_OPERATOR__OPERAND = COMPARISON_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Equal To Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_TO_OPERATOR_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_TO_OPERATOR___GET_UNDERLYING_TYPE = COMPARISON_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_TO_OPERATOR___GET_EXPRESSION_TEXT = COMPARISON_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_TO_OPERATOR___GET_SYMBOL = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equal To Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_TO_OPERATOR_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.ComparisonAndImpl <em>Comparison And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ComparisonAndImpl
	 * @see rba.core.impl.RBACorePackageImpl#getComparisonAnd()
	 * @generated
	 */
	int COMPARISON_AND = 33;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_AND__TYPE = COMPARISON_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_AND__EXPRESSION = COMPARISON_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_AND__LET_STATEMENTS = COMPARISON_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_AND__OPERAND = COMPARISON_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Comparison And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_AND_FEATURE_COUNT = COMPARISON_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_AND___GET_UNDERLYING_TYPE = COMPARISON_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_AND___GET_SYMBOL = COMPARISON_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_AND___GET_EXPRESSION_TEXT = COMPARISON_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comparison And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_AND_OPERATION_COUNT = COMPARISON_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.LogicalOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 34;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__OPERAND = OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR___GET_SYMBOL = OPERATOR___GET_SYMBOL;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR___GET_UNDERLYING_TYPE = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR___GET_EXPRESSION_TEXT = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.AndOperatorImpl <em>And Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.AndOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getAndOperator()
	 * @generated
	 */
	int AND_OPERATOR = 35;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR__TYPE = LOGICAL_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR__EXPRESSION = LOGICAL_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR__LET_STATEMENTS = LOGICAL_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR__OPERAND = LOGICAL_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>And Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR___GET_UNDERLYING_TYPE = LOGICAL_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR___GET_EXPRESSION_TEXT = LOGICAL_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR___GET_SYMBOL = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.OrOperatorImpl <em>Or Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.OrOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getOrOperator()
	 * @generated
	 */
	int OR_OPERATOR = 36;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR__TYPE = LOGICAL_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR__EXPRESSION = LOGICAL_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR__LET_STATEMENTS = LOGICAL_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR__OPERAND = LOGICAL_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Or Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR___GET_UNDERLYING_TYPE = LOGICAL_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR___GET_EXPRESSION_TEXT = LOGICAL_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR___GET_SYMBOL = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.NotOperatorImpl <em>Not Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.NotOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getNotOperator()
	 * @generated
	 */
	int NOT_OPERATOR = 37;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR__TYPE = LOGICAL_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR__EXPRESSION = LOGICAL_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR__LET_STATEMENTS = LOGICAL_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR__OPERAND = LOGICAL_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Not Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR___GET_UNDERLYING_TYPE = LOGICAL_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR___GET_SYMBOL = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR___GET_EXPRESSION_TEXT = LOGICAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.IsEqualToOperatorImpl <em>Is Equal To Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IsEqualToOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIsEqualToOperator()
	 * @generated
	 */
	int IS_EQUAL_TO_OPERATOR = 38;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO_OPERATOR__TYPE = LOGICAL_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO_OPERATOR__EXPRESSION = LOGICAL_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO_OPERATOR__LET_STATEMENTS = LOGICAL_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO_OPERATOR__OPERAND = LOGICAL_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Equal To Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO_OPERATOR___GET_UNDERLYING_TYPE = LOGICAL_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO_OPERATOR___GET_EXPRESSION_TEXT = LOGICAL_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO_OPERATOR___GET_SYMBOL = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Equal To Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EQUAL_TO_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.IsGreaterThanOperatorImpl <em>Is Greater Than Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IsGreaterThanOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIsGreaterThanOperator()
	 * @generated
	 */
	int IS_GREATER_THAN_OPERATOR = 39;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_OPERATOR__TYPE = LOGICAL_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_OPERATOR__EXPRESSION = LOGICAL_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_OPERATOR__LET_STATEMENTS = LOGICAL_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_OPERATOR__OPERAND = LOGICAL_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Greater Than Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_OPERATOR___GET_UNDERLYING_TYPE = LOGICAL_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_OPERATOR___GET_EXPRESSION_TEXT = LOGICAL_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_OPERATOR___GET_SYMBOL = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Greater Than Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.IsLowerThanOperatorImpl <em>Is Lower Than Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IsLowerThanOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIsLowerThanOperator()
	 * @generated
	 */
	int IS_LOWER_THAN_OPERATOR = 40;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_OPERATOR__TYPE = LOGICAL_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_OPERATOR__EXPRESSION = LOGICAL_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_OPERATOR__LET_STATEMENTS = LOGICAL_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_OPERATOR__OPERAND = LOGICAL_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Lower Than Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_OPERATOR___GET_UNDERLYING_TYPE = LOGICAL_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_OPERATOR___GET_EXPRESSION_TEXT = LOGICAL_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_OPERATOR___GET_SYMBOL = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Lower Than Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.IsGreaterThanEqualOperatorImpl <em>Is Greater Than Equal Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IsGreaterThanEqualOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIsGreaterThanEqualOperator()
	 * @generated
	 */
	int IS_GREATER_THAN_EQUAL_OPERATOR = 41;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_EQUAL_OPERATOR__TYPE = LOGICAL_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_EQUAL_OPERATOR__EXPRESSION = LOGICAL_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_EQUAL_OPERATOR__LET_STATEMENTS = LOGICAL_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_EQUAL_OPERATOR__OPERAND = LOGICAL_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Greater Than Equal Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_EQUAL_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_EQUAL_OPERATOR___GET_UNDERLYING_TYPE = LOGICAL_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_EQUAL_OPERATOR___GET_EXPRESSION_TEXT = LOGICAL_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_EQUAL_OPERATOR___GET_SYMBOL = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Greater Than Equal Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GREATER_THAN_EQUAL_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.IsLowerThanEqualOperatorImpl <em>Is Lower Than Equal Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IsLowerThanEqualOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIsLowerThanEqualOperator()
	 * @generated
	 */
	int IS_LOWER_THAN_EQUAL_OPERATOR = 42;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_EQUAL_OPERATOR__TYPE = LOGICAL_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_EQUAL_OPERATOR__EXPRESSION = LOGICAL_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_EQUAL_OPERATOR__LET_STATEMENTS = LOGICAL_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_EQUAL_OPERATOR__OPERAND = LOGICAL_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Lower Than Equal Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_EQUAL_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_EQUAL_OPERATOR___GET_UNDERLYING_TYPE = LOGICAL_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_EQUAL_OPERATOR___GET_EXPRESSION_TEXT = LOGICAL_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_EQUAL_OPERATOR___GET_SYMBOL = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Lower Than Equal Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_LOWER_THAN_EQUAL_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.ArithmeticOperatorImpl <em>Arithmetic Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ArithmeticOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 43;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR__OPERAND = OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Arithmetic Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR___GET_SYMBOL = OPERATOR___GET_SYMBOL;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR___GET_UNDERLYING_TYPE = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR___GET_EXPRESSION_TEXT = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arithmetic Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.PlusOperatorImpl <em>Plus Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.PlusOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getPlusOperator()
	 * @generated
	 */
	int PLUS_OPERATOR = 44;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR__TYPE = ARITHMETIC_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR__EXPRESSION = ARITHMETIC_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR__LET_STATEMENTS = ARITHMETIC_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR__OPERAND = ARITHMETIC_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Plus Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR_FEATURE_COUNT = ARITHMETIC_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR___GET_UNDERLYING_TYPE = ARITHMETIC_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR___GET_EXPRESSION_TEXT = ARITHMETIC_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR___GET_SYMBOL = ARITHMETIC_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plus Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATOR_OPERATION_COUNT = ARITHMETIC_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.ImpliesOperatorImpl <em>Implies Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ImpliesOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getImpliesOperator()
	 * @generated
	 */
	int IMPLIES_OPERATOR = 45;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR__TYPE = LOGICAL_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR__EXPRESSION = LOGICAL_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR__LET_STATEMENTS = LOGICAL_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR__OPERAND = LOGICAL_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Implies Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR___GET_UNDERLYING_TYPE = LOGICAL_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR___GET_EXPRESSION_TEXT = LOGICAL_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR___GET_SYMBOL = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implies Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.ContentOperatorImpl <em>Content Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ContentOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getContentOperator()
	 * @generated
	 */
	int CONTENT_OPERATOR = 46;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATOR__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATOR__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATOR__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATOR__OPERAND = OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Content Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATOR___GET_UNDERLYING_TYPE = OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATOR___GET_SYMBOL = OPERATOR___GET_SYMBOL;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATOR___GET_EXPRESSION_TEXT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Content Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.IsActiveImpl <em>Is Active</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IsActiveImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIsActive()
	 * @generated
	 */
	int IS_ACTIVE = 47;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACTIVE__TYPE = CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACTIVE__EXPRESSION = CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACTIVE__LET_STATEMENTS = CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACTIVE__OPERAND = CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Active</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACTIVE_FEATURE_COUNT = CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACTIVE___GET_EXPRESSION_TEXT = CONTENT_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACTIVE___GET_SYMBOL = CONTENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACTIVE___GET_UNDERLYING_TYPE = CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Is Active</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACTIVE_OPERATION_COUNT = CONTENT_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.GetAllocatablesImpl <em>Get Allocatables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.GetAllocatablesImpl
	 * @see rba.core.impl.RBACorePackageImpl#getGetAllocatables()
	 * @generated
	 */
	int GET_ALLOCATABLES = 48;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALLOCATABLES__TYPE = CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALLOCATABLES__EXPRESSION = CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALLOCATABLES__LET_STATEMENTS = CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALLOCATABLES__OPERAND = CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Get Allocatables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALLOCATABLES_FEATURE_COUNT = CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALLOCATABLES___GET_EXPRESSION_TEXT = CONTENT_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALLOCATABLES___GET_SYMBOL = CONTENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALLOCATABLES___GET_UNDERLYING_TYPE = CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Get Allocatables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALLOCATABLES_OPERATION_COUNT = CONTENT_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.HasBeenDisplayedImpl <em>Has Been Displayed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.HasBeenDisplayedImpl
	 * @see rba.core.impl.RBACorePackageImpl#getHasBeenDisplayed()
	 * @generated
	 */
	int HAS_BEEN_DISPLAYED = 49;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_BEEN_DISPLAYED__TYPE = CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_BEEN_DISPLAYED__EXPRESSION = CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_BEEN_DISPLAYED__LET_STATEMENTS = CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_BEEN_DISPLAYED__OPERAND = CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Has Been Displayed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_BEEN_DISPLAYED_FEATURE_COUNT = CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_BEEN_DISPLAYED___GET_EXPRESSION_TEXT = CONTENT_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_BEEN_DISPLAYED___GET_SYMBOL = CONTENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_BEEN_DISPLAYED___GET_UNDERLYING_TYPE = CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Has Been Displayed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_BEEN_DISPLAYED_OPERATION_COUNT = CONTENT_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.ActiveStateImpl <em>Active State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ActiveStateImpl
	 * @see rba.core.impl.RBACorePackageImpl#getActiveState()
	 * @generated
	 */
	int ACTIVE_STATE = 50;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE__TYPE = CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE__EXPRESSION = CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE__LET_STATEMENTS = CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE__OPERAND = CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Active State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE_FEATURE_COUNT = CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE___GET_EXPRESSION_TEXT = CONTENT_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE___GET_SYMBOL = CONTENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE___GET_UNDERLYING_TYPE = CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Active State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE_OPERATION_COUNT = CONTENT_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.ObjectCompareImpl <em>Object Compare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ObjectCompareImpl
	 * @see rba.core.impl.RBACorePackageImpl#getObjectCompare()
	 * @generated
	 */
	int OBJECT_COMPARE = 51;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE__OPERAND = OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Object Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE___GET_SYMBOL = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE___GET_UNDERLYING_TYPE = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE___GET_EXPRESSION_TEXT = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.ThatOfOperatorImpl <em>That Of Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ThatOfOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getThatOfOperator()
	 * @generated
	 */
	int THAT_OF_OPERATOR = 52;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THAT_OF_OPERATOR__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THAT_OF_OPERATOR__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THAT_OF_OPERATOR__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THAT_OF_OPERATOR__OPERAND = OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>That Of Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THAT_OF_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THAT_OF_OPERATOR___GET_EXPRESSION_TEXT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THAT_OF_OPERATOR___GET_SYMBOL = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THAT_OF_OPERATOR___GET_UNDERLYING_TYPE = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>That Of Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THAT_OF_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ValueExpressionImpl
	 * @see rba.core.impl.RBACorePackageImpl#getValueExpression()
	 * @generated
	 */
	int VALUE_EXPRESSION = 53;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION__LET_STATEMENTS = EXPRESSION__LET_STATEMENTS;

	/**
	 * The number of structural features of the '<em>Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION___GET_EXPRESSION_TEXT = EXPRESSION___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION___GET_UNDERLYING_TYPE = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION___GET_EXPRESSION_VALUE = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION___GET_TYPE = EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.MaxValueImpl <em>Max Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.MaxValueImpl
	 * @see rba.core.impl.RBACorePackageImpl#getMaxValue()
	 * @generated
	 */
	int MAX_VALUE = 54;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE__TYPE = VALUE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE__EXPRESSION = VALUE_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE__LET_STATEMENTS = VALUE_EXPRESSION__LET_STATEMENTS;

	/**
	 * The number of structural features of the '<em>Max Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE___GET_UNDERLYING_TYPE = VALUE_EXPRESSION___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE___GET_TYPE = VALUE_EXPRESSION___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE___GET_EXPRESSION_TEXT = VALUE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE___GET_EXPRESSION_VALUE = VALUE_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_VALUE_OPERATION_COUNT = VALUE_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.MinValueImpl <em>Min Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.MinValueImpl
	 * @see rba.core.impl.RBACorePackageImpl#getMinValue()
	 * @generated
	 */
	int MIN_VALUE = 55;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE__TYPE = VALUE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE__EXPRESSION = VALUE_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE__LET_STATEMENTS = VALUE_EXPRESSION__LET_STATEMENTS;

	/**
	 * The number of structural features of the '<em>Min Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE___GET_UNDERLYING_TYPE = VALUE_EXPRESSION___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE___GET_TYPE = VALUE_EXPRESSION___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE___GET_EXPRESSION_TEXT = VALUE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE___GET_EXPRESSION_VALUE = VALUE_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_VALUE_OPERATION_COUNT = VALUE_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.NoneValueImpl <em>None Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.NoneValueImpl
	 * @see rba.core.impl.RBACorePackageImpl#getNoneValue()
	 * @generated
	 */
	int NONE_VALUE = 56;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE__TYPE = VALUE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE__EXPRESSION = VALUE_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE__LET_STATEMENTS = VALUE_EXPRESSION__LET_STATEMENTS;

	/**
	 * The number of structural features of the '<em>None Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE___GET_UNDERLYING_TYPE = VALUE_EXPRESSION___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE___GET_TYPE = VALUE_EXPRESSION___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE___GET_EXPRESSION_TEXT = VALUE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE___GET_EXPRESSION_VALUE = VALUE_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>None Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_VALUE_OPERATION_COUNT = VALUE_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.StandardValueImpl <em>Standard Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.StandardValueImpl
	 * @see rba.core.impl.RBACorePackageImpl#getStandardValue()
	 * @generated
	 */
	int STANDARD_VALUE = 57;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_VALUE__TYPE = VALUE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_VALUE__EXPRESSION = VALUE_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_VALUE__LET_STATEMENTS = VALUE_EXPRESSION__LET_STATEMENTS;

	/**
	 * The number of structural features of the '<em>Standard Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_VALUE_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_VALUE___GET_UNDERLYING_TYPE = VALUE_EXPRESSION___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_VALUE___GET_TYPE = VALUE_EXPRESSION___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_VALUE___GET_EXPRESSION_TEXT = VALUE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_VALUE___GET_EXPRESSION_VALUE = VALUE_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Standard Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_VALUE_OPERATION_COUNT = VALUE_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IntegerValueImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 58;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__TYPE = VALUE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__EXPRESSION = VALUE_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__LET_STATEMENTS = VALUE_EXPRESSION__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE___GET_UNDERLYING_TYPE = VALUE_EXPRESSION___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE___GET_TYPE = VALUE_EXPRESSION___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE___GET_EXPRESSION_TEXT = VALUE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE___GET_EXPRESSION_VALUE = VALUE_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_OPERATION_COUNT = VALUE_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.EnumExpressionImpl <em>Enum Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.EnumExpressionImpl
	 * @see rba.core.impl.RBACorePackageImpl#getEnumExpression()
	 * @generated
	 */
	int ENUM_EXPRESSION = 59;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_EXPRESSION__LET_STATEMENTS = EXPRESSION__LET_STATEMENTS;

	/**
	 * The number of structural features of the '<em>Enum Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_EXPRESSION___GET_EXPRESSION_TEXT = EXPRESSION___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_EXPRESSION___GET_UNDERLYING_TYPE = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_EXPRESSION___GET_EXPRESSION_VALUE = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_EXPRESSION___GET_TYPE = EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.LoserTypeExpressionImpl <em>Loser Type Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.LoserTypeExpressionImpl
	 * @see rba.core.impl.RBACorePackageImpl#getLoserTypeExpression()
	 * @generated
	 */
	int LOSER_TYPE_EXPRESSION = 60;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSER_TYPE_EXPRESSION__TYPE = ENUM_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSER_TYPE_EXPRESSION__EXPRESSION = ENUM_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSER_TYPE_EXPRESSION__LET_STATEMENTS = ENUM_EXPRESSION__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSER_TYPE_EXPRESSION__VALUE = ENUM_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loser Type Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSER_TYPE_EXPRESSION_FEATURE_COUNT = ENUM_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSER_TYPE_EXPRESSION___GET_UNDERLYING_TYPE = ENUM_EXPRESSION___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSER_TYPE_EXPRESSION___GET_TYPE = ENUM_EXPRESSION___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSER_TYPE_EXPRESSION___GET_EXPRESSION_TEXT = ENUM_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSER_TYPE_EXPRESSION___GET_EXPRESSION_VALUE = ENUM_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loser Type Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSER_TYPE_EXPRESSION_OPERATION_COUNT = ENUM_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.ArbitrationPolicyExpressionImpl <em>Arbitration Policy Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ArbitrationPolicyExpressionImpl
	 * @see rba.core.impl.RBACorePackageImpl#getArbitrationPolicyExpression()
	 * @generated
	 */
	int ARBITRATION_POLICY_EXPRESSION = 61;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATION_POLICY_EXPRESSION__TYPE = ENUM_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATION_POLICY_EXPRESSION__EXPRESSION = ENUM_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATION_POLICY_EXPRESSION__LET_STATEMENTS = ENUM_EXPRESSION__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATION_POLICY_EXPRESSION__VALUE = ENUM_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arbitration Policy Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATION_POLICY_EXPRESSION_FEATURE_COUNT = ENUM_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATION_POLICY_EXPRESSION___GET_UNDERLYING_TYPE = ENUM_EXPRESSION___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATION_POLICY_EXPRESSION___GET_TYPE = ENUM_EXPRESSION___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATION_POLICY_EXPRESSION___GET_EXPRESSION_TEXT = ENUM_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATION_POLICY_EXPRESSION___GET_EXPRESSION_VALUE = ENUM_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arbitration Policy Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATION_POLICY_EXPRESSION_OPERATION_COUNT = ENUM_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.SetExpressionImpl <em>Set Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.SetExpressionImpl
	 * @see rba.core.impl.RBACorePackageImpl#getSetExpression()
	 * @generated
	 */
	int SET_EXPRESSION = 62;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION__LET_STATEMENTS = EXPRESSION__LET_STATEMENTS;

	/**
	 * The number of structural features of the '<em>Set Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION___GET_UNDERLYING_TYPE = EXPRESSION___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION___GET_EXPRESSION_TEXT = EXPRESSION___GET_EXPRESSION_TEXT;

	/**
	 * The number of operations of the '<em>Set Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.core.impl.SetOperatorImpl <em>Set Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.SetOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getSetOperator()
	 * @generated
	 */
	int SET_OPERATOR = 63;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR__OPERAND = OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Set Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR___GET_UNDERLYING_TYPE = OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR___GET_EXPRESSION_TEXT = OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR___GET_SYMBOL = OPERATOR___GET_SYMBOL;

	/**
	 * The number of operations of the '<em>Set Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rba.core.impl.SizeOperatorImpl <em>Size Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.SizeOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getSizeOperator()
	 * @generated
	 */
	int SIZE_OPERATOR = 64;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATOR__TYPE = SET_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATOR__EXPRESSION = SET_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATOR__LET_STATEMENTS = SET_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATOR__OPERAND = SET_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Size Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATOR_FEATURE_COUNT = SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATOR___GET_EXPRESSION_TEXT = SET_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATOR___GET_SYMBOL = SET_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATOR___GET_UNDERLYING_TYPE = SET_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Size Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATOR_OPERATION_COUNT = SET_OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.LambdaContextImpl <em>Lambda Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.LambdaContextImpl
	 * @see rba.core.impl.RBACorePackageImpl#getLambdaContext()
	 * @generated
	 */
	int LAMBDA_CONTEXT = 73;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CONTEXT__TYPE = SET_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CONTEXT__EXPRESSION = SET_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CONTEXT__LET_STATEMENTS = SET_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CONTEXT__OPERAND = SET_OPERATOR__OPERAND;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CONTEXT__LAMBDA = SET_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lambda Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CONTEXT_FEATURE_COUNT = SET_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CONTEXT___GET_UNDERLYING_TYPE = SET_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CONTEXT___GET_EXPRESSION_TEXT = SET_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CONTEXT___GET_SYMBOL = SET_OPERATOR___GET_SYMBOL;

	/**
	 * The operation id for the '<em>Get Context Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CONTEXT___GET_CONTEXT_TYPE = SET_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lambda Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CONTEXT_OPERATION_COUNT = SET_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.ExistsOperatorImpl <em>Exists Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ExistsOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getExistsOperator()
	 * @generated
	 */
	int EXISTS_OPERATOR = 65;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__TYPE = LAMBDA_CONTEXT__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__EXPRESSION = LAMBDA_CONTEXT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__LET_STATEMENTS = LAMBDA_CONTEXT__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__OPERAND = LAMBDA_CONTEXT__OPERAND;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__LAMBDA = LAMBDA_CONTEXT__LAMBDA;

	/**
	 * The number of structural features of the '<em>Exists Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR_FEATURE_COUNT = LAMBDA_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR___GET_CONTEXT_TYPE = LAMBDA_CONTEXT___GET_CONTEXT_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR___GET_EXPRESSION_TEXT = LAMBDA_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR___GET_SYMBOL = LAMBDA_CONTEXT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR___GET_UNDERLYING_TYPE = LAMBDA_CONTEXT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Exists Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR_OPERATION_COUNT = LAMBDA_CONTEXT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.ForAllOperatorImpl <em>For All Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ForAllOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getForAllOperator()
	 * @generated
	 */
	int FOR_ALL_OPERATOR = 66;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR__TYPE = LAMBDA_CONTEXT__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR__EXPRESSION = LAMBDA_CONTEXT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR__LET_STATEMENTS = LAMBDA_CONTEXT__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR__OPERAND = LAMBDA_CONTEXT__OPERAND;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR__LAMBDA = LAMBDA_CONTEXT__LAMBDA;

	/**
	 * The number of structural features of the '<em>For All Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR_FEATURE_COUNT = LAMBDA_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR___GET_CONTEXT_TYPE = LAMBDA_CONTEXT___GET_CONTEXT_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR___GET_EXPRESSION_TEXT = LAMBDA_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR___GET_SYMBOL = LAMBDA_CONTEXT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR___GET_UNDERLYING_TYPE = LAMBDA_CONTEXT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>For All Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR_OPERATION_COUNT = LAMBDA_CONTEXT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.MaxOperatorImpl <em>Max Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.MaxOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getMaxOperator()
	 * @generated
	 */
	int MAX_OPERATOR = 67;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATOR__TYPE = LAMBDA_CONTEXT__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATOR__EXPRESSION = LAMBDA_CONTEXT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATOR__LET_STATEMENTS = LAMBDA_CONTEXT__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATOR__OPERAND = LAMBDA_CONTEXT__OPERAND;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATOR__LAMBDA = LAMBDA_CONTEXT__LAMBDA;

	/**
	 * The number of structural features of the '<em>Max Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATOR_FEATURE_COUNT = LAMBDA_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATOR___GET_CONTEXT_TYPE = LAMBDA_CONTEXT___GET_CONTEXT_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATOR___GET_EXPRESSION_TEXT = LAMBDA_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATOR___GET_SYMBOL = LAMBDA_CONTEXT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATOR___GET_UNDERLYING_TYPE = LAMBDA_CONTEXT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Max Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATOR_OPERATION_COUNT = LAMBDA_CONTEXT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.MinOperatorImpl <em>Min Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.MinOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getMinOperator()
	 * @generated
	 */
	int MIN_OPERATOR = 68;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATOR__TYPE = LAMBDA_CONTEXT__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATOR__EXPRESSION = LAMBDA_CONTEXT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATOR__LET_STATEMENTS = LAMBDA_CONTEXT__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATOR__OPERAND = LAMBDA_CONTEXT__OPERAND;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATOR__LAMBDA = LAMBDA_CONTEXT__LAMBDA;

	/**
	 * The number of structural features of the '<em>Min Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATOR_FEATURE_COUNT = LAMBDA_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATOR___GET_CONTEXT_TYPE = LAMBDA_CONTEXT___GET_CONTEXT_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATOR___GET_EXPRESSION_TEXT = LAMBDA_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATOR___GET_SYMBOL = LAMBDA_CONTEXT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATOR___GET_UNDERLYING_TYPE = LAMBDA_CONTEXT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Min Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATOR_OPERATION_COUNT = LAMBDA_CONTEXT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.SelectOperatorImpl <em>Select Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.SelectOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getSelectOperator()
	 * @generated
	 */
	int SELECT_OPERATOR = 69;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATOR__TYPE = LAMBDA_CONTEXT__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATOR__EXPRESSION = LAMBDA_CONTEXT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATOR__LET_STATEMENTS = LAMBDA_CONTEXT__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATOR__OPERAND = LAMBDA_CONTEXT__OPERAND;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATOR__LAMBDA = LAMBDA_CONTEXT__LAMBDA;

	/**
	 * The number of structural features of the '<em>Select Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATOR_FEATURE_COUNT = LAMBDA_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Context Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATOR___GET_CONTEXT_TYPE = LAMBDA_CONTEXT___GET_CONTEXT_TYPE;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATOR___GET_EXPRESSION_TEXT = LAMBDA_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATOR___GET_SYMBOL = LAMBDA_CONTEXT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATOR___GET_UNDERLYING_TYPE = LAMBDA_CONTEXT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Select Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATOR_OPERATION_COUNT = LAMBDA_CONTEXT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.SetOfOperatorImpl <em>Set Of Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.SetOfOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getSetOfOperator()
	 * @generated
	 */
	int SET_OF_OPERATOR = 70;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_OPERATOR__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_OPERATOR__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_OPERATOR__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_OPERATOR__OPERAND = OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Set Of Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_OPERATOR___GET_EXPRESSION_TEXT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_OPERATOR___GET_SYMBOL = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_OPERATOR___GET_UNDERLYING_TYPE = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Of Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OF_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.LambdaExpressionImpl <em>Lambda Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.LambdaExpressionImpl
	 * @see rba.core.impl.RBACorePackageImpl#getLambdaExpression()
	 * @generated
	 */
	int LAMBDA_EXPRESSION = 71;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION__LET_STATEMENTS = EXPRESSION__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION__CONTEXT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION__X = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION__BODY_TEXT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lambda Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION___GET_EXPRESSION_TEXT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION___GET_UNDERLYING_TYPE = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lambda Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.VariableImpl
	 * @see rba.core.impl.RBACorePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 72;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DESCRIPTION = RULE_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = RULE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TAGS = RULE_OBJECT__TAGS;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = RULE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___GET_EXPRESSION_TYPE = RULE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = RULE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IfStatementImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 74;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__EXPRESSION = EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__LET_STATEMENTS = EXPRESSION__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__THEN_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT___GET_UNDERLYING_TYPE = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT___GET_EXPRESSION_TEXT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.SceneOperatorImpl <em>Scene Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.SceneOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getSceneOperator()
	 * @generated
	 */
	int SCENE_OPERATOR = 75;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATOR__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATOR__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATOR__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATOR__OPERAND = OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Scene Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATOR___GET_UNDERLYING_TYPE = OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATOR___GET_SYMBOL = OPERATOR___GET_SYMBOL;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATOR___GET_EXPRESSION_TEXT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scene Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.IsOnImpl <em>Is On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IsOnImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIsOn()
	 * @generated
	 */
	int IS_ON = 76;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ON__TYPE = SCENE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ON__EXPRESSION = SCENE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ON__LET_STATEMENTS = SCENE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ON__OPERAND = SCENE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ON_FEATURE_COUNT = SCENE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ON___GET_EXPRESSION_TEXT = SCENE_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ON___GET_SYMBOL = SCENE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ON___GET_UNDERLYING_TYPE = SCENE_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Is On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ON_OPERATION_COUNT = SCENE_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.AllocatableOperatorImpl <em>Allocatable Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.AllocatableOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getAllocatableOperator()
	 * @generated
	 */
	int ALLOCATABLE_OPERATOR = 77;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_OPERATOR__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_OPERATOR__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_OPERATOR__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_OPERATOR__OPERAND = OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Allocatable Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_OPERATOR___GET_UNDERLYING_TYPE = OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_OPERATOR___GET_SYMBOL = OPERATOR___GET_SYMBOL;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_OPERATOR___GET_EXPRESSION_TEXT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Allocatable Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATABLE_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.AllocatedContentImpl <em>Allocated Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.AllocatedContentImpl
	 * @see rba.core.impl.RBACorePackageImpl#getAllocatedContent()
	 * @generated
	 */
	int ALLOCATED_CONTENT = 78;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_CONTENT__TYPE = ALLOCATABLE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_CONTENT__EXPRESSION = ALLOCATABLE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_CONTENT__LET_STATEMENTS = ALLOCATABLE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_CONTENT__OPERAND = ALLOCATABLE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Allocated Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_CONTENT_FEATURE_COUNT = ALLOCATABLE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_CONTENT___GET_EXPRESSION_TEXT = ALLOCATABLE_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_CONTENT___GET_SYMBOL = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_CONTENT___GET_UNDERLYING_TYPE = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Allocated Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATED_CONTENT_OPERATION_COUNT = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.ContentValueImpl <em>Content Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ContentValueImpl
	 * @see rba.core.impl.RBACorePackageImpl#getContentValue()
	 * @generated
	 */
	int CONTENT_VALUE = 79;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALUE__TYPE = ALLOCATABLE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALUE__EXPRESSION = ALLOCATABLE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALUE__LET_STATEMENTS = ALLOCATABLE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALUE__OPERAND = ALLOCATABLE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Content Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALUE_FEATURE_COUNT = ALLOCATABLE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALUE___GET_EXPRESSION_TEXT = ALLOCATABLE_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALUE___GET_SYMBOL = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALUE___GET_UNDERLYING_TYPE = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Content Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_VALUE_OPERATION_COUNT = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.GetContentsListImpl <em>Get Contents List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.GetContentsListImpl
	 * @see rba.core.impl.RBACorePackageImpl#getGetContentsList()
	 * @generated
	 */
	int GET_CONTENTS_LIST = 80;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTENTS_LIST__TYPE = ALLOCATABLE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTENTS_LIST__EXPRESSION = ALLOCATABLE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTENTS_LIST__LET_STATEMENTS = ALLOCATABLE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTENTS_LIST__OPERAND = ALLOCATABLE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Get Contents List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTENTS_LIST_FEATURE_COUNT = ALLOCATABLE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTENTS_LIST___GET_EXPRESSION_TEXT = ALLOCATABLE_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTENTS_LIST___GET_SYMBOL = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTENTS_LIST___GET_UNDERLYING_TYPE = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Get Contents List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTENTS_LIST_OPERATION_COUNT = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.ActiveContentsImpl <em>Active Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ActiveContentsImpl
	 * @see rba.core.impl.RBACorePackageImpl#getActiveContents()
	 * @generated
	 */
	int ACTIVE_CONTENTS = 81;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CONTENTS__TYPE = ALLOCATABLE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CONTENTS__EXPRESSION = ALLOCATABLE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CONTENTS__LET_STATEMENTS = ALLOCATABLE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CONTENTS__OPERAND = ALLOCATABLE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Active Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CONTENTS_FEATURE_COUNT = ALLOCATABLE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CONTENTS___GET_EXPRESSION_TEXT = ALLOCATABLE_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CONTENTS___GET_SYMBOL = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CONTENTS___GET_UNDERLYING_TYPE = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Active Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CONTENTS_OPERATION_COUNT = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.PropertyOperatorImpl <em>Property Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.PropertyOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getPropertyOperator()
	 * @generated
	 */
	int PROPERTY_OPERATOR = 82;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATOR__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATOR__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATOR__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATOR__OPERAND = OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Property Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATOR___GET_SYMBOL = OPERATOR___GET_SYMBOL;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATOR___GET_UNDERLYING_TYPE = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATOR___GET_EXPRESSION_TEXT = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.GetPropertyImpl <em>Get Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.GetPropertyImpl
	 * @see rba.core.impl.RBACorePackageImpl#getGetProperty()
	 * @generated
	 */
	int GET_PROPERTY = 83;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY__TYPE = PROPERTY_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY__EXPRESSION = PROPERTY_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY__LET_STATEMENTS = PROPERTY_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY__OPERAND = PROPERTY_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Get Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_FEATURE_COUNT = PROPERTY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY___GET_EXPRESSION_TEXT = PROPERTY_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY___GET_SYMBOL = PROPERTY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY___GET_UNDERLYING_TYPE = PROPERTY_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Get Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.StateValueImpl <em>State Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.StateValueImpl
	 * @see rba.core.impl.RBACorePackageImpl#getStateValue()
	 * @generated
	 */
	int STATE_VALUE = 84;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE__TYPE = CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE__EXPRESSION = CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE__LET_STATEMENTS = CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE__OPERAND = CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>State Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE_FEATURE_COUNT = CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE___GET_EXPRESSION_TEXT = CONTENT_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE___GET_SYMBOL = CONTENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE___GET_UNDERLYING_TYPE = CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VALUE_OPERATION_COUNT = CONTENT_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.impl.HasComeLaterThanImpl <em>Has Come Later Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.HasComeLaterThanImpl
	 * @see rba.core.impl.RBACorePackageImpl#getHasComeLaterThan()
	 * @generated
	 */
	int HAS_COME_LATER_THAN = 85;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_LATER_THAN__TYPE = CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_LATER_THAN__EXPRESSION = CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_LATER_THAN__LET_STATEMENTS = CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_LATER_THAN__OPERAND = CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Has Come Later Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_LATER_THAN_FEATURE_COUNT = CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_LATER_THAN___GET_SYMBOL = CONTENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_LATER_THAN___GET_UNDERLYING_TYPE = CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_LATER_THAN___GET_EXPRESSION_TEXT = CONTENT_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Has Come Later Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_LATER_THAN_OPERATION_COUNT = CONTENT_OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.impl.HasComeEarlierThanImpl <em>Has Come Earlier Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.HasComeEarlierThanImpl
	 * @see rba.core.impl.RBACorePackageImpl#getHasComeEarlierThan()
	 * @generated
	 */
	int HAS_COME_EARLIER_THAN = 86;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_EARLIER_THAN__TYPE = CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_EARLIER_THAN__EXPRESSION = CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_EARLIER_THAN__LET_STATEMENTS = CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_EARLIER_THAN__OPERAND = CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Has Come Earlier Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_EARLIER_THAN_FEATURE_COUNT = CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_EARLIER_THAN___GET_SYMBOL = CONTENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_EARLIER_THAN___GET_UNDERLYING_TYPE = CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_EARLIER_THAN___GET_EXPRESSION_TEXT = CONTENT_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Has Come Earlier Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COME_EARLIER_THAN_OPERATION_COUNT = CONTENT_OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link rba.core.SugarExpression <em>Sugar Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.SugarExpression
	 * @see rba.core.impl.RBACorePackageImpl#getSugarExpression()
	 * @generated
	 */
	int SUGAR_EXPRESSION = 87;

	/**
	 * The number of structural features of the '<em>Sugar Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGAR_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGAR_EXPRESSION___CAN_EXPAND = 0;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGAR_EXPRESSION___GET_EXPANDED = 1;

	/**
	 * The number of operations of the '<em>Sugar Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGAR_EXPRESSION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link rba.core.SugarExpressionBase <em>Sugar Expression Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.SugarExpressionBase
	 * @see rba.core.impl.RBACorePackageImpl#getSugarExpressionBase()
	 * @generated
	 */
	int SUGAR_EXPRESSION_BASE = 88;

	/**
	 * The number of structural features of the '<em>Sugar Expression Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGAR_EXPRESSION_BASE_FEATURE_COUNT = SUGAR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGAR_EXPRESSION_BASE___GET_EXPANDED = SUGAR_EXPRESSION___GET_EXPANDED;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGAR_EXPRESSION_BASE___CAN_EXPAND = SUGAR_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sugar Expression Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGAR_EXPRESSION_BASE_OPERATION_COUNT = SUGAR_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.ObjectCompareNotImpl <em>Object Compare Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ObjectCompareNotImpl
	 * @see rba.core.impl.RBACorePackageImpl#getObjectCompareNot()
	 * @generated
	 */
	int OBJECT_COMPARE_NOT = 89;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE_NOT__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE_NOT__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE_NOT__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE_NOT__OPERAND = OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Object Compare Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE_NOT_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE_NOT___GET_EXPANDED = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE_NOT___CAN_EXPAND = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE_NOT___GET_SYMBOL = OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE_NOT___GET_UNDERLYING_TYPE = OPERATOR_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE_NOT___GET_EXPRESSION_TEXT = OPERATOR_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Object Compare Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARE_NOT_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link rba.core.impl.IsAllocatedToImpl <em>Is Allocated To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IsAllocatedToImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIsAllocatedTo()
	 * @generated
	 */
	int IS_ALLOCATED_TO = 90;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ALLOCATED_TO__TYPE = CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ALLOCATED_TO__EXPRESSION = CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ALLOCATED_TO__LET_STATEMENTS = CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ALLOCATED_TO__OPERAND = CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Allocated To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ALLOCATED_TO_FEATURE_COUNT = CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ALLOCATED_TO___GET_EXPANDED = CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ALLOCATED_TO___CAN_EXPAND = CONTENT_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ALLOCATED_TO___GET_SYMBOL = CONTENT_OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ALLOCATED_TO___GET_UNDERLYING_TYPE = CONTENT_OPERATOR_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ALLOCATED_TO___GET_EXPRESSION_TEXT = CONTENT_OPERATOR_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Is Allocated To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ALLOCATED_TO_OPERATION_COUNT = CONTENT_OPERATOR_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link rba.core.impl.IsChangedImpl <em>Is Changed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IsChangedImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIsChanged()
	 * @generated
	 */
	int IS_CHANGED = 91;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED__TYPE = ALLOCATABLE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED__EXPRESSION = ALLOCATABLE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED__LET_STATEMENTS = ALLOCATABLE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED__OPERAND = ALLOCATABLE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_FEATURE_COUNT = ALLOCATABLE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED___GET_EXPRESSION_TEXT = ALLOCATABLE_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED___GET_EXPANDED = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED___CAN_EXPAND = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED___GET_SYMBOL = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED___GET_UNDERLYING_TYPE = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Is Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_OPERATION_COUNT = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link rba.core.impl.IsTranslatedToImpl <em>Is Translated To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.IsTranslatedToImpl
	 * @see rba.core.impl.RBACorePackageImpl#getIsTranslatedTo()
	 * @generated
	 */
	int IS_TRANSLATED_TO = 92;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_TO__TYPE = ALLOCATABLE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_TO__EXPRESSION = ALLOCATABLE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_TO__LET_STATEMENTS = ALLOCATABLE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_TO__OPERAND = ALLOCATABLE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Translated To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_TO_FEATURE_COUNT = ALLOCATABLE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_TO___GET_EXPANDED = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_TO___CAN_EXPAND = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_TO___GET_SYMBOL = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_TO___GET_UNDERLYING_TYPE = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_TO___GET_EXPRESSION_TEXT = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Is Translated To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_TO_OPERATION_COUNT = ALLOCATABLE_OPERATOR_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link rba.core.impl.GetStateImpl <em>Get State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.GetStateImpl
	 * @see rba.core.impl.RBACorePackageImpl#getGetState()
	 * @generated
	 */
	int GET_STATE = 93;

	/**
	 * The number of structural features of the '<em>Get State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_STATE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_STATE___GET_SYMBOL = 0;

	/**
	 * The number of operations of the '<em>Get State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_STATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.ContentStateOperatorImpl <em>Content State Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.ContentStateOperatorImpl
	 * @see rba.core.impl.RBACorePackageImpl#getContentStateOperator()
	 * @generated
	 */
	int CONTENT_STATE_OPERATOR = 94;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE_OPERATOR__TYPE = OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE_OPERATOR__EXPRESSION = OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE_OPERATOR__LET_STATEMENTS = OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE_OPERATOR__OPERAND = OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Content State Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE_OPERATOR___GET_UNDERLYING_TYPE = OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE_OPERATOR___GET_SYMBOL = OPERATOR___GET_SYMBOL;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE_OPERATOR___GET_EXPRESSION_TEXT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Content State Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_STATE_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.core.impl.NullExpressionImpl <em>Null Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.impl.NullExpressionImpl
	 * @see rba.core.impl.RBACorePackageImpl#getNullExpression()
	 * @generated
	 */
	int NULL_EXPRESSION = 95;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__LET_STATEMENTS = EXPRESSION__LET_STATEMENTS;

	/**
	 * The number of structural features of the '<em>Null Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION___GET_UNDERLYING_TYPE = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION___GET_EXPRESSION_TEXT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Null Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.core.ArbitrationPolicy <em>Arbitration Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.ArbitrationPolicy
	 * @see rba.core.impl.RBACorePackageImpl#getArbitrationPolicy()
	 * @generated
	 */
	int ARBITRATION_POLICY = 96;

	/**
	 * The meta object id for the '{@link rba.core.ExpressionType <em>Expression Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.ExpressionType
	 * @see rba.core.impl.RBACorePackageImpl#getExpressionType()
	 * @generated
	 */
	int EXPRESSION_TYPE = 97;

	/**
	 * The meta object id for the '{@link rba.core.LoserType <em>Loser Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.core.LoserType
	 * @see rba.core.impl.RBACorePackageImpl#getLoserType()
	 * @generated
	 */
	int LOSER_TYPE = 98;

	/**
	 * Returns the meta object for class '{@link rba.core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see rba.core.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rba.core.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for class '{@link rba.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see rba.core.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rba.core.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link rba.core.AbstractAllocatable <em>Abstract Allocatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Allocatable</em>'.
	 * @see rba.core.AbstractAllocatable
	 * @generated
	 */
	EClass getAbstractAllocatable();

	/**
	 * Returns the meta object for the reference list '{@link rba.core.AbstractAllocatable#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contents</em>'.
	 * @see rba.core.AbstractAllocatable#getContents()
	 * @see #getAbstractAllocatable()
	 * @generated
	 */
	EReference getAbstractAllocatable_Contents();

	/**
	 * Returns the meta object for the reference list '{@link rba.core.AbstractAllocatable#getAllocatableGroup <em>Allocatable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocatable Group</em>'.
	 * @see rba.core.AbstractAllocatable#getAllocatableGroup()
	 * @see #getAbstractAllocatable()
	 * @generated
	 */
	EReference getAbstractAllocatable_AllocatableGroup();

	/**
	 * Returns the meta object for the '{@link rba.core.AbstractAllocatable#getContentsList() <em>Get Contents List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents List</em>' operation.
	 * @see rba.core.AbstractAllocatable#getContentsList()
	 * @generated
	 */
	EOperation getAbstractAllocatable__GetContentsList();

	/**
	 * Returns the meta object for the '{@link rba.core.AbstractAllocatable#collectLeafAllocatable() <em>Collect Leaf Allocatable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Leaf Allocatable</em>' operation.
	 * @see rba.core.AbstractAllocatable#collectLeafAllocatable()
	 * @generated
	 */
	EOperation getAbstractAllocatable__CollectLeafAllocatable();

	/**
	 * Returns the meta object for class '{@link rba.core.Allocatable <em>Allocatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocatable</em>'.
	 * @see rba.core.Allocatable
	 * @generated
	 */
	EClass getAllocatable();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.Allocatable#getArbitrationPolicy <em>Arbitration Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arbitration Policy</em>'.
	 * @see rba.core.Allocatable#getArbitrationPolicy()
	 * @see #getAllocatable()
	 * @generated
	 */
	EAttribute getAllocatable_ArbitrationPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.Allocatable#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility</em>'.
	 * @see rba.core.Allocatable#getVisibility()
	 * @see #getAllocatable()
	 * @generated
	 */
	EReference getAllocatable_Visibility();

	/**
	 * Returns the meta object for the '{@link rba.core.Allocatable#collectLeafAllocatable() <em>Collect Leaf Allocatable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Leaf Allocatable</em>' operation.
	 * @see rba.core.Allocatable#collectLeafAllocatable()
	 * @generated
	 */
	EOperation getAllocatable__CollectLeafAllocatable();

	/**
	 * Returns the meta object for class '{@link rba.core.AllocatableSet <em>Allocatable Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocatable Set</em>'.
	 * @see rba.core.AllocatableSet
	 * @generated
	 */
	EClass getAllocatableSet();

	/**
	 * Returns the meta object for the reference list '{@link rba.core.AllocatableSet#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see rba.core.AllocatableSet#getTarget()
	 * @see #getAllocatableSet()
	 * @generated
	 */
	EReference getAllocatableSet_Target();

	/**
	 * Returns the meta object for the '{@link rba.core.AllocatableSet#collectLeafAllocatable() <em>Collect Leaf Allocatable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Leaf Allocatable</em>' operation.
	 * @see rba.core.AllocatableSet#collectLeafAllocatable()
	 * @generated
	 */
	EOperation getAllocatableSet__CollectLeafAllocatable();

	/**
	 * Returns the meta object for class '{@link rba.core.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see rba.core.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.Project#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see rba.core.Project#getVersion()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Version();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.Project#getDummyName <em>Dummy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dummy Name</em>'.
	 * @see rba.core.Project#getDummyName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_DummyName();

	/**
	 * Returns the meta object for the '{@link rba.core.Project#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see rba.core.Project#getName()
	 * @generated
	 */
	EOperation getProject__GetName();

	/**
	 * Returns the meta object for class '{@link rba.core.PackagableElement <em>Packagable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packagable Element</em>'.
	 * @see rba.core.PackagableElement
	 * @generated
	 */
	EClass getPackagableElement();

	/**
	 * Returns the meta object for class '{@link rba.core.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see rba.core.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link rba.core.Package#getPackagableelement <em>Packagableelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packagableelement</em>'.
	 * @see rba.core.Package#getPackagableelement()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Packagableelement();

	/**
	 * Returns the meta object for class '{@link rba.core.Stereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stereotype</em>'.
	 * @see rba.core.Stereotype
	 * @generated
	 */
	EClass getStereotype();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.Stereotype#getTargetModelName <em>Target Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Model Name</em>'.
	 * @see rba.core.Stereotype#getTargetModelName()
	 * @see #getStereotype()
	 * @generated
	 */
	EAttribute getStereotype_TargetModelName();

	/**
	 * Returns the meta object for the containment reference list '{@link rba.core.Stereotype#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see rba.core.Stereotype#getVariables()
	 * @see #getStereotype()
	 * @generated
	 */
	EReference getStereotype_Variables();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.Stereotype#getBodyText <em>Body Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body Text</em>'.
	 * @see rba.core.Stereotype#getBodyText()
	 * @see #getStereotype()
	 * @generated
	 */
	EAttribute getStereotype_BodyText();

	/**
	 * Returns the meta object for class '{@link rba.core.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see rba.core.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute list '{@link rba.core.Tag#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see rba.core.Tag#getValues()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Values();

	/**
	 * Returns the meta object for class '{@link rba.core.RuleObject <em>Rule Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Object</em>'.
	 * @see rba.core.RuleObject
	 * @generated
	 */
	EClass getRuleObject();

	/**
	 * Returns the meta object for the containment reference list '{@link rba.core.RuleObject#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see rba.core.RuleObject#getTags()
	 * @see #getRuleObject()
	 * @generated
	 */
	EReference getRuleObject_Tags();

	/**
	 * Returns the meta object for the '{@link rba.core.RuleObject#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.core.RuleObject#getExpressionType()
	 * @generated
	 */
	EOperation getRuleObject__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.core.AbstractContent <em>Abstract Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Content</em>'.
	 * @see rba.core.AbstractContent
	 * @generated
	 */
	EClass getAbstractContent();

	/**
	 * Returns the meta object for the reference list '{@link rba.core.AbstractContent#getContentGroup <em>Content Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content Group</em>'.
	 * @see rba.core.AbstractContent#getContentGroup()
	 * @see #getAbstractContent()
	 * @generated
	 */
	EReference getAbstractContent_ContentGroup();

	/**
	 * Returns the meta object for the reference list '{@link rba.core.AbstractContent#getAllocatable <em>Allocatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocatable</em>'.
	 * @see rba.core.AbstractContent#getAllocatable()
	 * @see #getAbstractContent()
	 * @generated
	 */
	EReference getAbstractContent_Allocatable();

	/**
	 * Returns the meta object for the '{@link rba.core.AbstractContent#getAllocatableList() <em>Get Allocatable List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Allocatable List</em>' operation.
	 * @see rba.core.AbstractContent#getAllocatableList()
	 * @generated
	 */
	EOperation getAbstractContent__GetAllocatableList();

	/**
	 * Returns the meta object for the '{@link rba.core.AbstractContent#collectLeafContents() <em>Collect Leaf Contents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Leaf Contents</em>' operation.
	 * @see rba.core.AbstractContent#collectLeafContents()
	 * @generated
	 */
	EOperation getAbstractContent__CollectLeafContents();

	/**
	 * Returns the meta object for class '{@link rba.core.AbstractScene <em>Abstract Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Scene</em>'.
	 * @see rba.core.AbstractScene
	 * @generated
	 */
	EClass getAbstractScene();

	/**
	 * Returns the meta object for class '{@link rba.core.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene</em>'.
	 * @see rba.core.Scene
	 * @generated
	 */
	EClass getScene();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.Scene#isGlobal <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global</em>'.
	 * @see rba.core.Scene#isGlobal()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Global();

	/**
	 * Returns the meta object for the containment reference list '{@link rba.core.Scene#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see rba.core.Scene#getProperties()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Properties();

	/**
	 * Returns the meta object for the '{@link rba.core.Scene#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.core.Scene#getExpressionType()
	 * @generated
	 */
	EOperation getScene__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.core.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see rba.core.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.Content#getLoserType <em>Loser Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loser Type</em>'.
	 * @see rba.core.Content#getLoserType()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_LoserType();

	/**
	 * Returns the meta object for the containment reference list '{@link rba.core.Content#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see rba.core.Content#getStates()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_States();

	/**
	 * Returns the meta object for the '{@link rba.core.Content#collectLeafContents() <em>Collect Leaf Contents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Leaf Contents</em>' operation.
	 * @see rba.core.Content#collectLeafContents()
	 * @generated
	 */
	EOperation getContent__CollectLeafContents();

	/**
	 * Returns the meta object for class '{@link rba.core.ContentSet <em>Content Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Set</em>'.
	 * @see rba.core.ContentSet
	 * @generated
	 */
	EClass getContentSet();

	/**
	 * Returns the meta object for the reference list '{@link rba.core.ContentSet#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see rba.core.ContentSet#getTarget()
	 * @see #getContentSet()
	 * @generated
	 */
	EReference getContentSet_Target();

	/**
	 * Returns the meta object for the '{@link rba.core.ContentSet#collectLeafContents() <em>Collect Leaf Contents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Leaf Contents</em>' operation.
	 * @see rba.core.ContentSet#collectLeafContents()
	 * @generated
	 */
	EOperation getContentSet__CollectLeafContents();

	/**
	 * Returns the meta object for class '{@link rba.core.ContentState <em>Content State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content State</em>'.
	 * @see rba.core.ContentState
	 * @generated
	 */
	EClass getContentState();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.ContentState#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see rba.core.ContentState#getValue()
	 * @see #getContentState()
	 * @generated
	 */
	EReference getContentState_Value();

	/**
	 * Returns the meta object for the container reference '{@link rba.core.ContentState#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see rba.core.ContentState#getOwner()
	 * @see #getContentState()
	 * @generated
	 */
	EReference getContentState_Owner();

	/**
	 * Returns the meta object for class '{@link rba.core.AbstractProperty <em>Abstract Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Property</em>'.
	 * @see rba.core.AbstractProperty
	 * @generated
	 */
	EClass getAbstractProperty();

	/**
	 * Returns the meta object for the container reference '{@link rba.core.AbstractProperty#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see rba.core.AbstractProperty#getOwner()
	 * @see #getAbstractProperty()
	 * @generated
	 */
	EReference getAbstractProperty_Owner();

	/**
	 * Returns the meta object for the '{@link rba.core.AbstractProperty#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.core.AbstractProperty#getExpressionType()
	 * @generated
	 */
	EOperation getAbstractProperty__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.core.IntegerProperty <em>Integer Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Property</em>'.
	 * @see rba.core.IntegerProperty
	 * @generated
	 */
	EClass getIntegerProperty();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.IntegerProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see rba.core.IntegerProperty#getValue()
	 * @see #getIntegerProperty()
	 * @generated
	 */
	EReference getIntegerProperty_Value();

	/**
	 * Returns the meta object for class '{@link rba.core.AbstractConstraint <em>Abstract Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Constraint</em>'.
	 * @see rba.core.AbstractConstraint
	 * @generated
	 */
	EClass getAbstractConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.AbstractConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see rba.core.AbstractConstraint#getExpression()
	 * @see #getAbstractConstraint()
	 * @generated
	 */
	EReference getAbstractConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link rba.core.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see rba.core.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.Constraint#isRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime</em>'.
	 * @see rba.core.Constraint#isRuntime()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Runtime();

	/**
	 * Returns the meta object for class '{@link rba.core.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see rba.core.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.Expression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rba.core.Expression#getType()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Type();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.Expression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see rba.core.Expression#getExpression()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link rba.core.Expression#getLetStatements <em>Let Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Let Statements</em>'.
	 * @see rba.core.Expression#getLetStatements()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_LetStatements();

	/**
	 * Returns the meta object for the '{@link rba.core.Expression#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.Expression#getUnderlyingType()
	 * @generated
	 */
	EOperation getExpression__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.Expression#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.Expression#getExpressionText()
	 * @generated
	 */
	EOperation getExpression__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.LetStatement <em>Let Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Statement</em>'.
	 * @see rba.core.LetStatement
	 * @generated
	 */
	EClass getLetStatement();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.LetStatement#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see rba.core.LetStatement#getVariable()
	 * @see #getLetStatement()
	 * @generated
	 */
	EReference getLetStatement_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.LetStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see rba.core.LetStatement#getBody()
	 * @see #getLetStatement()
	 * @generated
	 */
	EReference getLetStatement_Body();

	/**
	 * Returns the meta object for the '{@link rba.core.LetStatement#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see rba.core.LetStatement#toString()
	 * @generated
	 */
	EOperation getLetStatement__ToString();

	/**
	 * Returns the meta object for class '{@link rba.core.ComplexExpression <em>Complex Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Expression</em>'.
	 * @see rba.core.ComplexExpression
	 * @generated
	 */
	EClass getComplexExpression();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.ComplexExpression#getOtherExpression <em>Other Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other Expression</em>'.
	 * @see rba.core.ComplexExpression#getOtherExpression()
	 * @see #getComplexExpression()
	 * @generated
	 */
	EReference getComplexExpression_OtherExpression();

	/**
	 * Returns the meta object for the '{@link rba.core.ComplexExpression#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.ComplexExpression#getExpressionText()
	 * @generated
	 */
	EOperation getComplexExpression__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.ComplexExpression#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.ComplexExpression#getUnderlyingType()
	 * @generated
	 */
	EOperation getComplexExpression__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.ComplexExpression#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see rba.core.ComplexExpression#getType()
	 * @generated
	 */
	EOperation getComplexExpression__GetType();

	/**
	 * Returns the meta object for class '{@link rba.core.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see rba.core.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link rba.core.Operator#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see rba.core.Operator#getOperand()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Operand();

	/**
	 * Returns the meta object for the '{@link rba.core.Operator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.Operator#getSymbol()
	 * @generated
	 */
	EOperation getOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.IsTypeOf <em>Is Type Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Type Of</em>'.
	 * @see rba.core.IsTypeOf
	 * @generated
	 */
	EClass getIsTypeOf();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.IsTypeOf#getTagName <em>Tag Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Name</em>'.
	 * @see rba.core.IsTypeOf#getTagName()
	 * @see #getIsTypeOf()
	 * @generated
	 */
	EAttribute getIsTypeOf_TagName();

	/**
	 * Returns the meta object for the '{@link rba.core.IsTypeOf#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.IsTypeOf#getExpressionText()
	 * @generated
	 */
	EOperation getIsTypeOf__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.IsTypeOf#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.IsTypeOf#getSymbol()
	 * @generated
	 */
	EOperation getIsTypeOf__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.IsTypeOf#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.IsTypeOf#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsTypeOf__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.ObjectReference <em>Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Reference</em>'.
	 * @see rba.core.ObjectReference
	 * @generated
	 */
	EClass getObjectReference();

	/**
	 * Returns the meta object for the reference '{@link rba.core.ObjectReference#getRefObject <em>Ref Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Object</em>'.
	 * @see rba.core.ObjectReference#getRefObject()
	 * @see #getObjectReference()
	 * @generated
	 */
	EReference getObjectReference_RefObject();

	/**
	 * Returns the meta object for the '{@link rba.core.ObjectReference#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.ObjectReference#getUnderlyingType()
	 * @generated
	 */
	EOperation getObjectReference__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.ObjectReference#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.ObjectReference#getExpressionText()
	 * @generated
	 */
	EOperation getObjectReference__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.PreviousModifier <em>Previous Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Previous Modifier</em>'.
	 * @see rba.core.PreviousModifier
	 * @generated
	 */
	EClass getPreviousModifier();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.PreviousModifier#getObjReference <em>Obj Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obj Reference</em>'.
	 * @see rba.core.PreviousModifier#getObjReference()
	 * @see #getPreviousModifier()
	 * @generated
	 */
	EReference getPreviousModifier_ObjReference();

	/**
	 * Returns the meta object for the '{@link rba.core.PreviousModifier#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.PreviousModifier#getSymbol()
	 * @generated
	 */
	EOperation getPreviousModifier__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.PreviousModifier#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.PreviousModifier#getUnderlyingType()
	 * @generated
	 */
	EOperation getPreviousModifier__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.PreviousModifier#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.PreviousModifier#getExpressionText()
	 * @generated
	 */
	EOperation getPreviousModifier__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.GreaterThanOperator <em>Greater Than Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Operator</em>'.
	 * @see rba.core.GreaterThanOperator
	 * @generated
	 */
	EClass getGreaterThanOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.GreaterThanOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.GreaterThanOperator#getSymbol()
	 * @generated
	 */
	EOperation getGreaterThanOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.MuchGreaterThanOperator <em>Much Greater Than Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Much Greater Than Operator</em>'.
	 * @see rba.core.MuchGreaterThanOperator
	 * @generated
	 */
	EClass getMuchGreaterThanOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.MuchGreaterThanOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.MuchGreaterThanOperator#getSymbol()
	 * @generated
	 */
	EOperation getMuchGreaterThanOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.LowerThanOperator <em>Lower Than Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Than Operator</em>'.
	 * @see rba.core.LowerThanOperator
	 * @generated
	 */
	EClass getLowerThanOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.LowerThanOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.LowerThanOperator#getSymbol()
	 * @generated
	 */
	EOperation getLowerThanOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Operator</em>'.
	 * @see rba.core.ComparisonOperator
	 * @generated
	 */
	EClass getComparisonOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.ComparisonOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.ComparisonOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getComparisonOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.ComparisonOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.ComparisonOperator#getExpressionText()
	 * @generated
	 */
	EOperation getComparisonOperator__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.EqualToOperator <em>Equal To Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal To Operator</em>'.
	 * @see rba.core.EqualToOperator
	 * @generated
	 */
	EClass getEqualToOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.EqualToOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.EqualToOperator#getSymbol()
	 * @generated
	 */
	EOperation getEqualToOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.ComparisonAnd <em>Comparison And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison And</em>'.
	 * @see rba.core.ComparisonAnd
	 * @generated
	 */
	EClass getComparisonAnd();

	/**
	 * Returns the meta object for the '{@link rba.core.ComparisonAnd#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.ComparisonAnd#getSymbol()
	 * @generated
	 */
	EOperation getComparisonAnd__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.ComparisonAnd#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.ComparisonAnd#getExpressionText()
	 * @generated
	 */
	EOperation getComparisonAnd__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operator</em>'.
	 * @see rba.core.LogicalOperator
	 * @generated
	 */
	EClass getLogicalOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.LogicalOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.LogicalOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getLogicalOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.LogicalOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.LogicalOperator#getExpressionText()
	 * @generated
	 */
	EOperation getLogicalOperator__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.AndOperator <em>And Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Operator</em>'.
	 * @see rba.core.AndOperator
	 * @generated
	 */
	EClass getAndOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.AndOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.AndOperator#getSymbol()
	 * @generated
	 */
	EOperation getAndOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.OrOperator <em>Or Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Operator</em>'.
	 * @see rba.core.OrOperator
	 * @generated
	 */
	EClass getOrOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.OrOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.OrOperator#getSymbol()
	 * @generated
	 */
	EOperation getOrOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.NotOperator <em>Not Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Operator</em>'.
	 * @see rba.core.NotOperator
	 * @generated
	 */
	EClass getNotOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.NotOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.NotOperator#getSymbol()
	 * @generated
	 */
	EOperation getNotOperator__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.NotOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.NotOperator#getExpressionText()
	 * @generated
	 */
	EOperation getNotOperator__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.IsEqualToOperator <em>Is Equal To Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Equal To Operator</em>'.
	 * @see rba.core.IsEqualToOperator
	 * @generated
	 */
	EClass getIsEqualToOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.IsEqualToOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.IsEqualToOperator#getSymbol()
	 * @generated
	 */
	EOperation getIsEqualToOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.IsGreaterThanOperator <em>Is Greater Than Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Greater Than Operator</em>'.
	 * @see rba.core.IsGreaterThanOperator
	 * @generated
	 */
	EClass getIsGreaterThanOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.IsGreaterThanOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.IsGreaterThanOperator#getSymbol()
	 * @generated
	 */
	EOperation getIsGreaterThanOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.IsLowerThanOperator <em>Is Lower Than Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Lower Than Operator</em>'.
	 * @see rba.core.IsLowerThanOperator
	 * @generated
	 */
	EClass getIsLowerThanOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.IsLowerThanOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.IsLowerThanOperator#getSymbol()
	 * @generated
	 */
	EOperation getIsLowerThanOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.IsGreaterThanEqualOperator <em>Is Greater Than Equal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Greater Than Equal Operator</em>'.
	 * @see rba.core.IsGreaterThanEqualOperator
	 * @generated
	 */
	EClass getIsGreaterThanEqualOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.IsGreaterThanEqualOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.IsGreaterThanEqualOperator#getSymbol()
	 * @generated
	 */
	EOperation getIsGreaterThanEqualOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.IsLowerThanEqualOperator <em>Is Lower Than Equal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Lower Than Equal Operator</em>'.
	 * @see rba.core.IsLowerThanEqualOperator
	 * @generated
	 */
	EClass getIsLowerThanEqualOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.IsLowerThanEqualOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.IsLowerThanEqualOperator#getSymbol()
	 * @generated
	 */
	EOperation getIsLowerThanEqualOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Operator</em>'.
	 * @see rba.core.ArithmeticOperator
	 * @generated
	 */
	EClass getArithmeticOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.ArithmeticOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.ArithmeticOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getArithmeticOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.ArithmeticOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.ArithmeticOperator#getExpressionText()
	 * @generated
	 */
	EOperation getArithmeticOperator__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.PlusOperator <em>Plus Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus Operator</em>'.
	 * @see rba.core.PlusOperator
	 * @generated
	 */
	EClass getPlusOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.PlusOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.PlusOperator#getSymbol()
	 * @generated
	 */
	EOperation getPlusOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.ImpliesOperator <em>Implies Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies Operator</em>'.
	 * @see rba.core.ImpliesOperator
	 * @generated
	 */
	EClass getImpliesOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.ImpliesOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.ImpliesOperator#getSymbol()
	 * @generated
	 */
	EOperation getImpliesOperator__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.ContentOperator <em>Content Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Operator</em>'.
	 * @see rba.core.ContentOperator
	 * @generated
	 */
	EClass getContentOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.ContentOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.ContentOperator#getExpressionText()
	 * @generated
	 */
	EOperation getContentOperator__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.IsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Active</em>'.
	 * @see rba.core.IsActive
	 * @generated
	 */
	EClass getIsActive();

	/**
	 * Returns the meta object for the '{@link rba.core.IsActive#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.IsActive#getSymbol()
	 * @generated
	 */
	EOperation getIsActive__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.IsActive#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.IsActive#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsActive__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.GetAllocatables <em>Get Allocatables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Allocatables</em>'.
	 * @see rba.core.GetAllocatables
	 * @generated
	 */
	EClass getGetAllocatables();

	/**
	 * Returns the meta object for the '{@link rba.core.GetAllocatables#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.GetAllocatables#getSymbol()
	 * @generated
	 */
	EOperation getGetAllocatables__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.GetAllocatables#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.GetAllocatables#getUnderlyingType()
	 * @generated
	 */
	EOperation getGetAllocatables__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.HasBeenDisplayed <em>Has Been Displayed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Been Displayed</em>'.
	 * @see rba.core.HasBeenDisplayed
	 * @generated
	 */
	EClass getHasBeenDisplayed();

	/**
	 * Returns the meta object for the '{@link rba.core.HasBeenDisplayed#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.HasBeenDisplayed#getSymbol()
	 * @generated
	 */
	EOperation getHasBeenDisplayed__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.HasBeenDisplayed#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.HasBeenDisplayed#getUnderlyingType()
	 * @generated
	 */
	EOperation getHasBeenDisplayed__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.ActiveState <em>Active State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active State</em>'.
	 * @see rba.core.ActiveState
	 * @generated
	 */
	EClass getActiveState();

	/**
	 * Returns the meta object for the '{@link rba.core.ActiveState#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.ActiveState#getSymbol()
	 * @generated
	 */
	EOperation getActiveState__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.ActiveState#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.ActiveState#getUnderlyingType()
	 * @generated
	 */
	EOperation getActiveState__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.ObjectCompare <em>Object Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Compare</em>'.
	 * @see rba.core.ObjectCompare
	 * @generated
	 */
	EClass getObjectCompare();

	/**
	 * Returns the meta object for the '{@link rba.core.ObjectCompare#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.ObjectCompare#getSymbol()
	 * @generated
	 */
	EOperation getObjectCompare__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.ObjectCompare#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.ObjectCompare#getUnderlyingType()
	 * @generated
	 */
	EOperation getObjectCompare__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.ObjectCompare#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.ObjectCompare#getExpressionText()
	 * @generated
	 */
	EOperation getObjectCompare__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.ThatOfOperator <em>That Of Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>That Of Operator</em>'.
	 * @see rba.core.ThatOfOperator
	 * @generated
	 */
	EClass getThatOfOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.ThatOfOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.ThatOfOperator#getExpressionText()
	 * @generated
	 */
	EOperation getThatOfOperator__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.ThatOfOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.ThatOfOperator#getSymbol()
	 * @generated
	 */
	EOperation getThatOfOperator__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.ThatOfOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.ThatOfOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getThatOfOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.ValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Expression</em>'.
	 * @see rba.core.ValueExpression
	 * @generated
	 */
	EClass getValueExpression();

	/**
	 * Returns the meta object for the '{@link rba.core.ValueExpression#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.ValueExpression#getUnderlyingType()
	 * @generated
	 */
	EOperation getValueExpression__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.ValueExpression#getExpressionValue() <em>Get Expression Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Value</em>' operation.
	 * @see rba.core.ValueExpression#getExpressionValue()
	 * @generated
	 */
	EOperation getValueExpression__GetExpressionValue();

	/**
	 * Returns the meta object for the '{@link rba.core.ValueExpression#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see rba.core.ValueExpression#getType()
	 * @generated
	 */
	EOperation getValueExpression__GetType();

	/**
	 * Returns the meta object for class '{@link rba.core.MaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Value</em>'.
	 * @see rba.core.MaxValue
	 * @generated
	 */
	EClass getMaxValue();

	/**
	 * Returns the meta object for the '{@link rba.core.MaxValue#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.MaxValue#getExpressionText()
	 * @generated
	 */
	EOperation getMaxValue__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.MaxValue#getExpressionValue() <em>Get Expression Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Value</em>' operation.
	 * @see rba.core.MaxValue#getExpressionValue()
	 * @generated
	 */
	EOperation getMaxValue__GetExpressionValue();

	/**
	 * Returns the meta object for class '{@link rba.core.MinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Value</em>'.
	 * @see rba.core.MinValue
	 * @generated
	 */
	EClass getMinValue();

	/**
	 * Returns the meta object for the '{@link rba.core.MinValue#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.MinValue#getExpressionText()
	 * @generated
	 */
	EOperation getMinValue__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.MinValue#getExpressionValue() <em>Get Expression Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Value</em>' operation.
	 * @see rba.core.MinValue#getExpressionValue()
	 * @generated
	 */
	EOperation getMinValue__GetExpressionValue();

	/**
	 * Returns the meta object for class '{@link rba.core.NoneValue <em>None Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None Value</em>'.
	 * @see rba.core.NoneValue
	 * @generated
	 */
	EClass getNoneValue();

	/**
	 * Returns the meta object for the '{@link rba.core.NoneValue#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.NoneValue#getExpressionText()
	 * @generated
	 */
	EOperation getNoneValue__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.NoneValue#getExpressionValue() <em>Get Expression Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Value</em>' operation.
	 * @see rba.core.NoneValue#getExpressionValue()
	 * @generated
	 */
	EOperation getNoneValue__GetExpressionValue();

	/**
	 * Returns the meta object for class '{@link rba.core.StandardValue <em>Standard Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Value</em>'.
	 * @see rba.core.StandardValue
	 * @generated
	 */
	EClass getStandardValue();

	/**
	 * Returns the meta object for the '{@link rba.core.StandardValue#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.StandardValue#getExpressionText()
	 * @generated
	 */
	EOperation getStandardValue__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.StandardValue#getExpressionValue() <em>Get Expression Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Value</em>' operation.
	 * @see rba.core.StandardValue#getExpressionValue()
	 * @generated
	 */
	EOperation getStandardValue__GetExpressionValue();

	/**
	 * Returns the meta object for class '{@link rba.core.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see rba.core.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see rba.core.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for the '{@link rba.core.IntegerValue#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.IntegerValue#getExpressionText()
	 * @generated
	 */
	EOperation getIntegerValue__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.IntegerValue#getExpressionValue() <em>Get Expression Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Value</em>' operation.
	 * @see rba.core.IntegerValue#getExpressionValue()
	 * @generated
	 */
	EOperation getIntegerValue__GetExpressionValue();

	/**
	 * Returns the meta object for class '{@link rba.core.EnumExpression <em>Enum Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Expression</em>'.
	 * @see rba.core.EnumExpression
	 * @generated
	 */
	EClass getEnumExpression();

	/**
	 * Returns the meta object for the '{@link rba.core.EnumExpression#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.EnumExpression#getUnderlyingType()
	 * @generated
	 */
	EOperation getEnumExpression__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.EnumExpression#getExpressionValue() <em>Get Expression Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Value</em>' operation.
	 * @see rba.core.EnumExpression#getExpressionValue()
	 * @generated
	 */
	EOperation getEnumExpression__GetExpressionValue();

	/**
	 * Returns the meta object for the '{@link rba.core.EnumExpression#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see rba.core.EnumExpression#getType()
	 * @generated
	 */
	EOperation getEnumExpression__GetType();

	/**
	 * Returns the meta object for class '{@link rba.core.LoserTypeExpression <em>Loser Type Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loser Type Expression</em>'.
	 * @see rba.core.LoserTypeExpression
	 * @generated
	 */
	EClass getLoserTypeExpression();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.LoserTypeExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see rba.core.LoserTypeExpression#getValue()
	 * @see #getLoserTypeExpression()
	 * @generated
	 */
	EAttribute getLoserTypeExpression_Value();

	/**
	 * Returns the meta object for the '{@link rba.core.LoserTypeExpression#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.LoserTypeExpression#getExpressionText()
	 * @generated
	 */
	EOperation getLoserTypeExpression__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.LoserTypeExpression#getExpressionValue() <em>Get Expression Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Value</em>' operation.
	 * @see rba.core.LoserTypeExpression#getExpressionValue()
	 * @generated
	 */
	EOperation getLoserTypeExpression__GetExpressionValue();

	/**
	 * Returns the meta object for class '{@link rba.core.ArbitrationPolicyExpression <em>Arbitration Policy Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitration Policy Expression</em>'.
	 * @see rba.core.ArbitrationPolicyExpression
	 * @generated
	 */
	EClass getArbitrationPolicyExpression();

	/**
	 * Returns the meta object for the attribute '{@link rba.core.ArbitrationPolicyExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see rba.core.ArbitrationPolicyExpression#getValue()
	 * @see #getArbitrationPolicyExpression()
	 * @generated
	 */
	EAttribute getArbitrationPolicyExpression_Value();

	/**
	 * Returns the meta object for the '{@link rba.core.ArbitrationPolicyExpression#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.ArbitrationPolicyExpression#getExpressionText()
	 * @generated
	 */
	EOperation getArbitrationPolicyExpression__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.ArbitrationPolicyExpression#getExpressionValue() <em>Get Expression Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Value</em>' operation.
	 * @see rba.core.ArbitrationPolicyExpression#getExpressionValue()
	 * @generated
	 */
	EOperation getArbitrationPolicyExpression__GetExpressionValue();

	/**
	 * Returns the meta object for class '{@link rba.core.SetExpression <em>Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Expression</em>'.
	 * @see rba.core.SetExpression
	 * @generated
	 */
	EClass getSetExpression();

	/**
	 * Returns the meta object for class '{@link rba.core.SetOperator <em>Set Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Operator</em>'.
	 * @see rba.core.SetOperator
	 * @generated
	 */
	EClass getSetOperator();

	/**
	 * Returns the meta object for class '{@link rba.core.SizeOperator <em>Size Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Operator</em>'.
	 * @see rba.core.SizeOperator
	 * @generated
	 */
	EClass getSizeOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.SizeOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.SizeOperator#getExpressionText()
	 * @generated
	 */
	EOperation getSizeOperator__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.SizeOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.SizeOperator#getSymbol()
	 * @generated
	 */
	EOperation getSizeOperator__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.SizeOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.SizeOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getSizeOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.ExistsOperator <em>Exists Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exists Operator</em>'.
	 * @see rba.core.ExistsOperator
	 * @generated
	 */
	EClass getExistsOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.ExistsOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.ExistsOperator#getExpressionText()
	 * @generated
	 */
	EOperation getExistsOperator__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.ExistsOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.ExistsOperator#getSymbol()
	 * @generated
	 */
	EOperation getExistsOperator__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.ExistsOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.ExistsOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getExistsOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.ForAllOperator <em>For All Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For All Operator</em>'.
	 * @see rba.core.ForAllOperator
	 * @generated
	 */
	EClass getForAllOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.ForAllOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.ForAllOperator#getExpressionText()
	 * @generated
	 */
	EOperation getForAllOperator__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.ForAllOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.ForAllOperator#getSymbol()
	 * @generated
	 */
	EOperation getForAllOperator__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.ForAllOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.ForAllOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getForAllOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.MaxOperator <em>Max Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Operator</em>'.
	 * @see rba.core.MaxOperator
	 * @generated
	 */
	EClass getMaxOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.MaxOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.MaxOperator#getExpressionText()
	 * @generated
	 */
	EOperation getMaxOperator__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.MaxOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.MaxOperator#getSymbol()
	 * @generated
	 */
	EOperation getMaxOperator__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.MaxOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.MaxOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getMaxOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.MinOperator <em>Min Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Operator</em>'.
	 * @see rba.core.MinOperator
	 * @generated
	 */
	EClass getMinOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.MinOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.MinOperator#getExpressionText()
	 * @generated
	 */
	EOperation getMinOperator__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.MinOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.MinOperator#getSymbol()
	 * @generated
	 */
	EOperation getMinOperator__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.MinOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.MinOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getMinOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.SelectOperator <em>Select Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Operator</em>'.
	 * @see rba.core.SelectOperator
	 * @generated
	 */
	EClass getSelectOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.SelectOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.SelectOperator#getExpressionText()
	 * @generated
	 */
	EOperation getSelectOperator__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.SelectOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.SelectOperator#getSymbol()
	 * @generated
	 */
	EOperation getSelectOperator__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.SelectOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.SelectOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getSelectOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.SetOfOperator <em>Set Of Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Of Operator</em>'.
	 * @see rba.core.SetOfOperator
	 * @generated
	 */
	EClass getSetOfOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.SetOfOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.SetOfOperator#getExpressionText()
	 * @generated
	 */
	EOperation getSetOfOperator__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.SetOfOperator#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.SetOfOperator#getSymbol()
	 * @generated
	 */
	EOperation getSetOfOperator__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.SetOfOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.SetOfOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getSetOfOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.LambdaExpression <em>Lambda Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lambda Expression</em>'.
	 * @see rba.core.LambdaExpression
	 * @generated
	 */
	EClass getLambdaExpression();

	/**
	 * Returns the meta object for the container reference '{@link rba.core.LambdaExpression#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see rba.core.LambdaExpression#getContext()
	 * @see #getLambdaExpression()
	 * @generated
	 */
	EReference getLambdaExpression_Context();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.LambdaExpression#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X</em>'.
	 * @see rba.core.LambdaExpression#getX()
	 * @see #getLambdaExpression()
	 * @generated
	 */
	EReference getLambdaExpression_X();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.LambdaExpression#getBodyText <em>Body Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body Text</em>'.
	 * @see rba.core.LambdaExpression#getBodyText()
	 * @see #getLambdaExpression()
	 * @generated
	 */
	EReference getLambdaExpression_BodyText();

	/**
	 * Returns the meta object for the '{@link rba.core.LambdaExpression#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.LambdaExpression#getExpressionText()
	 * @generated
	 */
	EOperation getLambdaExpression__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.core.LambdaExpression#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.LambdaExpression#getUnderlyingType()
	 * @generated
	 */
	EOperation getLambdaExpression__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see rba.core.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the '{@link rba.core.Variable#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.core.Variable#getExpressionType()
	 * @generated
	 */
	EOperation getVariable__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.core.LambdaContext <em>Lambda Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lambda Context</em>'.
	 * @see rba.core.LambdaContext
	 * @generated
	 */
	EClass getLambdaContext();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.LambdaContext#getLambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lambda</em>'.
	 * @see rba.core.LambdaContext#getLambda()
	 * @see #getLambdaContext()
	 * @generated
	 */
	EReference getLambdaContext_Lambda();

	/**
	 * Returns the meta object for the '{@link rba.core.LambdaContext#getContextType() <em>Get Context Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Context Type</em>' operation.
	 * @see rba.core.LambdaContext#getContextType()
	 * @generated
	 */
	EOperation getLambdaContext__GetContextType();

	/**
	 * Returns the meta object for class '{@link rba.core.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see rba.core.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.IfStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see rba.core.IfStatement#getCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.IfStatement#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see rba.core.IfStatement#getThenExpression()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ThenExpression();

	/**
	 * Returns the meta object for the containment reference '{@link rba.core.IfStatement#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see rba.core.IfStatement#getElseExpression()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseExpression();

	/**
	 * Returns the meta object for the '{@link rba.core.IfStatement#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.IfStatement#getUnderlyingType()
	 * @generated
	 */
	EOperation getIfStatement__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.IfStatement#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.IfStatement#getExpressionText()
	 * @generated
	 */
	EOperation getIfStatement__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.SceneOperator <em>Scene Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene Operator</em>'.
	 * @see rba.core.SceneOperator
	 * @generated
	 */
	EClass getSceneOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.SceneOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.SceneOperator#getExpressionText()
	 * @generated
	 */
	EOperation getSceneOperator__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.IsOn <em>Is On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is On</em>'.
	 * @see rba.core.IsOn
	 * @generated
	 */
	EClass getIsOn();

	/**
	 * Returns the meta object for the '{@link rba.core.IsOn#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.IsOn#getSymbol()
	 * @generated
	 */
	EOperation getIsOn__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.IsOn#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.IsOn#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsOn__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.AllocatableOperator <em>Allocatable Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocatable Operator</em>'.
	 * @see rba.core.AllocatableOperator
	 * @generated
	 */
	EClass getAllocatableOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.AllocatableOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.AllocatableOperator#getExpressionText()
	 * @generated
	 */
	EOperation getAllocatableOperator__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.AllocatedContent <em>Allocated Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocated Content</em>'.
	 * @see rba.core.AllocatedContent
	 * @generated
	 */
	EClass getAllocatedContent();

	/**
	 * Returns the meta object for the '{@link rba.core.AllocatedContent#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.AllocatedContent#getSymbol()
	 * @generated
	 */
	EOperation getAllocatedContent__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.AllocatedContent#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.AllocatedContent#getUnderlyingType()
	 * @generated
	 */
	EOperation getAllocatedContent__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.ContentValue <em>Content Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Value</em>'.
	 * @see rba.core.ContentValue
	 * @generated
	 */
	EClass getContentValue();

	/**
	 * Returns the meta object for the '{@link rba.core.ContentValue#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.ContentValue#getSymbol()
	 * @generated
	 */
	EOperation getContentValue__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.ContentValue#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.ContentValue#getUnderlyingType()
	 * @generated
	 */
	EOperation getContentValue__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.GetContentsList <em>Get Contents List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Contents List</em>'.
	 * @see rba.core.GetContentsList
	 * @generated
	 */
	EClass getGetContentsList();

	/**
	 * Returns the meta object for the '{@link rba.core.GetContentsList#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.GetContentsList#getSymbol()
	 * @generated
	 */
	EOperation getGetContentsList__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.GetContentsList#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.GetContentsList#getUnderlyingType()
	 * @generated
	 */
	EOperation getGetContentsList__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.ActiveContents <em>Active Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Contents</em>'.
	 * @see rba.core.ActiveContents
	 * @generated
	 */
	EClass getActiveContents();

	/**
	 * Returns the meta object for the '{@link rba.core.ActiveContents#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.ActiveContents#getSymbol()
	 * @generated
	 */
	EOperation getActiveContents__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.ActiveContents#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.ActiveContents#getUnderlyingType()
	 * @generated
	 */
	EOperation getActiveContents__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.PropertyOperator <em>Property Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Operator</em>'.
	 * @see rba.core.PropertyOperator
	 * @generated
	 */
	EClass getPropertyOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.PropertyOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.PropertyOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getPropertyOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.PropertyOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.PropertyOperator#getExpressionText()
	 * @generated
	 */
	EOperation getPropertyOperator__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.GetProperty <em>Get Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Property</em>'.
	 * @see rba.core.GetProperty
	 * @generated
	 */
	EClass getGetProperty();

	/**
	 * Returns the meta object for the '{@link rba.core.GetProperty#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.GetProperty#getSymbol()
	 * @generated
	 */
	EOperation getGetProperty__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.GetProperty#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.GetProperty#getUnderlyingType()
	 * @generated
	 */
	EOperation getGetProperty__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.StateValue <em>State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Value</em>'.
	 * @see rba.core.StateValue
	 * @generated
	 */
	EClass getStateValue();

	/**
	 * Returns the meta object for the '{@link rba.core.StateValue#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.StateValue#getSymbol()
	 * @generated
	 */
	EOperation getStateValue__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.StateValue#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.StateValue#getUnderlyingType()
	 * @generated
	 */
	EOperation getStateValue__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.HasComeLaterThan <em>Has Come Later Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Come Later Than</em>'.
	 * @see rba.core.HasComeLaterThan
	 * @generated
	 */
	EClass getHasComeLaterThan();

	/**
	 * Returns the meta object for the '{@link rba.core.HasComeLaterThan#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.HasComeLaterThan#getSymbol()
	 * @generated
	 */
	EOperation getHasComeLaterThan__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.HasComeLaterThan#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.HasComeLaterThan#getUnderlyingType()
	 * @generated
	 */
	EOperation getHasComeLaterThan__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.HasComeLaterThan#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.HasComeLaterThan#getExpressionText()
	 * @generated
	 */
	EOperation getHasComeLaterThan__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.HasComeEarlierThan <em>Has Come Earlier Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Come Earlier Than</em>'.
	 * @see rba.core.HasComeEarlierThan
	 * @generated
	 */
	EClass getHasComeEarlierThan();

	/**
	 * Returns the meta object for the '{@link rba.core.HasComeEarlierThan#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.HasComeEarlierThan#getSymbol()
	 * @generated
	 */
	EOperation getHasComeEarlierThan__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.HasComeEarlierThan#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.HasComeEarlierThan#getUnderlyingType()
	 * @generated
	 */
	EOperation getHasComeEarlierThan__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.HasComeEarlierThan#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.HasComeEarlierThan#getExpressionText()
	 * @generated
	 */
	EOperation getHasComeEarlierThan__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.SugarExpression <em>Sugar Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sugar Expression</em>'.
	 * @see rba.core.SugarExpression
	 * @generated
	 */
	EClass getSugarExpression();

	/**
	 * Returns the meta object for the '{@link rba.core.SugarExpression#canExpand() <em>Can Expand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Expand</em>' operation.
	 * @see rba.core.SugarExpression#canExpand()
	 * @generated
	 */
	EOperation getSugarExpression__CanExpand();

	/**
	 * Returns the meta object for the '{@link rba.core.SugarExpression#getExpanded() <em>Get Expanded</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expanded</em>' operation.
	 * @see rba.core.SugarExpression#getExpanded()
	 * @generated
	 */
	EOperation getSugarExpression__GetExpanded();

	/**
	 * Returns the meta object for class '{@link rba.core.SugarExpressionBase <em>Sugar Expression Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sugar Expression Base</em>'.
	 * @see rba.core.SugarExpressionBase
	 * @generated
	 */
	EClass getSugarExpressionBase();

	/**
	 * Returns the meta object for the '{@link rba.core.SugarExpressionBase#canExpand() <em>Can Expand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Expand</em>' operation.
	 * @see rba.core.SugarExpressionBase#canExpand()
	 * @generated
	 */
	EOperation getSugarExpressionBase__CanExpand();

	/**
	 * Returns the meta object for class '{@link rba.core.ObjectCompareNot <em>Object Compare Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Compare Not</em>'.
	 * @see rba.core.ObjectCompareNot
	 * @generated
	 */
	EClass getObjectCompareNot();

	/**
	 * Returns the meta object for the '{@link rba.core.ObjectCompareNot#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.ObjectCompareNot#getSymbol()
	 * @generated
	 */
	EOperation getObjectCompareNot__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.ObjectCompareNot#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.ObjectCompareNot#getUnderlyingType()
	 * @generated
	 */
	EOperation getObjectCompareNot__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.ObjectCompareNot#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.ObjectCompareNot#getExpressionText()
	 * @generated
	 */
	EOperation getObjectCompareNot__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.IsAllocatedTo <em>Is Allocated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Allocated To</em>'.
	 * @see rba.core.IsAllocatedTo
	 * @generated
	 */
	EClass getIsAllocatedTo();

	/**
	 * Returns the meta object for the '{@link rba.core.IsAllocatedTo#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.IsAllocatedTo#getSymbol()
	 * @generated
	 */
	EOperation getIsAllocatedTo__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.IsAllocatedTo#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.IsAllocatedTo#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsAllocatedTo__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.IsAllocatedTo#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.IsAllocatedTo#getExpressionText()
	 * @generated
	 */
	EOperation getIsAllocatedTo__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.IsChanged <em>Is Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Changed</em>'.
	 * @see rba.core.IsChanged
	 * @generated
	 */
	EClass getIsChanged();

	/**
	 * Returns the meta object for the '{@link rba.core.IsChanged#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.IsChanged#getSymbol()
	 * @generated
	 */
	EOperation getIsChanged__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.IsChanged#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.IsChanged#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsChanged__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.core.IsTranslatedTo <em>Is Translated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Translated To</em>'.
	 * @see rba.core.IsTranslatedTo
	 * @generated
	 */
	EClass getIsTranslatedTo();

	/**
	 * Returns the meta object for the '{@link rba.core.IsTranslatedTo#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.IsTranslatedTo#getSymbol()
	 * @generated
	 */
	EOperation getIsTranslatedTo__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.core.IsTranslatedTo#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.IsTranslatedTo#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsTranslatedTo__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.IsTranslatedTo#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.IsTranslatedTo#getExpressionText()
	 * @generated
	 */
	EOperation getIsTranslatedTo__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.GetState <em>Get State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get State</em>'.
	 * @see rba.core.GetState
	 * @generated
	 */
	EClass getGetState();

	/**
	 * Returns the meta object for the '{@link rba.core.GetState#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.core.GetState#getSymbol()
	 * @generated
	 */
	EOperation getGetState__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.core.ContentStateOperator <em>Content State Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content State Operator</em>'.
	 * @see rba.core.ContentStateOperator
	 * @generated
	 */
	EClass getContentStateOperator();

	/**
	 * Returns the meta object for the '{@link rba.core.ContentStateOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.ContentStateOperator#getExpressionText()
	 * @generated
	 */
	EOperation getContentStateOperator__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.core.NullExpression <em>Null Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Expression</em>'.
	 * @see rba.core.NullExpression
	 * @generated
	 */
	EClass getNullExpression();

	/**
	 * Returns the meta object for the '{@link rba.core.NullExpression#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.core.NullExpression#getUnderlyingType()
	 * @generated
	 */
	EOperation getNullExpression__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.core.NullExpression#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.core.NullExpression#getExpressionText()
	 * @generated
	 */
	EOperation getNullExpression__GetExpressionText();

	/**
	 * Returns the meta object for enum '{@link rba.core.ArbitrationPolicy <em>Arbitration Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arbitration Policy</em>'.
	 * @see rba.core.ArbitrationPolicy
	 * @generated
	 */
	EEnum getArbitrationPolicy();

	/**
	 * Returns the meta object for enum '{@link rba.core.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Type</em>'.
	 * @see rba.core.ExpressionType
	 * @generated
	 */
	EEnum getExpressionType();

	/**
	 * Returns the meta object for enum '{@link rba.core.LoserType <em>Loser Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loser Type</em>'.
	 * @see rba.core.LoserType
	 * @generated
	 */
	EEnum getLoserType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RBACoreFactory getRBACoreFactory();

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
		 * The meta object literal for the '{@link rba.core.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ModelElementImpl
		 * @see rba.core.impl.RBACorePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

		/**
		 * The meta object literal for the '{@link rba.core.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.NamedElementImpl
		 * @see rba.core.impl.RBACorePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link rba.core.impl.AbstractAllocatableImpl <em>Abstract Allocatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.AbstractAllocatableImpl
		 * @see rba.core.impl.RBACorePackageImpl#getAbstractAllocatable()
		 * @generated
		 */
		EClass ABSTRACT_ALLOCATABLE = eINSTANCE.getAbstractAllocatable();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ALLOCATABLE__CONTENTS = eINSTANCE.getAbstractAllocatable_Contents();

		/**
		 * The meta object literal for the '<em><b>Allocatable Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP = eINSTANCE.getAbstractAllocatable_AllocatableGroup();

		/**
		 * The meta object literal for the '<em><b>Get Contents List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ALLOCATABLE___GET_CONTENTS_LIST = eINSTANCE.getAbstractAllocatable__GetContentsList();

		/**
		 * The meta object literal for the '<em><b>Collect Leaf Allocatable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ALLOCATABLE___COLLECT_LEAF_ALLOCATABLE = eINSTANCE
				.getAbstractAllocatable__CollectLeafAllocatable();

		/**
		 * The meta object literal for the '{@link rba.core.impl.AllocatableImpl <em>Allocatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.AllocatableImpl
		 * @see rba.core.impl.RBACorePackageImpl#getAllocatable()
		 * @generated
		 */
		EClass ALLOCATABLE = eINSTANCE.getAllocatable();

		/**
		 * The meta object literal for the '<em><b>Arbitration Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATABLE__ARBITRATION_POLICY = eINSTANCE.getAllocatable_ArbitrationPolicy();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATABLE__VISIBILITY = eINSTANCE.getAllocatable_Visibility();

		/**
		 * The meta object literal for the '<em><b>Collect Leaf Allocatable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALLOCATABLE___COLLECT_LEAF_ALLOCATABLE = eINSTANCE.getAllocatable__CollectLeafAllocatable();

		/**
		 * The meta object literal for the '{@link rba.core.impl.AllocatableSetImpl <em>Allocatable Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.AllocatableSetImpl
		 * @see rba.core.impl.RBACorePackageImpl#getAllocatableSet()
		 * @generated
		 */
		EClass ALLOCATABLE_SET = eINSTANCE.getAllocatableSet();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATABLE_SET__TARGET = eINSTANCE.getAllocatableSet_Target();

		/**
		 * The meta object literal for the '<em><b>Collect Leaf Allocatable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALLOCATABLE_SET___COLLECT_LEAF_ALLOCATABLE = eINSTANCE.getAllocatableSet__CollectLeafAllocatable();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ProjectImpl
		 * @see rba.core.impl.RBACorePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__VERSION = eINSTANCE.getProject_Version();

		/**
		 * The meta object literal for the '<em><b>Dummy Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DUMMY_NAME = eINSTANCE.getProject_DummyName();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT___GET_NAME = eINSTANCE.getProject__GetName();

		/**
		 * The meta object literal for the '{@link rba.core.impl.PackagableElementImpl <em>Packagable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.PackagableElementImpl
		 * @see rba.core.impl.RBACorePackageImpl#getPackagableElement()
		 * @generated
		 */
		EClass PACKAGABLE_ELEMENT = eINSTANCE.getPackagableElement();

		/**
		 * The meta object literal for the '{@link rba.core.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.PackageImpl
		 * @see rba.core.impl.RBACorePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Packagableelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGABLEELEMENT = eINSTANCE.getPackage_Packagableelement();

		/**
		 * The meta object literal for the '{@link rba.core.impl.StereotypeImpl <em>Stereotype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.StereotypeImpl
		 * @see rba.core.impl.RBACorePackageImpl#getStereotype()
		 * @generated
		 */
		EClass STEREOTYPE = eINSTANCE.getStereotype();

		/**
		 * The meta object literal for the '<em><b>Target Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEREOTYPE__TARGET_MODEL_NAME = eINSTANCE.getStereotype_TargetModelName();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEREOTYPE__VARIABLES = eINSTANCE.getStereotype_Variables();

		/**
		 * The meta object literal for the '<em><b>Body Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEREOTYPE__BODY_TEXT = eINSTANCE.getStereotype_BodyText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.TagImpl
		 * @see rba.core.impl.RBACorePackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__VALUES = eINSTANCE.getTag_Values();

		/**
		 * The meta object literal for the '{@link rba.core.impl.RuleObjectImpl <em>Rule Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.RuleObjectImpl
		 * @see rba.core.impl.RBACorePackageImpl#getRuleObject()
		 * @generated
		 */
		EClass RULE_OBJECT = eINSTANCE.getRuleObject();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_OBJECT__TAGS = eINSTANCE.getRuleObject_Tags();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULE_OBJECT___GET_EXPRESSION_TYPE = eINSTANCE.getRuleObject__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.AbstractContentImpl <em>Abstract Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.AbstractContentImpl
		 * @see rba.core.impl.RBACorePackageImpl#getAbstractContent()
		 * @generated
		 */
		EClass ABSTRACT_CONTENT = eINSTANCE.getAbstractContent();

		/**
		 * The meta object literal for the '<em><b>Content Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTENT__CONTENT_GROUP = eINSTANCE.getAbstractContent_ContentGroup();

		/**
		 * The meta object literal for the '<em><b>Allocatable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTENT__ALLOCATABLE = eINSTANCE.getAbstractContent_Allocatable();

		/**
		 * The meta object literal for the '<em><b>Get Allocatable List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTENT___GET_ALLOCATABLE_LIST = eINSTANCE.getAbstractContent__GetAllocatableList();

		/**
		 * The meta object literal for the '<em><b>Collect Leaf Contents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTENT___COLLECT_LEAF_CONTENTS = eINSTANCE.getAbstractContent__CollectLeafContents();

		/**
		 * The meta object literal for the '{@link rba.core.impl.AbstractSceneImpl <em>Abstract Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.AbstractSceneImpl
		 * @see rba.core.impl.RBACorePackageImpl#getAbstractScene()
		 * @generated
		 */
		EClass ABSTRACT_SCENE = eINSTANCE.getAbstractScene();

		/**
		 * The meta object literal for the '{@link rba.core.impl.SceneImpl <em>Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.SceneImpl
		 * @see rba.core.impl.RBACorePackageImpl#getScene()
		 * @generated
		 */
		EClass SCENE = eINSTANCE.getScene();

		/**
		 * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__GLOBAL = eINSTANCE.getScene_Global();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__PROPERTIES = eINSTANCE.getScene_Properties();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCENE___GET_EXPRESSION_TYPE = eINSTANCE.getScene__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ContentImpl
		 * @see rba.core.impl.RBACorePackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Loser Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__LOSER_TYPE = eINSTANCE.getContent_LoserType();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__STATES = eINSTANCE.getContent_States();

		/**
		 * The meta object literal for the '<em><b>Collect Leaf Contents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT___COLLECT_LEAF_CONTENTS = eINSTANCE.getContent__CollectLeafContents();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ContentSetImpl <em>Content Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ContentSetImpl
		 * @see rba.core.impl.RBACorePackageImpl#getContentSet()
		 * @generated
		 */
		EClass CONTENT_SET = eINSTANCE.getContentSet();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_SET__TARGET = eINSTANCE.getContentSet_Target();

		/**
		 * The meta object literal for the '<em><b>Collect Leaf Contents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT_SET___COLLECT_LEAF_CONTENTS = eINSTANCE.getContentSet__CollectLeafContents();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ContentStateImpl <em>Content State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ContentStateImpl
		 * @see rba.core.impl.RBACorePackageImpl#getContentState()
		 * @generated
		 */
		EClass CONTENT_STATE = eINSTANCE.getContentState();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_STATE__VALUE = eINSTANCE.getContentState_Value();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_STATE__OWNER = eINSTANCE.getContentState_Owner();

		/**
		 * The meta object literal for the '{@link rba.core.impl.AbstractPropertyImpl <em>Abstract Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.AbstractPropertyImpl
		 * @see rba.core.impl.RBACorePackageImpl#getAbstractProperty()
		 * @generated
		 */
		EClass ABSTRACT_PROPERTY = eINSTANCE.getAbstractProperty();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PROPERTY__OWNER = eINSTANCE.getAbstractProperty_Owner();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROPERTY___GET_EXPRESSION_TYPE = eINSTANCE.getAbstractProperty__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IntegerPropertyImpl <em>Integer Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IntegerPropertyImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIntegerProperty()
		 * @generated
		 */
		EClass INTEGER_PROPERTY = eINSTANCE.getIntegerProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_PROPERTY__VALUE = eINSTANCE.getIntegerProperty_Value();

		/**
		 * The meta object literal for the '{@link rba.core.impl.AbstractConstraintImpl <em>Abstract Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.AbstractConstraintImpl
		 * @see rba.core.impl.RBACorePackageImpl#getAbstractConstraint()
		 * @generated
		 */
		EClass ABSTRACT_CONSTRAINT = eINSTANCE.getAbstractConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTRAINT__EXPRESSION = eINSTANCE.getAbstractConstraint_Expression();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ConstraintImpl
		 * @see rba.core.impl.RBACorePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__RUNTIME = eINSTANCE.getConstraint_Runtime();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ExpressionImpl
		 * @see rba.core.impl.RBACorePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__TYPE = eINSTANCE.getExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__EXPRESSION = eINSTANCE.getExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Let Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__LET_STATEMENTS = eINSTANCE.getExpression_LetStatements();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION___GET_UNDERLYING_TYPE = eINSTANCE.getExpression__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPRESSION___GET_EXPRESSION_TEXT = eINSTANCE.getExpression__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.LetStatementImpl <em>Let Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.LetStatementImpl
		 * @see rba.core.impl.RBACorePackageImpl#getLetStatement()
		 * @generated
		 */
		EClass LET_STATEMENT = eINSTANCE.getLetStatement();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_STATEMENT__VARIABLE = eINSTANCE.getLetStatement_Variable();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_STATEMENT__BODY = eINSTANCE.getLetStatement_Body();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LET_STATEMENT___TO_STRING = eINSTANCE.getLetStatement__ToString();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ComplexExpressionImpl
		 * @see rba.core.impl.RBACorePackageImpl#getComplexExpression()
		 * @generated
		 */
		EClass COMPLEX_EXPRESSION = eINSTANCE.getComplexExpression();

		/**
		 * The meta object literal for the '<em><b>Other Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_EXPRESSION__OTHER_EXPRESSION = eINSTANCE.getComplexExpression_OtherExpression();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_EXPRESSION___GET_EXPRESSION_TEXT = eINSTANCE.getComplexExpression__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_EXPRESSION___GET_UNDERLYING_TYPE = eINSTANCE.getComplexExpression__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_EXPRESSION___GET_TYPE = eINSTANCE.getComplexExpression__GetType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.OperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__OPERAND = eINSTANCE.getOperator_Operand();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR___GET_SYMBOL = eINSTANCE.getOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IsTypeOfImpl <em>Is Type Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IsTypeOfImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIsTypeOf()
		 * @generated
		 */
		EClass IS_TYPE_OF = eINSTANCE.getIsTypeOf();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_TYPE_OF__TAG_NAME = eINSTANCE.getIsTypeOf_TagName();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_TYPE_OF___GET_EXPRESSION_TEXT = eINSTANCE.getIsTypeOf__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_TYPE_OF___GET_SYMBOL = eINSTANCE.getIsTypeOf__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_TYPE_OF___GET_UNDERLYING_TYPE = eINSTANCE.getIsTypeOf__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ObjectReferenceImpl <em>Object Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ObjectReferenceImpl
		 * @see rba.core.impl.RBACorePackageImpl#getObjectReference()
		 * @generated
		 */
		EClass OBJECT_REFERENCE = eINSTANCE.getObjectReference();

		/**
		 * The meta object literal for the '<em><b>Ref Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_REFERENCE__REF_OBJECT = eINSTANCE.getObjectReference_RefObject();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_REFERENCE___GET_UNDERLYING_TYPE = eINSTANCE.getObjectReference__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_REFERENCE___GET_EXPRESSION_TEXT = eINSTANCE.getObjectReference__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.PreviousModifierImpl <em>Previous Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.PreviousModifierImpl
		 * @see rba.core.impl.RBACorePackageImpl#getPreviousModifier()
		 * @generated
		 */
		EClass PREVIOUS_MODIFIER = eINSTANCE.getPreviousModifier();

		/**
		 * The meta object literal for the '<em><b>Obj Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREVIOUS_MODIFIER__OBJ_REFERENCE = eINSTANCE.getPreviousModifier_ObjReference();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREVIOUS_MODIFIER___GET_SYMBOL = eINSTANCE.getPreviousModifier__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREVIOUS_MODIFIER___GET_UNDERLYING_TYPE = eINSTANCE.getPreviousModifier__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREVIOUS_MODIFIER___GET_EXPRESSION_TEXT = eINSTANCE.getPreviousModifier__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.GreaterThanOperatorImpl <em>Greater Than Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.GreaterThanOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getGreaterThanOperator()
		 * @generated
		 */
		EClass GREATER_THAN_OPERATOR = eINSTANCE.getGreaterThanOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GREATER_THAN_OPERATOR___GET_SYMBOL = eINSTANCE.getGreaterThanOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.MuchGreaterThanOperatorImpl <em>Much Greater Than Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.MuchGreaterThanOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getMuchGreaterThanOperator()
		 * @generated
		 */
		EClass MUCH_GREATER_THAN_OPERATOR = eINSTANCE.getMuchGreaterThanOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MUCH_GREATER_THAN_OPERATOR___GET_SYMBOL = eINSTANCE.getMuchGreaterThanOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.LowerThanOperatorImpl <em>Lower Than Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.LowerThanOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getLowerThanOperator()
		 * @generated
		 */
		EClass LOWER_THAN_OPERATOR = eINSTANCE.getLowerThanOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOWER_THAN_OPERATOR___GET_SYMBOL = eINSTANCE.getLowerThanOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ComparisonOperatorImpl <em>Comparison Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ComparisonOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getComparisonOperator()
		 * @generated
		 */
		EClass COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARISON_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE.getComparisonOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARISON_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getComparisonOperator__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.EqualToOperatorImpl <em>Equal To Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.EqualToOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getEqualToOperator()
		 * @generated
		 */
		EClass EQUAL_TO_OPERATOR = eINSTANCE.getEqualToOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQUAL_TO_OPERATOR___GET_SYMBOL = eINSTANCE.getEqualToOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ComparisonAndImpl <em>Comparison And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ComparisonAndImpl
		 * @see rba.core.impl.RBACorePackageImpl#getComparisonAnd()
		 * @generated
		 */
		EClass COMPARISON_AND = eINSTANCE.getComparisonAnd();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARISON_AND___GET_SYMBOL = eINSTANCE.getComparisonAnd__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARISON_AND___GET_EXPRESSION_TEXT = eINSTANCE.getComparisonAnd__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.LogicalOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getLogicalOperator()
		 * @generated
		 */
		EClass LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGICAL_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE.getLogicalOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGICAL_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getLogicalOperator__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.AndOperatorImpl <em>And Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.AndOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getAndOperator()
		 * @generated
		 */
		EClass AND_OPERATOR = eINSTANCE.getAndOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AND_OPERATOR___GET_SYMBOL = eINSTANCE.getAndOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.OrOperatorImpl <em>Or Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.OrOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getOrOperator()
		 * @generated
		 */
		EClass OR_OPERATOR = eINSTANCE.getOrOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OR_OPERATOR___GET_SYMBOL = eINSTANCE.getOrOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.NotOperatorImpl <em>Not Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.NotOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getNotOperator()
		 * @generated
		 */
		EClass NOT_OPERATOR = eINSTANCE.getNotOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOT_OPERATOR___GET_SYMBOL = eINSTANCE.getNotOperator__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOT_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getNotOperator__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IsEqualToOperatorImpl <em>Is Equal To Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IsEqualToOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIsEqualToOperator()
		 * @generated
		 */
		EClass IS_EQUAL_TO_OPERATOR = eINSTANCE.getIsEqualToOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_EQUAL_TO_OPERATOR___GET_SYMBOL = eINSTANCE.getIsEqualToOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IsGreaterThanOperatorImpl <em>Is Greater Than Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IsGreaterThanOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIsGreaterThanOperator()
		 * @generated
		 */
		EClass IS_GREATER_THAN_OPERATOR = eINSTANCE.getIsGreaterThanOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_GREATER_THAN_OPERATOR___GET_SYMBOL = eINSTANCE.getIsGreaterThanOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IsLowerThanOperatorImpl <em>Is Lower Than Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IsLowerThanOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIsLowerThanOperator()
		 * @generated
		 */
		EClass IS_LOWER_THAN_OPERATOR = eINSTANCE.getIsLowerThanOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_LOWER_THAN_OPERATOR___GET_SYMBOL = eINSTANCE.getIsLowerThanOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IsGreaterThanEqualOperatorImpl <em>Is Greater Than Equal Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IsGreaterThanEqualOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIsGreaterThanEqualOperator()
		 * @generated
		 */
		EClass IS_GREATER_THAN_EQUAL_OPERATOR = eINSTANCE.getIsGreaterThanEqualOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_GREATER_THAN_EQUAL_OPERATOR___GET_SYMBOL = eINSTANCE.getIsGreaterThanEqualOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IsLowerThanEqualOperatorImpl <em>Is Lower Than Equal Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IsLowerThanEqualOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIsLowerThanEqualOperator()
		 * @generated
		 */
		EClass IS_LOWER_THAN_EQUAL_OPERATOR = eINSTANCE.getIsLowerThanEqualOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_LOWER_THAN_EQUAL_OPERATOR___GET_SYMBOL = eINSTANCE.getIsLowerThanEqualOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ArithmeticOperatorImpl <em>Arithmetic Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ArithmeticOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EClass ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARITHMETIC_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE.getArithmeticOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARITHMETIC_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getArithmeticOperator__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.PlusOperatorImpl <em>Plus Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.PlusOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getPlusOperator()
		 * @generated
		 */
		EClass PLUS_OPERATOR = eINSTANCE.getPlusOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLUS_OPERATOR___GET_SYMBOL = eINSTANCE.getPlusOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ImpliesOperatorImpl <em>Implies Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ImpliesOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getImpliesOperator()
		 * @generated
		 */
		EClass IMPLIES_OPERATOR = eINSTANCE.getImpliesOperator();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPLIES_OPERATOR___GET_SYMBOL = eINSTANCE.getImpliesOperator__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ContentOperatorImpl <em>Content Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ContentOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getContentOperator()
		 * @generated
		 */
		EClass CONTENT_OPERATOR = eINSTANCE.getContentOperator();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getContentOperator__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IsActiveImpl <em>Is Active</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IsActiveImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIsActive()
		 * @generated
		 */
		EClass IS_ACTIVE = eINSTANCE.getIsActive();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_ACTIVE___GET_SYMBOL = eINSTANCE.getIsActive__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_ACTIVE___GET_UNDERLYING_TYPE = eINSTANCE.getIsActive__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.GetAllocatablesImpl <em>Get Allocatables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.GetAllocatablesImpl
		 * @see rba.core.impl.RBACorePackageImpl#getGetAllocatables()
		 * @generated
		 */
		EClass GET_ALLOCATABLES = eINSTANCE.getGetAllocatables();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_ALLOCATABLES___GET_SYMBOL = eINSTANCE.getGetAllocatables__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_ALLOCATABLES___GET_UNDERLYING_TYPE = eINSTANCE.getGetAllocatables__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.HasBeenDisplayedImpl <em>Has Been Displayed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.HasBeenDisplayedImpl
		 * @see rba.core.impl.RBACorePackageImpl#getHasBeenDisplayed()
		 * @generated
		 */
		EClass HAS_BEEN_DISPLAYED = eINSTANCE.getHasBeenDisplayed();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAS_BEEN_DISPLAYED___GET_SYMBOL = eINSTANCE.getHasBeenDisplayed__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAS_BEEN_DISPLAYED___GET_UNDERLYING_TYPE = eINSTANCE.getHasBeenDisplayed__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ActiveStateImpl <em>Active State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ActiveStateImpl
		 * @see rba.core.impl.RBACorePackageImpl#getActiveState()
		 * @generated
		 */
		EClass ACTIVE_STATE = eINSTANCE.getActiveState();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVE_STATE___GET_SYMBOL = eINSTANCE.getActiveState__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVE_STATE___GET_UNDERLYING_TYPE = eINSTANCE.getActiveState__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ObjectCompareImpl <em>Object Compare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ObjectCompareImpl
		 * @see rba.core.impl.RBACorePackageImpl#getObjectCompare()
		 * @generated
		 */
		EClass OBJECT_COMPARE = eINSTANCE.getObjectCompare();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_COMPARE___GET_SYMBOL = eINSTANCE.getObjectCompare__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_COMPARE___GET_UNDERLYING_TYPE = eINSTANCE.getObjectCompare__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_COMPARE___GET_EXPRESSION_TEXT = eINSTANCE.getObjectCompare__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ThatOfOperatorImpl <em>That Of Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ThatOfOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getThatOfOperator()
		 * @generated
		 */
		EClass THAT_OF_OPERATOR = eINSTANCE.getThatOfOperator();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THAT_OF_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getThatOfOperator__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THAT_OF_OPERATOR___GET_SYMBOL = eINSTANCE.getThatOfOperator__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THAT_OF_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE.getThatOfOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ValueExpressionImpl
		 * @see rba.core.impl.RBACorePackageImpl#getValueExpression()
		 * @generated
		 */
		EClass VALUE_EXPRESSION = eINSTANCE.getValueExpression();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_EXPRESSION___GET_UNDERLYING_TYPE = eINSTANCE.getValueExpression__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_EXPRESSION___GET_EXPRESSION_VALUE = eINSTANCE.getValueExpression__GetExpressionValue();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_EXPRESSION___GET_TYPE = eINSTANCE.getValueExpression__GetType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.MaxValueImpl <em>Max Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.MaxValueImpl
		 * @see rba.core.impl.RBACorePackageImpl#getMaxValue()
		 * @generated
		 */
		EClass MAX_VALUE = eINSTANCE.getMaxValue();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAX_VALUE___GET_EXPRESSION_TEXT = eINSTANCE.getMaxValue__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Expression Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAX_VALUE___GET_EXPRESSION_VALUE = eINSTANCE.getMaxValue__GetExpressionValue();

		/**
		 * The meta object literal for the '{@link rba.core.impl.MinValueImpl <em>Min Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.MinValueImpl
		 * @see rba.core.impl.RBACorePackageImpl#getMinValue()
		 * @generated
		 */
		EClass MIN_VALUE = eINSTANCE.getMinValue();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIN_VALUE___GET_EXPRESSION_TEXT = eINSTANCE.getMinValue__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Expression Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIN_VALUE___GET_EXPRESSION_VALUE = eINSTANCE.getMinValue__GetExpressionValue();

		/**
		 * The meta object literal for the '{@link rba.core.impl.NoneValueImpl <em>None Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.NoneValueImpl
		 * @see rba.core.impl.RBACorePackageImpl#getNoneValue()
		 * @generated
		 */
		EClass NONE_VALUE = eINSTANCE.getNoneValue();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NONE_VALUE___GET_EXPRESSION_TEXT = eINSTANCE.getNoneValue__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Expression Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NONE_VALUE___GET_EXPRESSION_VALUE = eINSTANCE.getNoneValue__GetExpressionValue();

		/**
		 * The meta object literal for the '{@link rba.core.impl.StandardValueImpl <em>Standard Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.StandardValueImpl
		 * @see rba.core.impl.RBACorePackageImpl#getStandardValue()
		 * @generated
		 */
		EClass STANDARD_VALUE = eINSTANCE.getStandardValue();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STANDARD_VALUE___GET_EXPRESSION_TEXT = eINSTANCE.getStandardValue__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Expression Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STANDARD_VALUE___GET_EXPRESSION_VALUE = eINSTANCE.getStandardValue__GetExpressionValue();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IntegerValueImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTEGER_VALUE___GET_EXPRESSION_TEXT = eINSTANCE.getIntegerValue__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Expression Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTEGER_VALUE___GET_EXPRESSION_VALUE = eINSTANCE.getIntegerValue__GetExpressionValue();

		/**
		 * The meta object literal for the '{@link rba.core.impl.EnumExpressionImpl <em>Enum Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.EnumExpressionImpl
		 * @see rba.core.impl.RBACorePackageImpl#getEnumExpression()
		 * @generated
		 */
		EClass ENUM_EXPRESSION = eINSTANCE.getEnumExpression();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUM_EXPRESSION___GET_UNDERLYING_TYPE = eINSTANCE.getEnumExpression__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUM_EXPRESSION___GET_EXPRESSION_VALUE = eINSTANCE.getEnumExpression__GetExpressionValue();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUM_EXPRESSION___GET_TYPE = eINSTANCE.getEnumExpression__GetType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.LoserTypeExpressionImpl <em>Loser Type Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.LoserTypeExpressionImpl
		 * @see rba.core.impl.RBACorePackageImpl#getLoserTypeExpression()
		 * @generated
		 */
		EClass LOSER_TYPE_EXPRESSION = eINSTANCE.getLoserTypeExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOSER_TYPE_EXPRESSION__VALUE = eINSTANCE.getLoserTypeExpression_Value();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOSER_TYPE_EXPRESSION___GET_EXPRESSION_TEXT = eINSTANCE.getLoserTypeExpression__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Expression Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOSER_TYPE_EXPRESSION___GET_EXPRESSION_VALUE = eINSTANCE
				.getLoserTypeExpression__GetExpressionValue();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ArbitrationPolicyExpressionImpl <em>Arbitration Policy Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ArbitrationPolicyExpressionImpl
		 * @see rba.core.impl.RBACorePackageImpl#getArbitrationPolicyExpression()
		 * @generated
		 */
		EClass ARBITRATION_POLICY_EXPRESSION = eINSTANCE.getArbitrationPolicyExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARBITRATION_POLICY_EXPRESSION__VALUE = eINSTANCE.getArbitrationPolicyExpression_Value();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARBITRATION_POLICY_EXPRESSION___GET_EXPRESSION_TEXT = eINSTANCE
				.getArbitrationPolicyExpression__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Expression Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARBITRATION_POLICY_EXPRESSION___GET_EXPRESSION_VALUE = eINSTANCE
				.getArbitrationPolicyExpression__GetExpressionValue();

		/**
		 * The meta object literal for the '{@link rba.core.impl.SetExpressionImpl <em>Set Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.SetExpressionImpl
		 * @see rba.core.impl.RBACorePackageImpl#getSetExpression()
		 * @generated
		 */
		EClass SET_EXPRESSION = eINSTANCE.getSetExpression();

		/**
		 * The meta object literal for the '{@link rba.core.impl.SetOperatorImpl <em>Set Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.SetOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getSetOperator()
		 * @generated
		 */
		EClass SET_OPERATOR = eINSTANCE.getSetOperator();

		/**
		 * The meta object literal for the '{@link rba.core.impl.SizeOperatorImpl <em>Size Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.SizeOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getSizeOperator()
		 * @generated
		 */
		EClass SIZE_OPERATOR = eINSTANCE.getSizeOperator();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIZE_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getSizeOperator__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIZE_OPERATOR___GET_SYMBOL = eINSTANCE.getSizeOperator__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIZE_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE.getSizeOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ExistsOperatorImpl <em>Exists Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ExistsOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getExistsOperator()
		 * @generated
		 */
		EClass EXISTS_OPERATOR = eINSTANCE.getExistsOperator();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXISTS_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getExistsOperator__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXISTS_OPERATOR___GET_SYMBOL = eINSTANCE.getExistsOperator__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXISTS_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE.getExistsOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ForAllOperatorImpl <em>For All Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ForAllOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getForAllOperator()
		 * @generated
		 */
		EClass FOR_ALL_OPERATOR = eINSTANCE.getForAllOperator();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOR_ALL_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getForAllOperator__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOR_ALL_OPERATOR___GET_SYMBOL = eINSTANCE.getForAllOperator__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOR_ALL_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE.getForAllOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.MaxOperatorImpl <em>Max Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.MaxOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getMaxOperator()
		 * @generated
		 */
		EClass MAX_OPERATOR = eINSTANCE.getMaxOperator();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAX_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getMaxOperator__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAX_OPERATOR___GET_SYMBOL = eINSTANCE.getMaxOperator__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAX_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE.getMaxOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.MinOperatorImpl <em>Min Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.MinOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getMinOperator()
		 * @generated
		 */
		EClass MIN_OPERATOR = eINSTANCE.getMinOperator();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIN_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getMinOperator__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIN_OPERATOR___GET_SYMBOL = eINSTANCE.getMinOperator__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIN_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE.getMinOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.SelectOperatorImpl <em>Select Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.SelectOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getSelectOperator()
		 * @generated
		 */
		EClass SELECT_OPERATOR = eINSTANCE.getSelectOperator();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getSelectOperator__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_OPERATOR___GET_SYMBOL = eINSTANCE.getSelectOperator__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECT_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE.getSelectOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.SetOfOperatorImpl <em>Set Of Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.SetOfOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getSetOfOperator()
		 * @generated
		 */
		EClass SET_OF_OPERATOR = eINSTANCE.getSetOfOperator();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SET_OF_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getSetOfOperator__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SET_OF_OPERATOR___GET_SYMBOL = eINSTANCE.getSetOfOperator__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SET_OF_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE.getSetOfOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.LambdaExpressionImpl <em>Lambda Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.LambdaExpressionImpl
		 * @see rba.core.impl.RBACorePackageImpl#getLambdaExpression()
		 * @generated
		 */
		EClass LAMBDA_EXPRESSION = eINSTANCE.getLambdaExpression();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA_EXPRESSION__CONTEXT = eINSTANCE.getLambdaExpression_Context();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA_EXPRESSION__X = eINSTANCE.getLambdaExpression_X();

		/**
		 * The meta object literal for the '<em><b>Body Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA_EXPRESSION__BODY_TEXT = eINSTANCE.getLambdaExpression_BodyText();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAMBDA_EXPRESSION___GET_EXPRESSION_TEXT = eINSTANCE.getLambdaExpression__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAMBDA_EXPRESSION___GET_UNDERLYING_TYPE = eINSTANCE.getLambdaExpression__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.VariableImpl
		 * @see rba.core.impl.RBACorePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE___GET_EXPRESSION_TYPE = eINSTANCE.getVariable__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.LambdaContextImpl <em>Lambda Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.LambdaContextImpl
		 * @see rba.core.impl.RBACorePackageImpl#getLambdaContext()
		 * @generated
		 */
		EClass LAMBDA_CONTEXT = eINSTANCE.getLambdaContext();

		/**
		 * The meta object literal for the '<em><b>Lambda</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA_CONTEXT__LAMBDA = eINSTANCE.getLambdaContext_Lambda();

		/**
		 * The meta object literal for the '<em><b>Get Context Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAMBDA_CONTEXT___GET_CONTEXT_TYPE = eINSTANCE.getLambdaContext__GetContextType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IfStatementImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__THEN_EXPRESSION = eINSTANCE.getIfStatement_ThenExpression();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_EXPRESSION = eINSTANCE.getIfStatement_ElseExpression();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IF_STATEMENT___GET_UNDERLYING_TYPE = eINSTANCE.getIfStatement__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IF_STATEMENT___GET_EXPRESSION_TEXT = eINSTANCE.getIfStatement__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.SceneOperatorImpl <em>Scene Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.SceneOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getSceneOperator()
		 * @generated
		 */
		EClass SCENE_OPERATOR = eINSTANCE.getSceneOperator();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCENE_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getSceneOperator__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IsOnImpl <em>Is On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IsOnImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIsOn()
		 * @generated
		 */
		EClass IS_ON = eINSTANCE.getIsOn();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_ON___GET_SYMBOL = eINSTANCE.getIsOn__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_ON___GET_UNDERLYING_TYPE = eINSTANCE.getIsOn__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.AllocatableOperatorImpl <em>Allocatable Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.AllocatableOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getAllocatableOperator()
		 * @generated
		 */
		EClass ALLOCATABLE_OPERATOR = eINSTANCE.getAllocatableOperator();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALLOCATABLE_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getAllocatableOperator__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.AllocatedContentImpl <em>Allocated Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.AllocatedContentImpl
		 * @see rba.core.impl.RBACorePackageImpl#getAllocatedContent()
		 * @generated
		 */
		EClass ALLOCATED_CONTENT = eINSTANCE.getAllocatedContent();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALLOCATED_CONTENT___GET_SYMBOL = eINSTANCE.getAllocatedContent__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALLOCATED_CONTENT___GET_UNDERLYING_TYPE = eINSTANCE.getAllocatedContent__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ContentValueImpl <em>Content Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ContentValueImpl
		 * @see rba.core.impl.RBACorePackageImpl#getContentValue()
		 * @generated
		 */
		EClass CONTENT_VALUE = eINSTANCE.getContentValue();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT_VALUE___GET_SYMBOL = eINSTANCE.getContentValue__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT_VALUE___GET_UNDERLYING_TYPE = eINSTANCE.getContentValue__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.GetContentsListImpl <em>Get Contents List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.GetContentsListImpl
		 * @see rba.core.impl.RBACorePackageImpl#getGetContentsList()
		 * @generated
		 */
		EClass GET_CONTENTS_LIST = eINSTANCE.getGetContentsList();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_CONTENTS_LIST___GET_SYMBOL = eINSTANCE.getGetContentsList__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_CONTENTS_LIST___GET_UNDERLYING_TYPE = eINSTANCE.getGetContentsList__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ActiveContentsImpl <em>Active Contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ActiveContentsImpl
		 * @see rba.core.impl.RBACorePackageImpl#getActiveContents()
		 * @generated
		 */
		EClass ACTIVE_CONTENTS = eINSTANCE.getActiveContents();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVE_CONTENTS___GET_SYMBOL = eINSTANCE.getActiveContents__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVE_CONTENTS___GET_UNDERLYING_TYPE = eINSTANCE.getActiveContents__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.PropertyOperatorImpl <em>Property Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.PropertyOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getPropertyOperator()
		 * @generated
		 */
		EClass PROPERTY_OPERATOR = eINSTANCE.getPropertyOperator();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE.getPropertyOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getPropertyOperator__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.GetPropertyImpl <em>Get Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.GetPropertyImpl
		 * @see rba.core.impl.RBACorePackageImpl#getGetProperty()
		 * @generated
		 */
		EClass GET_PROPERTY = eINSTANCE.getGetProperty();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_PROPERTY___GET_SYMBOL = eINSTANCE.getGetProperty__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_PROPERTY___GET_UNDERLYING_TYPE = eINSTANCE.getGetProperty__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.StateValueImpl <em>State Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.StateValueImpl
		 * @see rba.core.impl.RBACorePackageImpl#getStateValue()
		 * @generated
		 */
		EClass STATE_VALUE = eINSTANCE.getStateValue();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_VALUE___GET_SYMBOL = eINSTANCE.getStateValue__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_VALUE___GET_UNDERLYING_TYPE = eINSTANCE.getStateValue__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.HasComeLaterThanImpl <em>Has Come Later Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.HasComeLaterThanImpl
		 * @see rba.core.impl.RBACorePackageImpl#getHasComeLaterThan()
		 * @generated
		 */
		EClass HAS_COME_LATER_THAN = eINSTANCE.getHasComeLaterThan();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAS_COME_LATER_THAN___GET_SYMBOL = eINSTANCE.getHasComeLaterThan__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAS_COME_LATER_THAN___GET_UNDERLYING_TYPE = eINSTANCE.getHasComeLaterThan__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAS_COME_LATER_THAN___GET_EXPRESSION_TEXT = eINSTANCE.getHasComeLaterThan__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.HasComeEarlierThanImpl <em>Has Come Earlier Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.HasComeEarlierThanImpl
		 * @see rba.core.impl.RBACorePackageImpl#getHasComeEarlierThan()
		 * @generated
		 */
		EClass HAS_COME_EARLIER_THAN = eINSTANCE.getHasComeEarlierThan();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAS_COME_EARLIER_THAN___GET_SYMBOL = eINSTANCE.getHasComeEarlierThan__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAS_COME_EARLIER_THAN___GET_UNDERLYING_TYPE = eINSTANCE.getHasComeEarlierThan__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HAS_COME_EARLIER_THAN___GET_EXPRESSION_TEXT = eINSTANCE.getHasComeEarlierThan__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.SugarExpression <em>Sugar Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.SugarExpression
		 * @see rba.core.impl.RBACorePackageImpl#getSugarExpression()
		 * @generated
		 */
		EClass SUGAR_EXPRESSION = eINSTANCE.getSugarExpression();

		/**
		 * The meta object literal for the '<em><b>Can Expand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUGAR_EXPRESSION___CAN_EXPAND = eINSTANCE.getSugarExpression__CanExpand();

		/**
		 * The meta object literal for the '<em><b>Get Expanded</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUGAR_EXPRESSION___GET_EXPANDED = eINSTANCE.getSugarExpression__GetExpanded();

		/**
		 * The meta object literal for the '{@link rba.core.SugarExpressionBase <em>Sugar Expression Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.SugarExpressionBase
		 * @see rba.core.impl.RBACorePackageImpl#getSugarExpressionBase()
		 * @generated
		 */
		EClass SUGAR_EXPRESSION_BASE = eINSTANCE.getSugarExpressionBase();

		/**
		 * The meta object literal for the '<em><b>Can Expand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUGAR_EXPRESSION_BASE___CAN_EXPAND = eINSTANCE.getSugarExpressionBase__CanExpand();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ObjectCompareNotImpl <em>Object Compare Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ObjectCompareNotImpl
		 * @see rba.core.impl.RBACorePackageImpl#getObjectCompareNot()
		 * @generated
		 */
		EClass OBJECT_COMPARE_NOT = eINSTANCE.getObjectCompareNot();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_COMPARE_NOT___GET_SYMBOL = eINSTANCE.getObjectCompareNot__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_COMPARE_NOT___GET_UNDERLYING_TYPE = eINSTANCE.getObjectCompareNot__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_COMPARE_NOT___GET_EXPRESSION_TEXT = eINSTANCE.getObjectCompareNot__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IsAllocatedToImpl <em>Is Allocated To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IsAllocatedToImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIsAllocatedTo()
		 * @generated
		 */
		EClass IS_ALLOCATED_TO = eINSTANCE.getIsAllocatedTo();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_ALLOCATED_TO___GET_SYMBOL = eINSTANCE.getIsAllocatedTo__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_ALLOCATED_TO___GET_UNDERLYING_TYPE = eINSTANCE.getIsAllocatedTo__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_ALLOCATED_TO___GET_EXPRESSION_TEXT = eINSTANCE.getIsAllocatedTo__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IsChangedImpl <em>Is Changed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IsChangedImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIsChanged()
		 * @generated
		 */
		EClass IS_CHANGED = eINSTANCE.getIsChanged();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_CHANGED___GET_SYMBOL = eINSTANCE.getIsChanged__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_CHANGED___GET_UNDERLYING_TYPE = eINSTANCE.getIsChanged__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.core.impl.IsTranslatedToImpl <em>Is Translated To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.IsTranslatedToImpl
		 * @see rba.core.impl.RBACorePackageImpl#getIsTranslatedTo()
		 * @generated
		 */
		EClass IS_TRANSLATED_TO = eINSTANCE.getIsTranslatedTo();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_TRANSLATED_TO___GET_SYMBOL = eINSTANCE.getIsTranslatedTo__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_TRANSLATED_TO___GET_UNDERLYING_TYPE = eINSTANCE.getIsTranslatedTo__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_TRANSLATED_TO___GET_EXPRESSION_TEXT = eINSTANCE.getIsTranslatedTo__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.GetStateImpl <em>Get State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.GetStateImpl
		 * @see rba.core.impl.RBACorePackageImpl#getGetState()
		 * @generated
		 */
		EClass GET_STATE = eINSTANCE.getGetState();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GET_STATE___GET_SYMBOL = eINSTANCE.getGetState__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.core.impl.ContentStateOperatorImpl <em>Content State Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.ContentStateOperatorImpl
		 * @see rba.core.impl.RBACorePackageImpl#getContentStateOperator()
		 * @generated
		 */
		EClass CONTENT_STATE_OPERATOR = eINSTANCE.getContentStateOperator();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT_STATE_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE
				.getContentStateOperator__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.impl.NullExpressionImpl <em>Null Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.impl.NullExpressionImpl
		 * @see rba.core.impl.RBACorePackageImpl#getNullExpression()
		 * @generated
		 */
		EClass NULL_EXPRESSION = eINSTANCE.getNullExpression();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NULL_EXPRESSION___GET_UNDERLYING_TYPE = eINSTANCE.getNullExpression__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NULL_EXPRESSION___GET_EXPRESSION_TEXT = eINSTANCE.getNullExpression__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.core.ArbitrationPolicy <em>Arbitration Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.ArbitrationPolicy
		 * @see rba.core.impl.RBACorePackageImpl#getArbitrationPolicy()
		 * @generated
		 */
		EEnum ARBITRATION_POLICY = eINSTANCE.getArbitrationPolicy();

		/**
		 * The meta object literal for the '{@link rba.core.ExpressionType <em>Expression Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.ExpressionType
		 * @see rba.core.impl.RBACorePackageImpl#getExpressionType()
		 * @generated
		 */
		EEnum EXPRESSION_TYPE = eINSTANCE.getExpressionType();

		/**
		 * The meta object literal for the '{@link rba.core.LoserType <em>Loser Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.core.LoserType
		 * @see rba.core.impl.RBACorePackageImpl#getLoserType()
		 * @generated
		 */
		EEnum LOSER_TYPE = eINSTANCE.getLoserType();

	}

} //RBACorePackage
