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
    public ListNode oddEvenList(ListNode head) {
         if(head==null || head.next==null) return head;
         ListNode odd=head;
         ListNode even=head.next;

         ListNode evenStart=head.next;
         while(even!=null && even.next!=null){
            odd.next=even.next;
            even.next=even.next.next; 
             // whenever use even.next.next
            //   then make sure even.next is not null so to avoid 
            // that apply this is also as the condition
            odd=odd.next;
            even=even.next;
         }
    odd.next=evenStart;

return head;
    }
}