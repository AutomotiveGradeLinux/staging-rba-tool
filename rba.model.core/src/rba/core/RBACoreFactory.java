/**
 */
package rba.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rba.core.RBACorePackage
 * @generated
 */
public interface RBACoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RBACoreFactory eINSTANCE = rba.core.impl.RBACoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stereotype</em>'.
	 * @generated
	 */
	Stereotype createStereotype();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene</em>'.
	 * @generated
	 */
	Scene createScene();

	/**
	 * Returns a new object of class '<em>Integer Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Property</em>'.
	 * @generated
	 */
	IntegerProperty createIntegerProperty();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Let Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Let Statement</em>'.
	 * @generated
	 */
	LetStatement createLetStatement();

	/**
	 * Returns a new object of class '<em>Complex Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Expression</em>'.
	 * @generated
	 */
	ComplexExpression createComplexExpression();

	/**
	 * Returns a new object of class '<em>Is Type Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Type Of</em>'.
	 * @generated
	 */
	IsTypeOf createIsTypeOf();

	/**
	 * Returns a new object of class '<em>Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Reference</em>'.
	 * @generated
	 */
	ObjectReference createObjectReference();

	/**
	 * Returns a new object of class '<em>Previous Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Previous Modifier</em>'.
	 * @generated
	 */
	PreviousModifier createPreviousModifier();

	/**
	 * Returns a new object of class '<em>Greater Than Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Than Operator</em>'.
	 * @generated
	 */
	GreaterThanOperator createGreaterThanOperator();

	/**
	 * Returns a new object of class '<em>Much Greater Than Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Much Greater Than Operator</em>'.
	 * @generated
	 */
	MuchGreaterThanOperator createMuchGreaterThanOperator();

	/**
	 * Returns a new object of class '<em>Lower Than Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lower Than Operator</em>'.
	 * @generated
	 */
	LowerThanOperator createLowerThanOperator();

	/**
	 * Returns a new object of class '<em>Equal To Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal To Operator</em>'.
	 * @generated
	 */
	EqualToOperator createEqualToOperator();

	/**
	 * Returns a new object of class '<em>Comparison And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison And</em>'.
	 * @generated
	 */
	ComparisonAnd createComparisonAnd();

	/**
	 * Returns a new object of class '<em>And Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Operator</em>'.
	 * @generated
	 */
	AndOperator createAndOperator();

	/**
	 * Returns a new object of class '<em>Or Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Operator</em>'.
	 * @generated
	 */
	OrOperator createOrOperator();

	/**
	 * Returns a new object of class '<em>Not Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Operator</em>'.
	 * @generated
	 */
	NotOperator createNotOperator();

	/**
	 * Returns a new object of class '<em>Is Equal To Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Equal To Operator</em>'.
	 * @generated
	 */
	IsEqualToOperator createIsEqualToOperator();

	/**
	 * Returns a new object of class '<em>Is Greater Than Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Greater Than Operator</em>'.
	 * @generated
	 */
	IsGreaterThanOperator createIsGreaterThanOperator();

	/**
	 * Returns a new object of class '<em>Is Lower Than Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Lower Than Operator</em>'.
	 * @generated
	 */
	IsLowerThanOperator createIsLowerThanOperator();

	/**
	 * Returns a new object of class '<em>Is Greater Than Equal Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Greater Than Equal Operator</em>'.
	 * @generated
	 */
	IsGreaterThanEqualOperator createIsGreaterThanEqualOperator();

	/**
	 * Returns a new object of class '<em>Is Lower Than Equal Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Lower Than Equal Operator</em>'.
	 * @generated
	 */
	IsLowerThanEqualOperator createIsLowerThanEqualOperator();

	/**
	 * Returns a new object of class '<em>Plus Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus Operator</em>'.
	 * @generated
	 */
	PlusOperator createPlusOperator();

	/**
	 * Returns a new object of class '<em>Implies Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implies Operator</em>'.
	 * @generated
	 */
	ImpliesOperator createImpliesOperator();

	/**
	 * Returns a new object of class '<em>Is Active</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Active</em>'.
	 * @generated
	 */
	IsActive createIsActive();

	/**
	 * Returns a new object of class '<em>Get Allocatables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Allocatables</em>'.
	 * @generated
	 */
	GetAllocatables createGetAllocatables();

	/**
	 * Returns a new object of class '<em>Has Been Displayed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Been Displayed</em>'.
	 * @generated
	 */
	HasBeenDisplayed createHasBeenDisplayed();

	/**
	 * Returns a new object of class '<em>Active State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active State</em>'.
	 * @generated
	 */
	ActiveState createActiveState();

	/**
	 * Returns a new object of class '<em>Object Compare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Compare</em>'.
	 * @generated
	 */
	ObjectCompare createObjectCompare();

	/**
	 * Returns a new object of class '<em>That Of Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>That Of Operator</em>'.
	 * @generated
	 */
	ThatOfOperator createThatOfOperator();

	/**
	 * Returns a new object of class '<em>Max Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Value</em>'.
	 * @generated
	 */
	MaxValue createMaxValue();

	/**
	 * Returns a new object of class '<em>Min Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Value</em>'.
	 * @generated
	 */
	MinValue createMinValue();

	/**
	 * Returns a new object of class '<em>None Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>None Value</em>'.
	 * @generated
	 */
	NoneValue createNoneValue();

	/**
	 * Returns a new object of class '<em>Standard Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Value</em>'.
	 * @generated
	 */
	StandardValue createStandardValue();

	/**
	 * Returns a new object of class '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value</em>'.
	 * @generated
	 */
	IntegerValue createIntegerValue();

	/**
	 * Returns a new object of class '<em>Loser Type Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loser Type Expression</em>'.
	 * @generated
	 */
	LoserTypeExpression createLoserTypeExpression();

	/**
	 * Returns a new object of class '<em>Arbitration Policy Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arbitration Policy Expression</em>'.
	 * @generated
	 */
	ArbitrationPolicyExpression createArbitrationPolicyExpression();

	/**
	 * Returns a new object of class '<em>Size Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Size Operator</em>'.
	 * @generated
	 */
	SizeOperator createSizeOperator();

	/**
	 * Returns a new object of class '<em>Exists Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exists Operator</em>'.
	 * @generated
	 */
	ExistsOperator createExistsOperator();

	/**
	 * Returns a new object of class '<em>For All Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For All Operator</em>'.
	 * @generated
	 */
	ForAllOperator createForAllOperator();

	/**
	 * Returns a new object of class '<em>Max Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Operator</em>'.
	 * @generated
	 */
	MaxOperator createMaxOperator();

	/**
	 * Returns a new object of class '<em>Min Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Operator</em>'.
	 * @generated
	 */
	MinOperator createMinOperator();

	/**
	 * Returns a new object of class '<em>Select Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Operator</em>'.
	 * @generated
	 */
	SelectOperator createSelectOperator();

	/**
	 * Returns a new object of class '<em>Set Of Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Of Operator</em>'.
	 * @generated
	 */
	SetOfOperator createSetOfOperator();

	/**
	 * Returns a new object of class '<em>Lambda Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda Expression</em>'.
	 * @generated
	 */
	LambdaExpression createLambdaExpression();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>Is On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is On</em>'.
	 * @generated
	 */
	IsOn createIsOn();

	/**
	 * Returns a new object of class '<em>Allocated Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocated Content</em>'.
	 * @generated
	 */
	AllocatedContent createAllocatedContent();

	/**
	 * Returns a new object of class '<em>Content Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Value</em>'.
	 * @generated
	 */
	ContentValue createContentValue();

	/**
	 * Returns a new object of class '<em>Get Contents List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Contents List</em>'.
	 * @generated
	 */
	GetContentsList createGetContentsList();

	/**
	 * Returns a new object of class '<em>Active Contents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Contents</em>'.
	 * @generated
	 */
	ActiveContents createActiveContents();

	/**
	 * Returns a new object of class '<em>Get Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Property</em>'.
	 * @generated
	 */
	GetProperty createGetProperty();

	/**
	 * Returns a new object of class '<em>State Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Value</em>'.
	 * @generated
	 */
	StateValue createStateValue();

	/**
	 * Returns a new object of class '<em>Has Come Later Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Come Later Than</em>'.
	 * @generated
	 */
	HasComeLaterThan createHasComeLaterThan();

	/**
	 * Returns a new object of class '<em>Has Come Earlier Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Come Earlier Than</em>'.
	 * @generated
	 */
	HasComeEarlierThan createHasComeEarlierThan();

	/**
	 * Returns a new object of class '<em>Object Compare Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Compare Not</em>'.
	 * @generated
	 */
	ObjectCompareNot createObjectCompareNot();

	/**
	 * Returns a new object of class '<em>Is Allocated To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Allocated To</em>'.
	 * @generated
	 */
	IsAllocatedTo createIsAllocatedTo();

	/**
	 * Returns a new object of class '<em>Is Changed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Changed</em>'.
	 * @generated
	 */
	IsChanged createIsChanged();

	/**
	 * Returns a new object of class '<em>Is Translated To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Translated To</em>'.
	 * @generated
	 */
	IsTranslatedTo createIsTranslatedTo();

	/**
	 * Returns a new object of class '<em>Get State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get State</em>'.
	 * @generated
	 */
	GetState createGetState();

	/**
	 * Returns a new object of class '<em>Null Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Expression</em>'.
	 * @generated
	 */
	NullExpression createNullExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RBACorePackage getRBACorePackage();

} //RBACoreFactory
