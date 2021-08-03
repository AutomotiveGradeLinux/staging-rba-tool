package rba.core.generator.util.value;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import rba.core.ComparisonOperator;
import rba.core.Expression;
import rba.core.RuleObject;

public abstract class ComparisonOperatorEvaluator<T extends RuleObject> extends ExpressionEvaluator<T> implements ComparisonOperator {

    protected ComparisonOperator operator;

    protected T subject;

    protected ComparisonOperatorEvaluator(ComparisonOperator o) {
        super(o);
        operator = o;
        EObject container = o.eContainer();
        while (!(container instanceof RuleObject)) {
            container = container.eContainer();
            if (container == null)
                break;
        }
        if (container != null) {
            subject = (T) container;
        }
    }

    abstract public boolean evaluate(ValueSortedList<T> list);

    /**
     * @param list
     * @return -1 if it has no suggestion 9999 implies MAX group (last index)
     */
    abstract public int suggestIndex(ValueSortedList<T> list);

    @Override
    public EList<Expression> getOperand() {
        return operator.getOperand();
    }

    @Override
    public String getSymbol() {
        return operator.getSymbol();
    }

}
