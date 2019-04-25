a = 'bikwmb'
class Solution:
    def lengthOfLongestSubstring(self, s):
        '''
        str->int
        '''

        count = 0   #计算已经到哪一个元素
        sum = [0,] #无重复字串个数
        sum_count = 0
        com = []
    
        while(count<len(s)):
            for elem in com:
                if (elem == s[count]):

                    sum_count+=1
                    sum.append(len(com))
                    #print(sum[sum_count])
                    #print(com)

                    alex = len(com)
                    #print('---'+str(alex))
                    for i in range(alex):
                        #print(i)
                        if(com[0]!= s[count]):
                            com.pop(0)
                        elif(com[0] == s[count]):
                            com.pop(0)
                            sum[sum_count]=len(com)
                            break
                    break
            com.append(s[count])
            sum[sum_count]+=1
            count+=1
        return max(sum)

alex=Solution()
print(alex.lengthOfLongestSubstring(a))
