class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
   List<Integer> ll=new ArrayList<>();
   for(ListNode node:lists){
    while(node!=null){
      ll.add(node.val);
      node=node.next;
   }
}

 Collections.sort(ll);

 ListNode head=new ListNode(-1);
 ListNode temp=head;
 for(int val:ll){
    temp.next=new ListNode(val);
    temp=temp.next;
 }

return head.next;
    }
}