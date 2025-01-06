class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode t1=l1,t2=l2,head=new ListNode(100), ans=head;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                ans.next=t1;
                ans=ans.next;
                t1=t1.next;
            }
            else{
                ans.next=t2;
                ans=ans.next;
                t2=t2.next;

            }
        }
       if(t1==null){
        ans.next=t2;
       }
       if(t2==null){
        ans.next=t1;
       }

return head.next;
    }
}