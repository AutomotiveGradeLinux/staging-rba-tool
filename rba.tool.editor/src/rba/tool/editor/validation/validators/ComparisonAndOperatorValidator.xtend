package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ComparisonAnd
import rba.core.ComparisonOperator
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class ComparisonAndOperatorValidator extends AbstractRBAModelValidator {

	private String COMPARISONAND_OPERAND_SIZE = Messages.COMPARISONAND_OPERAND_SIZE;

	private String COMPARISONAND_OPERAND_TYPE = Messages.COMPARISONAND_OPERAND_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(FAST)
	def checkComparisonOperatorFast(ComparisonAnd comparisonAnd) {
		if (comparisonAnd.operand.size < 2) {
			error(COMPARISONAND_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
	}

	@Check(NORMAL)
	def checkComparisonOperatorNormal(ComparisonAnd comparisonAnd) {
		for (operand : comparisonAnd.operand) {
			if (operand instanceof ComparisonOperator) {
			} else {
				error(COMPARISONAND_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}
}
