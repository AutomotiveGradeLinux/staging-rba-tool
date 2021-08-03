package rba.tool.core.sort;

import org.eclipse.emf.common.util.EList;

import rba.core.ComparisonAnd;
import rba.core.ComparisonOperator;
import rba.core.Expression;
import rba.core.GreaterThanOperator;
import rba.core.LetStatement;
import rba.core.MuchGreaterThanOperator;
import rba.core.RuleObject;

public class ComparisonAndEvaluator<T extends RuleObject> extends ComparisonOperatorEvaluator<T> implements ComparisonAnd {

    public ComparisonAndEvaluator(ComparisonAnd o) {
        super(o);
    }

    @Override
    public boolean evaluate(ValueSortedList<T> list) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int suggestIndex(ValueSortedList<T> list) {
        int max = 9999;
        int min = -1;

        for (Expression operand : operator.getOperand()) {
            if (operand instanceof GreaterThanOperator || operand instanceof MuchGreaterThanOperator) {
                int i = list.createEvaluator((ComparisonOperator) operand).suggestIndex(list);
                if (i > min && i >= 0) {
                    min = i;
                }
            } else {
                throw new RuntimeException("Unsupported expression [" + operator.getExpression() + "]");
            }
        }
        return Math.min(min, max);
    }

    @Override
    public EList<LetStatement> getLetStatements() {
        // TODO Auto-generated method stub
        return null;
    }

}
