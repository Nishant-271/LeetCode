class Solution {
    public int smallestNumber(int n, int t) {
        int result = 0;

        for (int i = n; i<=100; i++) {

            String s = String.valueOf(i);
            int p = 1;

            for (Character c:s.toCharArray()) {
                p *= Integer.parseInt(c.toString());
            }

            if (p % t == 0) {
                result = i;
                break;
            }
        }

        return result;
    }
}