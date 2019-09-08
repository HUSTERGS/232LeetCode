import org.junit.Test;
import static org.junit.Assert.*;

public class TestLPS {
    @Test
    public void test1() {
        LPS myLPS = new LPS();
        assertEquals("bab", myLPS.longestPalindrome("babad"));
    }

    @Test
    public void test2() {
        LPS myLPS = new LPS();
        assertEquals("bb", myLPS.longestPalindrome("cbbd"));
    }

    @Test
    public void test3() {
        LPS myLPS = new LPS();
        assertEquals("aba", myLPS.longestPalindrome("abacdfgdcaba"));
    }
}
