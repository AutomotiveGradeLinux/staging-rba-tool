package rba.tool.editor.ui.recordandplay;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class RBASimulationRecordPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
    
    private DirectoryFieldEditor recordPathBrowser;

    private IPreferenceStore preferenceStore;

    private RBASimulationRecordSettingManager manager = RBASimulationRecordSettingManager.INSTANCE;

    private static final String DESCRIPTION = "RBA Simulation Record Path"; //$NON-NLS-1$

    public RBASimulationRecordPage() {
        super(GRID);
    }

    @Override
    protected void createFieldEditors() {
        recordPathBrowser = new DirectoryFieldEditor("RbaToolRecordPath", "", getFieldEditorParent());
        addField(recordPathBrowser);
    }

    @Override
    public boolean performOk() {
        manager.saveRecordFilePath(recordPathBrowser.getStringValue());
        return super.performOk();
    }

    @Override
    public void init(IWorkbench workbench) {
        setDescription(DESCRIPTION);
    }

    @Override
    public IPreferenceStore getPreferenceStore() {
        if (preferenceStore == null) {
            preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, manager.ID_PREFERENCE_NODE);
        }
        return preferenceStore;
    }

}
