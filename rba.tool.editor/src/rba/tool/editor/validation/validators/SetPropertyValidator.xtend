package rba.tool.editor.validation.validators

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.IntegerProperty
import rba.core.ObjectReference
import rba.core.RBACorePackage
import rba.core.Scene
import rba.core.SetProperty
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.core.IntegerValue
import org.eclipse.xtext.EcoreUtil2
import rba.core.PreviousModifier

class SetPropertyValidator extends AbstractRBAModelValidator {

	private String SETPROPERTY_OPERAND_SIZE_CHECK = Messages.SETPROPERTY_OPERAND_SIZE_CHECK;

	private String SETPROPERTY_OPERAND_0_TYPE_CHECK = Messages.SETPROPERTY_OPERAND_0_TYPE_CHECK;

	private String SETPROPERTY_OPERAND_ISGLOBALSCENE = Messages.SETPROPERTY_OPERAND_ISGLOBALSCENE;

	private String SETPROPERTY_OPERAND_1_TYPE_CHECK = Messages.SETPROPERTY_OPERAND_1_TYPE_CHECK;

	private String SETPROPERTY_PROPERTY_NEGATIVE = Messages.SETPROPERTY_PROPERTY_NEGATIVE

	private String OPERAND_CANNOT_USE_PRE = Messages.OPERAND_CANNOT_USE_PRE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkSetProperty(SetProperty setProperty) {
		if (setProperty.operand.size < 2) {
			error(SETPROPERTY_OPERAND_SIZE_CHECK, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		var operand0 = setProperty.operand.get(0)
		if (operand0.type != ExpressionType.PROPERTY) {
			error(SETPROPERTY_OPERAND_0_TYPE_CHECK, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		if (operand0 instanceof PreviousModifier || EcoreUtil2.getAllContentsOfType(operand0, PreviousModifier).size != 0) {
				error(String.format(OPERAND_CANNOT_USE_PRE, setProperty.symbol), RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
		}
		if (operand0 instanceof ObjectReference) {
			var parent = isParentScene(operand0.refObject)
			if (parent !== null) {
				var scene = parent as Scene
				if (!scene.global) {
					error(SETPROPERTY_OPERAND_ISGLOBALSCENE, RBACorePackage.Literals.OPERATOR__OPERAND)
					return;
				}
			}
		}
		var operand1 = setProperty.operand.get(1)
		if (!(operand1 instanceof IntegerValue)) {
			error(SETPROPERTY_OPERAND_1_TYPE_CHECK, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		if (operand1 instanceof IntegerValue) {
			if(operand1.getValue() < 0) {
				error(SETPROPERTY_PROPERTY_NEGATIVE, RBACorePackage.Literals.OPERATOR__OPERAND)
				return;
			}
		}
	}

	def EObject isParentScene(EObject object) {
		if (object instanceof Scene) {
			return object as Scene;
		}
		if (object instanceof IntegerProperty) {
			return isParentScene(object.owner)
		}
		return null;
	}
}
