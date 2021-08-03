package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.IsDisappeared
import rba.core.PreviousModifier
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages

class IsDisappearedValidator extends AbstractContentOperatorValidator {
	private String ISDISAPPEARED_OPERAND_SIZE = Messages.ISDISAPPEARED_OPERAND_SIZE;

	private String ISDISAPPEARED_OPERAND_0_TYPE = Messages.ISDISAPPEARED_OPERAND_0_TYPE;

	private String ISDISAPPEARED_OPERAND_0_CHECK = Messages.ISDISAPPEARED_OPERAND_0_CHECK;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsDisappearedOperator(IsDisappeared isDisappeared) {
		if (isDisappeared.operand.size > 1) {
			error(ISDISAPPEARED_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		if (isDisappeared.operand.get(0).type != ExpressionType.CONTENT && isDisappeared.operand.get(0).type != ExpressionType.SOUND) {
			error(ISDISAPPEARED_OPERAND_0_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		if (isDisappeared.operand.get(0) instanceof PreviousModifier) {
			error(ISDISAPPEARED_OPERAND_0_CHECK, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
	}
}
