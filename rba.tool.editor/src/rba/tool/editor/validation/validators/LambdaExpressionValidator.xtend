package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.LambdaExpression
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class LambdaExpressionValidator extends AbstractRBAModelValidator {

	private String LAMBDAEXPRESSION_TYPE = Messages.LAMBDAEXPRESSION_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkLambdaExpression(LambdaExpression lambdaExpression) {
		if (lambdaExpression.x.expressionType != lambdaExpression.context.contextType) {
			error(LAMBDAEXPRESSION_TYPE, RBACorePackage.Literals.LAMBDA_EXPRESSION__CONTEXT)
			return;
		}
	}
}
