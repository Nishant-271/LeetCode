class Solution {
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String> st = new HashSet<>();
        for (String s : bank) {
            st.add(s);
        }

        // If the end gene is not in the bank, return -1
        if (!st.contains(end)) {
            return -1;
        }

        HashSet<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        int level = 0;
        String val = "ACGT";
        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                String curr = q.remove();
                if (curr.equals(end)) {
                    return level;
                }

                // Generate neighbors
                for (int j = 0; j < curr.length(); j++) {
                    char[] currArr = curr.toCharArray();
                    for (char ch : val.toCharArray()) {
                        if (currArr[j] != ch) { // Only change the character if it's different
                            currArr[j] = ch;
                            String nbr = new String(currArr);

                            // Check if the neighbor is valid
                            if (!visited.contains(nbr) && st.contains(nbr)) {
                                visited.add(nbr);
                                q.add(nbr);
                            }
                        }
                    }
                }
            }
            level++;
        }

        return -1; // If no path is found
    }
}
