# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        # solution2    
        # time : 92.9%
        # memory : 5.16%
        num1 = 0
        num2 = 0
        index = 0
        result = ListNode(0)
        head = result
        while l1:
            num1 +=  l1.val * (10 ** index)
            l1 = l1.next
            index += 1
        index = 0
        while l2:
            num2 +=  l2.val * (10 ** index)
            l2 = l2.next
            index += 1
        num = num1 + num2
        while num:
            result.next = ListNode(num % 10)
            num = num / 10
            result = result.next
        return head.next

        # solution1 
        #result = ListNode(0)
        #head = result
        #carry_over = 0
        #while l1 or l2:
        #    result.next = ListNode(((l1.val if l1 != None else 0) + (l2.val if l2 != None else 0) + carry_over) % 10)
        #    carry_over = ((l1.val if l1 != None else 0) + (l2.val if l2 != None else 0) + carry_over) / 10
        #    result = result.next
        #    if l1:
        #        l1 = l1.next
        #    if l2:
        #        l2 = l2.next
        #if carry_over:
        #    result.next = ListNode(carry_over)
        #return head.next