class Solution {
    public ListNode swapNodes(ListNode head, int k) {
       if(head==null || head.next==null) return head;
       
        int i=1;
       int length=0;
        ListNode temp=head;
       while(temp!=null){
        temp=temp.next;
        length++;
       }
       
       ListNode slow=head,fast=head;
        while(i<k){
            slow=slow.next;
            i++;
        }
        i=1;
        while(i<(length-k+1)){
            fast=fast.next;
            i++;
        }

        int ran=slow.val;
        slow.val=fast.val;
        fast.val=ran;

   return head;
    }

}