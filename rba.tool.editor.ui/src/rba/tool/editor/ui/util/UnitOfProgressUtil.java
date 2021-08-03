package rba.tool.editor.ui.util;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import rba.tool.editor.ui.editor.model.manager.ResourceManagerUI;
import rba.tool.editor.ui.util.concurrent.IUnitOfProgress;

public class UnitOfProgressUtil {

    public static void doProjectSwitchProgress(final IProject project, final boolean showConfirmDialog) throws Exception {
        IUnitOfProgress.Void<IProject> progress = new IUnitOfProgress.Void<IProject>() {
            @Override
            public void process(IProject state) throws Exception {
                Job projectSwitchJob = new Job("[RBA Tool]- Switch Project") {
                    @Override
                    protected IStatus run(IProgressMonitor monitor) {
                        monitor.beginTask("Switch Project...", 1); //$NON-NLS-1$
                        try {
                            ResourceManagerUI.INSTANCE.switchToProject(state, monitor);
                        } catch (Exception e) {
                            e.printStackTrace();
                            return Status.CANCEL_STATUS;
                        } finally {
                            monitor.done();
                        }
                        return Status.OK_STATUS;
                    }

                    @Override
                    public boolean belongsTo(Object family) {
                        return IUnitOfProgress.FAMILY_UNIT_OF_PROGRESS == family;
                    }
                };
                projectSwitchJob.schedule();
            }
        };

        if (ResourceManagerUI.INSTANCE.doConfirm(project, showConfirmDialog)) {
            progress.exec(project);
        }
    }

    public static void doProjectSwitchProgressWithRunnable(final IProject project, final boolean showConfirmDialog, final Runnable run) throws Exception {
        IUnitOfProgress.Void<IProject> progress = new IUnitOfProgress.Void<IProject>() {
            @Override
            public void process(IProject state) throws Exception {
                Job projectSwitchJob = new Job("[RBA Tool]- Switch Project") {
                    @Override
                    protected IStatus run(IProgressMonitor monitor) {
                        monitor.beginTask("Switch Project...", 1); //$NON-NLS-1$
                        try {
                            ResourceManagerUI.INSTANCE.switchToProject(state, monitor);
                            if (monitor.isCanceled()) {
                                throw new InterruptedException();
                            }
                            run.run();
                        } catch (Exception e) {
                            e.printStackTrace();
                            return Status.CANCEL_STATUS;
                        } finally {
                            monitor.done();
                        }
                        return Status.OK_STATUS;
                    }

                    @Override
                    public boolean belongsTo(Object family) {
                        return IUnitOfProgress.FAMILY_UNIT_OF_PROGRESS == family;
                    }
                };
                projectSwitchJob.schedule();
            }
        };

        if (ResourceManagerUI.INSTANCE.doConfirm(project, showConfirmDialog)) {
            progress.exec(project);
        }
    }

}
