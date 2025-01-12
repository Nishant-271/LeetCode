   class Solution {
    public int pairSum(ListNode head) {
   List<Integer> ll=new ArrayList<>();
  ListNode temp=head;
   while(temp!=null){
    ll.add(temp.val);
    temp=temp.next;
   }
 
  int max=0;  int start=0,end=ll.size()-1;
   while(start<end){
       int sum=0;
       sum+=ll.get(start)+ll.get(end);
       max=Math.max(max,sum);
       start++; end--;
   }

return max;
    }
 }