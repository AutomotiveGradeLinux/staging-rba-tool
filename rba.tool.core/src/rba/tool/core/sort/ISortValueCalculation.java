package rba.tool.core.sort;

import java.util.Map;

public interface ISortValueCalculation {
    Map<String, Integer> calculateArea_zorder();

    Map<String, Integer> calculateAllocatable_visibility();

    Map<String, Integer> calculateContentState_priority();

    void setUp();

    void close();
}
