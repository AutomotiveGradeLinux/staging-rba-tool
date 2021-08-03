package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.Constraint
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class ConstraintValidator extends AbstractRBAModelValidator {

	private String CONSTRAINT_EXPRESSION_TYPE = Messages.CONSTRAINT_EXPRESSION_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkConstraint(Constraint constraint) {
		if (constraint.expression.type !== ExpressionType.BOOLEAN) {
			error(CONSTRAINT_EXPRESSION_TYPE, RBACorePackage.Literals.ABSTRACT_CONSTRAINT__EXPRESSION);
			return;
		}
	}

}
