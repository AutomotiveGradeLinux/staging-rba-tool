package rba.tool.core.marker;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.util.TextRegionWithLineInformation;

import com.google.inject.Injector;

import rba.tool.editor.ui.activator.ExtensionEditorActivator;
import rba.tool.editor.util.RBAModelEditorNameUtil;

public class MarkerManager {
    public static MarkerManager INSTANCE = new MarkerManager();

    public static String MARKER_ID_MODEL_EX = "rba.tool.core.model.ex"; //$NON-NLS-1$

    public static String MARKER_ID_SORT_VALUE = "rba.tool.core.sort"; //$NON-NLS-1$

    public static String MARKER_ID_CONSTRAINT = "rba.tool.core.constraint"; //$NON-NLS-1$

    public void createMarker(EObject element, String message, int errorLevel, String id) {
        Resource resource = element.eResource();
        IFile file = WorkspaceSynchronizer.getFile(resource);

        if (existInBuildFolder(file.getParent())) {
            IFolder fol = file.getProject().getFolder(RBAModelEditorNameUtil.MODEL_FOLDER_NAME);
            String path = getPath(file.getParent(), "");
            if (!path.equals("")) {
                file = fol.getFile(path + "//" + file.getName());
            } else {
                file = fol.getFile(file.getName());
            }
        }
        if (file != null && file.exists()) {
            String location = file.getFullPath().toString();

            Injector injector = ExtensionEditorActivator.getInstance().getInjector("rba.tool.editor.RBAModel");
            ILocationInFileProvider locationInFileProvider = injector.getInstance(ILocationInFileProvider.class);

            TextRegionWithLineInformation fullTextRegion = (TextRegionWithLineInformation) locationInFileProvider.getFullTextRegion(element);
            int lineNumber = fullTextRegion.getLineNumber() + 1;

            Map<String, Object> attributes = new HashMap<String, Object>();
            attributes.put(IMarker.LINE_NUMBER, lineNumber);

            attributes.put(IMarker.SEVERITY, errorLevel);
            attributes.put(IMarker.MESSAGE, message);
            attributes.put(IMarker.LOCATION, location);

            try {
                IMarker marker = file.createMarker(id);
                marker.setAttributes(attributes);
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
    }

    public void clearMarkers(Resource resource, String id) {
        IFile ifile = WorkspaceSynchronizer.getFile(resource);
        if (ifile == null) {
            return;
        }
        if (existInBuildFolder(ifile.getParent())) {
            IFolder fol = ifile.getProject().getFolder(RBAModelEditorNameUtil.MODEL_FOLDER_NAME);
            String path = getPath(ifile.getParent(), "");
            if (!path.equals("")) {
                ifile = fol.getFile(path + "//" + ifile.getName());
            } else {
                ifile = fol.getFile(ifile.getName());
            }
        }
        if (ifile != null && ifile.exists()) {
        try {
            for (IMarker marker : ResourcesPlugin.getWorkspace().getRoot().findMarkers(id, true, IResource.DEPTH_INFINITE)) {
                if (ifile.equals(marker.getResource())) {
                    marker.delete();
                }
            }
        } catch (CoreException e) {
            throw new RuntimeException(e);
        }
        }
    }

    public void clearMarkers(IProject project, String id) {

        try {
            for (IMarker marker : ResourcesPlugin.getWorkspace().getRoot().findMarkers(id, true, IResource.DEPTH_INFINITE)) {

                IResource resource = marker.getResource();
                if (project == resource.getProject()) {
                    marker.delete();
                }
            }
        } catch (CoreException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean existInBuildFolder(IResource res) {
        if (res instanceof IFolder) {
            if (res.getName().equals(RBAModelEditorNameUtil.BUILD_FOLDER_NAME)) {
                return true;
            } else {
                return existInBuildFolder(res.getParent());
            }
        }
        return false;
    }

    private String getPath(IResource res, String path) {
        if (res instanceof IFolder) {
            if (res.getName().equals(RBAModelEditorNameUtil.BUILD_FOLDER_NAME)) {
                return path;
            } else {
                String p;
                if (!path.equals("")) {
                    p = res.getName() + "//" + path;
                } else {
                    p = res.getName();
                }
                return getPath(res.getParent(), p);
            }
        }
        return "";
    }
}
