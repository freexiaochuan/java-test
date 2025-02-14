package xiaochuan.test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class ListTest {
    @Test
    public void t1() {
        List<Integer> l1 = Arrays.asList(3, 2, 5, 1);

        int[] a1 = l1.stream().mapToInt(Integer::intValue).toArray();
        List<Integer> l2 = Arrays.stream(a1).boxed().toList();

        assertEquals(l1, l2);

    }
}
