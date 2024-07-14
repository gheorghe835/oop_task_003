package StreamService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> StudyGroups;

    public Stream() {
        this.StudyGroups = new ArrayList<>();
    }

    public void addGroup(StudyGroup group) {
        StudyGroups.add(group);
    }

    public List<StudyGroup> getStudyGroups() {
        return StudyGroups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return StudyGroups.iterator();
    }
}
