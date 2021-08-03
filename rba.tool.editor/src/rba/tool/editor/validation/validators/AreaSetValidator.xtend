package rba.tool.editor.validation.validators

import java.util.HashSet
import org.eclipse.xtext.validation.Check
import rba.core.AbstractAllocatable
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.view.Area
import rba.view.AreaSet

class AreaSetValidator extends AllocatableSetValidator {

	private String AREASET_TARGET_SIZE = Messages.AREASET_TARGET_SIZE;

	private String AREASET_TARGET_INVALID_TYPE = Messages.AREASET_TARGET_INVALID_TYPE;

	private String AREASET_TARGET_INCLUDE_SELF = Messages.AREASET_TARGET_INCLUDE_SELF;

	private String AREASET_TARGET_DUPLICATE = Messages.AREASET_TARGET_DUPLICATE;

	@Check(NORMAL)
	def checkContent(AreaSet areaSet) {
		if (areaSet.target.size === 0) {
			warning(String.format(AREASET_TARGET_SIZE, areaSet.name), RBACorePackage.Literals.ALLOCATABLE_SET__TARGET);
		}

		if (areaSet.target.contains(areaSet)) {
			error(String.format(AREASET_TARGET_INCLUDE_SELF, areaSet.name), RBACorePackage.Literals.ALLOCATABLE_SET__TARGET, areaSet.target.indexOf(areaSet));
			return;
		}

		var hash = new HashSet<AbstractAllocatable>
		for (var index = 0; index < areaSet.target.size; index.operator_plusPlus()) {
			val AbstractAllocatable abstractAllocatable = areaSet.target.get(index);
			if (!(abstractAllocatable instanceof Area || abstractAllocatable instanceof AreaSet)) {
				error(String.format(AREASET_TARGET_INVALID_TYPE, areaSet.name), RBACorePackage.Literals.ALLOCATABLE_SET__TARGET, index);
				return;
			}
			if (hash.contains(abstractAllocatable)) {
				error(String.format(AREASET_TARGET_DUPLICATE, areaSet.name), RBACorePackage.Literals.ALLOCATABLE_SET__TARGET, index);
				return;
			} else {
				hash.add(abstractAllocatable)
			}
		}
	}
}
