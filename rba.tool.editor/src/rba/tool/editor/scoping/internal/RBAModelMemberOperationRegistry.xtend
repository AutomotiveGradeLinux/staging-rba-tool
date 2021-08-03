package rba.tool.editor.scoping.internal

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.Collections
import java.util.Map
import java.util.Set
import java.util.regex.Matcher
import java.util.regex.Pattern
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.IGrammarAccess
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.generator.parser.antlr.FirstSetComputer
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import rba.core.ExpressionType
import rba.core.Operator
import rba.core.RuleObject
import rba.tool.editor.resource.RBAModelEObjectDescription
import rba.tool.editor.scoping.IExpressionScope

@Singleton
class RBAModelMemberOperationRegistry {

	private static Map<String, String> EMPTY_USERDATA = Collections.<String, String>emptyMap();
	private static Pattern pattern = Pattern.compile("^ConfigurationParserRule_([A-Za-z]+)OperatorFor([A-Za-z]+)$");
	private static String DESCRIPTION_KEY = "%s_%s";
	private static String QUALIFIED_NAME = "%s()";

	private final Map<String, Set<IEObjectDescription>> operations = newLinkedHashMap();

	@Inject
	public new(IGrammarAccess grammarAccess) {
		registerOperations(grammarAccess);
	}

	def protected void registerOperations(IGrammarAccess grammarAccess) {
		val multipleOperandParserRule = GrammarUtil.findRuleForName(grammarAccess.getGrammar(), "ConfigurationParserRule_OperatorWithMultipleOperand");
		val multipleOperandConfiguration = FirstSetComputer.getFirstSet(multipleOperandParserRule.alternatives).filter(Keyword).toList;
		val allConfigurations = GrammarUtil.allRules(grammarAccess.getGrammar()).filter(r|pattern.matcher(r.name).find);
		for (configuration : allConfigurations) {
			val Matcher matcher = pattern.matcher(configuration.name);
			if (matcher.find) {
				val descriptionKey = String.format(DESCRIPTION_KEY, matcher.group(1), matcher.group(2)).toUpperCase;
				val descriptionEntries = newHashSet();
				val keywords = FirstSetComputer.getFirstSet(configuration.alternatives).filter(Keyword);
				for (keyword : keywords) {
					descriptionEntries.add(
						new RBAModelEObjectDescription(QualifiedName.create(String.format(QUALIFIED_NAME, keyword.value)), null, EMPTY_USERDATA,
							#[if (multipleOperandConfiguration.contains(keyword)) -1 else 0, -50]));
				}
				operations.put(descriptionKey, descriptionEntries);
			}
		}
	}

	def public Set<IEObjectDescription> getOperations(EObject model, IExpressionScope.Anchor anchor) {
		var ExpressionType expressionType = ExpressionType.BOOLEAN;
		if (model instanceof RuleObject) {
			expressionType = (model as RuleObject).expressionType;
		} else if (model instanceof Operator) {
			expressionType = (model as Operator).underlyingType;
		}
		return operations.get(String.format(DESCRIPTION_KEY, expressionType.getName(), anchor.name));
	}

}
