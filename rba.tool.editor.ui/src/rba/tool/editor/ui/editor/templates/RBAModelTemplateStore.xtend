package rba.tool.editor.ui.editor.templates

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.ArrayList
import java.util.List
import org.eclipse.jface.preference.IPreferenceStore
import org.eclipse.jface.text.templates.ContextTypeRegistry
import org.eclipse.jface.text.templates.Template
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.xtext.ui.editor.templates.XtextTemplateStore

@Singleton
class RBAModelTemplateStore extends XtextTemplateStore {

	private TemplateRegistry templateRegistry;

	@Inject
	new(TemplateRegistry templateRegistry, ContextTypeRegistry registry, IPreferenceStore store, String key, AbstractUIPlugin plugin) {
		super(registry, store, key, plugin);
		this.templateRegistry = templateRegistry;
	}

	override getTemplates(String contextTypeId) {
		val List<Template> templates = new ArrayList<Template>(super.getTemplates(contextTypeId));
		val template = templateRegistry.getTemplate(contextTypeId);
		if (template !== null) templates.add(template);
		return templates.toArray(newArrayOfSize(templates.size()));
	}
}
