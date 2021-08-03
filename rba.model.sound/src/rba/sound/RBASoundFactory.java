/**
 */
package rba.sound;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rba.sound.RBASoundPackage
 * @generated
 */
public interface RBASoundFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RBASoundFactory eINSTANCE = rba.sound.impl.RBASoundFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sound Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sound Content</em>'.
	 * @generated
	 */
	SoundContent createSoundContent();

	/**
	 * Returns a new object of class '<em>Sound Content Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sound Content Set</em>'.
	 * @generated
	 */
	SoundContentSet createSoundContentSet();

	/**
	 * Returns a new object of class '<em>Sound Content State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sound Content State</em>'.
	 * @generated
	 */
	SoundContentState createSoundContentState();

	/**
	 * Returns a new object of class '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone</em>'.
	 * @generated
	 */
	Zone createZone();

	/**
	 * Returns a new object of class '<em>Zone Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone Set</em>'.
	 * @generated
	 */
	ZoneSet createZoneSet();

	/**
	 * Returns a new object of class '<em>Is Sounding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Sounding</em>'.
	 * @generated
	 */
	IsSounding createIsSounding();

	/**
	 * Returns a new object of class '<em>Is Outputted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Outputted</em>'.
	 * @generated
	 */
	IsOutputted createIsOutputted();

	/**
	 * Returns a new object of class '<em>Is Muted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Muted</em>'.
	 * @generated
	 */
	IsMuted createIsMuted();

	/**
	 * Returns a new object of class '<em>Is Attenuated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Attenuated</em>'.
	 * @generated
	 */
	IsAttenuated createIsAttenuated();

	/**
	 * Returns a new object of class '<em>Outputting Sound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outputting Sound</em>'.
	 * @generated
	 */
	OutputtingSound createOutputtingSound();

	/**
	 * Returns a new object of class '<em>All Instance Of Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Instance Of Zone</em>'.
	 * @generated
	 */
	AllInstanceOfZone createAllInstanceOfZone();

	/**
	 * Returns a new object of class '<em>All Instance Of Sound Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Instance Of Sound Content</em>'.
	 * @generated
	 */
	AllInstanceOfSoundContent createAllInstanceOfSoundContent();

	/**
	 * Returns a new object of class '<em>Is Outputted On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Outputted On</em>'.
	 * @generated
	 */
	IsOutputtedOn createIsOutputtedOn();

	/**
	 * Returns a new object of class '<em>Is Changed Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Changed Output</em>'.
	 * @generated
	 */
	IsChangedOutput createIsChangedOutput();

	/**
	 * Returns a new object of class '<em>Is Translated Sound To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Translated Sound To</em>'.
	 * @generated
	 */
	IsTranslatedSoundTo createIsTranslatedSoundTo();

	/**
	 * Returns a new object of class '<em>Mute Lower Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mute Lower Priority</em>'.
	 * @generated
	 */
	MuteLowerPriority createMuteLowerPriority();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RBASoundPackage getRBASoundPackage();

} //RBASoundFactory
