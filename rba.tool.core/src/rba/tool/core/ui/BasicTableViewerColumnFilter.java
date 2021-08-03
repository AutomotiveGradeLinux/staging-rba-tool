package rba.tool.core.ui;

import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class BasicTableViewerColumnFilter extends ViewerFilter {

    private String filterString;

    private final int[] filterColumns;

    public BasicTableViewerColumnFilter(String filterString, int[] filterColumns) {
        this.filterString = filterString;
        this.filterColumns = filterColumns;
    }

    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
        if ((null == filterString) || (StringUtils.isEmpty(filterString))) {
            return true;
        }

        Pattern pattern = Pattern.compile(createRegexFromGlob(filterString), Pattern.CASE_INSENSITIVE);

        for (int i : this.filterColumns) {

            ITableLabelProvider labelProvider = (ITableLabelProvider) ((TableViewer) viewer).getLabelProvider();

            String cellLabel = labelProvider.getColumnText(element, i);

            if (pattern.matcher(cellLabel).find()) {
                return true;
            } else if (cellLabel.toLowerCase().contains(filterString.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Create Regular Expression for filter string
     * @param glob
     * @return
     */
    private String createRegexFromGlob(String glob) {
        String out = "^";
        for (int i = 0; i < glob.length(); ++i) {
            final char c = glob.charAt(i);
            switch (c) {
            case '*':
                out += ".*";
                break;
            case '?':
                out += '.';
                break;
            default:
                out += c;
            }
        }
        out += '$';
        return out;
    }

    public void setFilterString(String filterString) {
        this.filterString = filterString;
    }
}
