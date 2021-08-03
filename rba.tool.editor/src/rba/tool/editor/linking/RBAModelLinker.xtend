package rba.tool.editor.linking

import java.util.ArrayList
import java.util.Iterator
import java.util.List
import javax.inject.Inject
import org.eclipse.emf.common.util.AbstractTreeIterator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.linking.impl.DefaultLinkingService
import org.eclipse.xtext.linking.lazy.LazyLinker
import org.eclipse.xtext.nodemodel.INode
import rba.core.ObjectReference
import rba.tool.editor.rbaEditorModel.MemberFeatureReference
import rba.tool.editor.util.RBAModelEditorToolUtil

class RBAModelLinker extends LazyLinker {

	@Inject extension DefaultLinkingService linkingService

	override protected clearReference(EObject obj, EReference ref) {
		if(RBAModelEditorToolUtil.isSkippedSyntax(obj, ref)) {
			return;
		}
		super.clearReference(obj, ref);
	}

	override protected createProxy(EObject obj, INode node, EReference eRef) {
		val EObject result = getLinkedObject(obj, node, eRef);
		if(eRef.EOpposite !== null && (result !== null && result.eClass.EAllSuperTypes.contains(eRef.EReferenceType))) {
			val Resource objResource = obj.eResource();
			val Resource rslResource = result.eResource();
			if(!equals(objResource.URI, rslResource.URI)) {
				return result;
			}
		}

		return super.createProxy(obj, node, eRef);
	}

	override protected getAllLinkableContents(EObject model) {
		val AbstractTreeIterator<EObject> result = new AbstractTreeIterator<EObject>(model) {
			override public Iterator<EObject> getChildren(Object object) {
				val List<EObject> contents = new ArrayList<EObject>();
				if(object instanceof MemberFeatureReference) {
					// do nothing
				} else {
					val temp = (object as EObject).eContents();
					for (eObject : temp) {
						if(eObject instanceof MemberFeatureReference) {
							contents.addAll(EcoreUtil2.getAllContentsOfType(eObject, ObjectReference));
						}
						contents.add(eObject);
					}
				}
				return contents.iterator();
			}
		};

		return result;
	}

	def private EObject getLinkedObject(EObject obj, INode node, EReference eRef) {
		val linkedObjects = linkingService.getLinkedObjects(obj, eRef, node);
		if(linkedObjects.size == 1) {
			val linkedObject = linkedObjects.get(0);
			if(linkedObject.eIsProxy) {
				return EcoreUtil.resolve(linkedObject, obj.eResource);
			} else {
				return linkedObject;
			}
		}
		return null;
	}

	def private boolean equals(URI uri1, URI uri2) {
		if(uri1 === null || uri2 === null) {
			return false;
		}

		return uri1.equals(uri2);
	}
}
