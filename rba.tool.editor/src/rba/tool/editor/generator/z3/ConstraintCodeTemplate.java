package rba.tool.editor.generator.z3;

public class ConstraintCodeTemplate {

	String allocatable_content_set_code;
	String allocatable_content_size_code;
	String init_code;
	String setup_code;
	String constraints_code;
	String implies_constraints_call_code;
	String implies_constraints_method_code;
	String implies_constraints_comment_code;
	String implies_constraints_methodName_code;
	String implies_constraints_true_code;
	String implies_constrName;
	String invariance_constr_code;
	String invariance_pre_constr_code;

	private static final String NL = "\r\n";
	
	String getCompleteCode() {
		return "import groovy.transform.CompileStatic;" + NL + NL 
				+ "import java.util.ArrayList;" + NL
				+ "import java.util.LinkedHashMap;" + NL
				+ "import java.util.List;" + NL
				+ "import java.util.Map;" + NL + NL
				
				+ "import com.microsoft.z3.ArithExpr;" + NL
				+ "import com.microsoft.z3.ArrayExpr;" + NL
				+ "import com.microsoft.z3.BoolExpr;" + NL
				+ "import com.microsoft.z3.Context;" + NL 
				+ "import com.microsoft.z3.Expr;" + NL 
				+ "import com.microsoft.z3.IntExpr;" + NL 
				+ "import com.microsoft.z3.Quantifier;" + NL 
				+ "import com.microsoft.z3.Solver;" + NL 
				+ "import com.microsoft.z3.Sort;" + NL 
				+ "import com.microsoft.z3.Status;" + NL + NL
				+ "import com.microsoft.z3.IntNum;" + NL + NL
				
				+ "import rba.tool.core.z3.Z3CodeManager;" + NL + NL
				
				+ "@CompileStatic" + NL 
				+ "public class ConstraintCalculation implements rba.tool.core.constraint.IConstraintCalculation {" + NL + NL 
				+ "    boolean onlyOnline;" + NL
                + "    IntNum defNull;" + NL
                + "    IntNum allocatableSize;" + NL
                + "    IntNum contentSize;" + NL
				+ "    Context ctx;" + NL
				+ "    Sort int_type;" + NL
				+ "    Sort bool_type;" + NL 
				+ "    Sort array_int_bool_type;" + NL 
				+ "    Sort array_int_int_type;" + NL 
				+ "    ArrayExpr displayingContent;" + NL 
				+ "    ArrayExpr allocatedContent;" + NL 
				+ "    ArrayExpr isDisplayed;" + NL 
				+ "    ArrayExpr isHidden;" + NL 
				+ "    ArrayExpr contentsList;" + NL 
				+ "    ArrayExpr contentValue;" + NL 
				+ "    ArrayExpr isVisible;" + NL 
				+ "    ArrayExpr isActive;" + NL 
				+ "    ArrayExpr allocatable;" + NL 
				+ "    ArrayExpr preDisplayingContent;" + NL 
				+ "    ArrayExpr preAllocatedContent;" + NL 
				+ "    ArrayExpr preIsDisplayed;" + NL 
				+ "    ArrayExpr preIsHidden;" + NL 
				+ "    ArrayExpr preContentsList;" + NL 
				+ "    ArrayExpr preContentValue;" + NL 
				+ "    ArrayExpr preIsVisible;" + NL 
				+ "    ArrayExpr preIsActive;" + NL 
				+ "    ArrayExpr preAllocatable;" + NL 
				+ "    ArrayExpr isMuted;" + NL 
				+ "    ArrayExpr isOutputted;" + NL 
				+ "    ArrayExpr isAttenuated;" + NL 
				+ "    ArrayExpr outputtingSound;" + NL 
				+ "    ArrayExpr isSounding;" + NL 
				+ "    ArrayExpr preIsMuted;" + NL 
				+ "    ArrayExpr preIsOutputted;" + NL 
				+ "    ArrayExpr preIsAttenuated;" + NL 
				+ "    ArrayExpr preOutputtingSound;" + NL 
				+ "    ArrayExpr preIsSounding;" + NL 
                + "    ArrayExpr isOn;" + NL
                + "    ArrayExpr getProperty;" + NL
				+ "    ArrayExpr preIsOn;" + NL
                + "    ArrayExpr preGetProperty;" + NL
                + "    ArrayExpr isDefeatedBy;" + NL
				+ "    ArrayExpr defeats;" + NL
                + "    ArrayExpr isDisappeared;" + NL
				+ "    ArrayExpr isCanceled;" + NL

				+ "    ArrayExpr hasBeenDisplayed;" + NL
				+ "    ArrayExpr hasComeEarlierThan;" + NL
				+ "    ArrayExpr hasComeLaterThan;" + NL

                + "    ArrayExpr preIsDefeatedBy;" + NL
				+ "    ArrayExpr preDefeats;" + NL
                + "    ArrayExpr preIsDisappeared;" + NL
				+ "    ArrayExpr preIsCanceled;" + NL + NL

				+ "    ArrayExpr activeContents;" + NL
				+ "    ArrayExpr preActiveContents;" + NL 
				+ "    ArrayExpr preHasBeenDisplayed;" + NL

				+ "    ArrayExpr emp;" + NL 
				+ "    ArrayExpr empArrayConst;" + NL 
				+ "    ArrayExpr allInstanceOfArea;" + NL 
				+ "    ArrayExpr allInstanceOfAreaConst;" + NL 
				+ "    ArrayExpr allInstanceOfZone;" + NL 
				+ "    ArrayExpr allInstanceOfZoneConst;" + NL 
				+ "    ArrayExpr allInstanceOfViewContent;" + NL 
				+ "    ArrayExpr allInstanceOfViewContentConst;" + NL + NL
				+ "    ArrayExpr allInstanceOfSoundContent;" + NL 
				+ "    ArrayExpr allInstanceOfSoundContentConst;" + NL + NL
				
				+ allocatable_content_set_code + NL
				
				+ "    public void setUp(boolean onlyOnline) {" + NL 
				+ "        this.onlyOnline = onlyOnline;" + NL 
				+ "        ctx = new Context();" + NL 
				+ "        defNull = ctx.mkInt(0);" + NL 
				+ allocatable_content_size_code + NL
				+ "        int_type = ctx.getIntSort();" + NL 
				+ "        bool_type = ctx.getBoolSort();" + NL 
				+ "        array_int_bool_type = ctx.mkArraySort(int_type, bool_type);" + NL
				+ "        array_int_int_type = ctx.mkArraySort(int_type, int_type);" + NL + NL
				
				+ "        displayingContent = ctx.mkArrayConst(\"displayingContent\", int_type, int_type);" + NL 
				+ "        allocatedContent = ctx.mkArrayConst(\"allocatedContent\", int_type, int_type);" + NL 
				+ "        isDisplayed = ctx.mkArrayConst(\"isDisplayed\", int_type, bool_type);" + NL 
				+ "        contentsList = ctx.mkArrayConst(\"contentsList\", int_type, array_int_bool_type);" + NL 
				+ "        contentValue = ctx.mkArrayConst(\"contentValue\", int_type, int_type);" + NL 
				+ "        isHidden = ctx.mkArrayConst(\"isHidden\", int_type, bool_type);" + NL 
				+ "        isVisible = ctx.mkArrayConst(\"isVisible\", int_type, bool_type);" + NL 
				+ "        isActive = ctx.mkArrayConst(\"isActive\", int_type, bool_type);" + NL 
				+ "        allocatable = ctx.mkArrayConst(\"allocatable\", int_type, array_int_bool_type);" + NL + NL 
				+ "        outputtingSound = ctx.mkArrayConst(\"outputtingSound\", int_type, int_type);" + NL 
				+ "        isOutputted = ctx.mkArrayConst(\"isOutputted\", int_type, bool_type);" + NL 
				+ "        isMuted = ctx.mkArrayConst(\"isMuted\", int_type, bool_type);" + NL 
				+ "        isAttenuated = ctx.mkArrayConst(\"isAttenuated\", int_type, bool_type);" + NL 
				+ "        isSounding = ctx.mkArrayConst(\"isSounding\", int_type, bool_type);" + NL 
				
				+ "        preDisplayingContent = ctx.mkArrayConst(\"preDisplayingContent\", int_type, int_type);" + NL 
				+ "        preAllocatedContent = ctx.mkArrayConst(\"preAllocatedContent\", int_type, int_type);" + NL 
				+ "        preIsDisplayed = ctx.mkArrayConst(\"preIsDisplayed\", int_type, bool_type);" + NL 
				+ "        preContentsList = ctx.mkArrayConst(\"preContentsList\", int_type, array_int_bool_type);" + NL 
				+ "        preContentValue = ctx.mkArrayConst(\"preContentValue\", int_type, int_type);" + NL 
				+ "        preIsHidden = ctx.mkArrayConst(\"preIsHidden\", int_type, bool_type);" + NL 
				+ "        preIsVisible = ctx.mkArrayConst(\"preIsVisible\", int_type, bool_type);" + NL 
				+ "        preIsActive = ctx.mkArrayConst(\"preIsActive\", int_type, bool_type);" + NL 
				+ "        preAllocatable = ctx.mkArrayConst(\"preAllocatable\", int_type, array_int_bool_type);" + NL +NL
				+ "        preOutputtingSound = ctx.mkArrayConst(\"preOutputtingSound\", int_type, int_type);" + NL 
				+ "        preIsOutputted = ctx.mkArrayConst(\"preIsOutputted\", int_type, bool_type);" + NL 
				+ "        preIsMuted = ctx.mkArrayConst(\"preIsMuted\", int_type, bool_type);" + NL 
				+ "        preIsAttenuated = ctx.mkArrayConst(\"preIsAttenuated\", int_type, bool_type);" + NL 
				+ "        preIsSounding = ctx.mkArrayConst(\"preIsSounding\", int_type, bool_type);" + NL 
				
				+ "        isOn = ctx.mkArrayConst(\"isOn\", int_type, bool_type);" + NL 
				+ "        getProperty = ctx.mkArrayConst(\"getProperty\", int_type, array_int_int_type);" + NL 
                + "        preIsOn = ctx.mkArrayConst(\"preIsOn\", int_type, bool_type);" + NL
				+ "        preGetProperty = ctx.mkArrayConst(\"preGetProperty\", int_type, array_int_int_type);" + NL 
				+ "        isDefeatedBy = ctx.mkArrayConst(\"isDefeatedBy\", int_type, array_int_bool_type);" + NL 
				+ "        defeats = ctx.mkArrayConst(\"defeats\", int_type, array_int_bool_type);" + NL 
				+ "        isDisappeared = ctx.mkArrayConst(\"isDisappeared\", int_type, bool_type);" + NL 
				+ "        isCanceled = ctx.mkArrayConst(\"isCanceled\", int_type, bool_type);" + NL 
				
				+ "        hasBeenDisplayed = ctx.mkArrayConst(\"hasBeenDisplayed\", int_type, bool_type);" + NL
				+ "        hasComeEarlierThan = ctx.mkArrayConst(\"hasComeEarlierThan\", int_type, array_int_bool_type);" + NL
				+ "        hasComeLaterThan = ctx.mkArrayConst(\"hasComeLaterThan\", int_type, array_int_bool_type);" + NL

				+ "        preIsDefeatedBy = ctx.mkArrayConst(\"preIsDefeatedBy\", int_type, array_int_bool_type);" + NL 
				+ "        preDefeats = ctx.mkArrayConst(\"preDefeats\", int_type, array_int_bool_type);" + NL 
				+ "        preIsDisappeared = ctx.mkArrayConst(\"preIsDisappeared\", int_type, bool_type);" + NL 
				+ "        preIsCanceled = ctx.mkArrayConst(\"preIsCanceled\", int_type, bool_type);" + NL + NL

				+ "        preHasBeenDisplayed = ctx.mkArrayConst(\"preHasBeenDisplayed\", int_type, bool_type);" + NL

				+ "        activeContents = ctx.mkArrayConst(\"activeContents\", int_type, array_int_bool_type);" + NL
				+ "        preActiveContents = ctx.mkArrayConst(\"preActiveContents\", int_type, array_int_bool_type);" + NL
                
				+ "        emp = ctx.mkArrayConst(\"emp\", int_type, bool_type);" + NL 
				+ "        empArrayConst = ctx.mkConstArray(int_type, ctx.mkFalse());" + NL 
				+ "        allInstanceOfArea = ctx.mkArrayConst(\"allInstanceOfArea\", int_type, bool_type);" + NL 
				+ "        allInstanceOfAreaConst = ctx.mkConstArray(int_type, ctx.mkTrue());" + NL 
				+ "        allInstanceOfZone = ctx.mkArrayConst(\"allInstanceOfZone\", int_type, bool_type);" + NL 
				+ "        allInstanceOfZoneConst = ctx.mkConstArray(int_type, ctx.mkTrue());" + NL 
				+ "        allInstanceOfViewContent = ctx.mkArrayConst(\"allInstanceOfViewContent\", int_type, bool_type);" + NL 
				+ "        allInstanceOfViewContentConst = ctx.mkConstArray(int_type, ctx.mkTrue());" + NL +NL
				+ "        allInstanceOfSoundContent = ctx.mkArrayConst(\"allInstanceOfSoundContent\", int_type, bool_type);" + NL 
				+ "        allInstanceOfSoundContentConst = ctx.mkConstArray(int_type, ctx.mkTrue());" + NL +NL
				
				+ setup_code + NL
				+ "    }" + NL + NL 
				
				+ "    public void close() {" + NL 
				+ "        ctx.close();" + NL 
				+ "    }" + NL + NL 
				
				+ "    /**" + NL 
				+ "     * Initialization of constraint list" + NL 
				+ "     */" + NL 
				+ "    private void initConstraintList(List<BoolExpr> constrList, List<BoolExpr> constrLabelList) {" + NL 
				+ "        constrList.add(ctx.mkEq(emp, empArrayConst));" + NL 
				+ "        constrLabelList.add(ctx.mkBoolConst(\"Constraint : Emp \"));" + NL 
				+ "        constrList.add(ctx.mkEq(allInstanceOfArea, allInstanceOfAreaConst));" + NL 
				+ "        constrLabelList.add(ctx.mkBoolConst(\"Constraint : AllInstanceOfArea \"));" + NL
				+ "        constrList.add(ctx.mkEq(allInstanceOfZone, allInstanceOfZoneConst));" + NL 
				+ "        constrLabelList.add(ctx.mkBoolConst(\"Constraint : AllInstanceOfZone \"));" + NL
				+ "        constrList.add(ctx.mkEq(allInstanceOfViewContent, allInstanceOfViewContentConst));" + NL 
				+ "        constrLabelList.add(ctx.mkBoolConst(\"Constraint : AllInstanceOfViewContent \"));" + NL + NL
				+ "        constrList.add(ctx.mkEq(allInstanceOfSoundContent, allInstanceOfSoundContentConst));" + NL 
				+ "        constrLabelList.add(ctx.mkBoolConst(\"Constraint : AllInstanceOfSoundContent \"));" + NL + NL
				
				+ init_code + NL
					
				+ "    }" + NL + NL 
				
				+ "    /**" + NL 
				+ "     * Contradiction verification of all constraints" + NL 
				+ "     */" + NL 
				+ "    public List<String> calculateAllConstraint() {" + NL 
				+ "        Solver s = ctx.mkSolver();" + NL 
				+ "        s.push();" + NL + NL
				
				+ "        List<BoolExpr> constrList = new ArrayList<BoolExpr>();" + NL 
				+ "        List<BoolExpr> constrLabelList = new ArrayList<BoolExpr>();" + NL + NL
				
				+ "        setAllConstraintContext(constrList, constrLabelList);" + NL + NL
				
				+ "        for (int i = 0; i < constrList.size(); i++) {" + NL 
//				+ "            s.assertAndTrack(constrList.get(i), constrLabelList.get(i));" + NL 
				+ "            s.assertAndTrack((BoolExpr) constrList.get(i).simplify(), constrLabelList.get(i));" + NL 				
				+ "        }" + NL + NL
				
				+ "        Status st = s.check();" + NL 
				+ "        List<String> list = Z3CodeManager.INSTNACE.getErrors(ctx, s, st,\"allConstr\" ,constrList, constrLabelList);" + NL 				
				+ "        s.pop();" + NL 
				+ "        return list;" + NL 
				+ "    }" + NL + NL
				
				+ "    /**" + NL 
				+ "     * Contradiction verification execution" + NL 
				+ "     */" + NL 
				+ "    public void setAllConstraintContext(List<BoolExpr> constrList, List<BoolExpr> constrLabelList) {" + NL 
				+ "        initConstraintList(constrList, constrLabelList);" + NL
				
				+ constraints_code + NL
				
				+ "        setInvarianceConstraintContext(constrList, constrLabelList);" + NL
				+ "        setInvariancePreConstraintContext(constrList, constrLabelList);" + NL
				
				+ "    }" + NL + NL 
				
				+ "    /**" + NL 
				+ "     * Model invariant constraints" + NL 
				+ "     */" + NL 
				+ "    public void setInvarianceConstraintContext(List<BoolExpr> constrList, List<BoolExpr> constrLabelList) {" + NL 
				
				+ invariance_constr_code + NL
				
				+ "    }" + NL + NL 
				
				+ "    /**" + NL 
				+ "     * Model invariant constraint (pre constraint)" + NL 
				+ "     */" + NL 
				+ "    public void setInvariancePreConstraintContext(List<BoolExpr> constrList, List<BoolExpr> constrLabelList) {" + NL 

				+ invariance_pre_constr_code + NL
				
				+ "    }" + NL + NL 	

				+ "    /**" + NL 
				+ "     * Contradiction verification of implication partial constraints" + NL 
				+ "     */" + NL 
				+ "    public Map<String, List<String>> calculateImpliesConstraints() {" + NL 
				+ "        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();" + NL 
					
				+ implies_constraints_call_code + NL
				
				+ "        return map;" + NL 
				+ "    }" + NL + NL 
		
				+ implies_constraints_method_code + NL
				
				+ "}" + NL;
				
	}
		
	String getImpliesConstraintMethodCode(String allConstMethodName) {
		return    "    /**" + NL 
				+ implies_constraints_comment_code + NL
				+ "     */" + NL 
				+ implies_constraints_methodName_code + NL
				+ "        System.out.println(\"Calculate:\" + "+implies_constrName+");" + NL + NL
				
				+ "        Solver s = ctx.mkSolver();" + NL 
				+ "        s.push();" + NL + NL
				
				+ "        List<BoolExpr> constrList = new ArrayList<BoolExpr>();" + NL 
				+ "        List<BoolExpr> constrLabelList = new ArrayList<BoolExpr>();" + NL + NL
		
				+ implies_constraints_true_code + NL
				
				+ "        "+allConstMethodName+"(constrList, constrLabelList);" + NL + NL
				
				+ "        for (int i = 0; i < constrList.size(); i++) {" + NL 
				+ "            s.assertAndTrack((BoolExpr) constrList.get(i).simplify(), constrLabelList.get(i));" + NL 
				+ "        }" + NL + NL
				
				+ "        Status st = s.check();" + NL 
				+ "        List<String> list = Z3CodeManager.INSTNACE.getErrors(ctx, s, st, "+implies_constrName+",constrList, constrLabelList);" + NL 
				+ "        s.pop();" + NL 
				+ "        return list;" + NL 
				+ "    }" + NL;
	}
	
}
