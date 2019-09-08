import java.util.HashMap;

class TWOSUM {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int currNum = nums[index];
            if (map.containsKey(currNum)) {
                return new int[] {map.get(currNum), index};
            }
            map.put(target - currNum, index);
        }

        return null;
    }

    /**
     * Find the number of unique pairs whose sum is TARGET
     * @param nums
     * @param target
     * @return
     */
    public int twoSumCount(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int number : nums) {
            if (map.containsKey(number)) {
                if (map.get(number) == 1 && number * 2 == target) {
                    result++;
                }
                map.put(number, map.get(number) + 1);
            } else {
                if (map.containsKey(target - number)) {
                    result++;
                }
                map.put(number, 1);
            }
        }

        return result;
    }
}
