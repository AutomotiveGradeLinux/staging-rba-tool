/**
 */
package rba.view.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rba.core.RBACorePackage;
import rba.view.AlignedLayout;
import rba.view.AllInstanceOfArea;
import rba.view.AllInstanceOfViewContent;
import rba.view.Area;
import rba.view.AreaOperator;
import rba.view.AreaSet;
import rba.view.BasePoint;
import rba.view.CompositeArea;
import rba.view.Display;
import rba.view.DisplayingContent;
import rba.view.FixedPositionLayout;
import rba.view.HideLowerPriority;
import rba.view.HorizontalLayout;
import rba.view.IsChangedDisplay;
import rba.view.IsDisplayed;
import rba.view.IsDisplayedOn;
import rba.view.IsHidden;
import rba.view.IsTranslatedViewTo;
import rba.view.IsVisible;
import rba.view.LayoutManager;
import rba.view.Offset;
import rba.view.PositionContainer;
import rba.view.RBAViewFactory;
import rba.view.RBAViewPackage;
import rba.view.Size;
import rba.view.SizeIdentifier;
import rba.view.SizeReference;
import rba.view.VerticalLayout;
import rba.view.ViewContent;
import rba.view.ViewContentOperator;
import rba.view.ViewContentSet;
import rba.view.ViewContentState;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class RBAViewPackageImpl extends EPackageImpl implements RBAViewPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewContentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewContentSetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewContentStateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutManagerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alignedLayoutEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalLayoutEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalLayoutEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedPositionLayoutEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionContainerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeAreaEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaSetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offsetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isDisplayedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayingContentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isHiddenEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewContentOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isVisibleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allInstanceOfAreaEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allInstanceOfViewContentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isDisplayedOnEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isChangedDisplayEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTranslatedViewToEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hideLowerPriorityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basePointEEnum = null;

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
	 * @see rba.view.RBAViewPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RBAViewPackageImpl() {
		super(eNS_URI, RBAViewFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RBAViewPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RBAViewPackage init() {
		if (isInited)
			return (RBAViewPackage) EPackage.Registry.INSTANCE.getEPackage(RBAViewPackage.eNS_URI);

		// Obtain or create and register package
		RBAViewPackageImpl theRBAViewPackage = (RBAViewPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RBAViewPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RBAViewPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RBACorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRBAViewPackage.createPackageContents();

		// Initialize created meta-data
		theRBAViewPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRBAViewPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RBAViewPackage.eNS_URI, theRBAViewPackage);
		return theRBAViewPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewContent() {
		return viewContentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewContent_Size() {
		return (EReference) viewContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewContent__GetExpressionType() {
		return viewContentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewContentSet() {
		return viewContentSetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewContentSet__GetExpressionType() {
		return viewContentSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewContentState() {
		return viewContentStateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewContentState__GetExpressionType() {
		return viewContentStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutManager() {
		return layoutManagerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLayoutManager__CollectLeafArea() {
		return layoutManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlignedLayout() {
		return alignedLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlignedLayout_Subarea() {
		return (EReference) alignedLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlignedLayout_BasePoint() {
		return (EAttribute) alignedLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAlignedLayout__CollectLeafArea() {
		return alignedLayoutEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalLayout() {
		return verticalLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalLayout() {
		return horizontalLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedPositionLayout() {
		return fixedPositionLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixedPositionLayout_SubAreaPosition() {
		return (EReference) fixedPositionLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFixedPositionLayout__CollectLeafArea() {
		return fixedPositionLayoutEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionContainer() {
		return positionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionContainer_X() {
		return (EAttribute) positionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionContainer_Y() {
		return (EAttribute) positionContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionContainer_BasePoint() {
		return (EAttribute) positionContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionContainer_Area() {
		return (EReference) positionContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionContainer_Offset() {
		return (EReference) positionContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplay() {
		return displayEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisplay_Root() {
		return (EReference) displayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisplay_Size() {
		return (EReference) displayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeArea() {
		return compositeAreaEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeArea_Layout() {
		return (EReference) compositeAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeArea__CollectLeafArea() {
		return compositeAreaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompositeArea__GetExpressionType() {
		return compositeAreaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_Zorder() {
		return (EReference) areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_Size() {
		return (EReference) areaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArea__GetExpressionType() {
		return areaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaSet() {
		return areaSetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAreaSet__GetExpressionType() {
		return areaSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSizeIdentifier() {
		return sizeIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSize() {
		return sizeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Width() {
		return (EAttribute) sizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Height() {
		return (EAttribute) sizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSizeReference() {
		return sizeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSizeReference_Size() {
		return (EReference) sizeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffset() {
		return offsetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffset_X() {
		return (EAttribute) offsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffset_Y() {
		return (EAttribute) offsetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffset_Size() {
		return (EReference) offsetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAreaOperator() {
		return areaOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsDisplayed() {
		return isDisplayedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsDisplayed__GetSymbol() {
		return isDisplayedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsDisplayed__GetUnderlyingType() {
		return isDisplayedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayingContent() {
		return displayingContentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDisplayingContent__GetSymbol() {
		return displayingContentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDisplayingContent__GetUnderlyingType() {
		return displayingContentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsHidden() {
		return isHiddenEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsHidden__GetSymbol() {
		return isHiddenEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsHidden__GetUnderlyingType() {
		return isHiddenEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewContentOperator() {
		return viewContentOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewContentOperator__GetUnderlyingType() {
		return viewContentOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsVisible() {
		return isVisibleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsVisible__GetSymbol() {
		return isVisibleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllInstanceOfArea() {
		return allInstanceOfAreaEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllInstanceOfArea__GetExpressionText() {
		return allInstanceOfAreaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllInstanceOfArea__GetUnderlyingType() {
		return allInstanceOfAreaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllInstanceOfViewContent() {
		return allInstanceOfViewContentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllInstanceOfViewContent__GetExpressionText() {
		return allInstanceOfViewContentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllInstanceOfViewContent__GetUnderlyingType() {
		return allInstanceOfViewContentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsDisplayedOn() {
		return isDisplayedOnEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsDisplayedOn__GetSymbol() {
		return isDisplayedOnEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsDisplayedOn__GetUnderlyingType() {
		return isDisplayedOnEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsDisplayedOn__GetExpressionText() {
		return isDisplayedOnEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsChangedDisplay() {
		return isChangedDisplayEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsChangedDisplay__GetSymbol() {
		return isChangedDisplayEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsChangedDisplay__GetUnderlyingType() {
		return isChangedDisplayEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsTranslatedViewTo() {
		return isTranslatedViewToEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsTranslatedViewTo__GetSymbol() {
		return isTranslatedViewToEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsTranslatedViewTo__GetUnderlyingType() {
		return isTranslatedViewToEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsTranslatedViewTo__GetExpressionText() {
		return isTranslatedViewToEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHideLowerPriority() {
		return hideLowerPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHideLowerPriority__GetSymbol() {
		return hideLowerPriorityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHideLowerPriority__GetUnderlyingType() {
		return hideLowerPriorityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHideLowerPriority__GetExpressionText() {
		return hideLowerPriorityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasePoint() {
		return basePointEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBAViewFactory getRBAViewFactory() {
		return (RBAViewFactory) getEFactoryInstance();
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
		viewContentEClass = createEClass(VIEW_CONTENT);
		createEReference(viewContentEClass, VIEW_CONTENT__SIZE);
		createEOperation(viewContentEClass, VIEW_CONTENT___GET_EXPRESSION_TYPE);

		viewContentSetEClass = createEClass(VIEW_CONTENT_SET);
		createEOperation(viewContentSetEClass, VIEW_CONTENT_SET___GET_EXPRESSION_TYPE);

		viewContentStateEClass = createEClass(VIEW_CONTENT_STATE);
		createEOperation(viewContentStateEClass, VIEW_CONTENT_STATE___GET_EXPRESSION_TYPE);

		layoutManagerEClass = createEClass(LAYOUT_MANAGER);
		createEOperation(layoutManagerEClass, LAYOUT_MANAGER___COLLECT_LEAF_AREA);

		alignedLayoutEClass = createEClass(ALIGNED_LAYOUT);
		createEReference(alignedLayoutEClass, ALIGNED_LAYOUT__SUBAREA);
		createEAttribute(alignedLayoutEClass, ALIGNED_LAYOUT__BASE_POINT);
		createEOperation(alignedLayoutEClass, ALIGNED_LAYOUT___COLLECT_LEAF_AREA);

		verticalLayoutEClass = createEClass(VERTICAL_LAYOUT);

		horizontalLayoutEClass = createEClass(HORIZONTAL_LAYOUT);

		fixedPositionLayoutEClass = createEClass(FIXED_POSITION_LAYOUT);
		createEReference(fixedPositionLayoutEClass, FIXED_POSITION_LAYOUT__SUB_AREA_POSITION);
		createEOperation(fixedPositionLayoutEClass, FIXED_POSITION_LAYOUT___COLLECT_LEAF_AREA);

		positionContainerEClass = createEClass(POSITION_CONTAINER);
		createEAttribute(positionContainerEClass, POSITION_CONTAINER__X);
		createEAttribute(positionContainerEClass, POSITION_CONTAINER__Y);
		createEAttribute(positionContainerEClass, POSITION_CONTAINER__BASE_POINT);
		createEReference(positionContainerEClass, POSITION_CONTAINER__AREA);
		createEReference(positionContainerEClass, POSITION_CONTAINER__OFFSET);

		displayEClass = createEClass(DISPLAY);
		createEReference(displayEClass, DISPLAY__ROOT);
		createEReference(displayEClass, DISPLAY__SIZE);

		compositeAreaEClass = createEClass(COMPOSITE_AREA);
		createEReference(compositeAreaEClass, COMPOSITE_AREA__LAYOUT);
		createEOperation(compositeAreaEClass, COMPOSITE_AREA___COLLECT_LEAF_AREA);
		createEOperation(compositeAreaEClass, COMPOSITE_AREA___GET_EXPRESSION_TYPE);

		areaEClass = createEClass(AREA);
		createEReference(areaEClass, AREA__ZORDER);
		createEReference(areaEClass, AREA__SIZE);
		createEOperation(areaEClass, AREA___GET_EXPRESSION_TYPE);

		areaSetEClass = createEClass(AREA_SET);
		createEOperation(areaSetEClass, AREA_SET___GET_EXPRESSION_TYPE);

		sizeIdentifierEClass = createEClass(SIZE_IDENTIFIER);

		sizeEClass = createEClass(SIZE);
		createEAttribute(sizeEClass, SIZE__WIDTH);
		createEAttribute(sizeEClass, SIZE__HEIGHT);

		sizeReferenceEClass = createEClass(SIZE_REFERENCE);
		createEReference(sizeReferenceEClass, SIZE_REFERENCE__SIZE);

		offsetEClass = createEClass(OFFSET);
		createEAttribute(offsetEClass, OFFSET__X);
		createEAttribute(offsetEClass, OFFSET__Y);
		createEReference(offsetEClass, OFFSET__SIZE);

		areaOperatorEClass = createEClass(AREA_OPERATOR);

		isDisplayedEClass = createEClass(IS_DISPLAYED);
		createEOperation(isDisplayedEClass, IS_DISPLAYED___GET_SYMBOL);
		createEOperation(isDisplayedEClass, IS_DISPLAYED___GET_UNDERLYING_TYPE);

		displayingContentEClass = createEClass(DISPLAYING_CONTENT);
		createEOperation(displayingContentEClass, DISPLAYING_CONTENT___GET_SYMBOL);
		createEOperation(displayingContentEClass, DISPLAYING_CONTENT___GET_UNDERLYING_TYPE);

		isHiddenEClass = createEClass(IS_HIDDEN);
		createEOperation(isHiddenEClass, IS_HIDDEN___GET_SYMBOL);
		createEOperation(isHiddenEClass, IS_HIDDEN___GET_UNDERLYING_TYPE);

		viewContentOperatorEClass = createEClass(VIEW_CONTENT_OPERATOR);
		createEOperation(viewContentOperatorEClass, VIEW_CONTENT_OPERATOR___GET_UNDERLYING_TYPE);

		isVisibleEClass = createEClass(IS_VISIBLE);
		createEOperation(isVisibleEClass, IS_VISIBLE___GET_SYMBOL);

		allInstanceOfAreaEClass = createEClass(ALL_INSTANCE_OF_AREA);
		createEOperation(allInstanceOfAreaEClass, ALL_INSTANCE_OF_AREA___GET_EXPRESSION_TEXT);
		createEOperation(allInstanceOfAreaEClass, ALL_INSTANCE_OF_AREA___GET_UNDERLYING_TYPE);

		allInstanceOfViewContentEClass = createEClass(ALL_INSTANCE_OF_VIEW_CONTENT);
		createEOperation(allInstanceOfViewContentEClass, ALL_INSTANCE_OF_VIEW_CONTENT___GET_EXPRESSION_TEXT);
		createEOperation(allInstanceOfViewContentEClass, ALL_INSTANCE_OF_VIEW_CONTENT___GET_UNDERLYING_TYPE);

		isDisplayedOnEClass = createEClass(IS_DISPLAYED_ON);
		createEOperation(isDisplayedOnEClass, IS_DISPLAYED_ON___GET_SYMBOL);
		createEOperation(isDisplayedOnEClass, IS_DISPLAYED_ON___GET_UNDERLYING_TYPE);
		createEOperation(isDisplayedOnEClass, IS_DISPLAYED_ON___GET_EXPRESSION_TEXT);

		isChangedDisplayEClass = createEClass(IS_CHANGED_DISPLAY);
		createEOperation(isChangedDisplayEClass, IS_CHANGED_DISPLAY___GET_SYMBOL);
		createEOperation(isChangedDisplayEClass, IS_CHANGED_DISPLAY___GET_UNDERLYING_TYPE);

		isTranslatedViewToEClass = createEClass(IS_TRANSLATED_VIEW_TO);
		createEOperation(isTranslatedViewToEClass, IS_TRANSLATED_VIEW_TO___GET_SYMBOL);
		createEOperation(isTranslatedViewToEClass, IS_TRANSLATED_VIEW_TO___GET_UNDERLYING_TYPE);
		createEOperation(isTranslatedViewToEClass, IS_TRANSLATED_VIEW_TO___GET_EXPRESSION_TEXT);

		hideLowerPriorityEClass = createEClass(HIDE_LOWER_PRIORITY);
		createEOperation(hideLowerPriorityEClass, HIDE_LOWER_PRIORITY___GET_SYMBOL);
		createEOperation(hideLowerPriorityEClass, HIDE_LOWER_PRIORITY___GET_UNDERLYING_TYPE);
		createEOperation(hideLowerPriorityEClass, HIDE_LOWER_PRIORITY___GET_EXPRESSION_TEXT);

		// Create enums
		basePointEEnum = createEEnum(BASE_POINT);
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

		// Obtain other dependent packages
		RBACorePackage theRBACorePackage = (RBACorePackage) EPackage.Registry.INSTANCE
				.getEPackage(RBACorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		viewContentEClass.getESuperTypes().add(theRBACorePackage.getContent());
		viewContentSetEClass.getESuperTypes().add(theRBACorePackage.getContentSet());
		viewContentStateEClass.getESuperTypes().add(theRBACorePackage.getContentState());
		alignedLayoutEClass.getESuperTypes().add(this.getLayoutManager());
		verticalLayoutEClass.getESuperTypes().add(this.getAlignedLayout());
		horizontalLayoutEClass.getESuperTypes().add(this.getAlignedLayout());
		fixedPositionLayoutEClass.getESuperTypes().add(this.getLayoutManager());
		displayEClass.getESuperTypes().add(theRBACorePackage.getPackagableElement());
		compositeAreaEClass.getESuperTypes().add(theRBACorePackage.getPackagableElement());
		areaEClass.getESuperTypes().add(theRBACorePackage.getAllocatable());
		areaSetEClass.getESuperTypes().add(theRBACorePackage.getAllocatableSet());
		sizeEClass.getESuperTypes().add(theRBACorePackage.getPackagableElement());
		sizeEClass.getESuperTypes().add(this.getSizeIdentifier());
		sizeReferenceEClass.getESuperTypes().add(this.getSizeIdentifier());
		offsetEClass.getESuperTypes().add(theRBACorePackage.getPackagableElement());
		areaOperatorEClass.getESuperTypes().add(theRBACorePackage.getAllocatableOperator());
		isDisplayedEClass.getESuperTypes().add(this.getAreaOperator());
		displayingContentEClass.getESuperTypes().add(this.getAreaOperator());
		isHiddenEClass.getESuperTypes().add(this.getAreaOperator());
		viewContentOperatorEClass.getESuperTypes().add(theRBACorePackage.getContentOperator());
		isVisibleEClass.getESuperTypes().add(this.getViewContentOperator());
		allInstanceOfAreaEClass.getESuperTypes().add(theRBACorePackage.getSetExpression());
		allInstanceOfViewContentEClass.getESuperTypes().add(theRBACorePackage.getSetExpression());
		isDisplayedOnEClass.getESuperTypes().add(this.getViewContentOperator());
		isDisplayedOnEClass.getESuperTypes().add(theRBACorePackage.getSugarExpressionBase());
		isChangedDisplayEClass.getESuperTypes().add(this.getAreaOperator());
		isChangedDisplayEClass.getESuperTypes().add(theRBACorePackage.getSugarExpressionBase());
		isTranslatedViewToEClass.getESuperTypes().add(this.getAreaOperator());
		isTranslatedViewToEClass.getESuperTypes().add(theRBACorePackage.getSugarExpressionBase());
		hideLowerPriorityEClass.getESuperTypes().add(theRBACorePackage.getOperator());
		hideLowerPriorityEClass.getESuperTypes().add(theRBACorePackage.getSugarExpressionBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(viewContentEClass, ViewContent.class, "ViewContent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewContent_Size(), this.getSizeIdentifier(), null, "size", null, 0, -1, ViewContent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getViewContent__GetExpressionType(), theRBACorePackage.getExpressionType(), "getExpressionType",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(viewContentSetEClass, ViewContentSet.class, "ViewContentSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getViewContentSet__GetExpressionType(), theRBACorePackage.getExpressionType(),
				"getExpressionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(viewContentStateEClass, ViewContentState.class, "ViewContentState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getViewContentState__GetExpressionType(), theRBACorePackage.getExpressionType(),
				"getExpressionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(layoutManagerEClass, LayoutManager.class, "LayoutManager", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLayoutManager__CollectLeafArea(), this.getArea(), "collectLeafArea", 0, -1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(alignedLayoutEClass, AlignedLayout.class, "AlignedLayout", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlignedLayout_Subarea(), this.getArea(), null, "subarea", null, 0, -1, AlignedLayout.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlignedLayout_BasePoint(), this.getBasePoint(), "basePoint", null, 0, 1, AlignedLayout.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAlignedLayout__CollectLeafArea(), this.getArea(), "collectLeafArea", 0, -1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(verticalLayoutEClass, VerticalLayout.class, "VerticalLayout", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(horizontalLayoutEClass, HorizontalLayout.class, "HorizontalLayout", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixedPositionLayoutEClass, FixedPositionLayout.class, "FixedPositionLayout", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedPositionLayout_SubAreaPosition(), this.getPositionContainer(), null, "subAreaPosition",
				null, 0, -1, FixedPositionLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFixedPositionLayout__CollectLeafArea(), this.getArea(), "collectLeafArea", 0, -1, IS_UNIQUE,
				!IS_ORDERED);

		initEClass(positionContainerEClass, PositionContainer.class, "PositionContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionContainer_X(), ecorePackage.getEInt(), "x", null, 1, 1, PositionContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionContainer_Y(), ecorePackage.getEInt(), "y", null, 1, 1, PositionContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionContainer_BasePoint(), this.getBasePoint(), "basePoint", null, 0, 1,
				PositionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPositionContainer_Area(), this.getArea(), null, "area", null, 1, 1, PositionContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPositionContainer_Offset(), this.getOffset(), null, "offset", null, 0, -1,
				PositionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayEClass, Display.class, "Display", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisplay_Root(), this.getCompositeArea(), null, "root", null, 0, 1, Display.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplay_Size(), this.getSizeIdentifier(), null, "size", null, 1, 1, Display.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeAreaEClass, CompositeArea.class, "CompositeArea", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeArea_Layout(), this.getLayoutManager(), null, "layout", null, 0, 1,
				CompositeArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompositeArea__CollectLeafArea(), this.getArea(), "collectLeafArea", 0, -1, IS_UNIQUE,
				!IS_ORDERED);

		initEOperation(getCompositeArea__GetExpressionType(), theRBACorePackage.getExpressionType(),
				"getExpressionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArea_Zorder(), theRBACorePackage.getExpression(), null, "zorder", null, 0, 1, Area.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArea_Size(), this.getSizeIdentifier(), null, "size", null, 0, -1, Area.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getArea__GetExpressionType(), theRBACorePackage.getExpressionType(), "getExpressionType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(areaSetEClass, AreaSet.class, "AreaSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAreaSet__GetExpressionType(), theRBACorePackage.getExpressionType(), "getExpressionType", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(sizeIdentifierEClass, SizeIdentifier.class, "SizeIdentifier", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSize_Width(), ecorePackage.getEInt(), "width", null, 1, 1, Size.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSize_Height(), ecorePackage.getEInt(), "height", null, 1, 1, Size.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sizeReferenceEClass, SizeReference.class, "SizeReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSizeReference_Size(), this.getSize(), null, "size", null, 0, 1, SizeReference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offsetEClass, Offset.class, "Offset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffset_X(), ecorePackage.getEInt(), "x", null, 1, 1, Offset.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffset_Y(), ecorePackage.getEInt(), "y", null, 1, 1, Offset.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOffset_Size(), this.getSizeReference(), null, "size", null, 1, 1, Offset.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(areaOperatorEClass, AreaOperator.class, "AreaOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(isDisplayedEClass, IsDisplayed.class, "IsDisplayed", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsDisplayed__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIsDisplayed__GetUnderlyingType(), theRBACorePackage.getExpressionType(), "getUnderlyingType",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(displayingContentEClass, DisplayingContent.class, "DisplayingContent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDisplayingContent__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getDisplayingContent__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(isHiddenEClass, IsHidden.class, "IsHidden", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsHidden__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIsHidden__GetUnderlyingType(), theRBACorePackage.getExpressionType(), "getUnderlyingType", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(viewContentOperatorEClass, ViewContentOperator.class, "ViewContentOperator", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getViewContentOperator__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(isVisibleEClass, IsVisible.class, "IsVisible", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsVisible__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allInstanceOfAreaEClass, AllInstanceOfArea.class, "AllInstanceOfArea", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAllInstanceOfArea__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getAllInstanceOfArea__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allInstanceOfViewContentEClass, AllInstanceOfViewContent.class, "AllInstanceOfViewContent",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAllInstanceOfViewContent__GetExpressionText(), ecorePackage.getEString(), "getExpressionText",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAllInstanceOfViewContent__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(isDisplayedOnEClass, IsDisplayedOn.class, "IsDisplayedOn", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsDisplayedOn__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIsDisplayedOn__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIsDisplayedOn__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(isChangedDisplayEClass, IsChangedDisplay.class, "IsChangedDisplay", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsChangedDisplay__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIsChangedDisplay__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(isTranslatedViewToEClass, IsTranslatedViewTo.class, "IsTranslatedViewTo", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsTranslatedViewTo__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIsTranslatedViewTo__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIsTranslatedViewTo__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(hideLowerPriorityEClass, HideLowerPriority.class, "HideLowerPriority", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getHideLowerPriority__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getHideLowerPriority__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHideLowerPriority__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(basePointEEnum, BasePoint.class, "BasePoint");
		addEEnumLiteral(basePointEEnum, BasePoint.LEFT_TOP);
		addEEnumLiteral(basePointEEnum, BasePoint.LEFT_MIDDLE);
		addEEnumLiteral(basePointEEnum, BasePoint.LEFT_BOTTOM);
		addEEnumLiteral(basePointEEnum, BasePoint.RIGHT_TOP);
		addEEnumLiteral(basePointEEnum, BasePoint.RIGHT_MIDDLE);
		addEEnumLiteral(basePointEEnum, BasePoint.RIGHT_BOTTOM);
		addEEnumLiteral(basePointEEnum, BasePoint.CENTER_TOP);
		addEEnumLiteral(basePointEEnum, BasePoint.CENTER_MIDDLE);
		addEEnumLiteral(basePointEEnum, BasePoint.CENTER_BOTTOM);

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
		addAnnotation(this, source, new String[] { "RbaCore", "../../rba.model.core/model/rbacore.ecore#/", "ecore",
				"http://www.eclipse.org/emf/2002/Ecore" });
	}

} // RBAViewPackageImpl
