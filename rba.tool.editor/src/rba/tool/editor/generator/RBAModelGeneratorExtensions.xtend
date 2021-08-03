package rba.tool.editor.generator

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject
import rba.core.AbstractProperty
import rba.core.AllocatedContent
import rba.core.AndOperator
import rba.core.Content
import rba.core.ContentSet
import rba.core.ContentValue
import rba.core.ExistsOperator
import rba.core.Expression
import rba.core.ForAllOperator
import rba.core.GetAllocatables
import rba.core.GetContentsList
import rba.core.GetProperty
import rba.core.IfActionOperator
import rba.core.IfStatement
import rba.core.ImpliesOperator
import rba.core.IntegerValue
import rba.core.IsActive
import rba.core.IsCanceled
import rba.core.IsDisappeared
import rba.core.IsEqualToOperator
import rba.core.IsGreaterThanEqualOperator
import rba.core.IsGreaterThanOperator
import rba.core.IsLowerThanEqualOperator
import rba.core.IsLowerThanOperator
import rba.core.IsOn
import rba.core.LambdaExpression
import rba.core.MaxValue
import rba.core.MinValue
import rba.core.NoneValue
import rba.core.NotOperator
import rba.core.ObjectCompare
import rba.core.ObjectReference
import rba.core.OffScene
import rba.core.OnScene
import rba.core.OrOperator
import rba.core.PreviousModifier
import rba.core.Scene
import rba.core.SetOfOperator
import rba.core.SetProperty
import rba.core.StandardValue
import rba.core.Variable
import rba.sound.AllInstanceOfSoundContent
import rba.sound.AllInstanceOfZone
import rba.sound.IsAttenuated
import rba.sound.IsMuted
import rba.sound.IsOutputted
import rba.sound.IsSounding
import rba.sound.OutputtingSound
import rba.sound.Zone
import rba.sound.ZoneSet
import rba.view.AllInstanceOfArea
import rba.view.AllInstanceOfViewContent
import rba.view.Area
import rba.view.AreaSet
import rba.view.DisplayingContent
import rba.view.IsDisplayed
import rba.view.IsHidden
import rba.view.IsVisible
import rba.core.ContentState
import rba.core.State

class RBAModelGeneratorExtensions {

	public int operandIndex = 1;
	
	public Map<EObject, String> variableNames = new HashMap<EObject, String>();
	
	def public compile(Expression e, String text) ''' 
		«e.compile(null, text, null)»
	'''

	def public compile(Expression e, LambdaExpression le, String text1, String text2) ''' 
		«IF e instanceof IsEqualToOperator »
			«(e as IsEqualToOperator).compile(text1)»
		«ELSEIF e instanceof IsGreaterThanOperator »
			«(e as IsGreaterThanOperator).compile(text1)»
		«ELSEIF e instanceof IsLowerThanOperator »
			«(e as IsLowerThanOperator).compile(text1)»
		«ELSEIF e instanceof IsGreaterThanEqualOperator »
			«(e as IsGreaterThanEqualOperator).compile(text1)»
		«ELSEIF e instanceof IsLowerThanEqualOperator »
			«(e as IsLowerThanEqualOperator).compile(text1)»
		«ELSEIF e instanceof AndOperator »
			«(e as AndOperator).compile(text1)»
		«ELSEIF e instanceof OrOperator»
			«(e as OrOperator).compile(text1)»
		«ELSEIF e instanceof NotOperator»
			«(e as NotOperator).compile(text1)»
		«ELSEIF e instanceof ImpliesOperator»
			«(e as ImpliesOperator).compile(text1)»
		«ELSEIF e instanceof IsActive»
			«(e as IsActive).compile(text1)»
		«ELSEIF e instanceof IsVisible»
			«(e as IsVisible).compile(text1)»
		«ELSEIF e instanceof GetAllocatables»
			«(e as GetAllocatables).compile(le, text1, text2)»
		«ELSEIF e instanceof IsDisplayed»
			«(e as IsDisplayed).compile(text1)»
		«ELSEIF e instanceof IsHidden»
			«(e as IsHidden).compile(text1)»
		«ELSEIF e instanceof DisplayingContent»
			«(e as DisplayingContent).compile(le, text1, text2)»
		«ELSEIF e instanceof AllocatedContent»
			«(e as AllocatedContent).compile(le, text1, text2)»
		«ELSEIF e instanceof GetContentsList»
			«(e as GetContentsList).compile(le, text1, text2)»
		«ELSEIF e instanceof ContentValue»
			«(e as ContentValue).compile(le, text1, text2)»
		«ELSEIF e instanceof ObjectReference»
			«(e as ObjectReference).compile(le, text1, text2)»
		«ELSEIF e instanceof PreviousModifier»
			«(e as PreviousModifier).compile(text1)»
		«ELSEIF e instanceof ObjectCompare»
			«(e as ObjectCompare).compile(text1)»
		«ELSEIF e instanceof ForAllOperator»
			«(e as ForAllOperator).compile(text1)»
		«ELSEIF e instanceof ExistsOperator»
			«(e as ExistsOperator).compile(text1)»
		«ELSEIF e instanceof AllInstanceOfArea»
			«(e as AllInstanceOfArea).compile(le, text1, text2)»
		«ELSEIF e instanceof AllInstanceOfViewContent»
			«(e as AllInstanceOfViewContent).compile(le, text1, text2)»
		«ELSEIF e instanceof AllInstanceOfZone»
			«(e as AllInstanceOfZone).compile(le, text1, text2)»
		«ELSEIF e instanceof AllInstanceOfSoundContent»
			«(e as AllInstanceOfSoundContent).compile(le, text1, text2)»
		«ELSEIF e instanceof SetOfOperator»
			«(e as SetOfOperator).compile(le, text1, text2)»
		«ELSEIF e instanceof IfStatement»
			«(e as IfStatement).compile(le, text1, text2)»
		«ELSEIF e instanceof IsOn»
			«(e as IsOn).compile(text1)»
		«ELSEIF e instanceof IsDisappeared»
			«(e as IsDisappeared).compile(text1)»
		«ELSEIF e instanceof IsCanceled»
			«(e as IsCanceled).compile(text1)»
		«ELSEIF e instanceof GetProperty»
			«(e as GetProperty).compile(le, text1, text2)»
		«ELSEIF e instanceof SetProperty»
			«(e as SetProperty).compile(le, text1, text2)»
		«ELSEIF e instanceof OffScene»
			«(e as OffScene).compile(text1)»
		«ELSEIF e instanceof OnScene»
			«(e as OnScene).compile(text1)»
		«ELSEIF e instanceof IsSounding»
			«(e as IsSounding).compile(text1)»
		«ELSEIF e instanceof IsOutputted»
			«(e as IsOutputted).compile(text1)»
		«ELSEIF e instanceof IsMuted»
			«(e as IsMuted).compile(text1)»
		«ELSEIF e instanceof OutputtingSound»
			«(e as OutputtingSound).compile(le, text1, text2)»
		«ELSEIF e instanceof IsAttenuated»
			«(e as IsAttenuated).compile(text1)»
		«ELSEIF e instanceof IfActionOperator»
			«(e as IfActionOperator).compile(le, text1, text2)»
		«ELSEIF e instanceof MaxValue»
			«(e as MaxValue).compile(text1)»
		«ELSEIF e instanceof MinValue»
			«(e as MinValue).compile(text1)»
		«ELSEIF e instanceof NoneValue»
			«(e as NoneValue).compile(text1)»
		«ELSEIF e instanceof StandardValue»
			«(e as StandardValue).compile(text1)»
		«ELSEIF e instanceof IntegerValue»
			«(e as IntegerValue).compile(text1)»
		«ENDIF»
	'''

	def public compile(IsEqualToOperator o, String addExpressionStatement) ''' 
		«var name = "isEqualToOperator_" + operandIndex++»
		ARBIsEqualToOperator «name» = ArbFactory.eINSTANCE.createARBIsEqualToOperator();
		«IF o.operand !== null && o.operand.size > 0»
			«FOR op : o.operand»
				«op.compile(name + ".getOperands().add")»
			«ENDFOR»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsGreaterThanOperator o, String addExpressionStatement) ''' 
		«var name = "isGreaterThanOperator_" + operandIndex++»
		ARBIsGreaterThanOperator «name» = ArbFactory.eINSTANCE.createARBIsGreaterThanOperator();
		«IF o.operand !== null && o.operand.size > 0»
			«FOR op : o.operand»
				«op.compile(name + ".getOperands().add")»
			«ENDFOR»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsLowerThanOperator o, String addExpressionStatement) ''' 
		«var name = "isLowerThanOperator_" + operandIndex++»
		ARBIsLowerThanOperator «name» = ArbFactory.eINSTANCE.createARBIsLowerThanOperator();
		«IF o.operand !== null && o.operand.size > 0»
			«FOR op : o.operand»
				«op.compile(name + ".getOperands().add")»
			«ENDFOR»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsGreaterThanEqualOperator o, String addExpressionStatement) ''' 
		«var name = "isGreaterThanEqualOperator_" + operandIndex++»
		ARBIsGreaterThanEqualOperator «name» = ArbFactory.eINSTANCE.createARBIsGreaterThanEqualOperator();
		«IF o.operand !== null && o.operand.size > 0»
			«FOR op : o.operand»
				«op.compile(name + ".getOperands().add")»
			«ENDFOR»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsLowerThanEqualOperator o, String addExpressionStatement) ''' 
		«var name = "isLowerThanEqualOperator_" + operandIndex++»
		ARBIsLowerThanEqualOperator «name» = ArbFactory.eINSTANCE.createARBIsLowerThanEqualOperator();
		«IF o.operand !== null && o.operand.size > 0»
			«FOR op : o.operand»
				«op.compile(name + ".getOperands().add")»
			«ENDFOR»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(AndOperator o, String addExpressionStatement) ''' 
		«var name = "andOperator_" + operandIndex++»
		ARBAndOperator «name» = ArbFactory.eINSTANCE.createARBAndOperator();
		«IF o.operand !== null && o.operand.size > 0»
			«FOR op : o.operand»
				«op.compile(name + ".getOperands().add")»
			«ENDFOR»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(OrOperator o, String addExpressionStatement) ''' 
		«var name = "orOperator_" + operandIndex++»
		ARBOrOperator «name» = ArbFactory.eINSTANCE.createARBOrOperator();
		«IF o.operand !== null && o.operand.size > 0»
			«FOR op : o.operand»
				«op.compile(name + ".getOperands().add")»
			«ENDFOR»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(NotOperator o, String addExpressionStatement) ''' 
		«var name = "notOperator_" + operandIndex++»
		ARBNotOperator «name» = ArbFactory.eINSTANCE.createARBNotOperator();
		«IF o.operand !== null && o.operand.size > 0»
			«FOR op : o.operand»
				«op.compile(name + ".getOperands().add")»
			«ENDFOR»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(ImpliesOperator o, String addExpressionStatement) ''' 
		«var name = "impliesOperator_" + operandIndex++»
		ARBImpliesOperator «name» = ArbFactory.eINSTANCE.createARBImpliesOperator();
		«IF o.operand !== null && o.operand.size > 0»
			«FOR op : o.operand»
				«op.compile(name + ".getOperands().add")»
			«ENDFOR»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(ObjectCompare o, String addExpressionStatement) ''' 
		«var name = "objectCompair_" + operandIndex++»
		ARBObjectCompare «name» = ArbFactory.eINSTANCE.createARBObjectCompare();
		«IF o.operand !== null && o.operand.size > 0»
			«FOR op : o.operand»
				«op.compile(name + ".getOperands().add")»
			«ENDFOR»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsActive o, String addExpressionStatement) ''' 
		«var name = "isActive_" + operandIndex++»
		ARBIsActive «name» = ArbFactory.eINSTANCE.createARBIsActive();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsVisible o, String addExpressionStatement) ''' 
		«var name = "isVisible_" + operandIndex++»
		ARBIsVisible «name» = ArbFactory.eINSTANCE.createARBIsVisible();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(GetAllocatables o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "getAllocatables_" + operandIndex++»
		ARBGetAllocatables «name» = ArbFactory.eINSTANCE.createARBGetAllocatables();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsDisplayed o, String addExpressionStatement) ''' 
		«var name = "isDisplayed_" + operandIndex++»
		ARBIsDisplayed «name» = ArbFactory.eINSTANCE.createARBIsDisplayed();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsHidden o, String addExpressionStatement) ''' 
		«var name = "isHidden_" + operandIndex++»
		ARBIsHidden «name» = ArbFactory.eINSTANCE.createARBIsHidden();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(DisplayingContent o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "displayingContent_" + operandIndex++»
		ARBDisplayingContent «name» = ArbFactory.eINSTANCE.createARBDisplayingContent();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(AllocatedContent o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "allocatedContent_" + operandIndex++»
		ARBAllocatedContent «name» = ArbFactory.eINSTANCE.createARBAllocatedContent();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(GetContentsList o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "getContentsList_" + operandIndex++»
		ARBGetContentsList «name» = ArbFactory.eINSTANCE.createARBGetContentsList();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(ContentValue o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "contentValue_" + operandIndex++»
		ARBContentValue «name» = ArbFactory.eINSTANCE.createARBContentValue();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

    public static final String DummyIndicateCharacter = "|"; //$NON-NLS-1$

	def public compile(ObjectReference o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "objectReference_" + operandIndex++»
		ARBObjectReference «name» = ArbFactory.eINSTANCE.createARBObjectReference();
		«name».setRefObject(«IF o.refObject instanceof Scene »model.getScene("«o.refObject.name»"));«ELSEIF o.refObject instanceof ContentState »model.getContentState("«(o.refObject as ContentState).owner.name»", "«o.refObject.name»"));
		«ELSEIF o.refObject instanceof AbstractProperty »model.getProperty("«(o.refObject as AbstractProperty).owner.name»", "«o.refObject.name»"));«ELSEIF o.refObject instanceof Zone »model.getAllocatable("«o.refObject.name»"));«ELSEIF o.refObject instanceof ZoneSet»model.getAllocatableSet("«o.refObject.name»"));«ELSEIF o.refObject instanceof Area »model.getAllocatable("«o.refObject.name»"));«ELSEIF o.refObject instanceof Content»model.getContent("«o.refObject.name»"));«ELSEIF o.refObject instanceof AreaSet»model.getAllocatableSet("«o.refObject.name»"));«ELSEIF o.refObject instanceof ContentSet»model.getContentSet("«o.refObject.name»"));«ELSEIF o.refObject instanceof Variable»«IF variableNames.containsKey(o.refObject)»«variableNames.get(o.refObject)»«ELSE»null«ENDIF»);«ENDIF»
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''
	
	def public compile(PreviousModifier o, String addExpressionStatement) ''' 
		«var name = "previousModifier_" + operandIndex++»
		ARBPreviousModifier «name» = ArbFactory.eINSTANCE.createARBPreviousModifier();
		«IF o.objReference !== null»
			«o.objReference.compile(name + ".setObjReference")»
		«ELSE»
			«name».setObjReference(null);
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(ForAllOperator o, String addExpressionStatement) ''' 
		«var name = "forAllOperator_" + operandIndex++»
		ARBForAllOperator «name» = ArbFactory.eINSTANCE.createARBForAllOperator();
		«IF o.operand !== null && o.operand.size > 0 && o.lambda !== null»
			«(o.operand.get(0)).compile(o.lambda, name + ".getOperands().add", name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(ExistsOperator o, String addExpressionStatement) ''' 
		«var name = "existsOperator_" + operandIndex++»
		ARBExistsOperator «name» = ArbFactory.eINSTANCE.createARBExistsOperator();
		«IF o.operand !== null && o.operand.size > 0 && o.lambda !== null»
			«(o.operand.get(0)).compile(o.lambda, name + ".getOperands().add", name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(LambdaExpression o, String addExpressionStatement, String refContextObjectName, String setExpressionStatement) ''' 
		«var name = "lambdaExpression_" + operandIndex++»
		ARBLambdaExpression «name» = ArbFactory.eINSTANCE.createARBLambdaExpression();
		«name».setContext(«refContextObjectName»);
		«IF o.x !== null && o.bodyText !== null»
			«(o.x).compile(name + ".setX", setExpressionStatement)»
			«(o.bodyText).compile(name + ".setBodyText")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(Variable v, String addExpressionStatement, String refExpressionObjectName) ''' 
		«var name = "variable_" + operandIndex++»
		«variableNames.put(v, name)»
		ARBVariable «name» = ArbFactory.eINSTANCE.createARBVariable();
		«name».setDescription(«IF v.description === null»""«ELSEIF v.description.empty»""«ELSE»«v.description»«ENDIF»);
		«name».setName("«v.name»");
		«name».setType(ARB«v.expressionType.class.simpleName».«v.expressionType.getName»);
		«name».setExpression(«refExpressionObjectName»);
		«addExpressionStatement»(«name»);
	'''

	def public compile(AllInstanceOfArea o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "allInstanceOfArea_" + operandIndex++»
		ARBAllInstanceOfArea «name» = ArbFactory.eINSTANCE.createARBAllInstanceOfArea();
		«name».setRefObject(model.getAllArea());
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(AllInstanceOfViewContent o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "allInstanceOfViewContent_" + operandIndex++»
		ARBAllInstanceOfContent «name» = ArbFactory.eINSTANCE.createARBAllInstanceOfContent();
		«name».setRefObject(model.getAllViewContent());
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(AllInstanceOfZone o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "allInstanceOfZone_" + operandIndex++»
		ARBAllInstanceOfZone «name» = ArbFactory.eINSTANCE.createARBAllInstanceOfZone();
		«name».setRefObject(model.getAllZone());
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(AllInstanceOfSoundContent o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "allInstanceOfSoundContent_" + operandIndex++»
		ARBAllInstanceOfSoundContent «name» = ArbFactory.eINSTANCE.createARBAllInstanceOfSoundContent();
		«name».setRefObject(model.getAllSoundContent());
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(SetOfOperator o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "setOfOperator_" + operandIndex++»
		ARBSetOfOperator «name» = ArbFactory.eINSTANCE.createARBSetOfOperator();
		«IF o.operand !== null && o.operand.size > 0»
			«FOR op : o.operand»
				«op.compile(name + ".getOperands().add")»
			«ENDFOR»
		«ENDIF»
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IfStatement o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "ifStatement_" + operandIndex++»
		ARBIfStatement «name» = ArbFactory.eINSTANCE.createARBIfStatement();
		«IF o.condition !== null»
			«(o.condition).compile(name + ".setCondition")»
		«ENDIF»
		«IF o.thenExpression !== null»
			«(o.thenExpression).compile(name + ".setThenExpression")»
		«ENDIF»
		«IF o.elseExpression !== null»
			«(o.elseExpression).compile(name + ".setElseExpression")»
		«ENDIF»
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsOn o, String addExpressionStatement) ''' 
		«var name = "isOn_" + operandIndex++»
		ARBIsOn «name» = ArbFactory.eINSTANCE.createARBIsOn();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsDisappeared o, String addExpressionStatement) ''' 
		«var name = "isDisappeared_" + operandIndex++»
		ARBIsDisappeared «name» = ArbFactory.eINSTANCE.createARBIsDisappeared();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsCanceled o, String addExpressionStatement) ''' 
		«var name = "isCanceled_" + operandIndex++»
		ARBIsCanceled «name» = ArbFactory.eINSTANCE.createARBIsCanceled();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(GetProperty o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "getProperty_" + operandIndex++»
		ARBGetProperty «name» = ArbFactory.eINSTANCE.createARBGetProperty();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(SetProperty o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "setProperty_" + operandIndex++»
		ARBSetProperty «name» = ArbFactory.eINSTANCE.createARBSetProperty();
		«IF o.operand !== null && o.operand.size > 0»
			«FOR op : o.operand»
				«op.compile(name + ".getOperands().add")»
			«ENDFOR»
		«ENDIF»
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(OffScene o, String addExpressionStatement) ''' 
		«var name = "offScene_" + operandIndex++»
		ARBOffScene «name» = ArbFactory.eINSTANCE.createARBOffScene();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(OnScene o, String addExpressionStatement) ''' 
		«var name = "onScene_" + operandIndex++»
		ARBOnScene «name» = ArbFactory.eINSTANCE.createARBOnScene();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsSounding o, String addExpressionStatement) ''' 
		«var name = "isSounding_" + operandIndex++»
		ARBIsSounding «name» = ArbFactory.eINSTANCE.createARBIsSounding();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsOutputted o, String addExpressionStatement) ''' 
		«var name = "isOutputted_" + operandIndex++»
		ARBIsOutputted «name» = ArbFactory.eINSTANCE.createARBIsOutputted();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsMuted o, String addExpressionStatement) ''' 
		«var name = "isMuted_" + operandIndex++»
		ARBIsMuted «name» = ArbFactory.eINSTANCE.createARBIsMuted();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(OutputtingSound o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "outputtingSound_" + operandIndex++»
		ARBOutputtingSound «name» = ArbFactory.eINSTANCE.createARBOutputtingSound();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IsAttenuated o, String addExpressionStatement) ''' 
		«var name = "isAttenuated_" + operandIndex++»
		ARBIsAttenuated «name» = ArbFactory.eINSTANCE.createARBIsAttenuated();
		«IF o.operand !== null && o.operand.size > 0»
			«(o.operand.get(0)).compile(name + ".getOperands().add")»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(IfActionOperator o, LambdaExpression le, String addExpressionStatement, String parentName) ''' 
		«var name = "ifActionOperator_" + operandIndex++»
		ARBIfActionOperator «name» = ArbFactory.eINSTANCE.createARBIfActionOperator();
		«IF o.operand !== null && o.operand.size > 0»
			«FOR op : o.operand»
				«op.compile(name + ".getOperands().add")»
			«ENDFOR»
		«ENDIF»
		«IF le !== null && parentName !== null && !parentName.empty»
			«le.compile(parentName + ".setLambda", parentName, name)»
		«ENDIF»
		«addExpressionStatement»(«name»);
	'''

	def public compile(MaxValue o, String addExpressionStatement) ''' 
		«var name = "maxValue_" + operandIndex++»
		ARBMaxValue «name» = ArbFactory.eINSTANCE.createARBMaxValue();
		«addExpressionStatement»(«name»);
	'''

	def public compile(MinValue o, String addExpressionStatement) ''' 
		«var name = "minValue_" + operandIndex++»
		ARBMinValue «name» = ArbFactory.eINSTANCE.createARBMinValue();
		«addExpressionStatement»(«name»);
	'''

	def public compile(NoneValue o, String addExpressionStatement) ''' 
		«var name = "noneValue_" + operandIndex++»
		ARBNoneValue «name» = ArbFactory.eINSTANCE.createARBNoneValue();
		«addExpressionStatement»(«name»);
	'''

	def public compile(StandardValue o, String addExpressionStatement) ''' 
		«var name = "standardValue_" + operandIndex++»
		ARBStandardValue «name» = ArbFactory.eINSTANCE.createARBStandardValue();
		«addExpressionStatement»(«name»);
	'''

	def public compile(IntegerValue o, String addExpressionStatement) ''' 
		«var name = "integerValue_" + operandIndex++»
		ARBIntegerValue «name» = ArbFactory.eINSTANCE.createARBIntegerValue();
		«name».setValue(«o.value»);
		«addExpressionStatement»(«name»);
	'''
}