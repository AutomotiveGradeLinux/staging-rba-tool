package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.IsCanceled
import rba.core.PreviousModifier
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages

class IsCanceledValidator extends AbstractContentOperatorValidator {
	private String ISCANCELED_OPERAND_SIZE = Messages.ISCANCELED_OPERAND_SIZE;

	private String ISCANCELED_OPERAND_0_TYPE = Messages.ISCANCELED_OPERAND_0_TYPE;

	private String ISCANCELED_OPERAND_0_CHECK = Messages.ISCANCELED_OPERAND_0_CHECK;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsCanceledOperator(IsCanceled isCanceled) {
		if (isCanceled.operand.size > 1) {
			error(ISCANCELED_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		if (isCanceled.operand.get(0).type != ExpressionType.CONTENT && isCanceled.operand.get(0).type != ExpressionType.SOUND) {
			error(ISCANCELED_OPERAND_0_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		if (isCanceled.operand.get(0) instanceof PreviousModifier) {
			error(ISCANCELED_OPERAND_0_CHECK, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
	}
}
