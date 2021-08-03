package rba.tool.editor.ui.coverage;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class TCLogFormatPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    private IPreferenceStore preferenceStore;

    private RadioGroupFieldEditor tclogFileFormat;

    private static final String DESCRIPTION = "tclog File Format";

    private static final String TEXT_FORMAT = "text";

    private static final String ZIP_FORMAT = "zip";

    private String selectedFormat = TEXT_FORMAT;

    private TCLogFormatSettingManager manager = TCLogFormatSettingManager.INSTANCE;

    public TCLogFormatPreferencePage() {
        super(GRID);
    }

    @Override
    public void init(IWorkbench workbench) {
        if (!getPreferenceStore().getString("FileFormat").isEmpty()) {
            selectedFormat = getPreferenceStore().getString("FileFormat");
        }
    }

    @Override
    protected void createFieldEditors() {

        String[][] btnArr = new String[][] { { "&Text", TEXT_FORMAT }, { "&Zip", ZIP_FORMAT } };
        tclogFileFormat = new RadioGroupFieldEditor("FileFormat", DESCRIPTION, 2, btnArr, getFieldEditorParent(), true);

        Composite composite = tclogFileFormat.getRadioBoxControl(getFieldEditorParent());
        Control[] controls = composite.getChildren();

        for (Control control : controls) {
            control.addListener(SWT.Selection, new Listener() {

                @Override
                public void handleEvent(Event event) {

                    Button btn = (Button) event.widget;
                    selectedFormat = (String) btn.getData();
                }
            });
        }

        addField(tclogFileFormat);
    }

    @Override
    public boolean performOk() {

        manager.saveTCLogFileFormat(selectedFormat);
        return super.performOk();
    }

    @Override
    public IPreferenceStore getPreferenceStore() {
        if (preferenceStore == null) {
            preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, manager.ID_PREFERENCE_NODE);
        }
        return preferenceStore;
    }

}
