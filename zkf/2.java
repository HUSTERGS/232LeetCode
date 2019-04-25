/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode output = null;
        ListNode currentNode = null;
        int tempSum = 0;
        int sum = 0;
        int carry = 0;
            
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                tempSum = l2.val + carry;
                sum = tempSum % 10;
                carry = tempSum / 10;
                l2 = l2.next;
            }
            else if (l2 == null) {
                tempSum = l1.val + carry;
                sum = tempSum % 10;
                carry = tempSum / 10;
                l1 = l1.next;
            }
            else {
                tempSum = l1.val + l2.val + carry;
                sum = tempSum % 10;
                carry = tempSum / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            
            if (currentNode == null) {
                currentNode = new ListNode(sum);
                currentNode.next = null;
                output = currentNode;
            }
            else{
                currentNode.next = new ListNode(sum);
                currentNode = currentNode.next;
                currentNode.next = null;
            }
        }
        if (carry != 0) {
            currentNode.next = new ListNode(carry);
            currentNode = currentNode.next;
            currentNode.next = null;
        }
        return output;
    }
}