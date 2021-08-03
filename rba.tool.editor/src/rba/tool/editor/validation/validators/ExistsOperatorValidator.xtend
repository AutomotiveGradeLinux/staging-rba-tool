package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExistsOperator
import rba.core.Expression
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.core.SetOfOperator
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class ExistsOperatorValidator extends AbstractRBAModelValidator {

	private String EXISTS_OPERAND_SIZE = Messages.EXISTS_OPERAND_SIZE;

	private String EXISTS_OPERAND_TYPE = Messages.EXISTS_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkExistsOperator(ExistsOperator existsOperator) {
		if (existsOperator.operand.size > 1) {
			error(EXISTS_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		var operand = existsOperator.operand.get(0)
		if (operand.type != ExpressionType.SET_OF_CONTENT && operand.type != ExpressionType.SET_OF_AREA &&
				operand.type != ExpressionType.SET_OF_ZONE && operand.type != ExpressionType.SET_OF_SOUND &&
				isInvalidSetOfOperator(operand)) {
			error(EXISTS_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
	}

	// check whether operator is SetOfOperator and operand type is not type of Area,Content,Zone,Sound or Animation
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
