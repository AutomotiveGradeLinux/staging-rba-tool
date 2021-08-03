package rba.tool.editor.validation.validators

import java.util.HashSet
import org.eclipse.xtext.validation.Check
import rba.core.AbstractAllocatable
import rba.core.RBACorePackage
import rba.sound.Zone
import rba.sound.ZoneSet
import rba.tool.editor.messages.Messages

class ZoneSetValidator extends AllocatableSetValidator {

	private String ZONESET_TARGET_SIZE = Messages.ZONESET_TARGET_SIZE;

	private String ZONESET_TARGET_INVALID_TYPE = Messages.ZONESET_TARGET_INVALID_TYPE;

	private String ZONESET_TARGET_INCLUDE_SELF = Messages.ZONESET_TARGET_INCLUDE_SELF;

	private String ZONESET_TARGET_DUPLICATE = Messages.ZONESET_TARGET_DUPLICATE;

	@Check(NORMAL)
	def checkContent(ZoneSet zoneSet) {
		if (zoneSet.target.size === 0) {
			warning(String.format(ZONESET_TARGET_SIZE, zoneSet.name), RBACorePackage.Literals.ALLOCATABLE_SET__TARGET);
		}

		if (zoneSet.target.contains(zoneSet)) {
			error(String.format(ZONESET_TARGET_INCLUDE_SELF, zoneSet.name), RBACorePackage.Literals.ALLOCATABLE_SET__TARGET, zoneSet.target.indexOf(zoneSet));
			return;
		}

		var hash = new HashSet<AbstractAllocatable>
		for (var index = 0; index < zoneSet.target.size; index.operator_plusPlus()) {
			val AbstractAllocatable abstractAllocatable = zoneSet.target.get(index);
			if (!(abstractAllocatable instanceof Zone || abstractAllocatable instanceof ZoneSet)) {
				error(String.format(ZONESET_TARGET_INVALID_TYPE, zoneSet.name), RBACorePackage.Literals.ALLOCATABLE_SET__TARGET, index);
				return;
			}
			if (hash.contains(abstractAllocatable)) {
				error(String.format(ZONESET_TARGET_DUPLICATE, zoneSet.name), RBACorePackage.Literals.ALLOCATABLE_SET__TARGET, index);
				return;
			} else {
				hash.add(abstractAllocatable)
			}
		}
	}
}
