import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class TestTS {
    @Test
    public void test3Sum() {
        TS my = new TS();
        int[] nums = new int[] {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> returnList = my.threeSum(nums);

        for (List<Integer> aList : returnList) {
            int sum = 0;
            for (int number : aList) {
                sum += number;
            }
            assertEquals(0, sum);
        }

        for (List<Integer> aList : returnList) {
            for (int number : aList) {
                System.out.print(number);
            }
            System.out.println();
        }
    }

    @Test
    public void test3Sum_1() {
        TS my = new TS();
        int[] nums = new int[] {0, 0, 0};
        List<List<Integer>> returnList = my.threeSum(nums);

        for (List<Integer> aList : returnList) {
            int sum = 0;
            for (int number : aList) {
                sum += number;
            }
            assertEquals(0, sum);
        }

        for (List<Integer> aList : returnList) {
            for (int number : aList) {
                System.out.print(number);
            }
            System.out.println();
        }
    }

    @Test
    public void test3Sum_2() {
        TS my = new TS();
        int[] nums = new int[] {-2,-3,0,0,-2};
        List<List<Integer>> returnList = my.threeSum(nums);

        for (List<Integer> aList : returnList) {
            int sum = 0;
            for (int number : aList) {
                sum += number;
            }
            assertEquals(0, sum);
        }

        for (List<Integer> aList : returnList) {
            for (int number : aList) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
