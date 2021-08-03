package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import rba.core.ObjectCompareNot

class ObjectCompareNotValidator extends ObjectCompareValidator {
	def override protected getOperatorName() {
		return ObjectCompareNot.simpleName;
	}

	@Check(NORMAL)
	def check(ObjectCompareNot operator) {
		doCheck(operator.operand);
	}
}