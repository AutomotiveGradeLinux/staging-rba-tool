package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.OffScene
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class OffSceneValidator extends AbstractRBAModelValidator {

	private String OFFSCENE_OPERAND_SIZE_CHECK = Messages.OFFSCENE_OPERAND_SIZE_CHECK;

	private String OFFSCENE_OPERAND_TYPE_CHECK = Messages.OFFSCENE_OPERAND_TYPE_CHECK;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkOffScene(OffScene offScene) {
		if (offScene.operand.size > 1) {
			error(OFFSCENE_OPERAND_SIZE_CHECK, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		var operand = offScene.operand.get(0)
		if (operand.type != ExpressionType.SCENE) {
			error(OFFSCENE_OPERAND_TYPE_CHECK, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
	}
}
