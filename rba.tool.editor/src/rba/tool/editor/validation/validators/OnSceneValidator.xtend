package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.OnScene
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class OnSceneValidator extends AbstractRBAModelValidator {

	private String ONSCENE_OPERAND_SIZE_CHECK = Messages.ONSCENE_OPERAND_SIZE_CHECK;

	private String ONSCENE_OPERAND_TYPE_CHECK = Messages.ONSCENE_OPERAND_TYPE_CHECK;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkOnScene(OnScene onScene) {
		if (onScene.operand.size > 1) {
			error(ONSCENE_OPERAND_SIZE_CHECK, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		var operand = onScene.operand.get(0)
		if (operand.type != ExpressionType.SCENE) {
			error(ONSCENE_OPERAND_TYPE_CHECK, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
	}
}
