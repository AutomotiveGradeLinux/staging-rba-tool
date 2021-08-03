package rba.tool.editor.ui.editor.templates

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.List
import java.util.Map
import org.apache.commons.lang.StringUtils
import org.eclipse.jface.text.templates.Template
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.IGrammarAccess
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper
import rba.tool.editor.ui.util.CharacterUtil

@Singleton
class RBAModelTemplateRegistry extends TemplateRegistry {

	private final Map<String, String> PATTERNS = newLinkedHashMap(
		"rba.tool.editor.RBAModel.kw_runtime:" -> "${true}",
		"rba.tool.editor.RBAModel.kw_global:" -> "${false}",
		"rba.tool.editor.RBAModel.kw_description:" -> "\"${}\"",
		"rba.tool.editor.RBAModel.kw_width:" -> "${0}",
		"rba.tool.editor.RBAModel.kw_height:" -> "${0}",
		"rba.tool.editor.RBAModel.kw_x:" -> "${0}",
		"rba.tool.editor.RBAModel.kw_y:" -> "${0}",
		"rba.tool.editor.RBAModel.kw_attenuateValue:" -> "${0}",
		"rba.tool.editor.RBAModel.kw_loserType:" -> "${NEVER_GIVEUP}",
		"rba.tool.editor.RBAModel.kw_arbitrationPolicy:" -> "${DEFAULT}",
		"rba.tool.editor.RBAModel.kw_basePoint:" -> "${LEFT_TOP}",
		"rba.tool.editor.RBAModel.kw_type:" -> "${DEFAULT}",
		"rba.tool.editor.RBAModel.kw_allocatable:" -> "[${cursor}]",
		"rba.tool.editor.RBAModel.kw_subarea:" -> "[${cursor}]",
		"rba.tool.editor.RBAModel.kw_sizeReference:" -> "${size_id}",
		"rba.tool.editor.RBAModel.kw_layout:" -> "",
		"rba.tool.editor.RBAModel.kw_visibility:" -> "${STANDARD_VALUE}",
		"rba.tool.editor.RBAModel.kw_priority:" -> "${STANDARD_VALUE}",
		"rba.tool.editor.RBAModel.kw_value:" -> "${STANDARD_VALUE}",
		"rba.tool.editor.RBAModel.kw_zorder:" -> "${STANDARD_VALUE}",
		"rba.tool.editor.RBAModel.kw_contentStateRef:" -> "${contentState_id}",
		"rba.tool.editor.RBAModel.kw_areaReference:" -> "${area_id}",
		"rba.tool.editor.RBAModel.kw_condition:" -> "",
		"rba.tool.editor.RBAModel.kw_area:" -> "${area_id}",
		"rba.tool.editor.RBAModel.kw_content:" -> "${content_id}"
	) ;

	private final ContextTypeIdHelper helper;

	@Inject
	public new(IGrammarAccess grammarAccess, ContextTypeIdHelper helper) {
		this.helper = helper;
		registerTemplates(grammarAccess);
	}

	def protected void registerTemplates(IGrammarAccess grammarAccess) {
		val List<Template> allTemplates = Lists.newArrayList();
		for (parserRule : GrammarUtil.allParserRules(grammarAccess.getGrammar())) {
			var Template template;
			for (keyword : EcoreUtil2.getAllContentsOfType(parserRule, Keyword)) {
				if (CharacterUtil.isKeywordWorthyToPropose(keyword)) {
					val name = keyword.value;
					if (!StringUtils.isEmpty(name)) {
						if (StringUtils.endsWith(name, ":")) {
							template = new Template(name, "", getId(keyword), getPattern(keyword), true);
						} else {
							template = new Template(name, "", getId(keyword), name, true);
						}
						allTemplates.add(template);
					}
				}
			}
		}
		for (enumRule : GrammarUtil.allEnumRules(grammarAccess.getGrammar())) {
			var Template template;
			for (keyword : EcoreUtil2.getAllContentsOfType(enumRule, Keyword)) {
				if (CharacterUtil.isKeywordWorthyToPropose(keyword)) {
					val name = keyword.value;
					if (!StringUtils.isEmpty(name)) {
						template = new Template(name, "", getId(keyword), name, true);
						allTemplates.add(template);
					}
				}
			}
		}

		for (template : allTemplates) {
			addTemplate(template);
		}
	}

	def public String getId(Keyword k) {
		return helper.getId(k);
	}

	def private String getPattern(Keyword k) {
		return StringUtils.join(#[k.value, " ", PATTERNS.get(getId(k)) ?: ""]);
	}
}
