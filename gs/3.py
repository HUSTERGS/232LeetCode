class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if s == "":
            return 0
        result = []
        #flag = False
        lastIndex = 0
        for index in range(len(s)):
            # 新加入一个元素的最长字串为1
            result.append(1)
            for subindex in range(index, lastIndex-1, -1):
                if s[subindex] == s[index] and subindex != index:
                    lastIndex = max(lastIndex, subindex+1)
                    break
            for subindex in range(lastIndex, index):
                result[subindex] += 1

            #flag = False
            #for subindex in range(index, -1, -1):
            #    # 倒序遍历result list
            #    # 如果当前指向的元素等于新加入的元素，说明出现了重复
            #    if s[subindex] == s[index] and subindex != index:
            #        #flag = True
            #        break
            #    # 如果当前指向的元素的最长字串到达了字符串的尾部并且之前没有出现重复的话
            #    if result[subindex] + subindex == index: #and not flag:
            #        result[subindex] += 1
        return max(result)

