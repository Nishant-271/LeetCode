class Solution {
    public boolean isCircularSentence(String s) {
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        String[] words = s.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            String curr = words[i], next = words[i + 1];
            if (curr.charAt(curr.length() - 1) != next.charAt(0)) return false;
        }
        return true;
    }
}