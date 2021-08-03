package rba.tool.editor.generator.z3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import rba.core.AbstractAllocatable;
import rba.core.AbstractConstraint;
import rba.core.AbstractContent;
import rba.core.ActiveContents;
import rba.core.Allocatable;
import rba.core.AllocatableSet;
import rba.core.AllocatedContent;
import rba.core.AndOperator;
import rba.core.ComplexExpression;
import rba.core.Constraint;
import rba.core.Content;
import rba.core.ContentSet;
import rba.core.ContentValue;
import rba.core.ExistsOperator;
import rba.core.Expression;
import rba.core.ExpressionType;
import rba.core.ForAllOperator;
import rba.core.GetAllocatables;
import rba.core.GetContentsList;
import rba.core.GetProperty;
import rba.core.HasBeenDisplayed;
import rba.core.HasComeEarlierThan;
import rba.core.HasComeLaterThan;
import rba.core.IfStatement;
import rba.core.ImpliesOperator;
import rba.core.IntegerProperty;
import rba.core.IntegerValue;
import rba.core.IsActive;
import rba.core.IsCanceled;
import rba.core.IsDisappeared;
import rba.core.IsEqualToOperator;
import rba.core.IsGreaterThanEqualOperator;
import rba.core.IsGreaterThanOperator;
import rba.core.IsLowerThanEqualOperator;
import rba.core.IsLowerThanOperator;
import rba.core.IsOn;
import rba.core.LambdaContext;
import rba.core.LambdaExpression;
import rba.core.NotOperator;
import rba.core.ObjectCompare;
import rba.core.ObjectReference;
import rba.core.OrOperator;
import rba.core.PreviousModifier;
import rba.core.RuleObject;
import rba.core.Scene;
import rba.core.SetOfOperator;
import rba.core.SugarExpression;
import rba.core.Variable;
import rba.sound.AllInstanceOfSoundContent;
import rba.sound.AllInstanceOfZone;
import rba.sound.IsAttenuated;
import rba.sound.IsMuted;
import rba.sound.IsOutputted;
import rba.sound.IsSounding;
import rba.sound.OutputtingSound;
import rba.sound.SoundContent;
import rba.sound.SoundContentSet;
import rba.sound.Zone;
import rba.sound.ZoneSet;
import rba.view.AllInstanceOfArea;
import rba.view.AllInstanceOfViewContent;
import rba.view.Area;
import rba.view.AreaSet;
import rba.view.DisplayingContent;
import rba.view.IsDisplayed;
import rba.view.IsHidden;
import rba.view.IsVisible;
import rba.view.ViewContent;
import rba.view.ViewContentSet;

public class ConstraintCodeGenerationSupporter implements GeneratorConstants {

    static ConstraintCodeTemplate template = new ConstraintCodeTemplate();

    private List<Allocatable> allocatableList = new ArrayList<Allocatable>();

    private int areaListEndIndex;

    private List<Content> contentList = new ArrayList<Content>();

    private int viewContentListEndIndex;

    private int soundContentListEndIndex;

    private List<ContentSet> contentSetList = new ArrayList<ContentSet>();

    private int viewContentSetListEndIndex;

    private List<AllocatableSet> allocatableSetList = new ArrayList<AllocatableSet>();

    private int areaSetListEndIndex;

    private List<Variable> variableList;

    private List<Constraint> constraintList;

    private List<Scene> sceneList;

    private List<SetOfOperator> setOfOpeList;

    private Map<Variable, String> variableNameMap = new HashMap<Variable, String>();

    private Map<AllocatableSet, String> allocatableSetNameMap = new HashMap<AllocatableSet, String>();

    private Map<ContentSet, String> contentSetNameMap = new HashMap<ContentSet, String>();

    private Map<String, String> SetOfNameMap = new HashMap<String, String>();

    private List<ImpliseConstraintInfo> impliseMethodList = new ArrayList<ImpliseConstraintInfo>();

    private List<ImpliseConstraintInfo> postImpliseMethodList = new ArrayList<ImpliseConstraintInfo>();

    public String generate(List<ViewContent> viewContentList, List<SoundContent> soundContentList, List<Area> areaList, List<Zone> zoneList,
            List<ViewContentSet> viewContentSetList, List<SoundContentSet> soundContentSetList, List<AreaSet> areaSetList, List<ZoneSet> zoneSetList, List<Variable> variables,
            List<Constraint> constraints, List<Scene> scenes, List<SetOfOperator> setOfOperators) {
        this.variableList = variables;
        this.constraintList = constraints;
        this.sceneList = scenes;
        this.setOfOpeList = setOfOperators;

        variableNameMap.clear();
        allocatableSetNameMap.clear();
        contentSetNameMap.clear();
        SetOfNameMap.clear();
        impliseMethodList.clear();
        postImpliseMethodList.clear();

        allocatableList.clear();
        contentList.clear();
        allocatableSetList.clear();
        contentSetList.clear();

        areaListEndIndex = areaList.size();
        allocatableList.addAll(areaList);
        allocatableList.addAll(zoneList);

        viewContentListEndIndex = viewContentList.size();
        soundContentListEndIndex = viewContentListEndIndex + soundContentList.size();
        contentList.addAll(viewContentList);
        contentList.addAll(soundContentList);

        areaSetListEndIndex = areaSetList.size();
        allocatableSetList.addAll(areaSetList);
        allocatableSetList.addAll(zoneSetList);

        viewContentSetListEndIndex = viewContentSetList.size();
        contentSetList.addAll(viewContentSetList);
        contentSetList.addAll(soundContentSetList);

        StringBuilder setupList_Adding = new StringBuilder();
        StringBuilder init_Adding = new StringBuilder();
        StringBuilder fieldVariableAdding = new StringBuilder();
        StringBuilder allocatable_content_sizeAdding = new StringBuilder();

        StringBuilder constraintList_Adding = new StringBuilder();
        StringBuilder impliesConstraintMethodList_Adding = new StringBuilder();
        StringBuilder impliesConstraintMethodCallList_Adding = new StringBuilder();

        setAllocatableContext(allocatableList.subList(0, areaListEndIndex), init_Adding, "Area");
        setAllocatableContext(allocatableList.subList(areaListEndIndex, allocatableList.size()), init_Adding, "Zone");
        setContetContext(contentList.subList(0, viewContentListEndIndex), init_Adding, "ViewContent");
        setContetContext(contentList.subList(viewContentListEndIndex, soundContentListEndIndex), init_Adding, "SoundContent");

        setAllocatableSetContext(AREASET_VAR_NAME, allocatableSetList.subList(0, areaSetListEndIndex), init_Adding, fieldVariableAdding, setupList_Adding);
        setAllocatableSetContext(ZONESET_VAR_NAME, allocatableSetList.subList(areaSetListEndIndex, allocatableSetList.size()), init_Adding, fieldVariableAdding, setupList_Adding);
        setContentSetContext(VIEW_CONTENTSET_VAR_NAME, contentSetList.subList(0, viewContentSetListEndIndex), init_Adding, fieldVariableAdding, setupList_Adding);
        setContentSetContext(SOUND_CONTENTSET_VAR_NAME, contentSetList.subList(viewContentSetListEndIndex, contentSetList.size()), init_Adding, fieldVariableAdding,
                setupList_Adding);

        allocatable_content_sizeAdding.append(_8SPACES + "allocatableSize = ctx.mkInt(" + allocatableList.size() + ");" + NL);
        allocatable_content_sizeAdding.append(_8SPACES + "contentSize = ctx.mkInt(" + contentList.size() + ");");

        for (int i = 0; i < variableList.size(); i++) {
            Variable variable = variableList.get(i);
            String varName = VARIABLE_VAR_NAME + (i + 1);
            String define = String.format(VARIABLE_DEFINE, varName);

            constraintList_Adding.append(_8SPACES + VARIABLE_CMT + variable.getName() + NL);
            constraintList_Adding.append(_8SPACES + define + NL);
            constraintList_Adding.append(_8SPACES + varName + ARRAY_TOP + String.format(SET_VARIABLE_VALUE, variable.getName()) + NL);

            variableNameMap.put(variable, varName);
        }

        for (int i = 0; i < setOfOpeList.size(); i++) {
            SetOfOperator setOfOp = setOfOpeList.get(i);

            String varName = SETOF_OP_VAR_NAME + (i + 1);
            String expressionText = setOfOp.getExpressionText();
            String string = SetOfNameMap.get(expressionText);
            if (string != null) {
                continue;
            }
            SetOfNameMap.put(expressionText, varName);

            String label = STR_QUOTE + CONSTRAINT_PREFIX + varName + STR_QUOTE;
            String storeStr = getStoreExpr(setOfOp);

            fieldVariableAdding.append(_4SPACES + ARRAY_EXPR_SORT + varName + END + NL);

            setupList_Adding
                    .append(_8SPACES + varName + EQUAL + EX_CTX_MK_ARRAY_CONST + OPEN + STR_QUOTE + varName + STR_QUOTE + COMMA + INT_TYPE + COMMA + BOOL_TYPE + CLOSE + END + NL);

            init_Adding.append(_8SPACES + SL_COMMENT + varName + EQUAL + expressionText + NL);
            init_Adding.append(_8SPACES + CONSTR_LIST_ADD + OPEN + EX_CTX_MK_EQ + OPEN + varName + COMMA + storeStr + CLOSE + CLOSE + END + NL);
            init_Adding.append(_8SPACES + CONSTR_LABEL_LIST_ADD + OPEN + EX_CTX_MK_BOOL_CONST + OPEN + label + CLOSE + CLOSE + END + NL);
        }

        constraintList_Adding.append(NL);

        for (int i = 0; i < constraintList.size(); i++) {
            Constraint constraint = constraintList.get(i);
            if (constraint.getExpression() == null) {
                continue;
            }

            setConstraintList(constraintList_Adding, impliesConstraintMethodList_Adding, constraint, constraint.isRuntime(), i);
        }

        for (ImpliseConstraintInfo info : impliseMethodList) {
            setImpliesConstraintMethod(impliesConstraintMethodCallList_Adding, info);
        }

        String invarianceConstraintStr = getInvarianceConstraintStr(false);
        String invariancePreConstraintStr = getInvarianceConstraintStr(true);

        template.allocatable_content_set_code = fieldVariableAdding.toString();
        template.allocatable_content_size_code = allocatable_content_sizeAdding.toString();
        template.setup_code = setupList_Adding.toString();
        template.init_code = init_Adding.toString();
        template.constraints_code = constraintList_Adding.toString();
        template.implies_constraints_call_code = impliesConstraintMethodCallList_Adding.toString();
        template.implies_constraints_method_code = impliesConstraintMethodList_Adding.toString();
        template.invariance_constr_code = invarianceConstraintStr;
        template.invariance_pre_constr_code = invariancePreConstraintStr;

        return template.getCompleteCode();
    }

    private void setAllocatableContext(List<Allocatable> list, StringBuilder init_Adding, String elementId) {
        if (list.isEmpty()) {
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            Allocatable area = list.get(i);

            String contents = getContents(area);
            String storeStr = getStoreExpr(area);

            int index = allocatableList.indexOf(area);

            init_Adding.append(_8SPACES + SL_COMMENT + area.getName() + " = { " + contents + " }" + NL);

            String selectLeft = EX_CTX_MK_SELECT + OPEN + OP_CONTENTS_LIST + COMMA + EX_CTX_MK_INT + OPEN + (index + 1) + CLOSE + CLOSE;
            init_Adding.append(_8SPACES + CONSTR_LIST_ADD + OPEN + EX_CTX_MK_EQ + OPEN + selectLeft + COMMA + storeStr + CLOSE + CLOSE + END + NL);
            String labelContentList = STR_QUOTE + CONSTRAINT_PREFIX + area.getName() + DOT + OP_CONTENTS_LIST + STR_QUOTE;
            init_Adding.append(_8SPACES + CONSTR_LABEL_LIST_ADD + OPEN + EX_CTX_MK_BOOL_CONST + OPEN + labelContentList + CLOSE + CLOSE + END + NL);
        }
        init_Adding.append(NL);
    }

    private void setContetContext(List<Content> list, StringBuilder init_Adding, String elementId) {
        if (list.isEmpty()) {
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);

            String allocatable = getAllocatables(content);
            String storeStr = getStoreExpr(content);

            int index = contentList.indexOf(content);

            init_Adding.append(_8SPACES + SL_COMMENT + content.getName() + " = { " + allocatable + " }" + NL);

            String selectLeft = EX_CTX_MK_SELECT + OPEN + OP_ALLOCATABLE + COMMA + EX_CTX_MK_INT + OPEN + (index + 1) + CLOSE + CLOSE;
            init_Adding.append(_8SPACES + CONSTR_LIST_ADD + OPEN + EX_CTX_MK_EQ + OPEN + selectLeft + COMMA + storeStr + CLOSE + CLOSE + END + NL);
            String labelContentList = STR_QUOTE + CONSTRAINT_PREFIX + content.getName() + DOT + OP_ALLOCATABLE + STR_QUOTE;
            init_Adding.append(_8SPACES + CONSTR_LABEL_LIST_ADD + OPEN + EX_CTX_MK_BOOL_CONST + OPEN + labelContentList + CLOSE + CLOSE + END + NL);
        }
        init_Adding.append(NL);
    }

    private void setAllocatableSetContext(String name, List<AllocatableSet> list, StringBuilder init_Adding, StringBuilder fieldVariableAdding, StringBuilder setupList_Adding) {
        if (list.isEmpty()) {
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            AllocatableSet set = list.get(i);
            String varName = name + (i + 1);
            String label = STR_QUOTE + CONSTRAINT_PREFIX + set.getName() + STR_QUOTE;
            String areas = getAreas(set);
            String storeStr = getStoreExpr(set);

            fieldVariableAdding.append(_4SPACES + ARRAY_EXPR_SORT + varName + END + NL);

            setupList_Adding
                    .append(_8SPACES + varName + EQUAL + EX_CTX_MK_ARRAY_CONST + OPEN + STR_QUOTE + varName + STR_QUOTE + COMMA + INT_TYPE + COMMA + BOOL_TYPE + CLOSE + END + NL);

            init_Adding.append(_8SPACES + SL_COMMENT + set.getName() + " = { " + areas + " }" + NL);
            init_Adding.append(_8SPACES + CONSTR_LIST_ADD + OPEN + EX_CTX_MK_EQ + OPEN + varName + COMMA + storeStr + CLOSE + CLOSE + END + NL);
            init_Adding.append(_8SPACES + CONSTR_LABEL_LIST_ADD + OPEN + EX_CTX_MK_BOOL_CONST + OPEN + label + CLOSE + CLOSE + END + NL);

            allocatableSetNameMap.put(set, varName);
        }
        setupList_Adding.append(NL);
        init_Adding.append(NL);
    }

    private void setContentSetContext(String name, List<ContentSet> list, StringBuilder init_Adding, StringBuilder fieldVariableAdding, StringBuilder setupList_Adding) {
        if (list.isEmpty()) {
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            ContentSet contentSet = list.get(i);
            String varName = name + (i + 1);
            String label = STR_QUOTE + CONSTRAINT_PREFIX + contentSet.getName() + STR_QUOTE;
            String contents = getContents(contentSet);
            String storeStr = getStoreExpr(contentSet);

            fieldVariableAdding.append(_4SPACES + ARRAY_EXPR_SORT + varName + END + NL);

            setupList_Adding
                    .append(_8SPACES + varName + EQUAL + EX_CTX_MK_ARRAY_CONST + OPEN + STR_QUOTE + varName + STR_QUOTE + COMMA + INT_TYPE + COMMA + BOOL_TYPE + CLOSE + END + NL);

            init_Adding.append(_8SPACES + SL_COMMENT + contentSet.getName() + " = { " + contents + " }" + NL);
            init_Adding.append(_8SPACES + CONSTR_LIST_ADD + OPEN + EX_CTX_MK_EQ + OPEN + varName + COMMA + storeStr + CLOSE + CLOSE + END + NL);
            init_Adding.append(_8SPACES + CONSTR_LABEL_LIST_ADD + OPEN + EX_CTX_MK_BOOL_CONST + OPEN + label + CLOSE + CLOSE + END + NL);

            contentSetNameMap.put(contentSet, varName);
        }
        init_Adding.append(NL);
    }

    private void setConstraintList(StringBuilder constraintList_Adding, StringBuilder impliesConstraintMethodList_Adding, AbstractConstraint constraint, boolean runtime,
            int index) {

        String label = STR_QUOTE + NUMBER + String.valueOf(index + 1) + ":" + constraint.getName() + STR_QUOTE;
        String expressionText = constraint.getExpression().getExpressionText();
        constraintList_Adding.append(_8SPACES + SL_COMMENT + expressionText + NL);
        String constraintContextString = "";

        try {
            constraintContextString = getContextString(constraint.getExpression());
        } catch (Exception e) {
            constraintList_Adding.append(NL);
            e.printStackTrace();
            return;
        }
        
        Expression targetExpression = constraint.getExpression() instanceof ComplexExpression ? ((ComplexExpression)constraint.getExpression()).getOtherExpression() : constraint.getExpression();

        if (isBoolOperator(targetExpression)) {
            constraintContextString = EX_BOOL_EXPR + constraintContextString;
        }

        String indent = "";
        if (!runtime) {
            indent = _4SPACES;
            constraintList_Adding.append(_8SPACES + IF_OFFLINE + NL);
        }
        constraintList_Adding.append(indent + _8SPACES + CONSTR_LIST_ADD + OPEN + constraintContextString + CLOSE + END + NL);
        constraintList_Adding.append(indent + _8SPACES + CONSTR_LABEL_LIST_ADD + OPEN + EX_CTX_MK_BOOL_CONST + OPEN + label + CLOSE + CLOSE + END + NL);
        if (!runtime) {
            constraintList_Adding.append(_8SPACES + BLOCK_CLOSE + NL);
        }
        constraintList_Adding.append(NL);

        if (isImplieseOperator(targetExpression)) {
            impliesConstraintMethodList_Adding.append(getimpliesConstraintMethodsStr(constraint, index));
        }
    }

    private void setImpliesConstraintMethod(StringBuilder impliesConstraintMethodCallList_Adding, ImpliseConstraintInfo info) {
        int index = info.getIndex() + 1;
        String indent = "";
        if (!info.isRuntime()) {
            indent = _4SPACES;
            impliesConstraintMethodCallList_Adding.append(_8SPACES + IF_OFFLINE + NL);
        }
        String methodName = info.getMethodName();

        impliesConstraintMethodCallList_Adding.append(indent + _8SPACES + String.format(IMPLIES_CONSTRAINT_METHOD_DETAIL1, index) + methodName + END + NL);
        impliesConstraintMethodCallList_Adding.append(indent + _8SPACES + String.format(IMPLIES_CONSTRAINT_METHOD_DETAIL2, index, index) + NL);
        impliesConstraintMethodCallList_Adding
                .append(indent + _4SPACES + _8SPACES + String.format(IMPLIES_CONSTRAINT_METHOD_DETAIL3, index, info.getConstraint().getName(), index) + END + NL);
        impliesConstraintMethodCallList_Adding.append(indent + _4SPACES + _8SPACES + String.format(IMPLIES_CONSTRAINT_METHOD_DETAIL4, index) + NL);
        impliesConstraintMethodCallList_Adding.append(indent + _8SPACES + _8SPACES + IMPLIES_CONSTRAINT_METHOD_DETAIL5 + END + NL);
        impliesConstraintMethodCallList_Adding.append(indent + _4SPACES + _8SPACES + BLOCK_CLOSE + NL);
        impliesConstraintMethodCallList_Adding.append(indent + _8SPACES + BLOCK_CLOSE + NL);
        if (!info.isRuntime()) {
            impliesConstraintMethodCallList_Adding.append(_8SPACES + BLOCK_CLOSE + NL);
        }
        impliesConstraintMethodCallList_Adding.append(NL);
    }

    private String getimpliesConstraintMethodsStr(AbstractConstraint constraint, int index) {
        StringBuilder methodsCommentList_Adding = new StringBuilder();
        StringBuilder constraintList_Adding = new StringBuilder();

        Expression targetExpression = constraint.getExpression() instanceof ComplexExpression ? ((ComplexExpression)constraint.getExpression()).getOtherExpression() : constraint.getExpression();
        Expression leftExpression = ((ImpliesOperator) targetExpression).getOperand().get(0);

        ImpliseConstraintInfo info = new ImpliseConstraintInfo();
        info.setIndex(index);
        info.setConstraint(constraint);
        String methodName = "";
        String allConstMethodName = "";

        if (constraint instanceof Constraint) {
            // method name
            methodName = String.format(IMPLIES_CONSTRAINT_METHOD_NAME, (index + 1));
            allConstMethodName = "setAllConstraintContext";
            info.setMethodName(methodName);
            impliseMethodList.add(info);
        }

        // comment
        methodsCommentList_Adding.append(_4SPACES + CMT_CONTENT_IMPLIES_METHOD1 + NL);
        String leftText = leftExpression.getExpressionText();
        methodsCommentList_Adding.append(_4SPACES + String.format(CMT_CONTENT_IMPLIES_METHOD2, leftText) + NL);
        methodsCommentList_Adding.append(_4SPACES + CMT_CONTENT_IMPLIES_METHOD3 + constraint.getName() + NL);
        methodsCommentList_Adding.append(_4SPACES + CMT_CONTENT_IMPLIES_METHOD4 + constraint.getExpression().getExpressionText());

        if (isIncludeLambdaExpression(leftExpression)) {
            List<Variable> list = getVariables(leftExpression);

            for (int i = 0; i < list.size(); i++) {
                Variable variable = list.get(i);
                String varName = variableNameMap.get(variable);
                String define = String.format(VARIABLE_DEFINE, varName);

                constraintList_Adding.append(_8SPACES + VARIABLE_CMT + variable.getName() + NL);
                constraintList_Adding.append(_8SPACES + define + NL);
                constraintList_Adding.append(_8SPACES + varName + ARRAY_TOP + String.format(SET_VARIABLE_VALUE, variable.getName()) + NL);
            }
            constraintList_Adding.append(NL);
        }

        // constraint
        String expression = getContextString(leftExpression);
        String label = STR_QUOTE + NUMBER_ZERO + constraint.getName() + STR_QUOTE;
        constraintList_Adding.append(_8SPACES + CONSTR_LIST_ADD + OPEN + EX_CTX_MK_EQ + OPEN + expression + COMMA + EX_CTX_MK_TRUE + CLOSE + CLOSE + END + NL);
        constraintList_Adding.append(_8SPACES + CONSTR_LABEL_LIST_ADD + OPEN + EX_CTX_MK_BOOL_CONST + OPEN + label + CLOSE + CLOSE + END + NL);

        template.implies_constrName = label;
        template.implies_constraints_comment_code = methodsCommentList_Adding.toString();
        template.implies_constraints_methodName_code = _4SPACES + String.format(IMPLIES_CONSTRAINT_METHOD, methodName);
        template.implies_constraints_true_code = constraintList_Adding.toString();

        return template.getImpliesConstraintMethodCode(allConstMethodName);
    }

    private String getInvarianceConstraintStr(boolean isPre) {
        StringBuilder invariance_constr_Adding = new StringBuilder();

        invariance_constr_Adding.append(getInvarianceConstraintStr_IN01(isPre));
        invariance_constr_Adding.append(NL);
        invariance_constr_Adding.append(getInvarianceConstraintStr_IN02(isPre));
        invariance_constr_Adding.append(NL);
        invariance_constr_Adding.append(getInvarianceConstraintStr_IN03(isPre));

        return invariance_constr_Adding.toString();
    }

    private String getInvarianceConstraintStr_IN01(boolean isPre) {
        String preLabel = "";
        String opDisplayingContent = OP_DISPLAYING_CONTENT;
        if (isPre) {
            opDisplayingContent = OP_PRE_DISPLAYING_CONTENT;
            preLabel = "(pre)";
        }
        return getInvarianceConstraintStr_IN01_IN03_Impl(preLabel, opDisplayingContent, "IN01");
    }

    private String getInvarianceConstraintStr_IN01_IN03_Impl(String preLabel, String expr, String inKind) {
        StringBuilder invariance_constr_Adding = new StringBuilder();

        invariance_constr_Adding.append(_8SPACES + "// Area." + expr + " == contentsList.get(n) OR Area." + expr + " == contentsList.get(n+1) ...)");
        invariance_constr_Adding.append(NL);

        for (int i = 0; i < allocatableList.size(); i++) {
            Allocatable mainArea = allocatableList.get(i);
            String leftLabel = mainArea.getName() + "." + expr + " == ";
            String areaMkInt = EX_CTX_MK_INT + OPEN + String.valueOf(i + 1) + CLOSE;
            String leftconstr = EX_CTX_MK_EQ + OPEN + EX_CTX_MK_SELECT + OPEN + expr + COMMA + areaMkInt + CLOSE + COMMA;

            StringBuffer constrLabel = new StringBuffer();
            StringBuffer constr = new StringBuffer();

            constrLabel.append(STR_QUOTE + inKind +":Constraint " + preLabel + "_" + String.valueOf(i + 1) + " - (" + leftLabel);

            List<Content> mainContents = mainArea.getContentsList();

            int childSize = mainContents.size();
            if (childSize == 0) {
                constrLabel.append("NULL");
                constr.append(leftconstr + "defNull" + CLOSE);
            } else {
                for (int k = 0; k < mainContents.size(); k++) {
                    Content content = mainContents.get(k);
                    String contentName = content.getName();

                    int index = contentList.indexOf(content);
                    String contentMkInt = EX_CTX_MK_INT + OPEN + String.valueOf(index + 1) + CLOSE;
                    String subConstr = "";
                    if (k == 0 && k != mainContents.size() - 1) {
                        subConstr = EX_CTX_MK_OR + OPEN;
                    }

                    constrLabel.append(contentName);
                    constr.append(subConstr + leftconstr + contentMkInt + CLOSE);

                    if (k != mainContents.size() - 1) {
                        constrLabel.append(" OR ");
                        constr.append(COMMA);
                    } else {
                        if (mainContents.size() != 1) {
                            constr.append(CLOSE);
                        }
                    }
                }
            }
            constrLabel.append(")" + STR_QUOTE);

            invariance_constr_Adding.append(_8SPACES + CONSTR_LIST_ADD + OPEN + constr.toString() + CLOSE + END + NL);
            invariance_constr_Adding.append(_8SPACES + CONSTR_LABEL_LIST_ADD + OPEN + EX_CTX_MK_BOOL_CONST + OPEN + constrLabel.toString() + CLOSE + CLOSE + END + NL);
        }

        return invariance_constr_Adding.toString();
    }

    private String getInvarianceConstraintStr_IN02(boolean isPre) {

        int constNum = 1;
        StringBuilder invariance_constr_Adding = new StringBuilder();
        String opIsDisplayed = OP_IS_DISPLAYED;
        String opIsVisible = OP_IS_VISIBLE;
        String preLabel = "";
        if (isPre) {
            opIsDisplayed = OP_PRE_IS_DISPLAYED;
            opIsVisible = OP_PRE_IS_VISIBLE;
            preLabel = "(pre)";
        }

        invariance_constr_Adding.append(_8SPACES + "// a." + opIsDisplayed + "->c." + opIsVisible + " AND c." + opIsVisible + "->a." + opIsDisplayed);
        invariance_constr_Adding.append(NL);

        for (int i = 0; i < allocatableList.size(); i++) {
            Allocatable mainArea = allocatableList.get(i);
            String areaIsDisplayed = mainArea.getName() + "." + opIsDisplayed;
            String areaMkInt = EX_CTX_MK_INT + OPEN + String.valueOf(i + 1) + CLOSE;

            List<Content> mainContents = mainArea.getContentsList();

            if (mainContents.size() != 1) {
                continue;
            }

            for (int j = 0; j < mainContents.size(); j++) {
                StringBuffer constrLabel = new StringBuffer();
                StringBuffer constr = new StringBuffer();
                Content mainContent = mainContents.get(j);

                if (mainContent.getAllocatableList().size() != 1) {
                    continue;
                }

                int index = contentList.indexOf(mainContent);
                String contentIsVisible = mainContent.getName() + "." + opIsVisible;
                String mainContentMkInt = EX_CTX_MK_INT + OPEN + String.valueOf(index + 1) + CLOSE;

                constrLabel.append(STR_QUOTE + "IN02:Constraint" + preLabel + "_" + String.valueOf(constNum) + " - " + areaIsDisplayed + " -> " + contentIsVisible + " AND "
                        + contentIsVisible + " -> " + areaIsDisplayed + STR_QUOTE);
                constNum++;

                constr.append(EX_CTX_MK_AND + OPEN);
                constr.append(EX_CTX_MK_IMPLIES + OPEN + EX_BOOL_EXPR + EX_CTX_MK_SELECT + OPEN + opIsDisplayed + COMMA + areaMkInt + CLOSE + COMMA + EX_BOOL_EXPR
                        + EX_CTX_MK_SELECT + OPEN + opIsVisible + COMMA + mainContentMkInt + CLOSE + CLOSE);
                constr.append(COMMA);
                constr.append(EX_CTX_MK_IMPLIES + OPEN + EX_BOOL_EXPR + EX_CTX_MK_SELECT + OPEN + opIsVisible + COMMA + mainContentMkInt + CLOSE + COMMA + EX_BOOL_EXPR
                        + EX_CTX_MK_SELECT + OPEN + opIsDisplayed + COMMA + areaMkInt + CLOSE + CLOSE);
                constr.append(CLOSE);

                invariance_constr_Adding.append(_8SPACES + CONSTR_LIST_ADD + OPEN + constr.toString() + CLOSE + END + NL);
                invariance_constr_Adding.append(_8SPACES + CONSTR_LABEL_LIST_ADD + OPEN + EX_CTX_MK_BOOL_CONST + OPEN + constrLabel.toString() + CLOSE + CLOSE + END + NL);
            }
        }

        return invariance_constr_Adding.toString();
    }

    private String getInvarianceConstraintStr_IN03(boolean isPre) {
        String preLabel = "";
        String opAllocatedContent = OP_ALLOCATED_CONTENT;
        if (isPre) {
            opAllocatedContent = OP_PRE_ALLOCATED_CONTENT;
            preLabel = "(pre)";
        }
        return getInvarianceConstraintStr_IN01_IN03_Impl(preLabel, opAllocatedContent, "IN03");
    }

    private boolean isIncludeLambdaExpression(Expression expression) {

        for (Iterator<EObject> iterator = expression.eAllContents(); iterator.hasNext();) {
            EObject object = iterator.next();
            if (object instanceof LambdaContext | object instanceof LambdaExpression) {
                return true;
            }
        }
        return false;
    }

    private List<Variable> getVariables(Expression expression) {
        List<Variable> list = new ArrayList<Variable>();

        for (Iterator<EObject> iterator = expression.eAllContents(); iterator.hasNext();) {
            EObject object = iterator.next();
            if (object instanceof Variable) {
                list.add((Variable) object);
            }
        }
        return list;
    }

    private boolean isImplieseOperator(Expression expression) {
        if (expression instanceof ImpliesOperator) {
            return true;
        }
        return false;
    }

    private boolean isBoolOperator(Expression expression) {
        if (expression instanceof IsVisible) {
            return true;
        } else if (expression instanceof IsDisplayed) {
            return true;
        } else if (expression instanceof IsActive) {
            return true;
        } else if (expression instanceof IsHidden) {
            return true;
        } else if (expression instanceof IfStatement) {
            return true;
        } else if (expression instanceof IsDisappeared) {
            return true;
        } else if (expression instanceof IsCanceled) {
            return true;
        } else if (expression instanceof IsMuted) {
            return true;
        } else if (expression instanceof IsOutputted) {
            return true;
        } else if (expression instanceof IsAttenuated) {
            return true;
        } else if (expression instanceof IsSounding) {
            return true;
        } else if (expression instanceof IsOn) {
            return true;
        } else if (expression instanceof HasBeenDisplayed) {
            return true;
        } else if (expression instanceof HasComeEarlierThan) {
            return true;
        } else if (expression instanceof HasComeLaterThan) {
            return true;
        }
        return false;
    }

    private String getStoreExpr(Allocatable allocatable) {
        String context = EMP_ARRAY_CONST;

        List<Content> contentsList = allocatable.getContentsList();

        for (int i = 0; i < contentList.size(); i++) {
            Content content = contentList.get(i);
            if (contentsList.contains(content)) {
                context = String.format(STORE_TEMPLATE, context, (i + 1));
            }
        }

        return context;
    }

    private String getStoreExpr(Content content) {
        String context = EMP_ARRAY_CONST;

        for (int i = 0; i < allocatableList.size(); i++) {
            Allocatable area = allocatableList.get(i);
            if (content.getAllocatableList().contains(area)) {
                context = String.format(STORE_TEMPLATE, context, (i + 1));
            }
        }

        return context;
    }

    private String getStoreExpr(AllocatableSet allocatableSet) {
        String context = EMP_ARRAY_CONST;
        List<RuleObject> set = getRuleObjectsBySet(allocatableSet, new ArrayList<RuleObject>());

        for (int i = 0; i < allocatableList.size(); i++) {
            Allocatable area = allocatableList.get(i);
            if (set.contains(area)) {
                context = String.format(STORE_TEMPLATE, context, (i + 1));
            }
        }

        return context;
    }

    private String getStoreExpr(ContentSet contentSet) {
        String context = EMP_ARRAY_CONST;
        List<RuleObject> set = getRuleObjectsBySet(contentSet, new ArrayList<RuleObject>());

        for (int i = 0; i < contentList.size(); i++) {
            Content content = contentList.get(i);
            if (set.contains(content)) {
                context = String.format(STORE_TEMPLATE, context, (i + 1));
            }
        }

        return context;
    }

    private String getStoreExpr(SetOfOperator op) {
        String context = EMP_ARRAY_CONST;

        List<RuleObject> objects = new ArrayList<RuleObject>();
        EList<Expression> operand = op.getOperand();
        if (operand.isEmpty()) {
            return context;
        }

        for (Expression expression : operand) {
            if (!(expression instanceof ObjectReference)) {
                continue;
            }

            RuleObject refObject = ((ObjectReference) expression).getRefObject();
            if (refObject instanceof Content || refObject instanceof Allocatable) {
                objects.add(refObject);
            } else if (refObject instanceof ContentSet | refObject instanceof AllocatableSet) {
                objects.addAll(getRuleObjectsBySet(refObject, new ArrayList<RuleObject>()));
            }
        }

        if (objects.isEmpty()) {
            return context;
        }

        if (objects.get(0) instanceof Area) {
            for (int i = 0; i < allocatableList.size(); i++) {
                Allocatable area = allocatableList.get(i);
                if (objects.contains(area)) {
                    context = String.format(STORE_TEMPLATE, context, (i + 1));
                }
            }
        } else if (objects.get(0) instanceof Zone) {
            for (int i = 0; i < allocatableList.size(); i++) {
                Allocatable zone = allocatableList.get(i);
                if (objects.contains(zone)) {
                    context = String.format(STORE_TEMPLATE, context, (i + 1));
                }
            }
        } else if (objects.get(0) instanceof ViewContent) {
            for (int i = 0; i < contentList.size(); i++) {
                Content content = contentList.get(i);
                if (objects.contains(content)) {
                    context = String.format(STORE_TEMPLATE, context, (i + 1));
                }
            }
        } else if (objects.get(0) instanceof SoundContent) {
            for (int i = 0; i < contentList.size(); i++) {
                Content content = contentList.get(i);
                if (objects.contains(content)) {
                    context = String.format(STORE_TEMPLATE, context, (i + 1));
                }
            }
        }

        return context;
    }

    private List<RuleObject> getRuleObjectsBySet(RuleObject refObject, List<RuleObject> elementSetList) {
        Set<RuleObject> sets = new HashSet<RuleObject>();

        if (refObject instanceof AllocatableSet) {
            AllocatableSet set = (AllocatableSet) refObject;
            for (AbstractAllocatable abst : set.getTarget()) {
                if (abst instanceof Allocatable) {
                    sets.add(abst);
                } else if (abst instanceof AllocatableSet) {
                    if (!elementSetList.contains(abst)) {
                        elementSetList.add(abst);
                        sets.addAll(getRuleObjectsBySet(abst, elementSetList));
                    }
                }
            }
        }
        if (refObject instanceof ContentSet) {
            ContentSet set = (ContentSet) refObject;
            for (AbstractContent abst : set.getTarget()) {
                if (abst instanceof Content) {
                    sets.add(abst);
                } else if (abst instanceof ContentSet) {
                    if (!elementSetList.contains(abst)) {
                        elementSetList.add(abst);
                        sets.addAll(getRuleObjectsBySet(abst, elementSetList));
                    }
                }
            }
        }

        return new ArrayList<RuleObject>(sets);
    }

    private String getContents(Allocatable allocatable) {
        String contentStr = "";
        List<Content> contents = allocatable.getContentsList();

        for (Content content : contents) {
            contentStr += content.getName();
            if (contents.indexOf(content) != contents.size() - 1) {
                contentStr += COMMA + " ";
            }
        }
        return contentStr;
    }

    private String getAllocatables(Content content) {
        String areas = "";
        EList<Allocatable> allocatables = content.getAllocatableList();
        for (AbstractAllocatable allocatable : allocatables) {
            areas += allocatable.getName();
            if (allocatables.indexOf(allocatable) != allocatables.size() - 1) {
                areas += COMMA + " ";
            }
        }
        return areas;
    }

    private String getAreas(AllocatableSet set) {
        String areas = "";

        for (AbstractAllocatable area : set.getTarget()) {
            areas += area.getName();
            if (set.getTarget().indexOf(area) != set.getTarget().size() - 1) {
                areas += COMMA + " ";
            }
        }
        return areas;
    }

    private String getContents(ContentSet contentSet) {
        String contents = "";

        for (AbstractContent content : contentSet.getTarget()) {
            contents += content.getName();
            if (contentSet.getTarget().indexOf(content) != contentSet.getTarget().size() - 1) {
                contents += COMMA + " ";
            }
        }
        return contents;
    }

    private String getContextString(Expression expression) {
        String contextString = null;

        if (expression instanceof ComplexExpression) {
            contextString = getContextString(((ComplexExpression) expression).getOtherExpression());
        } else if (expression instanceof AndOperator) {
            contextString = resolveExpression((AndOperator) expression);
        } else if (expression instanceof OrOperator) {
            contextString = resolveExpression((OrOperator) expression);
        } else if (expression instanceof NotOperator) {
            contextString = resolveExpression((NotOperator) expression);
        } else if (expression instanceof ImpliesOperator) {
            contextString = resolveExpression((ImpliesOperator) expression);
        } else if (expression instanceof ObjectCompare) {
            contextString = resolveExpression((ObjectCompare) expression);
        } else if (expression instanceof IsEqualToOperator) {
            contextString = resolveExpression((IsEqualToOperator) expression);
        } else if (expression instanceof IsGreaterThanOperator) {
            contextString = resolveExpression((IsGreaterThanOperator) expression);
        } else if (expression instanceof IsGreaterThanEqualOperator) {
            contextString = resolveExpression((IsGreaterThanEqualOperator) expression);
        } else if (expression instanceof IsLowerThanOperator) {
            contextString = resolveExpression((IsLowerThanOperator) expression);
        } else if (expression instanceof IsLowerThanEqualOperator) {
            contextString = resolveExpression((IsLowerThanEqualOperator) expression);
        } else if (expression instanceof IsDisplayed) {
            contextString = resolveExpression((IsDisplayed) expression);
        } else if (expression instanceof DisplayingContent) {
            contextString = resolveExpression((DisplayingContent) expression);
        } else if (expression instanceof AllocatedContent) {
            contextString = resolveExpression((AllocatedContent) expression);
        } else if (expression instanceof GetContentsList) {
            System.out.println("GetContentsList is not supported yet!");
        } else if (expression instanceof IsHidden) {
            contextString = resolveExpression((IsHidden) expression);
        } else if (expression instanceof IsActive) {
            contextString = resolveExpression((IsActive) expression);
        } else if (expression instanceof IsVisible) {
            contextString = resolveExpression((IsVisible) expression);
        } else if (expression instanceof GetAllocatables) {
            System.out.println("GetAllocatables is not supported yet!");
        } else if (expression instanceof ContentValue) {
            contextString = resolveExpression((ContentValue) expression);
        } else if (expression instanceof ExistsOperator) {
            contextString = resolveExpression((ExistsOperator) expression);
        } else if (expression instanceof ForAllOperator) {
            contextString = resolveExpression((ForAllOperator) expression);
        } else if (expression instanceof IfStatement) {
            contextString = resolveExpression((IfStatement) expression);
        } else if (expression instanceof IsOn) {
            contextString = resolveExpression((IsOn) expression);
        } else if (expression instanceof ObjectReference) {
            contextString = resolveExpression((ObjectReference) expression);
        } else if (expression instanceof PreviousModifier) {
            contextString = resolveExpression((PreviousModifier) expression);
        } else if (expression instanceof IsDisappeared) {
            contextString = resolveExpression((IsDisappeared) expression);
        } else if (expression instanceof IsCanceled) {
            contextString = resolveExpression((IsCanceled) expression);
        } else if (expression instanceof IsMuted) {
            contextString = resolveExpression((IsMuted) expression);
        } else if (expression instanceof IsSounding) {
            contextString = resolveExpression((IsSounding) expression);
        } else if (expression instanceof OutputtingSound) {
            contextString = resolveExpression((OutputtingSound) expression);
        } else if (expression instanceof IsAttenuated) {
            contextString = resolveExpression((IsAttenuated) expression);
        } else if (expression instanceof IsOutputted) {
            contextString = resolveExpression((IsOutputted) expression);
        } else if (expression instanceof GetProperty) {
            contextString = resolveExpression((GetProperty) expression);
        } else if (expression instanceof IntegerValue) {
            contextString = resolveExpression((IntegerValue) expression);
        } else if (expression instanceof HasComeEarlierThan) {
            contextString = resolveExpression((HasComeEarlierThan) expression);
        } else if (expression instanceof HasComeLaterThan) {
            contextString = resolveExpression((HasComeLaterThan) expression);
        } else if (expression instanceof HasBeenDisplayed) {
            contextString = resolveExpression((HasBeenDisplayed) expression);
        } else if (expression instanceof SugarExpression) {
            contextString = getContextString(((SugarExpression) expression).getExpanded());
        } else {
            // TODO Specification not found
            throw new RuntimeException("Expected Expression type is not supported yet! : " + expression.getExpressionText());
        }

        return contextString;
    }

    private String resolveExpression(AndOperator expression) {
        List<Expression> operand = expression.getOperand();
        String context = EX_CTX_MK_AND + OPEN;
        for (int i = 0; i < operand.size(); i++) {
            Expression op = operand.get(i);
            String opContext = getContextString(op);
            context += EX_BOOL_EXPR + opContext;

            if (i != operand.size() - 1) {
                context += COMMA;
            }
        }

        return context + CLOSE;
    }

    private String resolveExpression(OrOperator expression) {
        List<Expression> operand = expression.getOperand();

        String context = EX_CTX_MK_OR + OPEN;
        for (int i = 0; i < operand.size(); i++) {
            Expression op = operand.get(i);
            String opContext = getContextString(op);
            context += EX_BOOL_EXPR + opContext;

            if (i != operand.size() - 1) {
                context += COMMA;
            }
        }

        return context + CLOSE;
    }

    private String resolveExpression(NotOperator expression) {
        List<Expression> operand = ((NotOperator) expression).getOperand();
        String context = getContextString(operand.get(0));

        return EX_CTX_MK_NOT + OPEN + EX_BOOL_EXPR + context + CLOSE;
    }

    private String resolveExpression(ImpliesOperator expression) {
        List<Expression> operand = ((ImpliesOperator) expression).getOperand();
        String leftContext = getContextString(operand.get(0));
        String rightContext = getContextString(operand.get(1));

        return EX_CTX_MK_IMPLIES + OPEN + EX_BOOL_EXPR + leftContext + COMMA + EX_BOOL_EXPR + rightContext + CLOSE;
    }

    private String resolveExpression(ObjectCompare expression) {
        List<Expression> operand = expression.getOperand();
        String leftCast = EX_BOOL_EXPR;
        String rightCast = EX_BOOL_EXPR;
        if ((operand.get(0) instanceof ContentValue) || (operand.get(0) instanceof DisplayingContent) || (operand.get(0) instanceof AllocatedContent)
                || (operand.get(0) instanceof OutputtingSound) || (operand.get(0) instanceof GetProperty) || (operand.get(0) instanceof ObjectReference)) {
            leftCast = EX_INT_EXPR;
        }
        if ((operand.get(1) instanceof ContentValue) || (operand.get(1) instanceof DisplayingContent) || (operand.get(1) instanceof AllocatedContent)
                || (operand.get(1) instanceof OutputtingSound) || (operand.get(1) instanceof GetProperty) || (operand.get(1) instanceof ObjectReference)) {
            rightCast = EX_INT_EXPR;
        }

        String leftContext = getContextString(operand.get(0));
        String rightContext = getContextString(operand.get(1));

        return EX_CTX_MK_EQ + OPEN + leftCast + leftContext + COMMA + rightCast + rightContext + CLOSE;
    }

    private String resolveExpression(IsLowerThanEqualOperator expression) {
        List<Expression> operand = expression.getOperand();
        String leftContext = getContextString(operand.get(0));
        String rightContext = getContextString(operand.get(1));

        return EX_CTX_MK_LE + OPEN + EX_INT_EXPR + leftContext + COMMA + EX_INT_EXPR + rightContext + CLOSE;
    }

    private String resolveExpression(IsLowerThanOperator expression) {
        List<Expression> operand = expression.getOperand();
        String leftContext = getContextString(operand.get(0));
        String rightContext = getContextString(operand.get(1));

        return EX_CTX_MK_LT + OPEN + EX_INT_EXPR + leftContext + COMMA + EX_INT_EXPR + rightContext + CLOSE;
    }

    private String resolveExpression(IsGreaterThanEqualOperator expression) {
        List<Expression> operand = expression.getOperand();
        String leftContext = getContextString(operand.get(0));
        String rightContext = getContextString(operand.get(1));

        return EX_CTX_MK_GE + OPEN + EX_INT_EXPR + leftContext + COMMA + EX_INT_EXPR + rightContext + CLOSE;
    }

    private String resolveExpression(IsGreaterThanOperator expression) {
        List<Expression> operand = expression.getOperand();
        String leftContext = getContextString(operand.get(0));
        String rightContext = getContextString(operand.get(1));

        return EX_CTX_MK_GT + OPEN + EX_INT_EXPR + leftContext + COMMA + EX_INT_EXPR + rightContext + CLOSE;
    }

    private String resolveExpression(IsEqualToOperator expression) {
        List<Expression> operand = expression.getOperand();
        String cast = EX_INT_EXPR;

        String leftContext = getContextString(operand.get(0));
        String rightContext = getContextString(operand.get(1));

        return EX_CTX_MK_EQ + OPEN + cast + leftContext + COMMA + cast + rightContext + CLOSE;
    }

    private String resolveExpression(ExistsOperator expression) {
        return resolveExpression(expression, EX_CTX_MK_EXISTS, "");
    }

    private String resolveExpression(ForAllOperator expression) {
        return resolveExpression(expression, EX_CTX_MK_FORALL, EX_CTX_MK_IMPLIES);
    }

    private String resolveExpression(LambdaContext expression, String mkMethod, String implies) {
        LambdaExpression lambda = expression.getLambda();
        Variable x = lambda.getX();

        EList<Expression> operand = expression.getOperand();

        String size = "";
        String setName = "";
        String variableName = variableNameMap.get(x);
        if (operand.get(0) instanceof ObjectReference) {
            ObjectReference ref = (ObjectReference) operand.get(0);
            if (ref.getUnderlyingType() == ExpressionType.SET_OF_AREA || ref.getUnderlyingType() == ExpressionType.SET_OF_ZONE) {
                size = ALLOCATABLE_SIZE;
            } else if (ref.getUnderlyingType() == ExpressionType.SET_OF_CONTENT || ref.getUnderlyingType() == ExpressionType.SET_OF_SOUND) {
                size = CONTENT_SIZE;
            }

            setName = resolveExpression((ObjectReference) operand.get(0));

        } else if (operand.get(0) instanceof GetAllocatables) {
            size = CONTENT_SIZE;

            GetAllocatables getAllocatable = (GetAllocatables) operand.get(0);
            if (getAllocatable.getOperand().get(0) instanceof PreviousModifier) {
                PreviousModifier pre = (PreviousModifier) getAllocatable.getOperand().get(0);
                String select = resolveExpression(pre.getObjReference());
                setName = EX_ARRAY_EXPR_CATS + EX_CTX_MK_SELECT + OPEN + OP_PRE_ALLOCATABLE + COMMA + select + CLOSE;
            } else {
                String select = resolveExpression((ObjectReference) getAllocatable.getOperand().get(0));
                setName = EX_ARRAY_EXPR_CATS + EX_CTX_MK_SELECT + OPEN + OP_ALLOCATABLE + COMMA + select + CLOSE;
            }

        } else if (operand.get(0) instanceof GetContentsList) {
            size = ALLOCATABLE_SIZE;

            GetContentsList getContentsList = (GetContentsList) operand.get(0);
            if (getContentsList.getOperand().get(0) instanceof PreviousModifier) {
                PreviousModifier pre = (PreviousModifier) getContentsList.getOperand().get(0);
                String select = resolveExpression(pre.getObjReference());
                setName = EX_ARRAY_EXPR_CATS + EX_CTX_MK_SELECT + OPEN + OP_PRE_CONTENTS_LIST + COMMA + select + CLOSE;
            } else {
                String select = resolveExpression((ObjectReference) getContentsList.getOperand().get(0));
                setName = EX_ARRAY_EXPR_CATS + EX_CTX_MK_SELECT + OPEN + OP_CONTENTS_LIST + COMMA + select + CLOSE;
            }

        } else if (operand.get(0) instanceof AllInstanceOfArea) {
            size = ALLOCATABLE_SIZE;
            setName = ALL_AREA_CONST;
        } else if (operand.get(0) instanceof AllInstanceOfZone) {
            size = ALLOCATABLE_SIZE;
            setName = ALL_ZONE_CONST;
        } else if (operand.get(0) instanceof AllInstanceOfViewContent) {
            size = CONTENT_SIZE;
            setName = ALL_VIEWCONTENT_CONST;
        } else if (operand.get(0) instanceof AllInstanceOfSoundContent) {
            size = CONTENT_SIZE;
            setName = ALL_SOUNDCONTENT_CONST;
        } else if (operand.get(0) instanceof SetOfOperator) {
            SetOfOperator setOfOp = (SetOfOperator) operand.get(0);
            if (setOfOp.getUnderlyingType() == ExpressionType.SET_OF_AREA || setOfOp.getUnderlyingType() == ExpressionType.SET_OF_ZONE) {
                size = ALLOCATABLE_SIZE;
            } else if (setOfOp.getUnderlyingType() == ExpressionType.SET_OF_CONTENT || setOfOp.getUnderlyingType() == ExpressionType.SET_OF_SOUND) {
                size = CONTENT_SIZE;
            }

            String expressionText = setOfOp.getExpressionText();
            setName = SetOfNameMap.get(expressionText);
        } else if (operand.get(0) instanceof ActiveContents) {
            size = CONTENT_SIZE;
            ActiveContents activeContents = (ActiveContents) operand.get(0);
            if (activeContents.getOperand().get(0) instanceof PreviousModifier) {
                PreviousModifier pre = (PreviousModifier) activeContents.getOperand().get(0);
                String select = resolveExpression(pre.getObjReference());
                setName = EX_ARRAY_EXPR_CATS + EX_CTX_MK_SELECT + OPEN + OP_PRE_ACTIVE_CONTENTS + COMMA + select + CLOSE;
            } else {
                String select = resolveExpression((ObjectReference) activeContents.getOperand().get(0));
                setName = EX_ARRAY_EXPR_CATS + EX_CTX_MK_SELECT + OPEN + OP_ACTIVE_CONTENTS + COMMA + select + CLOSE;
            }
        }

        String setContext = EX_CTX_MK_SELECT + OPEN + setName + COMMA + variableName + ARRAY_TOP + CLOSE;
        String expContext = getContextString(lambda.getBodyText());
        String rangeContext = EX_CTX_MK_AND + OPEN + EX_CTX_MK_LE + OPEN + EX_CTX_MK_INT + OPEN + 1 + CLOSE + COMMA + EX_ARITH_EXPR + variableName + ARRAY_TOP + CLOSE + COMMA
                + EX_CTX_MK_LE + OPEN + EX_ARITH_EXPR + variableName + ARRAY_TOP + COMMA + size + CLOSE + CLOSE;
        String bodyContext = EX_CTX_MK_AND + OPEN + rangeContext + COMMA + EX_BOOL_EXPR + setContext;

        if (!implies.isEmpty()) {
            bodyContext = implies + OPEN + bodyContext + CLOSE + COMMA + EX_BOOL_EXPR + expContext + CLOSE;
        } else {
            bodyContext += COMMA + EX_BOOL_EXPR + expContext + CLOSE;
        }

        String context = mkMethod + OPEN + variableName + COMMA + bodyContext + COMMA + 1 + COMMA + NULL_STRING + COMMA + NULL_STRING + COMMA + NULL_STRING + COMMA + NULL_STRING
                + CLOSE;
        return context;
    }

    private String resolveExpression(IsDisplayed expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_IS_DISPLAYED + COMMA + context + CLOSE;
        }

        String context = resolveExpression((ObjectReference) operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_IS_DISPLAYED + COMMA + context + CLOSE;
    }

    private String resolveExpression(IsVisible expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_IS_VISIBLE + COMMA + context + CLOSE;
        }

        String context = getContextString(operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_IS_VISIBLE + COMMA + context + CLOSE;
    }

    private String resolveExpression(IsHidden expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_IS_HIDDEN + COMMA + context + CLOSE;
        }

        String context = resolveExpression((ObjectReference) operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_IS_HIDDEN + COMMA + context + CLOSE;
    }

    private String resolveExpression(IsActive expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_IS_ACTIVE + COMMA + context + CLOSE;
        }

        String context = getContextString(operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_IS_ACTIVE + COMMA + context + CLOSE;
    }

    private String resolveExpression(DisplayingContent expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_DISPLAYING_CONTENT + COMMA + context + CLOSE;
        }

        String context = resolveExpression((ObjectReference) operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_DISPLAYING_CONTENT + COMMA + context + CLOSE;
    }

    private String resolveExpression(AllocatedContent expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_ALLOCATED_CONTENT + COMMA + context + CLOSE;
        }

        String context = resolveExpression((ObjectReference) operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_ALLOCATED_CONTENT + COMMA + context + CLOSE;
    }

    private String resolveExpression(ContentValue expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_CONTENT_VALUE + COMMA + context + CLOSE;
        }

        String context = resolveExpression((ObjectReference) operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_CONTENT_VALUE + COMMA + context + CLOSE;
    }

    private String resolveExpression(IsMuted expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_IS_MUTED + COMMA + context + CLOSE;
        }

        String context = resolveExpression((ObjectReference) operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_IS_MUTED + COMMA + context + CLOSE;
    }

    private String resolveExpression(IsOutputted expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_IS_OUTPUTTED + COMMA + context + CLOSE;
        }

        String context = resolveExpression((ObjectReference) operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_IS_OUTPUTTED + COMMA + context + CLOSE;
    }

    private String resolveExpression(IsAttenuated expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_IS_ATTENUATED + COMMA + context + CLOSE;
        }

        String context = resolveExpression((ObjectReference) operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_IS_ATTENUATED + COMMA + context + CLOSE;
    }

    private String resolveExpression(OutputtingSound expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_OUTPUTTING_SOUND + COMMA + context + CLOSE;
        }

        String context = resolveExpression((ObjectReference) operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_OUTPUTTING_SOUND + COMMA + context + CLOSE;
    }

    private String resolveExpression(IsSounding expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_IS_SOUNDING + COMMA + context + CLOSE;
        }

        String context = getContextString(operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_IS_SOUNDING + COMMA + context + CLOSE;
    }

    private String resolveExpression(GetProperty expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return String.format(context, OP_PRE_GET_PROPERTY);
        }

        String context = resolveExpression((ObjectReference) operand.get(0));
        return String.format(context, OP_GET_PROPERTY);
    }

    private String resolveExpression(IntegerValue expression) {
        int value = expression.getValue();
        return EX_CTX_MK_INT + OPEN + String.valueOf(value) + CLOSE;
    }

    private String resolveExpression(IfStatement expression) {

        Expression condition = expression.getCondition();
        Expression thenExpression = expression.getThenExpression();
        Expression elseExpression = expression.getElseExpression();

        String conditionContext = getContextString(condition);
        String thenContext = getContextString(thenExpression);
        String elseContext = getContextString(elseExpression);

        String context = EX_CTX_MK_ITE + OPEN + EX_BOOL_EXPR + conditionContext + COMMA + thenContext + COMMA + elseContext + CLOSE;
        return context;
    }

    private String resolveExpression(IsOn expression) {
        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            String context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_IS_ON + COMMA + context + CLOSE;
        } else if (!(operand.get(0) instanceof ObjectReference)) {
            String context = getContextString(operand.get(0));
            return EX_CTX_MK_SELECT + OPEN + OP_IS_ON + COMMA + context + CLOSE;
        }

        String context = resolveExpression((ObjectReference) operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_IS_ON + COMMA + context + CLOSE;
    }

    private String resolveExpression(ObjectReference expression) {
        if (expression.getRefObject() instanceof Area) {
            Area target = (Area) expression.getRefObject();
            for (int i = 0; i < allocatableList.size(); i++) {
                Allocatable area = allocatableList.get(i);
                if (target == area) {
                    return EX_CTX_MK_INT + OPEN + (i + 1) + CLOSE;
                }
            }
        } else if (expression.getRefObject() instanceof Zone) {
            Zone target = (Zone) expression.getRefObject();
            for (int i = 0; i < allocatableList.size(); i++) {
                Allocatable allocatable = allocatableList.get(i);
                if (target == allocatable) {
                    return EX_CTX_MK_INT + OPEN + (i + 1) + CLOSE;
                }
            }
        } else if (expression.getRefObject() instanceof ViewContent) {
            Content target = (Content) expression.getRefObject();
            for (int i = 0; i < contentList.size(); i++) {
                Content content = contentList.get(i);
                if (target == content) {
                    return EX_CTX_MK_INT + OPEN + (i + 1) + CLOSE;
                }
            }
        } else if (expression.getRefObject() instanceof SoundContent) {
            Content target = (Content) expression.getRefObject();
            for (int i = 0; i < contentList.size(); i++) {
                Content content = contentList.get(i);
                if (target == content) {
                    return EX_CTX_MK_INT + OPEN + (i + 1) + CLOSE;
                }
            }
        } else if (expression.getRefObject() instanceof Variable) {
            Variable target = (Variable) expression.getRefObject();

            if ((expression.eContainer() instanceof GetAllocatables) || (expression.eContainer() instanceof GetContentsList)) {
                return EX_CTX_MK_INT_CONST + OPEN + EX_CTX_MK_SYMBOL + OPEN + STR_QUOTE + target.getName() + STR_QUOTE + CLOSE + CLOSE;
            }

            return variableNameMap.get(target) + ARRAY_TOP;
        } else if (expression.getRefObject() instanceof AllocatableSet) {
            AllocatableSet target = (AllocatableSet) expression.getRefObject();
            return allocatableSetNameMap.get(target);
        } else if (expression.getRefObject() instanceof ContentSet) {
            ContentSet target = (ContentSet) expression.getRefObject();
            return contentSetNameMap.get(target);
        } else if (expression.getRefObject() instanceof Scene) {
            Scene target = (Scene) expression.getRefObject();
            for (int i = 0; i < sceneList.size(); i++) {
                Scene scene = sceneList.get(i);
                if (target == scene) {
                    return EX_CTX_MK_INT + OPEN + (i + 1) + CLOSE;
                }
            }
        } else if (expression.getRefObject() instanceof IntegerProperty) {
            IntegerProperty target = (IntegerProperty) expression.getRefObject();
            Scene parent = (Scene) target.eContainer();

            for (int i = 0; i < sceneList.size(); i++) {
                Scene scene = sceneList.get(i);
                if (parent == scene) {
                    int propIndex = scene.getProperties().indexOf(target) + 1;

                    String propContext = EX_CTX_MK_SELECT + OPEN + "%s" + COMMA + EX_CTX_MK_INT + OPEN + propIndex + CLOSE + CLOSE;
                    return EX_CTX_MK_SELECT + OPEN + EX_ARRAY_EXPR_CATS + propContext + COMMA + EX_CTX_MK_INT + OPEN + (i + 1) + CLOSE + CLOSE;
                }
            }
        }
        return null;
    }

    private String resolveExpression(PreviousModifier expression) {
        String context = resolveExpression(expression.getObjReference());
        return context;
    }

    private String resolveExpression(IsDisappeared expression) {
        EList<Expression> operand = expression.getOperand();

        String context = "";
        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_IS_DISAPPEARED + COMMA + context + CLOSE;
        }

        context = getContextString(operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_IS_DISAPPEARED + COMMA + context + CLOSE;
    }

    private String resolveExpression(IsCanceled expression) {
        EList<Expression> operand = expression.getOperand();

        String context = "";
        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_IS_CANCELED + COMMA + context + CLOSE;
        }

        context = getContextString(operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_IS_CANCELED + COMMA + context + CLOSE;
    }

    private String resolveExpression(HasBeenDisplayed expression) {
        EList<Expression> operand = expression.getOperand();

        String context = "";
        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            context = resolveExpression(pre.getObjReference());
            return EX_CTX_MK_SELECT + OPEN + OP_PRE_HAS_BEEN_DISPLAYED + COMMA + context + CLOSE;
        }

        context = getContextString(operand.get(0));
        return EX_CTX_MK_SELECT + OPEN + OP_HAS_BEEN_DISPLAYED + COMMA + context + CLOSE;
    }    
    private String resolveExpression(HasComeEarlierThan expression) {
        String context = "";
        String leftContext = "";
        String rightContext = "";

        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            leftContext = resolveExpression(pre.getObjReference());
        } else {
            leftContext = getContextString(operand.get(0));
        }

        if (operand.get(1) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(1);
            rightContext = resolveExpression(pre.getObjReference());
        } else {
            rightContext = getContextString(operand.get(1));
        }

        String context1 = EX_ARRAY_EXPR_CATS + EX_CTX_MK_SELECT + OPEN + OP_HAS_COME_EARLIER_THAN + COMMA + leftContext + CLOSE;
        context = EX_CTX_MK_SELECT + OPEN + context1 + COMMA + rightContext + CLOSE;

        return context;
    }

    private String resolveExpression(HasComeLaterThan expression) {
        String context = "";
        String leftContext = "";
        String rightContext = "";

        EList<Expression> operand = expression.getOperand();

        if (operand.get(0) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(0);
            leftContext = resolveExpression(pre.getObjReference());
        } else {
            leftContext = getContextString(operand.get(0));
        }

        if (operand.get(1) instanceof PreviousModifier) {
            PreviousModifier pre = (PreviousModifier) operand.get(1);
            rightContext = resolveExpression(pre.getObjReference());
        } else {
            rightContext = getContextString(operand.get(1));
        }

        String context1 = EX_ARRAY_EXPR_CATS + EX_CTX_MK_SELECT + OPEN + OP_HAS_COME_LATER_THAN + COMMA + leftContext + CLOSE;
        context = EX_CTX_MK_SELECT + OPEN + context1 + COMMA + rightContext + CLOSE;

        return context;
    }

    class ImpliseConstraintInfo {
        int index;

        AbstractConstraint constraint;

        String methodName;

        public int getIndex() {
            return index;
        }

        public String getMethodName() {
            return methodName;
        }

        public boolean isRuntime() {
            if (constraint instanceof Constraint) {
                return ((Constraint) constraint).isRuntime();
            }
            return true;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public AbstractConstraint getConstraint() {
            return constraint;
        }

        public void setConstraint(AbstractConstraint constraint) {
            this.constraint = constraint;
        }
    }
}
