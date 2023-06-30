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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode h=head;
        ListNode c=head;
        while(c.next!=null){
            if(c.val==c.next.val){
                ListNode nxt=c.next.next;
                c.next=nxt;
            }
            else{
                c=c.next;
            }
        }   
        return h;
    }
}