class Solution {
    public int trap(int[] height) {
        int left_max_height[]=getLeft(height);
 int right_max_height[]=getRight(height);
 int sum=0;
for(int i=0;i<height.length;i++){
   int hh=Math.min(left_max_height[i],right_max_height[i]) -height[i];
   sum+=hh;

}

return sum;
    }
    public static int[] getLeft(int []height){
        int left[]=new int[height.length];
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        return left;
    }
   
    public static int[] getRight(int []height){
        int right[]=new int[height.length];
        right[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        return right;
    }




}