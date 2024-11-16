class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int min = 0;
        int first = 0;
        int n = nums.length;
        int[] res = new int[n - k + 1];
        if (k == 1) {
            for (int i = 0; i < n; ++i) {
                res[i] = nums[i];
            }
            return res;
        }
        if (n == 1) {
            res[0] = nums[0];
            return res;
        }
        for (int i = 1; i < n; ++i) {
            if (nums[i] != nums[i - 1] + 1) {
                first = i;
            }
            if (i >= k - 1) {
                if (first == min) {
                    res[min] = nums[i];
                } else {
                    res[min] = -1;
                }  
                if (first == min) ++first;
                ++min;
            }
        }
        return res;
    }
}