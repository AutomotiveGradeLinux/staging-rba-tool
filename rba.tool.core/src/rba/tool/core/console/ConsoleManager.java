package rba.tool.core.console;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class ConsoleManager implements IConsoleManager {

    public static ConsoleManager INSTANCE = new ConsoleManager();

    org.eclipse.ui.console.IConsoleManager consoleManager;

    MessageConsole console;

    MessageConsoleStream consoleStream;

    MessageConsoleStream consoleWarnStream;

    String title = "RBA Tool Console";

    Map<String, List<IConsoleHook>> hook_notifierIdMap = new HashMap<String, List<IConsoleHook>>();

    private ConsoleManager() {
        consoleManager = ConsolePlugin.getDefault().getConsoleManager();
        console = new MessageConsole(title, null);
        consoleManager.addConsoles(new MessageConsole[] { console });

        consoleStream = console.newMessageStream();

        consoleWarnStream = console.newMessageStream();
        consoleWarnStream.setColor(new Color(null, 255, 0, 0)); // red
        consoleWarnStream.setFontStyle(SWT.BOLD);
    }

    public void clearConsole() {
        console.clearConsole();
    }

    @Override
    public void output(String message, String notifierId) {
        preNotify(message, notifierId);
        // original output message
        consoleManager.showConsoleView(console);
        consoleStream.println(message);
        postNotify(message, notifierId);
    }

    @Override
    public void warning(String message, String notifierId) {
        preNotify(message, notifierId);
        // original warning message
        consoleManager.showConsoleView(console);
        consoleWarnStream.println(message);
        postNotify(message, notifierId);
    }

    @Override
    public void addHook(IConsoleHook hook, String targetNotifierId) {
        List<IConsoleHook> hookList = hook_notifierIdMap.get(targetNotifierId);
        if (hookList == null) {
            hookList = new ArrayList<IConsoleHook>();
            hook_notifierIdMap.put(targetNotifierId, hookList);
        }
        hookList.add(hook);
    }

    @Override
    public void removeHook(IConsoleHook hook, String targetNotifierId) {
        List<IConsoleHook> hookList = hook_notifierIdMap.get(targetNotifierId);
        if (hookList == null) {
            return;
        }
        hookList.remove(hook);
    }

    public void preNotify(String message, String notifierId) {
        List<IConsoleHook> hookList = hook_notifierIdMap.get(notifierId);
        if (hookList != null && !hookList.isEmpty()) {
            hookList.forEach(hook -> hook.preNotify(message, notifierId));
        }
    }

    public void postNotify(String message, String notifierId) {
        List<IConsoleHook> hookList = hook_notifierIdMap.get(notifierId);
        if (hookList != null && !hookList.isEmpty()) {
            hookList.forEach(hook -> hook.postNotify(message, notifierId));
        }
    }
}
