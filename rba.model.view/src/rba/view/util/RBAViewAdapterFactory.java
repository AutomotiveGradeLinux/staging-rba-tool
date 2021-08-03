/**
 */
package rba.view.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code> method for
 * each class of the model. <!-- end-user-doc -->
 * @see rba.view.RBAViewPackage
 * @generated
 */
public class RBAViewAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static RBAViewPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBAViewAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RBAViewPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation
	 * returns <code>true</code> if the object is either the model's package or is an instance object of the model. <!--
	 * end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RBAViewSwitch<Adapter> modelSwitch = new RBAViewSwitch<Adapter>() {
		@Override
		public Adapter caseViewContent(ViewContent object) {
			return createViewContentAdapter();
		}

		@Override
		public Adapter caseViewContentSet(ViewContentSet object) {
			return createViewContentSetAdapter();
		}

		@Override
		public Adapter caseViewContentState(ViewContentState object) {
			return createViewContentStateAdapter();
		}

		@Override
		public Adapter caseLayoutManager(LayoutManager object) {
			return createLayoutManagerAdapter();
		}

		@Override
		public Adapter caseAlignedLayout(AlignedLayout object) {
			return createAlignedLayoutAdapter();
		}

		@Override
		public Adapter caseVerticalLayout(VerticalLayout object) {
			return createVerticalLayoutAdapter();
		}

		@Override
		public Adapter caseHorizontalLayout(HorizontalLayout object) {
			return createHorizontalLayoutAdapter();
		}

		@Override
		public Adapter caseFixedPositionLayout(FixedPositionLayout object) {
			return createFixedPositionLayoutAdapter();
		}

		@Override
		public Adapter casePositionContainer(PositionContainer object) {
			return createPositionContainerAdapter();
		}

		@Override
		public Adapter caseDisplay(Display object) {
			return createDisplayAdapter();
		}

		@Override
		public Adapter caseCompositeArea(CompositeArea object) {
			return createCompositeAreaAdapter();
		}

		@Override
		public Adapter caseArea(Area object) {
			return createAreaAdapter();
		}

		@Override
		public Adapter caseAreaSet(AreaSet object) {
			return createAreaSetAdapter();
		}

		@Override
		public Adapter caseSizeIdentifier(SizeIdentifier object) {
			return createSizeIdentifierAdapter();
		}

		@Override
		public Adapter caseSize(Size object) {
			return createSizeAdapter();
		}

		@Override
		public Adapter caseSizeReference(SizeReference object) {
			return createSizeReferenceAdapter();
		}

		@Override
		public Adapter caseOffset(Offset object) {
			return createOffsetAdapter();
		}

		@Override
		public Adapter caseAreaOperator(AreaOperator object) {
			return createAreaOperatorAdapter();
		}

		@Override
		public Adapter caseIsDisplayed(IsDisplayed object) {
			return createIsDisplayedAdapter();
		}

		@Override
		public Adapter caseDisplayingContent(DisplayingContent object) {
			return createDisplayingContentAdapter();
		}

		@Override
		public Adapter caseIsHidden(IsHidden object) {
			return createIsHiddenAdapter();
		}

		@Override
		public Adapter caseViewContentOperator(ViewContentOperator object) {
			return createViewContentOperatorAdapter();
		}

		@Override
		public Adapter caseIsVisible(IsVisible object) {
			return createIsVisibleAdapter();
		}

		@Override
		public Adapter caseAllInstanceOfArea(AllInstanceOfArea object) {
			return createAllInstanceOfAreaAdapter();
		}

		@Override
		public Adapter caseAllInstanceOfViewContent(AllInstanceOfViewContent object) {
			return createAllInstanceOfViewContentAdapter();
		}

		@Override
		public Adapter caseIsDisplayedOn(IsDisplayedOn object) {
			return createIsDisplayedOnAdapter();
		}

		@Override
		public Adapter caseIsChangedDisplay(IsChangedDisplay object) {
			return createIsChangedDisplayAdapter();
		}

		@Override
		public Adapter caseIsTranslatedViewTo(IsTranslatedViewTo object) {
			return createIsTranslatedViewToAdapter();
		}

		@Override
		public Adapter caseHideLowerPriority(HideLowerPriority object) {
			return createHideLowerPriorityAdapter();
		}

		@Override
		public Adapter caseModelElement(ModelElement object) {
			return createModelElementAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter casePackagableElement(PackagableElement object) {
			return createPackagableElementAdapter();
		}

		@Override
		public Adapter caseRuleObject(RuleObject object) {
			return createRuleObjectAdapter();
		}

		@Override
		public Adapter caseAbstractContent(AbstractContent object) {
			return createAbstractContentAdapter();
		}

		@Override
		public Adapter caseContent(Content object) {
			return createContentAdapter();
		}

		@Override
		public Adapter caseContentSet(ContentSet object) {
			return createContentSetAdapter();
		}

		@Override
		public Adapter caseContentState(ContentState object) {
			return createContentStateAdapter();
		}

		@Override
		public Adapter caseAbstractAllocatable(AbstractAllocatable object) {
			return createAbstractAllocatableAdapter();
		}

		@Override
		public Adapter caseAllocatable(Allocatable object) {
			return createAllocatableAdapter();
		}

		@Override
		public Adapter caseAllocatableSet(AllocatableSet object) {
			return createAllocatableSetAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseOperator(Operator object) {
			return createOperatorAdapter();
		}

		@Override
		public Adapter caseAllocatableOperator(AllocatableOperator object) {
			return createAllocatableOperatorAdapter();
		}

		@Override
		public Adapter caseContentOperator(ContentOperator object) {
			return createContentOperatorAdapter();
		}

		@Override
		public Adapter caseSetExpression(SetExpression object) {
			return createSetExpressionAdapter();
		}

		@Override
		public Adapter caseSugarExpression(SugarExpression object) {
			return createSugarExpressionAdapter();
		}

		@Override
		public Adapter caseSugarExpressionBase(SugarExpressionBase object) {
			return createSugarExpressionBaseAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.ViewContent <em>View Content</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.ViewContent
	 * @generated
	 */
	public Adapter createViewContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.ViewContentSet <em>View Content Set</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.ViewContentSet
	 * @generated
	 */
	public Adapter createViewContentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.ViewContentState <em>View Content State</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.ViewContentState
	 * @generated
	 */
	public Adapter createViewContentStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.LayoutManager <em>Layout Manager</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.LayoutManager
	 * @generated
	 */
	public Adapter createLayoutManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.AlignedLayout <em>Aligned Layout</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.AlignedLayout
	 * @generated
	 */
	public Adapter createAlignedLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.VerticalLayout <em>Vertical Layout</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.VerticalLayout
	 * @generated
	 */
	public Adapter createVerticalLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.HorizontalLayout <em>Horizontal Layout</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.HorizontalLayout
	 * @generated
	 */
	public Adapter createHorizontalLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.FixedPositionLayout <em>Fixed Position Layout</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.FixedPositionLayout
	 * @generated
	 */
	public Adapter createFixedPositionLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.PositionContainer <em>Position Container</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.PositionContainer
	 * @generated
	 */
	public Adapter createPositionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.Display <em>Display</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.Display
	 * @generated
	 */
	public Adapter createDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.CompositeArea <em>Composite Area</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.CompositeArea
	 * @generated
	 */
	public Adapter createCompositeAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.Area <em>Area</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.Area
	 * @generated
	 */
	public Adapter createAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.AreaSet <em>Area Set</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.AreaSet
	 * @generated
	 */
	public Adapter createAreaSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.SizeIdentifier <em>Size Identifier</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.SizeIdentifier
	 * @generated
	 */
	public Adapter createSizeIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.Size <em>Size</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.Size
	 * @generated
	 */
	public Adapter createSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.SizeReference <em>Size Reference</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.SizeReference
	 * @generated
	 */
	public Adapter createSizeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.Offset
	 * @generated
	 */
	public Adapter createOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.AreaOperator <em>Area Operator</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.AreaOperator
	 * @generated
	 */
	public Adapter createAreaOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.IsDisplayed <em>Is Displayed</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.IsDisplayed
	 * @generated
	 */
	public Adapter createIsDisplayedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.DisplayingContent <em>Displaying Content</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.DisplayingContent
	 * @generated
	 */
	public Adapter createDisplayingContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.IsHidden <em>Is Hidden</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.IsHidden
	 * @generated
	 */
	public Adapter createIsHiddenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.ViewContentOperator <em>View Content Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.ViewContentOperator
	 * @generated
	 */
	public Adapter createViewContentOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.IsVisible <em>Is Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.IsVisible
	 * @generated
	 */
	public Adapter createIsVisibleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.AllInstanceOfArea <em>All Instance Of Area</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.AllInstanceOfArea
	 * @generated
	 */
	public Adapter createAllInstanceOfAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.AllInstanceOfViewContent <em>All Instance Of View Content</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.AllInstanceOfViewContent
	 * @generated
	 */
	public Adapter createAllInstanceOfViewContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.IsDisplayedOn <em>Is Displayed On</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.IsDisplayedOn
	 * @generated
	 */
	public Adapter createIsDisplayedOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.IsChangedDisplay <em>Is Changed Display</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.IsChangedDisplay
	 * @generated
	 */
	public Adapter createIsChangedDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.IsTranslatedViewTo <em>Is Translated View To</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.IsTranslatedViewTo
	 * @generated
	 */
	public Adapter createIsTranslatedViewToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.view.HideLowerPriority <em>Hide Lower Priority</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.view.HideLowerPriority
	 * @generated
	 */
	public Adapter createHideLowerPriorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.PackagableElement <em>Packagable Element</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.PackagableElement
	 * @generated
	 */
	public Adapter createPackagableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.RuleObject <em>Rule Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.RuleObject
	 * @generated
	 */
	public Adapter createRuleObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.AbstractContent <em>Abstract Content</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.AbstractContent
	 * @generated
	 */
	public Adapter createAbstractContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.Content <em>Content</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.Content
	 * @generated
	 */
	public Adapter createContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ContentSet <em>Content Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ContentSet
	 * @generated
	 */
	public Adapter createContentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ContentState <em>Content State</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ContentState
	 * @generated
	 */
	public Adapter createContentStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.AbstractAllocatable <em>Abstract Allocatable</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.AbstractAllocatable
	 * @generated
	 */
	public Adapter createAbstractAllocatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.Allocatable <em>Allocatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.Allocatable
	 * @generated
	 */
	public Adapter createAllocatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.AllocatableSet <em>Allocatable Set</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.AllocatableSet
	 * @generated
	 */
	public Adapter createAllocatableSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.AllocatableOperator <em>Allocatable Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.AllocatableOperator
	 * @generated
	 */
	public Adapter createAllocatableOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ContentOperator <em>Content Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ContentOperator
	 * @generated
	 */
	public Adapter createContentOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.SetExpression <em>Set Expression</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.SetExpression
	 * @generated
	 */
	public Adapter createSetExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.SugarExpression <em>Sugar Expression</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.SugarExpression
	 * @generated
	 */
	public Adapter createSugarExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.SugarExpressionBase <em>Sugar Expression Base</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.SugarExpressionBase
	 * @generated
	 */
	public Adapter createSugarExpressionBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This default implementation returns null. <!--
	 * end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // RBAViewAdapterFactory
