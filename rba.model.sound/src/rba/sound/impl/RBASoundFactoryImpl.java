/**
 */
package rba.sound.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rba.sound.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class RBASoundFactoryImpl extends EFactoryImpl implements RBASoundFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static RBASoundFactory init() {
		try {
			RBASoundFactory theRBASoundFactory = (RBASoundFactory) EPackage.Registry.INSTANCE
					.getEFactory(RBASoundPackage.eNS_URI);
			if (theRBASoundFactory != null) {
				return theRBASoundFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RBASoundFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBASoundFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RBASoundPackage.SOUND_CONTENT:
			return createSoundContent();
		case RBASoundPackage.SOUND_CONTENT_SET:
			return createSoundContentSet();
		case RBASoundPackage.SOUND_CONTENT_STATE:
			return createSoundContentState();
		case RBASoundPackage.ZONE:
			return createZone();
		case RBASoundPackage.ZONE_SET:
			return createZoneSet();
		case RBASoundPackage.IS_SOUNDING:
			return createIsSounding();
		case RBASoundPackage.IS_OUTPUTTED:
			return createIsOutputted();
		case RBASoundPackage.IS_MUTED:
			return createIsMuted();
		case RBASoundPackage.IS_ATTENUATED:
			return createIsAttenuated();
		case RBASoundPackage.OUTPUTTING_SOUND:
			return createOutputtingSound();
		case RBASoundPackage.ALL_INSTANCE_OF_ZONE:
			return createAllInstanceOfZone();
		case RBASoundPackage.ALL_INSTANCE_OF_SOUND_CONTENT:
			return createAllInstanceOfSoundContent();
		case RBASoundPackage.IS_OUTPUTTED_ON:
			return createIsOutputtedOn();
		case RBASoundPackage.IS_CHANGED_OUTPUT:
			return createIsChangedOutput();
		case RBASoundPackage.IS_TRANSLATED_SOUND_TO:
			return createIsTranslatedSoundTo();
		case RBASoundPackage.MUTE_LOWER_PRIORITY:
			return createMuteLowerPriority();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SoundContent createSoundContent() {
		SoundContentImpl soundContent = new SoundContentImpl();
		return soundContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SoundContentSet createSoundContentSet() {
		SoundContentSetImpl soundContentSet = new SoundContentSetImpl();
		return soundContentSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SoundContentState createSoundContentState() {
		SoundContentStateImpl soundContentState = new SoundContentStateImpl();
		return soundContentState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Zone createZone() {
		ZoneImpl zone = new ZoneImpl();
		return zone;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneSet createZoneSet() {
		ZoneSetImpl zoneSet = new ZoneSetImpl();
		return zoneSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsSounding createIsSounding() {
		IsSoundingImpl isSounding = new IsSoundingImpl();
		return isSounding;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsOutputted createIsOutputted() {
		IsOutputtedImpl isOutputted = new IsOutputtedImpl();
		return isOutputted;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsMuted createIsMuted() {
		IsMutedImpl isMuted = new IsMutedImpl();
		return isMuted;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsAttenuated createIsAttenuated() {
		IsAttenuatedImpl isAttenuated = new IsAttenuatedImpl();
		return isAttenuated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OutputtingSound createOutputtingSound() {
		OutputtingSoundImpl outputtingSound = new OutputtingSoundImpl();
		return outputtingSound;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AllInstanceOfZone createAllInstanceOfZone() {
		AllInstanceOfZoneImpl allInstanceOfZone = new AllInstanceOfZoneImpl();
		return allInstanceOfZone;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AllInstanceOfSoundContent createAllInstanceOfSoundContent() {
		AllInstanceOfSoundContentImpl allInstanceOfSoundContent = new AllInstanceOfSoundContentImpl();
		return allInstanceOfSoundContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsOutputtedOn createIsOutputtedOn() {
		IsOutputtedOnImpl isOutputtedOn = new IsOutputtedOnImpl();
		return isOutputtedOn;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsChangedOutput createIsChangedOutput() {
		IsChangedOutputImpl isChangedOutput = new IsChangedOutputImpl();
		return isChangedOutput;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsTranslatedSoundTo createIsTranslatedSoundTo() {
		IsTranslatedSoundToImpl isTranslatedSoundTo = new IsTranslatedSoundToImpl();
		return isTranslatedSoundTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MuteLowerPriority createMuteLowerPriority() {
		MuteLowerPriorityImpl muteLowerPriority = new MuteLowerPriorityImpl();
		return muteLowerPriority;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBASoundPackage getRBASoundPackage() {
		return (RBASoundPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RBASoundPackage getPackage() {
		return RBASoundPackage.eINSTANCE;
	}

} // RBASoundFactoryImpl
