package rba.tool.core.sort;

import java.util.HashMap;
import java.util.Map;

import rba.tool.core.z3.Z3Constants;

public class SortValue {
    private Map<String, Integer> sortMap = new HashMap<String, Integer>();

    private boolean unsat = false;

    public void setSortValue(Map<String, Integer> map) {
        if (map == null) {
            clear();
            return;
        }

        sortMap = map;
        Integer result = map.get(Z3Constants.TOTAL_RESULT);
        if (result == Z3Constants.UNSAT_VAL) {
            unsat = true;
        }
    }

    public boolean isUnsat() {
        return unsat;
    }

    public Integer getValue(String name) {
        if (!sortMap.isEmpty()) {
            Integer integer = sortMap.get(name);
            if (integer != null) {
                return integer;
            }
        }

        return Z3Constants.UNKNOWN_VAL;
    }

    public void clear() {
        sortMap.clear();
        unsat = false;
    }
}
