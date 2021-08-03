package rba.tool.editor.ui.editor.templates

import java.util.Iterator
import java.util.LinkedHashMap
import java.util.Map
import org.eclipse.jface.text.templates.Template

class TemplateRegistry {

	private final Map<String, Template> fTemplates = new LinkedHashMap<String, Template>();

	def public void addTemplate(Template template) {
		fTemplates.put(template.contextTypeId, template);
	}

	def public Template getTemplate(String id) {
		return fTemplates.get(id);
	}

	def public Iterator<Template> templates() {
		return fTemplates.values().iterator();
	}
}
