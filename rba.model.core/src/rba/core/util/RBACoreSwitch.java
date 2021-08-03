/**
 */
package rba.core.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model, starting
 * with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is returned, which is
 * the result of the switch. <!-- end-user-doc -->
 * @see rba.core.RBACorePackage
 * @generated
 */
public class RBACoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static RBACorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RBACoreSwitch() {
		if (modelPackage == null) {
			modelPackage = RBACorePackage.eINSTANCE;
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
		case RBACorePackage.MODEL_ELEMENT: {
			ModelElement modelElement = (ModelElement) theEObject;
			T result = caseModelElement(modelElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = caseModelElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ABSTRACT_ALLOCATABLE: {
			AbstractAllocatable abstractAllocatable = (AbstractAllocatable) theEObject;
			T result = caseAbstractAllocatable(abstractAllocatable);
			if (result == null)
				result = caseRuleObject(abstractAllocatable);
			if (result == null)
				result = casePackagableElement(abstractAllocatable);
			if (result == null)
				result = caseNamedElement(abstractAllocatable);
			if (result == null)
				result = caseModelElement(abstractAllocatable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ALLOCATABLE: {
			Allocatable allocatable = (Allocatable) theEObject;
			T result = caseAllocatable(allocatable);
			if (result == null)
				result = caseAbstractAllocatable(allocatable);
			if (result == null)
				result = caseRuleObject(allocatable);
			if (result == null)
				result = casePackagableElement(allocatable);
			if (result == null)
				result = caseNamedElement(allocatable);
			if (result == null)
				result = caseModelElement(allocatable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ALLOCATABLE_SET: {
			AllocatableSet allocatableSet = (AllocatableSet) theEObject;
			T result = caseAllocatableSet(allocatableSet);
			if (result == null)
				result = caseAbstractAllocatable(allocatableSet);
			if (result == null)
				result = caseRuleObject(allocatableSet);
			if (result == null)
				result = casePackagableElement(allocatableSet);
			if (result == null)
				result = caseNamedElement(allocatableSet);
			if (result == null)
				result = caseModelElement(allocatableSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.PROJECT: {
			Project project = (Project) theEObject;
			T result = caseProject(project);
			if (result == null)
				result = casePackage(project);
			if (result == null)
				result = casePackagableElement(project);
			if (result == null)
				result = caseNamedElement(project);
			if (result == null)
				result = caseModelElement(project);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.PACKAGABLE_ELEMENT: {
			PackagableElement packagableElement = (PackagableElement) theEObject;
			T result = casePackagableElement(packagableElement);
			if (result == null)
				result = caseNamedElement(packagableElement);
			if (result == null)
				result = caseModelElement(packagableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.PACKAGE: {
			rba.core.Package package_ = (rba.core.Package) theEObject;
			T result = casePackage(package_);
			if (result == null)
				result = casePackagableElement(package_);
			if (result == null)
				result = caseNamedElement(package_);
			if (result == null)
				result = caseModelElement(package_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.STEREOTYPE: {
			Stereotype stereotype = (Stereotype) theEObject;
			T result = caseStereotype(stereotype);
			if (result == null)
				result = casePackagableElement(stereotype);
			if (result == null)
				result = caseNamedElement(stereotype);
			if (result == null)
				result = caseModelElement(stereotype);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.TAG: {
			Tag tag = (Tag) theEObject;
			T result = caseTag(tag);
			if (result == null)
				result = caseNamedElement(tag);
			if (result == null)
				result = caseModelElement(tag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.RULE_OBJECT: {
			RuleObject ruleObject = (RuleObject) theEObject;
			T result = caseRuleObject(ruleObject);
			if (result == null)
				result = casePackagableElement(ruleObject);
			if (result == null)
				result = caseNamedElement(ruleObject);
			if (result == null)
				result = caseModelElement(ruleObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ABSTRACT_CONTENT: {
			AbstractContent abstractContent = (AbstractContent) theEObject;
			T result = caseAbstractContent(abstractContent);
			if (result == null)
				result = caseRuleObject(abstractContent);
			if (result == null)
				result = casePackagableElement(abstractContent);
			if (result == null)
				result = caseNamedElement(abstractContent);
			if (result == null)
				result = caseModelElement(abstractContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ABSTRACT_SCENE: {
			AbstractScene abstractScene = (AbstractScene) theEObject;
			T result = caseAbstractScene(abstractScene);
			if (result == null)
				result = caseRuleObject(abstractScene);
			if (result == null)
				result = casePackagableElement(abstractScene);
			if (result == null)
				result = caseNamedElement(abstractScene);
			if (result == null)
				result = caseModelElement(abstractScene);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.SCENE: {
			Scene scene = (Scene) theEObject;
			T result = caseScene(scene);
			if (result == null)
				result = caseAbstractScene(scene);
			if (result == null)
				result = caseRuleObject(scene);
			if (result == null)
				result = casePackagableElement(scene);
			if (result == null)
				result = caseNamedElement(scene);
			if (result == null)
				result = caseModelElement(scene);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.CONTENT: {
			Content content = (Content) theEObject;
			T result = caseContent(content);
			if (result == null)
				result = caseAbstractContent(content);
			if (result == null)
				result = caseRuleObject(content);
			if (result == null)
				result = casePackagableElement(content);
			if (result == null)
				result = caseNamedElement(content);
			if (result == null)
				result = caseModelElement(content);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.CONTENT_SET: {
			ContentSet contentSet = (ContentSet) theEObject;
			T result = caseContentSet(contentSet);
			if (result == null)
				result = caseAbstractContent(contentSet);
			if (result == null)
				result = caseRuleObject(contentSet);
			if (result == null)
				result = casePackagableElement(contentSet);
			if (result == null)
				result = caseNamedElement(contentSet);
			if (result == null)
				result = caseModelElement(contentSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.CONTENT_STATE: {
			ContentState contentState = (ContentState) theEObject;
			T result = caseContentState(contentState);
			if (result == null)
				result = caseRuleObject(contentState);
			if (result == null)
				result = casePackagableElement(contentState);
			if (result == null)
				result = caseNamedElement(contentState);
			if (result == null)
				result = caseModelElement(contentState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ABSTRACT_PROPERTY: {
			AbstractProperty abstractProperty = (AbstractProperty) theEObject;
			T result = caseAbstractProperty(abstractProperty);
			if (result == null)
				result = caseRuleObject(abstractProperty);
			if (result == null)
				result = casePackagableElement(abstractProperty);
			if (result == null)
				result = caseNamedElement(abstractProperty);
			if (result == null)
				result = caseModelElement(abstractProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.INTEGER_PROPERTY: {
			IntegerProperty integerProperty = (IntegerProperty) theEObject;
			T result = caseIntegerProperty(integerProperty);
			if (result == null)
				result = caseAbstractProperty(integerProperty);
			if (result == null)
				result = caseRuleObject(integerProperty);
			if (result == null)
				result = casePackagableElement(integerProperty);
			if (result == null)
				result = caseNamedElement(integerProperty);
			if (result == null)
				result = caseModelElement(integerProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ABSTRACT_CONSTRAINT: {
			AbstractConstraint abstractConstraint = (AbstractConstraint) theEObject;
			T result = caseAbstractConstraint(abstractConstraint);
			if (result == null)
				result = casePackagableElement(abstractConstraint);
			if (result == null)
				result = caseNamedElement(abstractConstraint);
			if (result == null)
				result = caseModelElement(abstractConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.CONSTRAINT: {
			Constraint constraint = (Constraint) theEObject;
			T result = caseConstraint(constraint);
			if (result == null)
				result = caseAbstractConstraint(constraint);
			if (result == null)
				result = casePackagableElement(constraint);
			if (result == null)
				result = caseNamedElement(constraint);
			if (result == null)
				result = caseModelElement(constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.LET_STATEMENT: {
			LetStatement letStatement = (LetStatement) theEObject;
			T result = caseLetStatement(letStatement);
			if (result == null)
				result = caseModelElement(letStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.COMPLEX_EXPRESSION: {
			ComplexExpression complexExpression = (ComplexExpression) theEObject;
			T result = caseComplexExpression(complexExpression);
			if (result == null)
				result = caseExpression(complexExpression);
			if (result == null)
				result = caseSugarExpressionBase(complexExpression);
			if (result == null)
				result = caseSugarExpression(complexExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.OPERATOR: {
			Operator operator = (Operator) theEObject;
			T result = caseOperator(operator);
			if (result == null)
				result = caseExpression(operator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.IS_TYPE_OF: {
			IsTypeOf isTypeOf = (IsTypeOf) theEObject;
			T result = caseIsTypeOf(isTypeOf);
			if (result == null)
				result = caseOperator(isTypeOf);
			if (result == null)
				result = caseExpression(isTypeOf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.OBJECT_REFERENCE: {
			ObjectReference objectReference = (ObjectReference) theEObject;
			T result = caseObjectReference(objectReference);
			if (result == null)
				result = caseExpression(objectReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.PREVIOUS_MODIFIER: {
			PreviousModifier previousModifier = (PreviousModifier) theEObject;
			T result = casePreviousModifier(previousModifier);
			if (result == null)
				result = caseExpression(previousModifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.GREATER_THAN_OPERATOR: {
			GreaterThanOperator greaterThanOperator = (GreaterThanOperator) theEObject;
			T result = caseGreaterThanOperator(greaterThanOperator);
			if (result == null)
				result = caseComparisonOperator(greaterThanOperator);
			if (result == null)
				result = caseOperator(greaterThanOperator);
			if (result == null)
				result = caseExpression(greaterThanOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.MUCH_GREATER_THAN_OPERATOR: {
			MuchGreaterThanOperator muchGreaterThanOperator = (MuchGreaterThanOperator) theEObject;
			T result = caseMuchGreaterThanOperator(muchGreaterThanOperator);
			if (result == null)
				result = caseComparisonOperator(muchGreaterThanOperator);
			if (result == null)
				result = caseOperator(muchGreaterThanOperator);
			if (result == null)
				result = caseExpression(muchGreaterThanOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.LOWER_THAN_OPERATOR: {
			LowerThanOperator lowerThanOperator = (LowerThanOperator) theEObject;
			T result = caseLowerThanOperator(lowerThanOperator);
			if (result == null)
				result = caseComparisonOperator(lowerThanOperator);
			if (result == null)
				result = caseOperator(lowerThanOperator);
			if (result == null)
				result = caseExpression(lowerThanOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.COMPARISON_OPERATOR: {
			ComparisonOperator comparisonOperator = (ComparisonOperator) theEObject;
			T result = caseComparisonOperator(comparisonOperator);
			if (result == null)
				result = caseOperator(comparisonOperator);
			if (result == null)
				result = caseExpression(comparisonOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.EQUAL_TO_OPERATOR: {
			EqualToOperator equalToOperator = (EqualToOperator) theEObject;
			T result = caseEqualToOperator(equalToOperator);
			if (result == null)
				result = caseComparisonOperator(equalToOperator);
			if (result == null)
				result = caseOperator(equalToOperator);
			if (result == null)
				result = caseExpression(equalToOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.COMPARISON_AND: {
			ComparisonAnd comparisonAnd = (ComparisonAnd) theEObject;
			T result = caseComparisonAnd(comparisonAnd);
			if (result == null)
				result = caseComparisonOperator(comparisonAnd);
			if (result == null)
				result = caseOperator(comparisonAnd);
			if (result == null)
				result = caseExpression(comparisonAnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.LOGICAL_OPERATOR: {
			LogicalOperator logicalOperator = (LogicalOperator) theEObject;
			T result = caseLogicalOperator(logicalOperator);
			if (result == null)
				result = caseOperator(logicalOperator);
			if (result == null)
				result = caseExpression(logicalOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.AND_OPERATOR: {
			AndOperator andOperator = (AndOperator) theEObject;
			T result = caseAndOperator(andOperator);
			if (result == null)
				result = caseLogicalOperator(andOperator);
			if (result == null)
				result = caseOperator(andOperator);
			if (result == null)
				result = caseExpression(andOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.OR_OPERATOR: {
			OrOperator orOperator = (OrOperator) theEObject;
			T result = caseOrOperator(orOperator);
			if (result == null)
				result = caseLogicalOperator(orOperator);
			if (result == null)
				result = caseOperator(orOperator);
			if (result == null)
				result = caseExpression(orOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.NOT_OPERATOR: {
			NotOperator notOperator = (NotOperator) theEObject;
			T result = caseNotOperator(notOperator);
			if (result == null)
				result = caseLogicalOperator(notOperator);
			if (result == null)
				result = caseOperator(notOperator);
			if (result == null)
				result = caseExpression(notOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.IS_EQUAL_TO_OPERATOR: {
			IsEqualToOperator isEqualToOperator = (IsEqualToOperator) theEObject;
			T result = caseIsEqualToOperator(isEqualToOperator);
			if (result == null)
				result = caseLogicalOperator(isEqualToOperator);
			if (result == null)
				result = caseOperator(isEqualToOperator);
			if (result == null)
				result = caseExpression(isEqualToOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.IS_GREATER_THAN_OPERATOR: {
			IsGreaterThanOperator isGreaterThanOperator = (IsGreaterThanOperator) theEObject;
			T result = caseIsGreaterThanOperator(isGreaterThanOperator);
			if (result == null)
				result = caseLogicalOperator(isGreaterThanOperator);
			if (result == null)
				result = caseOperator(isGreaterThanOperator);
			if (result == null)
				result = caseExpression(isGreaterThanOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.IS_LOWER_THAN_OPERATOR: {
			IsLowerThanOperator isLowerThanOperator = (IsLowerThanOperator) theEObject;
			T result = caseIsLowerThanOperator(isLowerThanOperator);
			if (result == null)
				result = caseLogicalOperator(isLowerThanOperator);
			if (result == null)
				result = caseOperator(isLowerThanOperator);
			if (result == null)
				result = caseExpression(isLowerThanOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.IS_GREATER_THAN_EQUAL_OPERATOR: {
			IsGreaterThanEqualOperator isGreaterThanEqualOperator = (IsGreaterThanEqualOperator) theEObject;
			T result = caseIsGreaterThanEqualOperator(isGreaterThanEqualOperator);
			if (result == null)
				result = caseLogicalOperator(isGreaterThanEqualOperator);
			if (result == null)
				result = caseOperator(isGreaterThanEqualOperator);
			if (result == null)
				result = caseExpression(isGreaterThanEqualOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.IS_LOWER_THAN_EQUAL_OPERATOR: {
			IsLowerThanEqualOperator isLowerThanEqualOperator = (IsLowerThanEqualOperator) theEObject;
			T result = caseIsLowerThanEqualOperator(isLowerThanEqualOperator);
			if (result == null)
				result = caseLogicalOperator(isLowerThanEqualOperator);
			if (result == null)
				result = caseOperator(isLowerThanEqualOperator);
			if (result == null)
				result = caseExpression(isLowerThanEqualOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ARITHMETIC_OPERATOR: {
			ArithmeticOperator arithmeticOperator = (ArithmeticOperator) theEObject;
			T result = caseArithmeticOperator(arithmeticOperator);
			if (result == null)
				result = caseOperator(arithmeticOperator);
			if (result == null)
				result = caseExpression(arithmeticOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.PLUS_OPERATOR: {
			PlusOperator plusOperator = (PlusOperator) theEObject;
			T result = casePlusOperator(plusOperator);
			if (result == null)
				result = caseArithmeticOperator(plusOperator);
			if (result == null)
				result = caseOperator(plusOperator);
			if (result == null)
				result = caseExpression(plusOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.IMPLIES_OPERATOR: {
			ImpliesOperator impliesOperator = (ImpliesOperator) theEObject;
			T result = caseImpliesOperator(impliesOperator);
			if (result == null)
				result = caseLogicalOperator(impliesOperator);
			if (result == null)
				result = caseOperator(impliesOperator);
			if (result == null)
				result = caseExpression(impliesOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.CONTENT_OPERATOR: {
			ContentOperator contentOperator = (ContentOperator) theEObject;
			T result = caseContentOperator(contentOperator);
			if (result == null)
				result = caseOperator(contentOperator);
			if (result == null)
				result = caseExpression(contentOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.IS_ACTIVE: {
			IsActive isActive = (IsActive) theEObject;
			T result = caseIsActive(isActive);
			if (result == null)
				result = caseContentOperator(isActive);
			if (result == null)
				result = caseOperator(isActive);
			if (result == null)
				result = caseExpression(isActive);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.GET_ALLOCATABLES: {
			GetAllocatables getAllocatables = (GetAllocatables) theEObject;
			T result = caseGetAllocatables(getAllocatables);
			if (result == null)
				result = caseContentOperator(getAllocatables);
			if (result == null)
				result = caseOperator(getAllocatables);
			if (result == null)
				result = caseExpression(getAllocatables);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.HAS_BEEN_DISPLAYED: {
			HasBeenDisplayed hasBeenDisplayed = (HasBeenDisplayed) theEObject;
			T result = caseHasBeenDisplayed(hasBeenDisplayed);
			if (result == null)
				result = caseContentOperator(hasBeenDisplayed);
			if (result == null)
				result = caseOperator(hasBeenDisplayed);
			if (result == null)
				result = caseExpression(hasBeenDisplayed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ACTIVE_STATE: {
			ActiveState activeState = (ActiveState) theEObject;
			T result = caseActiveState(activeState);
			if (result == null)
				result = caseContentOperator(activeState);
			if (result == null)
				result = caseOperator(activeState);
			if (result == null)
				result = caseExpression(activeState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.OBJECT_COMPARE: {
			ObjectCompare objectCompare = (ObjectCompare) theEObject;
			T result = caseObjectCompare(objectCompare);
			if (result == null)
				result = caseOperator(objectCompare);
			if (result == null)
				result = caseExpression(objectCompare);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.THAT_OF_OPERATOR: {
			ThatOfOperator thatOfOperator = (ThatOfOperator) theEObject;
			T result = caseThatOfOperator(thatOfOperator);
			if (result == null)
				result = caseOperator(thatOfOperator);
			if (result == null)
				result = caseExpression(thatOfOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.VALUE_EXPRESSION: {
			ValueExpression valueExpression = (ValueExpression) theEObject;
			T result = caseValueExpression(valueExpression);
			if (result == null)
				result = caseExpression(valueExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.MAX_VALUE: {
			MaxValue maxValue = (MaxValue) theEObject;
			T result = caseMaxValue(maxValue);
			if (result == null)
				result = caseValueExpression(maxValue);
			if (result == null)
				result = caseExpression(maxValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.MIN_VALUE: {
			MinValue minValue = (MinValue) theEObject;
			T result = caseMinValue(minValue);
			if (result == null)
				result = caseValueExpression(minValue);
			if (result == null)
				result = caseExpression(minValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.NONE_VALUE: {
			NoneValue noneValue = (NoneValue) theEObject;
			T result = caseNoneValue(noneValue);
			if (result == null)
				result = caseValueExpression(noneValue);
			if (result == null)
				result = caseExpression(noneValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.STANDARD_VALUE: {
			StandardValue standardValue = (StandardValue) theEObject;
			T result = caseStandardValue(standardValue);
			if (result == null)
				result = caseValueExpression(standardValue);
			if (result == null)
				result = caseExpression(standardValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.INTEGER_VALUE: {
			IntegerValue integerValue = (IntegerValue) theEObject;
			T result = caseIntegerValue(integerValue);
			if (result == null)
				result = caseValueExpression(integerValue);
			if (result == null)
				result = caseExpression(integerValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ENUM_EXPRESSION: {
			EnumExpression enumExpression = (EnumExpression) theEObject;
			T result = caseEnumExpression(enumExpression);
			if (result == null)
				result = caseExpression(enumExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.LOSER_TYPE_EXPRESSION: {
			LoserTypeExpression loserTypeExpression = (LoserTypeExpression) theEObject;
			T result = caseLoserTypeExpression(loserTypeExpression);
			if (result == null)
				result = caseEnumExpression(loserTypeExpression);
			if (result == null)
				result = caseExpression(loserTypeExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ARBITRATION_POLICY_EXPRESSION: {
			ArbitrationPolicyExpression arbitrationPolicyExpression = (ArbitrationPolicyExpression) theEObject;
			T result = caseArbitrationPolicyExpression(arbitrationPolicyExpression);
			if (result == null)
				result = caseEnumExpression(arbitrationPolicyExpression);
			if (result == null)
				result = caseExpression(arbitrationPolicyExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.SET_EXPRESSION: {
			SetExpression setExpression = (SetExpression) theEObject;
			T result = caseSetExpression(setExpression);
			if (result == null)
				result = caseExpression(setExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.SET_OPERATOR: {
			SetOperator setOperator = (SetOperator) theEObject;
			T result = caseSetOperator(setOperator);
			if (result == null)
				result = caseOperator(setOperator);
			if (result == null)
				result = caseExpression(setOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.SIZE_OPERATOR: {
			SizeOperator sizeOperator = (SizeOperator) theEObject;
			T result = caseSizeOperator(sizeOperator);
			if (result == null)
				result = caseSetOperator(sizeOperator);
			if (result == null)
				result = caseOperator(sizeOperator);
			if (result == null)
				result = caseExpression(sizeOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.EXISTS_OPERATOR: {
			ExistsOperator existsOperator = (ExistsOperator) theEObject;
			T result = caseExistsOperator(existsOperator);
			if (result == null)
				result = caseLambdaContext(existsOperator);
			if (result == null)
				result = caseSetOperator(existsOperator);
			if (result == null)
				result = caseOperator(existsOperator);
			if (result == null)
				result = caseExpression(existsOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.FOR_ALL_OPERATOR: {
			ForAllOperator forAllOperator = (ForAllOperator) theEObject;
			T result = caseForAllOperator(forAllOperator);
			if (result == null)
				result = caseLambdaContext(forAllOperator);
			if (result == null)
				result = caseSetOperator(forAllOperator);
			if (result == null)
				result = caseOperator(forAllOperator);
			if (result == null)
				result = caseExpression(forAllOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.MAX_OPERATOR: {
			MaxOperator maxOperator = (MaxOperator) theEObject;
			T result = caseMaxOperator(maxOperator);
			if (result == null)
				result = caseLambdaContext(maxOperator);
			if (result == null)
				result = caseSetOperator(maxOperator);
			if (result == null)
				result = caseOperator(maxOperator);
			if (result == null)
				result = caseExpression(maxOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.MIN_OPERATOR: {
			MinOperator minOperator = (MinOperator) theEObject;
			T result = caseMinOperator(minOperator);
			if (result == null)
				result = caseLambdaContext(minOperator);
			if (result == null)
				result = caseSetOperator(minOperator);
			if (result == null)
				result = caseOperator(minOperator);
			if (result == null)
				result = caseExpression(minOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.SELECT_OPERATOR: {
			SelectOperator selectOperator = (SelectOperator) theEObject;
			T result = caseSelectOperator(selectOperator);
			if (result == null)
				result = caseLambdaContext(selectOperator);
			if (result == null)
				result = caseSetOperator(selectOperator);
			if (result == null)
				result = caseOperator(selectOperator);
			if (result == null)
				result = caseExpression(selectOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.SET_OF_OPERATOR: {
			SetOfOperator setOfOperator = (SetOfOperator) theEObject;
			T result = caseSetOfOperator(setOfOperator);
			if (result == null)
				result = caseOperator(setOfOperator);
			if (result == null)
				result = caseExpression(setOfOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.LAMBDA_EXPRESSION: {
			LambdaExpression lambdaExpression = (LambdaExpression) theEObject;
			T result = caseLambdaExpression(lambdaExpression);
			if (result == null)
				result = caseExpression(lambdaExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseRuleObject(variable);
			if (result == null)
				result = casePackagableElement(variable);
			if (result == null)
				result = caseNamedElement(variable);
			if (result == null)
				result = caseModelElement(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.LAMBDA_CONTEXT: {
			LambdaContext lambdaContext = (LambdaContext) theEObject;
			T result = caseLambdaContext(lambdaContext);
			if (result == null)
				result = caseSetOperator(lambdaContext);
			if (result == null)
				result = caseOperator(lambdaContext);
			if (result == null)
				result = caseExpression(lambdaContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.IF_STATEMENT: {
			IfStatement ifStatement = (IfStatement) theEObject;
			T result = caseIfStatement(ifStatement);
			if (result == null)
				result = caseExpression(ifStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.SCENE_OPERATOR: {
			SceneOperator sceneOperator = (SceneOperator) theEObject;
			T result = caseSceneOperator(sceneOperator);
			if (result == null)
				result = caseOperator(sceneOperator);
			if (result == null)
				result = caseExpression(sceneOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.IS_ON: {
			IsOn isOn = (IsOn) theEObject;
			T result = caseIsOn(isOn);
			if (result == null)
				result = caseSceneOperator(isOn);
			if (result == null)
				result = caseOperator(isOn);
			if (result == null)
				result = caseExpression(isOn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ALLOCATABLE_OPERATOR: {
			AllocatableOperator allocatableOperator = (AllocatableOperator) theEObject;
			T result = caseAllocatableOperator(allocatableOperator);
			if (result == null)
				result = caseOperator(allocatableOperator);
			if (result == null)
				result = caseExpression(allocatableOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ALLOCATED_CONTENT: {
			AllocatedContent allocatedContent = (AllocatedContent) theEObject;
			T result = caseAllocatedContent(allocatedContent);
			if (result == null)
				result = caseAllocatableOperator(allocatedContent);
			if (result == null)
				result = caseOperator(allocatedContent);
			if (result == null)
				result = caseExpression(allocatedContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.CONTENT_VALUE: {
			ContentValue contentValue = (ContentValue) theEObject;
			T result = caseContentValue(contentValue);
			if (result == null)
				result = caseAllocatableOperator(contentValue);
			if (result == null)
				result = caseOperator(contentValue);
			if (result == null)
				result = caseExpression(contentValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.GET_CONTENTS_LIST: {
			GetContentsList getContentsList = (GetContentsList) theEObject;
			T result = caseGetContentsList(getContentsList);
			if (result == null)
				result = caseAllocatableOperator(getContentsList);
			if (result == null)
				result = caseOperator(getContentsList);
			if (result == null)
				result = caseExpression(getContentsList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.ACTIVE_CONTENTS: {
			ActiveContents activeContents = (ActiveContents) theEObject;
			T result = caseActiveContents(activeContents);
			if (result == null)
				result = caseAllocatableOperator(activeContents);
			if (result == null)
				result = caseOperator(activeContents);
			if (result == null)
				result = caseExpression(activeContents);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.PROPERTY_OPERATOR: {
			PropertyOperator propertyOperator = (PropertyOperator) theEObject;
			T result = casePropertyOperator(propertyOperator);
			if (result == null)
				result = caseOperator(propertyOperator);
			if (result == null)
				result = caseExpression(propertyOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.GET_PROPERTY: {
			GetProperty getProperty = (GetProperty) theEObject;
			T result = caseGetProperty(getProperty);
			if (result == null)
				result = casePropertyOperator(getProperty);
			if (result == null)
				result = caseOperator(getProperty);
			if (result == null)
				result = caseExpression(getProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.STATE_VALUE: {
			StateValue stateValue = (StateValue) theEObject;
			T result = caseStateValue(stateValue);
			if (result == null)
				result = caseContentOperator(stateValue);
			if (result == null)
				result = caseOperator(stateValue);
			if (result == null)
				result = caseExpression(stateValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.HAS_COME_LATER_THAN: {
			HasComeLaterThan hasComeLaterThan = (HasComeLaterThan) theEObject;
			T result = caseHasComeLaterThan(hasComeLaterThan);
			if (result == null)
				result = caseContentOperator(hasComeLaterThan);
			if (result == null)
				result = caseOperator(hasComeLaterThan);
			if (result == null)
				result = caseExpression(hasComeLaterThan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.HAS_COME_EARLIER_THAN: {
			HasComeEarlierThan hasComeEarlierThan = (HasComeEarlierThan) theEObject;
			T result = caseHasComeEarlierThan(hasComeEarlierThan);
			if (result == null)
				result = caseContentOperator(hasComeEarlierThan);
			if (result == null)
				result = caseOperator(hasComeEarlierThan);
			if (result == null)
				result = caseExpression(hasComeEarlierThan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.SUGAR_EXPRESSION: {
			SugarExpression sugarExpression = (SugarExpression) theEObject;
			T result = caseSugarExpression(sugarExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.SUGAR_EXPRESSION_BASE: {
			SugarExpressionBase sugarExpressionBase = (SugarExpressionBase) theEObject;
			T result = caseSugarExpressionBase(sugarExpressionBase);
			if (result == null)
				result = caseSugarExpression(sugarExpressionBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.OBJECT_COMPARE_NOT: {
			ObjectCompareNot objectCompareNot = (ObjectCompareNot) theEObject;
			T result = caseObjectCompareNot(objectCompareNot);
			if (result == null)
				result = caseOperator(objectCompareNot);
			if (result == null)
				result = caseSugarExpressionBase(objectCompareNot);
			if (result == null)
				result = caseExpression(objectCompareNot);
			if (result == null)
				result = caseSugarExpression(objectCompareNot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.IS_ALLOCATED_TO: {
			IsAllocatedTo isAllocatedTo = (IsAllocatedTo) theEObject;
			T result = caseIsAllocatedTo(isAllocatedTo);
			if (result == null)
				result = caseContentOperator(isAllocatedTo);
			if (result == null)
				result = caseSugarExpressionBase(isAllocatedTo);
			if (result == null)
				result = caseOperator(isAllocatedTo);
			if (result == null)
				result = caseSugarExpression(isAllocatedTo);
			if (result == null)
				result = caseExpression(isAllocatedTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.IS_CHANGED: {
			IsChanged isChanged = (IsChanged) theEObject;
			T result = caseIsChanged(isChanged);
			if (result == null)
				result = caseAllocatableOperator(isChanged);
			if (result == null)
				result = caseSugarExpressionBase(isChanged);
			if (result == null)
				result = caseOperator(isChanged);
			if (result == null)
				result = caseSugarExpression(isChanged);
			if (result == null)
				result = caseExpression(isChanged);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.IS_TRANSLATED_TO: {
			IsTranslatedTo isTranslatedTo = (IsTranslatedTo) theEObject;
			T result = caseIsTranslatedTo(isTranslatedTo);
			if (result == null)
				result = caseAllocatableOperator(isTranslatedTo);
			if (result == null)
				result = caseSugarExpressionBase(isTranslatedTo);
			if (result == null)
				result = caseOperator(isTranslatedTo);
			if (result == null)
				result = caseSugarExpression(isTranslatedTo);
			if (result == null)
				result = caseExpression(isTranslatedTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.GET_STATE: {
			GetState getState = (GetState) theEObject;
			T result = caseGetState(getState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.CONTENT_STATE_OPERATOR: {
			ContentStateOperator contentStateOperator = (ContentStateOperator) theEObject;
			T result = caseContentStateOperator(contentStateOperator);
			if (result == null)
				result = caseOperator(contentStateOperator);
			if (result == null)
				result = caseExpression(contentStateOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RBACorePackage.NULL_EXPRESSION: {
			NullExpression nullExpression = (NullExpression) theEObject;
			T result = caseNullExpression(nullExpression);
			if (result == null)
				result = caseExpression(nullExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(rba.core.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotype(Stereotype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Scene</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractScene(AbstractScene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScene(Scene object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractProperty(AbstractProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Property</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerProperty(IntegerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConstraint(AbstractConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Let Statement</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Let Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetStatement(LetStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexExpression(ComplexExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Is Type Of</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Type Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsTypeOf(IsTypeOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Reference</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectReference(ObjectReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Previous Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Previous Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreviousModifier(PreviousModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterThanOperator(GreaterThanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Much Greater Than Operator</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Much Greater Than Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMuchGreaterThanOperator(MuchGreaterThanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Than Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Than Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowerThanOperator(LowerThanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonOperator(ComparisonOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal To Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal To Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualToOperator(EqualToOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison And</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonAnd(ComparisonAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalOperator(LogicalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndOperator(AndOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrOperator(OrOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotOperator(NotOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Equal To Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Equal To Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsEqualToOperator(IsEqualToOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Greater Than Operator</em>'.
	 * <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Greater Than Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsGreaterThanOperator(IsGreaterThanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Lower Than Operator</em>'.
	 * <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Lower Than Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsLowerThanOperator(IsLowerThanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Greater Than Equal Operator</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Greater Than Equal Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsGreaterThanEqualOperator(IsGreaterThanEqualOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Lower Than Equal Operator</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Lower Than Equal Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsLowerThanEqualOperator(IsLowerThanEqualOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticOperator(ArithmeticOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlusOperator(PlusOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implies Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implies Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpliesOperator(ImpliesOperator object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Is Active</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Active</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsActive(IsActive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Allocatables</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Allocatables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllocatables(GetAllocatables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Been Displayed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Been Displayed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasBeenDisplayed(HasBeenDisplayed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active State</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveState(ActiveState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Compare</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Compare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectCompare(ObjectCompare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>That Of Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>That Of Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThatOfOperator(ThatOfOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Expression</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueExpression(ValueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Value</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxValue(MaxValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Value</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinValue(MinValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>None Value</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoneValue(NoneValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Value</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardValue(StandardValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Expression</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumExpression(EnumExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loser Type Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loser Type Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoserTypeExpression(LoserTypeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arbitration Policy Expression</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arbitration Policy Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArbitrationPolicyExpression(ArbitrationPolicyExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Set Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetOperator(SetOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizeOperator(SizeOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exists Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exists Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistsOperator(ExistsOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For All Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For All Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForAllOperator(ForAllOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxOperator(MaxOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinOperator(MinOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectOperator(SelectOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Of Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Of Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetOfOperator(SetOfOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaExpression(LambdaExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda Context</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaContext(LambdaContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene Operator</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSceneOperator(SceneOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is On</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsOn(IsOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocatable Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocatable Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocatableOperator(AllocatableOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocated Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocated Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocatedContent(AllocatedContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Value</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentValue(ContentValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Contents List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Contents List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetContentsList(GetContentsList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Contents</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Contents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveContents(ActiveContents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyOperator(PropertyOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Property</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetProperty(GetProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Value</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateValue(StateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Come Later Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Come Later Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasComeLaterThan(HasComeLaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Come Earlier Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Come Earlier Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasComeEarlierThan(HasComeEarlierThan object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Object Compare Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Compare Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectCompareNot(ObjectCompareNot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Allocated To</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Allocated To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsAllocatedTo(IsAllocatedTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Changed</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Changed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsChanged(IsChanged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Translated To</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Translated To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsTranslatedTo(IsTranslatedTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get State</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetState(GetState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content State Operator</em>'.
	 * <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content State Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentStateOperator(ContentStateOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullExpression(NullExpression object) {
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

} // RBACoreSwitch
