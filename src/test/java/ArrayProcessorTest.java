import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ArrayProcessorTest {

    @Test
    public void arrayProcessorReturnElementsDuplicated() throws Exception {

        ArrayProcessor arrayProcessor = new ArrayProcessor();

        List<Character> result = arrayProcessor.getElementDuplicated(
                new ArrayList<>((Arrays.asList(new Character[]{'a', 'b', 'c', 'a', 'x', 'y', 'x', 'a'})))
        );

        assertNotNull(result);
        assertEquals(2, result.size());
        
    }
}
