class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {

    
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int prefixsum = 0;
        Map<Integer, ListNode> map = new HashMap<>();
        map.put(0, dummy);

        while (head != null) {
            prefixsum += head.val;
            if (!map.containsKey(prefixsum)) {
                map.put(prefixsum, head);
            } else {
                // if already present then we have to delete the node
                ListNode start = map.get(prefixsum);
                ListNode temp = start;
                int temp_sum = prefixsum;
                while (temp != head) {
                        temp = temp.next;
                        temp_sum += temp.val;
                    if (temp != head) {
                        map.remove(temp_sum);
                    }
                }
                start.next = head.next;
            }
            head = head.next;
        }

        return dummy.next;
    }
}