/**
 */
package rba.sound.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model, starting
 * with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is returned, which is
 * the result of the switch. <!-- end-user-doc -->
 * @see rba.sound.RBASoundPackage
 * @generated
 */
public class RBASoundSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static RBASoundPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBASoundSwitch() {
		if (modelPackage == null) {
			modelPackage = RBASoundPackage.eINSTANCE;
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
		case RBASoundPackage.SOUND_CONTENT: {
			SoundContent soundContent = (SoundContent) theEObject;
			T result = caseSoundContent(soundContent);
			if (result == null)
				result = caseContent(soundContent);
			if (result == null)
				result = caseAbstractContent(soundContent);
			if (result == null)
				result = caseRuleObject(soundContent);
			if (result == null)
				result = casePackagableElement(soundContent);
			if (result == null)
				result = caseNamedElement(soundContent);
			if (result == null)
				result = caseModelElement(soundContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.SOUND_CONTENT_SET: {
			SoundContentSet soundContentSet = (SoundContentSet) theEObject;
			T result = caseSoundContentSet(soundContentSet);
			if (result == null)
				result = caseContentSet(soundContentSet);
			if (result == null)
				result = caseAbstractContent(soundContentSet);
			if (result == null)
				result = caseRuleObject(soundContentSet);
			if (result == null)
				result = casePackagableElement(soundContentSet);
			if (result == null)
				result = caseNamedElement(soundContentSet);
			if (result == null)
				result = caseModelElement(soundContentSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.SOUND_CONTENT_STATE: {
			SoundContentState soundContentState = (SoundContentState) theEObject;
			T result = caseSoundContentState(soundContentState);
			if (result == null)
				result = caseContentState(soundContentState);
			if (result == null)
				result = caseRuleObject(soundContentState);
			if (result == null)
				result = casePackagableElement(soundContentState);
			if (result == null)
				result = caseNamedElement(soundContentState);
			if (result == null)
				result = caseModelElement(soundContentState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.ZONE: {
			Zone zone = (Zone) theEObject;
			T result = caseZone(zone);
			if (result == null)
				result = caseAllocatable(zone);
			if (result == null)
				result = caseAbstractAllocatable(zone);
			if (result == null)
				result = caseRuleObject(zone);
			if (result == null)
				result = casePackagableElement(zone);
			if (result == null)
				result = caseNamedElement(zone);
			if (result == null)
				result = caseModelElement(zone);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.ZONE_SET: {
			ZoneSet zoneSet = (ZoneSet) theEObject;
			T result = caseZoneSet(zoneSet);
			if (result == null)
				result = caseAllocatableSet(zoneSet);
			if (result == null)
				result = caseAbstractAllocatable(zoneSet);
			if (result == null)
				result = caseRuleObject(zoneSet);
			if (result == null)
				result = casePackagableElement(zoneSet);
			if (result == null)
				result = caseNamedElement(zoneSet);
			if (result == null)
				result = caseModelElement(zoneSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.SOUND_CONTENT_OPERATOR: {
			SoundContentOperator soundContentOperator = (SoundContentOperator) theEObject;
			T result = caseSoundContentOperator(soundContentOperator);
			if (result == null)
				result = caseContentOperator(soundContentOperator);
			if (result == null)
				result = caseOperator(soundContentOperator);
			if (result == null)
				result = caseExpression(soundContentOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.IS_SOUNDING: {
			IsSounding isSounding = (IsSounding) theEObject;
			T result = caseIsSounding(isSounding);
			if (result == null)
				result = caseSoundContentOperator(isSounding);
			if (result == null)
				result = caseContentOperator(isSounding);
			if (result == null)
				result = caseOperator(isSounding);
			if (result == null)
				result = caseExpression(isSounding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.ZONE_OPERATOR: {
			ZoneOperator zoneOperator = (ZoneOperator) theEObject;
			T result = caseZoneOperator(zoneOperator);
			if (result == null)
				result = caseOperator(zoneOperator);
			if (result == null)
				result = caseExpression(zoneOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.IS_OUTPUTTED: {
			IsOutputted isOutputted = (IsOutputted) theEObject;
			T result = caseIsOutputted(isOutputted);
			if (result == null)
				result = caseZoneOperator(isOutputted);
			if (result == null)
				result = caseOperator(isOutputted);
			if (result == null)
				result = caseExpression(isOutputted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.IS_MUTED: {
			IsMuted isMuted = (IsMuted) theEObject;
			T result = caseIsMuted(isMuted);
			if (result == null)
				result = caseZoneOperator(isMuted);
			if (result == null)
				result = caseOperator(isMuted);
			if (result == null)
				result = caseExpression(isMuted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.IS_ATTENUATED: {
			IsAttenuated isAttenuated = (IsAttenuated) theEObject;
			T result = caseIsAttenuated(isAttenuated);
			if (result == null)
				result = caseZoneOperator(isAttenuated);
			if (result == null)
				result = caseOperator(isAttenuated);
			if (result == null)
				result = caseExpression(isAttenuated);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.OUTPUTTING_SOUND: {
			OutputtingSound outputtingSound = (OutputtingSound) theEObject;
			T result = caseOutputtingSound(outputtingSound);
			if (result == null)
				result = caseZoneOperator(outputtingSound);
			if (result == null)
				result = caseOperator(outputtingSound);
			if (result == null)
				result = caseExpression(outputtingSound);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.ALL_INSTANCE_OF_ZONE: {
			AllInstanceOfZone allInstanceOfZone = (AllInstanceOfZone) theEObject;
			T result = caseAllInstanceOfZone(allInstanceOfZone);
			if (result == null)
				result = caseSetExpression(allInstanceOfZone);
			if (result == null)
				result = caseExpression(allInstanceOfZone);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.ALL_INSTANCE_OF_SOUND_CONTENT: {
			AllInstanceOfSoundContent allInstanceOfSoundContent = (AllInstanceOfSoundContent) theEObject;
			T result = caseAllInstanceOfSoundContent(allInstanceOfSoundContent);
			if (result == null)
				result = caseSetExpression(allInstanceOfSoundContent);
			if (result == null)
				result = caseExpression(allInstanceOfSoundContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.IS_OUTPUTTED_ON: {
			IsOutputtedOn isOutputtedOn = (IsOutputtedOn) theEObject;
			T result = caseIsOutputtedOn(isOutputtedOn);
			if (result == null)
				result = caseSoundContentOperator(isOutputtedOn);
			if (result == null)
				result = caseSugarExpressionBase(isOutputtedOn);
			if (result == null)
				result = caseContentOperator(isOutputtedOn);
			if (result == null)
				result = caseSugarExpression(isOutputtedOn);
			if (result == null)
				result = caseOperator(isOutputtedOn);
			if (result == null)
				result = caseExpression(isOutputtedOn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.IS_CHANGED_OUTPUT: {
			IsChangedOutput isChangedOutput = (IsChangedOutput) theEObject;
			T result = caseIsChangedOutput(isChangedOutput);
			if (result == null)
				result = caseZoneOperator(isChangedOutput);
			if (result == null)
				result = caseSugarExpressionBase(isChangedOutput);
			if (result == null)
				result = caseOperator(isChangedOutput);
			if (result == null)
				result = caseSugarExpression(isChangedOutput);
			if (result == null)
				result = caseExpression(isChangedOutput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.IS_TRANSLATED_SOUND_TO: {
			IsTranslatedSoundTo isTranslatedSoundTo = (IsTranslatedSoundTo) theEObject;
			T result = caseIsTranslatedSoundTo(isTranslatedSoundTo);
			if (result == null)
				result = caseZoneOperator(isTranslatedSoundTo);
			if (result == null)
				result = caseSugarExpressionBase(isTranslatedSoundTo);
			if (result == null)
				result = caseOperator(isTranslatedSoundTo);
			if (result == null)
				result = caseSugarExpression(isTranslatedSoundTo);
			if (result == null)
				result = caseExpression(isTranslatedSoundTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBASoundPackage.MUTE_LOWER_PRIORITY: {
			MuteLowerPriority muteLowerPriority = (MuteLowerPriority) theEObject;
			T result = caseMuteLowerPriority(muteLowerPriority);
			if (result == null)
				result = caseOperator(muteLowerPriority);
			if (result == null)
				result = caseSugarExpressionBase(muteLowerPriority);
			if (result == null)
				result = caseExpression(muteLowerPriority);
			if (result == null)
				result = caseSugarExpression(muteLowerPriority);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sound Content</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sound Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoundContent(SoundContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sound Content Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sound Content Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoundContentSet(SoundContentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sound Content State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sound Content State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoundContentState(SoundContentState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZone(Zone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone Set</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoneSet(ZoneSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sound Content Operator</em>'.
	 * <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sound Content Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoundContentOperator(SoundContentOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Sounding</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Sounding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsSounding(IsSounding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoneOperator(ZoneOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Outputted</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Outputted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsOutputted(IsOutputted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Muted</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Muted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsMuted(IsMuted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Attenuated</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Attenuated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsAttenuated(IsAttenuated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outputting Sound</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outputting Sound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputtingSound(OutputtingSound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Instance Of Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Instance Of Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllInstanceOfZone(AllInstanceOfZone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Instance Of Sound Content</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Instance Of Sound Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllInstanceOfSoundContent(AllInstanceOfSoundContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Outputted On</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Outputted On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsOutputtedOn(IsOutputtedOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Changed Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Changed Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsChangedOutput(IsChangedOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Translated Sound To</em>'.
	 * <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Translated Sound To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsTranslatedSoundTo(IsTranslatedSoundTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mute Lower Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mute Lower Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMuteLowerPriority(MuteLowerPriority object) {
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

} // RBASoundSwitch
