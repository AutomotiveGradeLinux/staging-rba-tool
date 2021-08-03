package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.GreaterThanOperator
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class GreaterThanOperatorValidator extends AbstractRBAModelValidator {

	private String GREATERTHAN_OPERAND_SIZE_NULL = Messages.GREATERTHAN_OPERAND_SIZE_NULL;

	private String GREATERTHAN_OPERAND_SIZE = Messages.GREATERTHAN_OPERAND_SIZE;

	private String GREATERTHAN_OPERAND_TYPE = Messages.GREATERTHAN_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkGreaterThanOperator(GreaterThanOperator greaterThanOperator) {
		if (greaterThanOperator.operand.size === 0) {
			error(GREATERTHAN_OPERAND_SIZE_NULL, RBACorePackage.Literals.OPERATOR__OPERAND);
			return;
		}
		if (greaterThanOperator.operand.size != 1) {
			error(GREATERTHAN_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND);
			return;
		}
		for (operand : greaterThanOperator.operand) {
			if (operand.type != ExpressionType.VALUE) {
				error(GREATERTHAN_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND);
				return;
			}
		}
	}
}
