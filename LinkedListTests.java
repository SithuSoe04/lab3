import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LinkedListTests{
    @Test
    public void linkedListsAccuracy(){
        List<Integer> intArrayList = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        LinkedList intLinkedList = new LinkedList(); 
        for (int i = 0; i < intArrayList.size(); i++){
            intLinkedList.append(intArrayList.get(i));
        }
        String actualIntLinkedListAsString = intLinkedList.toString();
        String expectedIntLinkedListAsString = "2 4 6 8 10";
        assertEquals(expectedIntLinkedListAsString, actualIntLinkedListAsString);
    }
}



