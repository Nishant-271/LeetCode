/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return ff(head,null,null);
    }

 public static ListNode ff(ListNode curr,ListNode temp,ListNode prev){
    if(curr==null) return prev;
        
           temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
         return   ff(curr,temp,prev);

 }

}