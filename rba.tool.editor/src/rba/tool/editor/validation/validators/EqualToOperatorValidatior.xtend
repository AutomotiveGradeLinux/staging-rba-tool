package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.EqualToOperator
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class EqualToOperatorValidatior extends AbstractRBAModelValidator {

	private String EQUALTO_OPERAND_SIZE_NULL = Messages.EQUALTO_OPERAND_SIZE_NULL;

	private String EQUALTO_OPERAND_SIZE = Messages.EQUALTO_OPERAND_SIZE;

	private String EQUALTO_OPERAND_TYPE = Messages.EQUALTO_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkEqualToOperator(EqualToOperator equalToOperator) {

		if (equalToOperator.operand.size == 0) {
			error(EQUALTO_OPERAND_SIZE_NULL, RBACorePackage.Literals.OPERATOR__OPERAND);
			return;
		}
		if (equalToOperator.operand.size != 1) {
			error(EQUALTO_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND);
			return;
		}
		for (operand : equalToOperator.operand) {
			if (operand.type != ExpressionType.VALUE) {
				error(EQUALTO_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}

	}
}
