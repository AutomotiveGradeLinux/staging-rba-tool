/**
 */
package rba.view;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rba.view.RBAViewPackage
 * @generated
 */
public interface RBAViewFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RBAViewFactory eINSTANCE = rba.view.impl.RBAViewFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>View Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Content</em>'.
	 * @generated
	 */
	ViewContent createViewContent();

	/**
	 * Returns a new object of class '<em>View Content Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Content Set</em>'.
	 * @generated
	 */
	ViewContentSet createViewContentSet();

	/**
	 * Returns a new object of class '<em>View Content State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Content State</em>'.
	 * @generated
	 */
	ViewContentState createViewContentState();

	/**
	 * Returns a new object of class '<em>Vertical Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertical Layout</em>'.
	 * @generated
	 */
	VerticalLayout createVerticalLayout();

	/**
	 * Returns a new object of class '<em>Horizontal Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontal Layout</em>'.
	 * @generated
	 */
	HorizontalLayout createHorizontalLayout();

	/**
	 * Returns a new object of class '<em>Fixed Position Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Position Layout</em>'.
	 * @generated
	 */
	FixedPositionLayout createFixedPositionLayout();

	/**
	 * Returns a new object of class '<em>Position Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Container</em>'.
	 * @generated
	 */
	PositionContainer createPositionContainer();

	/**
	 * Returns a new object of class '<em>Display</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display</em>'.
	 * @generated
	 */
	Display createDisplay();

	/**
	 * Returns a new object of class '<em>Composite Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Area</em>'.
	 * @generated
	 */
	CompositeArea createCompositeArea();

	/**
	 * Returns a new object of class '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area</em>'.
	 * @generated
	 */
	Area createArea();

	/**
	 * Returns a new object of class '<em>Area Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area Set</em>'.
	 * @generated
	 */
	AreaSet createAreaSet();

	/**
	 * Returns a new object of class '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Size</em>'.
	 * @generated
	 */
	Size createSize();

	/**
	 * Returns a new object of class '<em>Size Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Size Reference</em>'.
	 * @generated
	 */
	SizeReference createSizeReference();

	/**
	 * Returns a new object of class '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offset</em>'.
	 * @generated
	 */
	Offset createOffset();

	/**
	 * Returns a new object of class '<em>Is Displayed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Displayed</em>'.
	 * @generated
	 */
	IsDisplayed createIsDisplayed();

	/**
	 * Returns a new object of class '<em>Displaying Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Displaying Content</em>'.
	 * @generated
	 */
	DisplayingContent createDisplayingContent();

	/**
	 * Returns a new object of class '<em>Is Hidden</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Hidden</em>'.
	 * @generated
	 */
	IsHidden createIsHidden();

	/**
	 * Returns a new object of class '<em>Is Visible</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Visible</em>'.
	 * @generated
	 */
	IsVisible createIsVisible();

	/**
	 * Returns a new object of class '<em>All Instance Of Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Instance Of Area</em>'.
	 * @generated
	 */
	AllInstanceOfArea createAllInstanceOfArea();

	/**
	 * Returns a new object of class '<em>All Instance Of View Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Instance Of View Content</em>'.
	 * @generated
	 */
	AllInstanceOfViewContent createAllInstanceOfViewContent();

	/**
	 * Returns a new object of class '<em>Is Displayed On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Displayed On</em>'.
	 * @generated
	 */
	IsDisplayedOn createIsDisplayedOn();

	/**
	 * Returns a new object of class '<em>Is Changed Display</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Changed Display</em>'.
	 * @generated
	 */
	IsChangedDisplay createIsChangedDisplay();

	/**
	 * Returns a new object of class '<em>Is Translated View To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Translated View To</em>'.
	 * @generated
	 */
	IsTranslatedViewTo createIsTranslatedViewTo();

	/**
	 * Returns a new object of class '<em>Hide Lower Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hide Lower Priority</em>'.
	 * @generated
	 */
	HideLowerPriority createHideLowerPriority();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RBAViewPackage getRBAViewPackage();

} //RBAViewFactory
