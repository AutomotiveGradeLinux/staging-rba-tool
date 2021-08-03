package rba.tool.editor.validation.validators

import java.util.HashSet
import org.eclipse.xtext.validation.Check
import rba.core.AbstractAllocatable
import rba.core.AbstractContent
import rba.core.RBACorePackage
import rba.sound.SoundContent
import rba.sound.SoundContentSet
import rba.sound.Zone
import rba.sound.ZoneSet
import rba.tool.editor.messages.Messages

class SoundContentSetValidator extends ContentSetValidator {

	private String SOUNDCONTENTSET_TARGET_SIZE = Messages.SOUNDCONTENTSET_TARGET_SIZE;

	private String SOUNDCONTENTSET_TARGET_INVALID_TYPE = Messages.SOUNDCONTENTSET_TARGET_INVALID_TYPE;

	private String SOUNDCONTENTSET_TARGET_INCLUDE_SELF = Messages.SOUNDCONTENTSET_TARGET_INCLUDE_SELF;

	private String SOUNDCONTENTSET_TARGET_DUPLICATE = Messages.SOUNDCONTENTSET_TARGET_DUPLICATE;

	private String SOUNDCONTENTSET_ALLOCATABLE_INVALID_TYPE = Messages.SOUNDCONTENTSET_ALLOCATABLE_INVALID_TYPE;

	private String SOUNDCONTENTSET_ALLOCATABLE_DUPLICATE = Messages.SOUNDCONTENTSET_ALLOCATABLE_DUPLICATE;

	@Check(NORMAL)
	def checkContent(SoundContentSet soundContentSet) {
		if (soundContentSet.target.size === 0) {
			warning(String.format(SOUNDCONTENTSET_TARGET_SIZE, soundContentSet.name), RBACorePackage.Literals.CONTENT_SET__TARGET);
		}

		if (soundContentSet.target.contains(soundContentSet)) {
			error(String.format(SOUNDCONTENTSET_TARGET_INCLUDE_SELF, soundContentSet.name), RBACorePackage.Literals.CONTENT_SET__TARGET,
				soundContentSet.target.indexOf(soundContentSet));
			return;
		}

		var hash = new HashSet<AbstractContent>
		for (var index = 0; index < soundContentSet.target.size; index.operator_plusPlus()) {
			val AbstractContent abstractContent = soundContentSet.target.get(index);
			if (!(abstractContent instanceof SoundContent || abstractContent instanceof SoundContentSet)) {
				error(String.format(SOUNDCONTENTSET_TARGET_INVALID_TYPE, soundContentSet.name), RBACorePackage.Literals.CONTENT_SET__TARGET, index);
				return;
			}
			if (hash.contains(abstractContent)) {
				error(String.format(SOUNDCONTENTSET_TARGET_DUPLICATE, soundContentSet.name), RBACorePackage.Literals.CONTENT_SET__TARGET, index);
				return;
			} else {
				hash.add(abstractContent)
			}
		}

		var allocatableSet = new HashSet<AbstractAllocatable>
		for (var index = 0; index < soundContentSet.allocatable.size; index.operator_plusPlus()) {
			val AbstractAllocatable abstractAllocatable = soundContentSet.allocatable.get(index);
			if (!(abstractAllocatable instanceof Zone || abstractAllocatable instanceof ZoneSet)) {
				error(String.format(SOUNDCONTENTSET_ALLOCATABLE_INVALID_TYPE, soundContentSet.name), RBACorePackage.Literals.ABSTRACT_CONTENT__ALLOCATABLE, index);
				return;
			}
			if (allocatableSet.contains(abstractAllocatable)) {
				error(String.format(SOUNDCONTENTSET_ALLOCATABLE_DUPLICATE, soundContentSet.name), RBACorePackage.Literals.ABSTRACT_CONTENT__ALLOCATABLE, index);
				return;
			} else {
				allocatableSet.add(abstractAllocatable)
			}
		}
	}
}
