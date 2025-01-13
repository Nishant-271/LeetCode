class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode slow=list1,temp=list1;
        int j=0;
        for(int i=1;i<a;i++){
            slow=slow.next;
            j=i;
        }
        ListNode fast=slow;
         for(int k=j;k<b;k++){
            fast=fast.next;
         }
         ListNode tail=fast.next;
         fast.next=null;
        //  Now connect 
        slow.next=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=tail;
return list1;
    }
}