package rba.tool.core.util;

import java.util.ArrayList;
import java.util.List;

import rba.core.RuleObject;

public class SortResult<T extends RuleObject> {
    private List<SortResultSet<T>> sortResults = new ArrayList<SortResultSet<T>>();

    private boolean isUnsat;

    public List<SortResultSet<T>> getSortResults() {
        return sortResults;
    }

    public boolean addSortResult(SortResultSet<T> sortResult) {
        return sortResults.add(sortResult);
    }

    public SortResultSet<T> getSortResultSet(RuleObject obj) {
        for (SortResultSet<T> sortResult : sortResults) {
            T element = sortResult.getElement();
            if (element.equals(obj)) {
                return sortResult;
            }
        }
        return null;
    }

    public boolean isUnsat() {
        return isUnsat;
    }

    public void setUnsat(boolean isUnsat) {
        this.isUnsat = isUnsat;
    }
}
