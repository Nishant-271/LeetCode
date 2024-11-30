class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                int lengthSubArray = j - i + 1;
                if (lengthSubArray > r || lengthSubArray < l) {
                    continue;
                } 
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + nums.get(k);
                }
                if (sum <= 0) {
                    continue;
                }
                result = Math.min(result, sum);
            } 
        }
        if (result == Integer.MAX_VALUE) {
            return -1;
        }
        return result;
    }
}