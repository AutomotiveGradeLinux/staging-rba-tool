package rba.tool.editor.validation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;

import rba.core.NamedElement;
import rba.core.RBACorePackage;

public class RBADiagnostician extends Diagnostician {

    @Override
    public String getObjectLabel(EObject eObject) {

        EClass eClass = eObject.eClass();
        if (RBACorePackage.Literals.NAMED_ELEMENT.isSuperTypeOf(eClass)) {
            return ((NamedElement)eObject).getName();
        } else {
            return eClass.getName();
        }
    }
}
