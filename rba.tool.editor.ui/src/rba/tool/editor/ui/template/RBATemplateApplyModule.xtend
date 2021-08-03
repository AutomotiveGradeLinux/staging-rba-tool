package rba.tool.editor.ui.template

import com.google.inject.Module
import com.google.inject.Binder
import org.eclipse.xtext.builder.impl.ToBeBuiltComputer

class RBATemplateApplyModule implements Module {

	override configure(Binder binder) {
		binder.bind(ToBeBuiltComputer).to(RBATemplateApplyToBeBuiltComputer)
	}

}
