package rba.tool.core.sort;

import org.eclipse.core.resources.IProject;

import rba.tool.core.console.ConsoleManager;
import rba.tool.core.z3.Z3CodeManager;

public class SortValueManager {

    public static SortValueManager INSTANCE = new SortValueManager();

    private static final String CONSOLE_TITLE = "#### Execution of Constraint ####";

    private SortValue areaZorderSortValue = new SortValue();

    private SortValue visibilitySortValue = new SortValue();;

    private SortValue csPrioritySortValue = new SortValue();;

    private static final String NOTIFIER_ID = "rba.tool.core.CalculateSortValue";

    public boolean updateSortValue(IProject project) {

        try {
            ISortValueCalculation calc = Z3CodeManager.INSTNACE.getSortCaluculator(project);
            calc.setUp();
            areaZorderSortValue.setSortValue(calc.calculateArea_zorder());
            visibilitySortValue.setSortValue(calc.calculateAllocatable_visibility());
            csPrioritySortValue.setSortValue(calc.calculateContentState_priority());
            calc.close();

        } catch (RuntimeException e) {
            ConsoleManager.INSTANCE.output(CONSOLE_TITLE, NOTIFIER_ID);
            ConsoleManager.INSTANCE.output(e.getMessage(), NOTIFIER_ID);
            ConsoleManager.INSTANCE.output("##################", NOTIFIER_ID);

            areaZorderSortValue.clear();
            visibilitySortValue.clear();
            csPrioritySortValue.clear();
            return false;
        }
        return true;
    }

    public SortValue getAreaZorderSortValue() {
        return areaZorderSortValue;
    }

    public SortValue getAllocatableVisibilitySortValue() {
        return visibilitySortValue;
    }

    public SortValue getCsPrioritySortValue() {
        return csPrioritySortValue;
    }
}
