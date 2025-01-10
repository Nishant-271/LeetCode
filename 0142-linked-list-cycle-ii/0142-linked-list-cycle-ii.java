public class Solution {
    public ListNode detectCycle(ListNode head) {
 ListNode slow=head,fast=head,temp=head;
 if(head==null || head.next==null) return null;

 while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
    if(fast==slow) break; // here is cycle
 }
if(fast==null || fast.next==null) return null;

 while(temp!=slow){
    temp=temp.next;
    slow=slow.next;
 }
 
return temp;

    }
}