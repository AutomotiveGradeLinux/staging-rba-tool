package rba.tool.core.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

public class SelectionUtil {

    public static final String TEST_FILE_NAME = "testinformation";

    public static final String TEST_CASE_FOLDER_NAME = "testcase";

    public static final String TEST_COVERAGE_FOLDER_NAME = "coverage";

    public static final String TEST_LOG_FOLDER_NAME = "testlog";

    public static final String TEST_RESULT_FOLDER_NAME = "testresult";

    /**
     * get testresult folder in revision folder from selected item
     * @param file
     * @return testcase folder
     */
    public static IFolder getRevResultFolder(Object object) {
        return getAndCreateFolderInTestRevFolder(object, TEST_RESULT_FOLDER_NAME);
    }

    /**
     * get testlog folder in revision folder from selected item
     * @param file
     * @return testcase folder
     */
    public static IFolder getRevLogFolder(Object object) {
        return getAndCreateFolderInTestRevFolder(object, TEST_LOG_FOLDER_NAME);
    }

    /**
     * get coverage folder in revision folder from selected item
     * @param file
     * @return testcase folder
     */
    public static IFolder getRevCoverageFolder(Object object) {
        return getAndCreateFolderInTestRevFolder(object, TEST_COVERAGE_FOLDER_NAME);
    }

    /**
     * get testcase folder in revision folder from selected item
     * @param file
     * @return testcase folder
     */
    public static IFolder getRevTestcaseFolder(Object object) {
        return getAndCreateFolderInTestRevFolder(object, TEST_CASE_FOLDER_NAME);
    }

    public static IFolder getAndCreateFolderInTestRevFolder(Object object, String foldername) {
        IFolder folder = getRevFolder(object);
        if (folder != null) {
            IFolder testcase = folder.getFolder(foldername);
            if (!testcase.exists()) {
                try {
                    testcase.create(true, true, null);
                } catch (CoreException e) {
                    throw new RuntimeException(e);
                }
            }
            return testcase;
        }
        return null;
    }

    /**
     * get revision folder of selected file
     * @param file
     * @return
     */
    public static IFolder getRevFolder(Object object) {
        try {
            if (object instanceof ISelection) {
                ISelection selection = (ISelection) object;
                if (selection instanceof IStructuredSelection) {
                    IStructuredSelection structuredSelection = (IStructuredSelection) selection;
                    Object element = structuredSelection.getFirstElement();
                    if (element instanceof IResource) {
                        return getRevFolder((IResource) element);
                    }
                }
            } else if (object instanceof IResource) {
                if (object instanceof IFolder) {
                    IFolder f = (IFolder) object;
                    IResource[] resources = f.members();
                    for (IResource res : resources) {
                        if (res instanceof IFile) {
                            IFile file = (IFile) res;
                            if (file.getName().equals(TEST_FILE_NAME)) {
                                return f;
                            }
                        }
                    }
                } else if (object instanceof IFile) {
                    IFolder parent = (IFolder) ((IFile) object).getParent();
                    return getRevFolder(parent);
                }
                IResource r = (IResource) object;
                return getRevFolder(r.getParent());

                //
                // IFolder f = null;
                // if (object instanceof IFile) {
                // IContainer parent = ((IFile) object).getParent();
                // if (parent instanceof IFolder) {
                // f = (IFolder) parent;
                // }
                // } else
                //
                // if (f.getParent() instanceof IFolder) {
                // return getRevFolder((IFolder) f.getParent());
                // }
            }
        } catch (CoreException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * to get only 2 selected revision file
     * @param object
     * @return
     */
    public static IFolder getRevCompareFolder(Object object) {
        try {
            if (object instanceof ISelection) {
                ISelection selection = (ISelection) object;
                if (selection instanceof IStructuredSelection) {
                    IStructuredSelection structuredSelection = (IStructuredSelection) selection;
                    if (structuredSelection.size() == 2) {
                        Object element = structuredSelection.getFirstElement();
                        if (element instanceof IResource) {
                            return getRevCompareFolder((IResource) element);
                        }
                    }
                }
            } else if (object instanceof IResource) {
                if (object instanceof IFolder) {
                    IFolder f = (IFolder) object;
                    IResource[] resources = f.members();
                    for (IResource res : resources) {
                        if (res instanceof IFile) {
                            IFile file = (IFile) res;
                            if (file.getName().equals(TEST_FILE_NAME)) {
                                return f;
                            }
                        }
                    }
                }

            }
        } catch (CoreException e) {
            e.printStackTrace();
        }
        return null;
    }
}
