/**
 */
package rba.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import rba.core.ActiveContents;
import rba.core.ActiveState;
import rba.core.AllocatedContent;
import rba.core.AndOperator;
import rba.core.ArbitrationPolicy;
import rba.core.ArbitrationPolicyExpression;
import rba.core.ComparisonAnd;
import rba.core.ComplexExpression;
import rba.core.Constraint;
import rba.core.ContentValue;
import rba.core.EqualToOperator;
import rba.core.ExistsOperator;
import rba.core.ExpressionType;
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
import rba.core.LambdaExpression;
import rba.core.LetStatement;
import rba.core.LoserType;
import rba.core.LoserTypeExpression;
import rba.core.LowerThanOperator;
import rba.core.MaxOperator;
import rba.core.MaxValue;
import rba.core.MinOperator;
import rba.core.MinValue;
import rba.core.MuchGreaterThanOperator;
import rba.core.NoneValue;
import rba.core.NotOperator;
import rba.core.NullExpression;
import rba.core.ObjectCompare;
import rba.core.ObjectCompareNot;
import rba.core.ObjectReference;
import rba.core.OrOperator;
import rba.core.PlusOperator;
import rba.core.PreviousModifier;
import rba.core.Project;
import rba.core.RBACoreFactory;
import rba.core.RBACorePackage;
import rba.core.Scene;
import rba.core.SelectOperator;
import rba.core.SetOfOperator;
import rba.core.SizeOperator;
import rba.core.StandardValue;
import rba.core.StateValue;
import rba.core.Stereotype;
import rba.core.Tag;
import rba.core.ThatOfOperator;
import rba.core.Variable;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class RBACoreFactoryImpl extends EFactoryImpl implements RBACoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static RBACoreFactory init() {
		try {
			RBACoreFactory theRBACoreFactory = (RBACoreFactory) EPackage.Registry.INSTANCE
					.getEFactory(RBACorePackage.eNS_URI);
			if (theRBACoreFactory != null) {
				return theRBACoreFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RBACoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBACoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RBACorePackage.PROJECT:
			return createProject();
		case RBACorePackage.PACKAGE:
			return createPackage();
		case RBACorePackage.STEREOTYPE:
			return createStereotype();
		case RBACorePackage.TAG:
			return createTag();
		case RBACorePackage.SCENE:
			return createScene();
		case RBACorePackage.INTEGER_PROPERTY:
			return createIntegerProperty();
		case RBACorePackage.CONSTRAINT:
			return createConstraint();
		case RBACorePackage.LET_STATEMENT:
			return createLetStatement();
		case RBACorePackage.COMPLEX_EXPRESSION:
			return createComplexExpression();
		case RBACorePackage.IS_TYPE_OF:
			return createIsTypeOf();
		case RBACorePackage.OBJECT_REFERENCE:
			return createObjectReference();
		case RBACorePackage.PREVIOUS_MODIFIER:
			return createPreviousModifier();
		case RBACorePackage.GREATER_THAN_OPERATOR:
			return createGreaterThanOperator();
		case RBACorePackage.MUCH_GREATER_THAN_OPERATOR:
			return createMuchGreaterThanOperator();
		case RBACorePackage.LOWER_THAN_OPERATOR:
			return createLowerThanOperator();
		case RBACorePackage.EQUAL_TO_OPERATOR:
			return createEqualToOperator();
		case RBACorePackage.COMPARISON_AND:
			return createComparisonAnd();
		case RBACorePackage.AND_OPERATOR:
			return createAndOperator();
		case RBACorePackage.OR_OPERATOR:
			return createOrOperator();
		case RBACorePackage.NOT_OPERATOR:
			return createNotOperator();
		case RBACorePackage.IS_EQUAL_TO_OPERATOR:
			return createIsEqualToOperator();
		case RBACorePackage.IS_GREATER_THAN_OPERATOR:
			return createIsGreaterThanOperator();
		case RBACorePackage.IS_LOWER_THAN_OPERATOR:
			return createIsLowerThanOperator();
		case RBACorePackage.IS_GREATER_THAN_EQUAL_OPERATOR:
			return createIsGreaterThanEqualOperator();
		case RBACorePackage.IS_LOWER_THAN_EQUAL_OPERATOR:
			return createIsLowerThanEqualOperator();
		case RBACorePackage.PLUS_OPERATOR:
			return createPlusOperator();
		case RBACorePackage.IMPLIES_OPERATOR:
			return createImpliesOperator();
		case RBACorePackage.IS_ACTIVE:
			return createIsActive();
		case RBACorePackage.GET_ALLOCATABLES:
			return createGetAllocatables();
		case RBACorePackage.HAS_BEEN_DISPLAYED:
			return createHasBeenDisplayed();
		case RBACorePackage.ACTIVE_STATE:
			return createActiveState();
		case RBACorePackage.OBJECT_COMPARE:
			return createObjectCompare();
		case RBACorePackage.THAT_OF_OPERATOR:
			return createThatOfOperator();
		case RBACorePackage.MAX_VALUE:
			return createMaxValue();
		case RBACorePackage.MIN_VALUE:
			return createMinValue();
		case RBACorePackage.NONE_VALUE:
			return createNoneValue();
		case RBACorePackage.STANDARD_VALUE:
			return createStandardValue();
		case RBACorePackage.INTEGER_VALUE:
			return createIntegerValue();
		case RBACorePackage.LOSER_TYPE_EXPRESSION:
			return createLoserTypeExpression();
		case RBACorePackage.ARBITRATION_POLICY_EXPRESSION:
			return createArbitrationPolicyExpression();
		case RBACorePackage.SIZE_OPERATOR:
			return createSizeOperator();
		case RBACorePackage.EXISTS_OPERATOR:
			return createExistsOperator();
		case RBACorePackage.FOR_ALL_OPERATOR:
			return createForAllOperator();
		case RBACorePackage.MAX_OPERATOR:
			return createMaxOperator();
		case RBACorePackage.MIN_OPERATOR:
			return createMinOperator();
		case RBACorePackage.SELECT_OPERATOR:
			return createSelectOperator();
		case RBACorePackage.SET_OF_OPERATOR:
			return createSetOfOperator();
		case RBACorePackage.LAMBDA_EXPRESSION:
			return createLambdaExpression();
		case RBACorePackage.VARIABLE:
			return createVariable();
		case RBACorePackage.IF_STATEMENT:
			return createIfStatement();
		case RBACorePackage.IS_ON:
			return createIsOn();
		case RBACorePackage.ALLOCATED_CONTENT:
			return createAllocatedContent();
		case RBACorePackage.CONTENT_VALUE:
			return createContentValue();
		case RBACorePackage.GET_CONTENTS_LIST:
			return createGetContentsList();
		case RBACorePackage.ACTIVE_CONTENTS:
			return createActiveContents();
		case RBACorePackage.GET_PROPERTY:
			return createGetProperty();
		case RBACorePackage.STATE_VALUE:
			return createStateValue();
		case RBACorePackage.HAS_COME_LATER_THAN:
			return createHasComeLaterThan();
		case RBACorePackage.HAS_COME_EARLIER_THAN:
			return createHasComeEarlierThan();
		case RBACorePackage.OBJECT_COMPARE_NOT:
			return createObjectCompareNot();
		case RBACorePackage.IS_ALLOCATED_TO:
			return createIsAllocatedTo();
		case RBACorePackage.IS_CHANGED:
			return createIsChanged();
		case RBACorePackage.IS_TRANSLATED_TO:
			return createIsTranslatedTo();
		case RBACorePackage.GET_STATE:
			return createGetState();
		case RBACorePackage.NULL_EXPRESSION:
			return createNullExpression();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RBACorePackage.ARBITRATION_POLICY:
			return createArbitrationPolicyFromString(eDataType, initialValue);
		case RBACorePackage.EXPRESSION_TYPE:
			return createExpressionTypeFromString(eDataType, initialValue);
		case RBACorePackage.LOSER_TYPE:
			return createLoserTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RBACorePackage.ARBITRATION_POLICY:
			return convertArbitrationPolicyToString(eDataType, instanceValue);
		case RBACorePackage.EXPRESSION_TYPE:
			return convertExpressionTypeToString(eDataType, instanceValue);
		case RBACorePackage.LOSER_TYPE:
			return convertLoserTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public rba.core.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype createStereotype() {
		StereotypeImpl stereotype = new StereotypeImpl();
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Scene createScene() {
		SceneImpl scene = new SceneImpl();
		return scene;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerProperty createIntegerProperty() {
		IntegerPropertyImpl integerProperty = new IntegerPropertyImpl();
		return integerProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LetStatement createLetStatement() {
		LetStatementImpl letStatement = new LetStatementImpl();
		return letStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexExpression createComplexExpression() {
		ComplexExpressionImpl complexExpression = new ComplexExpressionImpl();
		return complexExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsTypeOf createIsTypeOf() {
		IsTypeOfImpl isTypeOf = new IsTypeOfImpl();
		return isTypeOf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectReference createObjectReference() {
		ObjectReferenceImpl objectReference = new ObjectReferenceImpl();
		return objectReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PreviousModifier createPreviousModifier() {
		PreviousModifierImpl previousModifier = new PreviousModifierImpl();
		return previousModifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThanOperator createGreaterThanOperator() {
		GreaterThanOperatorImpl greaterThanOperator = new GreaterThanOperatorImpl();
		return greaterThanOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MuchGreaterThanOperator createMuchGreaterThanOperator() {
		MuchGreaterThanOperatorImpl muchGreaterThanOperator = new MuchGreaterThanOperatorImpl();
		return muchGreaterThanOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LowerThanOperator createLowerThanOperator() {
		LowerThanOperatorImpl lowerThanOperator = new LowerThanOperatorImpl();
		return lowerThanOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EqualToOperator createEqualToOperator() {
		EqualToOperatorImpl equalToOperator = new EqualToOperatorImpl();
		return equalToOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonAnd createComparisonAnd() {
		ComparisonAndImpl comparisonAnd = new ComparisonAndImpl();
		return comparisonAnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AndOperator createAndOperator() {
		AndOperatorImpl andOperator = new AndOperatorImpl();
		return andOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OrOperator createOrOperator() {
		OrOperatorImpl orOperator = new OrOperatorImpl();
		return orOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotOperator createNotOperator() {
		NotOperatorImpl notOperator = new NotOperatorImpl();
		return notOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsEqualToOperator createIsEqualToOperator() {
		IsEqualToOperatorImpl isEqualToOperator = new IsEqualToOperatorImpl();
		return isEqualToOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsGreaterThanOperator createIsGreaterThanOperator() {
		IsGreaterThanOperatorImpl isGreaterThanOperator = new IsGreaterThanOperatorImpl();
		return isGreaterThanOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsLowerThanOperator createIsLowerThanOperator() {
		IsLowerThanOperatorImpl isLowerThanOperator = new IsLowerThanOperatorImpl();
		return isLowerThanOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsGreaterThanEqualOperator createIsGreaterThanEqualOperator() {
		IsGreaterThanEqualOperatorImpl isGreaterThanEqualOperator = new IsGreaterThanEqualOperatorImpl();
		return isGreaterThanEqualOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsLowerThanEqualOperator createIsLowerThanEqualOperator() {
		IsLowerThanEqualOperatorImpl isLowerThanEqualOperator = new IsLowerThanEqualOperatorImpl();
		return isLowerThanEqualOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PlusOperator createPlusOperator() {
		PlusOperatorImpl plusOperator = new PlusOperatorImpl();
		return plusOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ImpliesOperator createImpliesOperator() {
		ImpliesOperatorImpl impliesOperator = new ImpliesOperatorImpl();
		return impliesOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsActive createIsActive() {
		IsActiveImpl isActive = new IsActiveImpl();
		return isActive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GetAllocatables createGetAllocatables() {
		GetAllocatablesImpl getAllocatables = new GetAllocatablesImpl();
		return getAllocatables;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HasBeenDisplayed createHasBeenDisplayed() {
		HasBeenDisplayedImpl hasBeenDisplayed = new HasBeenDisplayedImpl();
		return hasBeenDisplayed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveState createActiveState() {
		ActiveStateImpl activeState = new ActiveStateImpl();
		return activeState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectCompare createObjectCompare() {
		ObjectCompareImpl objectCompare = new ObjectCompareImpl();
		return objectCompare;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ThatOfOperator createThatOfOperator() {
		ThatOfOperatorImpl thatOfOperator = new ThatOfOperatorImpl();
		return thatOfOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MaxValue createMaxValue() {
		MaxValueImpl maxValue = new MaxValueImpl();
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MinValue createMinValue() {
		MinValueImpl minValue = new MinValueImpl();
		return minValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NoneValue createNoneValue() {
		NoneValueImpl noneValue = new NoneValueImpl();
		return noneValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StandardValue createStandardValue() {
		StandardValueImpl standardValue = new StandardValueImpl();
		return standardValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LoserTypeExpression createLoserTypeExpression() {
		LoserTypeExpressionImpl loserTypeExpression = new LoserTypeExpressionImpl();
		return loserTypeExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitrationPolicyExpression createArbitrationPolicyExpression() {
		ArbitrationPolicyExpressionImpl arbitrationPolicyExpression = new ArbitrationPolicyExpressionImpl();
		return arbitrationPolicyExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SizeOperator createSizeOperator() {
		SizeOperatorImpl sizeOperator = new SizeOperatorImpl();
		return sizeOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExistsOperator createExistsOperator() {
		ExistsOperatorImpl existsOperator = new ExistsOperatorImpl();
		return existsOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ForAllOperator createForAllOperator() {
		ForAllOperatorImpl forAllOperator = new ForAllOperatorImpl();
		return forAllOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MaxOperator createMaxOperator() {
		MaxOperatorImpl maxOperator = new MaxOperatorImpl();
		return maxOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MinOperator createMinOperator() {
		MinOperatorImpl minOperator = new MinOperatorImpl();
		return minOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SelectOperator createSelectOperator() {
		SelectOperatorImpl selectOperator = new SelectOperatorImpl();
		return selectOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SetOfOperator createSetOfOperator() {
		SetOfOperatorImpl setOfOperator = new SetOfOperatorImpl();
		return setOfOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaExpression createLambdaExpression() {
		LambdaExpressionImpl lambdaExpression = new LambdaExpressionImpl();
		return lambdaExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsOn createIsOn() {
		IsOnImpl isOn = new IsOnImpl();
		return isOn;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AllocatedContent createAllocatedContent() {
		AllocatedContentImpl allocatedContent = new AllocatedContentImpl();
		return allocatedContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ContentValue createContentValue() {
		ContentValueImpl contentValue = new ContentValueImpl();
		return contentValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GetContentsList createGetContentsList() {
		GetContentsListImpl getContentsList = new GetContentsListImpl();
		return getContentsList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveContents createActiveContents() {
		ActiveContentsImpl activeContents = new ActiveContentsImpl();
		return activeContents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GetProperty createGetProperty() {
		GetPropertyImpl getProperty = new GetPropertyImpl();
		return getProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StateValue createStateValue() {
		StateValueImpl stateValue = new StateValueImpl();
		return stateValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HasComeLaterThan createHasComeLaterThan() {
		HasComeLaterThanImpl hasComeLaterThan = new HasComeLaterThanImpl();
		return hasComeLaterThan;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HasComeEarlierThan createHasComeEarlierThan() {
		HasComeEarlierThanImpl hasComeEarlierThan = new HasComeEarlierThanImpl();
		return hasComeEarlierThan;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectCompareNot createObjectCompareNot() {
		ObjectCompareNotImpl objectCompareNot = new ObjectCompareNotImpl();
		return objectCompareNot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsAllocatedTo createIsAllocatedTo() {
		IsAllocatedToImpl isAllocatedTo = new IsAllocatedToImpl();
		return isAllocatedTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsChanged createIsChanged() {
		IsChangedImpl isChanged = new IsChangedImpl();
		return isChanged;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IsTranslatedTo createIsTranslatedTo() {
		IsTranslatedToImpl isTranslatedTo = new IsTranslatedToImpl();
		return isTranslatedTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GetState createGetState() {
		GetStateImpl getState = new GetStateImpl();
		return getState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullExpression createNullExpression() {
		NullExpressionImpl nullExpression = new NullExpressionImpl();
		return nullExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitrationPolicy createArbitrationPolicyFromString(EDataType eDataType, String initialValue) {
		ArbitrationPolicy result = ArbitrationPolicy.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArbitrationPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionType createExpressionTypeFromString(EDataType eDataType, String initialValue) {
		ExpressionType result = ExpressionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LoserType createLoserTypeFromString(EDataType eDataType, String initialValue) {
		LoserType result = LoserType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoserTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBACorePackage getRBACorePackage() {
		return (RBACorePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RBACorePackage getPackage() {
		return RBACorePackage.eINSTANCE;
	}

} // RBACoreFactoryImpl
