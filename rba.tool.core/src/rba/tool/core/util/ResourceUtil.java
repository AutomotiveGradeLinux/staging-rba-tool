package rba.tool.core.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ResourceUtil {
    public static BufferedReader getReader(File file) {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader reader = null;

        try {
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis, "UTF-8");
            reader = new BufferedReader(isr);
        } catch (Throwable e) {
            e.printStackTrace();
            try {
                if (reader != null) {
                    reader.close();
                }
                if (isr != null) {
                    isr.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            throw new RuntimeException(e);
        }
        return reader;
    }

    public static BufferedWriter getWriter(File file) {
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter writer = null;

        try {
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos, "UTF-8");
            writer = new BufferedWriter(osw);
        } catch (Throwable e) {
            e.printStackTrace();
            try {
                if (writer != null) {
                    writer.close();
                }
                if (osw != null) {
                    osw.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            throw new RuntimeException(e);
        }
        return writer;
    }
}
