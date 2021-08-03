package rba.tool.editor.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import com.google.inject.Module;

public class ExtensionModuleManager {
    public static final ExtensionModuleManager INSTANCE = new ExtensionModuleManager();

    private static final String EXTENSION_POINT = "rba.tool.editor.rbaToolEditorExtensionModule"; //$NON-NLS-1$

    private static final String EXTENSION_POINT_ELEMENT = "extensionModule"; //$NON-NLS-1$

    private static final String EXTENSION_POINT_ELEMENT_ATTRIBUTE = "class"; //$NON-NLS-1$

    private List<Module> constraintProviders;

    private ExtensionModuleManager() {
    }

    public List<Module> getExtensionModules() {
        if (constraintProviders == null) {
            constraintProviders = new ArrayList<Module>();
            init();
        }
        return constraintProviders;
    }

    private void init() {
        IExtensionRegistry registry = Platform.getExtensionRegistry();
        IExtensionPoint extensionPoint = registry.getExtensionPoint(EXTENSION_POINT); // $NON-NLS-1$
        IExtension[] extensions = extensionPoint.getExtensions();

        List<Module> providerList = new ArrayList<Module>();
        for (int i = 0; i < extensions.length; i++) {
            IConfigurationElement[] elements = extensions[i].getConfigurationElements();
            for (int j = 0; j < elements.length; j++) {
                IConfigurationElement element = elements[j];
                String elementName = element.getName();
                if (elementName.equalsIgnoreCase(EXTENSION_POINT_ELEMENT)) { // $NON-NLS-1$
                    try {
                        Object provider = element.createExecutableExtension(EXTENSION_POINT_ELEMENT_ATTRIBUTE); // $NON-NLS-1$
                        if (provider instanceof Module) {
                            Module factory = (Module) provider;
                            providerList.add(factory);
                        }
                    } catch (CoreException e) {
                        // do nothing
                    }
                }
            }
        }
        constraintProviders.addAll(providerList);
    }
}
