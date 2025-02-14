package xiaochuan.test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {
    @Test
    public void t1() {
        Predicate<String> isEmpty = s -> s.isEmpty();

        assertEquals(isEmpty.test(""), true);

    }

    @Test
    public void t2() {
        
        Function<Integer, Integer> f = a -> a + 1;

        assertEquals(1, f.apply(0).intValue());

    }

    @Test
    public void t3() {
        Runnable f = () -> System.out.println("hello world");
        f.run();
    }
}
