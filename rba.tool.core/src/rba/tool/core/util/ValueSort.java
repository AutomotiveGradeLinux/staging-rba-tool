package rba.tool.core.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rba.core.ContentState;
import rba.core.Expression;
import rba.core.RBACoreFactory;
import rba.tool.core.sort.ValueGroup;
import rba.tool.core.sort.ValueSortedList;
import rba.view.Area;

public class ValueSort {
    public static ValueSort INSTANCE = new ValueSort();

    public SortResult<Area> sortVisibility(List<Area> areas) {
        SortResult<Area> sortResult = new SortResult<Area>();

        try {
            sortResult = doSortVisibility(areas);
            sortResult.setUnsat(false);
        } catch (RuntimeException e) {
            sortResult.setUnsat(true);
        }

        return sortResult;
    }

    private SortResult<Area> doSortVisibility(List<Area> areas) {
        SortResult<Area> sortResult = new SortResult<Area>();

        Map<Area, SortResultSet<Area>> map = new HashMap<Area, SortResultSet<Area>>();
        for (Area area : areas) {
            SortResultSet<Area> set = new SortResultSet<Area>();
            set.setElement(area);
            sortResult.addSortResult(set);
            map.put(area, set);
        }

        ValueSortedList<Area> sortedElement = new ValueSortedList<Area>(areas) {
            protected Expression getValueExpression(Area e) {
                return e.getVisibility();
            }
        };

        for (ValueGroup<Area> valueGroup : sortedElement.getGroupList()) {
            int value = convertValue(valueGroup.getName());
            for (Area member : valueGroup.getMember()) {
                SortResultSet<Area> set = map.get(member);
                set.setValue(value);
            }
        }

        return sortResult;
    }

    public SortResult<Area> sortZorder(List<Area> areas) {
        SortResult<Area> sortResult = new SortResult<Area>();

        try {
            sortResult = doSortZorder(areas);
            sortResult.setUnsat(false);
        } catch (RuntimeException e) {
            sortResult.setUnsat(true);
        }

        return sortResult;
    }

    private SortResult<Area> doSortZorder(List<Area> areas) {

        SortResult<Area> sortResult = new SortResult<Area>();

        Map<Area, SortResultSet<Area>> map = new HashMap<Area, SortResultSet<Area>>();
        for (Area area : areas) {
            SortResultSet<Area> set = new SortResultSet<Area>();
            set.setElement(area);
            sortResult.addSortResult(set);
            map.put(area, set);
        }

        ValueSortedList<Area> sortedElement = new ValueSortedList<Area>(areas) {
            protected Expression getValueExpression(Area e) {
                return e.getZorder();
            }
        };

        for (ValueGroup<Area> valueGroup : sortedElement.getGroupList()) {
            int value = convertValue(valueGroup.getName());
            for (Area member : valueGroup.getMember()) {
                SortResultSet<Area> set = map.get(member);
                set.setValue(value);
            }
        }
        return sortResult;
    }

    public SortResult<ContentState> sortPriority(List<ContentState> contentStates) {
        SortResult<ContentState> sortResult = new SortResult<ContentState>();

        try {
            sortResult = doSortPriority(contentStates);
            sortResult.setUnsat(false);
        } catch (RuntimeException e) {
            sortResult.setUnsat(true);
        }

        return sortResult;
    }

    public SortResult<ContentState> doSortPriority(List<ContentState> contentStates) {
        SortResult<ContentState> sortResult = new SortResult<ContentState>();

        Map<ContentState, SortResultSet<ContentState>> map = new HashMap<ContentState, SortResultSet<ContentState>>();
        for (ContentState contentState : contentStates) {
            SortResultSet<ContentState> set = new SortResultSet<ContentState>();
            set.setElement(contentState);
            sortResult.addSortResult(set);
            map.put(contentState, set);
        }

        ValueSortedList<ContentState> sortedElement = new ValueSortedList<ContentState>(contentStates) {
            protected Expression getValueExpression(ContentState e) {
                return e.getValue();
            }
        };

        for (ValueGroup<ContentState> valueGroup : sortedElement.getGroupList()) {
            int value = convertValue(valueGroup.getName());
            for (ContentState member : valueGroup.getMember()) {
                SortResultSet<ContentState> set = map.get(member);
                set.setValue(value);
            }
        }

        return sortResult;
    }

    private int convertValue(String valueString) {
        int value;
        if (valueString.equals("MIN")) {
            value = RBACoreFactory.eINSTANCE.createMinValue().getExpressionValue();
        } else if (valueString.equals("MAX")) {
            value = RBACoreFactory.eINSTANCE.createMaxValue().getExpressionValue();
        } else {
            value = Integer.parseInt(valueString);
        }
        return value;
    }

}
