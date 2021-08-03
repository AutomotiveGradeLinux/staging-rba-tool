package rba.tool.editor.validation.validators

import java.util.HashSet
import java.util.function.Consumer
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.AbstractAllocatable
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.rbaEditorModel.CTag
import rba.view.Area
import rba.view.AreaSet
import rba.view.ViewContent

class ViewContentValidator extends AbstractContentValidator {

	private String CONTENT_ALLOCATABLE_INVALID_TYPE = Messages.CONTENT_ALLOCATABLE_INVALID_TYPE;

	private String CONTENT_ALLOCATABLE_DUPLICATE = Messages.CONTENT_ALLOCATABLE_DUPLICATE;

	public static String CONTENT_DISPLAY_SIZE_CHECK = Messages.CONTENT_DISPLAY_SIZE_CHECK;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	private Consumer<String> errorToName = [msg|error(msg, RBACorePackage.Literals.NAMED_ELEMENT__NAME, 0)];

	@Check(NORMAL)
	def checkContent(ViewContent viewContent) {
		var hash = new HashSet<AbstractAllocatable>
		for (var index = 0; index < viewContent.allocatable.size; index.operator_plusPlus()) {
			val AbstractAllocatable abstractAllocatable = viewContent.allocatable.get(index);
			if(!(abstractAllocatable instanceof Area || abstractAllocatable instanceof AreaSet)) {
				error(String.format(CONTENT_ALLOCATABLE_INVALID_TYPE, viewContent.name), RBACorePackage.Literals.ABSTRACT_CONTENT__ALLOCATABLE, index);
				return;
			}
			if(hash.contains(abstractAllocatable)) {
				error(String.format(CONTENT_ALLOCATABLE_DUPLICATE, viewContent.name), RBACorePackage.Literals.ABSTRACT_CONTENT__ALLOCATABLE, index);
				return;
			} else {
				hash.add(abstractAllocatable)
			}
		}

//		for (var index = 0; index < viewContent.tags.size; index.operator_plusPlus()) {
//			val Tag tag = viewContent.tags.get(index);
//			if (!tag.stereotype.targetModelName.equals(ViewContent.simpleName)) {
//				error(String.format(TARGET_MODEL_NAME_MISMATCH, ViewContent.simpleName, tag.stereotype.targetModelName), RBACorePackage.Literals.TAG__STEREOTYPE);
//				return;
//			}
//		}
	}

	@Check(NORMAL)
	def check0RequiredFields(ViewContent viewContent) {
//		println(this.class.simpleName)
		val tags = viewContent.tags;

		if(tags.isNullOrEmpty || !tags.filter(CTag).isEmpty) {
			if(!doRequiredFieldsCheck(viewContent)) return;
		}
	}

	def protected doRequiredFieldsCheck(ViewContent viewContent) {
		var passed = false;
		passed = ValidatorUtils.mustHaveLeastOneState(viewContent, errorToName);
		if(!passed) {
			return false;
		}
		passed = ValidatorUtils.mustHaveLeastOneSize(viewContent, errorToName);
		if(!passed) {
			return false;
		}
		passed = false;
		for (var index = 0; index < viewContent.contentGroup.size; index.operator_plusPlus()) {
			if(!viewContent.contentGroup.get(index).allocatable.empty) {
				passed = true
			}
		}
		if(!passed) {
			passed = ValidatorUtils.mustHaveLeastOneAllocatable(viewContent, errorToName);
			if(!passed) {
				return false;
			}
		}

		return true;
	}

}
