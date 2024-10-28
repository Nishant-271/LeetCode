class Solution {
    public int longestSquareStreak(int[] arr) {
        int len=arr.length;
        HashSet<Integer> set=new HashSet<>();
        if(len==2)
        {
            if(arr[0]==1 && arr[1]==1) return 2;
            Arrays.sort(arr);
            if(arr[1]==Math.pow(arr[0],2)) return 2;
            return -1;
        }
        for(int i=0;i<len;i++)
        {
            set.add(arr[i]);
        }
        // System.out.println(set);
        int res=1;
        int cnt=1;
        for(int i=0;i<len;i++)
        {
            if(set.contains((int)Math.pow(arr[i],2)))
            {int element=arr[i];
            cnt=1;
            
                while(true)
                {
                    if(!set.contains((int)Math.pow(element,2))) break;
                    else{
                        cnt++;
                        element=(int)Math.pow(element,2);
                    
                    }
                }
                res=Math.max(res,cnt);
            }
        }
        if(res==1) return -1;
        return res;



        
    }
}