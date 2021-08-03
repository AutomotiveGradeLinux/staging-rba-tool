package rba.tool.editor.generator.z3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;

import rba.core.Allocatable;
import rba.core.ComparisonAnd;
import rba.core.ComparisonOperator;
import rba.core.Content;
import rba.core.ContentState;
import rba.core.EqualToOperator;
import rba.core.Expression;
import rba.core.GreaterThanOperator;
import rba.core.IfStatement;
import rba.core.IntegerValue;
import rba.core.LowerThanOperator;
import rba.core.MaxValue;
import rba.core.MinValue;
import rba.core.MuchGreaterThanOperator;
import rba.core.NoneValue;
import rba.core.ObjectReference;
import rba.core.Operator;
import rba.core.PlusOperator;
import rba.core.RuleObject;
import rba.core.StandardValue;
import rba.core.ThatOfOperator;
import rba.core.ValueExpression;
import rba.tool.editor.util.RBAModelEditorToolUtil;
import rba.view.Area;

public class SortValueCodeGenerationSupporter implements GeneratorConstants {

    static final int LIST_LIMIT = 1000;

    static SortValueCodeTemplate template = new SortValueCodeTemplate();

    private List<Area> areaList;

    private List<Allocatable> allocatableList;

    private List<Content> contentList;

    private List<ContentState> contentStateList;

    public String generate(List<Content> contents, List<Allocatable> allocatables, List<Area> areas) {
        this.contentList = contents;
        this.allocatableList = allocatables;
        this.areaList = areas;
        this.contentStateList = new ArrayList<ContentState>();
        
        // for common
        StringBuilder method_code_Adding = new StringBuilder();

        // for calculateArea_zorder
        StringBuilder area_zorder_code = new StringBuilder();
        StringBuilder areaListZorder_Adding = new StringBuilder();
        StringBuilder zorder_comment = new StringBuilder();
        StringBuilder zorderConstrList_Adding = new StringBuilder();
        StringBuilder areaConstrLabelListZorder_Adding = new StringBuilder();
        StringBuilder calculateArea_zorder_Method = new StringBuilder();
        List<StringBuilder> calculateAreaZorderMethidList = new ArrayList<StringBuilder>();

        // for calculateAllocatable_visibility
        StringBuilder allocatable_visibility_code = new StringBuilder();
        StringBuilder allocatableList_Adding = new StringBuilder();
        StringBuilder visibility_comment = new StringBuilder();
        StringBuilder visibilityConstrList_Adding = new StringBuilder();
        StringBuilder allocatableConstrLabelList_Adding = new StringBuilder();
        List<StringBuilder> calculateAllocatableVisibilityMethidList = new ArrayList<StringBuilder>();

        // for calculateContentState_priority
        StringBuilder content_state_priority_code = new StringBuilder();
        List<StringBuilder> contentStateMethidList = new ArrayList<StringBuilder>();
        StringBuilder content_state_priority_method_code = new StringBuilder();

        area_zorder_code.append(_8SPACES + CMT_AREA_LIST + NL);
        allocatable_visibility_code.append(_8SPACES + CMT_AREA_LIST + NL);
        content_state_priority_code.append(_8SPACES + CMT_CONTENT_STATE_LIST + NL);

        /////////////////// Area/Zone Visibility Code Prepare @Start
        List<List<Allocatable>> limitedAlloList = new ArrayList<>();
        ListHelper.extract(allocatableList, LIST_LIMIT, _list -> {
            limitedAlloList.add(_list);
        });

        int visMethodNum = 0;
        for (List<Allocatable> _list : limitedAlloList) {
            method_code_Adding.append(getAllocatableVisibilityMethodString(_list, visMethodNum));
            allocatable_visibility_code.append(getAllocatableVisibilityMethodCallString(visMethodNum));
            visMethodNum++;
        }
        /////////////////// Area/Zone Visibility Code Prepare @End

        /////////////////// Area Zorder Code Prepare @Start
        List<List<Area>> limitedAreaList = new ArrayList<>();
        ListHelper.extract(areaList, LIST_LIMIT, _list -> {
            limitedAreaList.add(_list);
        });

        int zoMethodNum = 0;
        for (List<Area> _list : limitedAreaList) {
            method_code_Adding.append(getAreaZorderMethodString(_list, zoMethodNum));
            area_zorder_code.append(getAreaZorderMethodCallString(zoMethodNum));
            zoMethodNum++;
        }
        /////////////////// Area Zorder Code Prepare @End
        
        /////////////////// Content State Priority Code Prepare @Start
        for (int i = 0; i < contentList.size(); i++) {
            Content content = contentList.get(i);
            for (ContentState cState : content.getStates()) {
                contentStateList.add(cState);
            }
        }
        List<List<ContentState>> limitedContentList = new ArrayList<>();
        ListHelper.extract(contentStateList, LIST_LIMIT, _list -> {
            limitedContentList.add(_list);
        });

        int ctMethodNum = 0;
        for (List<ContentState> _list : limitedContentList) {
            method_code_Adding.append(getContentStateMethodString(_list, ctMethodNum));
            content_state_priority_code.append(getContentStateMethodCallString(ctMethodNum));
            ctMethodNum++;
        }
        

//        int num = 0;
//        StringBuilder content_state_priority_code_main = new StringBuilder();
//        for (int i = 0; i < contentStateList.size(); i += LIST_LIMIT) {
//            int toIdx = ((i + LIST_LIMIT) >= contentStateList.size() ? contentStateList.size() : (i + LIST_LIMIT));
//            StringBuilder contentStateMethod = getContentStateMethodString(contentStateList.subList(i, toIdx), num, content_state_priority_code_main);
//            contentStateMethidList.add(contentStateMethod);
//            num++;
//        }
//
//        content_state_priority_code.append(content_state_priority_code_main).append(NL);
//
//        for (int j = 0; j < num; j++) {
//            content_state_priority_code.append(_8SPACES + "createContentList" + j + "(contentList);" + NL);
//        }
//        for (int j = 0; j < num; j++) {
//            content_state_priority_code.append(_8SPACES + "createConstrList" + j + "(contentList, constrList);" + NL);
//        }
//        for (int j = 0; j < num; j++) {
//            content_state_priority_code.append(_8SPACES + "createConstrLabelList" + j + "(constrLabelList);" + NL);
//        }
//        for (StringBuilder method : contentStateMethidList) {
//            method_code_Adding.append(method);
//        }
//
        /////////////////// Content State Priority Code Prepare @End

        template.area_zorder_code = area_zorder_code.toString();
        template.area_visibility_code = allocatable_visibility_code.toString();
        template.content_state_priority_code = content_state_priority_code.toString();
        template.method_code = method_code_Adding.toString();
        
        // calculateAllocatableVisibilityMethidList
        return template.getCompleteCode();
    }

    private String getContextString(Expression expression, int index, String listName, Class<?> clazz, Expression eContainer) {
        String contextString = null;
        if (expression instanceof MinValue) {
            contextString = resolveExpression((MinValue) expression, index, listName, eContainer);
        } else if (expression instanceof MaxValue) {
            contextString = resolveExpression((MaxValue) expression, index, listName, eContainer);
        } else if (expression instanceof StandardValue) {
            contextString = resolveExpression((StandardValue) expression, index, listName, eContainer);
        } else if (expression instanceof NoneValue) {
            contextString = resolveExpression((NoneValue) expression, index, listName, eContainer);
        } else if (expression instanceof IntegerValue) {
            contextString = resolveExpression((IntegerValue) expression, index, listName, eContainer);
        } else if (expression instanceof EqualToOperator) {
            contextString = resolveExpression((EqualToOperator) expression, index, listName, clazz);
        } else if (expression instanceof GreaterThanOperator) {
            contextString = resolveExpression((GreaterThanOperator) expression, index, listName, clazz);
        } else if (expression instanceof MuchGreaterThanOperator) {
            contextString = resolveExpression((MuchGreaterThanOperator) expression, index, listName, clazz);
        } else if (expression instanceof LowerThanOperator) {
            contextString = resolveExpression((LowerThanOperator) expression, index, listName, clazz);
        } else if (expression instanceof ThatOfOperator) {
            contextString = resolveExpression((ThatOfOperator) expression, index, listName, clazz);
        } else if (expression instanceof PlusOperator) {
            contextString = resolveExpression((PlusOperator) expression, index, listName, clazz);
        } else if (expression instanceof ComparisonAnd) {
            contextString = resolveExpression((ComparisonAnd) expression, index, listName, clazz);
        } else if (expression instanceof ObjectReference) {
            contextString = resolveExpression((ObjectReference) expression, listName, clazz);
        } else {
            // TODO Specification not found
            System.out.println("Expected Expression type is not supported yet!");
        }
        return contextString;
    }

    private StringBuilder getAllocatableVisibilityMethodCallString(int num) {
        StringBuilder ret = new StringBuilder();
        ret.append(_8SPACES + FUNC_ALLO_LIST + num + OPEN + AREA_LIST_NAME + CLOSE + END + NL);
        ret.append(_8SPACES + FUNC_ALLO_VIS_CONSTR + num + OPEN + AREA_LIST_NAME + COMMA + CONSTR_LIST_NAME + CLOSE + END + NL);
        ret.append(_8SPACES + FUNC_ALLO_VIS_CONSTR_LBL + num + OPEN + CONSTR_LABEL_LIST_NAME + CLOSE + END + NL);
        return ret;
    }

    private StringBuilder getAllocatableVisibilityMethodString(List<Allocatable> allocatableLimitedList, int num) {
        StringBuilder createAlloVisListMethod = new StringBuilder();
        String createAlloVisListMethodName = FUNC_ALLO_LIST + num;
        StringBuilder createConstrListMethod = new StringBuilder();
        String createConstrListMethodName = FUNC_ALLO_VIS_CONSTR + num;
        StringBuilder createConstrLabelListMethod = new StringBuilder();
        String createConstrLabelListMethodName = FUNC_ALLO_VIS_CONSTR_LBL + num;

        createAlloVisListMethod.append(_4SPACES + "private void " + createAlloVisListMethodName + "(List<Expr> " + AREA_LIST_NAME + ") {" + NL);
        createConstrListMethod
                .append(_4SPACES + "private void " + createConstrListMethodName + "(List<Expr> " + AREA_LIST_NAME + ", List<BoolExpr> " + CONSTR_LIST_NAME + ") {" + NL);
        createConstrLabelListMethod.append(_4SPACES + "private void " + createConstrLabelListMethodName + "(List<BoolExpr> " + CONSTR_LABEL_LIST_NAME + ") {" + NL);

        int i = num * 1000;
        for (Allocatable allocatable : allocatableLimitedList) {
            /////////////////// Area List & Label List @Start
            createAlloVisListMethod.append(_8SPACES + AREA_LIST_ADD + OPEN + EX_CTX_MK_INT_CONST + OPEN + STR_QUOTE + allocatable.getName() + STR_QUOTE + CLOSE + CLOSE + END + NL);
            createConstrLabelListMethod
                    .append(_8SPACES + CONSTR_LABEL_LIST_ADD + OPEN + EX_CTX_MK_BOOL_CONST + OPEN + STR_QUOTE + allocatable.getName() + STR_QUOTE + CLOSE + CLOSE + END + NL);

            /////////////////// Area/Zone Visibility Code Prepare @Start
            createConstrListMethod.append(_8SPACES + SL_COMMENT + allocatable.getName() + VISIBILITY + RBAModelEditorToolUtil.getExpressionText(allocatable.getVisibility()) + NL);
            String visibilityContextString = getContextString(allocatable.getVisibility(), i, AREA_LIST_NAME, Allocatable.class, null);
            if (visibilityContextString != null) {
                createConstrListMethod.append(_8SPACES + CONSTR_LIST_ADD + OPEN + visibilityContextString + CLOSE + END + NL);
            }
            i++;
        }

        createAlloVisListMethod.append(_4SPACES + "}" + NL + NL);
        createConstrListMethod.append(_4SPACES + "}" + NL + NL);
        createConstrLabelListMethod.append(_4SPACES + "}" + NL + NL);

        StringBuilder ret = new StringBuilder();
        ret.append(createAlloVisListMethod);
        ret.append(createConstrListMethod);
        ret.append(createConstrLabelListMethod);

        return ret;
    }

    private StringBuilder getAreaZorderMethodCallString(int num) {
        StringBuilder ret = new StringBuilder();
        ret.append(_8SPACES + FUNC_AREA_LIST + num + OPEN + AREA_LIST_NAME + CLOSE + END + NL);
        ret.append(_8SPACES + FUNC_AREA_ZORDR_CONSTR + num + OPEN + AREA_LIST_NAME + COMMA + CONSTR_LIST_NAME + CLOSE + END + NL);
        ret.append(_8SPACES + FUNC_AREA_ZORDR_CONSTR_LBL + num + OPEN + CONSTR_LABEL_LIST_NAME + CLOSE + END + NL);
        return ret;
    }

    private StringBuilder getAreaZorderMethodString(List<Area> areaLimitedList, int num) {
        StringBuilder createAreaZodrListMethod = new StringBuilder();
        String createAreaZodrListMethodName = FUNC_AREA_LIST + num;
        StringBuilder createConstrListMethod = new StringBuilder();
        String createConstrListMethodName = FUNC_AREA_ZORDR_CONSTR + num;
        StringBuilder createConstrLabelListMethod = new StringBuilder();
        String createConstrLabelListMethodName = FUNC_AREA_ZORDR_CONSTR_LBL + num;

        createAreaZodrListMethod.append(_4SPACES + "private void " + createAreaZodrListMethodName + "(List<Expr> " + AREA_LIST_NAME + ") {" + NL);
        createConstrListMethod
                .append(_4SPACES + "private void " + createConstrListMethodName + "(List<Expr> " + AREA_LIST_NAME + ", List<BoolExpr> " + CONSTR_LIST_NAME + ") {" + NL);
        createConstrLabelListMethod.append(_4SPACES + "private void " + createConstrLabelListMethodName + "(List<BoolExpr> " + CONSTR_LABEL_LIST_NAME + ") {" + NL);

        int i = num * 1000;
        for (Area area : areaLimitedList) {
            /////////////////// Area List & Label List @Start
            createAreaZodrListMethod.append(_8SPACES + AREA_LIST_ADD + OPEN + EX_CTX_MK_INT_CONST + OPEN + STR_QUOTE + area.getName() + STR_QUOTE + CLOSE + CLOSE + END + NL);
            createConstrLabelListMethod
                    .append(_8SPACES + CONSTR_LABEL_LIST_ADD + OPEN + EX_CTX_MK_BOOL_CONST + OPEN + STR_QUOTE + area.getName() + STR_QUOTE + CLOSE + CLOSE + END + NL);

            /////////////////// Area Zorder Code Prepare @Start
            createConstrListMethod.append(_8SPACES + SL_COMMENT + area.getName() + ZORDER + RBAModelEditorToolUtil.getExpressionText(area.getZorder()) + NL);
            String zorderContextString = getContextString(area.getZorder(), i, AREA_LIST_NAME, Area.class, null);
            if (zorderContextString != null) {
                createConstrListMethod.append(_8SPACES + CONSTR_LIST_ADD + OPEN + zorderContextString + CLOSE + END + NL);
            }
            i++;
        }

        createAreaZodrListMethod.append(_4SPACES + "}" + NL + NL);
        createConstrListMethod.append(_4SPACES + "}" + NL + NL);
        createConstrLabelListMethod.append(_4SPACES + "}" + NL + NL);

        StringBuilder ret = new StringBuilder();
        ret.append(createAreaZodrListMethod);
        ret.append(createConstrListMethod);
        ret.append(createConstrLabelListMethod);

        return ret;
    }

    private StringBuilder getContentStateMethodCallString(int num) {
        StringBuilder ret = new StringBuilder();
        ret.append(_8SPACES + FUNC_CST_LIST + num + OPEN + CONTENT_LIST_NAME + CLOSE + END + NL);
        ret.append(_8SPACES + FUNC_CST_CONSTR + num + OPEN + CONTENT_LIST_NAME + COMMA + CONSTR_LIST_NAME + CLOSE + END + NL);
        ret.append(_8SPACES + FUNC_CST_CONSTR_LBL + num + OPEN + CONSTR_LABEL_LIST_NAME + CLOSE + END + NL);
        return ret;
    }

    private StringBuilder getContentStateMethodString(List<ContentState> contentStateLimitedList, int num) {
        StringBuilder createContentListMethod = new StringBuilder();
        String createContentListMethodName = "createContentList" + num;
        StringBuilder createConstrListMethod = new StringBuilder();
        String createConstrListMethodName = "createConstrList" + num;
        StringBuilder createConstrLabelListMethod = new StringBuilder();
        String createConstrLabelListMethodName = "createConstrLabelList" + num;

        createContentListMethod.append(_4SPACES + "private void " + createContentListMethodName + "(List<Expr> contentList) {" + NL);
        createConstrListMethod.append(_4SPACES + "private void " + createConstrListMethodName + "(List<Expr> contentList, List<BoolExpr> constrList) {" + NL);
        createConstrLabelListMethod.append(_4SPACES + "private void " + createConstrLabelListMethodName + "(List<BoolExpr> constrLabelList) {" + NL);

        int i = num * 1000;
        for (ContentState contentState: contentStateLimitedList) {
            Content content = (Content) contentState.eContainer();
            String content_cState_Name = content.getName() + NAME_SEPARATOR + contentState.getName();

            /////////////////// ContentState List & Label List @Start
            createContentListMethod.append(_8SPACES + CONTENT_LIST_ADD + OPEN + EX_CTX_MK_INT_CONST + OPEN + STR_QUOTE + content_cState_Name + STR_QUOTE + CLOSE + CLOSE + END + NL);
            createConstrLabelListMethod.append(_8SPACES + CONSTR_LABEL_LIST_ADD + OPEN + EX_CTX_MK_BOOL_CONST + OPEN + STR_QUOTE + content_cState_Name + STR_QUOTE + CLOSE + CLOSE + END + NL);

            /////////////////// ContentState Code Prepare @Start
            createConstrListMethod.append(_8SPACES + SL_COMMENT + content_cState_Name + CMT_CONTENT_STATE_PRIORITY_COMMENT_CONNECTOR + CMT_NAME_OPEN + contentState.getValue().getExpression()
                    + CMT_NAME_CLOSE + NL);
            String contentContextString = getContextString(contentState.getValue(), i, CONTENT_LIST_NAME, Content.class, null);
            if (contentContextString != null) {
                createConstrListMethod.append(_8SPACES + CONSTR_LIST_ADD + OPEN + contentContextString + CLOSE + END + NL);
            }
            i++;
        }

        createContentListMethod.append(_4SPACES + "}" + NL);
        createConstrListMethod.append(_4SPACES + "}" + NL);
        createConstrLabelListMethod.append(_4SPACES + "}" + NL);

        StringBuilder ret = new StringBuilder();
        ret.append(createContentListMethod);
        ret.append(createConstrListMethod);
        ret.append(createConstrLabelListMethod);

        return ret;
    }

    private String resolveExpression(MinValue expression, int index, String listName, Expression eContainer) {
        if ((eContainer instanceof ComparisonOperator && !(eContainer instanceof ComparisonAnd)) || eContainer instanceof PlusOperator) {
            return EX_MIN;
        }
        return EX_CTX_MK_EQ + OPEN + EX_INT_EXPR + getListString(listName, index) + COMMA + EX_MIN + CLOSE;
    }

    private String resolveExpression(MaxValue expression, int index, String listName, Expression eContainer) {
        if ((eContainer instanceof ComparisonOperator && !(eContainer instanceof ComparisonAnd)) || eContainer instanceof PlusOperator) {
            return EX_MAX;
        }
        return EX_CTX_MK_EQ + OPEN + EX_INT_EXPR + getListString(listName, index) + COMMA + EX_MAX + CLOSE;
    }

    private String resolveExpression(StandardValue expression, int index, String listName, Expression eContainer) {
        if ((eContainer instanceof ComparisonOperator && !(eContainer instanceof ComparisonAnd)) || eContainer instanceof PlusOperator) {
            return EX_STD;
        }
        return EX_CTX_MK_EQ + OPEN + EX_INT_EXPR + getListString(listName, index) + COMMA + EX_STD + CLOSE;
    }

    private String resolveExpression(NoneValue expression, int index, String listName, Expression eContainer) {
        if ((eContainer instanceof ComparisonOperator && !(eContainer instanceof ComparisonAnd)) || eContainer instanceof PlusOperator) {
            return EX_NON;
        }
        return EX_CTX_MK_EQ + OPEN + EX_INT_EXPR + getListString(listName, index) + COMMA + EX_NON + CLOSE;
    }

    private String resolveExpression(IntegerValue expression, int index, String listName, Expression eContainer) {
        String context = null;
        if ((eContainer instanceof ComparisonOperator && !(eContainer instanceof ComparisonAnd)) || eContainer instanceof PlusOperator) {
            context = EX_INT_EXPR + EX_CTX_MK_INT + OPEN + ((IntegerValue) expression).getValue() + CLOSE;
        } else if (eContainer == null) {
            // TODO may be mismatch with specification. need confirmation
            context = EX_CTX_MK_EQ + OPEN + EX_INT_EXPR + getListString(listName, index) + COMMA + EX_INT_EXPR + EX_CTX_MK_INT + OPEN + ((IntegerValue) expression).getValue()
                    + CLOSE + CLOSE;
        } else {
            // TODO may be new feature that was not specified yet for SortValueGeneration
            System.out.println("Not supported yet.");
        }
        return context;
    }

    private String resolveExpression(EqualToOperator expression, int index, String listName, Class<?> clazz) {
        EList<Expression> operand = ((EqualToOperator) expression).getOperand();
        String context = null;
        if (operand.get(0) instanceof Operator) {
            context = getContextString(operand.get(0), index, listName, clazz, expression);
        } else if (operand.get(0) instanceof ObjectReference) {
            context = resolveExpression((ObjectReference) operand.get(0), listName, clazz);
        } else if (operand.get(0) instanceof ValueExpression) {
            // TODO To confirm, specification not found
            context = getContextString(operand.get(0), index, listName, clazz, expression);
        } else if (operand.get(0) instanceof IfStatement) {
            // TODO To confirm, specification not found
            System.out.println("Not supported yet");
        }
        context = (context == null) ? null : EX_CTX_MK_EQ + OPEN + EX_INT_EXPR + getListString(listName, index) + COMMA + context + CLOSE;
        return context;
    }

    private String resolveExpression(GreaterThanOperator expression, int index, String listName, Class<?> clazz) {
        EList<Expression> operand = ((GreaterThanOperator) expression).getOperand();
        String context = null;
        if (operand.get(0) instanceof Operator) {
            context = getContextString(operand.get(0), index, listName, clazz, expression);
        } else if (operand.get(0) instanceof ObjectReference) {
            context = resolveExpression((ObjectReference) operand.get(0), listName, clazz);
        } else if (operand.get(0) instanceof ValueExpression) {
            // TODO To confirm, specification not found
            context = getContextString(operand.get(0), index, listName, clazz, expression);
        } else if (operand.get(0) instanceof IfStatement) {
            // TODO To confirm, specification not found
        }
        context = (context == null) ? null : EX_CTX_MK_GT + OPEN + EX_INT_EXPR + getListString(listName, index) + COMMA + context + CLOSE;
        return context;
    }

    private String resolveExpression(MuchGreaterThanOperator expression, int index, String listName, Class<?> clazz) {
        EList<Expression> operand = ((MuchGreaterThanOperator) expression).getOperand();
        String context = null;
        if (operand.get(0) instanceof Operator) {
            context = getContextString(operand.get(0), index, listName, clazz, expression);
        } else if (operand.get(0) instanceof ObjectReference) {
            context = resolveExpression((ObjectReference) operand.get(0), listName, clazz);
        } else if (operand.get(0) instanceof ValueExpression) {
            // TODO To confirm, specification not found
            context = getContextString(operand.get(0), index, listName, clazz, expression);
        } else if (operand.get(0) instanceof IfStatement) {
            // TODO To confirm, specification not found
        }
        context = (context == null) ? null
                : EX_CTX_MK_GT + OPEN + EX_INT_EXPR + getListString(listName, index) + COMMA + EX_INT_EXPR + EX_CTX_MK_ADD + OPEN + context + COMMA + EX_CTX_MK_INT + OPEN
                        + CONST_ADDED_VALUE + CLOSE + CLOSE + CLOSE;
        return context;
    }

    private String resolveExpression(LowerThanOperator expression, int index, String listName, Class<?> clazz) {
        EList<Expression> operand = ((LowerThanOperator) expression).getOperand();
        String context = null;
        if (operand.get(0) instanceof Operator) {
            context = getContextString(operand.get(0), index, listName, clazz, expression);
        } else if (operand.get(0) instanceof ObjectReference) {
            context = resolveExpression((ObjectReference) operand.get(0), listName, clazz);
        } else if (operand.get(0) instanceof ValueExpression) {
            // TODO To confirm, specification not found
            context = getContextString(operand.get(0), index, listName, clazz, expression);
        } else if (operand.get(0) instanceof IfStatement) {
            // TODO To confirm, specification not found
        }
        context = (context == null) ? null : EX_CTX_MK_LT + OPEN + EX_INT_EXPR + getListString(listName, index) + COMMA + context + CLOSE;
        return context;
    }

    private String resolveExpression(ThatOfOperator expression, int index, String listName, Class<?> clazz) {
        EList<Expression> operand = ((ThatOfOperator) expression).getOperand();
        if (operand.get(0) instanceof ObjectReference) {
            if (expression.eContainer() instanceof RuleObject) { // Area, Content
                return EX_CTX_MK_EQ + OPEN + EX_INT_EXPR + getListString(listName, index) + COMMA + resolveExpression((ObjectReference) operand.get(0), listName, clazz) + CLOSE;
            } else {
                return resolveExpression((ObjectReference) operand.get(0), listName, clazz);
            }
        }
        return null;
    }

    private String resolveExpression(ObjectReference expression, String listName, Class<?> clazz) {
        if ((clazz == Allocatable.class && expression.getRefObject() instanceof Allocatable)) {
            return EX_INT_EXPR + getListString(listName, allocatableList.indexOf(expression.getRefObject()));
        } else if ((clazz == Area.class && expression.getRefObject() instanceof Area)) {
            return EX_INT_EXPR + getListString(listName, areaList.indexOf(expression.getRefObject()));
        } else if ((clazz == Content.class && expression.getRefObject() instanceof ContentState)) {
            return EX_INT_EXPR + getListString(listName, contentStateList.indexOf(expression.getRefObject()));
        }
        return null;
    }

    private String resolveExpression(PlusOperator expression, int index, String listName, Class<?> clazz) {
        EList<Expression> operand = ((PlusOperator) expression).getOperand();
        StringBuilder builder = new StringBuilder();
        StringBuilder context = new StringBuilder();
        String operandContext = null;

        for (int i = 0; i < operand.size(); i++) {
            if (i != 0) {
                builder.append(EX_CTX_MK_ADD);
                builder.append(OPEN);
                context.append(COMMA);
                if ((operandContext = getContextString(operand.get(i), index, listName, clazz, expression)) == null) {
                    return null;
                }
                context.append(operandContext);
                context.append(CLOSE);
            } else {
                if ((operandContext = getContextString(operand.get(i), index, listName, clazz, expression)) == null) {
                    return null;
                }
                context.append(operandContext);
            }
        }
        builder.append(context);
        if (expression.eContainer() instanceof RuleObject) { // Area, Content
            return EX_CTX_MK_EQ + OPEN + EX_INT_EXPR + getListString(listName, index) + COMMA + builder.toString() + CLOSE;
        } else {
            return builder.toString();
        }
    }

    private String resolveExpression(ComparisonAnd expression, int index, String listName, Class<?> clazz) {
        EList<Expression> operand = ((ComparisonAnd) expression).getOperand();
        if (operand.size() >= 2) {
            StringBuilder beginContext = new StringBuilder();
            StringBuilder endContext = new StringBuilder();
            for (int i = 0; i < operand.size(); i++) {
                String context = getContextString(operand.get(i), index, listName, clazz, null);
                if (i == 0) {
                    beginContext.append(EX_CTX_MK_AND + OPEN);
                    endContext.append(context);
                } else if (i == operand.size() - 1) {
                    endContext.append(COMMA).append(" ") // Include space or not, it is ok
                            .append(context).append(CLOSE);
                } else {
                    beginContext.append(EX_CTX_MK_AND + OPEN);
                    endContext.append(COMMA).append(" ") // Include space or not, it is ok
                            .append(context).append(CLOSE);
                }
            }
            return beginContext.toString() + endContext.toString();
        }
        return null; // It may be rba model problem.
    }

    private String getListString(String listName, int index) {
        return listName + GET + OPEN + index + CLOSE;
    }

    private interface ListHelper<T> extends Iterable<T> {

        public static <T> void extract(List<T> list, int size, Consumer<? super List<T>> bulkList) {
            for (int i = 0; i < list.size(); i += size) {
                List<T> _list = new ArrayList<>(list.subList(i, Integer.min(i + size, list.size())));
                bulkList.accept(_list);
            }
        }
    }
}
