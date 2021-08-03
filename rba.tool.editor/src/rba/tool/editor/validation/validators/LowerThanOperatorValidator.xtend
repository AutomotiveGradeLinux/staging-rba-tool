package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.LowerThanOperator
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class LowerThanOperatorValidator extends AbstractRBAModelValidator {

	private String LOWERTHAN_OPERAND_SIZE_NULL = Messages.LOWERTHAN_OPERAND_SIZE_NULL;

	private String LOWERTHAN_OPERAND_SIZE = Messages.LOWERTHAN_OPERAND_SIZE;

	private String LOWERTHAN_OPERAND_TYPE = Messages.LOWERTHAN_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkLowerThanOperator(LowerThanOperator lowerThanOperator) {
		if (lowerThanOperator.operand.size == 0) {
			error(LOWERTHAN_OPERAND_SIZE_NULL, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		if (lowerThanOperator.operand.size != 1) {
			error(LOWERTHAN_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (operand : lowerThanOperator.operand) {
			if (operand.type != ExpressionType.VALUE) {
				error(LOWERTHAN_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
