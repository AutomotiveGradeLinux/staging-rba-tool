package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.core.IsTypeOf
import rba.core.ExpressionType

class IsTypeOfValidator extends AbstractRBAModelValidator {

	private String OPERAND_SIZE_TWO = Messages.OPERAND_SIZE_TWO;
	private String FIRST_OPERAND_MUST_FOR_ISTYPEOF = Messages.FIRST_OPERAND_MUST_FOR_ISTYPEOF;
	
	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsTypeOf(IsTypeOf op) {
		if (op.operand.size < 1) {
			error(String.format(OPERAND_SIZE_TWO, op.symbol), RBACorePackage.Literals.OPERATOR__OPERAND, 1)
			return;
		}
		var operand = op.operand.get(0)
		if (operand.type != ExpressionType.CONTENT && operand.type != ExpressionType.AREA && operand.type != ExpressionType.SOUND &&
			operand.type != ExpressionType.ZONE) {
			error(String.format(FIRST_OPERAND_MUST_FOR_ISTYPEOF, op.symbol), RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
	}
}
