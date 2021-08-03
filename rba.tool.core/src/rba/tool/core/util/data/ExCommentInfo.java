package rba.tool.core.util.data;

import java.util.ArrayList;
import java.util.List;

public class ExCommentInfo {

    private String fileName;

    private List<String> info = new ArrayList<String>();

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<String> getInfo() {
        return info;
    }

    public void setInfo(List<String> info) {
        this.info = info;
    }

    public void addInfo(String info) {
        this.info.add(info);
    }

}
