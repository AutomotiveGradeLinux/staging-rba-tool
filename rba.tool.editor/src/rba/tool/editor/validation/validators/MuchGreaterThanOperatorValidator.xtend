package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.MuchGreaterThanOperator
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class MuchGreaterThanOperatorValidator extends AbstractRBAModelValidator {

	private String MUCHGREATERTHAN_OPERAND_SIZE_NULL = Messages.MUCHGREATERTHAN_OPERAND_SIZE_NULL;

	private String MUCHGREATERTHAN_OPERAND_SIZE = Messages.MUCHGREATERTHAN_OPERAND_SIZE;

	private String MUCHGREATERTHAN_OPERAND_TYPE = Messages.MUCHGREATERTHAN_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkMuchGreaterThanOperator(MuchGreaterThanOperator muchGreaterThanOperator) {
		if (muchGreaterThanOperator.operand.size == 0) {
			error(MUCHGREATERTHAN_OPERAND_SIZE_NULL, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		if (muchGreaterThanOperator.operand.size != 1) {
			error(MUCHGREATERTHAN_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (operand : muchGreaterThanOperator.operand) {
			if (operand.type != ExpressionType.VALUE) {
				error(MUCHGREATERTHAN_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
