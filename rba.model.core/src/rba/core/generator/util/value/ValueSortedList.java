package rba.core.generator.util.value;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import rba.core.ComparisonAnd;
import rba.core.ComparisonOperator;
import rba.core.EqualToOperator;
import rba.core.Expression;
import rba.core.GreaterThanOperator;
import rba.core.MuchGreaterThanOperator;
import rba.core.RuleObject;
import rba.core.ValueExpression;

abstract public class ValueSortedList<T extends RuleObject> {
    private List<ValueGroup<T>> list;

    private Collection<T> unsorted;

    public ValueSortedList(Collection<T> originalList) {
        list = new ArrayList<ValueGroup<T>>();
        list.add(new ValueGroup<T>("MIN"));
        list.add(new ValueGroup<T>("1"));
        list.add(new ValueGroup<T>("MAX"));
        unsorted = new ArrayList<T>(originalList);
        sort();
    }

    public void add(T o) {
        unsorted.add(o);
        sort();
    }

    public void addAll(Collection<T> list) {
        unsorted.addAll(list);
        sort();
    }

    public void sort() {
        list.get(0).getMember().addAll(unsorted);
        unsorted.clear();
        boolean trysort = true;
        int retry = 0;
        while (trysort) {
            trysort = false;
            retry = retry + 1;
            if (retry > 100) {
                throw new RuntimeException("Could not sort value [" + list + "]");
            }
            for (T i : sortedList()) {
                int currentIndex = this.getGroupIndexOf(i);
                Expression e = this.getValueExpression(i);
                if (e == null)
                    continue;
                if (e instanceof ValueExpression) {
                    int index = this.getGroupIndexOf(e.getExpression());
                    if (index == -1) {
                        index = ((ValueExpression) e).getExpressionValue();
                        if (index >= list.size() - 1) {
                            list.get(currentIndex).remove(i);
                            addGroupAt(index, i);
                            trysort = true;
                            continue;
                        }
                    }
                    if (index != currentIndex) {
                        list.get(currentIndex).remove(i);
                        list.get(index).add(i);
                        trysort = true;
                    } else {
                    }
                } else if (e instanceof ComparisonOperator) {
                    ComparisonOperatorEvaluator<T> evaluator = createEvaluator((ComparisonOperator) e);
                    int index = evaluator.suggestIndex(this);
                    if (index < 0)
                        continue;
                    if (index >= list.size() - 1) {
                        list.get(currentIndex).remove(i);
                        addGroupAt(index, i);
                        trysort = true;
                    } else if (index != currentIndex) {
                        list.get(currentIndex).remove(i);
                        list.get(index).add(i);
                        trysort = true;
                    } else {
                    }
                } else {
                    throw new RuntimeException("Unsupported expression [" + e.getExpression() + "]");
                }
            }
        }
    }

    private void addGroupAt(int index, T e) {

        if (index >= list.size() - 1) {
            for (int i = list.size() - 1; i <= index; ++i) {
                ValueGroup<T> newGroup = new ValueGroup<T>(Integer.toString(i));
                list.add(i, newGroup);
            }
        }

        list.get(index).add(e);

    }

    public List<T> sortedList() {
        List<T> result = new ArrayList<T>();
        for (ValueGroup<T> i : list) {
            result.addAll(i.getMember());
        }
        return result;
    }

    public List<ValueGroup<T>> getGroupList() {
        return list;
    }

    abstract protected Expression getValueExpression(T e);

    public int getGroupIndexOf(T e) {
        for (ValueGroup<T> i : list) {
            if (i.getMember().contains(e)) {
                return list.indexOf(i);
            }
        }
        return -1;
    }

    public int getGroupIndexOf(String groupName) {
        for (ValueGroup<T> i : list) {
            if (i.getName().contentEquals(groupName)) {
                return list.indexOf(i);
            }
        }
        return -1;
    }

    public ComparisonOperatorEvaluator<T> createEvaluator(ComparisonOperator e) {
        ComparisonOperatorEvaluator<T> evaluator;
        if (e instanceof GreaterThanOperator) {
            evaluator = new GreaterThanOperatorEvaluator<T>((GreaterThanOperator) e);
        } else if (e instanceof MuchGreaterThanOperator) {
            evaluator = new MuchGreaterThanOperatorEvaluator<T>((MuchGreaterThanOperator) e);
        } else if (e instanceof ComparisonAnd) {
            evaluator = new ComparisonAndEvaluator<T>((ComparisonAnd) e);
        } else if (e instanceof EqualToOperator) {
            evaluator = new EqualToOperatorEvaluator<T>((EqualToOperator) e);
        } else {
            throw new RuntimeException("Unsupported expression [" + e.getExpression() + "]");
        }
        return evaluator;
    }
}
