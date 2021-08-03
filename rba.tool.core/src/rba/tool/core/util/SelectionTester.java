package rba.tool.core.util;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;

public class SelectionTester extends PropertyTester {

    @Override
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        if (property.equals("IsTestRev")) {
            IFolder folder = SelectionUtil.getRevFolder(receiver);
            return folder != null;
        }
        if (property.equals("IsResource")) {
            return receiver instanceof IResource;
        }
        if (property.equals("IsMultiSelect")) {
            IFolder folder = SelectionUtil.getRevFolder(receiver);
            return folder != null;
        }
        if (property.equals("IsTestCompare")) {
            IFolder folder = SelectionUtil.getRevCompareFolder(receiver);
            return folder != null;
        }
        return false;
    }
    //
    // protected boolean isEnableProject(Object receiver) {
    // IResource resource = null;
    //
    // if (receiver instanceof EObject) {
    // EObject eObject = (EObject) receiver;
    // if (eObject.eResource() != null) {
    // resource = WorkspaceSynchronizer.getFile(eObject.eResource());
    // }
    // } else if (receiver instanceof IResource) {
    // resource = (IResource) receiver;
    // }
    //
    // if (resource != null) {
    // IProject project = resource.getProject();
    // if (project != null) {
    // // if (ZIPCProjectNature.hasNature(project)) {
    // if (ZIPCProjectNature.hasNature(project) && DesignProjectNature.hasNature(project)) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

}
