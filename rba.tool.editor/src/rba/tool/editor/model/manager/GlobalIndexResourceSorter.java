package rba.tool.editor.model.manager;

import java.util.Comparator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class GlobalIndexResourceSorter implements Comparator<Resource> {

    int sort(URI o1, URI o2) {
        /* first compare folder */
        int size1 = o1.segmentCount() - 1;
        int size2 = o2.segmentCount() - 1;
        for (int i = 0; i < size1 && i < size2; i++) {
            int result = o1.segment(i).toLowerCase().compareTo(o2.segment(i).toLowerCase());
            if (result != 0) {
                return result;
            }
        }

        if (size1 == size2) {
            /* order of name that last segment(file). */
            return o1.lastSegment().toLowerCase().compareTo(o2.lastSegment().toLowerCase());
        } else if (size1 > size2) {
            /* prioritize folder over file */
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public int compare(Resource o1, Resource o2) {
        return sort(o1.getURI(), o2.getURI());
    }
}
