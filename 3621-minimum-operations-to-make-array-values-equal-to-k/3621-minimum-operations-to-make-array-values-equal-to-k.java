class Solution {
    public int minOperations(int[] nums, int k) {
        boolean[] map = new boolean[101];
        for (int i : nums) {
            if (i < k) {
                return -1;
            }
            map[i] = true;
        }
        int res = 0;
        for (int i = k + 1; i < 101; i++) {
            if (map[i]) {
                res++;
            }
        }
        return res;
    }
}