package rba.tool.core.util;

import org.eclipse.emf.ecore.EObject;

import rba.core.NamedElement;
import rba.core.Package;

public class ModelUtil {

	public static final String SEPARATOR = "/";
	
	public static String getRBAModelHierarchicalName(NamedElement target) {
		return getRBAModelHierarchicalName(target, SEPARATOR);
	}

	public static String getRBAModelHierarchicalName(NamedElement target, String separator) {
		EObject parent = target.eContainer();
		if (parent == null || !(parent instanceof NamedElement) || parent instanceof Package) {
			return target.getName();
		} else {
			return getRBAModelHierarchicalName((NamedElement) parent, separator) + separator + target.getName();
		}
	}
	
	public static String convertModelName2ArbitrateName(String modelName) {
		if (modelName == null) return modelName;
		return modelName.replace(".", "/");
	}
}
