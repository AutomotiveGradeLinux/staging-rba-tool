package rba.tool.editor.ui.opener

import com.google.inject.Inject
import org.apache.log4j.Logger
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IStorage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.common.util.WrappedException
import org.eclipse.emf.ecore.EReference
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.PartInitException
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.ide.IDE
import org.eclipse.xtext.resource.ILocationInFileProvider
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.IURIEditorOpener
import org.eclipse.xtext.ui.editor.utils.EditorUtils
import org.eclipse.xtext.ui.resource.IResourceUIServiceProvider
import org.eclipse.xtext.ui.resource.IStorage2UriMapper
import org.eclipse.xtext.util.concurrent.IUnitOfWork

class RBAModelURIEditorOpener implements IURIEditorOpener {

	private static final Logger logger = Logger.getLogger(RBAModelURIEditorOpener);

	@Inject
	private IResourceServiceProvider.Registry resourceServiceProviderRegistry;

	@Inject
	private IStorage2UriMapper mapper;

	@Inject(optional=true)
	private IWorkbench workbench;

	/**
	 * @since 2.2
	 */
	def IEditorPart open(URI uri, Object context, boolean select) {
		return open(uri, select);
	}

	override open(URI uri, boolean select) {
		val resourceServiceProvider = resourceServiceProviderRegistry.getResourceServiceProvider(uri.trimFragment());
		if(resourceServiceProvider instanceof IResourceUIServiceProvider) {
			val editorOpener = ( resourceServiceProvider as IResourceUIServiceProvider).getURIEditorOpener();
			if(editorOpener !== null) {
				return editorOpener.open(URI.createURI(uri.toString.replace("/.applied/", "/model/")), select);
			}
		}
		return openDefaultEditor(URI.createURI(uri.toString.replace("/.applied/", "/model/")), null, -1, select);
	}

	override open(URI referenceOwnerURI, EReference reference, int indexInList, boolean select) {
		val resourceServiceProvider = resourceServiceProviderRegistry.getResourceServiceProvider(referenceOwnerURI.trimFragment());
		if(resourceServiceProvider instanceof IResourceUIServiceProvider) {
			val editorOpener = (resourceServiceProvider as IResourceUIServiceProvider).getURIEditorOpener();
			if(editorOpener !== null) {
				return editorOpener.open(referenceOwnerURI, reference, indexInList, select);
			}
		}
		return openDefaultEditor(referenceOwnerURI, reference, indexInList, select);
	}

	def protected IEditorPart openDefaultEditor(URI uri, EReference crossReference, int indexInList, boolean select) {
		val storages = mapper.getStorages(uri.trimFragment()).iterator();
		if(storages !== null && storages.hasNext()) {
			try {
				val storage = storages.next().getFirst();
				var IEditorPart editor = null;
				if(storage instanceof IFile) {
					editor = openDefaultEditor(storage as IFile);
				} else {
					editor = openDefaultEditor(storage, uri);
				}
				selectAndReveal(editor, uri, crossReference, indexInList, select);
				return editor;
			} catch(WrappedException e) {
				logger.error("Error while opening editor part for EMF URI '" + uri + "'", e.getCause());
			} catch(PartInitException partInitException) {
				logger.error("Error while opening editor part for EMF URI '" + uri + "'", partInitException);
			}
		}
		return null;
	}

	def protected void selectAndReveal(IEditorPart openEditor, URI uri, EReference crossReference, int indexInList, boolean select) {
		val xtextEditor = EditorUtils.getXtextEditor(openEditor);
		if(xtextEditor !== null) {
			if(uri.fragment() !== null) {
				xtextEditor.getDocument().priorityReadOnly(new IUnitOfWork.Void<XtextResource>() {
					override process(XtextResource resource) throws Exception {
						if(resource !== null) {
							val object = resource.getEObject(uri.fragment());
							val locationProvider = resource.getResourceServiceProvider().get(ILocationInFileProvider);
							val location = if(crossReference !== null)
									locationProvider.getSignificantTextRegion(object, crossReference, indexInList)
								else
									locationProvider.getSignificantTextRegion(object);
							if(select) {
								xtextEditor.selectAndReveal(location.getOffset(), location.getLength());
							} else {
								xtextEditor.reveal(location.getOffset(), location.getLength());
							}
						}
					}
				});
			}
		}
	}

	def protected IEditorPart openDefaultEditor(IFile file) throws PartInitException {
		val page = getWorkbench().getActiveWorkbenchWindow().getActivePage();
		return IDE.openEditor(page, file);
	}

	def protected IEditorPart openDefaultEditor(IStorage storage, URI uri) throws PartInitException {
		val editorInput = EditorUtils.createEditorInput(storage);
		val page = getWorkbench().getActiveWorkbenchWindow().getActivePage();
		return IDE.openEditor(page, editorInput, PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(uri.lastSegment()).getId());
	}

	def protected IWorkbench getWorkbench() {
		if(workbench === null)
			throw new IllegalStateException("No workbench");
		return workbench;
	}
}
