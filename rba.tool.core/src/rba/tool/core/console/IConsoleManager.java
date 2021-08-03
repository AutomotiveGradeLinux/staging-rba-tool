package rba.tool.core.console;

public interface IConsoleManager {

    void output(String message, String notifierId);

    void clearConsole();

    void warning(String message, String notifierId);

    void addHook(IConsoleHook hook, String targetNotifierId);

    void removeHook(IConsoleHook hook, String targetNotifierId);
}
