class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         if(l1==null) return l2;
         if(l2==null) return l1;
         
         ListNode result=new ListNode(0);
         ListNode temp=result;
         if(l1.val<l2.val){
            temp.next=l1;
            temp=l1;
            temp.next=mergeTwoLists(l1.next,l2);
         }
        else{
            temp.next=l2;
            temp=l2;
            temp.next=mergeTwoLists(l1,l2.next);
         }
         return result.next;
    }
}