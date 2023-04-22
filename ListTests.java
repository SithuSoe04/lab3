import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;


class firstLetterCapital implements StringChecker {
    public boolean checkString(String s){
        if (Character.isUpperCase(s.charAt(0))){
            return true;
        }
        return false;
    }
}

public class ListTests{

    @Test
    public void testFilter(){
        List<String> stringArrayList = new ArrayList<>(Arrays.asList("Sithu Soe", "Basketball", "iPhone 14 Max Pro", "laptop"));
        List<String> actualOutput = ListExamples.filter(stringArrayList, new firstLetterCapital());
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("Sithu Soe", "Basketball"));
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testmerge(){
        List<String> stringArrayList = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> stringArrayList2 = new ArrayList<>(Arrays.asList("d", "e", "f", "g", "h"));
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h"));
        assertEquals(expectedOutput, ListExamples.merge(stringArrayList, stringArrayList2));
    }
}
