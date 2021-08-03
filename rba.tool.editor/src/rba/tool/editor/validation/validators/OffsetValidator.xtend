package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.Area
import rba.view.Offset
import rba.view.PositionContainer
import rba.view.RBAViewPackage
import rba.view.SizeIdentifier
import rba.view.SizeReference

class OffsetValidator extends AbstractRBAModelValidator {

	private String OFFSET_SIZE_DUPLICATE = Messages.OFFSET_SIZE_DUPLICATE;

	private String OFFSET_SIZE_AREA_REF = Messages.OFFSET_SIZE_AREA_REF;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkOffset(Offset offset) {
		var parent = offset.eContainer as PositionContainer
		for (Offset target : parent.offset) {
			if (target != offset) {
				if (target.size.size == offset.size.size) {
					warning(OFFSET_SIZE_DUPLICATE, RBAViewPackage.Literals.OFFSET__SIZE);
					return;
				}
			}
		}

		if (!hasSameSizeInArea(parent, offset)) {
			warning(OFFSET_SIZE_AREA_REF, RBAViewPackage.Literals.OFFSET__SIZE);
			return;
		}
	}

	def hasSameSizeInArea(PositionContainer parent, Offset offset) {
		var chk = false;

		if (!(parent.area instanceof Area)) {
			return false
		}

		var area = parent.area as Area
		for (SizeIdentifier sizeId : area.size) {
			if (sizeId instanceof SizeReference) {
				var sizeRef = sizeId as SizeReference
				if (sizeRef.size == offset.size.size) {
					chk = true
				}
			}
		}
		if (chk == true) {
			return true;
		}

		return false;
	}
}
