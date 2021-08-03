package rba.tool.editor.ui.contentassist

import org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher.LastSegmentFinder

class RBAModelLastSegmentFinder implements LastSegmentFinder {

	override String getLastSegment(String fqn, char delimiter) {
		if(fqn === null || fqn.length() == 0) {
			return null;
		}

		var lookForUppercase = false;
		var lastDelimiterIndex = -1;
		for (var int i = 0; i < fqn.length(); i.operator_plusPlus()) {
			if(lookForUppercase) {
				if(Character.isUpperCase(fqn.charAt(i))) {
					return fqn.substring(i);
				}
			}
			lookForUppercase = delimiter == fqn.charAt(i);
			if(lookForUppercase) {
				lastDelimiterIndex = i;
			}
		}
		if(lastDelimiterIndex >= 0 && lastDelimiterIndex < fqn.length() - 1) {
			return fqn.substring(lastDelimiterIndex + 1);
		}
		return null;
	}

}
