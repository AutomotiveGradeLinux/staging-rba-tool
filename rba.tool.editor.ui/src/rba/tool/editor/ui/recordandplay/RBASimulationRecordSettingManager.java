package rba.tool.editor.ui.recordandplay;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.Preferences;


public class RBASimulationRecordSettingManager {

    public static final RBASimulationRecordSettingManager INSTANCE = new RBASimulationRecordSettingManager();

    public static final String ID_PREFERENCE_NODE = "rba.model.tool"; //$NON-NLS-1$

    private static final String ID_PREFERENCES = "rba.model.tool.recordAndPlay"; //$NON-NLS-1$

    private static final String ID_RECORD_PATH = "RecordFilePath"; //$NON-NLS-1$
    
    /**
     * Save record file path
     * @param path
     */
    public void saveRecordFilePath(final String path) {
        final String oldPath = RBASimulationRecordSettingManager.INSTANCE.getRecordFilePath();
        if (!equals(oldPath, path)) {
            IEclipsePreferences preferences = getPreferences();
            Preferences sub = preferences.node(ID_PREFERENCES);
            sub.put(ID_RECORD_PATH, path);
        }
    }

    /**
     * Get record file path
     * @return path
     */
    public String getRecordFilePath() {
        IEclipsePreferences preferences = getPreferences();
        Preferences sub = preferences.node(ID_PREFERENCES);
        return sub.get(ID_RECORD_PATH, "");
    }

    private IEclipsePreferences getPreferences() {
        return InstanceScope.INSTANCE.getNode(ID_PREFERENCE_NODE);
    }

    /**
     * String equality check
     * @param cs1
     * @param cs2
     * @return
     */
    private boolean equals(String cs1, String cs2) {

        boolean result = false;

        if (cs1 == cs2) {
            result = true;
        }
        if (cs1 == null || cs2 == null) {
            result = false;
        }
        if (cs1.length() != cs2.length()) {
            result = false;
        }
        if (cs1 instanceof String && cs2 instanceof String) {
            result = cs1.equals(cs2);
        }

        return result;
    }

}
