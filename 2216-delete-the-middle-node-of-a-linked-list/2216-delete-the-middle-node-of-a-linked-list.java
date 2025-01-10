class Solution {
    public ListNode deleteMiddle(ListNode head) {
   ListNode slow=head,fast=head,curr=head,prev_slow=null;
   if(head==null || head.next==null) return null;
 while(fast!=null && fast.next!=null){
    prev_slow=slow;
    slow=slow.next;
    fast=fast.next.next;   }

prev_slow.next=slow.next;
slow.next=null;

return head;

    }
}