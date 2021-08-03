package rba.tool.editor.ui.util

import org.eclipse.xtext.Keyword

class CharacterUtil {

	def public static boolean isKeywordWorthyToPropose(Keyword keyword) {
		return keyword.getValue().length() > 1 && Character.isLetter(keyword.getValue().charAt(0));
	}
}
