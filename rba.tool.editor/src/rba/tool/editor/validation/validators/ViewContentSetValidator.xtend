package rba.tool.editor.validation.validators

import java.util.HashSet
import org.eclipse.xtext.validation.Check
import rba.core.AbstractAllocatable
import rba.core.AbstractContent
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.view.Area
import rba.view.AreaSet
import rba.view.ViewContent
import rba.view.ViewContentSet

class ViewContentSetValidator extends ContentSetValidator {

	private String VIEWCONTENTSET_TARGET_SIZE = Messages.VIEWCONTENTSET_TARGET_SIZE;

	private String VIEWCONTENTSET_TARGET_INVALID_TYPE = Messages.VIEWCONTENTSET_TARGET_INVALID_TYPE;

	private String VIEWCONTENTSET_TARGET_INCLUDE_SELF = Messages.VIEWCONTENTSET_TARGET_INCLUDE_SELF;

	private String VIEWCONTENTSET_TARGET_DUPLICATE = Messages.VIEWCONTENTSET_TARGET_DUPLICATE;

	private String VIEWCONTENTSET_ALLOCATABLE_INVALID_TYPE = Messages.VIEWCONTENTSET_ALLOCATABLE_INVALID_TYPE;

	private String VIEWCONTENTSET_ALLOCATABLE_DUPLICATE = Messages.VIEWCONTENTSET_ALLOCATABLE_DUPLICATE;

	@Check(NORMAL)
	def checkContent(ViewContentSet viewContentSet) {
		if (viewContentSet.target.size === 0) {
			warning(String.format(VIEWCONTENTSET_TARGET_SIZE, viewContentSet.name), RBACorePackage.Literals.CONTENT_SET__TARGET);
		}

		if (viewContentSet.target.contains(viewContentSet)) {
			error(String.format(VIEWCONTENTSET_TARGET_INCLUDE_SELF, viewContentSet.name), RBACorePackage.Literals.CONTENT_SET__TARGET, viewContentSet.target.indexOf(
				viewContentSet));
			return;
		}

		var hash = new HashSet<AbstractContent>
		for (var index = 0; index < viewContentSet.target.size; index.operator_plusPlus()) {
			val AbstractContent abstractContent = viewContentSet.target.get(index);
			if (!(abstractContent instanceof ViewContent || abstractContent instanceof ViewContentSet)) {
				error(String.format(VIEWCONTENTSET_TARGET_INVALID_TYPE, viewContentSet.name), RBACorePackage.Literals.CONTENT_SET__TARGET, index);
				return;
			}
			if (hash.contains(abstractContent)) {
				error(String.format(VIEWCONTENTSET_TARGET_DUPLICATE, viewContentSet.name), RBACorePackage.Literals.CONTENT_SET__TARGET, index);
				return;
			} else {
				hash.add(abstractContent)
			}
		}

		var allocatableSet = new HashSet<AbstractAllocatable>
		for (var index = 0; index < viewContentSet.allocatable.size; index.operator_plusPlus()) {
			val AbstractAllocatable abstractAllocatable = viewContentSet.allocatable.get(index);
			if (!(abstractAllocatable instanceof Area || abstractAllocatable instanceof AreaSet)) {
				error(String.format(VIEWCONTENTSET_ALLOCATABLE_INVALID_TYPE, viewContentSet.name), RBACorePackage.Literals.ABSTRACT_CONTENT__ALLOCATABLE, index);
				return;
			}
			if (allocatableSet.contains(abstractAllocatable)) {
				error(String.format(VIEWCONTENTSET_ALLOCATABLE_DUPLICATE, viewContentSet.name), RBACorePackage.Literals.ABSTRACT_CONTENT__ALLOCATABLE, index);
				return;
			} else {
				allocatableSet.add(abstractAllocatable)
			}
		}
	}
}
