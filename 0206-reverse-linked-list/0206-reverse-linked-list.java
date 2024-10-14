class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode curr=head;
       ListNode temp,prev=null;
       while(curr!=null){
        temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
       }
return prev;
    }
}