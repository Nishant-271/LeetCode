class Solution {
    public ListNode oddEvenList(ListNode head) {

   ListNode temp=head,odd=new ListNode(-1);
   ListNode even=new ListNode(-1);
   ListNode tempo=odd;
   ListNode tempe=even;


   int index=1;
   while(temp!=null){
    if(index%2!=0){
        ListNode a=new ListNode(temp.val);
        tempo.next=a;
        tempo=a;
        temp=temp.next;
    }
    else{
        ListNode a=new ListNode(temp.val);
        tempe.next=a;
        tempe=a;
        temp=temp.next;
    }
    index++;
   }

    even=even.next;
    tempo.next=even;

return odd.next;
    }
}