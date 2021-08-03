package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.GetAllocatables
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class GetAllocatablesValidator extends AbstractRBAModelValidator {

	private String GETALLOCATABLES_SIZE = Messages.GETALLOCATABLES_SIZE;

	private String GETALLOCATABLES_TYPE = Messages.GETALLOCATABLES_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkGetAllocatable(GetAllocatables getAllocatable) {
		if (getAllocatable.operand.size > 1) {
			error(GETALLOCATABLES_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		for (operand : getAllocatable.operand) {
			if (operand.type != ExpressionType.CONTENT && operand.type != ExpressionType.SOUND) {
				error(GETALLOCATABLES_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
