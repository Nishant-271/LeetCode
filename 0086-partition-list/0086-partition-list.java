class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(-1);
        ListNode sp=small;
       
        ListNode large=new ListNode(-1);
        ListNode lp=large;

        while(head!=null){
            if(head.val<x){
                ListNode temp=new ListNode(head.val);
                sp.next=temp;
                sp=sp.next;
                head=head.next;
            }else{
                ListNode temp=new ListNode(head.val);
                lp.next=temp;
                lp=lp.next;
                head=head.next;
            }
        }
     sp.next=large.next;

  return small.next;



    }
}