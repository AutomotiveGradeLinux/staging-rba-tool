package rba.tool.editor.ui.syntaxcoloring

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

class RBAModelHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String AREA = "Area";

	override public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(AREA, "Area", areaStyle());
	}
	
	def public TextStyle areaStyle() {
		val textStyle = defaultTextStyle().copy();
		//val color = JFaceResources.getColorRegistry().getRGB(JFacePreferences.ACTIVE_HYPERLINK_COLOR);
		textStyle.color = new RGB(0, 0, 255);
		//val backgroundColor = JFaceResources.getColorRegistry().getRGB(JFacePreferences.CONTENT_ASSIST_FOREGROUND_COLOR);
		//textStyle.backgroundColor = backgroundColor;
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
}