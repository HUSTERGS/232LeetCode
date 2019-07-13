import org.junit.Test;
import static org.junit.Assert.*;

public class SortAnArrayTest {

    @Test
    public void testFindSmallestIndex() {
        int[] input = {2, 1, 4, -10, 3};
        int expected = 3;

        int actual = SortAnArray.findSmallestIndex(input, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void testSwap() {
        int[] input = {2, 1, 4, -10, 3};
        int a = 1;
        int b = 3;
        int[] expected = {2, -10, 4, 1, 3};

        SortAnArray.swap(input, a, b);

        assertArrayEquals(input, expected);
    }

    @Test
    public void testSortAnArray() {
        int[] input = {2, 1, 4, -10, 3};
        int[] expected = {-10, 1, 2, 3, 4};

        int[] actual = SortAnArray.sortArray(input);

        assertArrayEquals(expected, actual);
    }

}