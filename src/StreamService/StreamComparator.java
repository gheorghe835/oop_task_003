package StreamService;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    public int compare(Stream stream1, Stream stream2) {
        int compare = Integer.compare(stream1.getStudyGroups().size(), stream2.getStudyGroups().size());
        return compare;
    }
}
