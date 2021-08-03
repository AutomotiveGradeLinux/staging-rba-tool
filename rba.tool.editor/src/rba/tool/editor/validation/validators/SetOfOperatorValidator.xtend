package rba.tool.editor.validation.validators

import java.util.HashSet
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.ObjectReference
import rba.core.RBACorePackage
import rba.core.RuleObject
import rba.core.SetOfOperator
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.core.PreviousModifier

class SetOfOperatorValidator extends AbstractRBAModelValidator {

	private String SET_OF_OPERAND_TYPE = Messages.SET_OF_OPERAND_TYPE;

	private String SET_OF_OPERAND_DUPLICATE = Messages.SET_OF_OPERAND_DUPLICATE;

	private String OPERANDS_CANNOT_USE_PRE = Messages.OPERANDS_CANNOT_USE_PRE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkIsEqualToOperator(SetOfOperator setOfOperator) {
		val notNullOp = setOfOperator.operand.filter(o|o.type != ExpressionType.NULL)
		if (notNullOp.size == 0) {
			return;
		}
		val firstType = notNullOp.get(0).type
		
		var hash = new HashSet<RuleObject>
		for (operand : setOfOperator.operand) {
			
			if (operand instanceof PreviousModifier) {
				error(String.format(OPERANDS_CANNOT_USE_PRE, "SetOf"), RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
			
			var opType = operand.type

			switch (firstType) {
				case ExpressionType.AREA,
				case ExpressionType.SET_OF_AREA: {
					if (!(opType === ExpressionType.AREA || opType === ExpressionType.SET_OF_AREA || opType === ExpressionType.NULL)
					) {
						error(SET_OF_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
						return;
					}
				}
				case ExpressionType.CONTENT,
				case ExpressionType.SET_OF_CONTENT: {
					if (!(opType === ExpressionType.CONTENT || opType === ExpressionType.SET_OF_CONTENT
						|| opType === ExpressionType.NULL
					)) {
						error(SET_OF_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
						return;
					}
				}
				case ExpressionType.ZONE,
				case ExpressionType.SET_OF_ZONE: {
					if (!(opType === ExpressionType.ZONE || opType === ExpressionType.SET_OF_ZONE)) {
						error(SET_OF_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
						return;
					}
				}
				case ExpressionType.SOUND,
				case ExpressionType.SET_OF_SOUND: {
					if (!(opType === ExpressionType.SOUND || opType === ExpressionType.SET_OF_SOUND)) {
						error(SET_OF_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
						return;
					}
				}
				case ExpressionType.SCENE: {
					if (!(opType === ExpressionType.SCENE)) {
						error(SET_OF_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
						return;
					}
				}
				case ExpressionType.PROPERTY: {
					if (!(opType === ExpressionType.PROPERTY)) {
						error(SET_OF_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
						return;
					}
				}
				default: {
					error(SET_OF_OPERAND_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
					return;
				}
			}

			if (operand instanceof ObjectReference) {
				var refObj = (operand as ObjectReference).refObject
				if (hash.contains(refObj)) {
					error(SET_OF_OPERAND_DUPLICATE, RBACorePackage.Literals.OPERATOR__OPERAND);
					return;
				} else {
					hash.add(refObj)
				}
			}
		}
	}
}
