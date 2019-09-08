import org.junit.Test;
import static org.junit.Assert.*;

public class TestMOSTSA {
    @Test
    public void test1() {
        int[] nums1 = new int[] {1, 3};
        int[] nums2 = new int[] {2};
        MOTSA my = new MOTSA();
        assertEquals(2.0, my.findMedianSortedArrays(nums1, nums2), 0.00001);
    }
}
