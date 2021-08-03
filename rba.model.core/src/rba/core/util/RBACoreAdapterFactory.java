/**
 */
package rba.core.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import rba.core.AbstractAllocatable;
import rba.core.AbstractConstraint;
import rba.core.AbstractContent;
import rba.core.AbstractProperty;
import rba.core.AbstractScene;
import rba.core.ActiveContents;
import rba.core.ActiveState;
import rba.core.Allocatable;
import rba.core.AllocatableOperator;
import rba.core.AllocatableSet;
import rba.core.AllocatedContent;
import rba.core.AndOperator;
import rba.core.ArbitrationPolicyExpression;
import rba.core.ArithmeticOperator;
import rba.core.ComparisonAnd;
import rba.core.ComparisonOperator;
import rba.core.ComplexExpression;
import rba.core.Constraint;
import rba.core.Content;
import rba.core.ContentOperator;
import rba.core.ContentSet;
import rba.core.ContentState;
import rba.core.ContentStateOperator;
import rba.core.ContentValue;
import rba.core.EnumExpression;
import rba.core.EqualToOperator;
import rba.core.ExistsOperator;
import rba.core.Expression;
import rba.core.ForAllOperator;
import rba.core.GetAllocatables;
import rba.core.GetContentsList;
import rba.core.GetProperty;
import rba.core.GetState;
import rba.core.GreaterThanOperator;
import rba.core.HasBeenDisplayed;
import rba.core.HasComeEarlierThan;
import rba.core.HasComeLaterThan;
import rba.core.IfStatement;
import rba.core.ImpliesOperator;
import rba.core.IntegerProperty;
import rba.core.IntegerValue;
import rba.core.IsActive;
import rba.core.IsAllocatedTo;
import rba.core.IsChanged;
import rba.core.IsEqualToOperator;
import rba.core.IsGreaterThanEqualOperator;
import rba.core.IsGreaterThanOperator;
import rba.core.IsLowerThanEqualOperator;
import rba.core.IsLowerThanOperator;
import rba.core.IsOn;
import rba.core.IsTranslatedTo;
import rba.core.IsTypeOf;
import rba.core.LambdaContext;
import rba.core.LambdaExpression;
import rba.core.LetStatement;
import rba.core.LogicalOperator;
import rba.core.LoserTypeExpression;
import rba.core.LowerThanOperator;
import rba.core.MaxOperator;
import rba.core.MaxValue;
import rba.core.MinOperator;
import rba.core.MinValue;
import rba.core.ModelElement;
import rba.core.MuchGreaterThanOperator;
import rba.core.NamedElement;
import rba.core.NoneValue;
import rba.core.NotOperator;
import rba.core.NullExpression;
import rba.core.ObjectCompare;
import rba.core.ObjectCompareNot;
import rba.core.ObjectReference;
import rba.core.Operator;
import rba.core.OrOperator;
import rba.core.PackagableElement;
import rba.core.PlusOperator;
import rba.core.PreviousModifier;
import rba.core.Project;
import rba.core.PropertyOperator;
import rba.core.RBACorePackage;
import rba.core.RuleObject;
import rba.core.Scene;
import rba.core.SceneOperator;
import rba.core.SelectOperator;
import rba.core.SetExpression;
import rba.core.SetOfOperator;
import rba.core.SetOperator;
import rba.core.SizeOperator;
import rba.core.StandardValue;
import rba.core.StateValue;
import rba.core.Stereotype;
import rba.core.SugarExpression;
import rba.core.SugarExpressionBase;
import rba.core.Tag;
import rba.core.ThatOfOperator;
import rba.core.ValueExpression;
import rba.core.Variable;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code> method for
 * each class of the model. <!-- end-user-doc -->
 * @see rba.core.RBACorePackage
 * @generated
 */
public class RBACoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static RBACorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBACoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RBACorePackage.eINSTANCE;
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
	protected RBACoreSwitch<Adapter> modelSwitch = new RBACoreSwitch<Adapter>() {
		@Override
		public Adapter caseModelElement(ModelElement object) {
			return createModelElementAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
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
		public Adapter caseProject(Project object) {
			return createProjectAdapter();
		}

		@Override
		public Adapter casePackagableElement(PackagableElement object) {
			return createPackagableElementAdapter();
		}

		@Override
		public Adapter casePackage(rba.core.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter caseStereotype(Stereotype object) {
			return createStereotypeAdapter();
		}

		@Override
		public Adapter caseTag(Tag object) {
			return createTagAdapter();
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
		public Adapter caseAbstractScene(AbstractScene object) {
			return createAbstractSceneAdapter();
		}

		@Override
		public Adapter caseScene(Scene object) {
			return createSceneAdapter();
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
		public Adapter caseAbstractProperty(AbstractProperty object) {
			return createAbstractPropertyAdapter();
		}

		@Override
		public Adapter caseIntegerProperty(IntegerProperty object) {
			return createIntegerPropertyAdapter();
		}

		@Override
		public Adapter caseAbstractConstraint(AbstractConstraint object) {
			return createAbstractConstraintAdapter();
		}

		@Override
		public Adapter caseConstraint(Constraint object) {
			return createConstraintAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseLetStatement(LetStatement object) {
			return createLetStatementAdapter();
		}

		@Override
		public Adapter caseComplexExpression(ComplexExpression object) {
			return createComplexExpressionAdapter();
		}

		@Override
		public Adapter caseOperator(Operator object) {
			return createOperatorAdapter();
		}

		@Override
		public Adapter caseIsTypeOf(IsTypeOf object) {
			return createIsTypeOfAdapter();
		}

		@Override
		public Adapter caseObjectReference(ObjectReference object) {
			return createObjectReferenceAdapter();
		}

		@Override
		public Adapter casePreviousModifier(PreviousModifier object) {
			return createPreviousModifierAdapter();
		}

		@Override
		public Adapter caseGreaterThanOperator(GreaterThanOperator object) {
			return createGreaterThanOperatorAdapter();
		}

		@Override
		public Adapter caseMuchGreaterThanOperator(MuchGreaterThanOperator object) {
			return createMuchGreaterThanOperatorAdapter();
		}

		@Override
		public Adapter caseLowerThanOperator(LowerThanOperator object) {
			return createLowerThanOperatorAdapter();
		}

		@Override
		public Adapter caseComparisonOperator(ComparisonOperator object) {
			return createComparisonOperatorAdapter();
		}

		@Override
		public Adapter caseEqualToOperator(EqualToOperator object) {
			return createEqualToOperatorAdapter();
		}

		@Override
		public Adapter caseComparisonAnd(ComparisonAnd object) {
			return createComparisonAndAdapter();
		}

		@Override
		public Adapter caseLogicalOperator(LogicalOperator object) {
			return createLogicalOperatorAdapter();
		}

		@Override
		public Adapter caseAndOperator(AndOperator object) {
			return createAndOperatorAdapter();
		}

		@Override
		public Adapter caseOrOperator(OrOperator object) {
			return createOrOperatorAdapter();
		}

		@Override
		public Adapter caseNotOperator(NotOperator object) {
			return createNotOperatorAdapter();
		}

		@Override
		public Adapter caseIsEqualToOperator(IsEqualToOperator object) {
			return createIsEqualToOperatorAdapter();
		}

		@Override
		public Adapter caseIsGreaterThanOperator(IsGreaterThanOperator object) {
			return createIsGreaterThanOperatorAdapter();
		}

		@Override
		public Adapter caseIsLowerThanOperator(IsLowerThanOperator object) {
			return createIsLowerThanOperatorAdapter();
		}

		@Override
		public Adapter caseIsGreaterThanEqualOperator(IsGreaterThanEqualOperator object) {
			return createIsGreaterThanEqualOperatorAdapter();
		}

		@Override
		public Adapter caseIsLowerThanEqualOperator(IsLowerThanEqualOperator object) {
			return createIsLowerThanEqualOperatorAdapter();
		}

		@Override
		public Adapter caseArithmeticOperator(ArithmeticOperator object) {
			return createArithmeticOperatorAdapter();
		}

		@Override
		public Adapter casePlusOperator(PlusOperator object) {
			return createPlusOperatorAdapter();
		}

		@Override
		public Adapter caseImpliesOperator(ImpliesOperator object) {
			return createImpliesOperatorAdapter();
		}

		@Override
		public Adapter caseContentOperator(ContentOperator object) {
			return createContentOperatorAdapter();
		}

		@Override
		public Adapter caseIsActive(IsActive object) {
			return createIsActiveAdapter();
		}

		@Override
		public Adapter caseGetAllocatables(GetAllocatables object) {
			return createGetAllocatablesAdapter();
		}

		@Override
		public Adapter caseHasBeenDisplayed(HasBeenDisplayed object) {
			return createHasBeenDisplayedAdapter();
		}

		@Override
		public Adapter caseActiveState(ActiveState object) {
			return createActiveStateAdapter();
		}

		@Override
		public Adapter caseObjectCompare(ObjectCompare object) {
			return createObjectCompareAdapter();
		}

		@Override
		public Adapter caseThatOfOperator(ThatOfOperator object) {
			return createThatOfOperatorAdapter();
		}

		@Override
		public Adapter caseValueExpression(ValueExpression object) {
			return createValueExpressionAdapter();
		}

		@Override
		public Adapter caseMaxValue(MaxValue object) {
			return createMaxValueAdapter();
		}

		@Override
		public Adapter caseMinValue(MinValue object) {
			return createMinValueAdapter();
		}

		@Override
		public Adapter caseNoneValue(NoneValue object) {
			return createNoneValueAdapter();
		}

		@Override
		public Adapter caseStandardValue(StandardValue object) {
			return createStandardValueAdapter();
		}

		@Override
		public Adapter caseIntegerValue(IntegerValue object) {
			return createIntegerValueAdapter();
		}

		@Override
		public Adapter caseEnumExpression(EnumExpression object) {
			return createEnumExpressionAdapter();
		}

		@Override
		public Adapter caseLoserTypeExpression(LoserTypeExpression object) {
			return createLoserTypeExpressionAdapter();
		}

		@Override
		public Adapter caseArbitrationPolicyExpression(ArbitrationPolicyExpression object) {
			return createArbitrationPolicyExpressionAdapter();
		}

		@Override
		public Adapter caseSetExpression(SetExpression object) {
			return createSetExpressionAdapter();
		}

		@Override
		public Adapter caseSetOperator(SetOperator object) {
			return createSetOperatorAdapter();
		}

		@Override
		public Adapter caseSizeOperator(SizeOperator object) {
			return createSizeOperatorAdapter();
		}

		@Override
		public Adapter caseExistsOperator(ExistsOperator object) {
			return createExistsOperatorAdapter();
		}

		@Override
		public Adapter caseForAllOperator(ForAllOperator object) {
			return createForAllOperatorAdapter();
		}

		@Override
		public Adapter caseMaxOperator(MaxOperator object) {
			return createMaxOperatorAdapter();
		}

		@Override
		public Adapter caseMinOperator(MinOperator object) {
			return createMinOperatorAdapter();
		}

		@Override
		public Adapter caseSelectOperator(SelectOperator object) {
			return createSelectOperatorAdapter();
		}

		@Override
		public Adapter caseSetOfOperator(SetOfOperator object) {
			return createSetOfOperatorAdapter();
		}

		@Override
		public Adapter caseLambdaExpression(LambdaExpression object) {
			return createLambdaExpressionAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseLambdaContext(LambdaContext object) {
			return createLambdaContextAdapter();
		}

		@Override
		public Adapter caseIfStatement(IfStatement object) {
			return createIfStatementAdapter();
		}

		@Override
		public Adapter caseSceneOperator(SceneOperator object) {
			return createSceneOperatorAdapter();
		}

		@Override
		public Adapter caseIsOn(IsOn object) {
			return createIsOnAdapter();
		}

		@Override
		public Adapter caseAllocatableOperator(AllocatableOperator object) {
			return createAllocatableOperatorAdapter();
		}

		@Override
		public Adapter caseAllocatedContent(AllocatedContent object) {
			return createAllocatedContentAdapter();
		}

		@Override
		public Adapter caseContentValue(ContentValue object) {
			return createContentValueAdapter();
		}

		@Override
		public Adapter caseGetContentsList(GetContentsList object) {
			return createGetContentsListAdapter();
		}

		@Override
		public Adapter caseActiveContents(ActiveContents object) {
			return createActiveContentsAdapter();
		}

		@Override
		public Adapter casePropertyOperator(PropertyOperator object) {
			return createPropertyOperatorAdapter();
		}

		@Override
		public Adapter caseGetProperty(GetProperty object) {
			return createGetPropertyAdapter();
		}

		@Override
		public Adapter caseStateValue(StateValue object) {
			return createStateValueAdapter();
		}

		@Override
		public Adapter caseHasComeLaterThan(HasComeLaterThan object) {
			return createHasComeLaterThanAdapter();
		}

		@Override
		public Adapter caseHasComeEarlierThan(HasComeEarlierThan object) {
			return createHasComeEarlierThanAdapter();
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
		public Adapter caseObjectCompareNot(ObjectCompareNot object) {
			return createObjectCompareNotAdapter();
		}

		@Override
		public Adapter caseIsAllocatedTo(IsAllocatedTo object) {
			return createIsAllocatedToAdapter();
		}

		@Override
		public Adapter caseIsChanged(IsChanged object) {
			return createIsChangedAdapter();
		}

		@Override
		public Adapter caseIsTranslatedTo(IsTranslatedTo object) {
			return createIsTranslatedToAdapter();
		}

		@Override
		public Adapter caseGetState(GetState object) {
			return createGetStateAdapter();
		}

		@Override
		public Adapter caseContentStateOperator(ContentStateOperator object) {
			return createContentStateOperatorAdapter();
		}

		@Override
		public Adapter caseNullExpression(NullExpression object) {
			return createNullExpressionAdapter();
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
	 * Creates a new adapter for an object of class '{@link rba.core.Project <em>Project</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
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
	 * Creates a new adapter for an object of class '{@link rba.core.Package <em>Package</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.Stereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.Stereotype
	 * @generated
	 */
	public Adapter createStereotypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
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
	 * Creates a new adapter for an object of class '{@link rba.core.AbstractScene <em>Abstract Scene</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.AbstractScene
	 * @generated
	 */
	public Adapter createAbstractSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.Scene
	 * @generated
	 */
	public Adapter createSceneAdapter() {
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
	 * Creates a new adapter for an object of class '{@link rba.core.AbstractProperty <em>Abstract Property</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.AbstractProperty
	 * @generated
	 */
	public Adapter createAbstractPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.IntegerProperty <em>Integer Property</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IntegerProperty
	 * @generated
	 */
	public Adapter createIntegerPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.AbstractConstraint <em>Abstract Constraint</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.AbstractConstraint
	 * @generated
	 */
	public Adapter createAbstractConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
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
	 * Creates a new adapter for an object of class '{@link rba.core.LetStatement <em>Let Statement</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.LetStatement
	 * @generated
	 */
	public Adapter createLetStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ComplexExpression <em>Complex Expression</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ComplexExpression
	 * @generated
	 */
	public Adapter createComplexExpressionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link rba.core.IsTypeOf <em>Is Type Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IsTypeOf
	 * @generated
	 */
	public Adapter createIsTypeOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ObjectReference <em>Object Reference</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ObjectReference
	 * @generated
	 */
	public Adapter createObjectReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.PreviousModifier <em>Previous Modifier</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.PreviousModifier
	 * @generated
	 */
	public Adapter createPreviousModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.GreaterThanOperator <em>Greater Than Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.GreaterThanOperator
	 * @generated
	 */
	public Adapter createGreaterThanOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.MuchGreaterThanOperator <em>Much Greater Than Operator</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.MuchGreaterThanOperator
	 * @generated
	 */
	public Adapter createMuchGreaterThanOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.LowerThanOperator <em>Lower Than Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.LowerThanOperator
	 * @generated
	 */
	public Adapter createLowerThanOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ComparisonOperator <em>Comparison Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ComparisonOperator
	 * @generated
	 */
	public Adapter createComparisonOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.EqualToOperator <em>Equal To Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.EqualToOperator
	 * @generated
	 */
	public Adapter createEqualToOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ComparisonAnd <em>Comparison And</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ComparisonAnd
	 * @generated
	 */
	public Adapter createComparisonAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.LogicalOperator <em>Logical Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.LogicalOperator
	 * @generated
	 */
	public Adapter createLogicalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.AndOperator <em>And Operator</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.AndOperator
	 * @generated
	 */
	public Adapter createAndOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.OrOperator <em>Or Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.OrOperator
	 * @generated
	 */
	public Adapter createOrOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.NotOperator <em>Not Operator</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.NotOperator
	 * @generated
	 */
	public Adapter createNotOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.IsEqualToOperator <em>Is Equal To Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IsEqualToOperator
	 * @generated
	 */
	public Adapter createIsEqualToOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.IsGreaterThanOperator <em>Is Greater Than Operator</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IsGreaterThanOperator
	 * @generated
	 */
	public Adapter createIsGreaterThanOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.IsLowerThanOperator <em>Is Lower Than Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IsLowerThanOperator
	 * @generated
	 */
	public Adapter createIsLowerThanOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.IsGreaterThanEqualOperator <em>Is Greater Than Equal Operator</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IsGreaterThanEqualOperator
	 * @generated
	 */
	public Adapter createIsGreaterThanEqualOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.IsLowerThanEqualOperator <em>Is Lower Than Equal Operator</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IsLowerThanEqualOperator
	 * @generated
	 */
	public Adapter createIsLowerThanEqualOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ArithmeticOperator <em>Arithmetic Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ArithmeticOperator
	 * @generated
	 */
	public Adapter createArithmeticOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.PlusOperator <em>Plus Operator</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.PlusOperator
	 * @generated
	 */
	public Adapter createPlusOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ImpliesOperator <em>Implies Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ImpliesOperator
	 * @generated
	 */
	public Adapter createImpliesOperatorAdapter() {
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
	 * Creates a new adapter for an object of class '{@link rba.core.IsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IsActive
	 * @generated
	 */
	public Adapter createIsActiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.GetAllocatables <em>Get Allocatables</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.GetAllocatables
	 * @generated
	 */
	public Adapter createGetAllocatablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.HasBeenDisplayed <em>Has Been Displayed</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.HasBeenDisplayed
	 * @generated
	 */
	public Adapter createHasBeenDisplayedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ActiveState <em>Active State</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ActiveState
	 * @generated
	 */
	public Adapter createActiveStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ObjectCompare <em>Object Compare</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ObjectCompare
	 * @generated
	 */
	public Adapter createObjectCompareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ThatOfOperator <em>That Of Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ThatOfOperator
	 * @generated
	 */
	public Adapter createThatOfOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ValueExpression <em>Value Expression</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ValueExpression
	 * @generated
	 */
	public Adapter createValueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.MaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.MaxValue
	 * @generated
	 */
	public Adapter createMaxValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.MinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.MinValue
	 * @generated
	 */
	public Adapter createMinValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.NoneValue <em>None Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.NoneValue
	 * @generated
	 */
	public Adapter createNoneValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.StandardValue <em>Standard Value</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.StandardValue
	 * @generated
	 */
	public Adapter createStandardValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.EnumExpression <em>Enum Expression</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.EnumExpression
	 * @generated
	 */
	public Adapter createEnumExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.LoserTypeExpression <em>Loser Type Expression</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.LoserTypeExpression
	 * @generated
	 */
	public Adapter createLoserTypeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ArbitrationPolicyExpression <em>Arbitration Policy Expression</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ArbitrationPolicyExpression
	 * @generated
	 */
	public Adapter createArbitrationPolicyExpressionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link rba.core.SetOperator <em>Set Operator</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.SetOperator
	 * @generated
	 */
	public Adapter createSetOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.SizeOperator <em>Size Operator</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.SizeOperator
	 * @generated
	 */
	public Adapter createSizeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ExistsOperator <em>Exists Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ExistsOperator
	 * @generated
	 */
	public Adapter createExistsOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ForAllOperator <em>For All Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ForAllOperator
	 * @generated
	 */
	public Adapter createForAllOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.MaxOperator <em>Max Operator</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.MaxOperator
	 * @generated
	 */
	public Adapter createMaxOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.MinOperator <em>Min Operator</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.MinOperator
	 * @generated
	 */
	public Adapter createMinOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.SelectOperator <em>Select Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.SelectOperator
	 * @generated
	 */
	public Adapter createSelectOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.SetOfOperator <em>Set Of Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.SetOfOperator
	 * @generated
	 */
	public Adapter createSetOfOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.LambdaExpression <em>Lambda Expression</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.LambdaExpression
	 * @generated
	 */
	public Adapter createLambdaExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.LambdaContext <em>Lambda Context</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.LambdaContext
	 * @generated
	 */
	public Adapter createLambdaContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.SceneOperator <em>Scene Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.SceneOperator
	 * @generated
	 */
	public Adapter createSceneOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.IsOn <em>Is On</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IsOn
	 * @generated
	 */
	public Adapter createIsOnAdapter() {
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
	 * Creates a new adapter for an object of class '{@link rba.core.AllocatedContent <em>Allocated Content</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.AllocatedContent
	 * @generated
	 */
	public Adapter createAllocatedContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ContentValue <em>Content Value</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ContentValue
	 * @generated
	 */
	public Adapter createContentValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.GetContentsList <em>Get Contents List</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.GetContentsList
	 * @generated
	 */
	public Adapter createGetContentsListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ActiveContents <em>Active Contents</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ActiveContents
	 * @generated
	 */
	public Adapter createActiveContentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.PropertyOperator <em>Property Operator</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.PropertyOperator
	 * @generated
	 */
	public Adapter createPropertyOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.GetProperty <em>Get Property</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.GetProperty
	 * @generated
	 */
	public Adapter createGetPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.StateValue <em>State Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.StateValue
	 * @generated
	 */
	public Adapter createStateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.HasComeLaterThan <em>Has Come Later Than</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.HasComeLaterThan
	 * @generated
	 */
	public Adapter createHasComeLaterThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.HasComeEarlierThan <em>Has Come Earlier Than</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.HasComeEarlierThan
	 * @generated
	 */
	public Adapter createHasComeEarlierThanAdapter() {
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
	 * Creates a new adapter for an object of class '{@link rba.core.ObjectCompareNot <em>Object Compare Not</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ObjectCompareNot
	 * @generated
	 */
	public Adapter createObjectCompareNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.IsAllocatedTo <em>Is Allocated To</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IsAllocatedTo
	 * @generated
	 */
	public Adapter createIsAllocatedToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.IsChanged <em>Is Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IsChanged
	 * @generated
	 */
	public Adapter createIsChangedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.IsTranslatedTo <em>Is Translated To</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.IsTranslatedTo
	 * @generated
	 */
	public Adapter createIsTranslatedToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.GetState <em>Get State</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.GetState
	 * @generated
	 */
	public Adapter createGetStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.ContentStateOperator <em>Content State Operator</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.ContentStateOperator
	 * @generated
	 */
	public Adapter createContentStateOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.core.NullExpression <em>Null Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.core.NullExpression
	 * @generated
	 */
	public Adapter createNullExpressionAdapter() {
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

} // RBACoreAdapterFactory
