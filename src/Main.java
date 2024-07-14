import StreamService.Controller;
import StreamService.Stream;
import StreamService.StudyGroup;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        Stream stream1 = new Stream();
        stream1.addGroup(new StudyGroup("Group 1"));
        stream1.addGroup(new StudyGroup("Group 2"));

        Stream stream2 = new Stream();
        stream2.addGroup(new StudyGroup("Group 3"));

        List<Stream> streams = List.of(stream1, stream2);

        controller.sortStreams(streams);

        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getStudyGroups().size() + " groups");
        }
    }
    }
