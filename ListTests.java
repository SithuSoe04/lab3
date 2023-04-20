import static org.junit.Assert.*;

import java.net.http.WebSocket.Listener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> stringArrayList = new ArrayList<>(Arrays.asList("a", "b"));
        // List<String> output = ListExamples.filter(stringArrayList, );
    }

    @Test
    public void testmerge(){
        List<String> stringArrayList = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> stringArrayList2 = new ArrayList<>(Arrays.asList("d", "e", "f", "g", "h"));
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h"));
        // assertThat(expectedOutput, ListExamples.merge(stringArrayList, stringArrayList2));
    }
}
