class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        // Iterative approch
        if(head==null || head.next==null) return head;

        ListNode curr=head;
        ListNode temp=curr.next;
        while(temp!=null){
        ListNode gcd=new ListNode(gcomd(curr.val,curr.next.val));
            curr.next=gcd;
            gcd.next=temp;
            curr=temp;
            temp=temp.next;
        }
return head;

    }
 public int gcomd(int a,int b){
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
 }


}