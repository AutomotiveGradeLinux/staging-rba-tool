package rba.tool.editor.linking

import com.google.inject.Inject
import java.util.Collections
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.linking.impl.DefaultLinkingService
import org.eclipse.xtext.linking.impl.IllegalNodeException
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.nodemodel.INode
import rba.core.ObjectReference
import rba.core.Package
import rba.core.RBACorePackage
import rba.core.RuleObject

class RBAModelLinkingService extends DefaultLinkingService {

	private static final Logger logger = Logger.getLogger(RBAModelLinkingService);

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	override getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException {
		val requiredType = ref.getEReferenceType();
		if(requiredType === null) {
			return Collections.<EObject>emptyList();
		}
		val crossRefString = getCrossRefNodeAsString(node);
		if(crossRefString === null || crossRefString.equals("")) {
			return Collections.<EObject>emptyList();
		}
		if(logger.isDebugEnabled()) {
			logger.debug("before getLinkedObjects: node: '" + crossRefString + "'");
		}

		if(context instanceof ObjectReference && ref === RBACorePackage.Literals.OBJECT_REFERENCE__REF_OBJECT && crossRefString.equals("this")) {
			val containers = EcoreUtil2.getAllContainers(context).filter [ c |
				c instanceof RuleObject && c.eContainer instanceof Package
			].toList;
			if(containers !== null && containers.size === 1) {
				return Collections.singletonList(containers.get(0));
			} else {
				return Collections.emptyList();
			}
		}

		val scope = getScope(context, ref);
		if(scope === null) {
			throw new AssertionError(
				"Scope provider " + scopeProvider.getClass().getName() + " must not return null for context " + context + ", reference " + ref + "! Consider to return IScope.NULLSCOPE instead.");
		}
		val qualifiedLinkName = qualifiedNameConverter.toQualifiedName(crossRefString);
		val eObjectDescription = scope.getSingleElement(qualifiedLinkName);
		if(logger.isDebugEnabled()) {
			logger.debug("after getLinkedObjects: node: '" + crossRefString + "' result: " + eObjectDescription);
		}
		if(eObjectDescription === null) {
			return Collections.emptyList();
		}
		val result = eObjectDescription.getEObjectOrProxy();
		return Collections.singletonList(result);
	}

}
