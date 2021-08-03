package rba.tool.editor.endpoint.server.persistence

import java.io.File
import org.eclipse.emf.common.util.URI
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider

@FinalFieldsConstructor
class RBAModelResourceBaseProviderImpl implements IResourceBaseProvider {

	val String resourceBase

	override getFileURI(String resourceId) {
//		if (resourceId.contains('..'))
//			throw new InvalidRequestException.InvalidParametersException('Invalid resource path.')
		URI.createURI(slashify(resourceBase + resourceId, true))
	}

	def static String slashify(String resourceId, boolean isDirectory) {
		var p = resourceId;
		if (File.separatorChar != '/')
			p = p.replace(File.separatorChar, '/');
		if (!p.endsWith("/") && isDirectory)
			p = p + "/";
		return p;
	}
}
