package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.ObjectCompare
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import static rba.tool.editor.validation.validators.ValidatorUtils.*;
import rba.core.Expression
import java.util.List

class ObjectCompareValidator extends AbstractRBAModelValidator {

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	def protected getOperatorName() {
		return ObjectCompare.simpleName;
	}

	@Check(NORMAL)
	def checkObjectCompare(ObjectCompare objectCompare) {
		doCheck(objectCompare.operand);
	}

	/** Check points.
	 * * operand size is 2.
	 * * type of operands are AREA/CONTENT/ZONE/SOUND.
	 */
	def protected doCheck(List<Expression> operands) {
		if (!operandSizeMustBeTwo(operands, getOperatorName, [ msg | error(msg, RBACorePackage.Literals.OPERATOR__OPERAND, 0)])) {
			return;
		}

		val first = operands.get(0)
		switch (first.type) {
			case ExpressionType.VALUE: {
				val message = String.format(Messages.FIRST_OPERAND_MUST_BE_OBJECT, getOperatorName);
				error(message, RBACorePackage.Literals.OPERATOR__OPERAND, 0, null)
				return;
			}
			case AREA,
			case CONTENT,
			case CONTENT_STATE,
			case ZONE,
			case SOUND: {
			}
			default: {
				val message = String.format(Messages.OPERANDS_MUST_BE_OBJECT, getOperatorName);
				error(message, RBACorePackage.Literals.OPERATOR__OPERAND, 0, null)
				return;
			}
		}

		for (var i = 1; i < operands.size; i++) {
			var operand = operands.get(i)
			if (operand.type !== first.type && ObjectsMustBeAreaOrContent(operand.type, first.type)) {
				val message = String.format(Messages.OPERANDS_MUST_BE_OBJECT, getOperatorName);
				error(message, RBACorePackage.Literals.OPERATOR__OPERAND, i, null)
				return;
			}
		}
	}
	
	def private boolean ObjectsMustBeAreaOrContent(ExpressionType type1, ExpressionType type2) {
		return true
	}
}
