/**
 */
package rba.view.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rba.core.AbstractAllocatable;
import rba.core.AbstractContent;
import rba.core.Allocatable;
import rba.core.AllocatableOperator;
import rba.core.AllocatableSet;
import rba.core.Content;
import rba.core.ContentOperator;
import rba.core.ContentSet;
import rba.core.ContentState;
import rba.core.Expression;
import rba.core.ModelElement;
import rba.core.NamedElement;
import rba.core.Operator;
import rba.core.PackagableElement;
import rba.core.RuleObject;
import rba.core.SetExpression;

import rba.core.SugarExpression;
import rba.core.SugarExpressionBase;
import rba.view.*;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model, starting
 * with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is returned, which is
 * the result of the switch. <!-- end-user-doc -->
 * @see rba.view.RBAViewPackage
 * @generated
 */
public class RBAViewSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static RBAViewPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBAViewSwitch() {
		if (modelPackage == null) {
			modelPackage = RBAViewPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RBAViewPackage.VIEW_CONTENT: {
			ViewContent viewContent = (ViewContent) theEObject;
			T result = caseViewContent(viewContent);
			if (result == null)
				result = caseContent(viewContent);
			if (result == null)
				result = caseAbstractContent(viewContent);
			if (result == null)
				result = caseRuleObject(viewContent);
			if (result == null)
				result = casePackagableElement(viewContent);
			if (result == null)
				result = caseNamedElement(viewContent);
			if (result == null)
				result = caseModelElement(viewContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.VIEW_CONTENT_SET: {
			ViewContentSet viewContentSet = (ViewContentSet) theEObject;
			T result = caseViewContentSet(viewContentSet);
			if (result == null)
				result = caseContentSet(viewContentSet);
			if (result == null)
				result = caseAbstractContent(viewContentSet);
			if (result == null)
				result = caseRuleObject(viewContentSet);
			if (result == null)
				result = casePackagableElement(viewContentSet);
			if (result == null)
				result = caseNamedElement(viewContentSet);
			if (result == null)
				result = caseModelElement(viewContentSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.VIEW_CONTENT_STATE: {
			ViewContentState viewContentState = (ViewContentState) theEObject;
			T result = caseViewContentState(viewContentState);
			if (result == null)
				result = caseContentState(viewContentState);
			if (result == null)
				result = caseRuleObject(viewContentState);
			if (result == null)
				result = casePackagableElement(viewContentState);
			if (result == null)
				result = caseNamedElement(viewContentState);
			if (result == null)
				result = caseModelElement(viewContentState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.LAYOUT_MANAGER: {
			LayoutManager layoutManager = (LayoutManager) theEObject;
			T result = caseLayoutManager(layoutManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.ALIGNED_LAYOUT: {
			AlignedLayout alignedLayout = (AlignedLayout) theEObject;
			T result = caseAlignedLayout(alignedLayout);
			if (result == null)
				result = caseLayoutManager(alignedLayout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.VERTICAL_LAYOUT: {
			VerticalLayout verticalLayout = (VerticalLayout) theEObject;
			T result = caseVerticalLayout(verticalLayout);
			if (result == null)
				result = caseAlignedLayout(verticalLayout);
			if (result == null)
				result = caseLayoutManager(verticalLayout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.HORIZONTAL_LAYOUT: {
			HorizontalLayout horizontalLayout = (HorizontalLayout) theEObject;
			T result = caseHorizontalLayout(horizontalLayout);
			if (result == null)
				result = caseAlignedLayout(horizontalLayout);
			if (result == null)
				result = caseLayoutManager(horizontalLayout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.FIXED_POSITION_LAYOUT: {
			FixedPositionLayout fixedPositionLayout = (FixedPositionLayout) theEObject;
			T result = caseFixedPositionLayout(fixedPositionLayout);
			if (result == null)
				result = caseLayoutManager(fixedPositionLayout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.POSITION_CONTAINER: {
			PositionContainer positionContainer = (PositionContainer) theEObject;
			T result = casePositionContainer(positionContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.DISPLAY: {
			Display display = (Display) theEObject;
			T result = caseDisplay(display);
			if (result == null)
				result = casePackagableElement(display);
			if (result == null)
				result = caseNamedElement(display);
			if (result == null)
				result = caseModelElement(display);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.COMPOSITE_AREA: {
			CompositeArea compositeArea = (CompositeArea) theEObject;
			T result = caseCompositeArea(compositeArea);
			if (result == null)
				result = casePackagableElement(compositeArea);
			if (result == null)
				result = caseNamedElement(compositeArea);
			if (result == null)
				result = caseModelElement(compositeArea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.AREA: {
			Area area = (Area) theEObject;
			T result = caseArea(area);
			if (result == null)
				result = caseAllocatable(area);
			if (result == null)
				result = caseAbstractAllocatable(area);
			if (result == null)
				result = caseRuleObject(area);
			if (result == null)
				result = casePackagableElement(area);
			if (result == null)
				result = caseNamedElement(area);
			if (result == null)
				result = caseModelElement(area);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.AREA_SET: {
			AreaSet areaSet = (AreaSet) theEObject;
			T result = caseAreaSet(areaSet);
			if (result == null)
				result = caseAllocatableSet(areaSet);
			if (result == null)
				result = caseAbstractAllocatable(areaSet);
			if (result == null)
				result = caseRuleObject(areaSet);
			if (result == null)
				result = casePackagableElement(areaSet);
			if (result == null)
				result = caseNamedElement(areaSet);
			if (result == null)
				result = caseModelElement(areaSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.SIZE_IDENTIFIER: {
			SizeIdentifier sizeIdentifier = (SizeIdentifier) theEObject;
			T result = caseSizeIdentifier(sizeIdentifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.SIZE: {
			Size size = (Size) theEObject;
			T result = caseSize(size);
			if (result == null)
				result = casePackagableElement(size);
			if (result == null)
				result = caseSizeIdentifier(size);
			if (result == null)
				result = caseNamedElement(size);
			if (result == null)
				result = caseModelElement(size);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.SIZE_REFERENCE: {
			SizeReference sizeReference = (SizeReference) theEObject;
			T result = caseSizeReference(sizeReference);
			if (result == null)
				result = caseSizeIdentifier(sizeReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.OFFSET: {
			Offset offset = (Offset) theEObject;
			T result = caseOffset(offset);
			if (result == null)
				result = casePackagableElement(offset);
			if (result == null)
				result = caseNamedElement(offset);
			if (result == null)
				result = caseModelElement(offset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.AREA_OPERATOR: {
			AreaOperator areaOperator = (AreaOperator) theEObject;
			T result = caseAreaOperator(areaOperator);
			if (result == null)
				result = caseAllocatableOperator(areaOperator);
			if (result == null)
				result = caseOperator(areaOperator);
			if (result == null)
				result = caseExpression(areaOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.IS_DISPLAYED: {
			IsDisplayed isDisplayed = (IsDisplayed) theEObject;
			T result = caseIsDisplayed(isDisplayed);
			if (result == null)
				result = caseAreaOperator(isDisplayed);
			if (result == null)
				result = caseAllocatableOperator(isDisplayed);
			if (result == null)
				result = caseOperator(isDisplayed);
			if (result == null)
				result = caseExpression(isDisplayed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.DISPLAYING_CONTENT: {
			DisplayingContent displayingContent = (DisplayingContent) theEObject;
			T result = caseDisplayingContent(displayingContent);
			if (result == null)
				result = caseAreaOperator(displayingContent);
			if (result == null)
				result = caseAllocatableOperator(displayingContent);
			if (result == null)
				result = caseOperator(displayingContent);
			if (result == null)
				result = caseExpression(displayingContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.IS_HIDDEN: {
			IsHidden isHidden = (IsHidden) theEObject;
			T result = caseIsHidden(isHidden);
			if (result == null)
				result = caseAreaOperator(isHidden);
			if (result == null)
				result = caseAllocatableOperator(isHidden);
			if (result == null)
				result = caseOperator(isHidden);
			if (result == null)
				result = caseExpression(isHidden);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.VIEW_CONTENT_OPERATOR: {
			ViewContentOperator viewContentOperator = (ViewContentOperator) theEObject;
			T result = caseViewContentOperator(viewContentOperator);
			if (result == null)
				result = caseContentOperator(viewContentOperator);
			if (result == null)
				result = caseOperator(viewContentOperator);
			if (result == null)
				result = caseExpression(viewContentOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.IS_VISIBLE: {
			IsVisible isVisible = (IsVisible) theEObject;
			T result = caseIsVisible(isVisible);
			if (result == null)
				result = caseViewContentOperator(isVisible);
			if (result == null)
				result = caseContentOperator(isVisible);
			if (result == null)
				result = caseOperator(isVisible);
			if (result == null)
				result = caseExpression(isVisible);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.ALL_INSTANCE_OF_AREA: {
			AllInstanceOfArea allInstanceOfArea = (AllInstanceOfArea) theEObject;
			T result = caseAllInstanceOfArea(allInstanceOfArea);
			if (result == null)
				result = caseSetExpression(allInstanceOfArea);
			if (result == null)
				result = caseExpression(allInstanceOfArea);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.ALL_INSTANCE_OF_VIEW_CONTENT: {
			AllInstanceOfViewContent allInstanceOfViewContent = (AllInstanceOfViewContent) theEObject;
			T result = caseAllInstanceOfViewContent(allInstanceOfViewContent);
			if (result == null)
				result = caseSetExpression(allInstanceOfViewContent);
			if (result == null)
				result = caseExpression(allInstanceOfViewContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.IS_DISPLAYED_ON: {
			IsDisplayedOn isDisplayedOn = (IsDisplayedOn) theEObject;
			T result = caseIsDisplayedOn(isDisplayedOn);
			if (result == null)
				result = caseViewContentOperator(isDisplayedOn);
			if (result == null)
				result = caseSugarExpressionBase(isDisplayedOn);
			if (result == null)
				result = caseContentOperator(isDisplayedOn);
			if (result == null)
				result = caseSugarExpression(isDisplayedOn);
			if (result == null)
				result = caseOperator(isDisplayedOn);
			if (result == null)
				result = caseExpression(isDisplayedOn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.IS_CHANGED_DISPLAY: {
			IsChangedDisplay isChangedDisplay = (IsChangedDisplay) theEObject;
			T result = caseIsChangedDisplay(isChangedDisplay);
			if (result == null)
				result = caseAreaOperator(isChangedDisplay);
			if (result == null)
				result = caseSugarExpressionBase(isChangedDisplay);
			if (result == null)
				result = caseAllocatableOperator(isChangedDisplay);
			if (result == null)
				result = caseSugarExpression(isChangedDisplay);
			if (result == null)
				result = caseOperator(isChangedDisplay);
			if (result == null)
				result = caseExpression(isChangedDisplay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.IS_TRANSLATED_VIEW_TO: {
			IsTranslatedViewTo isTranslatedViewTo = (IsTranslatedViewTo) theEObject;
			T result = caseIsTranslatedViewTo(isTranslatedViewTo);
			if (result == null)
				result = caseAreaOperator(isTranslatedViewTo);
			if (result == null)
				result = caseSugarExpressionBase(isTranslatedViewTo);
			if (result == null)
				result = caseAllocatableOperator(isTranslatedViewTo);
			if (result == null)
				result = caseSugarExpression(isTranslatedViewTo);
			if (result == null)
				result = caseOperator(isTranslatedViewTo);
			if (result == null)
				result = caseExpression(isTranslatedViewTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBAViewPackage.HIDE_LOWER_PRIORITY: {
			HideLowerPriority hideLowerPriority = (HideLowerPriority) theEObject;
			T result = caseHideLowerPriority(hideLowerPriority);
			if (result == null)
				result = caseOperator(hideLowerPriority);
			if (result == null)
				result = caseSugarExpressionBase(hideLowerPriority);
			if (result == null)
				result = caseExpression(hideLowerPriority);
			if (result == null)
				result = caseSugarExpression(hideLowerPriority);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Content</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewContent(ViewContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Content Set</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Content Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewContentSet(ViewContentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Content State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Content State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewContentState(ViewContentState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Manager</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutManager(LayoutManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aligned Layout</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aligned Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlignedLayout(AlignedLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Layout</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalLayout(VerticalLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalLayout(HorizontalLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Position Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Position Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedPositionLayout(FixedPositionLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionContainer(PositionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplay(Display object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Area</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeArea(CompositeArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArea(Area object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Set</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaSet(AreaSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Identifier</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizeIdentifier(SizeIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSize(Size object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Reference</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizeReference(SizeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffset(Offset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaOperator(AreaOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Displayed</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Displayed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsDisplayed(IsDisplayed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Displaying Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Displaying Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayingContent(DisplayingContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Hidden</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Hidden</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsHidden(IsHidden object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Content Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Content Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewContentOperator(ViewContentOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Visible</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Visible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsVisible(IsVisible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Instance Of Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Instance Of Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllInstanceOfArea(AllInstanceOfArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Instance Of View Content</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Instance Of View Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllInstanceOfViewContent(AllInstanceOfViewContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Displayed On</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Displayed On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsDisplayedOn(IsDisplayedOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Changed Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Changed Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsChangedDisplay(IsChangedDisplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Translated View To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Translated View To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsTranslatedViewTo(IsTranslatedViewTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hide Lower Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hide Lower Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHideLowerPriority(HideLowerPriority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packagable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packagable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackagableElement(PackagableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Object</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleObject(RuleObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Content</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractContent(AbstractContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContent(Content object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Set</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentSet(ContentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content State</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentState(ContentState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Allocatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Allocatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAllocatable(AbstractAllocatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocatable</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocatable(Allocatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocatable Set</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocatable Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocatableSet(AllocatableSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocatable Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocatable Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocatableOperator(AllocatableOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentOperator(ContentOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Expression</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetExpression(SetExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sugar Expression</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sugar Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSugarExpression(SugarExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sugar Expression Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sugar Expression Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSugarExpressionBase(SugarExpressionBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // RBAViewSwitch
