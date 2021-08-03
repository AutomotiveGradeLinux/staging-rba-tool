package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.ImpliesOperator
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class ImpliesOperatorValidator extends AbstractRBAModelValidator {

	private String IMPLIES_OPERAND_SIZE = Messages.IMPLIES_OPERAND_SIZE;

	private String IMPLIES_OPERAND_TYPE = Messages.IMPLIES_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkImpliesOperator(ImpliesOperator impliesOperator) {
		if (impliesOperator.operand.size < 2) {
			error(IMPLIES_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (var i = 0; i < impliesOperator.operand.size; i++) {
			var operand = impliesOperator.operand.get(i)
			if (operand.type != ExpressionType.BOOLEAN) {
				error(IMPLIES_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND, i, null)
				return;
			}
		}
	}
}
