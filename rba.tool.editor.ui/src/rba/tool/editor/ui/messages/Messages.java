package rba.tool.editor.ui.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    public static final String BUNDLE_NAME = "rba.tool.editor.ui.messages.messages";

    public static String PAGE_INFORMATION;

    public static String LBL_IPADDRESS;

    public static String LBL_PORT;

    public static String LBL_APPNAME;

    public static String ERR_EMPTY_IP;

    public static String ERR_EMPTY_PORT;

    public static String PORT_NUMERIC_ERR;

    public static String IP_FORMAT_ERR;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

}
