/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode ans = addTwoNumbers2(l1,l2);
        return reverse(ans);
    }

    public static ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null)
        {
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        ListNode Dummy = new ListNode(0);
        ListNode temp = Dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0)
        {
            int num1 = (l1!=null)?l1.val:0;
            int num2 = (l2!=null)?l2.val:0;
            int sum = num1+num2+carry;
            int digit = sum%10;
            carry = sum/10;
            ListNode newNode = new ListNode(digit);
            temp.next = newNode;
            temp = temp.next;

            l1 = (l1!=null)? l1.next : null;
            l2 = (l2!=null)? l2.next : null;
            
        }
        return Dummy.next;
    }
}