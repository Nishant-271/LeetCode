class Solution {
    public int maxUniqueSplit(String s) {
        return backtrack(s, new HashSet<>());
    }
    
    private int backtrack(String s, HashSet<String> set) {
        // Base case: if the string is empty, return 0 as no more splits are possible
        if (s.isEmpty()) {
            return 0;
        }
        
        int maxSplits = 0;
        
        // Try splitting the string at every position
        for (int i = 1; i <= s.length(); i++) {
            String substring = s.substring(0, i);
            
            // If the current substring is unique (not already in the set)
            if (!set.contains(substring)) {
                set.add(substring);  // Add it to the set
                
                // Recursively check for the remaining string
                int splits = 1 + backtrack(s.substring(i), set);
                
                // Update the maximum number of splits
                maxSplits = Math.max(maxSplits, splits);
                
                set.remove(substring);  // Backtrack by removing the substring
            }
        }
        
        return maxSplits;
    }
}
