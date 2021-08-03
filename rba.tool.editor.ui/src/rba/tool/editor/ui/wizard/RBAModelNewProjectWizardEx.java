package rba.tool.editor.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.internal.events.BuildCommand;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.ui.wizard.IProjectCreator;

import com.google.inject.Inject;

public class RBAModelNewProjectWizardEx extends RBAModelNewProjectWizard {

    private static final String DEFAULT_TEMPLATE_PATH = "RBATool\\Project"; //$NON-NLS-1$

    @Inject
    public RBAModelNewProjectWizardEx(IProjectCreator projectCreator) {
        super(projectCreator);
    }

    @Override
    public boolean performFinish() {

        boolean performFinish = super.performFinish();

        String projectName = getMainPage().getProjectName();
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

        try {
            setProjectSettings(project, projectName);
            copyResources(project);

            String pathStr = project.getName() + "/model";
            IFolder ifolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(pathStr));

            if (ifolder.exists()) {
                IResource[] members = ifolder.members();
                if (members.length > 0 && members[0] instanceof IFile) {
                    IFile ifile = (IFile) members[0];
                    IWorkbench workbench = PlatformUI.getWorkbench();
                    IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
                    try {
                        IDE.openEditor(window.getActivePage(), ifile);
                    } catch (PartInitException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (CoreException e) {
            e.printStackTrace();
        }

        return performFinish;
    }

    @SuppressWarnings("restriction")
    private void setProjectSettings(IProject project, String projectName) throws CoreException {

        IProjectDescription description = ResourcesPlugin.getWorkspace().getRoot().getWorkspace().newProjectDescription(projectName);
        BuildCommand rbacommand = new BuildCommand();
        rbacommand.setBuilderName("rba.tool.RBAToolBuilder"); //$NON-NLS-1$
        BuildCommand xcommand = new BuildCommand();
        xcommand.setBuilderName("org.eclipse.xtext.ui.shared.xtextBuilder"); //$NON-NLS-1$
        ICommand[] commands = new BuildCommand[] { rbacommand, xcommand };
        description.setBuildSpec(commands);

        String[] natures = new String[] { "org.eclipse.xtext.ui.shared.xtextNature" }; //$NON-NLS-1$ //$NON-NLS-2$
        description.setNatureIds(natures);

        project.setDescription(description, new NullProgressMonitor());
    }

    protected void copyResources(IProject project) throws IOException, URISyntaxException, CoreException {
        URL installLocationUrl = Platform.getInstallLocation().getURL();
        String installLocationPath = new File(installLocationUrl.getPath()).toString();

        java.nio.file.Path runtimePath = Paths.get(installLocationPath, DEFAULT_TEMPLATE_PATH);

        URI locationURI = project.getLocationURI();

        File srcRuntime = new File(runtimePath.toString());
        File dst = new File(locationURI.getPath());

        if (srcRuntime.exists()) {
            FileUtils.copyDirectory(srcRuntime, dst);
        }

        project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
    }
}
