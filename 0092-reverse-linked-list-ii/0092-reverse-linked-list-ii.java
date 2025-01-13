class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
   if(head==null || left>right) return null;
   if(left==right) return head;
   
    ListNode dummy=new ListNode(-1);
    dummy.next=head;

    ListNode slow=dummy;
    ListNode fast=head;
    for(int i=1;i<right;i++){
        fast=fast.next;
    }
  for(int i=1;i<left;i++){
    slow=slow.next;
  }
  ListNode tail=fast.next;
  fast.next=null;
  ListNode prev=reverse(slow.next);
  slow.next=prev;
  ListNode curr=slow.next;
  while(curr.next!=null){
    curr=curr.next;
  }
curr.next=tail;
return dummy.next;

   }

    public static ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode curr=head,temp=null,prev=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

}