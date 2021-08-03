/**
 */
package rba.sound;

import org.eclipse.emf.ecore.EClass;
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
 * @see rba.sound.RBASoundFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import RbaCore='../../rba.model.core/model/rbacore.ecore#/'"
 * @generated
 */
public interface RBASoundPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sound";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.denso.com/ict/rba/sound";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RbaSound";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RBASoundPackage eINSTANCE = rba.sound.impl.RBASoundPackageImpl.init();

	/**
	 * The meta object id for the '{@link rba.sound.impl.SoundContentImpl <em>Sound Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.SoundContentImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getSoundContent()
	 * @generated
	 */
	int SOUND_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT__DESCRIPTION = RBACorePackage.CONTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT__NAME = RBACorePackage.CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT__TAGS = RBACorePackage.CONTENT__TAGS;

	/**
	 * The feature id for the '<em><b>Content Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT__CONTENT_GROUP = RBACorePackage.CONTENT__CONTENT_GROUP;

	/**
	 * The feature id for the '<em><b>Allocatable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT__ALLOCATABLE = RBACorePackage.CONTENT__ALLOCATABLE;

	/**
	 * The feature id for the '<em><b>Loser Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT__LOSER_TYPE = RBACorePackage.CONTENT__LOSER_TYPE;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT__STATES = RBACorePackage.CONTENT__STATES;

	/**
	 * The number of structural features of the '<em>Sound Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_FEATURE_COUNT = RBACorePackage.CONTENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Allocatable List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT___GET_ALLOCATABLE_LIST = RBACorePackage.CONTENT___GET_ALLOCATABLE_LIST;

	/**
	 * The operation id for the '<em>Collect Leaf Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT___COLLECT_LEAF_CONTENTS = RBACorePackage.CONTENT___COLLECT_LEAF_CONTENTS;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT___GET_EXPRESSION_TYPE = RBACorePackage.CONTENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sound Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_OPERATION_COUNT = RBACorePackage.CONTENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.sound.impl.SoundContentSetImpl <em>Sound Content Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.SoundContentSetImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getSoundContentSet()
	 * @generated
	 */
	int SOUND_CONTENT_SET = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_SET__DESCRIPTION = RBACorePackage.CONTENT_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_SET__NAME = RBACorePackage.CONTENT_SET__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_SET__TAGS = RBACorePackage.CONTENT_SET__TAGS;

	/**
	 * The feature id for the '<em><b>Content Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_SET__CONTENT_GROUP = RBACorePackage.CONTENT_SET__CONTENT_GROUP;

	/**
	 * The feature id for the '<em><b>Allocatable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_SET__ALLOCATABLE = RBACorePackage.CONTENT_SET__ALLOCATABLE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_SET__TARGET = RBACorePackage.CONTENT_SET__TARGET;

	/**
	 * The number of structural features of the '<em>Sound Content Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_SET_FEATURE_COUNT = RBACorePackage.CONTENT_SET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Allocatable List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_SET___GET_ALLOCATABLE_LIST = RBACorePackage.CONTENT_SET___GET_ALLOCATABLE_LIST;

	/**
	 * The operation id for the '<em>Collect Leaf Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_SET___COLLECT_LEAF_CONTENTS = RBACorePackage.CONTENT_SET___COLLECT_LEAF_CONTENTS;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_SET___GET_EXPRESSION_TYPE = RBACorePackage.CONTENT_SET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sound Content Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_SET_OPERATION_COUNT = RBACorePackage.CONTENT_SET_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.sound.impl.SoundContentStateImpl <em>Sound Content State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.SoundContentStateImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getSoundContentState()
	 * @generated
	 */
	int SOUND_CONTENT_STATE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_STATE__DESCRIPTION = RBACorePackage.CONTENT_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_STATE__NAME = RBACorePackage.CONTENT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_STATE__TAGS = RBACorePackage.CONTENT_STATE__TAGS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_STATE__VALUE = RBACorePackage.CONTENT_STATE__VALUE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_STATE__OWNER = RBACorePackage.CONTENT_STATE__OWNER;

	/**
	 * The number of structural features of the '<em>Sound Content State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_STATE_FEATURE_COUNT = RBACorePackage.CONTENT_STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_STATE___GET_EXPRESSION_TYPE = RBACorePackage.CONTENT_STATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sound Content State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_STATE_OPERATION_COUNT = RBACorePackage.CONTENT_STATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.sound.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.ZoneImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__DESCRIPTION = RBACorePackage.ALLOCATABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NAME = RBACorePackage.ALLOCATABLE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__TAGS = RBACorePackage.ALLOCATABLE__TAGS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__CONTENTS = RBACorePackage.ALLOCATABLE__CONTENTS;

	/**
	 * The feature id for the '<em><b>Allocatable Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ALLOCATABLE_GROUP = RBACorePackage.ALLOCATABLE__ALLOCATABLE_GROUP;

	/**
	 * The feature id for the '<em><b>Arbitration Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ARBITRATION_POLICY = RBACorePackage.ALLOCATABLE__ARBITRATION_POLICY;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__VISIBILITY = RBACorePackage.ALLOCATABLE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Attenuate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__ATTENUATE = RBACorePackage.ALLOCATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = RBACorePackage.ALLOCATABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Contents List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___GET_CONTENTS_LIST = RBACorePackage.ALLOCATABLE___GET_CONTENTS_LIST;

	/**
	 * The operation id for the '<em>Collect Leaf Allocatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___COLLECT_LEAF_ALLOCATABLE = RBACorePackage.ALLOCATABLE___COLLECT_LEAF_ALLOCATABLE;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE___GET_EXPRESSION_TYPE = RBACorePackage.ALLOCATABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = RBACorePackage.ALLOCATABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.sound.impl.ZoneSetImpl <em>Zone Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.ZoneSetImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getZoneSet()
	 * @generated
	 */
	int ZONE_SET = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_SET__DESCRIPTION = RBACorePackage.ALLOCATABLE_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_SET__NAME = RBACorePackage.ALLOCATABLE_SET__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_SET__TAGS = RBACorePackage.ALLOCATABLE_SET__TAGS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_SET__CONTENTS = RBACorePackage.ALLOCATABLE_SET__CONTENTS;

	/**
	 * The feature id for the '<em><b>Allocatable Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_SET__ALLOCATABLE_GROUP = RBACorePackage.ALLOCATABLE_SET__ALLOCATABLE_GROUP;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_SET__TARGET = RBACorePackage.ALLOCATABLE_SET__TARGET;

	/**
	 * The number of structural features of the '<em>Zone Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_SET_FEATURE_COUNT = RBACorePackage.ALLOCATABLE_SET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Contents List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_SET___GET_CONTENTS_LIST = RBACorePackage.ALLOCATABLE_SET___GET_CONTENTS_LIST;

	/**
	 * The operation id for the '<em>Collect Leaf Allocatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_SET___COLLECT_LEAF_ALLOCATABLE = RBACorePackage.ALLOCATABLE_SET___COLLECT_LEAF_ALLOCATABLE;

	/**
	 * The operation id for the '<em>Get Expression Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_SET___GET_EXPRESSION_TYPE = RBACorePackage.ALLOCATABLE_SET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zone Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_SET_OPERATION_COUNT = RBACorePackage.ALLOCATABLE_SET_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.sound.impl.SoundContentOperatorImpl <em>Sound Content Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.SoundContentOperatorImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getSoundContentOperator()
	 * @generated
	 */
	int SOUND_CONTENT_OPERATOR = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_OPERATOR__TYPE = RBACorePackage.CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_OPERATOR__EXPRESSION = RBACorePackage.CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_OPERATOR__LET_STATEMENTS = RBACorePackage.CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_OPERATOR__OPERAND = RBACorePackage.CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Sound Content Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_OPERATOR_FEATURE_COUNT = RBACorePackage.CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_OPERATOR___GET_SYMBOL = RBACorePackage.CONTENT_OPERATOR___GET_SYMBOL;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_OPERATOR___GET_EXPRESSION_TEXT = RBACorePackage.CONTENT_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_OPERATOR___GET_UNDERLYING_TYPE = RBACorePackage.CONTENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sound Content Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_CONTENT_OPERATOR_OPERATION_COUNT = RBACorePackage.CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.sound.impl.IsSoundingImpl <em>Is Sounding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.IsSoundingImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getIsSounding()
	 * @generated
	 */
	int IS_SOUNDING = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOUNDING__TYPE = SOUND_CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOUNDING__EXPRESSION = SOUND_CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOUNDING__LET_STATEMENTS = SOUND_CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOUNDING__OPERAND = SOUND_CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Sounding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOUNDING_FEATURE_COUNT = SOUND_CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOUNDING___GET_EXPRESSION_TEXT = SOUND_CONTENT_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOUNDING___GET_UNDERLYING_TYPE = SOUND_CONTENT_OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOUNDING___GET_SYMBOL = SOUND_CONTENT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Sounding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SOUNDING_OPERATION_COUNT = SOUND_CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.sound.impl.ZoneOperatorImpl <em>Zone Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.ZoneOperatorImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getZoneOperator()
	 * @generated
	 */
	int ZONE_OPERATOR = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATOR__TYPE = RBACorePackage.OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATOR__EXPRESSION = RBACorePackage.OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATOR__LET_STATEMENTS = RBACorePackage.OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATOR__OPERAND = RBACorePackage.OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Zone Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATOR_FEATURE_COUNT = RBACorePackage.OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATOR___GET_UNDERLYING_TYPE = RBACorePackage.OPERATOR___GET_UNDERLYING_TYPE;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATOR___GET_SYMBOL = RBACorePackage.OPERATOR___GET_SYMBOL;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATOR___GET_EXPRESSION_TEXT = RBACorePackage.OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zone Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATOR_OPERATION_COUNT = RBACorePackage.OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link rba.sound.impl.IsOutputtedImpl <em>Is Outputted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.IsOutputtedImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getIsOutputted()
	 * @generated
	 */
	int IS_OUTPUTTED = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED__TYPE = ZONE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED__EXPRESSION = ZONE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED__LET_STATEMENTS = ZONE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED__OPERAND = ZONE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Outputted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED_FEATURE_COUNT = ZONE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED___GET_EXPRESSION_TEXT = ZONE_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED___GET_SYMBOL = ZONE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED___GET_UNDERLYING_TYPE = ZONE_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Is Outputted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED_OPERATION_COUNT = ZONE_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.sound.impl.IsMutedImpl <em>Is Muted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.IsMutedImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getIsMuted()
	 * @generated
	 */
	int IS_MUTED = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MUTED__TYPE = ZONE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MUTED__EXPRESSION = ZONE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MUTED__LET_STATEMENTS = ZONE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MUTED__OPERAND = ZONE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Muted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MUTED_FEATURE_COUNT = ZONE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MUTED___GET_EXPRESSION_TEXT = ZONE_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MUTED___GET_SYMBOL = ZONE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MUTED___GET_UNDERLYING_TYPE = ZONE_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Is Muted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MUTED_OPERATION_COUNT = ZONE_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.sound.impl.IsAttenuatedImpl <em>Is Attenuated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.IsAttenuatedImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getIsAttenuated()
	 * @generated
	 */
	int IS_ATTENUATED = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTENUATED__TYPE = ZONE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTENUATED__EXPRESSION = ZONE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTENUATED__LET_STATEMENTS = ZONE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTENUATED__OPERAND = ZONE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Attenuated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTENUATED_FEATURE_COUNT = ZONE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTENUATED___GET_EXPRESSION_TEXT = ZONE_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTENUATED___GET_SYMBOL = ZONE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTENUATED___GET_UNDERLYING_TYPE = ZONE_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Is Attenuated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTENUATED_OPERATION_COUNT = ZONE_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.sound.impl.OutputtingSoundImpl <em>Outputting Sound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.OutputtingSoundImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getOutputtingSound()
	 * @generated
	 */
	int OUTPUTTING_SOUND = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTTING_SOUND__TYPE = ZONE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTTING_SOUND__EXPRESSION = ZONE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTTING_SOUND__LET_STATEMENTS = ZONE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTTING_SOUND__OPERAND = ZONE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Outputting Sound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTTING_SOUND_FEATURE_COUNT = ZONE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTTING_SOUND___GET_EXPRESSION_TEXT = ZONE_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTTING_SOUND___GET_SYMBOL = ZONE_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTTING_SOUND___GET_UNDERLYING_TYPE = ZONE_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Outputting Sound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTTING_SOUND_OPERATION_COUNT = ZONE_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.sound.impl.AllInstanceOfZoneImpl <em>All Instance Of Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.AllInstanceOfZoneImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getAllInstanceOfZone()
	 * @generated
	 */
	int ALL_INSTANCE_OF_ZONE = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_ZONE__TYPE = RBACorePackage.SET_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_ZONE__EXPRESSION = RBACorePackage.SET_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_ZONE__LET_STATEMENTS = RBACorePackage.SET_EXPRESSION__LET_STATEMENTS;

	/**
	 * The number of structural features of the '<em>All Instance Of Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_ZONE_FEATURE_COUNT = RBACorePackage.SET_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_ZONE___GET_EXPRESSION_TEXT = RBACorePackage.SET_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_ZONE___GET_UNDERLYING_TYPE = RBACorePackage.SET_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Instance Of Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_ZONE_OPERATION_COUNT = RBACorePackage.SET_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.sound.impl.AllInstanceOfSoundContentImpl <em>All Instance Of Sound Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.AllInstanceOfSoundContentImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getAllInstanceOfSoundContent()
	 * @generated
	 */
	int ALL_INSTANCE_OF_SOUND_CONTENT = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_SOUND_CONTENT__TYPE = RBACorePackage.SET_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_SOUND_CONTENT__EXPRESSION = RBACorePackage.SET_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_SOUND_CONTENT__LET_STATEMENTS = RBACorePackage.SET_EXPRESSION__LET_STATEMENTS;

	/**
	 * The number of structural features of the '<em>All Instance Of Sound Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_SOUND_CONTENT_FEATURE_COUNT = RBACorePackage.SET_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_SOUND_CONTENT___GET_EXPRESSION_TEXT = RBACorePackage.SET_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_SOUND_CONTENT___GET_UNDERLYING_TYPE = RBACorePackage.SET_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Instance Of Sound Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_INSTANCE_OF_SOUND_CONTENT_OPERATION_COUNT = RBACorePackage.SET_EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link rba.sound.impl.IsOutputtedOnImpl <em>Is Outputted On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.IsOutputtedOnImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getIsOutputtedOn()
	 * @generated
	 */
	int IS_OUTPUTTED_ON = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED_ON__TYPE = SOUND_CONTENT_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED_ON__EXPRESSION = SOUND_CONTENT_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED_ON__LET_STATEMENTS = SOUND_CONTENT_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED_ON__OPERAND = SOUND_CONTENT_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Outputted On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED_ON_FEATURE_COUNT = SOUND_CONTENT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED_ON___GET_EXPANDED = SOUND_CONTENT_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED_ON___CAN_EXPAND = SOUND_CONTENT_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED_ON___GET_SYMBOL = SOUND_CONTENT_OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED_ON___GET_UNDERLYING_TYPE = SOUND_CONTENT_OPERATOR_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED_ON___GET_EXPRESSION_TEXT = SOUND_CONTENT_OPERATOR_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Is Outputted On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_OUTPUTTED_ON_OPERATION_COUNT = SOUND_CONTENT_OPERATOR_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link rba.sound.impl.IsChangedOutputImpl <em>Is Changed Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.IsChangedOutputImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getIsChangedOutput()
	 * @generated
	 */
	int IS_CHANGED_OUTPUT = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_OUTPUT__TYPE = ZONE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_OUTPUT__EXPRESSION = ZONE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_OUTPUT__LET_STATEMENTS = ZONE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_OUTPUT__OPERAND = ZONE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Changed Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_OUTPUT_FEATURE_COUNT = ZONE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_OUTPUT___GET_EXPRESSION_TEXT = ZONE_OPERATOR___GET_EXPRESSION_TEXT;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_OUTPUT___GET_EXPANDED = ZONE_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_OUTPUT___CAN_EXPAND = ZONE_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_OUTPUT___GET_SYMBOL = ZONE_OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_OUTPUT___GET_UNDERLYING_TYPE = ZONE_OPERATOR_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Is Changed Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGED_OUTPUT_OPERATION_COUNT = ZONE_OPERATOR_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link rba.sound.impl.IsTranslatedSoundToImpl <em>Is Translated Sound To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.IsTranslatedSoundToImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getIsTranslatedSoundTo()
	 * @generated
	 */
	int IS_TRANSLATED_SOUND_TO = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_SOUND_TO__TYPE = ZONE_OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_SOUND_TO__EXPRESSION = ZONE_OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_SOUND_TO__LET_STATEMENTS = ZONE_OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_SOUND_TO__OPERAND = ZONE_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Is Translated Sound To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_SOUND_TO_FEATURE_COUNT = ZONE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_SOUND_TO___GET_EXPANDED = ZONE_OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_SOUND_TO___CAN_EXPAND = ZONE_OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_SOUND_TO___GET_SYMBOL = ZONE_OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_SOUND_TO___GET_UNDERLYING_TYPE = ZONE_OPERATOR_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_SOUND_TO___GET_EXPRESSION_TEXT = ZONE_OPERATOR_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Is Translated Sound To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSLATED_SOUND_TO_OPERATION_COUNT = ZONE_OPERATOR_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link rba.sound.impl.MuteLowerPriorityImpl <em>Mute Lower Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rba.sound.impl.MuteLowerPriorityImpl
	 * @see rba.sound.impl.RBASoundPackageImpl#getMuteLowerPriority()
	 * @generated
	 */
	int MUTE_LOWER_PRIORITY = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTE_LOWER_PRIORITY__TYPE = RBACorePackage.OPERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTE_LOWER_PRIORITY__EXPRESSION = RBACorePackage.OPERATOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Let Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTE_LOWER_PRIORITY__LET_STATEMENTS = RBACorePackage.OPERATOR__LET_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTE_LOWER_PRIORITY__OPERAND = RBACorePackage.OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Mute Lower Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTE_LOWER_PRIORITY_FEATURE_COUNT = RBACorePackage.OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Expanded</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTE_LOWER_PRIORITY___GET_EXPANDED = RBACorePackage.OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Expand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTE_LOWER_PRIORITY___CAN_EXPAND = RBACorePackage.OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTE_LOWER_PRIORITY___GET_SYMBOL = RBACorePackage.OPERATOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Underlying Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTE_LOWER_PRIORITY___GET_UNDERLYING_TYPE = RBACorePackage.OPERATOR_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Expression Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTE_LOWER_PRIORITY___GET_EXPRESSION_TEXT = RBACorePackage.OPERATOR_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Mute Lower Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTE_LOWER_PRIORITY_OPERATION_COUNT = RBACorePackage.OPERATOR_OPERATION_COUNT + 6;

	/**
	 * Returns the meta object for class '{@link rba.sound.SoundContent <em>Sound Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound Content</em>'.
	 * @see rba.sound.SoundContent
	 * @generated
	 */
	EClass getSoundContent();

	/**
	 * Returns the meta object for the '{@link rba.sound.SoundContent#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.sound.SoundContent#getExpressionType()
	 * @generated
	 */
	EOperation getSoundContent__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.sound.SoundContentSet <em>Sound Content Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound Content Set</em>'.
	 * @see rba.sound.SoundContentSet
	 * @generated
	 */
	EClass getSoundContentSet();

	/**
	 * Returns the meta object for the '{@link rba.sound.SoundContentSet#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.sound.SoundContentSet#getExpressionType()
	 * @generated
	 */
	EOperation getSoundContentSet__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.sound.SoundContentState <em>Sound Content State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound Content State</em>'.
	 * @see rba.sound.SoundContentState
	 * @generated
	 */
	EClass getSoundContentState();

	/**
	 * Returns the meta object for the '{@link rba.sound.SoundContentState#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.sound.SoundContentState#getExpressionType()
	 * @generated
	 */
	EOperation getSoundContentState__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.sound.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see rba.sound.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the containment reference '{@link rba.sound.Zone#getAttenuate <em>Attenuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attenuate</em>'.
	 * @see rba.sound.Zone#getAttenuate()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Attenuate();

	/**
	 * Returns the meta object for the '{@link rba.sound.Zone#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.sound.Zone#getExpressionType()
	 * @generated
	 */
	EOperation getZone__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.sound.ZoneSet <em>Zone Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Set</em>'.
	 * @see rba.sound.ZoneSet
	 * @generated
	 */
	EClass getZoneSet();

	/**
	 * Returns the meta object for the '{@link rba.sound.ZoneSet#getExpressionType() <em>Get Expression Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Type</em>' operation.
	 * @see rba.sound.ZoneSet#getExpressionType()
	 * @generated
	 */
	EOperation getZoneSet__GetExpressionType();

	/**
	 * Returns the meta object for class '{@link rba.sound.SoundContentOperator <em>Sound Content Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound Content Operator</em>'.
	 * @see rba.sound.SoundContentOperator
	 * @generated
	 */
	EClass getSoundContentOperator();

	/**
	 * Returns the meta object for the '{@link rba.sound.SoundContentOperator#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.sound.SoundContentOperator#getUnderlyingType()
	 * @generated
	 */
	EOperation getSoundContentOperator__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.sound.IsSounding <em>Is Sounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Sounding</em>'.
	 * @see rba.sound.IsSounding
	 * @generated
	 */
	EClass getIsSounding();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsSounding#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.sound.IsSounding#getSymbol()
	 * @generated
	 */
	EOperation getIsSounding__GetSymbol();

	/**
	 * Returns the meta object for class '{@link rba.sound.ZoneOperator <em>Zone Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Operator</em>'.
	 * @see rba.sound.ZoneOperator
	 * @generated
	 */
	EClass getZoneOperator();

	/**
	 * Returns the meta object for the '{@link rba.sound.ZoneOperator#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.sound.ZoneOperator#getExpressionText()
	 * @generated
	 */
	EOperation getZoneOperator__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.sound.IsOutputted <em>Is Outputted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Outputted</em>'.
	 * @see rba.sound.IsOutputted
	 * @generated
	 */
	EClass getIsOutputted();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsOutputted#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.sound.IsOutputted#getSymbol()
	 * @generated
	 */
	EOperation getIsOutputted__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsOutputted#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.sound.IsOutputted#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsOutputted__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.sound.IsMuted <em>Is Muted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Muted</em>'.
	 * @see rba.sound.IsMuted
	 * @generated
	 */
	EClass getIsMuted();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsMuted#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.sound.IsMuted#getSymbol()
	 * @generated
	 */
	EOperation getIsMuted__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsMuted#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.sound.IsMuted#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsMuted__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.sound.IsAttenuated <em>Is Attenuated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Attenuated</em>'.
	 * @see rba.sound.IsAttenuated
	 * @generated
	 */
	EClass getIsAttenuated();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsAttenuated#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.sound.IsAttenuated#getSymbol()
	 * @generated
	 */
	EOperation getIsAttenuated__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsAttenuated#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.sound.IsAttenuated#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsAttenuated__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.sound.OutputtingSound <em>Outputting Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outputting Sound</em>'.
	 * @see rba.sound.OutputtingSound
	 * @generated
	 */
	EClass getOutputtingSound();

	/**
	 * Returns the meta object for the '{@link rba.sound.OutputtingSound#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.sound.OutputtingSound#getSymbol()
	 * @generated
	 */
	EOperation getOutputtingSound__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.sound.OutputtingSound#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.sound.OutputtingSound#getUnderlyingType()
	 * @generated
	 */
	EOperation getOutputtingSound__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.sound.AllInstanceOfZone <em>All Instance Of Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Instance Of Zone</em>'.
	 * @see rba.sound.AllInstanceOfZone
	 * @generated
	 */
	EClass getAllInstanceOfZone();

	/**
	 * Returns the meta object for the '{@link rba.sound.AllInstanceOfZone#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.sound.AllInstanceOfZone#getExpressionText()
	 * @generated
	 */
	EOperation getAllInstanceOfZone__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.sound.AllInstanceOfZone#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.sound.AllInstanceOfZone#getUnderlyingType()
	 * @generated
	 */
	EOperation getAllInstanceOfZone__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.sound.AllInstanceOfSoundContent <em>All Instance Of Sound Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Instance Of Sound Content</em>'.
	 * @see rba.sound.AllInstanceOfSoundContent
	 * @generated
	 */
	EClass getAllInstanceOfSoundContent();

	/**
	 * Returns the meta object for the '{@link rba.sound.AllInstanceOfSoundContent#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.sound.AllInstanceOfSoundContent#getExpressionText()
	 * @generated
	 */
	EOperation getAllInstanceOfSoundContent__GetExpressionText();

	/**
	 * Returns the meta object for the '{@link rba.sound.AllInstanceOfSoundContent#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.sound.AllInstanceOfSoundContent#getUnderlyingType()
	 * @generated
	 */
	EOperation getAllInstanceOfSoundContent__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.sound.IsOutputtedOn <em>Is Outputted On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Outputted On</em>'.
	 * @see rba.sound.IsOutputtedOn
	 * @generated
	 */
	EClass getIsOutputtedOn();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsOutputtedOn#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.sound.IsOutputtedOn#getSymbol()
	 * @generated
	 */
	EOperation getIsOutputtedOn__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsOutputtedOn#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.sound.IsOutputtedOn#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsOutputtedOn__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsOutputtedOn#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.sound.IsOutputtedOn#getExpressionText()
	 * @generated
	 */
	EOperation getIsOutputtedOn__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.sound.IsChangedOutput <em>Is Changed Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Changed Output</em>'.
	 * @see rba.sound.IsChangedOutput
	 * @generated
	 */
	EClass getIsChangedOutput();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsChangedOutput#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.sound.IsChangedOutput#getSymbol()
	 * @generated
	 */
	EOperation getIsChangedOutput__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsChangedOutput#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.sound.IsChangedOutput#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsChangedOutput__GetUnderlyingType();

	/**
	 * Returns the meta object for class '{@link rba.sound.IsTranslatedSoundTo <em>Is Translated Sound To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Translated Sound To</em>'.
	 * @see rba.sound.IsTranslatedSoundTo
	 * @generated
	 */
	EClass getIsTranslatedSoundTo();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsTranslatedSoundTo#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.sound.IsTranslatedSoundTo#getSymbol()
	 * @generated
	 */
	EOperation getIsTranslatedSoundTo__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsTranslatedSoundTo#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.sound.IsTranslatedSoundTo#getUnderlyingType()
	 * @generated
	 */
	EOperation getIsTranslatedSoundTo__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.sound.IsTranslatedSoundTo#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.sound.IsTranslatedSoundTo#getExpressionText()
	 * @generated
	 */
	EOperation getIsTranslatedSoundTo__GetExpressionText();

	/**
	 * Returns the meta object for class '{@link rba.sound.MuteLowerPriority <em>Mute Lower Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mute Lower Priority</em>'.
	 * @see rba.sound.MuteLowerPriority
	 * @generated
	 */
	EClass getMuteLowerPriority();

	/**
	 * Returns the meta object for the '{@link rba.sound.MuteLowerPriority#getSymbol() <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see rba.sound.MuteLowerPriority#getSymbol()
	 * @generated
	 */
	EOperation getMuteLowerPriority__GetSymbol();

	/**
	 * Returns the meta object for the '{@link rba.sound.MuteLowerPriority#getUnderlyingType() <em>Get Underlying Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Underlying Type</em>' operation.
	 * @see rba.sound.MuteLowerPriority#getUnderlyingType()
	 * @generated
	 */
	EOperation getMuteLowerPriority__GetUnderlyingType();

	/**
	 * Returns the meta object for the '{@link rba.sound.MuteLowerPriority#getExpressionText() <em>Get Expression Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expression Text</em>' operation.
	 * @see rba.sound.MuteLowerPriority#getExpressionText()
	 * @generated
	 */
	EOperation getMuteLowerPriority__GetExpressionText();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RBASoundFactory getRBASoundFactory();

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
		 * The meta object literal for the '{@link rba.sound.impl.SoundContentImpl <em>Sound Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.SoundContentImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getSoundContent()
		 * @generated
		 */
		EClass SOUND_CONTENT = eINSTANCE.getSoundContent();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOUND_CONTENT___GET_EXPRESSION_TYPE = eINSTANCE.getSoundContent__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.SoundContentSetImpl <em>Sound Content Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.SoundContentSetImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getSoundContentSet()
		 * @generated
		 */
		EClass SOUND_CONTENT_SET = eINSTANCE.getSoundContentSet();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOUND_CONTENT_SET___GET_EXPRESSION_TYPE = eINSTANCE.getSoundContentSet__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.SoundContentStateImpl <em>Sound Content State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.SoundContentStateImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getSoundContentState()
		 * @generated
		 */
		EClass SOUND_CONTENT_STATE = eINSTANCE.getSoundContentState();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOUND_CONTENT_STATE___GET_EXPRESSION_TYPE = eINSTANCE.getSoundContentState__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.ZoneImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '<em><b>Attenuate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__ATTENUATE = eINSTANCE.getZone_Attenuate();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ZONE___GET_EXPRESSION_TYPE = eINSTANCE.getZone__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.ZoneSetImpl <em>Zone Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.ZoneSetImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getZoneSet()
		 * @generated
		 */
		EClass ZONE_SET = eINSTANCE.getZoneSet();

		/**
		 * The meta object literal for the '<em><b>Get Expression Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ZONE_SET___GET_EXPRESSION_TYPE = eINSTANCE.getZoneSet__GetExpressionType();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.SoundContentOperatorImpl <em>Sound Content Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.SoundContentOperatorImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getSoundContentOperator()
		 * @generated
		 */
		EClass SOUND_CONTENT_OPERATOR = eINSTANCE.getSoundContentOperator();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOUND_CONTENT_OPERATOR___GET_UNDERLYING_TYPE = eINSTANCE
				.getSoundContentOperator__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.IsSoundingImpl <em>Is Sounding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.IsSoundingImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getIsSounding()
		 * @generated
		 */
		EClass IS_SOUNDING = eINSTANCE.getIsSounding();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_SOUNDING___GET_SYMBOL = eINSTANCE.getIsSounding__GetSymbol();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.ZoneOperatorImpl <em>Zone Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.ZoneOperatorImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getZoneOperator()
		 * @generated
		 */
		EClass ZONE_OPERATOR = eINSTANCE.getZoneOperator();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ZONE_OPERATOR___GET_EXPRESSION_TEXT = eINSTANCE.getZoneOperator__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.IsOutputtedImpl <em>Is Outputted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.IsOutputtedImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getIsOutputted()
		 * @generated
		 */
		EClass IS_OUTPUTTED = eINSTANCE.getIsOutputted();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_OUTPUTTED___GET_SYMBOL = eINSTANCE.getIsOutputted__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_OUTPUTTED___GET_UNDERLYING_TYPE = eINSTANCE.getIsOutputted__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.IsMutedImpl <em>Is Muted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.IsMutedImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getIsMuted()
		 * @generated
		 */
		EClass IS_MUTED = eINSTANCE.getIsMuted();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_MUTED___GET_SYMBOL = eINSTANCE.getIsMuted__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_MUTED___GET_UNDERLYING_TYPE = eINSTANCE.getIsMuted__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.IsAttenuatedImpl <em>Is Attenuated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.IsAttenuatedImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getIsAttenuated()
		 * @generated
		 */
		EClass IS_ATTENUATED = eINSTANCE.getIsAttenuated();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_ATTENUATED___GET_SYMBOL = eINSTANCE.getIsAttenuated__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_ATTENUATED___GET_UNDERLYING_TYPE = eINSTANCE.getIsAttenuated__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.OutputtingSoundImpl <em>Outputting Sound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.OutputtingSoundImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getOutputtingSound()
		 * @generated
		 */
		EClass OUTPUTTING_SOUND = eINSTANCE.getOutputtingSound();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUTTING_SOUND___GET_SYMBOL = eINSTANCE.getOutputtingSound__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUTTING_SOUND___GET_UNDERLYING_TYPE = eINSTANCE.getOutputtingSound__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.AllInstanceOfZoneImpl <em>All Instance Of Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.AllInstanceOfZoneImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getAllInstanceOfZone()
		 * @generated
		 */
		EClass ALL_INSTANCE_OF_ZONE = eINSTANCE.getAllInstanceOfZone();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALL_INSTANCE_OF_ZONE___GET_EXPRESSION_TEXT = eINSTANCE.getAllInstanceOfZone__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALL_INSTANCE_OF_ZONE___GET_UNDERLYING_TYPE = eINSTANCE.getAllInstanceOfZone__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.AllInstanceOfSoundContentImpl <em>All Instance Of Sound Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.AllInstanceOfSoundContentImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getAllInstanceOfSoundContent()
		 * @generated
		 */
		EClass ALL_INSTANCE_OF_SOUND_CONTENT = eINSTANCE.getAllInstanceOfSoundContent();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALL_INSTANCE_OF_SOUND_CONTENT___GET_EXPRESSION_TEXT = eINSTANCE
				.getAllInstanceOfSoundContent__GetExpressionText();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALL_INSTANCE_OF_SOUND_CONTENT___GET_UNDERLYING_TYPE = eINSTANCE
				.getAllInstanceOfSoundContent__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.IsOutputtedOnImpl <em>Is Outputted On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.IsOutputtedOnImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getIsOutputtedOn()
		 * @generated
		 */
		EClass IS_OUTPUTTED_ON = eINSTANCE.getIsOutputtedOn();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_OUTPUTTED_ON___GET_SYMBOL = eINSTANCE.getIsOutputtedOn__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_OUTPUTTED_ON___GET_UNDERLYING_TYPE = eINSTANCE.getIsOutputtedOn__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_OUTPUTTED_ON___GET_EXPRESSION_TEXT = eINSTANCE.getIsOutputtedOn__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.IsChangedOutputImpl <em>Is Changed Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.IsChangedOutputImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getIsChangedOutput()
		 * @generated
		 */
		EClass IS_CHANGED_OUTPUT = eINSTANCE.getIsChangedOutput();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_CHANGED_OUTPUT___GET_SYMBOL = eINSTANCE.getIsChangedOutput__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_CHANGED_OUTPUT___GET_UNDERLYING_TYPE = eINSTANCE.getIsChangedOutput__GetUnderlyingType();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.IsTranslatedSoundToImpl <em>Is Translated Sound To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.IsTranslatedSoundToImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getIsTranslatedSoundTo()
		 * @generated
		 */
		EClass IS_TRANSLATED_SOUND_TO = eINSTANCE.getIsTranslatedSoundTo();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_TRANSLATED_SOUND_TO___GET_SYMBOL = eINSTANCE.getIsTranslatedSoundTo__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_TRANSLATED_SOUND_TO___GET_UNDERLYING_TYPE = eINSTANCE.getIsTranslatedSoundTo__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IS_TRANSLATED_SOUND_TO___GET_EXPRESSION_TEXT = eINSTANCE.getIsTranslatedSoundTo__GetExpressionText();

		/**
		 * The meta object literal for the '{@link rba.sound.impl.MuteLowerPriorityImpl <em>Mute Lower Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rba.sound.impl.MuteLowerPriorityImpl
		 * @see rba.sound.impl.RBASoundPackageImpl#getMuteLowerPriority()
		 * @generated
		 */
		EClass MUTE_LOWER_PRIORITY = eINSTANCE.getMuteLowerPriority();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MUTE_LOWER_PRIORITY___GET_SYMBOL = eINSTANCE.getMuteLowerPriority__GetSymbol();

		/**
		 * The meta object literal for the '<em><b>Get Underlying Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MUTE_LOWER_PRIORITY___GET_UNDERLYING_TYPE = eINSTANCE.getMuteLowerPriority__GetUnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Get Expression Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MUTE_LOWER_PRIORITY___GET_EXPRESSION_TEXT = eINSTANCE.getMuteLowerPriority__GetExpressionText();

	}

} //RBASoundPackage
