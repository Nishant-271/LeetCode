class Solution {
    public int getDecimalValue(ListNode head) {
        String s="";
        while(head!=null){
            s+=head.val;
            head=head.next;
        }
        int j=Integer.parseInt(s,2);
        return j;

    }
}