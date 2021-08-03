package rba.tool.editor.validation.validators

import java.util.List
import java.util.function.Consumer
import rba.core.Expression
import rba.core.ExpressionType
import rba.tool.editor.messages.Messages
import rba.core.Allocatable
import rba.core.RBACorePackage
import rba.core.Content
import rba.view.RBAViewPackage
import rba.view.Area
import rba.view.ViewContent


class ValidatorUtils {

	def public static boolean isContent(Expression operand) {
		return (operand.type != ExpressionType.CONTENT && operand.type != ExpressionType.SOUND);
	}
	def private static String getModelType(Object obj) {
		return obj.class.simpleName.replaceAll("Impl", "");
	}

	/** @return true: Check passed. false: Error occurs. */
	def public static boolean mustHaveVisibility(Allocatable model, Consumer<String> handling) {
		if (!model.eIsSet(RBACorePackage.eINSTANCE.allocatable_Visibility)) {
			handling.accept(String.format(Messages.VISIBILITY_IS_REQUIRED, getModelType(model), model.name));
			return false;
		}
		return true;
	}

	/** @return true: Check passed. false: Error occurs. */
	def public static boolean mustHaveZorder(Area model, Consumer<String> handling) {
		if (!model.eIsSet(RBAViewPackage.eINSTANCE.area_Zorder)) {
			handling.accept(String.format(Messages.ZORDER_IS_REQUIRED, getModelType(model), model.name));
			return false;
		}
		return true;
	}

	/** @return true: Check passed. false: Error occurs. */
	def public static boolean mustHaveLeastOneSize(Area model, Consumer<String> handling) {
		if (model.size.empty) {
			handling.accept(String.format(Messages.HAS_AT_LEAST_ONE_SIZE, getModelType(model), model.name));
			return false;
		}
		return true;
	}

	/** @return true: Check passed. false: Error occurs. */
	def public static boolean mustHaveLeastOneSize(ViewContent model, Consumer<String> handling) {
		if (model.size.empty) {
			handling.accept(String.format(Messages.HAS_AT_LEAST_ONE_SIZE, getModelType(model), model.name));
			return false;
		}
		return true;
	}

	/** @return true: Check passed. false: Error occurs. */
	def public static boolean mustHaveLeastOneState(Content model, Consumer<String> handling) {
		if (model.states.empty) {
			handling.accept(String.format(Messages.HAS_AT_LEAST_ONE_STATE, getModelType(model), model.name));
			return false;
		}
		return true;
	}

	/** @return true: Check passed. false: Error occurs. */
	def public static boolean mustHaveLeastOneAllocatable(Content model, Consumer<String> handling) {
		if (model.allocatable.empty) {
			handling.accept(String.format(Messages.ALLOCATABLE_SIZE, getModelType(model), model.name));
			return false;
		}
		return true;
	}

	/** @return true: Check passed. false: Error occurs. */
	def public static boolean operandSizeMustBeOne(List<Expression> operands, String operatorName,
		Consumer<String> handling) {
		if (operands.size != 1) {
			handling.accept(String.format(Messages.OPERAND_SIZE_ONE, operatorName));
			return false;
		}
		return true;
	}

	/** @return true: Check passed. false: Find an error. */
	def public static boolean operandSizeMustBeTwo(List<Expression> operands, String operatorName,
		Consumer<String> handling) {
		if (operands.size != 2) {
			handling.accept(String.format(Messages.OPERAND_SIZE_TWO, operatorName));
			return false;
		}
		return true;
	}

	/** @return true: Check passed. false: Error occurs. */
	def public static boolean firstOperandMustBeContent(Expression firstOperand, String operatorName,
		Consumer<String> handling) {
		if (isContent(firstOperand)) {
			handling.accept(String.format(Messages.FIRST_OPERAND_MUST_CONTENT, operatorName));
			return false;
		}
		return true;
	}

}
