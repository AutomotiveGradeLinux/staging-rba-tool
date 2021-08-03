package rba.tool.core.sort;

import org.eclipse.emf.common.util.EList;

import rba.core.Expression;
import rba.core.LetStatement;
import rba.core.MuchGreaterThanOperator;
import rba.core.ObjectReference;
import rba.core.RuleObject;
import rba.core.ThatOfOperator;
import rba.core.ValueExpression;

public class MuchGreaterThanOperatorEvaluator<T extends RuleObject> extends ComparisonOperatorEvaluator<T> implements MuchGreaterThanOperator {

    static int MUCH_GAP = 10;

    public MuchGreaterThanOperatorEvaluator(MuchGreaterThanOperator o) {
        super(o);
    }

    @Override
    public boolean evaluate(ValueSortedList<T> list) {
        Expression operand = operator.getOperand().get(0);
        if (operand instanceof ObjectReference) {
            @SuppressWarnings("unchecked")
            T object = (T) ((ObjectReference) operand).getRefObject();
            return (list.getGroupIndexOf(subject) >= list.getGroupIndexOf(object) + MUCH_GAP);
        }

        return false;
    }

    @Override
    public int suggestIndex(ValueSortedList<T> list) {
        Expression operand = operator.getOperand().get(0);
        if (operand instanceof ThatOfOperator) {
            Expression target = ((ThatOfOperator) operand).getOperand().get(0);

            if (target instanceof ObjectReference) {
                @SuppressWarnings("unchecked")
                T object = (T) ((ObjectReference) target).getRefObject();
                if (list.getGroupIndexOf(subject) >= list.getGroupIndexOf(object) + MUCH_GAP) {
                    return -1;
                } else {
                    return list.getGroupIndexOf(object) + MUCH_GAP;
                }
            }

        } else if (operand instanceof ValueExpression) {
            int i = ((ValueExpression) operand).getExpressionValue();
            if (list.getGroupIndexOf(subject) > i) {
                return -1;
            } else {
                return i + 1;
            }
        }

        throw new RuntimeException("Unsupported expression [" + operator.getExpression() + "]");
    }

    @Override
    public EList<LetStatement> getLetStatements() {
        // TODO Auto-generated method stub
        return null;
    }

}
