class Solution {
    public long minEnd(int n, int x) {
        ArrayList<Integer> bits = new ArrayList<>();
        ArrayList<Integer> xbits = new ArrayList<>();
        
        
        int check = n - 1;
        while (check > 0) {
            bits.add(check % 2);
            check /= 2;
        }

     
        while (x > 0) {
            xbits.add(x % 2);
            x /= 2;
        }

        int index = 0;
        int count = 0;
        long ans = 0;

        for (int i = 0; i < xbits.size(); i++) {
            if (xbits.get(i) == 1) {
                ans += (1L << count);
            } else {
                if (index < bits.size() && bits.get(index) == 1) {
                    ans += (1L << count);
                }
                index++;  
            }
            count++;
        }

     
        while (index < bits.size()) {
            if (bits.get(index) == 1) {
                ans += (1L << count);
            }
            count++;
            index++;
        }

        return ans;
    }
}