class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0;
        int rightSum =0;
        int ans = 0;
        for(int i=0;i<k;i++){
            leftSum+=cardPoints[i];
        }
        ans=leftSum;
        int r = cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            leftSum-=cardPoints[i];
            rightSum += cardPoints[r];
            r--;
            ans=Math.max(ans,leftSum+rightSum);
        }
        return ans;
    }
}