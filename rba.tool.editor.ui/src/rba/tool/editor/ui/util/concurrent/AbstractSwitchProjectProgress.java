package rba.tool.editor.ui.util.concurrent;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

import rba.tool.editor.ui.editor.model.manager.ResourceManagerUI;

public abstract class AbstractSwitchProjectProgress<R, P> implements IUnitOfProgress<Object, IProject> {

    private final boolean showConfirmDialog;

    public AbstractSwitchProjectProgress() {
        this(true);
    }

    public AbstractSwitchProjectProgress(boolean showConfirmDialog) {
        this.showConfirmDialog = showConfirmDialog;
    }

    @Override
    public R exec(IProject state) throws Exception {
        SubMonitor progress = SubMonitor.convert(null, 6);
        if (!ResourceManagerUI.INSTANCE.isCurrentProject(state)) {
            if (ResourceManagerUI.INSTANCE.doConfirm(state, showConfirmDialog)) {
                ResourceManagerUI.INSTANCE.switchToProject(state, progress.newChild(2));

                if (progress.isCanceled()) {
                    throw new InterruptedException();
                }
                return internalExec(state, progress.newChild(4));
            } else {
                throw new InterruptedException();
            }
        }
        return internalExec(state, progress.newChild(4));
    }

    protected abstract R internalExec(IProject state, IProgressMonitor monitor);
}
