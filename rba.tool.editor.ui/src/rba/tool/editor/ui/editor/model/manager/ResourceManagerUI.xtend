package rba.tool.editor.ui.editor.model.manager

import com.google.inject.Inject
import java.util.ArrayList
import java.util.Collection
import java.util.Collections
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IncrementalProjectBuilder
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.resource.ILocationInFileProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.service.OperationCanceledError
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.IXtextDocument
import org.eclipse.xtext.ui.editor.utils.EditorUtils
import org.eclipse.xtext.util.ITextRegion
import org.eclipse.xtext.util.concurrent.IUnitOfWork
import rba.core.provider.RBACoreItemProviderAdapterFactory
import rba.sound.provider.RBASoundItemProviderAdapterFactory
import rba.tool.editor.resource.IRBAModelResourceLoader
import rba.tool.editor.ui.activator.ExtensionEditorActivator
import rba.tool.editor.ui.editor.model.edit.processor.RBAModelProcessorUtil
import rba.tool.editor.ui.resource.RBAModelResourceSetProvider
import rba.view.provider.RBAViewItemProviderAdapterFactory

class ResourceManagerUI {

	public static ResourceManagerUI INSTANCE = new ResourceManagerUI();

	@Inject private RBAModelResourceSetProvider resourceSetProvider;

	@Inject private LanguageSpecificURIEditorOpener editorOpener ;

	@Inject private ILocationInFileProvider locationProvider;

	@Inject private ISerializer serializer;

	@Inject IRBAModelResourceLoader resourceLoader;

	private List<ComposeableAdapterFactory> adapterFactorys = new ArrayList<ComposeableAdapterFactory>;

	private IProject currentProject;

	private new() {
		ExtensionEditorActivator.getInstance().injectMembers(this);
		adapterFactorys.add(new RBACoreItemProviderAdapterFactory());
		adapterFactorys.add(new RBAViewItemProviderAdapterFactory());
		adapterFactorys.add(new RBASoundItemProviderAdapterFactory());
	}

	def public IProject getCurrentProject() {
		return currentProject;
	}

	def public void setCurrentProject(IProject project) {
		currentProject = project;
	}

	def public boolean isCurrentProject(IProject project) {
		if (project === null || !project.isOpen()) {
			return false;
		}

		if (project.equals(currentProject)) {
			return true;
		}

		return false;
	}

	def public ResourceSet getCurrentResourceSet() {
		return resourceSetProvider.getResourceSet(currentProject);
	}

	def public void setCurrentResourceSet(ResourceSet resourceSet) {
		resourceSetProvider.setResourceSet(currentProject, resourceSet);
	}
	
	def public IXtextDocument getXtextDocument(IEditorPart openEditor) {
		val XtextEditor xtextEditor = EditorUtils.getXtextEditor(openEditor);
		if (xtextEditor !== null) {
			return xtextEditor.getDocument();
		}
		return null;
	}

	def public void add(EObject owner, EStructuralFeature feature, Object object, int index) {
		val Object outerOwner = owner ?: getParent(object);
		if (outerOwner === null) {
			return;
		}
		if (!(outerOwner instanceof EObject)) {
			return;
		}

		if (feature === null || object === null) {
			return;
		}

		if (!isValid(outerOwner as EObject, feature)) {
			return;
		}

		val editorPart = open(outerOwner as EObject, false);
		var IXtextDocument document = getXtextDocument(editorPart);

		if (document !== null) {
			document.modify(RBAModelProcessorUtil.getAddProcessor(outerOwner as EObject, feature, object, if (index < 0) RBAModelProcessorUtil.NO_INDEX else index));
		}
	}

	def public void remove(EObject owner, EStructuralFeature feature, Object object) {
		val Object outerOwner = owner ?: getParent(object);
		if (outerOwner === null) {
			return;
		}
		if (!(outerOwner instanceof EObject)) {
			return;
		}

		remove(outerOwner as EObject, feature, Collections.singleton(object));
	}

	def public void remove(EObject owner, EStructuralFeature feature, Collection<Object> collection) {
		if (owner !== null) {
			if (feature === null || collection === null || collection.isEmpty()) {
				return;
			}

			if (!isValid(owner, feature)) {
				return;
			}

			val editorPart = open(owner as EObject, false);
			var IXtextDocument document = getXtextDocument(editorPart);

			if (document !== null) {
				document.modify(RBAModelProcessorUtil.getRemoveProcessor(owner as EObject, feature, collection));
			}
		} else {
			remove(feature, collection);
		}
	}

	def public void remove(EStructuralFeature feature, Collection<Object> collection) {
		if (feature === null || collection === null || collection.isEmpty()) {
			return;
		}

		val List<Object> objects = new ArrayList<Object>(collection);
		while (!objects.isEmpty()) {
			// We will iterate over the whole collection, removing some as we go.
			val remainingObjects = objects.listIterator();

			// Take the first object, and remove it.
			val object = remainingObjects.next();
			remainingObjects.remove();

			// Determine the object's parent.
			val parent = getParent(object);
			if (parent instanceof EObject) {
				// Now we want to find all the other objects with this same parent.
				// So we can collection siblings together and give the parent control over their removal.
				val List<Object> siblings = new ArrayList<Object>();
				siblings.add(object);

				while (remainingObjects.hasNext()) {
					// Get the next object and check if it has the same parent.
					val otherObject = remainingObjects.next();
					val otherParent = getParent(otherObject);
					if (otherParent == parent) {
						// Remove the object and add it as a sibling.
						remainingObjects.remove();
						siblings.add(otherObject);
					}
				}
				remove(parent as EObject, feature, siblings);
			}
		}
	}

	def public void set(EObject owner, EStructuralFeature feature, Object value) {
		val Object outerOwner = owner ?: getParent(value);
		if (outerOwner === null) {
			return;
		}
		if (!(outerOwner instanceof EObject)) {
			return;
		}

		if (feature === null) {
			return;
		}

		if (!isValid(owner, feature)) {
			return;
		}

		val innerValue = value ?: RBAModelProcessorUtil.UNSET_VALUE;
		val editorPart = open(outerOwner as EObject, false);
		var IXtextDocument document = getXtextDocument(editorPart);

		if (document !== null) {
			document.modify(RBAModelProcessorUtil.getSetProcessor(outerOwner as EObject, feature, innerValue));
			selectAndReveal(editorPart, EcoreUtil.getURI(outerOwner as EObject), feature, true);
		}
	}

	def public void unset(EObject owner, EStructuralFeature feature) {
		if (owner === null || feature === null) {
			return;
		}

		if (!isValid(owner, feature)) {
			return;
		}

		val editorPart = open(owner as EObject, false);
		var IXtextDocument document = getXtextDocument(editorPart);

		if (document !== null) {
			document.modify(RBAModelProcessorUtil.getSetProcessor(owner, feature, RBAModelProcessorUtil.UNSET_VALUE));
		}
	}

	def public void setName(EObject owner, EStructuralFeature feature, Object value) {
		val Object outerOwner = owner ?: getParent(value);
		if (outerOwner === null) {
			return;
		}
		if (!(outerOwner instanceof EObject)) {
			return;
		}

		val XtextEditor editor = open(outerOwner as EObject, true);
		if (editor === null) {
			return;
		}

		if (feature === null) {
			return;
		}

		if (!isValid(owner, feature)) {
			return;
		}

		if (!(value instanceof String)) {
			return;
		}
		val innerValue = value as String;

		RBAModelProcessorUtil.doSetNameProcess(innerValue)
	}

	def public void waitForBuildProgress(Object family, IProgressMonitor monitor) {
		var boolean wasInterrupted = false;
		do {
			try {
				Job.getJobManager().join(family, monitor);
				wasInterrupted = false;
			} catch (OperationCanceledException e) {
				throw e;
			} catch (InterruptedException e) {
				wasInterrupted = true;
			}
		} while (wasInterrupted);
	}

	def public XtextEditor open(EObject eObject, boolean select) {
		val resource = eObject.eResource();
		if (resource === null) {
			return null;
		}

		val editorPart = editorOpener.open(EcoreUtil.getURI(eObject), select);
		if (!(editorPart instanceof XtextEditor)) {
			return null;
		}

		return (editorPart as XtextEditor);
	}

	def public XtextEditor open(URI uri, boolean select) {
		if (uri === null || uri.isEmpty()) {
			return null
		}

		val editorPart = editorOpener.open(uri, select);
		if (!(editorPart instanceof XtextEditor)) {
			return null;
		}

		return (editorPart as XtextEditor);
	}

	def private Object getParent(Object object) {
		for (adapterFactory : adapterFactorys) {
			val IEditingDomainItemProvider editingDomainItemProvider = adapterFactory.adapt(object, IEditingDomainItemProvider) as IEditingDomainItemProvider;
			if (editingDomainItemProvider !== null) {
				return editingDomainItemProvider.getParent(object);
			}
		}
		return null;
	}

	def private static isValid(EObject owner, EStructuralFeature feature) {
		if (feature instanceof EReference && owner.eClass().getEAllReferences().contains(feature)) {
			return true;
		}
		if (feature instanceof EAttribute && owner.eClass().getEAllAttributes().contains(feature)) {
			return true;
		}
		return false;
	}

	def public void switchToProject(IProject project, IProgressMonitor monitor) throws InterruptedException {
		if (project === null) {
			return;
		}

		try {
			val SubMonitor progress = SubMonitor.convert(monitor, 10);
			doSwitch(project, progress.newChild(2));
			if (progress.isCanceled()) {
				throw new InterruptedException();
			}
			doBuild(project, progress.newChild(6));
			if (progress.isCanceled()) {
				throw new InterruptedException();
			}
			waitForBuildProgress(ResourcesPlugin.FAMILY_MANUAL_BUILD, progress.newChild(2));
		} catch (Exception e) {
			throw new InterruptedException(e.getMessage());
		}
	}

	def public boolean doConfirm(IProject project, boolean showConfirmDialog) throws InterruptedException {
		if (project === null || !project.isOpen()) {
			throw new InterruptedException();
		}
		if (isCurrentProject(project)) {
			return true;
		}

		val boolean confirm = if (showConfirmDialog)
				MessageDialog.openConfirm(Display.getCurrent().getActiveShell(), "Switch Project", "Do you want to switch to [" + project.getName() + "] project?")
			else
				true;

		return confirm;
	}

	def private void doSwitch(IProject project, IProgressMonitor monitor) {
		try {
			setCurrentProject(project);
		} catch (Exception e) {
			throw new InterruptedException(e.getMessage());
		}
	}

	def private void doBuild(IProject project, IProgressMonitor monitor) {
		try {
			project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
		} catch (Exception e) {
			throw new InterruptedException(e.getMessage());
		}
	}

	def private void selectAndReveal(IEditorPart openEditor, URI uri, EStructuralFeature feature, boolean select) {
		if (openEditor instanceof XtextEditor && select) {
			val xtextEditor = openEditor as XtextEditor;
			var boolean success = false;
			var int tries = 0;
			while (!success || tries >= 5) {
				try {
					xtextEditor.getDocument().readOnly(new IUnitOfWork.Void<XtextResource>() {
						override process(XtextResource resource) throws Exception {
							if (resource !== null) {
								val EObject object = RBAModelProcessorUtil.findEObjectByURI(uri, resource);
								if (object !== null) {
									val ITextRegion location = if (feature !== null)
											locationProvider.getSignificantTextRegion(object, feature, 0)
										else
											locationProvider.getSignificantTextRegion(object);
									xtextEditor.selectAndReveal(location.getOffset(), location.getLength());
								}
							}
						}
					});
					xtextEditor.doSave(null)
					success = true;
				} catch (OperationCanceledException e) {
				} catch (OperationCanceledError e) {
				} finally {
					tries++;
				}
			}
		}
	}

	def public String serialize(EObject object) {
		return serializer.serialize(object)
	}

	def public void loadAndResolveResource(ResourceSet resourceSet, URI[] URIs, IProject project) {
		resourceLoader.loadAndResolveResource(resourceSet, URIs, project);
	}
}
