package rba.tool.editor.endpoint.server.persistence

import com.google.inject.Inject
import com.google.inject.Injector
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStreamWriter
import java.nio.file.attribute.BasicFileAttributes
import java.nio.file.Files
import java.nio.file.FileSystems
import java.nio.file.FileVisitResult
import java.nio.file.NoSuchFileException
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.SimpleFileVisitor
import java.text.ParseException
import java.util.ArrayList
import java.util.LinkedHashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.common.util.WrappedException
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.nodemodel.BidiTreeIterable
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement
import org.eclipse.xtext.parser.IEncodingProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.web.server.IServiceContext
import org.eclipse.xtext.web.server.model.IWebDocumentProvider
import org.eclipse.xtext.web.server.model.IWebResourceSetProvider
import org.eclipse.xtext.web.server.model.IXtextWebDocument
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider
import org.eclipse.xtext.web.server.persistence.IServerResourceHandler
import rba.tool.editor.model.manager.ResourceManager
import rba.tool.editor.parser.antlr.RBAModelParser
import rba.core.RuleObject
import rba.core.Tag
import rba.core.Stereotype

class RBAModelServerResourceHandler implements IServerResourceHandler {

	@Inject IResourceBaseProvider resourceBaseProvider

	@Inject IWebResourceSetProvider resourceSetProvider

	@Inject IWebDocumentProvider documentProvider

	@Inject IEncodingProvider encodingProvider

	override get(String resourceId, IServiceContext serviceContext) throws IOException {
		try {
			var resourceUris = new LinkedHashSet<URI>
			val uri = resourceBaseProvider.getFileURI(resourceId)
			if (uri === null)
				throw new IOException('The requested resource does not exist.')

			var path     = Paths.get(uri.path);
			var realPath = path.toRealPath(#[])
			resourceUris.clear
			resourceUris.addAll(Files.walk(realPath).filter(p|p.toString().endsWith(".rba")).map(p|URI.createFileURI(p.toString)).iterator.toSet)

			if (resourceUris === null || resourceUris.size === 0)
				throw new IOException('The requested resource does not exist.')

			var appliedFolder = createAppliedFolder(realPath)
			var appliedUriSet = new LinkedHashSet<URI>

			var resourceSet = resourceSetProvider.get("./.applied", serviceContext)
			for (resourceUri : resourceUris) {
				resourceSet.getResource(resourceUri, true)
			}
			
			var stereotypeFolder = new File(appliedFolder, "stereotype")
			stereotypeFolder.mkdir
			appliedUriSet.clear
			for (resource : resourceSet.resources) {
				val parseResult         = doRBAParse(resource.URI)
				val allStereotypes      = ResourceManager.INSTANCE.getRbaStereotypes(resourceSet)
				val root                = parseResult.rootNode
				var completeContentBuf  = new StringBuffer(root.text)
				var appliedTagList      = new LinkedHashSet<Tag>
				var appliedLength       = 0

				for(node : root.asTreeIterable) {
					var element = node.semanticElement
					if( (node instanceof CompositeNodeWithSemanticElement)
					 && (element instanceof RuleObject)) {
					 	val tagNodes      = getTagNodes(node.asTreeIterable)
					 	val appliedOffset = if(tagNodes.empty) 0 else tagNodes.last.endOffset + 1
					 	var appliedBuf    = new StringBuffer("")
					 	
					 	for(tagNode : tagNodes) {
					 		var tagElement = tagNode.semanticElement as Tag

							for(stereoType : allStereotypes) {
								if(!appliedTagList.contains(tagElement)
								 && isValidStereotype(tagElement, stereoType, element as RuleObject)) {
									appliedTagList.add(tagElement)
									val expanded = doExpandStereotype(stereoType, tagElement)
									appliedBuf.append(expanded)
								}
							}
							
							if(appliedBuf.length > 0) {
								completeContentBuf.insert(appliedOffset + appliedLength, appliedBuf)
								appliedLength += appliedBuf.length
							}
					 	}
					 }
				}

				completeContentBuf = guillemetize(completeContentBuf)

				var sourceFile  = new File(resource.URI.path)
				var stereotypeAppliedFile = new File(stereotypeFolder, sourceFile.name)
				var stereotypeAppliedOStream = new FileOutputStream(stereotypeAppliedFile, false)
				stereotypeAppliedOStream.write(completeContentBuf.toString.getBytes("UTF-8"))
				stereotypeAppliedOStream.close
				
				appliedUriSet.add(URI.createFileURI(stereotypeAppliedFile.path))
			}

			resourceSet = resourceSetProvider.get("./.applied", serviceContext)
			for (resourceUri : appliedUriSet) {
				resourceSet.getResource(resourceUri, true)
			}

			val firstResource = resourceSet.resources.get(0) as XtextResource
			return documentProvider.get(resourceId, serviceContext) => [
				setInput(firstResource)
			]
		} catch (NoSuchFileException exception) {
			System.err.format("%s: no such file or directory%n", exception.file);
			throw exception.cause
		} catch (IOException exception) {
			System.err.format("%s%n", exception);
			throw exception.cause
		} catch (WrappedException exception) {
			throw exception.cause
		}
	}

	override put(IXtextWebDocument document, IServiceContext serviceContext) throws IOException {
		try {
			val uri = resourceBaseProvider.getFileURI(document.resourceId)
			val outputStream = document.resource.resourceSet.URIConverter.createOutputStream(uri)
			val writer = new OutputStreamWriter(outputStream, encodingProvider.getEncoding(uri))
			writer.write(document.text)
			writer.close
		} catch (WrappedException exception) {
			throw exception.cause
		}
	}

	def createAppliedFolder(Path realPath) {
		var appliedFolder = new File(realPath.parent.toFile, ".applied_JSONGen")
		
		if(appliedFolder.exists) {
			Files.walkFileTree(FileSystems.getDefault.getPath(appliedFolder.path), new SimpleFileVisitor<Path>() {
				override public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
					throws IOException
				{
					Files.delete(file)
					return FileVisitResult.CONTINUE
				}
				
				override public FileVisitResult postVisitDirectory(Path dir, IOException e)
					throws IOException
				{
					if(e === null) {
						Files.delete(dir)
						return FileVisitResult.CONTINUE
					}
					else {
						throw e
					}
				}
			})
		}

		appliedFolder.mkdir
		
		return appliedFolder
	}

	def doTemplateParse(Set<URI> uriSet, ResourceSet resourceSet) throws ParseException {
		for (resourceUri : uriSet) {
			resourceSet.getResource(resourceUri, true)
		}
		
		for (resource : resourceSet.resources) {
			val errors = resource.errors
			for (error : errors) {
				var uri      = resource.URI
				var filename = uri.segment(uri.segmentCount - 1)
				var buf = new StringBuffer(filename + "(l." + error.line + ": col." + error.column + "): error: "+ error.message + ".")
				System.err.println(buf.toString)
				throw new ParseException(buf.toString, error.line)
			}
		}

		return resourceSet		
	}

	def doRBAParse(URI resourceUri) {
		var resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(resourceUri)
		var injector            = resourceServiceProvider.get(Injector)
		var modelParser         = injector.getInstance(RBAModelParser)
		
		return modelParser.parse(Files.newBufferedReader(Paths.get(resourceUri.path)))
	}

	def expandCore(String templated, String[] arguments, String[] values, boolean trim) {
		var expanded = templated
		
		expanded = expanded.replace("@END@", "")
		expanded = expanded.replace("@BEGIN@", "")
		if(trim) {
			expanded = expanded.trim			
		}

		if( (arguments.size > 0)
		 && (values.size > 0)) {
			for(index : 0..(values.size - 1)) {
				var value = values.get(index)
				value = value.replaceAll("\"", "")
				expanded = expanded.replace("@{" + arguments.get(index) + "}", value)
			}
		}
		
		return expanded				
	}

	def doExpandStereotype(Stereotype stereotype, Tag tag) {
		var variables = new ArrayList
		if(stereotype.variables.size > 0) {
			for(index : 0..(stereotype.variables.size - 1)) {
				variables.add(stereotype.variables.get(index).name)
			}
		}
		return expandCore(stereotype.bodyText, variables, tag.values, false)
	}
	
	
	def getTagNodes(BidiTreeIterable<INode> tree) {
		val nodeList = new ArrayList
		for(INode node : tree) {
			if( (node instanceof CompositeNodeWithSemanticElement)
			 && (node.semanticElement instanceof Tag)) {
			 	nodeList.add(node)
			 }
		}

		return nodeList
	}
	
	def isValidStereotype(Tag tag, Stereotype stereotype, RuleObject element) {
		if( !(stereotype.name.equals(tag.name))
		 || !(element.eClass.name.equalsIgnoreCase(stereotype.targetModelName))) {
			return false;
		} else if((tag.values !== null)
		  && (stereotype.variables !== null)
		  && (stereotype.variables.size == tag.values.size)) {
			return true;
		} else if((tag.values === null)
		  && (stereotype.variables.size === 0)) {
			return true;
		}
		return false;
	}
	
	def guillemetize(StringBuffer buf) {
		val BRACKET_OPEN    = "<<"
		val BRACKET_CLOSE   = ">>"
		val GUILLEMET_OPEN  = "«"
		val GUILLEMET_CLOSE = "»"
		var guillemetized = buf.toString

		guillemetized = guillemetized.replace(BRACKET_OPEN, GUILLEMET_OPEN)
		guillemetized = guillemetized.replace(BRACKET_CLOSE, GUILLEMET_CLOSE)

		return buf.delete(0, buf.length).insert(0, guillemetized)
	}	
}
