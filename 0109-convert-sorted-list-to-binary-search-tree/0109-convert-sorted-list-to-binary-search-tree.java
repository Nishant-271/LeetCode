class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
    ListNode slow=head,fast=head,slow_prev=null;
    while(fast!=null && fast.next!=null){
        slow_prev=slow;
        slow=slow.next;
        fast=fast.next.next;
    }
    TreeNode root=new TreeNode(slow.val);
     slow_prev.next=null; // from mid we have to break the link towards left
    //  hand side.
    root.left=sortedListToBST(head);
    root.right=sortedListToBST(slow.next);
 
return root;
    }
}