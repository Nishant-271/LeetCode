class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

  HashSet<Integer> st=new HashSet<>();
  for(int i:nums) st.add(i);
    while(st.contains(head.val)){
         ListNode temp=head;
        head=head.next;
        temp.next=null;  // deleting the node
        //  completeling not left in a hanging position 

    }
   ListNode curr=head;
   while(curr.next!=null){
   if(st.contains(curr.next.val)){
     ListNode temp2=curr.next;
    curr.next=curr.next.next;
    temp2.next=null;
   }
   else{
    curr=curr.next;
   }

   }

return head;

    }
}