class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        Map<Character, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for(String word : words2) {
            int[] freq = new int[26];
            for(char ch : word.toCharArray()) {
                freq[ch-'a']++;
            }

            for(int i=0; i<26; i++) {
                if(freq[i] != 0) {
                    char ch = (char) (i + 'a');
                    if(!map.containsKey(ch)) {
                        map.put(ch, freq[i]);
                    } else {
                        int maxFreq = Math.max(map.get(ch), freq[i]);
                        map.put(ch, maxFreq);

                    }
                }
            }
        }

        for(String word : words1) {
            int[] freq = new int[26];
            for(char ch : word.toCharArray()) {
                freq[ch-'a']++;
            }
            boolean found = true;
            for(Map.Entry<Character, Integer> entry : map.entrySet()) {
                int ind = entry.getKey() - 'a';
                if(freq[ind]<entry.getValue()) {
                    found = false;
                    break;
                }
            }
            if(found) res.add(word);
        }
        return res;
    }
}