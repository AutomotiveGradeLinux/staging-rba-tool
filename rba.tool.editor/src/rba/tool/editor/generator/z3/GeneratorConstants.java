package rba.tool.editor.generator.z3;

interface GeneratorConstants {

    static final String CMT_AREA_LIST = "// Area definition";

    static final String CMT_AREA_VISIBILITY_LABEL_LIST = "// Visibility-constrained labeling";

    static final String CMT_AREA_ZORDER_LABEL_LIST = "// Constraint expression labeling";

    static final String CMT_CONTENT_STATE_LIST = "// Content definition";

    static final String CMT_CONTENT_STATE_LABEL_LIST = "// Labeling Priority Constraint Expressions";

    static final String CMT_CONTENT_STATE_PRIORITY_COMMENT_CONNECTOR = "Priority conditional expression";

    static final String CMT_CONTENT_MULTI_START = "/**";

    static final String CMT_CONTENT_MULTI_END = " */";

    static final String CMT_CONTENT_IMPLIES_METHOD1 = " * Contradiction verification of implication partial constraints";

    static final String CMT_CONTENT_IMPLIES_METHOD2 = " * %s == TRUE holds";

    static final String CMT_CONTENT_IMPLIES_METHOD3 = " * target name : ";

    static final String CMT_CONTENT_IMPLIES_METHOD4 = " * expression text : ";

    static final String CMT_NAME_CLOSE = "]";

    static final String CMT_NAME_OPEN = "[";

    static final String EX_NON = "non";

    static final String EX_STD = "std";

    static final String EX_MAX = "max";

    static final String EX_MIN = "min";

    static final String FUNC_ALLO_LIST = "createAlloList";

    static final String FUNC_ALLO_VIS_CONSTR = "createAlloVisConstrList";

    static final String FUNC_ALLO_VIS_CONSTR_LBL = "createAlloVisConstrLbl";

    static final String FUNC_AREA_LIST = "createAreaList";

    static final String FUNC_AREA_ZORDR_CONSTR = "createAreaZorderConstrList";

    static final String FUNC_AREA_ZORDR_CONSTR_LBL = "createAreaZorderConstrLbl";

    static final String FUNC_CST_LIST = "createContentList";

    static final String FUNC_CST_CONSTR = "createConstrList";

    static final String FUNC_CST_CONSTR_LBL = "createConstrLabelList";

    static final String EX_CTX_MK_EQ = "ctx.mkEq";

    static final String EX_CTX_MK_GT = "ctx.mkGt";

    static final String EX_CTX_MK_LT = "ctx.mkLt";

    static final String EX_CTX_MK_AND = "ctx.mkAnd";

    static final String EX_CTX_MK_ADD = "ctx.mkAdd";

    static final String EX_CTX_MK_INT = "ctx.mkInt";

    static final String EX_CTX_MK_OR = "ctx.mkOr";

    static final String EX_CTX_MK_XOR = "ctx.mkXor";

    static final String EX_CTX_MK_NOT = "ctx.mkNot";

    static final String EX_CTX_MK_IMPLIES = "ctx.mkImplies";

    static final String EX_CTX_MK_GE = "ctx.mkGe";

    static final String EX_CTX_MK_LE = "ctx.mkLe";

    static final String EX_CTX_MK_SELECT = "ctx.mkSelect";

    static final String EX_CTX_MK_STORE = "ctx.mkStore";

    static final String EX_CTX_MK_EXISTS = "ctx.mkExists";

    static final String EX_CTX_MK_FORALL = "ctx.mkForall";

    static final String EX_CTX_MK_SYMBOL = "ctx.mkSymbol";

    static final String EX_CTX_MK_ITE = "ctx.mkITE";

    static final String EX_CTX_MK_TRUE = "ctx.mkTrue()";

    static final String EX_CTX_MK_FALSE = "ctx.mkFalse()";

    static final String EX_INT_EXPR = "(IntExpr) ";

    static final String EX_BOOL_EXPR = "(BoolExpr) ";

    static final String EX_ARITH_EXPR = "(ArithExpr)  ";

    static final String EX_ARRAY_EXPR_CATS = "(ArrayExpr) ";

    static final String EX_CTX_MK_BOOL_CONST = "ctx.mkBoolConst";

    static final String EX_CTX_MK_INT_CONST = "ctx.mkIntConst";

    static final String EX_CTX_MK_ARRAY_CONST = "ctx.mkArrayConst";

    static final String AREA_LIST_NAME = "areaList";

    static final String CONSTR_LIST_NAME = "constrList";

    static final String CONSTR_LABEL_LIST_NAME = "constrLabelList";

    static final String CONTENT_LIST_NAME = "contentList";

    static final String CONTENT_LIST_ADD = "contentList.add";

    static final String CONSTR_LIST_ADD = "constrList.add";

    static final String AREA_LIST_ADD = "areaList.add";

    static final String CONSTR_LABEL_LIST_ADD = "constrLabelList.add";

    static final String VISIBILITY = " Visibility : ";

    static final String ZORDER = " Zorder : ";

    static final String GET = ".get";

    static final String CONST_ADDED_VALUE = "10";

    static final String STR_QUOTE = "\"";

    static final String _4SPACES = "    ";

    static final String _8SPACES = "        ";

    static final String OPEN = "(";

    static final String CLOSE = ")";

    static final String NAME_SEPARATOR = "_";

    static final String COMMA = ", ";

    static final String DOT = ".";

    static final String NULL_STRING = "null";

    static final String SL_COMMENT = "//";

    static final String NL = "\r\n";

    static final String END = ";";

    static final String NUMBER = "#";

    static final String NUMBER_ZERO = "#0:";

    static final String VARIABLE_CMT = "// Variable ";

    static final String VARIABLE_DEFINE = "Expr[] %s = new Expr[1];";

    static final String VARIABLE_VAR_NAME = "variable_";

    static final String AREASET_VAR_NAME = "areaSet_";

    static final String ZONESET_VAR_NAME = "zoneSet_";

    static final String VIEW_CONTENTSET_VAR_NAME = "vcontentSet_";

    static final String SOUND_CONTENTSET_VAR_NAME = "scontentSet_";

    static final String SETOF_OP_VAR_NAME = "setOfOperator_";

    static final String ARRAY_TOP = "[0]";

    static final String SET_VARIABLE_VALUE = " = ctx.mkConst(ctx.mkSymbol(\"%s\"), ctx.getIntSort());";

    static final String OP_IS_DISPLAYED = "isDisplayed";

    static final String OP_DISPLAYING_CONTENT = "displayingContent";

    static final String OP_ALLOCATED_CONTENT = "allocatedContent";

    static final String OP_CONTENTS_LIST = "contentsList";

    static final String OP_IS_HIDDEN = "isHidden";

    static final String OP_IS_ACTIVE = "isActive";

    static final String OP_IS_VISIBLE = "isVisible";

    static final String OP_ALLOCATABLE = "allocatable";

    static final String OP_CONTENT_VALUE = "contentValue";

    static final String OP_PRE_IS_DISPLAYED = "preIsDisplayed";

    static final String OP_PRE_DISPLAYING_CONTENT = "preDisplayingContent";

    static final String OP_PRE_ALLOCATED_CONTENT = "preAllocatedContent";

    static final String OP_PRE_CONTENTS_LIST = "preContentsList";

    static final String OP_PRE_IS_HIDDEN = "preIsHidden";

    static final String OP_PRE_IS_ACTIVE = "preIsActive";

    static final String OP_PRE_IS_VISIBLE = "preIsVisible";

    static final String OP_PRE_ALLOCATABLE = "preAllocatable";

    static final String OP_PRE_CONTENT_VALUE = "preContentValue";

    static final String OP_IS_MUTED = "isMuted";

    static final String OP_PRE_IS_MUTED = "preIsMuted";

    static final String OP_IS_ATTENUATED = "isAttenuated";

    static final String OP_PRE_IS_ATTENUATED = "preIsAttenuated";

    static final String OP_IS_SOUNDING = "isSounding";

    static final String OP_PRE_IS_SOUNDING = "preIsSounding";

    static final String OP_OUTPUTTING_SOUND = "outputtingSound";

    static final String OP_PRE_OUTPUTTING_SOUND = "preOutputtingSound";

    static final String OP_IS_OUTPUTTED = "isOutputted";

    static final String OP_PRE_IS_OUTPUTTED = "preIsOutputted";

    static final String OP_GET_PROPERTY = "getProperty";

    static final String OP_PRE_GET_PROPERTY = "preGetProperty";

    static final String OP_IS_ON = "isOn";

    static final String OP_PRE_IS_ON = "preIsOn";

    static final String OP_IS_DEFEATED_BY = "isDefeatedBy";

    static final String OP_PRE_IS_DEFEATED_BY = "preIsDefeatedBy\"";

    static final String OP_DEFEATS = "defeats";

    static final String OP_PRE_DEFEATS = "preDefeats";

    static final String OP_IS_DISAPPEARED = "isDisappeared";

    static final String OP_PRE_IS_DISAPPEARED = "preIsDisappeared";

    static final String OP_IS_CANCELED = "isCanceled";

    static final String OP_PRE_IS_CANCELED = "preIsCanceled";

    static final String OP_HAS_BEEN_DISPLAYED = "hasBeenDisplayed";

    static final String OP_PRE_HAS_BEEN_DISPLAYED = "preHasBeenDisplayed";

    static final String OP_HAS_COME_EARLIER_THAN = "hasComeEarlierThan";

    static final String OP_HAS_COME_LATER_THAN = "hasComeLaterThan";

    static final String OP_ACTIVE_CONTENTS = "activeContents";

    static final String OP_PRE_ACTIVE_CONTENTS = "preActiveContents";

    static final String EMP_ARRAY_CONST = "empArrayConst";

    static final String ALL_AREA_CONST = "allInstanceOfAreaConst";

    static final String ALL_ZONE_CONST = "allInstanceOfZoneConst";

    static final String ALL_SOUNDCONTENT_CONST = "allInstanceOfSoundContentConst";

    static final String ALL_VIEWCONTENT_CONST = "allInstanceOfViewContentConst";

    static final String ALLOCATABLE_SIZE = "allocatableSize";

    static final String CONTENT_SIZE = "contentSize";

    static final String ARRAY_EXPR_SORT = "ArrayExpr ";

    static final String CONSTRAINT_PREFIX = "Constraint:";

    static final String EQUAL = " = ";

    static final String INT_TYPE = "int_type";

    static final String BOOL_TYPE = "bool_type";

    static final String IMPLIES_CONSTRAINT_METHOD_NAME = "doCalculateImpliesConstraint_%s()";

    static final String IMPLIES_CONSTRAINT_METHOD = "private List<String> %s {";

    static final String IMPLIES_CONSTRAINT_METHOD_DETAIL1 = "List<String> constraint_%s" + EQUAL;

    static final String IMPLIES_CONSTRAINT_METHOD_DETAIL2 = "if(!constraint_%s.isEmpty() && !constraint_%s.get(0).equals(\"SAT\")) {";

    static final String IMPLIES_CONSTRAINT_METHOD_DETAIL3 = "map.put(\"#%s:%s\", constraint_%s)";

    static final String IMPLIES_CONSTRAINT_METHOD_DETAIL4 = "if(constraint_%s.get(0).equals(\"UNSAT\")) {";

    static final String IMPLIES_CONSTRAINT_METHOD_DETAIL5 = "return map";

    static final String BLOCK_CLOSE = "}";

    static final String IF_OFFLINE = "if(!onlyOnline) {";

    static final String STORE_TEMPLATE = EX_CTX_MK_STORE + OPEN + "%s" + COMMA + EX_CTX_MK_INT + OPEN + "%s" + CLOSE + COMMA + EX_CTX_MK_TRUE + CLOSE;;
}
