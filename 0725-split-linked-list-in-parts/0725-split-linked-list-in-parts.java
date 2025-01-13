class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
   int size=0;
   ListNode temp=head;
   while(temp!=null){
    size++;
    temp=temp.next;
   }

   int max=size/k;
    int extra=size%k;
    ListNode[] ans=new ListNode[k];
temp=head; 
   for(int i=0;i<k;i++){
    if(temp==null) break;
    ListNode currhead=temp;
    ListNode prev=temp; int len=0;
    while(temp!=null && len<max){
        prev=temp;
        temp=temp.next;
        len++;
    }
    if(extra>0){
        prev=temp;
        temp=temp.next;
        extra--;
    }
    prev.next=null;
    ans[i]=currhead;

   }

return ans;
    }
}