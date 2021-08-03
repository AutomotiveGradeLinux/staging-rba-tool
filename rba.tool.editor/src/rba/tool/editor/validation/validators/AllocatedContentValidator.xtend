package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.AllocatedContent
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator

class AllocatedContentValidator extends AbstractRBAModelValidator {

	private String ALLOCATEDCONTENT_TYPE = Messages.ALLOCATEDCONTENT_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkAllocatedContent(AllocatedContent allocatedContent) {
		for (operand : allocatedContent.operand) {
			switch (operand.type) {
				case ExpressionType.AREA,
				case ExpressionType.SET_OF_AREA,
				case ExpressionType.ZONE,
				case ExpressionType.SET_OF_ZONE: {
					return;
				}
				default: {
					error(ALLOCATEDCONTENT_TYPE, RBACorePackage.Literals.OPERATOR__OPERAND);
					return;
				}
			}
		}
	}
}
