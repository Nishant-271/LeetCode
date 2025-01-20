class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
   
   HashSet<Integer> st=new HashSet<>();
   for(int i:nums) st.add(i);
   ListNode dummy=new ListNode(0);
   dummy.next=head;

   ListNode curr=dummy;
   while(curr.next!=null){
    if(st.contains(curr.next.val)){
        curr.next=curr.next.next;
    }
    else{
        curr=curr.next;
    }
   }
return dummy.next;

    }
}