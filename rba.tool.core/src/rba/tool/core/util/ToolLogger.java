package rba.tool.core.util;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.Stream;

public class ToolLogger implements IToolLogger {

    private Logger logger;

    /**
     * @param name logger name
     * @param logFile File name
     * @param append
     * @throws SecurityException
     * @throws IOException
     */
    public ToolLogger(String name, String logFile, boolean append) throws SecurityException, IOException {
        this(Logger.getLogger(name), logFile, append);
    }

    /**
     * @param logger logger name
     * @param logFile
     * @param append
     * @throws SecurityException
     * @throws IOException
     * @throws NullPointerException
     */
    public ToolLogger(Logger logger, String logFile, boolean append) throws SecurityException, IOException {
        if (logger == null) {
            throw new NullPointerException("logger must be not null."); //$NON-NLS-1$
        }
        this.logger = logger;
        String path = "log/" + logFile; //$NON-NLS-1$
        createParent(path);
        FileHandler h = new FileHandler(path, append);
        h.setFormatter(new SimpleFormatter());
        this.logger.addHandler(h);
        this.logger.setLevel(Level.ALL);
    }

    public ToolLogger(Logger logger, Handler handler) {
        if (logger == null) {
            throw new NullPointerException("logger must be not null."); //$NON-NLS-1$
        }
        this.logger = logger;
        this.logger.addHandler(handler);
        this.logger.setLevel(Level.ALL);
    }

    static void createParent(String path) {
        File logPath = new File(path);
        if (!logPath.getParentFile().exists()) {
            logPath.getParentFile().mkdirs();
        }
    }

    /**
     * Logging when handle to occurred error
     * @param e
     */
    public void logging(Throwable e) {
        StringBuilder message = new StringBuilder(e.toString() + "\n"); //$NON-NLS-1$
        Stream.of(e.getStackTrace()).forEach(t -> message.append("\t").append(t.toString()).append("\n")); //$NON-NLS-1$ //$NON-NLS-2$
        logger.warning(message.toString());
    }

    @Override
    public void logging(String message) {
        logger.warning(message);
    }

}
