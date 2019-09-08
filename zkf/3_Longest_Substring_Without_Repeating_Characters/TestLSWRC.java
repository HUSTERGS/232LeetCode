import org.junit.Test;
import static org.junit.Assert.*;

public class TestLSWRC {
    @Test
    public void Test1() {
        LSWRC testInstance = new LSWRC();
        assertEquals(3, testInstance.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void Test2() {
        LSWRC testInstance = new LSWRC();
        assertEquals(1, testInstance.lengthOfLongestSubstring("bbb"));
    }

    @Test
    public void Test3() {
        LSWRC testInstance = new LSWRC();
        assertEquals(3, testInstance.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void Test4() {
        LSWRC testInstance = new LSWRC();
        //testInstance.lengthOfLongestSubstring("abcbc");
        assertEquals(3, testInstance.lengthOfLongestSubstring("abcba"));
    }

    @Test
    public void Test5() {
        LSWRC testInstance = new LSWRC();
        assertEquals(1, testInstance.lengthOfLongestSubstring("a"));
    }
}
