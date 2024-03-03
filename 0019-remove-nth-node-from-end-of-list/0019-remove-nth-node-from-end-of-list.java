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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        if(n==1 && head.next==null) return null;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        c = c-n;
        if(c==0)
        {
            ListNode temp2 = head;
            head = head.next;
            temp2.next=null;
        }
        ListNode fast = head;
        int x = c;
        while(x-->0)
        {
            fast=fast.next;
        }
        ListNode ahead = fast.next;
        fast.next = null;
        ListNode slow = head;
        while(c>1)
        {
            slow = slow.next;
            c--;
        }
        slow.next = ahead;
        return head;
        
    }
}