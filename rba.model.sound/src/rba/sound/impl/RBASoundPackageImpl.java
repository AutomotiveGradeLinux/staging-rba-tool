/**
 */
package rba.sound.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rba.core.RBACorePackage;
import rba.sound.AllInstanceOfSoundContent;
import rba.sound.AllInstanceOfZone;
import rba.sound.IsAttenuated;
import rba.sound.IsChangedOutput;
import rba.sound.IsMuted;
import rba.sound.IsOutputted;
import rba.sound.IsOutputtedOn;
import rba.sound.IsSounding;
import rba.sound.IsTranslatedSoundTo;
import rba.sound.MuteLowerPriority;
import rba.sound.OutputtingSound;
import rba.sound.RBASoundFactory;
import rba.sound.RBASoundPackage;
import rba.sound.SoundContent;
import rba.sound.SoundContentOperator;
import rba.sound.SoundContentSet;
import rba.sound.SoundContentState;
import rba.sound.Zone;
import rba.sound.ZoneOperator;
import rba.sound.ZoneSet;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class RBASoundPackageImpl extends EPackageImpl implements RBASoundPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soundContentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soundContentSetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soundContentStateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneSetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soundContentOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isSoundingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isOutputtedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isMutedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isAttenuatedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputtingSoundEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allInstanceOfZoneEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allInstanceOfSoundContentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isOutputtedOnEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isChangedOutputEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isTranslatedSoundToEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass muteLowerPriorityEClass = null;

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
	 * @see rba.sound.RBASoundPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RBASoundPackageImpl() {
		super(eNS_URI, RBASoundFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RBASoundPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RBASoundPackage init() {
		if (isInited)
			return (RBASoundPackage) EPackage.Registry.INSTANCE.getEPackage(RBASoundPackage.eNS_URI);

		// Obtain or create and register package
		RBASoundPackageImpl theRBASoundPackage = (RBASoundPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RBASoundPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RBASoundPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RBACorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRBASoundPackage.createPackageContents();

		// Initialize created meta-data
		theRBASoundPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRBASoundPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RBASoundPackage.eNS_URI, theRBASoundPackage);
		return theRBASoundPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoundContent() {
		return soundContentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSoundContent__GetExpressionType() {
		return soundContentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoundContentSet() {
		return soundContentSetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSoundContentSet__GetExpressionType() {
		return soundContentSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoundContentState() {
		return soundContentStateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSoundContentState__GetExpressionType() {
		return soundContentStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZone() {
		return zoneEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_Attenuate() {
		return (EReference) zoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZone__GetExpressionType() {
		return zoneEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneSet() {
		return zoneSetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZoneSet__GetExpressionType() {
		return zoneSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoundContentOperator() {
		return soundContentOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSoundContentOperator__GetUnderlyingType() {
		return soundContentOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsSounding() {
		return isSoundingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsSounding__GetSymbol() {
		return isSoundingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneOperator() {
		return zoneOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZoneOperator__GetExpressionText() {
		return zoneOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsOutputted() {
		return isOutputtedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsOutputted__GetSymbol() {
		return isOutputtedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsOutputted__GetUnderlyingType() {
		return isOutputtedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsMuted() {
		return isMutedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsMuted__GetSymbol() {
		return isMutedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsMuted__GetUnderlyingType() {
		return isMutedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsAttenuated() {
		return isAttenuatedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsAttenuated__GetSymbol() {
		return isAttenuatedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsAttenuated__GetUnderlyingType() {
		return isAttenuatedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputtingSound() {
		return outputtingSoundEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputtingSound__GetSymbol() {
		return outputtingSoundEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputtingSound__GetUnderlyingType() {
		return outputtingSoundEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllInstanceOfZone() {
		return allInstanceOfZoneEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllInstanceOfZone__GetExpressionText() {
		return allInstanceOfZoneEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllInstanceOfZone__GetUnderlyingType() {
		return allInstanceOfZoneEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllInstanceOfSoundContent() {
		return allInstanceOfSoundContentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllInstanceOfSoundContent__GetExpressionText() {
		return allInstanceOfSoundContentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAllInstanceOfSoundContent__GetUnderlyingType() {
		return allInstanceOfSoundContentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsOutputtedOn() {
		return isOutputtedOnEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsOutputtedOn__GetSymbol() {
		return isOutputtedOnEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsOutputtedOn__GetUnderlyingType() {
		return isOutputtedOnEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsOutputtedOn__GetExpressionText() {
		return isOutputtedOnEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsChangedOutput() {
		return isChangedOutputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsChangedOutput__GetSymbol() {
		return isChangedOutputEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsChangedOutput__GetUnderlyingType() {
		return isChangedOutputEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsTranslatedSoundTo() {
		return isTranslatedSoundToEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsTranslatedSoundTo__GetSymbol() {
		return isTranslatedSoundToEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsTranslatedSoundTo__GetUnderlyingType() {
		return isTranslatedSoundToEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIsTranslatedSoundTo__GetExpressionText() {
		return isTranslatedSoundToEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMuteLowerPriority() {
		return muteLowerPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMuteLowerPriority__GetSymbol() {
		return muteLowerPriorityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMuteLowerPriority__GetUnderlyingType() {
		return muteLowerPriorityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMuteLowerPriority__GetExpressionText() {
		return muteLowerPriorityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBASoundFactory getRBASoundFactory() {
		return (RBASoundFactory) getEFactoryInstance();
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
		soundContentEClass = createEClass(SOUND_CONTENT);
		createEOperation(soundContentEClass, SOUND_CONTENT___GET_EXPRESSION_TYPE);

		soundContentSetEClass = createEClass(SOUND_CONTENT_SET);
		createEOperation(soundContentSetEClass, SOUND_CONTENT_SET___GET_EXPRESSION_TYPE);

		soundContentStateEClass = createEClass(SOUND_CONTENT_STATE);
		createEOperation(soundContentStateEClass, SOUND_CONTENT_STATE___GET_EXPRESSION_TYPE);

		zoneEClass = createEClass(ZONE);
		createEReference(zoneEClass, ZONE__ATTENUATE);
		createEOperation(zoneEClass, ZONE___GET_EXPRESSION_TYPE);

		zoneSetEClass = createEClass(ZONE_SET);
		createEOperation(zoneSetEClass, ZONE_SET___GET_EXPRESSION_TYPE);

		soundContentOperatorEClass = createEClass(SOUND_CONTENT_OPERATOR);
		createEOperation(soundContentOperatorEClass, SOUND_CONTENT_OPERATOR___GET_UNDERLYING_TYPE);

		isSoundingEClass = createEClass(IS_SOUNDING);
		createEOperation(isSoundingEClass, IS_SOUNDING___GET_SYMBOL);

		zoneOperatorEClass = createEClass(ZONE_OPERATOR);
		createEOperation(zoneOperatorEClass, ZONE_OPERATOR___GET_EXPRESSION_TEXT);

		isOutputtedEClass = createEClass(IS_OUTPUTTED);
		createEOperation(isOutputtedEClass, IS_OUTPUTTED___GET_SYMBOL);
		createEOperation(isOutputtedEClass, IS_OUTPUTTED___GET_UNDERLYING_TYPE);

		isMutedEClass = createEClass(IS_MUTED);
		createEOperation(isMutedEClass, IS_MUTED___GET_SYMBOL);
		createEOperation(isMutedEClass, IS_MUTED___GET_UNDERLYING_TYPE);

		isAttenuatedEClass = createEClass(IS_ATTENUATED);
		createEOperation(isAttenuatedEClass, IS_ATTENUATED___GET_SYMBOL);
		createEOperation(isAttenuatedEClass, IS_ATTENUATED___GET_UNDERLYING_TYPE);

		outputtingSoundEClass = createEClass(OUTPUTTING_SOUND);
		createEOperation(outputtingSoundEClass, OUTPUTTING_SOUND___GET_SYMBOL);
		createEOperation(outputtingSoundEClass, OUTPUTTING_SOUND___GET_UNDERLYING_TYPE);

		allInstanceOfZoneEClass = createEClass(ALL_INSTANCE_OF_ZONE);
		createEOperation(allInstanceOfZoneEClass, ALL_INSTANCE_OF_ZONE___GET_EXPRESSION_TEXT);
		createEOperation(allInstanceOfZoneEClass, ALL_INSTANCE_OF_ZONE___GET_UNDERLYING_TYPE);

		allInstanceOfSoundContentEClass = createEClass(ALL_INSTANCE_OF_SOUND_CONTENT);
		createEOperation(allInstanceOfSoundContentEClass, ALL_INSTANCE_OF_SOUND_CONTENT___GET_EXPRESSION_TEXT);
		createEOperation(allInstanceOfSoundContentEClass, ALL_INSTANCE_OF_SOUND_CONTENT___GET_UNDERLYING_TYPE);

		isOutputtedOnEClass = createEClass(IS_OUTPUTTED_ON);
		createEOperation(isOutputtedOnEClass, IS_OUTPUTTED_ON___GET_SYMBOL);
		createEOperation(isOutputtedOnEClass, IS_OUTPUTTED_ON___GET_UNDERLYING_TYPE);
		createEOperation(isOutputtedOnEClass, IS_OUTPUTTED_ON___GET_EXPRESSION_TEXT);

		isChangedOutputEClass = createEClass(IS_CHANGED_OUTPUT);
		createEOperation(isChangedOutputEClass, IS_CHANGED_OUTPUT___GET_SYMBOL);
		createEOperation(isChangedOutputEClass, IS_CHANGED_OUTPUT___GET_UNDERLYING_TYPE);

		isTranslatedSoundToEClass = createEClass(IS_TRANSLATED_SOUND_TO);
		createEOperation(isTranslatedSoundToEClass, IS_TRANSLATED_SOUND_TO___GET_SYMBOL);
		createEOperation(isTranslatedSoundToEClass, IS_TRANSLATED_SOUND_TO___GET_UNDERLYING_TYPE);
		createEOperation(isTranslatedSoundToEClass, IS_TRANSLATED_SOUND_TO___GET_EXPRESSION_TEXT);

		muteLowerPriorityEClass = createEClass(MUTE_LOWER_PRIORITY);
		createEOperation(muteLowerPriorityEClass, MUTE_LOWER_PRIORITY___GET_SYMBOL);
		createEOperation(muteLowerPriorityEClass, MUTE_LOWER_PRIORITY___GET_UNDERLYING_TYPE);
		createEOperation(muteLowerPriorityEClass, MUTE_LOWER_PRIORITY___GET_EXPRESSION_TEXT);
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
		soundContentEClass.getESuperTypes().add(theRBACorePackage.getContent());
		soundContentSetEClass.getESuperTypes().add(theRBACorePackage.getContentSet());
		soundContentStateEClass.getESuperTypes().add(theRBACorePackage.getContentState());
		zoneEClass.getESuperTypes().add(theRBACorePackage.getAllocatable());
		zoneSetEClass.getESuperTypes().add(theRBACorePackage.getAllocatableSet());
		soundContentOperatorEClass.getESuperTypes().add(theRBACorePackage.getContentOperator());
		isSoundingEClass.getESuperTypes().add(this.getSoundContentOperator());
		zoneOperatorEClass.getESuperTypes().add(theRBACorePackage.getOperator());
		isOutputtedEClass.getESuperTypes().add(this.getZoneOperator());
		isMutedEClass.getESuperTypes().add(this.getZoneOperator());
		isAttenuatedEClass.getESuperTypes().add(this.getZoneOperator());
		outputtingSoundEClass.getESuperTypes().add(this.getZoneOperator());
		allInstanceOfZoneEClass.getESuperTypes().add(theRBACorePackage.getSetExpression());
		allInstanceOfSoundContentEClass.getESuperTypes().add(theRBACorePackage.getSetExpression());
		isOutputtedOnEClass.getESuperTypes().add(this.getSoundContentOperator());
		isOutputtedOnEClass.getESuperTypes().add(theRBACorePackage.getSugarExpressionBase());
		isChangedOutputEClass.getESuperTypes().add(this.getZoneOperator());
		isChangedOutputEClass.getESuperTypes().add(theRBACorePackage.getSugarExpressionBase());
		isTranslatedSoundToEClass.getESuperTypes().add(this.getZoneOperator());
		isTranslatedSoundToEClass.getESuperTypes().add(theRBACorePackage.getSugarExpressionBase());
		muteLowerPriorityEClass.getESuperTypes().add(theRBACorePackage.getOperator());
		muteLowerPriorityEClass.getESuperTypes().add(theRBACorePackage.getSugarExpressionBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(soundContentEClass, SoundContent.class, "SoundContent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSoundContent__GetExpressionType(), theRBACorePackage.getExpressionType(), "getExpressionType",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(soundContentSetEClass, SoundContentSet.class, "SoundContentSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSoundContentSet__GetExpressionType(), theRBACorePackage.getExpressionType(),
				"getExpressionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(soundContentStateEClass, SoundContentState.class, "SoundContentState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSoundContentState__GetExpressionType(), theRBACorePackage.getExpressionType(),
				"getExpressionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(zoneEClass, Zone.class, "Zone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZone_Attenuate(), theRBACorePackage.getExpression(), null, "attenuate", null, 0, 1,
				Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getZone__GetExpressionType(), theRBACorePackage.getExpressionType(), "getExpressionType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(zoneSetEClass, ZoneSet.class, "ZoneSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getZoneSet__GetExpressionType(), theRBACorePackage.getExpressionType(), "getExpressionType", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(soundContentOperatorEClass, SoundContentOperator.class, "SoundContentOperator", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSoundContentOperator__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(isSoundingEClass, IsSounding.class, "IsSounding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsSounding__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(zoneOperatorEClass, ZoneOperator.class, "ZoneOperator", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getZoneOperator__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(isOutputtedEClass, IsOutputted.class, "IsOutputted", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsOutputted__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIsOutputted__GetUnderlyingType(), theRBACorePackage.getExpressionType(), "getUnderlyingType",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(isMutedEClass, IsMuted.class, "IsMuted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsMuted__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIsMuted__GetUnderlyingType(), theRBACorePackage.getExpressionType(), "getUnderlyingType", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(isAttenuatedEClass, IsAttenuated.class, "IsAttenuated", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsAttenuated__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIsAttenuated__GetUnderlyingType(), theRBACorePackage.getExpressionType(), "getUnderlyingType",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outputtingSoundEClass, OutputtingSound.class, "OutputtingSound", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getOutputtingSound__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getOutputtingSound__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allInstanceOfZoneEClass, AllInstanceOfZone.class, "AllInstanceOfZone", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAllInstanceOfZone__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getAllInstanceOfZone__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(allInstanceOfSoundContentEClass, AllInstanceOfSoundContent.class, "AllInstanceOfSoundContent",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAllInstanceOfSoundContent__GetExpressionText(), ecorePackage.getEString(),
				"getExpressionText", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAllInstanceOfSoundContent__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(isOutputtedOnEClass, IsOutputtedOn.class, "IsOutputtedOn", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsOutputtedOn__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIsOutputtedOn__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIsOutputtedOn__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(isChangedOutputEClass, IsChangedOutput.class, "IsChangedOutput", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsChangedOutput__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIsChangedOutput__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(isTranslatedSoundToEClass, IsTranslatedSoundTo.class, "IsTranslatedSoundTo", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIsTranslatedSoundTo__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getIsTranslatedSoundTo__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIsTranslatedSoundTo__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(muteLowerPriorityEClass, MuteLowerPriority.class, "MuteLowerPriority", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMuteLowerPriority__GetSymbol(), ecorePackage.getEString(), "getSymbol", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getMuteLowerPriority__GetUnderlyingType(), theRBACorePackage.getExpressionType(),
				"getUnderlyingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMuteLowerPriority__GetExpressionText(), ecorePackage.getEString(), "getExpressionText", 0, 1,
				IS_UNIQUE, IS_ORDERED);

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
		addAnnotation(this, source, new String[] { "RbaCore", "../../rba.model.core/model/rbacore.ecore#/" });
	}

} // RBASoundPackageImpl
