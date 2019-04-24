class Solution:
    def addTwoNumbers(self,l1,l2):
    	ans = ListNode(0)
    	r=ans
    	while(l1 or l2):
            if(l1!=None):
                a=l1.val
            else:a=0
            if(l2!=None):
                b=l2.val
            else:
                b=0
            mid=a+b+ans.val

            if mid>=10:
            	ans.val=mid%10
            	ans.next=ListNode(1)
            else:
            	ans.val=mid
            	ans.next=ListNode(0)
            if(l1!=None):
            	l1=l1.next
            if(l2!=None):
            	l2=l2.next
            if(l1!=None or ans.next.val!=0 or l2!=None):
            	ans=ans.next
            elif(l1==None and l2==None):
            	ans.next=None
    	return r