package rba.tool.editor.ui.template

import javax.inject.Inject
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IStorage
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.builder.impl.ToBeBuiltComputer
import org.eclipse.xtext.ui.resource.IStorage2UriMapper
import rba.tool.editor.util.RBAModelEditorNameUtil

class RBATemplateApplyToBeBuiltComputer extends ToBeBuiltComputer {
	@Inject
	private IStorage2UriMapper mapper;

	override protected getUri(IStorage file) {
		var uri = mapper.getUri(file);
		var IStorage f = file
		if (uri !== null && !isValid(uri, f)) {
			uri = null
		}
		return uri;
	}
}
