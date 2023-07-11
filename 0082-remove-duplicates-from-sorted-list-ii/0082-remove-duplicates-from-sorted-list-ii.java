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
        if(head==null || head.next==null) return head;
        HashMap<Integer,Integer> mp = new HashMap<>();
        ListNode Dummy = new ListNode(0);

        ListNode temp = Dummy;
        ListNode curr = head;

        while(curr!=null)
        {
            if(mp.containsKey(curr.val))
            {
                mp.put(curr.val,mp.get(curr.val)+1);
            }
            else
            {
                mp.put(curr.val,1);
            }
            curr=curr.next;
        }
        curr = head;
        while(curr!=null)
        {
            if(mp.get(curr.val)==1)
            {
                temp.next=curr;
                temp = temp.next;
            }
            curr=curr.next;
        }
        if(temp.next!=null)
        {
            temp.next=null;
        }
        return Dummy.next;
    }
}