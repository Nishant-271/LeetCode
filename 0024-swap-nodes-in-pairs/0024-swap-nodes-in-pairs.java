class Solution {
    public ListNode swapPairs(ListNode head) {
   if(head==null || head.next==null) return head;

   ListNode A=head, B=head.next, C=head.next.next;
   A.next=swapPairs(C);
   B.next=A;
   return B;
  }
}