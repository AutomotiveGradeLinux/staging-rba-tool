package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.RBACorePackage
import rba.core.StateValue
import rba.tool.editor.validation.AbstractRBAModelValidator

import static rba.tool.editor.validation.validators.ValidatorUtils.*

class StateValueValidator extends AbstractRBAModelValidator {

	private static final String TargetOperatorName = StateValue.simpleName;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsActive(StateValue operator) {
		val passed = operandSizeMustBeOne(operator.operand, TargetOperatorName, [ msg | error(msg, RBACorePackage.Literals.OPERATOR__OPERAND, 0)])
		if (!passed) {
			return;
		}
		val firstOperand = operator.operand.get(0);
		firstOperandMustBeContent(firstOperand, TargetOperatorName, [ msg | error(msg, RBACorePackage.Literals.OPERATOR__OPERAND, 0)]);
	}
}
