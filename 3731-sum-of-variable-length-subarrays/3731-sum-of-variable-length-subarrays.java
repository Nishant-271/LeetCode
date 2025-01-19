class Solution {
    public int subarraySum(int[] nums) {
        // base : 
        if( nums.length == 1 ) return nums[0] ; 

        int s = 0 , sum = 0 ; 

        // prefix sum 
        for( int i = 1 ; i < nums.length ; i++ ) nums[i]+=(nums[i-1]) ; 

        for( int i = 0 ; i < nums.length ; i++ ){
            
            // handle starting 
            if( i == 0 ) s = Math.max( 0 , i - nums[i]) ;
            else s = Math.max(0, i - (  nums[i] - nums[i - 1])) ; 

            if( s == 0 ) sum+=nums[i] ;
            else sum+=(nums[i] - nums[s - 1]) ; 
            
            
        }   
        
        return sum ; 
    }
}