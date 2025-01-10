class Solution {
    public ListNode deleteMiddle(ListNode head) {
   ListNode slow=head,fast=head,curr=head,prev=null;
   if(head==null || head.next==null) return null;

   while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
   }

  while(curr!=slow){
    prev=curr;
    curr=curr.next;
  }

 if(curr!=null){
    prev.next=curr.next;
    curr.next=null;
 }

return head;

    }
}