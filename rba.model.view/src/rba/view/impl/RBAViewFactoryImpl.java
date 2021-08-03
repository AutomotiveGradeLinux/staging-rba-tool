/**
 */
package rba.view.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rba.view.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class RBAViewFactoryImpl extends EFactoryImpl implements RBAViewFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static RBAViewFactory init() {
		try {
			RBAViewFactory theRBAViewFactory = (RBAViewFactory) EPackage.Registry.INSTANCE
					.getEFactory(RBAViewPackage.eNS_URI);
			if (theRBAViewFactory != null) {
				return theRBAViewFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RBAViewFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBAViewFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RBAViewPackage.VIEW_CONTENT:
			return createViewContent();
		case RBAViewPackage.VIEW_CONTENT_SET:
			return createViewContentSet();
		case RBAViewPackage.VIEW_CONTENT_STATE:
			return createViewContentState();
		case RBAViewPackage.VERTICAL_LAYOUT:
			return createVerticalLayout();
		case RBAViewPackage.HORIZONTAL_LAYOUT:
			return createHorizontalLayout();
		case RBAViewPackage.FIXED_POSITION_LAYOUT:
			return createFixedPositionLayout();
		case RBAViewPackage.POSITION_CONTAINER:
			return createPositionContainer();
		case RBAViewPackage.DISPLAY:
			return createDisplay();
		case RBAViewPackage.COMPOSITE_AREA:
			return createCompositeArea();
		case RBAViewPackage.AREA:
			return createArea();
		case RBAViewPackage.AREA_SET:
			return createAreaSet();
		case RBAViewPackage.SIZE:
			return createSize();
		case RBAViewPackage.SIZE_REFERENCE:
			return createSizeReference();
		case RBAViewPackage.OFFSET:
			return createOffset();
		case RBAViewPackage.IS_DISPLAYED:
			return createIsDisplayed();
		case RBAViewPackage.DISPLAYING_CONTENT:
			return createDisplayingContent();
		case RBAViewPackage.IS_HIDDEN:
			return createIsHidden();
		case RBAViewPackage.IS_VISIBLE:
			return createIsVisible();
		case RBAViewPackage.ALL_INSTANCE_OF_AREA:
			return createAllInstanceOfArea();
		case RBAViewPackage.ALL_INSTANCE_OF_VIEW_CONTENT:
			return createAllInstanceOfViewContent();
		case RBAViewPackage.IS_DISPLAYED_ON:
			return createIsDisplayedOn();
		case RBAViewPackage.IS_CHANGED_DISPLAY:
			return createIsChangedDisplay();
		case RBAViewPackage.IS_TRANSLATED_VIEW_TO:
			return createIsTranslatedViewTo();
		case RBAViewPackage.HIDE_LOWER_PRIORITY:
			return createHideLowerPriority();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RBAViewPackage.BASE_POINT:
			return createBasePointFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RBAViewPackage.BASE_POINT:
			return convertBasePointToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContent createViewContent() {
		ViewContentImpl viewContent = new ViewContentImpl();
		return viewContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContentSet createViewContentSet() {
		ViewContentSetImpl viewContentSet = new ViewContentSetImpl();
		return viewContentSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContentState createViewContentState() {
		ViewContentStateImpl viewContentState = new ViewContentStateImpl();
		return viewContentState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalLayout createVerticalLayout() {
		VerticalLayoutImpl verticalLayout = new VerticalLayoutImpl();
		return verticalLayout;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalLayout createHorizontalLayout() {
		HorizontalLayoutImpl horizontalLayout = new HorizontalLayoutImpl();
		return horizontalLayout;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FixedPositionLayout createFixedPositionLayout() {
		FixedPositionLayoutImpl fixedPositionLayout = new FixedPositionLayoutImpl();
		return fixedPositionLayout;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PositionContainer createPositionContainer() {
		PositionContainerImpl positionContainer = new PositionContainerImpl();
		return positionContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Display createDisplay() {
		DisplayImpl display = new DisplayImpl();
		return display;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeArea createCompositeArea() {
		CompositeAreaImpl compositeArea = new CompositeAreaImpl();
		return compositeArea;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Area createArea() {
		AreaImpl area = new AreaImpl();
		return area;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AreaSet createAreaSet() {
		AreaSetImpl areaSet = new AreaSetImpl();
		return areaSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSize() {
		SizeImpl size = new SizeImpl();
		return size;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SizeReference createSizeReference() {
		SizeReferenceImpl sizeReference = new SizeReferenceImpl();
		return sizeReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Offset createOffset() {
		OffsetImpl offset = new OffsetImpl();
		return offset;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsDisplayed createIsDisplayed() {
		IsDisplayedImpl isDisplayed = new IsDisplayedImpl();
		return isDisplayed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayingContent createDisplayingContent() {
		DisplayingContentImpl displayingContent = new DisplayingContentImpl();
		return displayingContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsHidden createIsHidden() {
		IsHiddenImpl isHidden = new IsHiddenImpl();
		return isHidden;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsVisible createIsVisible() {
		IsVisibleImpl isVisible = new IsVisibleImpl();
		return isVisible;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AllInstanceOfArea createAllInstanceOfArea() {
		AllInstanceOfAreaImpl allInstanceOfArea = new AllInstanceOfAreaImpl();
		return allInstanceOfArea;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AllInstanceOfViewContent createAllInstanceOfViewContent() {
		AllInstanceOfViewContentImpl allInstanceOfViewContent = new AllInstanceOfViewContentImpl();
		return allInstanceOfViewContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsDisplayedOn createIsDisplayedOn() {
		IsDisplayedOnImpl isDisplayedOn = new IsDisplayedOnImpl();
		return isDisplayedOn;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsChangedDisplay createIsChangedDisplay() {
		IsChangedDisplayImpl isChangedDisplay = new IsChangedDisplayImpl();
		return isChangedDisplay;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsTranslatedViewTo createIsTranslatedViewTo() {
		IsTranslatedViewToImpl isTranslatedViewTo = new IsTranslatedViewToImpl();
		return isTranslatedViewTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HideLowerPriority createHideLowerPriority() {
		HideLowerPriorityImpl hideLowerPriority = new HideLowerPriorityImpl();
		return hideLowerPriority;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BasePoint createBasePointFromString(EDataType eDataType, String initialValue) {
		BasePoint result = BasePoint.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasePointToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBAViewPackage getRBAViewPackage() {
		return (RBAViewPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RBAViewPackage getPackage() {
		return RBAViewPackage.eINSTANCE;
	}

} // RBAViewFactoryImpl
