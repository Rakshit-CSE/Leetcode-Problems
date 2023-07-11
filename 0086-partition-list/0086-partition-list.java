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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);

        ListNode templeft = left;
        ListNode tempright = right;

        while(head!=null)
        {
            if(head.val<x)
            {
                templeft.next = head;
                templeft = templeft.next;
            }
            else
            {
                tempright.next = head;
                tempright = tempright.next;
            }
            head=head.next;
        }
        templeft.next=right.next;
        tempright.next=null;

        return left.next;
    }
}