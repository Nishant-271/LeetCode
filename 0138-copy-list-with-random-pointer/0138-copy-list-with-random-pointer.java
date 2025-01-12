class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        Node curr=head;
           Node newHead=null; Node prev=null;
        while(curr!=null){
            Node temp=new Node(curr.val);
            map.put(curr,temp);
            if(newHead==null){
                prev=temp;
                newHead=temp;
            }else{
                prev.next=temp;
                prev=temp;
            }
            curr=curr.next;
        }
  curr=head;
  Node nhead=newHead;
  while(curr!=null){
    nhead.random=map.get(curr.random);
    curr=curr.next;
    nhead=nhead.next;
  }

return newHead;
    }
}