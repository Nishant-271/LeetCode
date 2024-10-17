class Solution {
    public int maximumSwap(int num) {
        // Convert the number to a character array
        char[] ans = Integer.toString(num).toCharArray();
        boolean swap = false;
        int max = 0;

        // Edge case: if there's only one digit, return the number itself
        if (ans.length == 1) {
            return num;
        }

        // Traverse the array to find the best opportunity to swap
        for (int i = 0; i < ans.length; i++) {
            int c1 = ans[i] - '0'; // Convert character to integer

            // Find the maximum digit in the remaining part of the array
            int maxIdx = i;
            for (int j = i + 1; j < ans.length; j++) {
                int c2 = ans[j] - '0';
                if (c2 >= ans[maxIdx] - '0') {
                    maxIdx = j;
                }
            }

            // Swap if the found maximum digit is greater than the current digit
            if (ans[maxIdx] > ans[i]) {
                char temp = ans[i];
                ans[i] = ans[maxIdx];
                ans[maxIdx] = temp;
                break; // Only one swap is allowed, so we break here
            }
        }

        // Convert the character array back to an integer
        return Integer.parseInt(new String(ans));
    }
}