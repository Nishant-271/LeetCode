import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Create a HashMap to store the frequency of each letter in the magazine
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        
        // Populate the magazineMap with frequencies of letters in the magazine
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }
        
        // Check if ransomNote can be constructed from magazine
        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false; // Not enough occurrences of this letter
            }
            magazineMap.put(c, magazineMap.get(c) - 1); // Use one occurrence of this letter
        }
        
        return true; // All letters in ransomNote can be constructed from magazine
    }
}
