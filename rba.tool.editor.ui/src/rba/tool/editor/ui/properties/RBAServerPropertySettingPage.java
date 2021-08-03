package rba.tool.editor.ui.properties;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.dialogs.PropertyPage;
import rba.tool.editor.ui.messages.Messages;

public class RBAServerPropertySettingPage extends PropertyPage implements IWorkbenchPropertyPage {

    private Text txt_IPAddress;

    private Text txt_AppName;

    private Text txt_Port;

    private static QualifiedName ID_IP_ADDRESS = new QualifiedName("IpAddress", "IpAddress");

    private static QualifiedName ID_PORT = new QualifiedName("Port", "Port");

    private static QualifiedName ID_APP_NAME = new QualifiedName("AppName", "AppName");

    private static final String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    private static final String DEF_IP = "localhost";

    private static final String DEF_PORT = "65530";

    private Pattern pattern;

    private Matcher matcher;

    public RBAServerPropertySettingPage() {
        super();
    }

    protected Control createContents(Composite parent) {
        Composite mComposite = new Composite(parent, SWT.NULL);
        mComposite.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
        mComposite.setLayout(new GridLayout());
        Label mylabel = new Label(mComposite, SWT.NONE);
        mylabel.setLayoutData(new GridData());
        mylabel.setText(Messages.PAGE_INFORMATION);

        // Create a horizontal separator
        Label separator = new Label(mComposite, SWT.HORIZONTAL | SWT.SEPARATOR);
        separator.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        Composite sComposite = new Composite(mComposite, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.numColumns = 4;
        sComposite.setLayout(layout);
        sComposite.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));

        Label lbl_IPAddress = new Label(sComposite, SWT.NONE);
        lbl_IPAddress.setLayoutData(new GridData());
        lbl_IPAddress.setText(Messages.LBL_IPADDRESS);
        txt_IPAddress = new Text(sComposite, SWT.BORDER);
        txt_IPAddress.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        txt_IPAddress.setText(getIP());

        Label lbl_Port = new Label(sComposite, SWT.NONE);
        lbl_Port.setLayoutData(new GridData());
        lbl_Port.setText(Messages.LBL_PORT);
        txt_Port = new Text(sComposite, SWT.BORDER);
        txt_Port.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        txt_Port.setText(getPort());

        Label lbl_AppName = new Label(sComposite, SWT.NULL);
        lbl_AppName.setLayoutData(new GridData(GridData.FILL));
        lbl_AppName.setText(Messages.LBL_APPNAME);
        txt_AppName = new Text(sComposite, SWT.BORDER);
        txt_AppName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        txt_AppName.setText(getName());
        return mComposite;
    }

    protected String getIP() {
        IResource resource = Adapters.adapt(getElement(), IResource.class);
        try {
            String value = resource.getPersistentProperty(ID_IP_ADDRESS);
            if (value == null)
                // Set Default IP Address.
                return DEF_IP;
            return value;
        } catch (CoreException e) {
            return e.getMessage();
        }
    }

    protected void setIP(String ip) {
        IResource resource = Adapters.adapt(getElement(), IResource.class);
        String value = ip;
        if (value.equals(""))
            value = null;
        try {
            resource.setPersistentProperty(ID_IP_ADDRESS, value);
        } catch (CoreException e) {
        }
    }

    protected String getPort() {
        IResource resource = Adapters.adapt(getElement(), IResource.class);
        try {
            String value = resource.getPersistentProperty(ID_PORT);
            if (value == null)
                // Set Default Port Number.
                return DEF_PORT;
            return value;
        } catch (CoreException e) {
            return e.getMessage();
        }
    }

    protected void setPort(String port) {
        IResource resource = Adapters.adapt(getElement(), IResource.class);
        String value = port;
        if (value.equals(""))
            value = null;
        try {
            resource.setPersistentProperty(ID_PORT, value);
        } catch (CoreException e) {
        }
    }

    protected String getName() {
        IResource resource = Adapters.adapt(getElement(), IResource.class);
        try {
            String value = resource.getPersistentProperty(ID_APP_NAME);
            if (value == null)
                return "";
            return value;
        } catch (CoreException e) {
            return e.getMessage();
        }
    }

    protected void setName(String port) {
        IResource resource = Adapters.adapt(getElement(), IResource.class);
        String value = port;
        if (value.equals(""))
            value = null;
        try {
            resource.setPersistentProperty(ID_APP_NAME, value);
        } catch (CoreException e) {
        }
    }

    @Override
    public boolean performOk() {
        IResource resource = Adapters.adapt(getElement(), IResource.class);
        IProject project = resource.getProject();
        if (validate()) {
            setIP(txt_IPAddress.getText());
            setPort(txt_Port.getText());
            // Set Default Project Name if txt_AppName is blank.
            if (txt_AppName.getText().toString().equals("")) {
                txt_AppName.setText(project.getName());
            }
            setName(txt_AppName.getText());
            return super.performOk();
        }
        return false;
    }

    @Override
    protected void performDefaults() {
        super.performDefaults();
        txt_IPAddress.setText(DEF_IP);
        txt_Port.setText(DEF_PORT);
        txt_AppName.setText("");
    }

    // Check IP Address
    public boolean validateIpAddress(final String ip) {
        pattern = Pattern.compile(IPADDRESS_PATTERN);
        matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    // Validation
    protected boolean validate() {
        if (StringUtils.isEmpty(txt_IPAddress.getText().toString())) {
            setErrorMessage(Messages.ERR_EMPTY_IP);
            return false;
        }
        if (!DEF_IP.equals(txt_IPAddress.getText().toString()) && !validateIpAddress(txt_IPAddress.getText())) {
            setErrorMessage(Messages.IP_FORMAT_ERR);
            return false;
        }
        if (StringUtils.isEmpty(txt_Port.getText().toString())) {
            setErrorMessage(Messages.ERR_EMPTY_PORT);
            return false;
        }
        if (!StringUtils.isNumeric(txt_Port.getText().toString())) {
            setErrorMessage(Messages.PORT_NUMERIC_ERR);
            return false;
        } else {
            setErrorMessage(null);
            return true;
        }
    }

}
