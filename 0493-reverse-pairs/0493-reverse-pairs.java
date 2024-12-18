import java.util.ArrayList;

class Solution {
    public int reversePairs(int[] nums) {
        return pairs(nums, nums.length);
    }

    public static int pairs(int nums[], int n) {
        return mergesort(nums, 0, n - 1);
    }

    public static int mergesort(int nums[], int low, int high) {
        int count = 0;
        if (low >= high) return count;
        int mid = (low + high) / 2;
        count += mergesort(nums, low, mid);
        count += mergesort(nums, mid + 1, high);
        count += countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);
        return count;
    }

    public static int countPairs(int nums[], int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) nums[i] > 2 * (long) nums[right]) right++;
            count += (right - (mid + 1));
        }
        return count;
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low, right = mid + 1, index = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
            }
        }
        while (left <= mid) temp[index++] = nums[left++];
        while (right <= high) temp[index++] = nums[right++];

        for (int i = low; i <= high; i++) {
            nums[i] = temp[i - low];
        }
    }
}
