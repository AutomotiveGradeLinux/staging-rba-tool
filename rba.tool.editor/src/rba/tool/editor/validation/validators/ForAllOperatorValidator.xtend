package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.Expression
import rba.core.ExpressionType
import rba.core.ForAllOperator
import rba.core.RBACorePackage
import rba.core.SetOfOperator
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class ForAllOperatorValidator extends AbstractRBAModelValidator {

	private String FORALL_OPERAND_SIZE = Messages.FORALL_OPERAND_SIZE;

	private String FORALL_OPERAND_TYPE = Messages.FORALL_OPERAND_TYPE;

	private String FORALL_LAMBDA_TYPE = Messages.FORALL_LAMBDA_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkForAllOperator(ForAllOperator forAllOperator) {
		if (forAllOperator.operand.size > 1) {
			error(FORALL_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		var operand = forAllOperator.operand.get(0)

		if (operand.type != ExpressionType.SET_OF_CONTENT && operand.type != ExpressionType.SET_OF_AREA &&
				operand.type != ExpressionType.SET_OF_SOUND && operand.type != ExpressionType.SET_OF_ZONE &&
				isInvalidSetOfOperator(operand)) {
			error(FORALL_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		
		var bodytext = forAllOperator.lambda.bodyText;
		if (bodytext.type != ExpressionType.BOOLEAN) {
			error(FORALL_LAMBDA_TYPE, RBACorePackage.Literals.LAMBDA_EXPRESSION__BODY_TEXT)
			return;
		}
		
	}

	//check whether operator is SetOfOperator and operand type is not type of Area,Content,Zone,Sound or Animation
	def isInvalidSetOfOperator(Expression operand) {
		if (operand instanceof SetOfOperator) {
			if (operand.type == ExpressionType.AREA || operand.type == ExpressionType.CONTENT ||
				operand.type == ExpressionType.ZONE || operand.type == ExpressionType.SOUND) {
				return false
			}
		}
		return true
	}
}
