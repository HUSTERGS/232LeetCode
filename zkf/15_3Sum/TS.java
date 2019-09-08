import java.util.*;

class TS {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> retList = new LinkedList<>();
        for (int index = 0; index < nums.length - 2; index++) {
            if (index == 0 || (index > 0 && nums[index] != nums[index - 1])) {
                int target = 0 - nums[index], lo = index + 1, hi = nums.length - 1;
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == target) {
                        retList.add(Arrays.asList(nums[index], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) {
                            lo++;
                        }
                        while (lo < hi && nums[hi] == nums[hi - 1]) {
                            hi--;
                        }
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] > target) {
                        while (lo < hi && nums[hi] == nums[hi - 1]) {
                            hi--;
                        }
                        hi--;
                    } else {
                        while (lo < hi && nums[lo] == nums[lo + 1]) {
                            lo++;
                        }
                        lo++;
                    }
                }
            }
        }
        return retList;
    }
}