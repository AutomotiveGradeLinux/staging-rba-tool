package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.core.LetStatement

class LetStatementValidator extends AbstractRBAModelValidator {

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsHidden(LetStatement op) {
		if (op.body.type != ExpressionType::VALUE &&
			op.body.type != ExpressionType::BOOLEAN &&
			op.body.type != ExpressionType::AREA &&
			op.body.type != ExpressionType::CONTENT &&
			op.body.type != ExpressionType::SET_OF_AREA &&
			op.body.type != ExpressionType::SET_OF_CONTENT &&
			op.body.type != ExpressionType::SCENE &&
			op.body.type != ExpressionType::ZONE &&
			op.body.type != ExpressionType::SET_OF_ZONE &&
			op.body.type != ExpressionType::SOUND &&
			op.body.type != ExpressionType::SET_OF_SOUND &&
			op.body.type != ExpressionType::CONTENT_STATE) {
				error(String.format(Messages.BODY_MUST_OBJECT, "let"), RBACorePackage.Literals.LET_STATEMENT__BODY)
				return;
			}
	}
}
