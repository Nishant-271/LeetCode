class Solution {
    public int pairSum(ListNode head) {
  ListNode slow_prev=null,slow=head,fast=head;
  while(fast!=null&& fast.next!=null){
    slow_prev=slow;
    slow=slow.next; fast=fast.next.next;
  }
slow_prev.next=null;
ListNode temp=head;
ListNode mid=reverse(slow);
int max=0;
while(mid!=null){
    max=Math.max(max,temp.val+mid.val);
    temp=temp.next;
    mid=mid.next;
}

return max;
    }
    public static ListNode reverse(ListNode head){
        ListNode curr=head,temp=null,prev=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}