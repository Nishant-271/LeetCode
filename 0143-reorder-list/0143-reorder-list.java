class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }

        ListNode rev=reverse(slow);
        ListNode curr=head;
        while(rev.next!=null){
            ListNode temp=curr.next;
            ListNode temp_rev=rev.next;
            curr.next=rev;
            rev.next=temp;
            curr=temp;
            rev=temp_rev;
        }

    }
    public static ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
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