class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         HashMap<Integer,Integer> map=new HashMap<>();   ListNode temp=head;
         while(temp!=null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp=temp.next;     }

 ListNode head2=null , tail=null; temp=head;
 while(temp!=null){
    int key=temp.val;   int count=map.get(key);

  if(count==1){
    ListNode nn=new ListNode(key);

  if(head2==null){
    head2=nn; tail=nn;
  }
  else{
    tail.next=nn;
    tail=nn;
  }


  }

temp=temp.next;



 }

return head2;
    }
}