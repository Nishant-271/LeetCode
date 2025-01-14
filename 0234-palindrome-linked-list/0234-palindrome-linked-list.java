class Solution {
    public boolean isPalindrome(ListNode head) {
//   Approch 1
if(head==null || head.next==null) return true;
ListNode slow=head,fast=head;
while(fast.next!=null && fast.next.next!=null){
    slow=slow.next;
    fast=fast.next.next;
}
 ListNode prev=reverse(slow.next,null);
 slow.next=prev;
         ListNode p1=head,p2=slow.next;
         while(p2!=null){
            if(p1.val!=p2.val) return false;
          p1=p1.next;
          p2=p2.next;
         }
return true;
    }

    public static ListNode reverse(ListNode curr,ListNode prev){
        if(curr==null){
            return prev;
        }
        ListNode temp=reverse(curr.next,curr);
        curr.next=prev;


        return temp;
    }
}