package rba.tool.editor.ui.editor.model.edit.processor

import java.util.ArrayList
import java.util.Collection
import java.util.Collections
import java.util.List
import java.util.ListIterator
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.common.util.WrappedException
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import rba.tool.editor.ui.editor.model.edit.refactoring.RBAModelRenameElementUtil

class RBAModelProcessorUtil {

	public static final int NO_INDEX = -1;
	public static final Object UNSET_VALUE = new Object();

	def public static IUnitOfWork.Void<XtextResource> getAddProcessor(EObject owner, EStructuralFeature feature, Object object, int index) {
		return new IUnitOfWork.Void<XtextResource>() {
			override process(XtextResource xtextResource) throws Exception {
				val allOwners = xtextResource.allContents.toIterable.filter[it === owner].toList();
				if(!allOwners.isEmpty()) {
					doAddProcess(allOwners.get(0), feature, object, index);
				}
			}
		};
	}

	def public static IUnitOfWork.Void<XtextResource> getRemoveProcessor(EObject owner, EStructuralFeature feature, Collection<Object> collection) {
		return new IUnitOfWork.Void<XtextResource>() {
			override process(XtextResource xtextResource) throws Exception {
				val allOwners = xtextResource.allContents.toIterable.filter[it === owner].toList();
				if(!allOwners.isEmpty()) {
					doRemoveProcess(allOwners.get(0), feature, collection);
				}
			}
		};
	}

	def public static IUnitOfWork.Void<XtextResource> getSetProcessor(EObject owner, EStructuralFeature feature, Object value) {
		return new IUnitOfWork.Void<XtextResource>() {
			override process(XtextResource xtextResource) throws Exception {
				val EObject docOwner = RBAModelProcessorUtil.findEObjectByURI(owner, xtextResource);
				if(docOwner !== null && !docOwner.eIsProxy) {
					doSetProcess(docOwner, feature, value);
				}
			}
		};
	}

	def public static void doSetNameProcess(String value) {
		RBAModelRenameElementUtil.INSTANCE.execute(value);
	}

	def public static IUnitOfWork.Void<XtextResource> getUnexecutableProcessor() {
		return new IUnitOfWork.Void<XtextResource>() {
			override process(XtextResource xtextResource) throws Exception {
				return;
			}
		};
	}

	def public static void doAddProcess(EObject owner, EStructuralFeature feature, Object object, int index) {
		if(feature.isMany()) {
			val sibling = owner.eGet(feature) as List<Object>;
			if(!sibling.contains(object)) {
				sibling.add(if(index === NO_INDEX || index > sibling.size()) sibling.size() else index, object);
			}
		} else {
			owner.eSet(feature, object);
		}
	}

	def public static void doRemoveProcess(EObject owner, EStructuralFeature feature, Collection<Object> collection) {
		if(feature.isMany()) {
			val List<Object> objects = new ArrayList<Object>(collection);
			val List<Object> sibling = owner.eGet(feature) as List<Object>;
			for (obj : objects) {
				if(sibling.contains(obj)) {
					sibling.remove(obj);
				}
			}
		} else {
			if(feature.isUnsettable()) {
				owner.eUnset(feature);
			}
		}
	}

	def public static void doSetProcess(EObject owner, EStructuralFeature feature, Object value) {
		if(feature.isMany()) {
			val List<Object> values = if(value == UNSET_VALUE) Collections.EMPTY_LIST else value as List<Object>;
			val EList<Object> oldValues = owner.eGet(feature) as EList<Object>;

			if(!oldValues.isEmpty()) {
				if(!values.isEmpty()) {
					val List<Object> removedValues = new BasicEList.FastCompare<Object>(oldValues);
					removedValues.removeAll(values);

					// If we aren't simply removing all the old values...
					if(!removedValues.equals(oldValues)) {
						// If there are values to remove, append a command for them.
						if(!removedValues.isEmpty()) {
							oldValues.removeAll(removedValues);
						}

						// Determine the values that will remain and move them into the right order, if necessary.
						val EList<Object> remainingValues = new BasicEList.FastCompare<Object>(oldValues);
						var count = -1;
						for (object : values) {
							val position = remainingValues.indexOf(object);
							if(position != -1 && position != count.operator_plusPlus()) {
								oldValues.move(count, position);
								remainingValues.move(count, position);
							}
						}

						// Determine the values to be added and add them at the right position.
						val List<Object> addedValues = new BasicEList.FastCompare<Object>(values);
						addedValues.removeAll(remainingValues);
						if(!addedValues.isEmpty()) {
							var addIndex = remainingValues.size();
							for (val ListIterator<?> i = values.listIterator(values.size()); i.hasPrevious();) {
								val Object object = i.previous();
								if(addedValues.contains(object)) {
									doAddProcess(owner, feature, object, addIndex);
								} else {
									addIndex.operator_minusMinus();
								}
							}
						}
						return;
					}
				}
				oldValues.clear();
			}

			if(!values.isEmpty()) {
				oldValues.addAll(values);
			} else if(value == UNSET_VALUE && feature.isUnsettable()) {
				owner.eUnset(feature);
			}
		} else {
			if(value == UNSET_VALUE && feature.isUnsettable()) {
				owner.eUnset(feature);
			} else {
				owner.eSet(feature, value);
			}
		}
	}

	def public static EObject findEObjectByURI(EObject object, XtextResource resource) {
		val URI uri = EcoreUtil.getURI(object);
		if(uri !== null) {
			return findEObjectByURI(uri, resource);
		}
		return null;
	}

	def public static EObject findEObjectByURI(URI uri, XtextResource resource) {
		if(uri.fragment() !== null) {
			try {
				val EObject result = resource.getEObject(uri.fragment());
				return result;
			} catch(IllegalArgumentException e) {
			} catch(WrappedException e) {
			}
		}
		return null;
	}
}
