package rba.tool.editor.ui.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper

class RBAModelAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	override protected calculateId(String tokenName, int tokenType) {
		if ("\'Area\'".equals(tokenName)) {
			return RBAModelHighlightingConfiguration.AREA;
		}
		return super.calculateId(tokenName, tokenType);
	}

}
