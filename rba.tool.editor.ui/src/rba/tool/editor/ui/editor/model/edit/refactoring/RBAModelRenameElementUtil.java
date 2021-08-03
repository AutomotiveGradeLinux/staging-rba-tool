package rba.tool.editor.ui.editor.model.edit.refactoring;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.ide.refactoring.IRenameStrategy2;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.IGlobalServiceProvider;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.ui.refactoring.IRenameStrategy;
import org.eclipse.xtext.ui.refactoring.IRenameStrategy.Provider.NoSuchStrategyException;
import org.eclipse.xtext.ui.refactoring.ui.IRenameContextFactory;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.eclipse.xtext.ui.refactoring.ui.RefactoringPreferences;
import org.eclipse.xtext.ui.refactoring.ui.RefactoringType;
import org.eclipse.xtext.ui.refactoring2.rename.ISimpleNameProvider;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;

import rba.tool.editor.ui.activator.ExtensionEditorActivator;

public class RBAModelRenameElementUtil {

    public static RBAModelRenameElementUtil INSTANCE = new RBAModelRenameElementUtil();

    @Inject
    private EObjectAtOffsetHelper eObjectAtOffsetHelper;

    @Inject
    private ILocationInFileProvider locationInFileProvider;

    @Inject
    protected RBAModelRenameRefactoringController renameRefactoringController;

    @Inject
    protected IGlobalServiceProvider globalServiceProvider;

    @Inject
    protected RefactoringPreferences preferences;

    @Inject
    protected IRenameContextFactory renameContextFactory;

    @Inject
    protected RBAModelSyncUtil syncUtil;

    private RBAModelRenameElementUtil() {
        ExtensionEditorActivator.getInstance().injectMembers(this);
    }

    public void execute(String value) {
        try {
            final XtextEditor editor = EditorUtils.getActiveXtextEditor();
            if (editor != null) {
                syncUtil.totalSync(preferences.isSaveAllBeforeRefactoring(), renameRefactoringController.getActiveLinkedMode() == null);
                final ITextSelection selection = (ITextSelection) editor.getSelectionProvider().getSelection();
                IRenameElementContext renameElementContext = editor.getDocument().priorityReadOnly(new IUnitOfWork<IRenameElementContext, XtextResource>() {
                    @Override
                    public IRenameElementContext exec(XtextResource resource) throws Exception {
                        EObject selectedElement = eObjectAtOffsetHelper.resolveElementAt(resource, selection.getOffset());
                        if (selectedElement != null) {
                            IRenameElementContext renameElementContext = renameContextFactory.createRenameElementContext(selectedElement, editor, selection, resource);
                            if (isRefactoringEnabled(renameElementContext, resource))
                                return renameElementContext;
                        }
                        return null;
                    }
                });
                if (renameElementContext != null) {
                    startRenameElement(renameElementContext, value);
                }
            }
        } catch (OperationCanceledException e) {
            MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error initializing refactoring 1", "\nSee log for details");
            // cancelled by user, ok
            return;
        } catch (InterruptedException e) {
            MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error initializing refactoring 2", "\nSee log for details");
            // cancelled by user, ok
            return;
        } catch (Exception exc) {
            exc.printStackTrace();
            MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error initializing refactoring", exc.getMessage() + "\nSee log for details");
        }
    }

    public IRenameElementContext createRenameElementContext(EObject targetElement, final XtextEditor triggeringEditor, final ITextSelection selection,
            XtextResource triggeringResource) {
        return renameContextFactory.createRenameElementContext(targetElement, triggeringEditor, selection, triggeringResource);
    }

    protected boolean isRefactoringEnabled(IRenameElementContext renameElementContext, XtextResource resource) {
        ResourceSet resourceSet = resource.getResourceSet();
        if (renameElementContext != null && resourceSet != null) {
            EObject targetElement = resourceSet.getEObject(renameElementContext.getTargetElementURI(), true);
            if (targetElement != null && !targetElement.eIsProxy()) {
                if (targetElement.eResource() == resource && renameElementContext.getTriggeringEditorSelection() instanceof ITextSelection) {
                    ITextSelection textSelection = (ITextSelection) renameElementContext.getTriggeringEditorSelection();
                    ITextRegion selectedRegion = new TextRegion(textSelection.getOffset(), textSelection.getLength());
                    INode crossReferenceNode = eObjectAtOffsetHelper.getCrossReferenceNode(resource, selectedRegion);
                    if (crossReferenceNode == null) {
                        // selection is on the declaration. make sure it's the name
                        ITextRegion significantRegion = locationInFileProvider.getSignificantTextRegion(targetElement);
                        if (!significantRegion.contains(selectedRegion))
                            return false;
                    }
                }
                IRenameStrategy.Provider renameStrategyProvider = globalServiceProvider.findService(targetElement, IRenameStrategy.Provider.class);
                try {
                    if (renameStrategyProvider.get(targetElement, renameElementContext) != null) {
                        return true;
                    } else {
                        IRenameStrategy2 strategy2 = globalServiceProvider.findService(targetElement, IRenameStrategy2.class);
                        ISimpleNameProvider simpleNameProvider = globalServiceProvider.findService(targetElement, ISimpleNameProvider.class);
                        return strategy2 != null && simpleNameProvider.canRename(targetElement);
                    }

                } catch (NoSuchStrategyException e) {
                    MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Cannot rename element", e.getMessage());
                }
            }
        }
        return false;
    }

    protected void startRenameElement(IRenameElementContext renameElementContext, String value) throws InterruptedException {
        // renameRefactoringController.startRefactoring(renameElementContext);
        // renameRefactoringController.startRefactoring(RefactoringType.REFACTORING_DIALOG);
        renameRefactoringController.initialize(renameElementContext);
        renameRefactoringController.setNewNameText(value);
        renameRefactoringController.startRefactoring(RefactoringType.REFACTORING_DIALOG);
    }
}
