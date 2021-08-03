package rba.tool.editor.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.wizard.IProjectCreator;

import com.google.inject.Inject;

public class RBAEmptyModelNewProjectWizardEx extends RBAModelNewProjectWizardEx {

    private static final String DEFAULT_TEMPLATE_PATH = "RBATool\\empty_project"; //$NON-NLS-1$
	
	@Inject
	public RBAEmptyModelNewProjectWizardEx(IProjectCreator projectCreator) {
		super(projectCreator);
	}
	
	@Override
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
