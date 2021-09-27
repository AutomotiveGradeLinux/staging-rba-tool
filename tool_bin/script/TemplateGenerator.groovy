import groovy.io.FileType
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import rba.core.*;
import rba.view.*;
import rba.sound.*;
import rba.tool.editor.rbaEditorModel.*;
import sun.font.EAttribute;

import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;

util.metaClass.getClassName = { it ->
	String pattern = "core\$";
	return it.split(pattern);
}

util.metaClass.getDisplaySize = { it ->
        Size s;
        SizeIdentifier si = it.getSize();
        if (si instanceof SizeReference) {
                s = si.getSize();
        } else {
                s = si;
        }
}

util.metaClass.getZones = {
		collect(Zone.class);
}
util.metaClass.getViewContents = {
		collect(ViewContent.class);
}
util.metaClass.getSoundContents = {
		collect(SoundContent.class);
}
util.metaClass.getAreaSets = {
	collect(AreaSet.class);
}
util.metaClass.getZoneSets = {
		collect(ZoneSet.class);
}
util.metaClass.getViewContentSets = {
	collect(ViewContentSet.class);
}
util.metaClass.getSoundContentSets = {
		collect(SoundContentSet.class);
}
util.metaClass.getProject = {
	p = null;
	projects = collect(Project.class);
	if (!projects.isEmpty()) p = projects.get(0)
	p;
}

class util2 {
	static List<Area> allAreas;
	static List<Zone> allZones;
	static List<ViewContent> allViewContents;
	static List<SoundContent> allSoundContents;

	static void setAll(List<Area> areas, List<Zone> zones, List<ViewContent> viewContents, List<SoundContent> soundContents) {
		allAreas = areas;
		allZones = zones;
		allViewContents = viewContents;
		allSoundContents = soundContents;
	}

	static void addAllIfNotContains(Collection<?> list, Collection<?> all) {
		all.each {
			if (!list.contains(it)) {
				list.add(it);
			}
		}
	}

	static Collection<Content> getLeafContentList(AbstractContent ac) {
		Collection<Allocatable> result = new ArrayList<Allocatable>();
		if (ac instanceof Content) {
			result.add((Content)ac);
		} else if (ac instanceof ContentSet) {
			for (AbstractContent c : ((ContentSet)ac).getTarget()) {
				addAllIfNotContains(result, getLeafContentList(c));
			}
		}
		return result;
	}

	static Collection<Allocatable> getAllocatableList(AbstractContent ac) {
		Collection<Allocatable> result = new ArrayList<Allocatable>();
		Collection<Allocatable> allocatables = new ArrayList<Allocatable>();
		allocatables.addAll(ac.allocatable);
		ac.contentGroup.each {
			allocatables.addAll(it.allocatableList);
		}
		if (ac instanceof Content) {
			allocatables.each {
				if (it instanceof AllocatableSet) {
					it.collectLeafAllocatable().each {
						if (!result.contains(it)) {
							result.add(it);
						}
					}
				} else {
					if (!result.contains(it)) {
						result.add(it);
					}
				}
			}
		} else if (ac instanceof ContentSet) {
			for (AbstractContent c : ((ContentSet)ac).getTarget()) {
				addAllIfNotContains(result, getAllocatableList(c));
			}
		}
		return result;
	}
	
	static String getFullName(EObject e) {
		if (e == null) return "";
		String fullName = e.name;
		EObject parent = e.eContainer();
		while (!(parent instanceof Package)) {
			fullName = parent.getName() + "/" + fullName;
			parent = parent.eContainer();
		}
		return fullName;
	}
	
	static String getFullNameWithClassName(EObject e) {
		String className = e.eClass().getName().replaceAll('rba.([a-z]+.)+.impl.', '').replaceAll('Impl$', '');
		String fullName = e.name + ":" + className;
		EObject parent = e.eContainer();
		while (!(parent instanceof Package)) {
			className = parent.eClass().getName().replaceAll('rba.([a-z]+.)+.impl.', '').replaceAll('Impl$', '');
			fullName = parent.getName() + ":" + className + "/" + fullName;
			parent = parent.eContainer();
		}
		return fullName;
	}

	static String indentSet(String si, int nest) {
		si = si + '\n';
		for (int i = 0; i < nest; ++i) {
			si = si + '\t';
		}
		return si;
	}
	static String jsonConstractor(EObject eO, int nest) {
		String s = '';
		if ((eO instanceof SugarExpression) && ((SugarExpression)eO).canExpand()) {
			s = s + jsonConstractor(((SugarExpression) eO).getExpanded(), nest);
			return s;
		}
		s = indentSet(s, nest);
		s = s + '{';
		nest = nest+1;
		s = indentSet(s, nest);
		s = s + jsonConstractorOtherThan(eO, nest, new ArrayList<String>());
		s = indentSet(s, nest-1);
		s = s + '}';
		return s;
	}
	static String jsonConstractorOtherThan(EObject eO, int nest, Collection<String> excepts) {
		if (eO == null) return;
		String s = '';
		boolean isObjRef = false;
		boolean isFullNameWithClassName = false;
		if (!excepts.contains("class")) {
			String className = eO.eClass().getName().replaceAll('rba.([a-z]+.)+.impl.', '').replaceAll('Impl$', '');
			if (className == "ObjectReference") {
				isObjRef = true;
			}
			s += '\"class\":\"' + className + '\"';
		}

		for (EAttribute a : eO.eClass().getEAllAttributes()) {
			if (a.isDerived() && a.isChangeable())	continue;
			if (a.getName().contentEquals("description"))	continue;
			if (excepts.contains(a.getName()))	continue;			
			s += ',';
			s = indentSet(s, nest);
			s += '\"' + a.getName() + '\":';
			if ((a.name == "name") && isFullNameWithClassName) {
				s += "\"" + getFullNameWithClassName(eO) + "\"";
				continue;
			}
			if (a.isMany()) {
				List<Object> list = (EList<Object>)eO.eGet(a);
				s = s + '[';
				for (Object atrObj : list) {
					s = s + '\"' + atrObj.toString().replaceAll('\"','') + '\"';
					if (atrObj != list.get(list.size-1)) s = s + ', ';
				}
				s = s + ']'
			}else {
				Object atrObj = eO.eGet(a);
				s += '\"';
				String str = atrObj.toString().replaceAll('\"','');
				s += str + '\"';
			}
		}

		for (EReference ref : eO.eClass().getEAllReferences()) {
			if (ref.isContainer() || ref.isContainment()) continue;
			if (excepts.contains(ref.getName())) continue;
			if (ref.isMany() && eO.eGet(ref).size() < 1) continue;
			s = s + ',';
			s = indentSet(s, nest);
			s = s + '\"' + ref.getName() + '\":';
			if (ref.isMany()) {
				s += '[';
				s = indentSet(s, nest + 1);
				for (EObject refObj : eO.eGet(ref)) {	
					s += '\"' + util2.getFullName(refObj) + '\",';
				}
				s = s.substring(0, s.length() - 1);
				s = indentSet(s, nest);
				s += ']';
			} else {
				s += '\"';
				EObject refObj = (EObject)eO.eGet(ref);
				String parentName = "";
				if (isObjRef) {
					s += refObj.getName();
				} else if (refObj instanceof NamedElement) {
					s += refObj.getName();
				}
				s += '\"';
			}
		}

		List<EStructuralFeature> sflist = new ArrayList<EStructuralFeature>(eO.eClass().getEAllContainments());
		for (EStructuralFeature i : sflist) {
			if (excepts.contains(i.getName()))	continue;
			if (i.isMany()) {
				EList<EObject> list = (EList<EObject>)eO.eGet(i);
				if (list.isEmpty())
					continue;
				s = s + ",";
				s = indentSet(s, nest);
				s = s + '\"' + i.getName() + '\"' + ':';
				s = s + "[";
				for (Iterator<EObject> iterator = list.basicIterator();
						iterator.hasNext(); ) {
					EObject o = (EObject)iterator.next();
					s = s + jsonConstractor(o, nest);
					if(iterator.hasNext())	s = s + ",";
				}
				s = s + "]";
			} else {
				EObject o = (EObject)eO.eGet(i);
				if (o == null) continue;
				s = s + ",";
				s = indentSet(s, nest);
				s = s + '\"' + i.getName() + '\"' + ':';
				s = s + jsonConstractor(o, nest);
			}
		}
		return s;
	}

	static Collection<RuleObject> getRelatedObjectOf(EObject eO) {
		Collection<RuleObject> result = new HashSet<Allocatable>();
		for (EObject o : eO.eAllContents()) {
			if (o instanceof ObjectReference) {
				ObjectReference ref = (ObjectReference)o;
				RuleObject ro = ref.getRefObject();
				if ((ro instanceof AbstractAllocatable) ||
					(ro instanceof AbstractContent) ||
					(ro instanceof Scene)) {
					result.add(ro);
				}
			}
		}
		return result;
	}
	static Comparator<AbstractAllocatable> getAllocatableComparator() {
		return new Comparator<AbstractAllocatable>() {
			@Override
			public int compare(AbstractAllocatable o1, AbstractAllocatable o2) {
				return o1.name.compareTo(o2.name);
			}
		}
	}
}

class ConstraintAllocMap extends HashMap<Constraint, Set<Allocatable>> {
	static ConstraintAllocMap instance;
	static public ConstraintAllocMap getInstance() {
		if (instance == null) {
			instance = new ConstraintAllocMap();
		}
		return instance;
	}
	public addRelationship(Constraint constraint, Allocatable alloc) {
		if (!this.containsKey(constraint)) {
			this.put(constraint, new HashSet<Allocatable>());
		}
		this.get(constraint).add(alloc);
	}
}

def engine = new groovy.text.GStringTemplateEngine()
def binding = ['util': util,
	 'util2' : util2,
	 'constraint_alloc_map' : ConstraintAllocMap.instance,
	 'ConstraintVisitResult' : ConstraintVisitResult,
	 'ConstraintVisitor' : ConstraintVisitor,
	 'allocateVisitor' : AllocateVisitor.instance,
	 'trueHiddenVisitor' : TrueHiddenVisitor.instance,
	 'falseHiddenVisitor' : FalseHiddenVisitor.instance,
	 'trueAttenuateVisitor' : TrueAttenuateVisitor.instance,
	 'falseAttenuateVisitor' : FalseAttenuateVisitor.instance
	 ]

Path templateRootPath = Paths.get(location + "/../template").normalize();
Path templateGenRootPath = Paths.get(location + "/../template-gen").normalize();

templateRootPath.toFile().eachFileRecurse (FileType.FILES) { file ->
	def name = file.getName()
	def index = name.lastIndexOf('.');
	if(index < 0) {
		return;
	}
	String extension = name.substring(index + 1);
	String baseName = name.substring(0 , index);
	index = extension.lastIndexOf("template");
	if(index < 0) {
		return;
	}
	String newFileExtension = extension.substring(0,index);
	def templatePath = file.toPath() // C:\dir1\dir2\template\aaa\bbb\ccc.javatemplate
	Path templateGenPath = templateGenRootPath.relativize(templatePath); // ..\template\aaa\bbb\ccc.javatemplate
	templateGenPath = templateGenPath.subpath(2, templateGenPath.getNameCount()); // aaa\bbb\ccc.javatemplate
	templateGenPath = templateGenRootPath.resolve(templateGenPath); // C:\dir1\dir2\template-gen\aaa\bbb\ccc.javatemplate
	templateGenPath = templateGenPath.getParent(); // C:\dir1\dir2\template-gen\aaa\bbb
	def genPath = templateGenPath;
	binding.put('genPath',genPath);
	def template = engine.createTemplate(file).make(binding)
	if (!Files.exists(templateGenPath)) {
		templateGenPath.toFile().mkdirs();
	}
	new File(templateGenPath.toString() + "/" + baseName + "." + newFileExtension ).text = template.toString()
}

enum ConstraintVisitResult {
	POSSIBLE,
	POSSIBLE_TRUE,
	POSSIBLE_FALSE,
	ALWAYS_TRUE,
	ALWAYS_FALSE,
	UNRELATED
}

// http://www.redtoad.ca/ataylor/2011/09/groovy-multimethods-and-the-visitor-pattern/
// how to use
//	checkResult = allocateVisitor.visitBool(expression)
//	if (
//		(checkResult == ConstraintVisitResult.ALWAYS_FALSE) ||
//		(checkResult == ConstraintVisitResult.POSSIBLE_FALSE) ||
//		(checkResult == ConstraintVisitResult.POSSIBLE)	||
//		(checkResult == ConstraintVisitResult.POSSIBLE_TRUE)
//	) {
class ConstraintVisitor {
	static List<Area> allAreas;
	static List<Zone> allZones;
	static List<ViewContent> allViewContents;
	static List<SoundContent> allSoundContents;
	
	static void setAll(List<Area> areas, List<Zone> zones, List<ViewContent> viewContents, List<SoundContent> soundContents) {
		allAreas = areas;
		allZones = zones;
		allViewContents = viewContents;
		allSoundContents = soundContents;
	}
	Allocatable target;
	static boolean isHiddenChiled_;
	void setTarget (Allocatable a) {
    	target = a;
		isHiddenChiled_ = false;
		
	}
	
	ConstraintVisitResult visitBool(SugarExpression e) {
		if (e.canExpand()) {
			return visitBool(e.getExpanded());
		}
		return ConstraintVisitResult.UNRELATED;
	}
	Collection visitObject(SugarExpression e) {
		if (e.canExpand()) {
			return visitObject(e.getExpanded());
		}
		return new HashSet();
	}
	boolean visitValue(SugarExpression e) {
		if (e.canExpand()) {
			return visitValue(e.getExpanded());
		}
		return false;
	}
	Collection visitRelatedObject(SugarExpression e) {
		if (e.canExpand()) {
			return visitRelatedObject(e.getExpanded());
		}
		return new HashSet();
	}
	
	ConstraintVisitResult visitBool(IfStatement e) {
		ConstraintVisitResult condition = visitBool(e.getCondition());
		ConstraintVisitResult thenExp = visitBool(e.getThenExpression());
		ConstraintVisitResult elseExp = visitBool(e.getElseExpression());
		
		if (condition == ConstraintVisitResult.ALWAYS_TRUE) {
			if (thenExp != ConstraintVisitResult.UNRELATED) {
				return thenExp;
			}
			return ConstraintVisitResult.POSSIBLE;
        }
		if (condition == ConstraintVisitResult.ALWAYS_FALSE) {
			if (elseExp != ConstraintVisitResult.UNRELATED) {
				return thenExp;
			}
			return ConstraintVisitResult.POSSIBLE;
		}
		if (thenExp == ConstraintVisitResult.ALWAYS_TRUE) {
			if (elseExp == ConstraintVisitResult.ALWAYS_TRUE)
				return ConstraintVisitResult.ALWAYS_TRUE;
			if (elseExp == ConstraintVisitResult.ALWAYS_FALSE)
				return ConstraintVisitResult.POSSIBLE;
			if (elseExp == ConstraintVisitResult.POSSIBLE_TRUE)
				return ConstraintVisitResult.POSSIBLE_TRUE;
			if (elseExp == ConstraintVisitResult.POSSIBLE_FALSE)
				return ConstraintVisitResult.POSSIBLE;
			if (elseExp == ConstraintVisitResult.UNRELATED)
				return ConstraintVisitResult.POSSIBLE_TRUE;
		}
		if (thenExp == ConstraintVisitResult.POSSIBLE_TRUE) {
			if (elseExp == ConstraintVisitResult.ALWAYS_TRUE)
				return ConstraintVisitResult.POSSIBLE_TRUE;
			if (elseExp == ConstraintVisitResult.ALWAYS_FALSE)
				return ConstraintVisitResult.POSSIBLE;
			if (elseExp == ConstraintVisitResult.POSSIBLE_TRUE)
				return ConstraintVisitResult.POSSIBLE_TRUE;
			if (elseExp == ConstraintVisitResult.POSSIBLE_FALSE)
				return ConstraintVisitResult.POSSIBLE;
			if (elseExp == ConstraintVisitResult.UNRELATED)
				return ConstraintVisitResult.POSSIBLE_TRUE;
		}
		if (thenExp == ConstraintVisitResult.ALWAYS_FALSE) {
			if (elseExp == ConstraintVisitResult.ALWAYS_TRUE)
				return ConstraintVisitResult.POSSIBLE;
			if (elseExp == ConstraintVisitResult.ALWAYS_FALSE)
				return ConstraintVisitResult.ALWAYS_FALSE;
			if (elseExp == ConstraintVisitResult.POSSIBLE_TRUE)
				return ConstraintVisitResult.POSSIBLE;
			if (elseExp == ConstraintVisitResult.POSSIBLE_FALSE)
				return ConstraintVisitResult.POSSIBLE_FALSE;
			if (elseExp == ConstraintVisitResult.UNRELATED)
				return ConstraintVisitResult.POSSIBLE_FALSE;
		}
		if (thenExp == ConstraintVisitResult.POSSIBLE_FALSE) {
			if (elseExp == ConstraintVisitResult.ALWAYS_TRUE)
				return ConstraintVisitResult.POSSIBLE;
			if (elseExp == ConstraintVisitResult.ALWAYS_FALSE)
				return ConstraintVisitResult.POSSIBLE_FALSE;
			if (elseExp == ConstraintVisitResult.POSSIBLE_TRUE)
				return ConstraintVisitResult.POSSIBLE;
			if (elseExp == ConstraintVisitResult.POSSIBLE_FALSE)
				return ConstraintVisitResult.POSSIBLE_FALSE;
			if (elseExp == ConstraintVisitResult.UNRELATED)
				return ConstraintVisitResult.POSSIBLE_FALSE;
		}
		if (thenExp == ConstraintVisitResult.UNRELATED) {
			if (elseExp == ConstraintVisitResult.POSSIBLE)
				return ConstraintVisitResult.POSSIBLE;
			if (elseExp == ConstraintVisitResult.ALWAYS_TRUE)
				return ConstraintVisitResult.POSSIBLE_TRUE;
			if (elseExp == ConstraintVisitResult.ALWAYS_FALSE)
				return ConstraintVisitResult.POSSIBLE_FALSE;
			if (elseExp == ConstraintVisitResult.POSSIBLE_TRUE)
				return ConstraintVisitResult.POSSIBLE_TRUE;
			if (elseExp == ConstraintVisitResult.POSSIBLE_FALSE)
				return ConstraintVisitResult.POSSIBLE_FALSE;
		}
		if (thenExp == ConstraintVisitResult.POSSIBLE || elseExp == ConstraintVisitResult.POSSIBLE) {
			return ConstraintVisitResult.POSSIBLE;
		}
		if (condition != ConstraintVisitResult.UNRELATED) {
			return ConstraintVisitResult.POSSIBLE;
		}

		return ConstraintVisitResult.UNRELATED;
	}
	
	ConstraintVisitResult visitBool(LambdaContext e) {
		return visitBool(e.lambda.bodyText);
	}

	ConstraintVisitResult visitBool(HasComeEarlierThan e) {
		if (visitRelatedObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		if (visitRelatedObject(e.operand.get(1)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(HasComeLaterThan e) {
		if (visitRelatedObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		if (visitRelatedObject(e.operand.get(1)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsActive e) {
		if (visitRelatedObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(HasBeenDisplayed e) {
		if (visitRelatedObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsTypeOf e) {
		if (visitRelatedObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(AndOperator e) {
		int alwaysTrueCount = 0;
		int alwaysFalseCount = 0;
		int possibleTrueCount = 0;
		int possibleFalseCount = 0;
		int possibleCount = 0;
		int unrelatedCount = 0;
		int total = 0;
		e.operand.each {
			ConstraintVisitResult result = visitBool(it);
			switch (result) {
			case ConstraintVisitResult.ALWAYS_TRUE:
				alwaysTrueCount++;
				break;
			case ConstraintVisitResult.ALWAYS_FALSE:
				alwaysFalseCount++;
				break;
			case ConstraintVisitResult.POSSIBLE_TRUE:
				possibleTrueCount++;
				break;
			case ConstraintVisitResult.POSSIBLE_FALSE:
				possibleFalseCount++;
				break;
			case ConstraintVisitResult.POSSIBLE:
				possibleCount++;
				break;
			case ConstraintVisitResult.UNRELATED:
			default:
				unrelatedCount++;
				break;
			}
			total++;
		}			
		if (alwaysFalseCount > 0) {
			return ConstraintVisitResult.ALWAYS_FALSE;
		}
		if (alwaysTrueCount == total) {
			return ConstraintVisitResult.ALWAYS_TRUE;
		}
		if (unrelatedCount == total) {
			return ConstraintVisitResult.UNRELATED;
		}
		if (alwaysTrueCount + possibleTrueCount + unrelatedCount == total) {
			return ConstraintVisitResult.POSSIBLE_TRUE;
		}
		if (alwaysFalseCount + possibleFalseCount + unrelatedCount == total) {
			return ConstraintVisitResult.POSSIBLE_FALSE;
		}
		return ConstraintVisitResult.POSSIBLE;
	}

	// A->B
	//               B
	//       AT AF PT PF PB UN
	//      ------------------
	//   AT| AT AF PT PF PB PF
	//   AF| AT AT AT AT AT AT
	// A PT| AT PF PB PB PB PB
	//   PF| AT PB PT PB PB PT
	//   PB| AT PB PB PB PB PB
	//   UN| AT PF PT PF PB UN
	ConstraintVisitResult visitBool(ImpliesOperator e) {
		ConstraintVisitResult lhresult = visitBool(e.operand.get(0));
		ConstraintVisitResult rhresult = visitBool(e.operand.get(1));

		if (lhresult == ConstraintVisitResult.ALWAYS_FALSE) {
			return ConstraintVisitResult.ALWAYS_TRUE;
		}
		if (rhresult == ConstraintVisitResult.ALWAYS_TRUE) {
			return ConstraintVisitResult.ALWAYS_TRUE;
		}
		if (lhresult == ConstraintVisitResult.UNRELATED) {
			if (rhresult == ConstraintVisitResult.ALWAYS_FALSE) {
				return ConstraintVisitResult.POSSIBLE_FALSE;
			}
			return rhresult;
		}
		if (lhresult == ConstraintVisitResult.POSSIBLE) {
			return ConstraintVisitResult.POSSIBLE;
		}
		if (lhresult == ConstraintVisitResult.ALWAYS_TRUE) {
			if (rhresult == ConstraintVisitResult.UNRELATED) {
				return ConstraintVisitResult.POSSIBLE_FALSE;
			}
			return rhresult;
		}
		if (lhresult == ConstraintVisitResult.POSSIBLE_TRUE) {
			if (rhresult == ConstraintVisitResult.POSSIBLE
				|| rhresult == ConstraintVisitResult.POSSIBLE_TRUE) {
				return ConstraintVisitResult.POSSIBLE;
			}
			return ConstraintVisitResult.POSSIBLE_FALSE;
		}
		if (lhresult == ConstraintVisitResult.POSSIBLE_FALSE) {
			if (rhresult == ConstraintVisitResult.UNRELATED
				|| rhresult == ConstraintVisitResult.POSSIBLE_TRUE) {
				return ConstraintVisitResult.POSSIBLE_TRUE;
			}
			return ConstraintVisitResult.POSSIBLE;
		}
	}

	ConstraintVisitResult visitBool(NotOperator e) {
		ConstraintVisitResult result = visitBool(e.operand.get(0));
		if (result == ConstraintVisitResult.ALWAYS_TRUE) {
			return ConstraintVisitResult.ALWAYS_FALSE;
		}
		if (result == ConstraintVisitResult.ALWAYS_FALSE) {
			return ConstraintVisitResult.ALWAYS_TRUE;
		}
		if (result == ConstraintVisitResult.POSSIBLE_TRUE) {
			return ConstraintVisitResult.POSSIBLE_FALSE;
		}
		if (result == ConstraintVisitResult.POSSIBLE_FALSE) {
			return ConstraintVisitResult.POSSIBLE_TRUE;
		}
		return result;
	}
	
	ConstraintVisitResult visitBool(OrOperator e) {
		int alwaysTrueCount = 0;
		int alwaysFalseCount = 0;
		int possibleTrueCount = 0;
		int possibleFalseCount = 0;
		int possibleCount = 0;
		int unrelatedCount = 0;
		int total = 0;
		
		e.operand.each {
			ConstraintVisitResult result = visitBool(it);
			switch (result) {
			case ConstraintVisitResult.ALWAYS_TRUE:
				alwaysTrueCount++;
				break;
			case ConstraintVisitResult.ALWAYS_FALSE:
				alwaysFalseCount++;
				break;
			case ConstraintVisitResult.POSSIBLE_TRUE:
				possibleTrueCount++;
				break;
			case ConstraintVisitResult.POSSIBLE_FALSE:
				possibleFalseCount++;
				break;
			case ConstraintVisitResult.POSSIBLE:
				possibleCount++;
				break;
			case ConstraintVisitResult.UNRELATED:
			default:
				unrelatedCount++;
				break;
			}
			total++;
		}			
		if (alwaysTrueCount > 0) {
			return ConstraintVisitResult.ALWAYS_TRUE;
		}
		if (alwaysFalseCount == total) {
			return ConstraintVisitResult.ALWAYS_FALSE;
		}
		if (unrelatedCount == total) {
			return ConstraintVisitResult.UNRELATED;
		}
		if (alwaysTrueCount + possibleTrueCount + unrelatedCount == total) {
			return ConstraintVisitResult.POSSIBLE_TRUE;
		}
		if (alwaysFalseCount + possibleFalseCount + unrelatedCount == total) {
			return ConstraintVisitResult.POSSIBLE_FALSE;
		}
		return ConstraintVisitResult.POSSIBLE;
	}
	
	ConstraintVisitResult visitBool(IsEqualToOperator e) {
		ConstraintVisitResult result = ConstraintVisitResult.UNRELATED
		e.operand.each {
			if (visitValue(it)) {
				result = ConstraintVisitResult.POSSIBLE;
			}
		}
		return result;
	}

	ConstraintVisitResult visitBool(IsGreaterThanEqualOperator e) {
		ConstraintVisitResult result = ConstraintVisitResult.UNRELATED
		e.operand.each {
			if (visitValue(it)) {
				result = ConstraintVisitResult.POSSIBLE;
			}
		}
		return result;
	}

	ConstraintVisitResult visitBool(IsGreaterThanOperator e) {
		ConstraintVisitResult result = ConstraintVisitResult.UNRELATED
		e.operand.each {
			if (visitValue(it)) {
				result = ConstraintVisitResult.POSSIBLE;
			}
		}
		return result;
	}

	ConstraintVisitResult visitBool(IsLowerThanEqualOperator e) {
		ConstraintVisitResult result = ConstraintVisitResult.UNRELATED
		e.operand.each {
			if (visitValue(it)) {
				result = ConstraintVisitResult.POSSIBLE;
			}
		}
		return result;
	}
	
	ConstraintVisitResult visitBool(IsLowerThanOperator e) {
		ConstraintVisitResult result = ConstraintVisitResult.UNRELATED
		e.operand.each {
			if (visitValue(it)) {
				result = ConstraintVisitResult.POSSIBLE;
			}
		}
		return result;
	}
	
	ConstraintVisitResult visitBool(ObjectCompare e) {
		ConstraintVisitResult result = ConstraintVisitResult.UNRELATED;
		e.operand.each {
			if (it instanceof ObjectReference) {
				ObjectReference objRef = (ObjectReference)it;
				if (!(it.refObject instanceof Variable)) {
					return;
				}
			}
			if (visitRelatedObject(it).contains(target)) {
				result = ConstraintVisitResult.POSSIBLE;
			}
		}
		return result;
	}
	
	ConstraintVisitResult visitBool(IsOn e) {
		if (visitRelatedObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}
	
	Collection visitObject(IfStatement e) {
		Collection results = new HashSet();
		ConstraintVisitResult condition = visitBool(e.getCondition());
		if (condition == ConstraintVisitResult.ALWAYS_TRUE) {
			results.addAll(visitObject(e.getThenExpression()));
			return results;
        }
		if (condition == ConstraintVisitResult.ALWAYS_FALSE) {
			results.addAll(visitObject(e.getElseExpression()));
			return results;
		}
		results.addAll(visitObject(e.getThenExpression()));
		results.addAll(visitObject(e.getElseExpression()));
		return results;
	}
	
	Collection visitObject(ObjectReference e) {
		Collection results = new HashSet();
		RuleObject obj = e.refObject;
		if (obj instanceof Variable) {
			if (obj.eContainer instanceof LetStatement) {
				LetStatement ls = (LetStatement)(obj.eContainer);
				results.addAll(visitObject(ls.body));
			} else {
				results.addAll(visitObject(obj.eContainer.eContainer.operand.get(0)));
			}
		} else {
			if (obj instanceof ContentSet) {
				results.addAll(obj.collectLeafContents());
			} else if (obj instanceof AllocatableSet) {
				results.addAll(obj.collectLeafAllocatable());
			} else {
				results.add(obj);
			}
		}
		return results;
	}

	Collection visitObject(MemberFeatureReference e) {
		return new HashSet();
	}

	Collection visitObject(SetOfOperator e) {
		Collection results = new HashSet();
		e.operand.each {
		    results.addAll(visitObject(it));
		}
		return results;
	}

	Collection visitObject(AllocatedContent e) {
		Collection results = new HashSet();
		for (Allocatable a : visitObject(e.operand.get(0))) {
			if (e.eContainer() instanceof ObjectCompare) {
				results.add(a)
			} else {
				results.addAll(a.contentsList);
			}
		}
		return results;
	}

	Collection visitObject(GetContentsList e) {
		Collection results = new HashSet();
		for (Allocatable a : visitObject(e.operand.get(0))) {
			results.addAll(a.contentsList);
		}
		return results;
	}

	Collection visitObject(ActiveContents e) {
		Collection results = new HashSet();
		for (Allocatable a : visitObject(e.operand.get(0))) {
			results.addAll(a.contentsList);
		}
		return results;
	}
	
	Collection visitObject(GetAllocatables e) {
		Collection results = new HashSet();
		for (Object c : visitObject(e.operand.get(0))) {
			if (c instanceof Content) {
				results.addAll(c.allocatableList);
			} else {
				results.add(c);
			}
		}
		return results;
	}

	Collection visitObject(DisplayingContent e) {
		Collection results = new HashSet();
		for (Allocatable a : visitObject(e.operand.get(0))) {
			if (e.eContainer() instanceof ObjectCompare) {
				results.add(a)
			} else {
				results.addAll(a.contentsList);
			}
		}
		return results;
	}

	Collection visitObject(OutputtingSound e) {
		Collection results = new HashSet();
		for (Allocatable a : visitObject(e.operand.get(0))) {
			if (e.eContainer() instanceof ObjectCompare) {
				results.add(a)
			} else {
				results.addAll(a.contentsList);
			}
		}
		return results;
	}
	
	Collection visitObject(ActiveState e) {
		Collection results = new HashSet();
		results.addAll(e.operand.get(0));
		return results;
	}
	
	Collection visitObject(PreviousModifier e) {
		return new HashSet();
	}

	Collection visitObject(AllInstanceOfArea e) {
		return allAreas;
	}

	Collection visitObject(AllInstanceOfSoundContent e) {
		return allSoundContents;
	}

	Collection visitObject(AllInstanceOfViewContent e) {
		return allViewContents;
	}

	Collection visitObject(AllInstanceOfZone e) {
		return allZones;
	}

	Collection visitObject(GetState e) {
		return visitObject(e.operand.get(0));
	}
	Collection visitObject(SelectOperator e) {
		Collection results = new HashSet();
		results.addAll(visitObject(e.operand.get(0)));
		if (visitBool(e.lambda.bodyText) !=  ConstraintVisitResult.UNRELATED) {
			results.add(target);
		}
		return results;
	}	
	Collection visitObject(LambdaContext e) {
		return visitObject(e.lambda.bodyText);
	}
	Collection visitObject(Operator e) {
		HashSet result = new HashSet();
		for (Expression o : e.operand) {
			result.addAll(visitObject(o));
		}
		return result;
	}
	Collection visitObject(Expression e) {
		return new HashSet();
	}
	
	boolean visitValue(IfStatement e) {
		ConstraintVisitResult condition = visitBool(e.getCondition());
		if (condition == ConstraintVisitResult.UNRELATED) {
			return visitValue(e.getThenExpression()) || visitValue(e.getElseExpression());
		}
		return true;
	}
	
	boolean visitValue(GetProperty e) {
		return false;
	}

	boolean visitValue(IntegerValue e) {
		return false;
	}
	
	boolean visitValue(SizeOperator e) {
		return visitRelatedObject(e.operand.get(0)).contains(target);
	}

	Collection visitRelatedObject(IfStatement e) {
		Collection results = new HashSet();
		ConstraintVisitResult condition = visitBool(e.getCondition());
		if (condition != ConstraintVisitResult.UNRELATED) {
			results.add(target);
		}
		if (condition == ConstraintVisitResult.ALWAYS_TRUE) {
			results.addAll(visitRelatedObject(e.getThenExpression()));
			return results;
        }
		if (condition == ConstraintVisitResult.ALWAYS_FALSE) {
			results.addAll(visitRelatedObject(e.getElseExpression()));
			return results;
		}
		results.addAll(visitRelatedObject(e.getThenExpression()));
		results.addAll(visitRelatedObject(e.getElseExpression()));
		return results;
	}
	
	Collection visitRelatedObject(ObjectReference e) {
		if (e.refObject instanceof Variable) {
			Collection results = new HashSet();
			if (e.refObject.eContainer instanceof LetStatement) {
				LetStatement ls = (LetStatement)(e.refObject.eContainer);
				if (e.eContainer() instanceof ObjectCompare) {
					return visitRelatedObject(ls.body)
				}
				visitRelatedObject(ls.body).each {
					if (it instanceof Allocatable) {
						results.add(it);
					}
				}
			} else {
				if (e.eContainer() instanceof ObjectCompare) {
					return visitRelatedObject(e.refObject.eContainer.eContainer.operand.get(0));
				} else if(
					e.eContainer() instanceof IsVisible ||
					e.eContainer() instanceof IsSounding
				) {
					Collection ret = visitRelatedObject(e.refObject.eContainer.eContainer.operand.get(0));
					if (ret.contains(target)) results.add(target);
					for (Object o : ret) {
						if (o instanceof Content) {
							Content c = (Content)o;
							if (c.allocatableList.contains(target)) {
								results.add(target);;
							}
						}
					}
				}
				visitObject(e.refObject.eContainer.eContainer.operand.get(0)).each {
					if (it instanceof Allocatable) {
						results.add(it);
					}
				}
			}
			return results;
		}
		return visitObject(e);
	}

	Collection visitRelatedObject(MemberFeatureReference e) {
		return new HashSet();
	}

	Collection visitRelatedObject(PreviousModifier e) {
		return new HashSet();
	}
	
	Collection visitRelatedObject(SetOfOperator e) {
		Collection results = new HashSet();
		e.operand.each {
		    results.addAll(visitRelatedObject(it));
		}
		return results;
	}

	Collection visitRelatedObject(AllInstanceOfArea e) {
		return visitObject(e);
	}

	Collection visitRelatedObject(AllInstanceOfSoundContent e) {
		return visitObject(e);
	}

	Collection visitRelatedObject(AllInstanceOfViewContent e) {
		return visitObject(e);
	}

	Collection visitRelatedObject(AllInstanceOfZone e) {
		return visitObject(e);
	}

	Collection visitRelatedObject(ActiveState e) {
		return visitRelatedObject(e.operand.get(0));
	}
	Collection visitRelatedObject(SelectOperator e) {
		Collection results = new HashSet();
		if (visitBool(e.lambda.bodyText) !=  ConstraintVisitResult.UNRELATED) {
			results.add(target);
		}
		return results;
	}
	Collection visitRelatedObject(LambdaContext e) { // Max, Min
		Collection results = new HashSet();
		if (visitValue(e.lambda.bodyText)) {
			results.add(target);
		}
		return results;
	}
	
	Collection visitRelatedObject(Operator e) {
		HashSet result = new HashSet();
		for (Expression o : e.operand) {
			result.addAll(visitRelatedObject(o));
		}
		return result;
	}
	Collection visitRelatedObject(Expression e) {
		return new HashSet();
	}
	
	Collection visitIndirectObject(ObjectReference e) {
		if (e.refObject instanceof Variable) {
			Collection results = new HashSet();
			if (e.refObject.eContainer instanceof LetStatement) {
				LetStatement ls = (LetStatement)(e.refObject.eContainer);
				visitRelatedObject(ls.body).each {
					if (it instanceof Allocatable) {
						results.add(it);
					}
				}
			} else {
				if (e.eContainer() instanceof ObjectCompare ||
					e.eContainer() instanceof IsVisible ||
					e.eContainer() instanceof IsSounding
				) {
					return visitRelatedObject(e.refObject.eContainer.eContainer.operand.get(0))
				}
				return visitIndirectObject(e.refObject.eContainer.eContainer.operand.get(0));
			}
			return results;
		}
		return new HashSet();
	}
	Collection visitIndirectObject(IfStatement e) {
		return visitRelatedObject(e);
	}
	Collection visitIndirectObject(Expression e) {
		return new HashSet();
	}
}

class FalseHiddenVisitor extends ConstraintVisitor {
	private static FalseHiddenVisitor instance;
	static FalseHiddenVisitor getInstance() {
		if (instance == null) {
			instance = new FalseHiddenVisitor();
		}
		return instance;
	}

	ConstraintVisitResult visitBool(IsDisplayed e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}
	
	ConstraintVisitResult visitBool(IsVisible e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsOutputted e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsSounding e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}
	
	ConstraintVisitResult visitBool(IsHidden e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		Collection ret = visitObject(e.operand.get(0));
		if (ret.contains(target)) {
			if (ret.size() == 1) {
				return ConstraintVisitResult.ALWAYS_FALSE;
			}
			return ConstraintVisitResult.POSSIBLE_FALSE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsAttenuated e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsMuted e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		Collection ret = visitObject(e.operand.get(0));
		if (ret.contains(target)) {
			if (ret.size() == 1) {
				return ConstraintVisitResult.ALWAYS_FALSE;
			}
			return ConstraintVisitResult.POSSIBLE_FALSE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	boolean visitValue(ContentValue e) {
		return false;
	}

	boolean visitValue(StateValue e) {
		return false;
	}

	Collection visitRelatedObject(AllocatedContent e) {
		return new HashSet();
	}

	Collection visitRelatedObject(GetContentsList e) {
		return new HashSet();
	}

	Collection visitRelatedObject(ActiveContents e) {
		return new HashSet();
	}
	
	Collection visitRelatedObject(GetAllocatables e) {
		return new HashSet();
	}

	Collection visitRelatedObject(DisplayingContent e) {
		return new HashSet();
	}

	Collection visitRelatedObject(OutputtingSound e) {
		return new HashSet();
	}
	
}

class TrueHiddenVisitor extends ConstraintVisitor {
	private static TrueHiddenVisitor instance;
	static TrueHiddenVisitor getInstance() {
		if (instance == null) {
			instance = new TrueHiddenVisitor();
		}
		return instance;
	}
	
	ConstraintVisitResult visitBool(IsDisplayed e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		Collection ret = visitObject(e.operand.get(0));
		if (ret.contains(target)) {
			if (ret.size() == 1) {
				return ConstraintVisitResult.ALWAYS_FALSE;
			}
			return ConstraintVisitResult.POSSIBLE_FALSE;
		}
		return ConstraintVisitResult.UNRELATED;
	}
	
	ConstraintVisitResult visitBool(IsVisible e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		Collection ret = visitObject(e.operand.get(0));
		if (ret.contains(target)) return ConstraintVisitResult.POSSIBLE;
		for (Object o : ret) {
			if (o instanceof Content) {
				Content c = (Content)o;
				if (c.allocatableList.contains(target)) {
					if ((ret.size() == 1) && (c.allocatableList.size() == 1)) {
						return  ConstraintVisitResult.ALWAYS_FALSE
					}
					return ConstraintVisitResult.POSSIBLE_FALSE;
				}
			}
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsOutputted e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		Collection ret = visitObject(e.operand.get(0));
		if (ret.contains(target)) {
			if (ret.size() == 1) {
				return ConstraintVisitResult.ALWAYS_FALSE;
			}
			return ConstraintVisitResult.POSSIBLE_FALSE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsSounding e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		Collection ret = visitObject(e.operand.get(0));
		if (ret.contains(target)) return ConstraintVisitResult.POSSIBLE;
		for (Object o : ret) {
			if (o instanceof Content) {
				Content c = (Content)o;
				if (c.allocatableList.contains(target)) {
					if ((ret.size() == 1) && (c.allocatableList.size() == 1)) {
						return  ConstraintVisitResult.ALWAYS_FALSE
					}
					return ConstraintVisitResult.POSSIBLE_FALSE;
				}
			}
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsHidden e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		Collection ret = visitObject(e.operand.get(0));
		if (ret.contains(target)) {
			if (ret.size() == 1) {
				return ConstraintVisitResult.ALWAYS_TRUE;
			}
			return ConstraintVisitResult.POSSIBLE_TRUE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsAttenuated e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsMuted e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		Collection ret = visitObject(e.operand.get(0));
		if (ret.contains(target)) {
			if (ret.size() == 1) {
				return ConstraintVisitResult.ALWAYS_TRUE;
			}
			return ConstraintVisitResult.POSSIBLE_TRUE;
		}
		return ConstraintVisitResult.UNRELATED;
	}
	
	boolean visitValue(ContentValue e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return true;
		}
		return false;
	}

	boolean visitValue(StateValue e) {
		boolean result = false;
		if (e.operand.get(0) instanceof ObjectReference) {
			visitIndirectObject(e.operand.get(0)).each {
				if (it instanceof Content) {
					if (it.allocatableList.contains(target)) {
						result = true;
					}
				} else if (it.equals(target)) {
						result = true;
				}
			}
		} else {
			result = visitIndirectObject(e.operand.get(0)).contains(target);
		}
		return result;
	}
	
	Collection visitRelatedObject(AllocatedContent e) {
		return new HashSet();
	}

	Collection visitRelatedObject(GetContentsList e) {
		return new HashSet();
	}

	Collection visitRelatedObject(ActiveContents e) {
		return new HashSet();
	}
	
	Collection visitRelatedObject(GetAllocatables e) {
		return new HashSet();
	}

	Collection visitRelatedObject(DisplayingContent e) {
		return visitRelatedObject(e.operand.get(0));
	}

	Collection visitRelatedObject(OutputtingSound e) {
		return visitRelatedObject(e.operand.get(0));
	}

}

class FalseAttenuateVisitor extends ConstraintVisitor {
	private static FalseAttenuateVisitor instance;
	static FalseAttenuateVisitor getInstance() {
		if (instance == null) {
			instance = new FalseAttenuateVisitor();
		}
		return instance;
	}
	
	ConstraintVisitResult visitBool(IsDisplayed e) {
		return ConstraintVisitResult.UNRELATED;
	}
	
	ConstraintVisitResult visitBool(IsVisible e) {
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsOutputted e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsSounding e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsHidden e) {
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsAttenuated e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		Collection ret = visitObject(e.operand.get(0));
		if (ret.contains(target)) {
			if (ret.size() == 1) {
				return ConstraintVisitResult.ALWAYS_FALSE;
			}
			return ConstraintVisitResult.POSSIBLE_FALSE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsMuted e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	boolean visitValue(ContentValue e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return true;
		}
		return false;
	}

	boolean visitValue(StateValue e) {
		boolean result = false;
		if (e.operand.get(0) instanceof ObjectReference) {
			visitIndirectObject(e.operand.get(0)).each {
				if (it instanceof Content) {
					if (it.allocatableList.contains(target)) {
						result = true;
					}
				} else if (it.equals(target)) {
						result = true;
				}
			}
		} else {
			result = visitIndirectObject(e.operand.get(0)).contains(target);
		}
		return result;
	}
	
	Collection visitRelatedObject(AllocatedContent e) {
		return new HashSet();
	}

	Collection visitRelatedObject(GetContentsList e) {
		return new HashSet();
	}

	Collection visitRelatedObject(ActiveContents e) {
		return new HashSet();
	}
	
	Collection visitRelatedObject(GetAllocatables e) {
		return new HashSet();
	}

	Collection visitRelatedObject(DisplayingContent e) {
		return new HashSet();
	}

	Collection visitRelatedObject(OutputtingSound e) {
		return new HashSet();
	}

}

class TrueAttenuateVisitor extends ConstraintVisitor {
	private static TrueAttenuateVisitor instance;
	static TrueAttenuateVisitor getInstance() {
		if (instance == null) {
			instance = new TrueAttenuateVisitor();
		}
		return instance;
	}
	
	ConstraintVisitResult visitBool(IsDisplayed e) {
		return ConstraintVisitResult.UNRELATED;
	}
	
	ConstraintVisitResult visitBool(IsVisible e) {
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsOutputted e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsSounding e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsHidden e) {
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsAttenuated e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		Collection ret = visitObject(e.operand.get(0));
		if (ret.contains(target)) {
			if (ret.size() == 1) {
				return ConstraintVisitResult.ALWAYS_TRUE;
			}
			return ConstraintVisitResult.POSSIBLE_TRUE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsMuted e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	boolean visitValue(ContentValue e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return true;
		}
		return false;
	}

	boolean visitValue(StateValue e) {
		boolean result = false;
		if (e.operand.get(0) instanceof ObjectReference) {
			visitIndirectObject(e.operand.get(0)).each {
				if (it instanceof Content) {
					if (it.allocatableList.contains(target)) {
						result = true;
					}
				} else if (it.equals(target)) {
						result = true;
				}
			}
		} else {
			result = visitIndirectObject(e.operand.get(0)).contains(target);
		}
		return result;
	}
	
	Collection visitRelatedObject(AllocatedContent e) {
		return new HashSet();
	}

	Collection visitRelatedObject(GetContentsList e) {
		return new HashSet();
	}

	Collection visitRelatedObject(ActiveContents e) {
		return new HashSet();
	}
	
	Collection visitRelatedObject(GetAllocatables e) {
		return new HashSet();
	}

	Collection visitRelatedObject(DisplayingContent e) {
		return new HashSet();
	}

	Collection visitRelatedObject(OutputtingSound e) {
		return new HashSet();
	}
}

class AllocateVisitor extends ConstraintVisitor {
	private static AllocateVisitor instance;
	static AllocateVisitor getInstance() {
		if (instance == null) {
			instance = new AllocateVisitor();
		}
		return instance;
	}
	
	ConstraintVisitResult visitBool(IsDisplayed e) {
		if (visitObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}
	
	ConstraintVisitResult visitBool(IsVisible e) {
		Collection targets = visitObject(e.operand.get(0));
		if (targets.contains(target)) return ConstraintVisitResult.POSSIBLE;
		for (Object o : targets) {
			if (o instanceof Content) {
				Content c = (Content)o;
				if (c.allocatableList.contains(target)) {
					return ConstraintVisitResult.POSSIBLE;
				}
			}
		}
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsOutputted e) {
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		if (visitObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsSounding e) {
		Collection targets = visitObject(e.operand.get(0));
		if (targets.contains(target)) return ConstraintVisitResult.POSSIBLE;
		for (Object o : targets) {
			if (o instanceof Content) {
				Content c = (Content)o;
				if (c.allocatableList.contains(target)) {
					return ConstraintVisitResult.POSSIBLE;
				}
			}
		}
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			return ConstraintVisitResult.POSSIBLE;
		}
		return ConstraintVisitResult.UNRELATED;
	}
	
	private static Collection ifStatement_result_;
	ConstraintVisitResult visitBool(IsHidden e) {
		ifStatement_result_ = new HashSet();
		boolean backup = isHiddenChiled_;
		isHiddenChiled_ = true;
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			isHiddenChiled_ = backup;
			return ConstraintVisitResult.POSSIBLE;
		}
		isHiddenChiled_ = backup;
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsAttenuated e) {
		ifStatement_result_ = new HashSet();
		boolean backup = isHiddenChiled_;
		isHiddenChiled_ = true;
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			isHiddenChiled_ = backup;
			return ConstraintVisitResult.POSSIBLE;
		}
		isHiddenChiled_ = backup;
		return ConstraintVisitResult.UNRELATED;
	}

	ConstraintVisitResult visitBool(IsMuted e) {
		ifStatement_result_ = new HashSet();
		boolean backup = isHiddenChiled_;
		isHiddenChiled_ = true;
		if (visitIndirectObject(e.operand.get(0)).contains(target)) {
			isHiddenChiled_ = backup;
			return ConstraintVisitResult.POSSIBLE;
		}
		isHiddenChiled_ = backup;
		return ConstraintVisitResult.UNRELATED;
	}
	
	boolean visitValue(ContentValue e) {
		if (visitRelatedObject(e.operand.get(0)).contains(target)) {
			return true;
		}
		return false;
	}

	boolean visitValue(StateValue e) {
		boolean result = false;
		if (e.operand.get(0) instanceof ObjectReference) {
			if (e.operand.get(0) instanceof Variable) {
				visitRelatedObject(e.operand.get(0)).each {
					if (it instanceof Content) {
						if (it.allocatableList.contains(target)) {
							result = true;
						}
					} else if (it.equals(target)) {
							result = true;
					}
				}
			}
		} else {
			result = visitRelatedObject(e.operand.get(0)).contains(target);
		}
		return result;
	}
	Collection visitRelatedObject(IfStatement e) {
		if (isHiddenChiled_) {
			ConstraintVisitResult condition = visitBool(e.getCondition());
			if (condition != ConstraintVisitResult.UNRELATED) {
				ifStatement_result_.add(target);
			}
			if (condition == ConstraintVisitResult.ALWAYS_TRUE) {
				visitRelatedObject(e.getThenExpression());
				return ifStatement_result_;
	        }
			if (condition == ConstraintVisitResult.ALWAYS_FALSE) {
				visitRelatedObject(e.getElseExpression());
				return ifStatement_result_;
			}
			visitRelatedObject(e.getThenExpression());
			visitRelatedObject(e.getElseExpression());
			return ifStatement_result_;
		} else {
			Collection results = new HashSet();
			ConstraintVisitResult condition = visitBool(e.getCondition());
			if (condition != ConstraintVisitResult.UNRELATED) {
				results.add(target);
			}
			if (condition == ConstraintVisitResult.ALWAYS_TRUE) {
				results.addAll(visitRelatedObject(e.getThenExpression()));
				return results;
			}
			if (condition == ConstraintVisitResult.ALWAYS_FALSE) {
				results.addAll(visitRelatedObject(e.getElseExpression()));
				return results;
			}
			results.addAll(visitRelatedObject(e.getThenExpression()));
			results.addAll(visitRelatedObject(e.getElseExpression()));
			return results;
		}
	}
	Collection visitRelatedObject(AllocatedContent e) {
		return visitRelatedObject(e.operand.get(0));
	}

	Collection visitRelatedObject(GetContentsList e) {
		return visitObject(e);
	}

	Collection visitRelatedObject(ActiveContents e) {
		return visitObject(e);
	}
	
	Collection visitRelatedObject(GetAllocatables e) {
		return visitObject(e);
	}

	Collection visitRelatedObject(DisplayingContent e) {
		return visitRelatedObject(e.operand.get(0));
	}

	Collection visitRelatedObject(OutputtingSound e) {
		return visitRelatedObject(e.operand.get(0));
	}
}