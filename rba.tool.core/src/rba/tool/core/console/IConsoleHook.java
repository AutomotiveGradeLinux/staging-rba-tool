package rba.tool.core.console;

public interface IConsoleHook {

    void preNotify(String message, String notifierId);

    void postNotify(String message, String notifierId);
}
