package rba.tool.core.constraint;

import java.util.List;
import java.util.Map;

public interface IConstraintCalculation {
    List<String> calculateAllConstraint();

    Map<String, List<String>> calculateImpliesConstraints();

    void setUp(boolean onlyOnline);

    void close();
}
