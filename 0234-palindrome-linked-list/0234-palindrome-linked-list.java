class Solution {
    public boolean isPalindrome(ListNode head) {
         if(head==null || head.next==null) return true;
         ListNode slow=head,fast=head,slow_prev=null;
         while(fast.next!=null && fast.next.next!=null){
            slow_prev=slow;
            slow=slow.next;
            fast=fast.next.next;
         }
         slow.next=reverse(slow.next);
         ListNode p1=head,p2=slow.next;
         while(p2!=null){
            if(p1.val!=p2.val) return false;
            p1=p1.next;
            p2=p2.next;
         }
         return true;

    }

    public static ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode curr=head,prev=null,temp=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
return prev;
    }
}