// idea is very similar to Counting Sort runs in O(n). here we have alphabets instead of numbers and their order is custom-defined by order String.
class Solution {
    public String customSortString(String order, String s) {
        //Datastructures:
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> freqMap = new HashMap<>();

        //Step 1: Build the frequency map
        for (char c : s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
        }

        //Step 2: Build the String using StringBuilder
        for (char c : order.toCharArray()){
            if (freqMap.containsKey(c)){
                sb.append(String.valueOf(c).repeat(freqMap.get(c))); // repeating freq of char
                freqMap.remove(c);
            }
        }

        //Step 3: append the remaining char in freqMap / String 's'
        for (char c : freqMap.keySet()){
            sb.append(String.valueOf(c).repeat(freqMap.get(c)));
        }

        return sb.toString();

    }
}