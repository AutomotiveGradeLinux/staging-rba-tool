/**
 */
package rba.sound.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rba.core.AbstractAllocatable;
import rba.core.AbstractContent;
import rba.core.Allocatable;
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
import rba.sound.*;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code> method for
 * each class of the model. <!-- end-user-doc -->
 * @see rba.sound.RBASoundPackage
 * @generated
 */
public class RBASoundAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static RBASoundPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBASoundAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RBASoundPackage.eINSTANCE;
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
	protected RBASoundSwitch<Adapter> modelSwitch = new RBASoundSwitch<Adapter>() {
		@Override
		public Adapter caseSoundContent(SoundContent object) {
			return createSoundContentAdapter();
		}

		@Override
		public Adapter caseSoundContentSet(SoundContentSet object) {
			return createSoundContentSetAdapter();
		}

		@Override
		public Adapter caseSoundContentState(SoundContentState object) {
			return createSoundContentStateAdapter();
		}

		@Override
		public Adapter caseZone(Zone object) {
			return createZoneAdapter();
		}

		@Override
		public Adapter caseZoneSet(ZoneSet object) {
			return createZoneSetAdapter();
		}

		@Override
		public Adapter caseSoundContentOperator(SoundContentOperator object) {
			return createSoundContentOperatorAdapter();
		}

		@Override
		public Adapter caseIsSounding(IsSounding object) {
			return createIsSoundingAdapter();
		}

		@Override
		public Adapter caseZoneOperator(ZoneOperator object) {
			return createZoneOperatorAdapter();
		}

		@Override
		public Adapter caseIsOutputted(IsOutputted object) {
			return createIsOutputtedAdapter();
		}

		@Override
		public Adapter caseIsMuted(IsMuted object) {
			return createIsMutedAdapter();
		}

		@Override
		public Adapter caseIsAttenuated(IsAttenuated object) {
			return createIsAttenuatedAdapter();
		}

		@Override
		public Adapter caseOutputtingSound(OutputtingSound object) {
			return createOutputtingSoundAdapter();
		}

		@Override
		public Adapter caseAllInstanceOfZone(AllInstanceOfZone object) {
			return createAllInstanceOfZoneAdapter();
		}

		@Override
		public Adapter caseAllInstanceOfSoundContent(AllInstanceOfSoundContent object) {
			return createAllInstanceOfSoundContentAdapter();
		}

		@Override
		public Adapter caseIsOutputtedOn(IsOutputtedOn object) {
			return createIsOutputtedOnAdapter();
		}

		@Override
		public Adapter caseIsChangedOutput(IsChangedOutput object) {
			return createIsChangedOutputAdapter();
		}

		@Override
		public Adapter caseIsTranslatedSoundTo(IsTranslatedSoundTo object) {
			return createIsTranslatedSoundToAdapter();
		}

		@Override
		public Adapter caseMuteLowerPriority(MuteLowerPriority object) {
			return createMuteLowerPriorityAdapter();
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
	 * Creates a new adapter for an object of class '{@link rba.sound.SoundContent <em>Sound Content</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.SoundContent
	 * @generated
	 */
	public Adapter createSoundContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.SoundContentSet <em>Sound Content Set</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.SoundContentSet
	 * @generated
	 */
	public Adapter createSoundContentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.SoundContentState <em>Sound Content State</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.SoundContentState
	 * @generated
	 */
	public Adapter createSoundContentStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.Zone
	 * @generated
	 */
	public Adapter createZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.ZoneSet <em>Zone Set</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.ZoneSet
	 * @generated
	 */
	public Adapter createZoneSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.SoundContentOperator <em>Sound Content Operator</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.SoundContentOperator
	 * @generated
	 */
	public Adapter createSoundContentOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.IsSounding <em>Is Sounding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.IsSounding
	 * @generated
	 */
	public Adapter createIsSoundingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.ZoneOperator <em>Zone Operator</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.ZoneOperator
	 * @generated
	 */
	public Adapter createZoneOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.IsOutputted <em>Is Outputted</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.IsOutputted
	 * @generated
	 */
	public Adapter createIsOutputtedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.IsMuted <em>Is Muted</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.IsMuted
	 * @generated
	 */
	public Adapter createIsMutedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.IsAttenuated <em>Is Attenuated</em>}'.
	 * <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.IsAttenuated
	 * @generated
	 */
	public Adapter createIsAttenuatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.OutputtingSound <em>Outputting Sound</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.OutputtingSound
	 * @generated
	 */
	public Adapter createOutputtingSoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.AllInstanceOfZone <em>All Instance Of Zone</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.AllInstanceOfZone
	 * @generated
	 */
	public Adapter createAllInstanceOfZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.AllInstanceOfSoundContent <em>All Instance Of Sound Content</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.AllInstanceOfSoundContent
	 * @generated
	 */
	public Adapter createAllInstanceOfSoundContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.IsOutputtedOn <em>Is Outputted On</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.IsOutputtedOn
	 * @generated
	 */
	public Adapter createIsOutputtedOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.IsChangedOutput <em>Is Changed Output</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.IsChangedOutput
	 * @generated
	 */
	public Adapter createIsChangedOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.IsTranslatedSoundTo <em>Is Translated Sound To</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.IsTranslatedSoundTo
	 * @generated
	 */
	public Adapter createIsTranslatedSoundToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rba.sound.MuteLowerPriority <em>Mute Lower Priority</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rba.sound.MuteLowerPriority
	 * @generated
	 */
	public Adapter createMuteLowerPriorityAdapter() {
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

} // RBASoundAdapterFactory
