package rba.tool.editor.endpoint.resource

import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.parser.IEncodingProvider
import com.google.inject.Singleton

@Singleton
class RBAModelWebEncodingProvider extends IEncodingProvider.Runtime {

	override getEncoding(URI uri) {
		if (defaultEncoding !== null)
			return defaultEncoding;
		return 'utf-8';
	}

}
