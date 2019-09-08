import org.junit.Test;
import static org.junit.Assert.*;

public class TestZC {
    @Test
    public void test1() {
        ZC myZC = new ZC();
        assertEquals("PAHNAPLSIIGYIR", myZC.convert("PAYPALISHIRING", 3));
    }
    @Test
    public void test2() {
        ZC myZC = new ZC();
        assertEquals("PINALSIGYAHRPI", myZC.convert("PAYPALISHIRING", 4));
    }
    @Test
    public void test3() {
        ZC myZC = new ZC();
        assertEquals("AB", myZC.convert("AB", 1));
    }
}
