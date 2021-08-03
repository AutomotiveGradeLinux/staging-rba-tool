package rba.tool.core.util.data;

public class ExCommentLabel {

    private final String label;

    private final int columnWidth;

    public ExCommentLabel(String label, int columnWidth) {
        this.label = label;
        this.columnWidth = columnWidth;
    }

    public String getLabel() {
        return label;
    }

    public int getColumnWidth() {
        return columnWidth;
    }
}
