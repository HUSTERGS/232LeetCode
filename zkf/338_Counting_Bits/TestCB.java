import org.junit.Test;
import static org.junit.Assert.*;

public class TestCB {
    @Test
    public void test1() {
        CB myCB = new CB();
        assertArrayEquals(new int[] {0,1,1}, myCB.countBits(2));
    }

    @Test
    public void test2() {
        CB myCB = new CB();
        assertArrayEquals(new int[] {0,1,1,2,1,2}, myCB.countBits(5));
    }
}
