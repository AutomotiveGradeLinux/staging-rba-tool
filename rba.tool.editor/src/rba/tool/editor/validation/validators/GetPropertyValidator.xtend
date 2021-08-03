package rba.tool.editor.validation.validators

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.GetProperty
import rba.core.IntegerProperty
import rba.core.ObjectReference
import rba.core.RBACorePackage
import rba.core.Scene
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.core.ExpressionType

class GetPropertyValidator extends AbstractRBAModelValidator {

	private String GETPROPERTY_OPERAND_SIZE_CHECK = Messages.GETPROPERTY_OPERAND_SIZE_CHECK;

	private String GETPROPERTY_OPERAND_TYPE_CHECK = Messages.GETPROPERTY_OPERAND_TYPE_CHECK;

	private String GETPROPERTY_OPERAND_ISGLOBALSCENE = Messages.GETPROPERTY_OPERAND_ISGLOBALSCENE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkGetProperty(GetProperty getProperty) {
		if (getProperty.operand.size > 1) {
			error(GETPROPERTY_OPERAND_SIZE_CHECK, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		var operand = getProperty.operand.get(0)
		if (operand.type != ExpressionType.PROPERTY) {
			error(GETPROPERTY_OPERAND_TYPE_CHECK, RBACorePackage.Literals.OPERATOR__OPERAND)
			return;
		}
		if (operand instanceof ObjectReference) {
			var parent = isParentScene(operand.refObject)
			if (parent !== null) {
				var scene = parent as Scene
				if (!scene.global) {
					error(GETPROPERTY_OPERAND_ISGLOBALSCENE, RBACorePackage.Literals.OPERATOR__OPERAND)
					return;
				}
			} else {
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
