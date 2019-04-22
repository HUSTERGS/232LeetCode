/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    nums.sort(compare);
    return nums[parseInt(nums.length/2)];
};
var compare = function(num1, num2)
{
    if (num1 > num2)
        return 1;
    if (num1 < num2)
        return -1;
    if (num1 == num2)
        return 0;
}