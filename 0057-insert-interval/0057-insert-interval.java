class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> ans = new LinkedList<>();
        int i =0;
        while(i<n && intervals[i][1]< newInterval[0]){
            ans.add(intervals[i]);
            i = i+1;
        }      
        while(i<n && intervals[i][0]<= newInterval[1] ){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i = i+1;
        }
        ans.add(newInterval);
        while(i<n){
            ans.add(intervals[i]);
            i = i+1;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}