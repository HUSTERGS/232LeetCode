import org.junit.Test;
import static org.junit.Assert.*;

public class TestTWOSUM {
    @Test
    public void test1() {
        TWOSUM my = new TWOSUM();
        int[] nums = new int[] {2, 7, 11, 15};
        int[] rightAnswer = new int[] {0, 1};
        assertArrayEquals(rightAnswer, my.twoSum(nums, 9));
    }

    @Test
    public void test2() {
        TWOSUM my = new TWOSUM();
        int[] nums = new int[] {2, 2, 2};
        int[] rightAnswer = new int[] {0, 1};
        assertArrayEquals(rightAnswer, my.twoSum(nums, 4));
    }

    @Test
    public void testTwoSumCount_1() {
        TWOSUM my = new TWOSUM();
        int[] nums = new int[] {2, 2, 2};
        assertEquals(1, my.twoSumCount(nums, 4));
    }

    @Test
    public void testTwoSumCount_2() {
        TWOSUM my = new TWOSUM();
        int[] nums = new int[] {1, 3, 1, 3};
        assertEquals(1, my.twoSumCount(nums, 4));
    }

    @Test
    public void testTwoSumCount_3() {
        TWOSUM my = new TWOSUM();
        int[] nums = new int[] {1, 3, 2, 2, 3, 1};
        assertEquals(2, my.twoSumCount(nums, 4));
    }
}
