class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        ArrayList<Character> arr[] = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new ArrayList<>();
        }
        int bounce = 0, direction = 1;
        for (char c : s.toCharArray()) {
            if (bounce == 0) {
                direction = 1;
            }
            if (bounce == numRows - 1) {
                direction = -1;
            }
            arr[bounce].add(c);
            bounce = bounce + direction;
        }
        StringBuilder sb = new StringBuilder();
        for (ArrayList<Character> i : arr) {
            for (char c : i) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}