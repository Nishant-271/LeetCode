class Solution {
    private ArrayList<Integer> arr = new ArrayList<>();

    public Solution(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
    }
/* Math.random generate double values [0.0 ,1.0]
 * after multipling it with arr.size() 5 then [0.0,5.0] then (int)
 * [0,5] so it will give all the values as 0,1,2,3,4 each
 one have probability of 1/5 that's how it is giving us the answer*/
       public int getRandom() {
        int i = (int) (Math.random() * arr.size());

        return arr.get(i);
    }
}
