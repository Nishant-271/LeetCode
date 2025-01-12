class Solution {
    public int pairSum(ListNode head) {
   Stack<Integer> st=new Stack<>();
    ListNode temp=head;
    int length=0;
    while(temp!=null){
        st.push(temp.val);
        temp=temp.next;
       length++;
    }       
  int max=0; temp=head;
  int k=length/2;
  while(0<k){
   max=Math.max(max,temp.val+st.pop());
   temp=temp.next;
   k--;
  }

return max;
    }
}