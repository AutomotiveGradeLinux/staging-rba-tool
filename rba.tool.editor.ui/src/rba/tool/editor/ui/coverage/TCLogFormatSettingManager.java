package rba.tool.editor.ui.coverage;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class TCLogFormatSettingManager {

    public static final TCLogFormatSettingManager INSTANCE = new TCLogFormatSettingManager();

    public static final String ID_PREFERENCE_NODE = "rba.model.tool"; //$NON-NLS-1$

    private static final String ID_PREFERENCES = "rba.model.tool.coverage.tclogFormat"; //$NON-NLS-1$

    private static final String ID_TCLOG_FORMAT = "TCLogFormat"; //$NON-NLS-1$

    public void saveTCLogFileFormat(final String format) {
        final String oldFormat = TCLogFormatSettingManager.INSTANCE.getTCLogFileFormat();
        if (!oldFormat.equals(format)) {
            IEclipsePreferences preferences = getPreferences();
            Preferences sub = preferences.node(ID_PREFERENCES);
            sub.put(ID_TCLOG_FORMAT, format);
            try {
                // forces the application to save the preferences
                preferences.flush();
            } catch (BackingStoreException e) {
                e.printStackTrace();
            }
        }
    }

    public String getTCLogFileFormat() {
        IEclipsePreferences preferences = getPreferences();
        Preferences sub = preferences.node(ID_PREFERENCES);
        return sub.get(ID_TCLOG_FORMAT, "text");
    }

    private IEclipsePreferences getPreferences() {
        return InstanceScope.INSTANCE.getNode(ID_PREFERENCE_NODE);
    }
}
