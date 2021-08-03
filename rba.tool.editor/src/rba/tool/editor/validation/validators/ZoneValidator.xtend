package rba.tool.editor.validation.validators

import java.util.function.Consumer
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.RBACorePackage
import rba.sound.RBASoundPackage
import rba.sound.Zone
import rba.tool.editor.messages.Messages
import rba.tool.editor.rbaEditorModel.CTag
import rba.tool.editor.validation.AbstractRBAModelValidator

class ZoneValidator extends AbstractRBAModelValidator {
	private String TARGET_MODEL_NAME_MISMATCH = Messages.TARGET_MODEL_NAME_MISMATCH;
	private String ZONE_VISIBILITY_NEGATIVE = Messages.ZONE_VISIBILITY_NEGATIVE;
	private String ZONE_ATTENUATE_NEGATIVE = Messages.ZONE_ATTENUATE_NEGATIVE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	private Consumer<String> errorToName = [msg|error(msg, RBACorePackage.Literals.NAMED_ELEMENT__NAME, 0)];

	@Check(NORMAL)
	def checkZone(Zone zone) {
		var visibility = zone.getVisibility()
		if (visibility instanceof rba.core.impl.IntegerValueImpl) {
			if (visibility.getValue() < 0) {
				error(ZONE_VISIBILITY_NEGATIVE, RBACorePackage.Literals.ALLOCATABLE__VISIBILITY);
				return;
			}
		}
		var attenuate = zone.getAttenuate();
		if (attenuate instanceof rba.core.impl.IntegerValueImpl) {
			if (attenuate.getValue() < 0) {
				error(ZONE_ATTENUATE_NEGATIVE, RBASoundPackage.Literals.ZONE__ATTENUATE);
				return;
			}
		}

//		for (var index = 0; index < zone.tags.size; index.operator_plusPlus()) {
//			val Tag tag = zone.tags.get(index);
//			if (!tag.stereotype.targetModelName.equals(Zone.simpleName)) {
//				error(String.format(TARGET_MODEL_NAME_MISMATCH, Zone.simpleName, tag.stereotype.targetModelName), RBACorePackage.Literals.TAG__STEREOTYPE);
//				return;
//			}
//		}
	}

	@Check(NORMAL)
	def check0RequiredFields(Zone zone) {
//		println(this.class.simpleName)
		val tags = zone.tags;

		if(tags.isNullOrEmpty || !tags.filter(CTag).isEmpty) {
			if(!doRequiredFieldsCheck(zone)) return;
		}
	}

	def protected doRequiredFieldsCheck(Zone zone) {
		var passed = ValidatorUtils.mustHaveVisibility(zone, errorToName)
		if(!passed) {
			return false;
		}

		return true;
	}

}
