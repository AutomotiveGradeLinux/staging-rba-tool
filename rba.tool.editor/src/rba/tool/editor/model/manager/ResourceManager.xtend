package rba.tool.editor.model.manager

import com.google.common.collect.Iterables
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.xbase.lib.Functions.Function1
import rba.core.Allocatable
import rba.core.Constraint
import rba.core.Content
import rba.core.Expression
import rba.core.ExpressionType
import rba.core.NamedElement
import rba.core.Package
import rba.core.Scene
import rba.core.SetOfOperator
import rba.core.State
import rba.core.Variable
import rba.sound.SoundContent
import rba.sound.SoundContentSet
import rba.sound.Zone
import rba.sound.ZoneSet
import rba.tool.editor.rbaEditorModel.TopLevel
import rba.view.Area
import rba.view.AreaSet
import rba.view.Display
import rba.view.PositionContainer
import rba.view.Size
import rba.view.ViewContent
import rba.view.ViewContentSet
import rba.core.Tag
import rba.core.Stereotype

class ResourceManager {

	public static ResourceManager INSTANCE = new ResourceManager();

	private Function1<? super Expression, Boolean> pseudoViewConstraintPredicate = [ e |
		e.type === ExpressionType.CONTENT || e.type === ExpressionType.SET_OF_CONTENT || e.type === ExpressionType.AREA || e.type === ExpressionType.SET_OF_AREA
	];

	private Function1<? super Expression, Boolean> pseudoSoundConstraintPredicate = [ e |
		e.type === ExpressionType.SOUND || e.type === ExpressionType.SET_OF_SOUND || e.type === ExpressionType.ZONE || e.type === ExpressionType.SET_OF_ZONE
	];

	private Function1<? super Expression, Boolean> generalConstraintPredicate = [ e |
		e.type === ExpressionType.SCENE || e.type === ExpressionType.PROPERTY || e.type === ExpressionType.BOOLEAN || e.type === ExpressionType.VALUE ||
			e.type === ExpressionType.LAMBDA
	];

	private new() {
	}

	def private <T> List<T> filter(ResourceSet set, Class<T> filterClass) {
		return set.resources.sort.map(r|r.allContents.toIterable.filter(filterClass)).flatten.toList;
	}

	def private List<Resource> sort(List<Resource> list) {
		return list.sortWith(new GlobalIndexResourceSorter());
	}

	def public List<NamedElement> getNamedElement(ResourceSet resourceSet) {
		val elements = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(NamedElement)).flatten;
		return elements.toList;
	}

	def public List<Allocatable> getRbaAllocatables(ResourceSet resourceSet) {
		val allAllocatables = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(Allocatable)).flatten;
		return allAllocatables.toList;
	}

	def public List<Area> getRbaAreas(ResourceSet resourceSet) {
		val allAreas = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(Area)).flatten;
		return allAreas.toList;
	}

	def public List<Zone> getRbaZones(ResourceSet resourceSet) {
		return filter(resourceSet, Zone);
	}

	def public List<AreaSet> getRbaAreaSets(ResourceSet resourceSet) {
		val allAreaSets = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(AreaSet)).flatten;
		return allAreaSets.toList;
	}

	def public List<ZoneSet> getRbaZoneSets(ResourceSet resourceSet) {
		val allZoneSets = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(ZoneSet)).flatten;
		return allZoneSets.toList;
	}

	def public List<Content> getRbaContents(ResourceSet resourceSet) {
		val allContents = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(Content)).flatten;
		return allContents.toList;
	}

	def public List<ViewContent> getRbaViewContents(ResourceSet resourceSet) {
		val allContents = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(ViewContent)).flatten;
		return allContents.toList;
	}

	def public List<ViewContentSet> getRbaViewContentSets(ResourceSet resourceSet) {
		val allContentSets = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(ViewContentSet)).flatten;
		return allContentSets.toList;
	}

	def public List<SoundContentSet> getRbaSoundContentSets(ResourceSet resourceSet) {
		val allContentSets = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(SoundContentSet)).flatten;
		return allContentSets.toList;
	}

	def public List<SoundContent> getRbaSoundContents(ResourceSet resourceSet) {
		return filter(resourceSet, SoundContent);
	}

	def public List<State> getRbaState(ResourceSet resourceSet) {
		val allStates = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(State)).flatten;
		return allStates.toList;
	}

	def public List<Scene> getRbaScenes(ResourceSet resourceSet) {
		val allScenes = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(Scene)).flatten;
		return allScenes.toList;
	}

	def public List<Size> getRbaSizes(ResourceSet resourceSet) {
		val allSizes = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(Size)).flatten;
		return allSizes.toList;
	}

	def public List<Display> getRbaDisplays(ResourceSet resourceSet) {
		val allDisplays = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(Display)).flatten;
		return allDisplays.toList;
	}

	def public List<PositionContainer> getRbaPositionContainers(ResourceSet resourceSet) {
		val allPositionContainers = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(PositionContainer)).flatten;
		return allPositionContainers.toList;
	}

	def public List<Package> getRbaPackages(ResourceSet resourceSet) {
		val allPackages = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(Package)).flatten;
		return allPackages.toList;
	}

	def public List<Package> getRbaRootPackages(ResourceSet resourceSet) {
		val allPackages = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(Package).filter(package|package.eContainer instanceof TopLevel)).flatten;
		return allPackages.toList;
	}

	def public List<Constraint> getRbaConstraints(ResourceSet resourceSet) {
		val allConstraints = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(Constraint)).flatten;
		return allConstraints.toList;
	}

	def public List<Constraint> getRbaOnlineConstraints(ResourceSet resourceSet) {
		val allOnlineConstraints = getRbaConstraints(resourceSet).filter(c|c.runtime === true);
		return allOnlineConstraints.toList;
	}

	def public List<Constraint> getRbaOfflineConstraints(ResourceSet resourceSet) {
		val allOfflineConstraints = getRbaConstraints(resourceSet).reject(c|c.runtime === true);
		return allOfflineConstraints.toList;
	}

	def public List<Constraint> getRbaViewConstraints(ResourceSet resourceSet) {
		val allOnlineconstraints = getRbaOnlineConstraints(resourceSet);
		val allPseudoViewConstraints = allOnlineconstraints.filter(c|EcoreUtil2.getAllContentsOfType(c, Expression).exists(pseudoViewConstraintPredicate));
		val allGeneralConstraints = allOnlineconstraints.filter(c|EcoreUtil2.getAllContentsOfType(c, Expression).forall(generalConstraintPredicate));
		val allViewConstraints = Iterables.concat(allPseudoViewConstraints, allGeneralConstraints).toList;
		val allOrderedViewConstraints = allOnlineconstraints.filter(c|allViewConstraints.contains(c));
		return allOrderedViewConstraints.toList;
	}

	def public List<Constraint> getRbaSoundConstraints(ResourceSet resourceSet) {
		val allOnlineconstraints = getRbaOnlineConstraints(resourceSet);
		val allPseudoSoundConstraints = allOnlineconstraints.filter(c|EcoreUtil2.getAllContentsOfType(c, Expression).exists(pseudoSoundConstraintPredicate));
		val allGeneralConstraints = allOnlineconstraints.filter(c|EcoreUtil2.getAllContentsOfType(c, Expression).forall(generalConstraintPredicate));
		val allSoundConstraints = Iterables.concat(allPseudoSoundConstraints, allGeneralConstraints).toList;
		val allOrderedSoundConstraints = allOnlineconstraints.filter(c|allSoundConstraints.contains(c));
		return allOrderedSoundConstraints.toList;
	}

	def public List<Variable> getRbaVariables(ResourceSet resourceSet) {
		val allVariables = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(Variable)).flatten;
		return allVariables.toList;
	}

	def public List<SetOfOperator> getRbaSetOfOperators(ResourceSet resourceSet) {
		val allSetOfOperators = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(SetOfOperator)).flatten;
		return allSetOfOperators.toList;
	}

	def public List<Tag> getRbaTags(ResourceSet resourceSet) {
		val allSetOfOperators = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(Tag)).flatten;
		return allSetOfOperators.toList;
	}

	def public List<Stereotype> getRbaStereotypes(ResourceSet resourceSet) {
		val allSetOfOperators = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(Stereotype)).flatten;
		return allSetOfOperators.toList;
	}

	def public List<EObject> getRbaAllContents(ResourceSet resourceSet) {
		val allContents = resourceSet.resources.sort.map(r|r.allContents.toIterable.filter(EObject)).flatten;
		return allContents.toList;
	}
}
