import org.junit.Test;
import static org.junit.Assert.*;

public class TestCWMW {
    @Test
    public void test1() {
        CWMW my = new CWMW();
        int[] input = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, my.maxArea(input));
    }

    @Test
    public void test2() {
        CWMW my = new CWMW();
        int[] input = new int[] {2, 3, 3, 2};
        assertEquals(6, my.maxArea(input));
    }

    @Test
    public void test3() {
        CWMW my = new CWMW();
        int[] input = new int[] {2};
        assertEquals(0, my.maxArea(input));
    }

    @Test
    public void test4() {
        CWMW my = new CWMW();
        int[] input = new int[] {2, 1};
        assertEquals(1, my.maxArea(input));
    }
}
