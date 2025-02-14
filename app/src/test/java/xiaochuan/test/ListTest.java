package xiaochuan.test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    @Test
    public void t1() {
        List<Integer> l1 = Arrays.asList(3, 2, 5, 1);

        int[] a1 = l1.stream().mapToInt(Integer::intValue).toArray();
        List<Integer> l2 = Arrays.stream(a1).boxed().toList();

        int[] a2 = l2.stream().mapToInt(Integer::intValue).toArray();

        assertEquals(l1, l2);
        assertArrayEquals(a1, a2);
    }

    /**
     * object
     */
    @Test
    public void t2() {
        String[] a1 = new String[]{ "apple", "orange" };

        List<String> l1 = Arrays.asList(a1);
        
        String[] a2 = l1.toArray(new String[0]);

        assertArrayEquals(a1, a2);

        assertThrows(UnsupportedOperationException.class, () -> l1.add("hello"));


        List<String> l2 = new ArrayList<>(Arrays.asList(a1));
        
        l2.add("hello");
        assertEquals(l2.size(), 3);

    }
}
