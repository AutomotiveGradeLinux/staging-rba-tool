package rba.core.generator.util.value;

import org.eclipse.emf.common.util.EList;

import rba.core.ComparisonOperator;
import rba.core.EqualToOperator;
import rba.core.Expression;
import rba.core.LetStatement;
import rba.core.ObjectReference;
import rba.core.RuleObject;
import rba.core.ThatOfOperator;
import rba.core.ValueExpression;

public class EqualToOperatorEvaluator<T extends RuleObject> extends ComparisonOperatorEvaluator<T> implements EqualToOperator {

    protected EqualToOperatorEvaluator(ComparisonOperator o) {
        super(o);
    }

    @Override
    public boolean evaluate(ValueSortedList<T> list) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int suggestIndex(ValueSortedList<T> list) {
        Expression operand = operator.getOperand().get(0);
        if (operand instanceof ThatOfOperator) {
            Expression target = ((ThatOfOperator) operand).getOperand().get(0);

            if (target instanceof ObjectReference) {
                T object = (T) ((ObjectReference) target).getRefObject();
                return list.getGroupIndexOf(object);
            }

        } else if (operand instanceof ValueExpression) {
            int i = list.getGroupIndexOf(((ValueExpression) operand).getExpression());
            return i;
        }

        throw new RuntimeException("Unsupported expression [" + operator.getExpression() + "]");
    }

    @Override
    public EList<LetStatement> getLetStatements() {
        // TODO Auto-generated method stub
        return null;
    }

}
