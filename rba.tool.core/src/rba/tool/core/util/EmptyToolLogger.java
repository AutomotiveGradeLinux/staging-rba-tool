package rba.tool.core.util;

/**
 * @author kousuke_morishima
 */
public class EmptyToolLogger implements IToolLogger {

    public EmptyToolLogger() {
    }

    @Override
    public void logging(Throwable e) {
        // nothing to do
    }

    @Override
    public void logging(String message) {
        // nothing to do
    }
}
