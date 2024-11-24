class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr = new ArrayList<>();
        long res = 1; // Use long to prevent overflow
        arr.add((int) res); // First value is always 1
        for (int col = 1; col <= rowIndex; col++) {
            res = res * (rowIndex - col + 1) / col; // Proper order of operations
            arr.add((int) res); // Add the computed value
        }
        return arr;
    }
}
