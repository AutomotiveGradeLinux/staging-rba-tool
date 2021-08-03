package rba.tool.editor.generator.z3;

public class SortValueCodeTemplate {
	
	String area_zorder_code;

	String area_visibility_code;

	String content_state_priority_code;
	
	String method_code;
	
	private static final String NL = "\r\n";
	
	String getCompleteCode() {
		return "import groovy.transform.CompileStatic;" + NL + NL 
				+ "import java.util.ArrayList;" + NL
				+ "import java.util.HashMap;" + NL
				+ "import java.util.List;" + NL
				+ "import java.util.Map;" + NL + NL
				
				+ "import com.microsoft.z3.BoolExpr;" + NL
				+ "import com.microsoft.z3.Context;" + NL 
				+ "import com.microsoft.z3.Expr;" + NL 
				+ "import com.microsoft.z3.IntExpr;" + NL 
				+ "import com.microsoft.z3.Solver;" + NL 
				+ "import com.microsoft.z3.Status;" + NL + NL
				
				+ "import rba.tool.core.z3.Z3CodeManager;" + NL + NL
				
				+ "@CompileStatic" + NL 
				+ "public class SortValueCalculation implements rba.tool.core.sort.ISortValueCalculation {" + NL + NL 
				+ "    Context ctx;" + NL
				+ "    IntExpr std;" + NL 
				+ "    IntExpr min;" + NL 
				+ "    IntExpr max;" + NL 
				+ "    IntExpr non;" + NL + NL 
				+ "    BoolExpr stdConstr;" + NL 
				+ "    BoolExpr minConstr;" + NL 
				+ "    BoolExpr maxConstr;" + NL 
				+ "    BoolExpr nonConstr;" + NL + NL
				
				+ "    public void setUp() {" + NL 
				+ "        ctx = new Context();" + NL 
				+ "        std = ctx.mkIntConst(\"STANDARD\");" + NL 
				+ "        stdConstr = ctx.mkEq(std, ctx.mkInt(10));" + NL + NL
				
				+ "        min = ctx.mkIntConst(\"MIN_VALUE\");" + NL 
				+ "        minConstr = ctx.mkEq(min, ctx.mkInt(0));" + NL + NL
				
				+ "        max = ctx.mkIntConst(\"MAX_VALUE\");" + NL 
				+ "        maxConstr = ctx.mkEq(max, ctx.mkInt(9999));" + NL + NL
				
				+ "        non = ctx.mkIntConst(\"NONE_VALUE\");" + NL 
				+ "        nonConstr = ctx.mkEq(non, ctx.mkInt(-1));" + NL 
				+ "    }" + NL + NL 
				+ "    public void close() {" + NL 
				+ "        ctx.close();" + NL 
				+ "    }" + NL + NL 
				
				+ "    /**" + NL 
				+ "     * Derived the value of Zorder" + NL 
				+ "     */" + NL 
				+ "    public Map<String, Integer> calculateArea_zorder() {" + NL 
				+ "        Solver s = ctx.mkSolver();" + NL 
				+ "        s.push();" + NL + NL 
				+ "        List<Expr> areaList = new ArrayList<Expr>();" + NL 
				+ "        List<BoolExpr> constrList = new ArrayList<BoolExpr>();" + NL 
				+ "        List<BoolExpr> constrLabelList = new ArrayList<BoolExpr>();" + NL + NL
				
				+ area_zorder_code + NL
				
				+ "        s.add(stdConstr);" + NL 
				+ "        s.add(minConstr);" + NL 
				+ "        s.add(maxConstr);" + NL 
				+ "        s.add(nonConstr);" + NL + NL 
				
				+ "        for (int i = 0; i < constrList.size(); i++) {" + NL 
				+ "            s.assertAndTrack(constrList.get(i), constrLabelList.get(i));" + NL 
				+ "        }" + NL + NL
				+ "        Status st = s.check();" + NL 
				+ "        Map<String, Integer> map = Z3CodeManager.INSTNACE.setModel(s, areaList, st);" + NL 
				+ "        s.pop();" + NL 
				+ "        return map;" + NL 
				+ "    }" + NL + NL 
				
				+ "    /**" + NL 
				+ "     * Derivation of Visibility value" + NL 
				+ "     */" + NL 
				+ "    public Map<String, Integer> calculateAllocatable_visibility() {" + NL 
				+ "        Solver s = ctx.mkSolver();" + NL 
				+ "        s.push();" + NL + NL
				
				+ "        List<Expr> areaList = new ArrayList<Expr>();" + NL 
				+ "        List<BoolExpr> constrList = new ArrayList<BoolExpr>();" + NL 
				+ "        List<BoolExpr> constrLabelList = new ArrayList<BoolExpr>();" + NL + NL
				
				+ area_visibility_code + NL
				
				+ "        s.add(stdConstr);" + NL 
				+ "        s.add(minConstr);" + NL 
				+ "        s.add(maxConstr);" + NL 
				+ "        s.add(nonConstr);" + NL + NL 
				
				+ "        for (int i = 0; i < constrList.size(); i++) {" + NL 
				+ "            s.assertAndTrack(constrList.get(i), constrLabelList.get(i));" + NL 
				+ "        }" + NL + NL  
				
				+ "        Status st = s.check();" + NL 
				+ "        Map<String, Integer> map = Z3CodeManager.INSTNACE.setModel(s, areaList, st);					\r\n" + NL 
				+ "        s.pop();" + NL 
				+ "        return map;" + NL 
				+ "    }" + NL + NL  
				
				+ "    /**" + NL 
				+ "     * Derived the value of priority" + NL 
				+ "     */" + NL 
				+ "    public Map<String, Integer> calculateContentState_priority() {" + NL 
				+ "        Solver s = ctx.mkSolver();" + NL 
				+ "        s.push();" + NL + NL 
				
				+ "        List<Expr> contentList = new ArrayList<Expr>();" + NL 
				+ "        List<BoolExpr> constrList = new ArrayList<BoolExpr>();" + NL 
				+ "        List<BoolExpr> constrLabelList = new ArrayList<BoolExpr>();" + NL + NL 

				+ content_state_priority_code + NL
				
				+ "        s.add(stdConstr);" + NL 
				+ "        s.add(minConstr);" + NL 
				+ "        s.add(maxConstr);" + NL 
				+ "        s.add(nonConstr);" + NL + NL 

				+ "        for (int i = 0; i < constrList.size(); i++) {" + NL 
				+ "            s.assertAndTrack(constrList.get(i), constrLabelList.get(i));" + NL 
				+ "        }" + NL + NL 
 
				+ "        Status st = s.check();" + NL 
				+ "        Map<String, Integer> map = Z3CodeManager.INSTNACE.setModel(s, contentList, st);" + NL  
				+ "        s.pop();" + NL 
				+ "        return map;" + NL 
				+ "    }" + NL 
				
				+ method_code + NL
				
				
				+ "}" + NL;
	}
}
