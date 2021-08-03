package rba.tool.core.ui;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.lang3.StringUtils;

public class CommonValueValidator {

    public static boolean isExistFilePath(String folderPath, String fileName) {
        if (StringUtils.isEmpty(folderPath) || StringUtils.isEmpty(fileName))
            return false;
        return Files.exists(Paths.get(folderPath, fileName));
    }

    public static boolean isExistFilePath(String filePath) {
        if (StringUtils.isEmpty(filePath))
            return false;
        return Files.exists(Paths.get(filePath));
    }

    public static boolean isValidFileName(String target) {
        if (StringUtils.isEmpty(target)) {
            return false;
        }
        if (target.length() > 250) {
            return false;
        }
        if (target.contains("¥") || target.contains("/") || target.contains(":") || target.contains("*") || target.contains("?") || target.contains("\"") || target.contains("|")
                || target.contains("<") || target.contains(">")) {
            return false;
        }

        return true;
    }

    public static boolean isValidFolderName(String target) {
        if (StringUtils.isEmpty(target)) {
            return false;
        }
        if (target.length() > 250) {
            return false;
        }
        if (target.contains("¥") || target.contains("/") || target.contains(":") || target.contains("*") || target.contains("?") || target.contains("\"") || target.contains("|")
                || target.contains("<") || target.contains(">") || target.contains(".") || target.contains(",")) {
            return false;
        }

        return true;
    }
}
