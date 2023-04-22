import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FileTests {
    /*
  Given new File("some-files/") as a parameter, we'd expect [some-files/a.txt,
  some-files/more-files/b.txt, some-files/more-files/c.java,
  some-files/even-more-files/d.java, some-files/even-more-files/a.txt] as results

  Given new File("some-files/more-files") as a parameter, we'd expect
  [some-files/more-files/b.txt, some-files/more-files/c.java] as results

  Given new File("some-files/a.txt") as a parameter, we'd expect
  [some-files/a.txt] and a result
  */
    @Test
    public void testSingleFile() throws IOException{
        File file = new File("some-files/a.txt");
        List<File> actualFileList = FileExample.getFiles(file);
        List<File> expectedFileList = new ArrayList<>(Arrays.asList(file));
        assertEquals(expectedFileList, actualFileList);
    }

    @Test
    public void testDirectory() throws IOException{
        File file = new File("some-files/");
        File atxt = new File("some-files/a.txt");
        File morefilesbtxt = new File("some-files/more-files/b.txt");
        File morefilescjava = new File("some-files/more-files/c.java");
        File evenmorefilesdjava = new File("some-files/even-more-files/d.java");
        File evenmorefilesatxt = new File("some-files/even-more-files/a.txt");
        List<File> actualFileList = FileExample.getFiles(file);
        List<File> expectedFileList = new ArrayList<>(Arrays.asList(atxt, morefilesbtxt, morefilescjava, evenmorefilesdjava, evenmorefilesatxt));
        assertEquals(expectedFileList, actualFileList);
    }
}
