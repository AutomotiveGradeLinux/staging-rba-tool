package rba.tool.editor.validation.validators

import java.util.HashSet
import java.util.function.Consumer
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.AbstractAllocatable
import rba.core.RBACorePackage
import rba.sound.SoundContent
import rba.sound.Zone
import rba.sound.ZoneSet
import rba.tool.editor.messages.Messages
import rba.tool.editor.rbaEditorModel.CTag
import rba.sound.RBASoundPackage

class SoundContentValidator extends AbstractContentValidator {

	private String SOUND_ALLOCATABLE_INVALID_TYPE = Messages.SOUND_ALLOCATABLE_INVALID_TYPE;

	private String SOUND_ALLOCATABLE_DUPLICATE = Messages.SOUND_ALLOCATABLE_DUPLICATE;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	private Consumer<String> errorToName = [msg|error(msg, RBACorePackage.Literals.NAMED_ELEMENT__NAME, 0)];

	@Check(NORMAL)
	def checkSOUND(SoundContent soundContent) {
		var hash = new HashSet<AbstractAllocatable>
		for (var index = 0; index < soundContent.allocatable.size; index.operator_plusPlus()) {
			val AbstractAllocatable abstractAllocatable = soundContent.allocatable.get(index);
			if(!(abstractAllocatable instanceof Zone || abstractAllocatable instanceof ZoneSet)) {
				error(String.format(SOUND_ALLOCATABLE_INVALID_TYPE, soundContent.name), RBACorePackage.Literals.ABSTRACT_CONTENT__ALLOCATABLE, index);
				return;
			}
			if(hash.contains(abstractAllocatable)) {
				error(String.format(SOUND_ALLOCATABLE_DUPLICATE, soundContent.name), RBACorePackage.Literals.ABSTRACT_CONTENT__ALLOCATABLE, index);
				return;
			} else {
				hash.add(abstractAllocatable)
			}
		}

//		for (var index = 0; index < soundContent.tags.size; index.operator_plusPlus()) {
//			val Tag tag = soundContent.tags.get(index);
//			if (!tag.stereotype.targetModelName.equals(SoundContent.simpleName)) {
//				error(String.format(TARGET_MODEL_NAME_MISMATCH, SoundContent.simpleName, tag.stereotype.targetModelName), RBACorePackage.Literals.TAG__STEREOTYPE);
//				return;
//			}
//		}
	}

	@Check(NORMAL)
	def check0RequiredFields(SoundContent soundContent) {
//		println(this.class.simpleName)
		val tags = soundContent.tags;

		if(tags.isNullOrEmpty || !tags.filter(CTag).isEmpty) {
			if(!doRequiredFieldsCheck(soundContent)) return;
		}
	}

	def protected doRequiredFieldsCheck(SoundContent soundContent) {
		var passed = false;
		passed = ValidatorUtils.mustHaveLeastOneState(soundContent, errorToName);
		if(!passed) {
			return false;
		}
		passed = false;
		for (var index = 0; index < soundContent.contentGroup.size; index.operator_plusPlus()) {
			if(!soundContent.contentGroup.get(index).allocatable.empty) {
				passed = true
			}
		}
		if(!passed) {
			passed = ValidatorUtils.mustHaveLeastOneAllocatable(soundContent, errorToName);
			if(!passed) {
				return false;
			}
		}

		return true;
	}

}
