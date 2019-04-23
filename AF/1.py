
number=[1,2,3,4]
t=7
class Solution:
#def twoSum(self, nums: List[int], target: int) -> List[int]:
	def twoSum(self,nums,target):
		length = len (nums)
		for i in range(length):
			mid=target-nums[i]
			for j in range(length):
				if nums[j]==mid and i!=j:
					return [i,j]
		return False
alex=Solution()
print(alex.twoSum(number,t))