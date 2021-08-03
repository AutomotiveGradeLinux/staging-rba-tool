/**
 */
package rba.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import rba.core.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class RBACorePackageImpl extends EPackageImpl implements RBACorePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAllocatableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocatableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocatableSetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packagableElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stereotypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleObjectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractContentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSceneEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentSetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentStateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPropertyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConstraintEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letStatementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexExpressionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTypeOfEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectReferenceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass previousModifierEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterThanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass muchGreaterThanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerThanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalToOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonAndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isEqualToOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isGreaterThanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isLowerThanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isGreaterThanEqualOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isLowerThanEqualOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impliesOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isActiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllocatablesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasBeenDisplayedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeStateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectCompareEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thatOfOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noneValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumExpressionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loserTypeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbitrationPolicyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setExpressionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existsOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forAllOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setOfOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaExpressionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaContextEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isOnEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocatableOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocatedContentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getContentsListEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeContentsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPropertyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasComeLaterThanEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasComeEarlierThanEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sugarExpressionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sugarExpressionBaseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectCompareNotEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isAllocatedToEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isChangedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTranslatedToEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getStateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentStateOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullExpressionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arbitrationPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expressionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loserTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see rba.core.RBACorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RBACorePackageImpl() {
		super(eNS_URI, RBACoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RBACorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RBACorePackage init() {
		if (isInited)
			return (RBACorePackage) EPackage.Registry.INSTANCE.getEPackage(RBACorePackage.eNS_URI);

		// Obtain or create and register package
		RBACorePackageImpl theRBACorePackage = (RBACorePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RBACorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RBACorePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRBACorePackage.createPackageContents();

		// Initialize created meta-data
		theRBACorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRBACorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RBACorePackage.eNS_URI, theRBACorePackage);
		return theRBACorePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Description() {
		return (EAttribute) modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAllocatable() {
		return abstractAllocatableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractAllocatable_Contents() {
		return (EReference) abstractAllocatableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractAllocatable_AllocatableGroup() {
		return (EReference) abstractAllocatableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractAllocatable__GetContentsList() {
		return abstractAllocatableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractAllocatable__CollectLeafAllocatable() {
		return abstractAllocatableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocatable() {
		return allocatableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocatable_ArbitrationPolicy() {
		return (EAttribute) allocatableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocatable_Visibility() {
		return (EReference) allocatableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllocatable__CollectLeafAllocatable() {
		return allocatableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocatableSet() {
		return allocatableSetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocatableSet_Target() {
		return (EReference) allocatableSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllocatableSet__CollectLeafAllocatable() {
		return allocatableSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Version() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_DummyName() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProject__GetName() {
		return projectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackagableElement() {
		return packagableElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Packagableelement() {
		return (EReference) packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStereotype() {
		return stereotypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStereotype_TargetModelName() {
		return (EAttribute) stereotypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStereotype_BodyText() {
		return (EAttribute) stereotypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Values() {
		return (EAttribute) tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStereotype_Variables() {
		return (EReference) stereotypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleObject() {
		return ruleObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleObject_Tags() {
		return (EReference) ruleObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRuleObject__GetExpressionType() {
		return ruleObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractContent() {
		return abstractContentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractContent_ContentGroup() {
		return (EReference) abstractContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractContent_Allocatable() {
		return (EReference) abstractContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractContent__GetAllocatableList() {
		return abstractContentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractContent__CollectLeafContents() {
		return abstractContentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractScene() {
		return abstractSceneEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScene() {
		return sceneEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScene_Global() {
		return (EAttribute) sceneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScene_Properties() {
		return (EReference) sceneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScene__GetExpressionType() {
		return sceneEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_LoserType() {
		return (EAttribute) contentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_States() {
		return (EReference) contentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContent__CollectLeafContents() {
		return contentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentSet() {
		return contentSetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentSet_Target() {
		return (EReference) contentSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContentSet__CollectLeafContents() {
		return contentSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentState() {
		return contentStateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentState_Value() {
		return (EReference) contentStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentState_Owner() {
		return (EReference) contentStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractProperty() {
		return abstractPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractProperty_Owner() {
		return (EReference) abstractPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractProperty__GetExpressionType() {
		return abstractPropertyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerProperty() {
		return integerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerProperty_Value() {
		return (EReference) integerPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConstraint() {
		return abstractConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConstraint_Expression() {
		return (EReference) abstractConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Runtime() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Type() {
		return (EAttribute) expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Expression() {
		return (EAttribute) expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_LetStatements() {
		return (EReference) expressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpression__GetUnderlyingType() {
		return expressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpression__GetExpressionText() {
		return expressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetStatement() {
		return letStatementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetStatement_Variable() {
		return (EReference) letStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLetStatement_Body() {
		return (EReference) letStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLetStatement__ToString() {
		return letStatementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexExpression() {
		return complexExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexExpression_OtherExpression() {
		return (EReference) complexExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexExpression__GetExpressionText() {
		return complexExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexExpression__GetUnderlyingType() {
		return complexExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexExpression__GetType() {
		return complexExpressionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Operand() {
		return (EReference) operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperator__GetSymbol() {
		return operatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsTypeOf() {
		return isTypeOfEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsTypeOf_TagName() {
		return (EAttribute) isTypeOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsTypeOf__GetExpressionText() {
		return isTypeOfEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsTypeOf__GetSymbol() {
		return isTypeOfEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsTypeOf__GetUnderlyingType() {
		return isTypeOfEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectReference() {
		return objectReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectReference_RefObject() {
		return (EReference) objectReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectReference__GetUnderlyingType() {
		return objectReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectReference__GetExpressionText() {
		return objectReferenceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreviousModifier() {
		return previousModifierEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreviousModifier_ObjReference() {
		return (EReference) previousModifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPreviousModifier__GetSymbol() {
		return previousModifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPreviousModifier__GetUnderlyingType() {
		return previousModifierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPreviousModifier__GetExpressionText() {
		return previousModifierEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterThanOperator() {
		return greaterThanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGreaterThanOperator__GetSymbol() {
		return greaterThanOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMuchGreaterThanOperator() {
		return muchGreaterThanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMuchGreaterThanOperator__GetSymbol() {
		return muchGreaterThanOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLowerThanOperator() {
		return lowerThanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLowerThanOperator__GetSymbol() {
		return lowerThanOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonOperator() {
		return comparisonOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComparisonOperator__GetUnderlyingType() {
		return comparisonOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComparisonOperator__GetExpressionText() {
		return comparisonOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualToOperator() {
		return equalToOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEqualToOperator__GetSymbol() {
		return equalToOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonAnd() {
		return comparisonAndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComparisonAnd__GetSymbol() {
		return comparisonAndEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComparisonAnd__GetExpressionText() {
		return comparisonAndEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalOperator() {
		return logicalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogicalOperator__GetUnderlyingType() {
		return logicalOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogicalOperator__GetExpressionText() {
		return logicalOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndOperator() {
		return andOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAndOperator__GetSymbol() {
		return andOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrOperator() {
		return orOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrOperator__GetSymbol() {
		return orOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotOperator() {
		return notOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNotOperator__GetSymbol() {
		return notOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNotOperator__GetExpressionText() {
		return notOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsEqualToOperator() {
		return isEqualToOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsEqualToOperator__GetSymbol() {
		return isEqualToOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsGreaterThanOperator() {
		return isGreaterThanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsGreaterThanOperator__GetSymbol() {
		return isGreaterThanOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsLowerThanOperator() {
		return isLowerThanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsLowerThanOperator__GetSymbol() {
		return isLowerThanOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsGreaterThanEqualOperator() {
		return isGreaterThanEqualOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsGreaterThanEqualOperator__GetSymbol() {
		return isGreaterThanEqualOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsLowerThanEqualOperator() {
		return isLowerThanEqualOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsLowerThanEqualOperator__GetSymbol() {
		return isLowerThanEqualOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticOperator() {
		return arithmeticOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArithmeticOperator__GetUnderlyingType() {
		return arithmeticOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArithmeticOperator__GetExpressionText() {
		return arithmeticOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlusOperator() {
		return plusOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlusOperator__GetSymbol() {
		return plusOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpliesOperator() {
		return impliesOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImpliesOperator__GetSymbol() {
		return impliesOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentOperator() {
		return contentOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContentOperator__GetExpressionText() {
		return contentOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsActive() {
		return isActiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsActive__GetSymbol() {
		return isActiveEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsActive__GetUnderlyingType() {
		return isActiveEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetAllocatables() {
		return getAllocatablesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGetAllocatables__GetSymbol() {
		return getAllocatablesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGetAllocatables__GetUnderlyingType() {
		return getAllocatablesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasBeenDisplayed() {
		return hasBeenDisplayedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHasBeenDisplayed__GetSymbol() {
		return hasBeenDisplayedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHasBeenDisplayed__GetUnderlyingType() {
		return hasBeenDisplayedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiveState() {
		return activeStateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActiveState__GetSymbol() {
		return activeStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActiveState__GetUnderlyingType() {
		return activeStateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectCompare() {
		return objectCompareEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectCompare__GetSymbol() {
		return objectCompareEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectCompare__GetUnderlyingType() {
		return objectCompareEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectCompare__GetExpressionText() {
		return objectCompareEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThatOfOperator() {
		return thatOfOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getThatOfOperator__GetExpressionText() {
		return thatOfOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getThatOfOperator__GetSymbol() {
		return thatOfOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getThatOfOperator__GetUnderlyingType() {
		return thatOfOperatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueExpression() {
		return valueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueExpression__GetUnderlyingType() {
		return valueExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueExpression__GetExpressionValue() {
		return valueExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueExpression__GetType() {
		return valueExpressionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxValue() {
		return maxValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaxValue__GetExpressionText() {
		return maxValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaxValue__GetExpressionValue() {
		return maxValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinValue() {
		return minValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMinValue__GetExpressionText() {
		return minValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMinValue__GetExpressionValue() {
		return minValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoneValue() {
		return noneValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNoneValue__GetExpressionText() {
		return noneValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNoneValue__GetExpressionValue() {
		return noneValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardValue() {
		return standardValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStandardValue__GetExpressionText() {
		return standardValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStandardValue__GetExpressionValue() {
		return standardValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_Value() {
		return (EAttribute) integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntegerValue__GetExpressionText() {
		return integerValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntegerValue__GetExpressionValue() {
		return integerValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumExpression() {
		return enumExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumExpression__GetUnderlyingType() {
		return enumExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumExpression__GetExpressionValue() {
		return enumExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumExpression__GetType() {
		return enumExpressionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoserTypeExpression() {
		return loserTypeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoserTypeExpression_Value() {
		return (EAttribute) loserTypeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoserTypeExpression__GetExpressionText() {
		return loserTypeExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoserTypeExpression__GetExpressionValue() {
		return loserTypeExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArbitrationPolicyExpression() {
		return arbitrationPolicyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArbitrationPolicyExpression_Value() {
		return (EAttribute) arbitrationPolicyExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArbitrationPolicyExpression__GetExpressionText() {
		return arbitrationPolicyExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArbitrationPolicyExpression__GetExpressionValue() {
		return arbitrationPolicyExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetExpression() {
		return setExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetOperator() {
		return setOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSizeOperator() {
		return sizeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSizeOperator__GetExpressionText() {
		return sizeOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSizeOperator__GetSymbol() {
		return sizeOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSizeOperator__GetUnderlyingType() {
		return sizeOperatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistsOperator() {
		return existsOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExistsOperator__GetExpressionText() {
		return existsOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExistsOperator__GetSymbol() {
		return existsOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExistsOperator__GetUnderlyingType() {
		return existsOperatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForAllOperator() {
		return forAllOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getForAllOperator__GetExpressionText() {
		return forAllOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getForAllOperator__GetSymbol() {
		return forAllOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getForAllOperator__GetUnderlyingType() {
		return forAllOperatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxOperator() {
		return maxOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaxOperator__GetExpressionText() {
		return maxOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaxOperator__GetSymbol() {
		return maxOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaxOperator__GetUnderlyingType() {
		return maxOperatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinOperator() {
		return minOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMinOperator__GetExpressionText() {
		return minOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMinOperator__GetSymbol() {
		return minOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMinOperator__GetUnderlyingType() {
		return minOperatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectOperator() {
		return selectOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSelectOperator__GetExpressionText() {
		return selectOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSelectOperator__GetSymbol() {
		return selectOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSelectOperator__GetUnderlyingType() {
		return selectOperatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetOfOperator() {
		return setOfOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSetOfOperator__GetExpressionText() {
		return setOfOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSetOfOperator__GetSymbol() {
		return setOfOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSetOfOperator__GetUnderlyingType() {
		return setOfOperatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLambdaExpression() {
		return lambdaExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaExpression_Context() {
		return (EReference) lambdaExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaExpression_X() {
		return (EReference) lambdaExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaExpression_BodyText() {
		return (EReference) lambdaExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLambdaExpression__GetExpressionText() {
		return lambdaExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLambdaExpression__GetUnderlyingType() {
		return lambdaExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariable__GetExpressionType() {
		return variableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLambdaContext() {
		return lambdaContextEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaContext_Lambda() {
		return (EReference) lambdaContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLambdaContext__GetContextType() {
		return lambdaContextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Condition() {
		return (EReference) ifStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_ThenExpression() {
		return (EReference) ifStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_ElseExpression() {
		return (EReference) ifStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIfStatement__GetUnderlyingType() {
		return ifStatementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIfStatement__GetExpressionText() {
		return ifStatementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSceneOperator() {
		return sceneOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSceneOperator__GetExpressionText() {
		return sceneOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsOn() {
		return isOnEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsOn__GetSymbol() {
		return isOnEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsOn__GetUnderlyingType() {
		return isOnEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocatableOperator() {
		return allocatableOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllocatableOperator__GetExpressionText() {
		return allocatableOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocatedContent() {
		return allocatedContentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllocatedContent__GetSymbol() {
		return allocatedContentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllocatedContent__GetUnderlyingType() {
		return allocatedContentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentValue() {
		return contentValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContentValue__GetSymbol() {
		return contentValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContentValue__GetUnderlyingType() {
		return contentValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetContentsList() {
		return getContentsListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGetContentsList__GetSymbol() {
		return getContentsListEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGetContentsList__GetUnderlyingType() {
		return getContentsListEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiveContents() {
		return activeContentsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActiveContents__GetSymbol() {
		return activeContentsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActiveContents__GetUnderlyingType() {
		return activeContentsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyOperator() {
		return propertyOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyOperator__GetUnderlyingType() {
		return propertyOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPropertyOperator__GetExpressionText() {
		return propertyOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetProperty() {
		return getPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGetProperty__GetSymbol() {
		return getPropertyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGetProperty__GetUnderlyingType() {
		return getPropertyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateValue() {
		return stateValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateValue__GetSymbol() {
		return stateValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateValue__GetUnderlyingType() {
		return stateValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasComeLaterThan() {
		return hasComeLaterThanEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHasComeLaterThan__GetSymbol() {
		return hasComeLaterThanEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHasComeLaterThan__GetUnderlyingType() {
		return hasComeLaterThanEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHasComeLaterThan__GetExpressionText() {
		return hasComeLaterThanEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasComeEarlierThan() {
		return hasComeEarlierThanEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHasComeEarlierThan__GetSymbol() {
		return hasComeEarlierThanEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHasComeEarlierThan__GetUnderlyingType() {
		return hasComeEarlierThanEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHasComeEarlierThan__GetExpressionText() {
		return hasComeEarlierThanEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSugarExpression() {
		return sugarExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSugarExpression__CanExpand() {
		return sugarExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSugarExpression__GetExpanded() {
		return sugarExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSugarExpressionBase() {
		return sugarExpressionBaseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSugarExpressionBase__CanExpand() {
		return sugarExpressionBaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectCompareNot() {
		return objectCompareNotEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectCompareNot__GetSymbol() {
		return objectCompareNotEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectCompareNot__GetUnderlyingType() {
		return objectCompareNotEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectCompareNot__GetExpressionText() {
		return objectCompareNotEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsAllocatedTo() {
		return isAllocatedToEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsAllocatedTo__GetSymbol() {
		return isAllocatedToEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsAllocatedTo__GetUnderlyingType() {
		return isAllocatedToEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsAllocatedTo__GetExpressionText() {
		return isAllocatedToEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsChanged() {
		return isChangedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsChanged__GetSymbol() {
		return isChangedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsChanged__GetUnderlyingType() {
		return isChangedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsTranslatedTo() {
		return isTranslatedToEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsTranslatedTo__GetSymbol() {
		return isTranslatedToEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsTranslatedTo__GetUnderlyingType() {
		return isTranslatedToEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsTranslatedTo__GetExpressionText() {
		return isTranslatedToEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetState() {
		return getStateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGetState__GetSymbol() {
		return getStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentStateOperator() {
		return contentStateOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContentStateOperator__GetExpressionText() {
		return contentStateOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullExpression() {
		return nullExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNullExpression__GetUnderlyingType() {
		return nullExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNullExpression__GetExpressionText() {
		return nullExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArbitrationPolicy() {
		return arbitrationPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExpressionType() {
		return expressionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLoserType() {
		return loserTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBACoreFactory getRBACoreFactory() {
		return (RBACoreFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		abstractAllocatableEClass = createEClass(ABSTRACT_ALLOCATABLE);
		createEReference(abstractAllocatableEClass, ABSTRACT_ALLOCATABLE__CONTENTS);
		createEReference(abstractAllocatableEClass, ABSTRACT_ALLOCATABLE__ALLOCATABLE_GROUP);
		createEOperation(abstractAllocatableEClass, ABSTRACT_ALLOCATABLE___GET_CONTENTS_LIST);
		createEOperation(abstractAllocatableEClass, ABSTRACT_ALLOCATABLE___COLLECT_LEAF_ALLOCATABLE);

		allocatableEClass = createEClass(ALLOCATABLE);
		createEAttribute(allocatableEClass, ALLOCATABLE__ARBITRATION_POLICY);
		createEReference(allocatableEClass, ALLOCATABLE__VISIBILITY);
		createEOperation(allocatableEClass, ALLOCATABLE___COLLECT_LEAF_ALLOCATABLE);

		allocatableSetEClass = createEClass(ALLOCATABLE_SET);
		createEReference(allocatableSetEClass, ALLOCATABLE_SET__TARGET);
		createEOperation(allocatableSetEClass, ALLOCATABLE_SET___COLLECT_LEAF_ALLOCATABLE);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__VERSION);
		createEAttribute(projectEClass, PROJECT__DUMMY_NAME);
		createEOperation(projectEClass, PROJECT___GET_NAME);

		packagableElementEClass = createEClass(PACKAGABLE_ELEMENT);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__PACKAGABLEELEMENT);

		stereotypeEClass = createEClass(STEREOTYPE);
		createEAttribute(stereotypeEClass, STEREOTYPE__TARGET_MODEL_NAME);
		createEReference(stereotypeEClass, STEREOTYPE__VARIABLES);
		createEAttribute(stereotypeEClass, STEREOTYPE__BODY_TEXT);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__VALUES);

		ruleObjectEClass = createEClass(RULE_OBJECT);
		createEReference(ruleObjectEClass, RULE_OBJECT__TAGS);
		createEOperation(ruleObjectEClass, RULE_OBJECT___GET_EXPRESSION_TYPE);

		abstractContentEClass = createEClass(ABSTRACT_CONTENT);
		createEReference(abstractContentEClass, ABSTRACT_CONTENT__CONTENT_GROUP);
		createEReference(abstractContentEClass, ABSTRACT_CONTENT__ALLOCATABLE);
		createEOperation(abstractContentEClass, ABSTRACT_CONTENT___GET_ALLOCATABLE_LIST);
		createEOperation(abstractContentEClass, ABSTRACT_CONTENT___COLLECT_LEAF_CONTENTS);

		abstractSceneEClass = createEClass(ABSTRACT_SCENE);

		sceneEClass = createEClass(SCENE);
		createEAttribute(sceneEClass, SCENE__GLOBAL);
		createEReference(sceneEClass, SCENE__PROPERTIES);
		createEOperation(sceneEClass, SCENE___GET_EXPRESSION_TYPE);

		contentEClass = createEClass(CONTENT);
		createEAttribute(contentEClass, CONTENT__LOSER_TYPE);
		createEReference(contentEClass, CONTENT__STATES);
		createEOperation(contentEClass, CONTENT___COLLECT_LEAF_CONTENTS);

		contentSetEClass = createEClass(CONTENT_SET);
		createEReference(contentSetEClass, CONTENT_SET__TARGET);
		createEOperation(contentSetEClass, CONTENT_SET___COLLECT_LEAF_CONTENTS);

		contentStateEClass = createEClass(CONTENT_STATE);
		createEReference(contentStateEClass, CONTENT_STATE__VALUE);
		createEReference(contentStateEClass, CONTENT_STATE__OWNER);

		abstractPropertyEClass = createEClass(ABSTRACT_PROPERTY);
		createEReference(abstractPropertyEClass, ABSTRACT_PROPERTY__OWNER);
		createEOperation(abstractPropertyEClass, ABSTRACT_PROPERTY___GET_EXPRESSION_TYPE);

		integerPropertyEClass = createEClass(INTEGER_PROPERTY);
		createEReference(integerPropertyEClass, INTEGER_PROPERTY__VALUE);

		abstractConstraintEClass = createEClass(ABSTRACT_CONSTRAINT);
		createEReference(abstractConstraintEClass, ABSTRACT_CONSTRAINT__EXPRESSION);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__RUNTIME);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__TYPE);
		createEAttribute(expressionEClass, EXPRESSION__EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__LET_STATEMENTS);
		createEOperation(expressionEClass, EXPRESSION___GET_UNDERLYING_TYPE);
		createEOperation(expressionEClass, EXPRESSION___GET_EXPRESSION_TEXT);

		letStatementEClass = createEClass(LET_STATEMENT);
		createEReference(letStatementEClass, LET_STATEMENT__VARIABLE);
		createEReference(letStatementEClass, LET_STATEMENT__BODY);
		createEOperation(letStatementEClass, LET_STATEMENT___TO_STRING);

		complexExpressionEClass = createEClass(COMPLEX_EXPRESSION);
		createEReference(complexExpressionEClass, COMPLEX_EXPRESSION__OTHER_EXPRESSION);
		createEOperation(complexExpressionEClass, COMPLEX_EXPRESSION___GET_EXPRESSION_TEXT);
		createEOperation(complexExpressionEClass, COMPLEX_EXPRESSION___GET_UNDERLYING_TYPE);
		createEOperation(complexExpressionEClass, COMPLEX_EXPRESSION___GET_TYPE);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__OPERAND);
		createEOperation(operatorEClass, OPERATOR___GET_SYMBOL);

		isTypeOfEClass = createEClass(IS_TYPE_OF);
		createEAttribute(isTypeOfEClass, IS_TYPE_OF__TAG_NAME);
		createEOperation(isTypeOfEClass, IS_TYPE_OF___GET_EXPRESSION_TEXT);
		createEOperation(isTypeOfEClass, IS_TYPE_OF___GET_SYMBOL);
		createEOperation(isTypeOfEClass, IS_TYPE_OF___GET_UNDERLYING_TYPE);

		objectReferenceEClass = createEClass(OBJECT_REFERENCE);
		createEReference(objectReferenceEClass, OBJECT_REFERENCE__REF_OBJECT);
		createEOperation(objectReferenceEClass, OBJECT_REFERENCE___GET_UNDERLYING_TYPE);
		createEOperation(objectReferenceEClass, OBJECT_REFERENCE___GET_EXPRESSION_TEXT);

		previousModifierEClass = createEClass(PREVIOUS_MODIFIER);
		createEReference(previousModifierEClass, PREVIOUS_MODIFIER__OBJ_REFERENCE);
		createEOperation(previousModifierEClass, PREVIOUS_MODIFIER___GET_SYMBOL);
		createEOperation(previousModifierEClass, PREVIOUS_MODIFIER___GET_UNDERLYING_TYPE);
		createEOperation(previousModifierEClass, PREVIOUS_MODIFIER___GET_EXPRESSION_TEXT);

		greaterThanOperatorEClass = createEClass(GREATER_THAN_OPERATOR);
		createEOperation(greaterThanOperatorEClass, GREATER_THAN_OPERATOR___GET_SYMBOL);

		muchGreaterThanOperatorEClass = createEClass(MUCH_GREATER_THAN_OPERATOR);
		createEOperation(muchGreaterThanOperatorEClass, MUCH_GREATER_THAN_OPERATOR___GET_SYMBOL);

		lowerThanOperatorEClass = createEClass(LOWER_THAN_OPERATOR);
		createEOperation(lowerThanOperatorEClass, LOWER_THAN_OPERATOR___GET_SYMBOL);

		comparisonOperatorEClass = createEClass(COMPARISON_OPERATOR);
		createEOperation(comparisonOperatorEClass, COMPARISON_OPERATOR___GET_UNDERLYING_TYPE);
		createEOperation(comparisonOperatorEClass, COMPARISON_OPERATOR___GET_EXPRESSION_TEXT);

		equalToOperatorEClass = createEClass(EQUAL_TO_OPERATOR);
		createEOperation(equalToOperatorEClass, EQUAL_TO_OPERATOR___GET_SYMBOL);

		comparisonAndEClass = createEClass(COMPARISON_AND);
		createEOperation(comparisonAndEClass, COMPARISON_AND___GET_SYMBOL);
		createEOperation(comparisonAndEClass, COMPARISON_AND___GET_EXPRESSION_TEXT);

		logicalOperatorEClass = createEClass(LOGICAL_OPERATOR);
		createEOperation(logicalOperatorEClass, LOGICAL_OPERATOR___GET_UNDERLYING_TYPE);
		createEOperation(logicalOperatorEClass, LOGICAL_OPERATOR___GET_EXPRESSION_TEXT);

		andOperatorEClass = createEClass(AND_OPERATOR);
		createEOperation(andOperatorEClass, AND_OPERATOR___GET_SYMBOL);

		orOperatorEClass = createEClass(OR_OPERATOR);
		createEOperation(orOperatorEClass, OR_OPERATOR___GET_SYMBOL);

		notOperatorEClass = createEClass(NOT_OPERATOR);
		createEOperation(notOperatorEClass, NOT_OPERATOR___GET_SYMBOL);
		createEOperation(notOperatorEClass, NOT_OPERATOR___GET_EXPRESSION_TEXT);

		isEqualToOperatorEClass = createEClass(IS_EQUAL_TO_OPERATOR);
		createEOperation(isEqualToOperatorEClass, IS_EQUAL_TO_OPERATOR___GET_SYMBOL);

		isGreaterThanOperatorEClass = createEClass(IS_GREATER_THAN_OPERATOR);
		createEOperation(isGreaterThanOperatorEClass, IS_GREATER_THAN_OPERATOR___GET_SYMBOL);

		isLowerThanOperatorEClass = createEClass(IS_LOWER_THAN_OPERATOR);
		createEOperation(isLowerThanOperatorEClass, IS_LOWER_THAN_OPERATOR___GET_SYMBOL);

		isGreaterThanEqualOperatorEClass = createEClass(IS_GREATER_THAN_EQUAL_OPERATOR);
		createEOperation(isGreaterThanEqualOperatorEClass, IS_GREATER_THAN_EQUAL_OPERATOR___GET_SYMBOL);

		isLowerThanEqualOperatorEClass = createEClass(IS_LOWER_THAN_EQUAL_OPERATOR);
		createEOperation(isLowerThanEqualOperatorEClass, IS_LOWER_THAN_EQUAL_OPERATOR___GET_SYMBOL);

		arithmeticOperatorEClass = createEClass(ARITHMETIC_OPERATOR);
		createEOperation(arithmeticOperatorEClass, ARITHMETIC_OPERATOR___GET_UNDERLYING_TYPE);
		createEOperation(arithmeticOperatorEClass, ARITHMETIC_OPERATOR___GET_EXPRESSION_TEXT);

		plusOperatorEClass = createEClass(PLUS_OPERATOR);
		createEOperation(plusOperatorEClass, PLUS_OPERATOR___GET_SYMBOL);

		impliesOperatorEClass = createEClass(IMPLIES_OPERATOR);
		createEOperation(impliesOperatorEClass, IMPLIES_OPERATOR___GET_SYMBOL);

		contentOperatorEClass = createEClass(CONTENT_OPERATOR);
		createEOperation(contentOperatorEClass, CONTENT_OPERATOR___GET_EXPRESSION_TEXT);

		isActiveEClass = createEClass(IS_ACTIVE);
		createEOperation(isActiveEClass, IS_ACTIVE___GET_SYMBOL);
		createEOperation(isActiveEClass, IS_ACTIVE___GET_UNDERLYING_TYPE);

		getAllocatablesEClass = createEClass(GET_ALLOCATABLES);
		createEOperation(getAllocatablesEClass, GET_ALLOCATABLES___GET_SYMBOL);
		createEOperation(getAllocatablesEClass, GET_ALLOCATABLES___GET_UNDERLYING_TYPE);

		hasBeenDisplayedEClass = createEClass(HAS_BEEN_DISPLAYED);
		createEOperation(hasBeenDisplayedEClass, HAS_BEEN_DISPLAYED___GET_SYMBOL);
		createEOperation(hasBeenDisplayedEClass, HAS_BEEN_DISPLAYED___GET_UNDERLYING_TYPE);

		activeStateEClass = createEClass(ACTIVE_STATE);
		createEOperation(activeStateEClass, ACTIVE_STATE___GET_SYMBOL);
		createEOperation(activeStateEClass, ACTIVE_STATE___GET_UNDERLYING_TYPE);

		objectCompareEClass = createEClass(OBJECT_COMPARE);
		createEOperation(objectCompareEClass, OBJECT_COMPARE___GET_SYMBOL);
		createEOperation(objectCompareEClass, OBJECT_COMPARE___GET_UNDERLYING_TYPE);
		createEOperation(objectCompareEClass, OBJECT_COMPARE___GET_EXPRESSION_TEXT);

		thatOfOperatorEClass = createEClass(THAT_OF_OPERATOR);
		createEOperation(thatOfOperatorEClass, THAT_OF_OPERATOR___GET_EXPRESSION_TEXT);
		createEOperation(thatOfOperatorEClass, THAT_OF_OPERATOR___GET_SYMBOL);
		createEOperation(thatOfOperatorEClass, THAT_OF_OPERATOR___GET_UNDERLYING_TYPE);

		valueExpressionEClass = createEClass(VALUE_EXPRESSION);
		createEOperation(valueExpressionEClass, VALUE_EXPRESSION___GET_UNDERLYING_TYPE);
		createEOperation(valueExpressionEClass, VALUE_EXPRESSION___GET_EXPRESSION_VALUE);
		createEOperation(valueExpressionEClass, VALUE_EXPRESSION___GET_TYPE);

		maxValueEClass = createEClass(MAX_VALUE);
		createEOperation(maxValueEClass, MAX_VALUE___GET_EXPRESSION_TEXT);
		createEOperation(maxValueEClass, MAX_VALUE___GET_EXPRESSION_VALUE);

		minValueEClass = createEClass(MIN_VALUE);
		createEOperation(minValueEClass, MIN_VALUE___GET_EXPRESSION_TEXT);
		createEOperation(minValueEClass, MIN_VALUE___GET_EXPRESSION_VALUE);

		noneValueEClass = createEClass(NONE_VALUE);
		createEOperation(noneValueEClass, NONE_VALUE___GET_EXPRESSION_TEXT);
		createEOperation(noneValueEClass, NONE_VALUE___GET_EXPRESSION_VALUE);

		standardValueEClass = createEClass(STANDARD_VALUE);
		createEOperation(standardValueEClass, STANDARD_VALUE___GET_EXPRESSION_TEXT);
		createEOperation(standardValueEClass, STANDARD_VALUE___GET_EXPRESSION_VALUE);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);
		createEOperation(integerValueEClass, INTEGER_VALUE___GET_EXPRESSION_TEXT);
		createEOperation(integerValueEClass, INTEGER_VALUE___GET_EXPRESSION_VALUE);

		enumExpressionEClass = createEClass(ENUM_EXPRESSION);
		createEOperation(enumExpressionEClass, ENUM_EXPRESSION___GET_UNDERLYING_TYPE);
		createEOperation(enumExpressionEClass, ENUM_EXPRESSION___GET_EXPRESSION_VALUE);
		createEOperation(enumExpressionEClass, ENUM_EXPRESSION___GET_TYPE);

		loserTypeExpressionEClass = createEClass(LOSER_TYPE_EXPRESSION);
		createEAttribute(loserTypeExpressionEClass, LOSER_TYPE_EXPRESSION__VALUE);
		createEOperation(loserTypeExpressionEClass, LOSER_TYPE_EXPRESSION___GET_EXPRESSION_TEXT);
		createEOperation(loserTypeExpressionEClass, LOSER_TYPE_EXPRESSION___GET_EXPRESSION_VALUE);

		arbitrationPolicyExpressionEClass = createEClass(ARBITRATION_POLICY_EXPRESSION);
		createEAttribute(arbitrationPolicyExpressionEClass, ARBITRATION_POLICY_EXPRESSION__VALUE);
		createEOperation(arbitrationPolicyExpressionEClass, ARBITRATION_POLICY_EXPRESSION___GET_EXPRESSION_TEXT);
		createEOperation(arbitrationPolicyExpressionEClass, ARBITRATION_POLICY_EXPRESSION___GET_EXPRESSION_VALUE);

		setExpressionEClass = createEClass(SET_EXPRESSION);

		setOperatorEClass = createEClass(SET_OPERATOR);

		sizeOperatorEClass = createEClass(SIZE_OPERATOR);
		createEOperation(sizeOperatorEClass, SIZE_OPERATOR___GET_EXPRESSION_TEXT);
		createEOperation(sizeOperatorEClass, SIZE_OPERATOR___GET_SYMBOL);
		createEOperation(sizeOperatorEClass, SIZE_OPERATOR___GET_UNDERLYING_TYPE);

		existsOperatorEClass = createEClass(EXISTS_OPERATOR);
		createEOperation(existsOperatorEClass, EXISTS_OPERATOR___GET_EXPRESSION_TEXT);
		createEOperation(existsOperatorEClass, EXISTS_OPERATOR___GET_SYMBOL);
		createEOperation(existsOperatorEClass, EXISTS_OPERATOR___GET_UNDERLYING_TYPE);

		forAllOperatorEClass = createEClass(FOR_ALL_OPERATOR);
		createEOperation(forAllOperatorEClass, FOR_ALL_OPERATOR___GET_EXPRESSION_TEXT);
		createEOperation(forAllOperatorEClass, FOR_ALL_OPERATOR___GET_SYMBOL);
		createEOperation(forAllOperatorEClass, FOR_ALL_OPERATOR___GET_UNDERLYING_TYPE);

		maxOperatorEClass = createEClass(MAX_OPERATOR);
		createEOperation(maxOperatorEClass, MAX_OPERATOR___GET_EXPRESSION_TEXT);
		createEOperation(maxOperatorEClass, MAX_OPERATOR___GET_SYMBOL);
		createEOperation(maxOperatorEClass, MAX_OPERATOR___GET_UNDERLYING_TYPE);

		minOperatorEClass = createEClass(MIN_OPERATOR);
		createEOperation(minOperatorEClass, MIN_OPERATOR___GET_EXPRESSION_TEXT);
		createEOperation(minOperatorEClass, MIN_OPERATOR___GET_SYMBOL);
		createEOperation(minOperatorEClass, MIN_OPERATOR___GET_UNDERLYING_TYPE);

		selectOperatorEClass = createEClass(SELECT_OPERATOR);
		createEOperation(selectOperatorEClass, SELECT_OPERATOR___GET_EXPRESSION_TEXT);
		createEOperation(selectOperatorEClass, SELECT_OPERATOR___GET_SYMBOL);
		createEOperation(selectOperatorEClass, SELECT_OPERATOR___GET_UNDERLYING_TYPE);

		setOfOperatorEClass = createEClass(SET_OF_OPERATOR);
		createEOperation(setOfOperatorEClass, SET_OF_OPERATOR___GET_EXPRESSION_TEXT);
		createEOperation(setOfOperatorEClass, SET_OF_OPERATOR___GET_SYMBOL);
		createEOperation(setOfOperatorEClass, SET_OF_OPERATOR___GET_UNDERLYING_TYPE);

		lambdaExpressionEClass = createEClass(LAMBDA_EXPRESSION);
		createEReference(lambdaExpressionEClass, LAMBDA_EXPRESSION__CONTEXT);
		createEReference(lambdaExpressionEClass, LAMBDA_EXPRESSION__X);
		createEReference(lambdaExpressionEClass, LAMBDA_EXPRESSION__BODY_TEXT);
		createEOperation(lambdaExpressionEClass, LAMBDA_EXPRESSION___GET_EXPRESSION_TEXT);
		createEOperation(lambdaExpressionEClass, LAMBDA_EXPRESSION___GET_UNDERLYING_TYPE);

		variableEClass = createEClass(VARIABLE);
		createEOperation(variableEClass, VARIABLE___GET_EXPRESSION_TYPE);

		lambdaContextEClass = createEClass(LAMBDA_CONTEXT);
		createEReference(lambdaContextEClass, LAMBDA_CONTEXT__LAMBDA);
		createEOperation(lambdaContextEClass, LAMBDA_CONTEXT___GET_CONTEXT_TYPE);

		ifStatementEClass = createEClass(IF_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__CONDITION);
		createEReference(ifStatementEClass, IF_STATEMENT__THEN_EXPRESSION);
		createEReference(ifStatementEClass, IF_STATEMENT__ELSE_EXPRESSION);
		createEOperation(ifStatementEClass, IF_STATEMENT___GET_UNDERLYING_TYPE);
		createEOperation(ifStatementEClass, IF_STATEMENT___GET_EXPRESSION_TEXT);

		sceneOperatorEClass = createEClass(SCENE_OPERATOR);
		createEOperation(sceneOperatorEClass, SCENE_OPERATOR___GET_EXPRESSION_TEXT);

		isOnEClass = createEClass(IS_ON);
		createEOperation(isOnEClass, IS_ON___GET_SYMBOL);
		createEOperation(isOnEClass, IS_ON___GET_UNDERLYING_TYPE);

		allocatableOperatorEClass = createEClass(ALLOCATABLE_OPERATOR);
		createEOperation(allocatableOperatorEClass, ALLOCATABLE_OPERATOR___GET_EXPRESSION_TEXT);

		allocatedContentEClass = createEClass(ALLOCATED_CONTENT);
		createEOperation(allocatedContentEClass, ALLOCATED_CONTENT___GET_SYMBOL);
		createEOperation(allocatedContentEClass, ALLOCATED_CONTENT___GET_UNDERLYING_TYPE);

		contentValueEClass = createEClass(CONTENT_VALUE);
		createEOperation(contentValueEClass, CONTENT_VALUE___GET_SYMBOL);
		createEOperation(contentValueEClass, CONTENT_VALUE___GET_UNDERLYING_TYPE);

		getContentsListEClass = createEClass(GET_CONTENTS_LIST);
		createEOperation(getContentsListEClass, GET_CONTENTS_LIST___GET_SYMBOL);
		createEOperation(getContentsListEClass, GET_CONTENTS_LIST___GET_UNDERLYING_TYPE);

		activeContentsEClass = createEClass(ACTIVE_CONTENTS);
		createEOperation(activeContentsEClass, ACTIVE_CONTENTS___GET_SYMBOL);
		createEOperation(activeContentsEClass, ACTIVE_CONTENTS___GET_UNDERLYING_TYPE);

		propertyOperatorEClass = createEClass(PROPERTY_OPERATOR);
		createEOperation(propertyOperatorEClass, PROPERTY_OPERATOR___GET_UNDERLYING_TYPE);
		createEOperation(propertyOperatorEClass, PROPERTY_OPERATOR___GET_EXPRESSION_TEXT);

		getPropertyEClass = createEClass(GET_PROPERTY);
		createEOperation(getPropertyEClass, GET_PROPERTY___GET_SYMBOL);
		createEOperation(getPropertyEClass, GET_PROPERTY___GET_UNDERLYING_TYPE);

		stateValueEClass = createEClass(STATE_VALUE);
		createEOperation(stateValueEClass, STATE_VALUE___GET_SYMBOL);
		createEOperation(stateValueEClass, STATE_VALUE___GET_UNDERLYING_TYPE);

		hasComeLaterThanEClass = createEClass(HAS_COME_LATER_THAN);
		createEOperation(hasComeLaterThanEClass, HAS_COME_LATER_THAN___GET_SYMBOL);
		createEOperation(hasComeLaterThanEClass, HAS_COME_LATER_THAN___GET_UNDERLYING_TYPE);
		createEOperation(hasComeLaterThanEClass, HAS_COME_LATER_THAN___GET_EXPRESSION_TEXT);

		hasComeEarlierThanEClass = createEClass(HAS_COME_EARLIER_THAN);
		createEOperation(hasComeEarlierThanEClass, HAS_COME_EARLIER_THAN___GET_SYMBOL);
		createEOperation(hasComeEarlierThanEClass, HAS_COME_EARLIER_THAN___GET_UNDERLYING_TYPE);
		createEOperation(hasComeEarlierThanEClass, HAS_COME_EARLIER_THAN___GET_EXPRESSION_TEXT);

		sugarExpressionEClass = createEClass(SUGAR_EXPRESSION);
		createEOperation(sugarExpressionEClass, SUGAR_EXPRESSION___CAN_EXPAND);
		createEOperation(sugarExpressionEClass, SUGAR_EXPRESSION___GET_EXPANDED);

		sugarExpressionBaseEClass = createEClass(SUGAR_EXPRESSION_BASE);
		createEOperation(sugarExpressionBaseEClass, SUGAR_EXPRESSION_BASE___CAN_EXPAND);

		objectCompareNotEClass = createEClass(OBJECT_COMPARE_NOT);
		createEOperation(objectCompareNotEClass, OBJECT_COMPARE_NOT___GET_SYMBOL);
		createEOperation(objectCompareNotEClass, OBJECT_COMPARE_NOT___GET_UNDERLYING_TYPE);
		createEOperation(objectCompareNotEClass, OBJECT_COMPARE_NOT___GET_EXPRESSION_TEXT);

		isAllocatedToEClass = createEClass(IS_ALLOCATED_TO);
		createEOperation(isAllocatedToEClass, IS_ALLOCATED_TO___GET_SYMBOL);
		createEOperation(isAllocatedToEClass, IS_ALLOCATED_TO___GET_UNDERLYING_TYPE);
		createEOperation(isAllocatedToEClass, IS_ALLOCATED_TO___GET_EXPRESSION_TEXT);

		isChangedEClass = createEClass(IS_CHANGED);
		createEOperation(isChangedEClass, IS_CHANGED___GET_SYMBOL);
		createEOperation(isChangedEClass, IS_CHANGED___GET_UNDERLYING_TYPE);

		isTranslatedToEClass = createEClass(IS_TRANSLATED_TO);
		createEOperation(isTranslatedToEClass, IS_TRANSLATED_TO___GET_SYMBOL);
		createEOperation(isTranslatedToEClass, IS_TRANSLATED_TO___GET_UNDERLYING_TYPE);
		createEOperation(isTranslatedToEClass, IS_TRANSLATED_TO___GET_EXPRESSION_TEXT);

		getStateEClass = createEClass(GET_STATE);
		createEOperation(getStateEClass, GET_STATE___GET_SYMBOL);

		contentStateOperatorEClass = createEClass(CONTENT_STATE_OPERATOR);
		createEOperation(contentStateOperatorEClass, CONTENT_STATE_OPERATOR___GET_EXPRESSION_TEXT);

		nullExpressionEClass = createEClass(NULL_EXPRESSION);
		createEOperation(nullExpressionEClass, NULL_EXPRESSION___GET_UNDERLYING_TYPE);
		createEOperation(nullExpressionEClass, NULL_EXPRESSION___GET_EXPRESSION_TEXT);

		// Create enums
		arbitrationPolicyEEnum = createEEnum(ARBITRATION_POLICY);
		expressionTypeEEnum = createEEnum(EXPRESSION_TYPE);
		loserTypeEEnum = createEEnum(LOSER_TYPE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedElementEClass.getESuperTypes().add(this.getModelElement());
		abstractAllocatableEClass.getESuperTypes().add(this.getRuleObject());
		allocatableEClass.getESuperTypes().add(this.getAbstractAllocatable());
		allocatableSetEClass.getESuperTypes().add(this.getAbstractAllocatable());
		projectEClass.getESuperTypes().add(this.getPackage());
		packagableElementEClass.getESuperTypes().add(this.getNamedElement());
		packageEClass.getESuperTypes().add(this.getPackagableElement());
		stereotypeEClass.getESuperTypes().add(this.getPackagableElement());
		tagEClass.getESuperTypes().add(this.getNamedElement());
		ruleObjectEClass.getESuperTypes().add(this.getPackagableElement());
		abstractContentEClass.getESuperTypes().add(this.getRuleObject());
		abstractSceneEClass.getESuperTypes().add(this.getRuleObject());
		sceneEClass.getESuperTypes().add(this.getAbstractScene());
		contentEClass.getESuperTypes().add(this.getAbstractContent());
		contentSetEClass.getESuperTypes().add(this.getAbstractContent());
		contentStateEClass.getESuperTypes().add(this.getRuleObject());
		abstractPropertyEClass.getESuperTypes().add(this.getRuleObject());
		integerPropertyEClass.getESuperTypes().add(this.getAbstractProperty());
		abstractConstraintEClass.getESuperTypes().add(this.getPackagableElement());
		constraintEClass.getESuperTypes().add(this.getAbstractConstraint());
		letStatementEClass.getESuperTypes().add(this.getModelElement());
		complexExpressionEClass.getESuperTypes().add(this.getExpression());
		complexExpressionEClass.getESuperTypes().add(this.getSugarExpressionBase());
		operatorEClass.getESuperTypes().add(this.getExpression());
		isTypeOfEClass.getESuperTypes().add(this.getOperator());
		objectReferenceEClass.getESuperTypes().add(this.getExpression());
		previousModifierEClass.getESuperTypes().add(this.getExpression());
		greaterThanOperatorEClass.getESuperTypes().add(this.getComparisonOperator());
		muchGreaterThanOperatorEClass.getESuperTypes().add(this.getComparisonOperator());
		lowerThanOperatorEClass.getESuperTypes().add(this.getComparisonOperator());
		comparisonOperatorEClass.getESuperTypes().add(this.getOperator());
		equalToOperatorEClass.getESuperTypes().add(this.getComparisonOperator());
		comparisonAndEClass.getESuperTypes().add(this.getComparisonOperator());
		logicalOperatorEClass.getESuperTypes().add(this.getOperator());
		andOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		orOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		notOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		isEqualToOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		isGreaterThanOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		isLowerThanOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		isGreaterThanEqualOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		isLowerThanEqualOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		arithmeticOperatorEClass.getESuperTypes().add(this.getOperator());
		plusOperatorEClass.getESuperTypes().add(this.getArithmeticOperator());
		impliesOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		contentOperatorEClass.getESuperTypes().add(this.getOperator());
		isActiveEClass.getESuperTypes().add(this.getContentOperator());
		getAllocatablesEClass.getESuperTypes().add(this.getContentOperator());
		hasBeenDisplayedEClass.getESuperTypes().add(this.getContentOperator());
		activeStateEClass.getESuperTypes().add(this.getContentOperator());
		objectCompareEClass.getESuperTypes().add(this.getOperator());
		thatOfOperatorEClass.getESuperTypes().add(this.getOperator());
		valueExpressionEClass.getESuperTypes().add(this.getExpression());
		maxValueEClass.getESuperTypes().add(this.getValueExpression());
		minValueEClass.getESuperTypes().add(this.getValueExpression());
		noneValueEClass.getESuperTypes().add(this.getValueExpression());
		standardValueEClass.getESuperTypes().add(this.getValueExpression());
		integerValueEClass.getESuperTypes().add(this.getValueExpression());
		enumExpressionEClass.getESuperTypes().add(this.getExpression());
		loserTypeExpressionEClass.getESuperTypes().add(this.getEnumExpression());
		arbitrationPolicyExpressionEClass.getESuperTypes().add(this.getEnumExpression());
		setExpressionEClass.getESuperTypes().add(this.getExpression());
		setOperatorEClass.getESuperTypes().add(this.getOperator());
		sizeOperatorEClass.getESuperTypes().add(this.getSetOperator());
		existsOperatorEClass.getESuperTypes().add(this.getLambdaContext());
		forAllOperatorEClass.getESuperTypes().add(this.getLambdaContext());
		maxOperatorEClass.getESuperTypes().add(this.getLambdaContext());
		minOperatorEClass.getESuperTypes().add(this.getLambdaContext());
		selectOperatorEClass.getESuperTypes().add(this.getLambdaContext());
		setOfOperatorEClass.getESuperTypes().add(this.getOperator());
		lambdaExpressionEClass.getESuperTypes().add(this.getExpression());
		variableEClass.getESuperTypes().add(this.getRuleObject());
		lambdaContextEClass.getESuperTypes().add(this.getSetOperator());
		ifStatementEClass.getESuperTypes().add(this.getExpression());
		sceneOperatorEClass.getESuperTypes().add(this.getOperator());
		isOnEClass.getESuperTypes().add(this.getSceneOperator());
		allocatableOperatorEClass.getESuperTypes().add(this.getOperator());
		allocatedContentEClass.getESuperTypes().add(this.getAllocatableOperator());
		contentValueEClass.getESuperTypes().add(this.getAllocatableOperator());
		getContentsListEClass.getESuperTypes().add(this.getAllocatableOperator());
		activeContentsEClass.getESuperTypes().add(this.getAllocatableOperator());
		propertyOperatorEClass.getESuperTypes().add(this.getOperator());
		getPropertyEClass.getESuperTypes().add(this.getPropertyOperator());
		stateValueEClass.getESuperTypes().add(this.getContentOperator());
		hasComeLaterThanEClass.getESuperTypes().add(this.getContentOperator());
		hasComeEarlierThanEClass.getESuperTypes().add(this.getContentOperator());
		sugarExpressionBaseEClass.getESuperTypes().add(this.getSugarExpression());
		objectCompareNotEClass.getESuperTypes().add(this.getOperator());
		objectCompareNotEClass.getESuperTypes().add(this.getSugarExpressionBase());
		isAllocatedToEClass.getESuperTypes().add(this.getContentOperator());
		isAllocatedToEClass.getESuperTypes().add(this.getSugarExpressionBase());
		isChangedEClass.getESuperTypes().add(this.getAllocatableOperator());
		isChangedEClass.getESuperTypes().add(this.getSugarExpressionBase());
		isTranslatedToEClass.getESuperTypes().add(this.getAllocatableOperator());
		isTranslatedToEClass.getESuperTypes().add(this.getSugarExpressionBase());
		contentStateOperatorEClass.getESuperTypes().add(this.getOperator());
		nullExpressionEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAllocatableEClass, AbstractAllocatable.class, "AbstractAllocatable", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractAllocatable_Contents(), this.getAbstractContent(),
				this.getAbstractContent_Allocatable(), "contents", null, 0, -1, AbstractAllocatable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractAllocatable_AllocatableGroup(), this.getAllocatableSet(),
				this.getAllocatableSet_Target(), "allocatableGroup", null, 0, -1, AbstractAllocatable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractAllocatable__GetContentsList(), this.getContent(), "getContentsList", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAbstractAllocatable__CollectLeafAllocatable(), this.getAllocatable(),
				"collectLeafAllocatable", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(allocatableEClass, Allocatable.class, "Allocatable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllocatable_ArbitrationPolicy(), this.getArbitrationPolicy(), "arbitrationPolicy", null, 0, 1,
				Allocatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAllocatable_Visibility(), this.getExpression(), null, "visibility", null, 0, 1,
				Allocatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAllocatable__CollectLeafAllocatable(), this.getAllocatable(), "collectLeafAllocatable", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		initEClass(allocatableSetEClass, AllocatableSet.class, "AllocatableSet", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocatableSet_Target(), this.getAbstractAllocatable(),
				this.getAbstractAllocatable_AllocatableGroup(), "target", null, 0, -1, AllocatableSet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAllocatableSet__CollectLeafAllocatable(), this.getAllocatable(), "collectLeafAllocatable", 0,
				-1, IS_UNIQUE, !IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Version(), ecorePackage.getEString(), "version", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_DummyName(), ecorePackage.getEString(), "dummyName", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProject__GetName(), ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(packagableElementEClass, PackagableElement.class, "PackagableElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageEClass, rba.core.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Packagableelement(), this.getPackagableElement(), null, "packagableelement", null, 0,
				-1, rba.core.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stereotypeEClass, Stereotype.class, "Stereotype", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStereotype_TargetModelName(), ecorePackage.getEString(), "targetModelName", null, 1, 1,
				Stereotype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStereotype_Variables(), this.getVariable(), null, "variables", null, 0, -1, Stereotype.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStereotype_BodyText(), ecorePackage.getEString(), "bodyText", null, 1, 1, Stereotype.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Values(), ecorePackage.getEString(), "values", null, 0, -1, Tag.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleObjectEClass, RuleObject.class, "RuleObject", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleObject_Tags(), this.getTag(), null, "tags", null, 0, -1, RuleObject.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getRuleObject__GetExpressionType(), this.getExpressionType(), "getExpressionType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(abstractContentEClass, AbstractContent.class, "AbstractContent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractContent_ContentGroup(), this.getContentSet(), this.getContentSet_Target(),
				"contentGroup", null, 0, -1, AbstractContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractContent_Allocatable(), this.getAbstractAllocatable(),
				this.getAbstractAllocatable_Contents(), "allocatable", null, 0, -1, AbstractContent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractContent__GetAllocatableList(), this.getAllocatable(), "getAllocatableList", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAbstractContent__CollectLeafContents(), this.getContent(), "collectLeafContents", 0, -1,
				IS_UNIQUE, !IS_ORDERED);

		initEClass(abstractSceneEClass, AbstractScene.class, "AbstractScene", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sceneEClass, Scene.class, "Scene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScene_Global(), ecorePackage.getEBoolean(), "global", "false", 1, 1, Scene.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScene_Properties(), this.getAbstractProperty(), this.getAbstractProperty_Owner(),
				"properties", null, 0, -1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getScene__GetExpressionType(), this.getExpressionType(), "getExpressionType", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(contentEClass, Content.class, "Content", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContent_LoserType(), this.getLoserType(), "loserType", "NEVER_GIVEUP", 0, 1, Content.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_States(), this.getContentState(), this.getContentState_Owner(), "states", null, 0, -1,
				Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContent__CollectLeafContents(), this.getContent(), "collectLeafContents", 0, -1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(contentSetEClass, ContentSet.class, "ContentSet", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentSet_Target(), this.getAbstractContent(), this.getAbstractContent_ContentGroup(),
				"target", null, 0, -1, ContentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContentSet__CollectLeafContents(), this.getContent(), "collectLeafContents", 0, -1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(contentStateEClass, ContentState.class, "ContentState", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentState_Value(), this.getExpression(), null, "value", null, 1, 1, ContentState.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentState_Owner(), this.getContent(), this.getContent_States(), "owner", null, 0, 1,
				ContentState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPropertyEClass, AbstractProperty.class, "AbstractProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractProperty_Owner(), this.getScene(), this.getScene_Properties(), "owner", null, 0, 1,
				AbstractProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractProperty__GetExpressionType(), this.getExpressionType(), "getExpressionType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(integerPropertyEClass, IntegerProperty.class, "IntegerProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerProperty_Value(), this.getExpression(), null, "value", null, 1, 1,
				IntegerProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConstraintEClass, AbstractConstraint.class, "AbstractConstraint", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConstraint_Expression(), this.getExpression(), null, "expression", null, 1, 1,
				AbstractConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Runtime(), ecorePackage.getEBoolean(), "runtime", "true", 1, 1, Constraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Type(), this.getExpressionType(), "type", null, 0, 1, Expression.class,
				!IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_Expression(), ecorePackage.getEString(), "expression", null, 0, 1,
				Expression.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_LetStatements(), this.getLetStatement(), null, "letStatements", null, 0, -1,
				Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getExpression__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getExpression__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(letStatementEClass, LetStatement.class, "LetStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLetStatement_Variable(), this.getVariable(), null, "variable", null, 1, 1, LetStatement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLetStatement_Body(), this.getExpression(), null, "body", null, 1, 1, LetStatement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLetStatement__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(complexExpressionEClass, ComplexExpression.class, "ComplexExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexExpression_OtherExpression(), this.getExpression(), null, "otherExpression", null, 1,
				1, ComplexExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComplexExpression__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getComplexExpression__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getComplexExpression__GetType(), this.getExpressionType(), "getType", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_Operand(), this.getExpression(), null, "operand", null, 1, -1, Operator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(isTypeOfEClass, IsTypeOf.class, "IsTypeOf", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsTypeOf_TagName(), ecorePackage.getEString(), "tagName", null, 1, 1, IsTypeOf.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIsTypeOf__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getIsTypeOf__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIsTypeOf__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(objectReferenceEClass, ObjectReference.class, "ObjectReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectReference_RefObject(), this.getRuleObject(), null, "refObject", null, 0, 1,
				ObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getObjectReference__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getObjectReference__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(previousModifierEClass, PreviousModifier.class, "PreviousModifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreviousModifier_ObjReference(), this.getObjectReference(), null, "objReference", null, 0, 1,
				PreviousModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPreviousModifier__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getPreviousModifier__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getPreviousModifier__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(greaterThanOperatorEClass, GreaterThanOperator.class, "GreaterThanOperator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGreaterThanOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(muchGreaterThanOperatorEClass, MuchGreaterThanOperator.class, "MuchGreaterThanOperator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMuchGreaterThanOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(lowerThanOperatorEClass, LowerThanOperator.class, "LowerThanOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLowerThanOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(comparisonOperatorEClass, ComparisonOperator.class, "ComparisonOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getComparisonOperator__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getComparisonOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(equalToOperatorEClass, EqualToOperator.class, "EqualToOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEqualToOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(comparisonAndEClass, ComparisonAnd.class, "ComparisonAnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getComparisonAnd__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getComparisonAnd__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(logicalOperatorEClass, LogicalOperator.class, "LogicalOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLogicalOperator__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getLogicalOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(andOperatorEClass, AndOperator.class, "AndOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAndOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(orOperatorEClass, OrOperator.class, "OrOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getOrOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(notOperatorEClass, NotOperator.class, "NotOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNotOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getNotOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(isEqualToOperatorEClass, IsEqualToOperator.class, "IsEqualToOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsEqualToOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(isGreaterThanOperatorEClass, IsGreaterThanOperator.class, "IsGreaterThanOperator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsGreaterThanOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(isLowerThanOperatorEClass, IsLowerThanOperator.class, "IsLowerThanOperator", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsLowerThanOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(isGreaterThanEqualOperatorEClass, IsGreaterThanEqualOperator.class, "IsGreaterThanEqualOperator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsGreaterThanEqualOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(isLowerThanEqualOperatorEClass, IsLowerThanEqualOperator.class, "IsLowerThanEqualOperator",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsLowerThanEqualOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(arithmeticOperatorEClass, ArithmeticOperator.class, "ArithmeticOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getArithmeticOperator__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getArithmeticOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(plusOperatorEClass, PlusOperator.class, "PlusOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPlusOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(impliesOperatorEClass, ImpliesOperator.class, "ImpliesOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getImpliesOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(contentOperatorEClass, ContentOperator.class, "ContentOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getContentOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(isActiveEClass, IsActive.class, "IsActive", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsActive__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIsActive__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(getAllocatablesEClass, GetAllocatables.class, "GetAllocatables", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGetAllocatables__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getGetAllocatables__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(hasBeenDisplayedEClass, HasBeenDisplayed.class, "HasBeenDisplayed", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getHasBeenDisplayed__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getHasBeenDisplayed__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(activeStateEClass, ActiveState.class, "ActiveState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActiveState__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getActiveState__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(objectCompareEClass, ObjectCompare.class, "ObjectCompare", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getObjectCompare__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getObjectCompare__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getObjectCompare__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(thatOfOperatorEClass, ThatOfOperator.class, "ThatOfOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getThatOfOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getThatOfOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getThatOfOperator__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(valueExpressionEClass, ValueExpression.class, "ValueExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getValueExpression__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getValueExpression__GetExpressionValue(), ecorePackage.getEInt(), "getExpressionValue", 1, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getValueExpression__GetType(), this.getExpressionType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(maxValueEClass, MaxValue.class, "MaxValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMaxValue__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getMaxValue__GetExpressionValue(), ecorePackage.getEInt(), "getExpressionValue", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(minValueEClass, MinValue.class, "MinValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMinValue__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getMinValue__GetExpressionValue(), ecorePackage.getEInt(), "getExpressionValue", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(noneValueEClass, NoneValue.class, "NoneValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNoneValue__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getNoneValue__GetExpressionValue(), ecorePackage.getEInt(), "getExpressionValue", 1, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(standardValueEClass, StandardValue.class, "StandardValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getStandardValue__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getStandardValue__GetExpressionValue(), ecorePackage.getEInt(), "getExpressionValue", 1, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIntegerValue__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getIntegerValue__GetExpressionValue(), ecorePackage.getEInt(), "getExpressionValue", 1, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(enumExpressionEClass, EnumExpression.class, "EnumExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEnumExpression__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getEnumExpression__GetExpressionValue(), ecorePackage.getEEnumerator(), "getExpressionValue", 1,
				1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEnumExpression__GetType(), this.getExpressionType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(loserTypeExpressionEClass, LoserTypeExpression.class, "LoserTypeExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoserTypeExpression_Value(), this.getLoserType(), "value", null, 1, 1,
				LoserTypeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLoserTypeExpression__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLoserTypeExpression__GetExpressionValue(), ecorePackage.getEEnumerator(),
				"getExpressionValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arbitrationPolicyExpressionEClass, ArbitrationPolicyExpression.class, "ArbitrationPolicyExpression",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArbitrationPolicyExpression_Value(), this.getArbitrationPolicy(), "value", null, 1, 1,
				ArbitrationPolicyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getArbitrationPolicyExpression__GetExpressionText(), ecorePackage.getEString(),
				"getExpressionText", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getArbitrationPolicyExpression__GetExpressionValue(), ecorePackage.getEEnumerator(),
				"getExpressionValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(setExpressionEClass, SetExpression.class, "SetExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(setOperatorEClass, SetOperator.class, "SetOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sizeOperatorEClass, SizeOperator.class, "SizeOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSizeOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getSizeOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getSizeOperator__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(existsOperatorEClass, ExistsOperator.class, "ExistsOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getExistsOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getExistsOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getExistsOperator__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(forAllOperatorEClass, ForAllOperator.class, "ForAllOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getForAllOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getForAllOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getForAllOperator__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(maxOperatorEClass, MaxOperator.class, "MaxOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMaxOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getMaxOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getMaxOperator__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(minOperatorEClass, MinOperator.class, "MinOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMinOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getMinOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getMinOperator__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(selectOperatorEClass, SelectOperator.class, "SelectOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSelectOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getSelectOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getSelectOperator__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(setOfOperatorEClass, SetOfOperator.class, "SetOfOperator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSetOfOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getSetOfOperator__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getSetOfOperator__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(lambdaExpressionEClass, LambdaExpression.class, "LambdaExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLambdaExpression_Context(), this.getLambdaContext(), this.getLambdaContext_Lambda(),
				"context", null, 0, 1, LambdaExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLambdaExpression_X(), this.getVariable(), null, "x", null, 1, 1, LambdaExpression.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLambdaExpression_BodyText(), this.getExpression(), null, "bodyText", null, 1, 1,
				LambdaExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLambdaExpression__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getLambdaExpression__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getVariable__GetExpressionType(), this.getExpressionType(), "getExpressionType", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(lambdaContextEClass, LambdaContext.class, "LambdaContext", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLambdaContext_Lambda(), this.getLambdaExpression(), this.getLambdaExpression_Context(),
				"lambda", null, 0, 1, LambdaContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLambdaContext__GetContextType(), this.getExpressionType(), "getContextType", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatement_Condition(), this.getExpression(), null, "condition", null, 1, 1,
				IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_ThenExpression(), this.getExpression(), null, "thenExpression", null, 1, 1,
				IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_ElseExpression(), this.getExpression(), null, "elseExpression", null, 1, 1,
				IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIfStatement__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getIfStatement__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(sceneOperatorEClass, SceneOperator.class, "SceneOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSceneOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(isOnEClass, IsOn.class, "IsOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsOn__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIsOn__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(allocatableOperatorEClass, AllocatableOperator.class, "AllocatableOperator", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAllocatableOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(allocatedContentEClass, AllocatedContent.class, "AllocatedContent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAllocatedContent__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getAllocatedContent__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(contentValueEClass, ContentValue.class, "ContentValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getContentValue__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getContentValue__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(getContentsListEClass, GetContentsList.class, "GetContentsList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGetContentsList__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getGetContentsList__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(activeContentsEClass, ActiveContents.class, "ActiveContents", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getActiveContents__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getActiveContents__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(propertyOperatorEClass, PropertyOperator.class, "PropertyOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPropertyOperator__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getPropertyOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(getPropertyEClass, GetProperty.class, "GetProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGetProperty__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getGetProperty__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(stateValueEClass, StateValue.class, "StateValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getStateValue__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStateValue__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(hasComeLaterThanEClass, HasComeLaterThan.class, "HasComeLaterThan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getHasComeLaterThan__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getHasComeLaterThan__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getHasComeLaterThan__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(hasComeEarlierThanEClass, HasComeEarlierThan.class, "HasComeEarlierThan", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getHasComeEarlierThan__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getHasComeEarlierThan__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getHasComeEarlierThan__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(sugarExpressionEClass, SugarExpression.class, "SugarExpression", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSugarExpression__CanExpand(), ecorePackage.getEBoolean(), "canExpand", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getSugarExpression__GetExpanded(), this.getExpression(), "getExpanded", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(sugarExpressionBaseEClass, SugarExpressionBase.class, "SugarExpressionBase", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSugarExpressionBase__CanExpand(), ecorePackage.getEBoolean(), "canExpand", 1, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(objectCompareNotEClass, ObjectCompareNot.class, "ObjectCompareNot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getObjectCompareNot__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getObjectCompareNot__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getObjectCompareNot__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(isAllocatedToEClass, IsAllocatedTo.class, "IsAllocatedTo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsAllocatedTo__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIsAllocatedTo__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getIsAllocatedTo__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(isChangedEClass, IsChanged.class, "IsChanged", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsChanged__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIsChanged__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(isTranslatedToEClass, IsTranslatedTo.class, "IsTranslatedTo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsTranslatedTo__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIsTranslatedTo__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getIsTranslatedTo__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(getStateEClass, GetState.class, "GetState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGetState__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contentStateOperatorEClass, ContentStateOperator.class, "ContentStateOperator", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getContentStateOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(nullExpressionEClass, NullExpression.class, "NullExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNullExpression__GetUnderlyingType(), this.getExpressionType(), "getUnderlyingType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getNullExpression__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(arbitrationPolicyEEnum, ArbitrationPolicy.class, "ArbitrationPolicy");
		addEEnumLiteral(arbitrationPolicyEEnum, ArbitrationPolicy.DEFAULT);
		addEEnumLiteral(arbitrationPolicyEEnum, ArbitrationPolicy.FIRST_COME_FIRST);
		addEEnumLiteral(arbitrationPolicyEEnum, ArbitrationPolicy.LAST_COME_FIRST);
		addEEnumLiteral(arbitrationPolicyEEnum, ArbitrationPolicy.PRIORITY_FIRST_COME_FIRST);
		addEEnumLiteral(arbitrationPolicyEEnum, ArbitrationPolicy.PRIORITY_LAST_COME_FIRST);

		initEEnum(expressionTypeEEnum, ExpressionType.class, "ExpressionType");
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.VALUE);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.BOOLEAN);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.AREA);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.CONTENT);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.SET_OF_AREA);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.SET_OF_CONTENT);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.LAMBDA);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.SCENE);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.ZONE);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.SET_OF_ZONE);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.SOUND);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.SET_OF_SOUND);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.PROPERTY);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.CONTENT_STATE);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.ENUM);
		addEEnumLiteral(expressionTypeEEnum, ExpressionType.NULL);

		initEEnum(loserTypeEEnum, LoserType.class, "LoserType");
		addEEnumLiteral(loserTypeEEnum, LoserType.NEVER_GIVEUP);
		addEEnumLiteral(loserTypeEEnum, LoserType.GOOD_LOSER);
		addEEnumLiteral(loserTypeEEnum, LoserType.DO_NOT_GIVEUP_UNTIL_WIN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

} // RBACorePackageImpl
