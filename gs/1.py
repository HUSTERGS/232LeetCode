class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        #length = len(nums)
        #for index in range(0, length-1):
        #    for subindex in range(index + 1, length):
        #        if nums[index] + nums[subindex] == target:
        #            return [index, subindex]
        for index in range(0, len(nums)):
            if target - nums[index] in nums and index != nums.index(target-nums[index]):
                return [index, nums.index(target-nums[index])]