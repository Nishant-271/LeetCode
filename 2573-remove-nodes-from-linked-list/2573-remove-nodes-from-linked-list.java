class Solution {
    public ListNode removeNodes(ListNode head) {
        // Travel from right to left to avoid n2
        Stack<Integer> st=new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            st.push(curr.val);
            curr=curr.next;
}
       ListNode ans=new ListNode(st.peek());
       int max=st.peek();
       st.pop();

       while(!st.isEmpty()){
        int val=st.peek();
        if(val<max){
            st.pop();
        }
        else{
            ListNode newNode=new ListNode(st.pop());
            newNode.next=ans;
            ans=newNode;
            max=newNode.val;

        }
       }
   
return ans;
    }
}