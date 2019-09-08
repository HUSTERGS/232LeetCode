import org.junit.Test;
import static org.junit.Assert.*;

public class TestKDPIAA {
    @Test
    public void test1() {
        int[] arr1 = new int[] {1, 3, 1, 3, 1, 3};
        KDPIAA my = new KDPIAA();
        assertEquals(1, my.findPairs(arr1, 2));
    }

    @Test
    public void test2() {
        int[] arr1 = new int[] {3, 1, 4, 1, 5, 5};
        KDPIAA my = new KDPIAA();
        assertEquals(2, my.findPairs(arr1, 2));
    }
}
