package rba.tool.core.util;

public interface IToolLogger {

    void logging(Throwable e);

    void logging(String message);
}
