package xiaochuan.test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamTest {
    @Test
    public void t1() {
        Stream<String> s1 = Arrays.asList("person", "monkey").stream();

        List<Integer> l1 = s1
                            .map(s -> s.length())
                            .collect(Collectors.toList());


        assertEquals(l1, Arrays.asList(6, 6));

    }

    @Test
    public void t2() {

        String[] a1 = new String[]{"person", "monkey"};


        List<Integer> l1 = Arrays.stream(a1)
                            .map(s -> s.length())
                            .collect(Collectors.toList());


        assertEquals(l1, Arrays.asList(6, 6));

    }
}
