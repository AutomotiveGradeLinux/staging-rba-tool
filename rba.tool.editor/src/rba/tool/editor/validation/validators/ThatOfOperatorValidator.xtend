package rba.tool.editor.validation.validators

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.Allocatable
import rba.core.ContentState
import rba.core.ExpressionType
import rba.core.ObjectReference
import rba.core.RBACorePackage
import rba.core.ThatOfOperator
import rba.core.impl.OperatorImpl
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class ThatOfOperatorValidator extends AbstractRBAModelValidator {

	private String THATOF_OPERAND_SIZE = Messages.THATOF_OPERAND_SIZE;

	private String THATOF_OPERAND_OBJECTREFERENCE = Messages.THATOF_OPERAND_OBJECTREFERENCE;

	private String THATOF_OPERAND_OBJECTREFERENCE_EQUAL = Messages.THATOF_OPERAND_OBJECTREFERENCE_EQUAL;

	private String THATOF_OPERAND_EXPRESSIONTYPE = Messages.THATOF_OPERAND_EXPRESSIONTYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkThatOfOperator(ThatOfOperator thatOfOperator) {
		if (thatOfOperator.operand.size != 1) {
			error(THATOF_OPERAND_SIZE, RBACorePackage.Literals.OPERATOR__OPERAND);
			return;
		}
		for (operand : thatOfOperator.operand) {
			if (operand.type != ExpressionType.AREA && operand.type != ExpressionType.CONTENT_STATE && operand.type != ExpressionType.ZONE) {
				error(THATOF_OPERAND_EXPRESSIONTYPE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
		var thatOfoperand = thatOfOperator.operand.get(0)
		if (thatOfoperand instanceof ObjectReference) {
			var objRef = thatOfoperand as ObjectReference
			if (objRef.refObject.name !== null) {
				var parent = getParent(thatOfOperator)
				if ((parent instanceof ContentState && objRef.refObject instanceof ContentState) || (parent instanceof Allocatable && objRef.refObject instanceof Allocatable)) {
				} else {
					error(THATOF_OPERAND_OBJECTREFERENCE_EQUAL, RBACorePackage.Literals.OPERATOR__OPERAND)
					return;
				}
			} else {
				error(THATOF_OPERAND_OBJECTREFERENCE, RBACorePackage.Literals.OPERATOR__OPERAND);
				return;
			}
		} else {
			error(THATOF_OPERAND_OBJECTREFERENCE, RBACorePackage.Literals.OPERATOR__OPERAND);
			return;
		}
	}

	def EObject getParent(ThatOfOperator thatOfOperator) {
		var parent = thatOfOperator.eContainer
		while (parent instanceof OperatorImpl) {
			parent = parent.eContainer
		}
		return parent;
	}
}
