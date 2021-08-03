package rba.tool.core.util;

import rba.core.RuleObject;

public class SortResultSet<T extends RuleObject> {
    private T element;

    private int value;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
