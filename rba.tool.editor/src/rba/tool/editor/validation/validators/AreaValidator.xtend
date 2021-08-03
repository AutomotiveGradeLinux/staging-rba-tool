package rba.tool.editor.validation.validators

import java.util.function.Consumer
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.ExpressionType
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.rbaEditorModel.CTag
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.view.Area
import rba.view.RBAViewPackage

class AreaValidator extends AbstractRBAModelValidator {


	private String AREA_VISIBILITY_TYPE = Messages.AREA_VISIBILITY_TYPE;

	private String AREA_ZORDER_TYPE = Messages.AREA_ZORDER_TYPE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	private Consumer<String> errorToName = [msg|error(msg, RBACorePackage.Literals.NAMED_ELEMENT__NAME, 0)];

	@Check(NORMAL)
	def checkArea(Area area) {
//		for (var index = 0; index < area.tags.size; index.operator_plusPlus()) {
//			val Tag tag = area.tags.get(index);
//			if (!tag.stereotype.targetModelName.equals(Area.simpleName)) {
//				error(String.format(TARGET_MODEL_NAME_MISMATCH, Area.simpleName, tag.stereotype.targetModelName), RBACorePackage.Literals.TAG__STEREOTYPE);
//				return;
//			}
//		}
	}

	@Check(NORMAL)
	def check0RequiredFields(Area area) {
//		println(this.class.simpleName)
		val tags = area.tags;

		if(tags.isNullOrEmpty || !tags.filter(CTag).isEmpty) {
			if(!doRequiredFieldsCheck(area)) return;
		}
	}

	def protected doRequiredFieldsCheck(Area area) {
		var passed = false;
		passed = ValidatorUtils.mustHaveVisibility(area, errorToName)
		if(!passed) {
			return false;
		}
		if(area.visibility.type != ExpressionType.VALUE) {
			error(String.format(AREA_VISIBILITY_TYPE, area.name), RBACorePackage.Literals.ALLOCATABLE__VISIBILITY);
			return false;
		}
		passed = ValidatorUtils.mustHaveZorder(area, errorToName);
		if(!passed) {
			return false;
		}
		if(area.zorder.type != ExpressionType.VALUE) {
			error(String.format(AREA_ZORDER_TYPE, area.name), RBAViewPackage.Literals.AREA__ZORDER);
			return false;
		}
		passed = ValidatorUtils.mustHaveLeastOneSize(area, errorToName);
		if(!passed) {
			return false;
		}

		return true;
	}

}
