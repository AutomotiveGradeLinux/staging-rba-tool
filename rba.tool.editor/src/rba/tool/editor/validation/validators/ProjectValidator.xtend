package rba.tool.editor.validation.validators

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.EValidatorRegistrar
import rba.core.RBACorePackage
import rba.tool.editor.messages.Messages
import rba.core.Project

class ProjectValidator extends AbstractContentValidator {

	public static String PROJECT_SIZE_CHECK = Messages.PROJECT_SIZE_CHECK;
	public static String PROJECT_NAME_CHECK = Messages.PROJECT_NAME_CHECK;
	
	override register(EValidatorRegistrar registrar) {
		// not needed for classes used as ComposedCheck
	}

	@Check(NORMAL)
	def checkProject(Project project) {
	
		val allProjects =project.eResource.resourceSet.resources.map(r|r.allContents.toIterable.filter(Project)).flatten;
		val definedPrjCnts = allProjects.size;
		if(definedPrjCnts != 1) {
			error(PROJECT_SIZE_CHECK, RBACorePackage.Literals.NAMED_ELEMENT__NAME);
		}
	
		if(project.getDummyName != null){
			error(PROJECT_NAME_CHECK, RBACorePackage.Literals.NAMED_ELEMENT__NAME);
		}
		 
		return true;
	} 

}
