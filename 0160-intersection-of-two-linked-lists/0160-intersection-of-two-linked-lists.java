public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

   ListNode A=headA,B=headB;
   int l1=0,l2=0;
   while(A!=null){
    l1++; A=A.next;}
  
   while(B!=null){
    l2++; B=B.next;}


    A=headA;B=headB;
 if(l1>l2){
    int step=l1-l2;
for(int i=1;i<=step;i++){
    A=A.next;
}
 }else{
     int step=l2-l1;
for(int i=1;i<=step;i++){
    B=B.next;
}
    
 }

while(A!=B){
    A=A.next;
    B=B.next;
}
   
   return A;
    }

}