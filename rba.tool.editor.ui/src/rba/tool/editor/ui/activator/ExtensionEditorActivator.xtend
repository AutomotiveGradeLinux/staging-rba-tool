package rba.tool.editor.ui.activator

import com.google.inject.Guice
import com.google.inject.Module
import org.apache.log4j.Logger
import org.eclipse.xtext.util.Modules2
import rba.tool.editor.ui.internal.EditorActivator
import rba.tool.editor.util.ExtensionModuleManager

class ExtensionEditorActivator extends EditorActivator {

	private static final Logger logger = Logger.getLogger(ExtensionEditorActivator);

	override createInjector(String language) {
		try {
			val runtimeModule = getRuntimeModule(language);
			val sharedStateModule = getSharedStateModule();
			val uiModule = getUiModule(language);
			val extensionModule = getExtensionModule();
			val mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule, extensionModule);
			return Guice.createInjector(mergedModule);
		} catch(Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}

	def public static ExtensionEditorActivator getInstance() {
		return EditorActivator.getInstance() as ExtensionEditorActivator;
	}

	def public injectMembers(Object object) {
		getInjector(EditorActivator.RBA_TOOL_EDITOR_RBAMODEL).injectMembers(object);
	}

	def protected Module getExtensionModule() {
		val modules = ExtensionModuleManager.INSTANCE.getExtensionModules();
		return Modules2.mixin(modules);
	}
}
