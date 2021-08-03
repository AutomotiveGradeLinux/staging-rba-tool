package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.IfStatement
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class IfStatementValidator extends AbstractRBAModelValidator {

	private String CONDITION_BOOLEAN_TYPE_CHECK = Messages.CONDITION_BOOLEAN_TYPE_CHECK;

	private String CONDITION_TPYE_EQUAL_CHECK = Messages.CONDITION_TPYE_EQUAL_CHECK;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIfStatement(IfStatement ifStatement) {
		if (ifStatement.condition.type !== ExpressionType.BOOLEAN) {
			error(CONDITION_BOOLEAN_TYPE_CHECK, RBACorePackage.Literals.IF_STATEMENT__CONDITION);
			return;
		}
		if (!isExpressionTypeEquals(ifStatement.thenExpression.type, ifStatement.elseExpression.type)) {
			error(CONDITION_TPYE_EQUAL_CHECK, RBACorePackage.Literals.IF_STATEMENT__ELSE_EXPRESSION);
			return;
		}
	}

	def boolean isExpressionTypeEquals(ExpressionType type1, ExpressionType type2) {
		if (type1 === type2) {
			return true;
		}
		return false
	}
}
