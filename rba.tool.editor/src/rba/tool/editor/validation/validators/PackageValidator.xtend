package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.Package
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.tool.editor.validation.AbstractRBAModelValidator
import rba.core.Project

class PackageValidator extends AbstractRBAModelValidator {

	private String PACKAGE_CHILD_EXISTENCE_CHECK = Messages.PACKAGE_CHILD_EXISTENCE_CHECK;

	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkPackage(Package pack) {
		if(pack instanceof Project)
		{
			return;
		}
		if (pack.packagableelement.size == 0) {
			warning(String.format(PACKAGE_CHILD_EXISTENCE_CHECK, pack.name),
				RBACorePackage.Literals.PACKAGE__PACKAGABLEELEMENT);
			return;
		}
	}
}
