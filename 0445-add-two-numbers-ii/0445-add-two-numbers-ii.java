class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//   To Not use the reverse of the linked list
  Stack<Integer> st1=new Stack<>();
  Stack<Integer> st2=new Stack<>();
  while(l1!=null){
    st1.push(l1.val);
    l1=l1.next;
  }
 
  while(l2!=null){
    st2.push(l2.val);
    l2=l2.next;
  }

  int sum=0,carry=0; ListNode ans=new ListNode();
  while(!st1.isEmpty()  ||  !st2.isEmpty()){
     if(!st1.isEmpty()){
        sum+=st1.peek();
        st1.pop();
     }           
     if(!st2.isEmpty()){
        sum+=st2.peek();
        st2.pop();
     }

  ans.val=sum%10;
  carry=sum/10;
  ListNode newNode =new ListNode(carry);
  newNode.next=ans;
  ans=newNode;
   sum=carry;
  }

   return (ans.val==0)?ans.next:ans;

    }
}