class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        # solution1
        #a = nums1 + nums2
        #a.sort()
        #return (a[int((len(a)-1)/2)] + a[int(len(a)/2)])/2
        
        


        # Solution2
        index1 = len(nums1) - 1
        index2 = len(nums2) - 1 
        # 如果是偶数就是0,如果是奇数就是1
        #flag = 1 if (len(num1) + len(num2)) % 2 else 0
        length = len(nums1) + len(nums2)
        if len(nums1) + len(nums2) <= 4:
            a = nums1 + nums2
            a.sort()
            return (a[int((len(a)-1)/2)] + a[int(len(a)/2)])/2

        
        while index1 >= 0 and index2 >= 0:
            if nums1[index1] > nums2[index2]:
                nums1.pop()
                index1 -= 1
            else:
                nums2.pop()
                index2 -= 1
            if index1 + index2 + 1 == int(length / 2) and index1 != -1 and index2 != -1: 
                if length % 2:
                    return max(nums1[index1], nums2[index2])
                else:
                    return (nums1[index1] + nums2[index2])/2
        if index1 == -1:
            return (nums2[int(length / 2)] + nums2[int((length - 1)/2)])/2
        else:
            return (nums1[int(length / 2)] + nums1[int((length - 1)/2)])/2
test = Solution()
print(test.findMedianSortedArrays([1,2,2], [1,2,3]))
            
              