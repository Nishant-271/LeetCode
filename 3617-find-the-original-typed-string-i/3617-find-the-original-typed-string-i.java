class Solution {
    public int possibleStringCount(String word) {
        int ans = 1;
        int count = 1;
        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) == word.charAt(i-1)) {
                count++;
            } else {
                ans = ans + count - 1;
                count = 1;
            }
        }
        ans = ans + count - 1;
        return ans;
    }
}