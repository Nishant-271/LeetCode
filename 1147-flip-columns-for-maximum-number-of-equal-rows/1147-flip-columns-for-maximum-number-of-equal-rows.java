class Solution {
    public int maxEqualRowsAfterFlips(int[][] m) {
        Map<String, Integer> p = new HashMap<>();

        for (int i = 0; i < m.length; i++) {
            StringBuilder s = new StringBuilder();
            if (m[i][0] == 0) {
                for (int j = 0; j < m[i].length; j++) {
                    s.append(m[i][j]);
                }
            } else {
                for (int j = 0; j < m[i].length; j++) {
                    s.append(m[i][j] ^ 1);
                }
            }
            String r = s.toString();
            p.put(r, p.getOrDefault(r, 0) + 1);
        }

        int max = 0;
        for (String k : p.keySet()) {
            max = Math.max(max, p.get(k));
        }

        return max;
    }
}

/*explaination

Input Matrix:

[0, 1]
[1, 0]

Processing the Rows:
First Row [0, 1]:
The first element is 0, so the row is taken as it is: "01".
Add "01" to the Map with a count of 1.
Map now: {"01": 1}.

Second Row [1, 0]:
The first element is 1, so the row is flipped:
1 → 0 and 0 → 1, resulting in "01".
"01" already exists in the Map, so its count is incremented by 1.
Map now: {"01": 2}.

Finding the Maximum:
Iterate through the Map:
"01" has a count of 2.
The maximum value is 2.

Output:
The maximum number of rows with identical patterns (after flipping) is 2.
*/