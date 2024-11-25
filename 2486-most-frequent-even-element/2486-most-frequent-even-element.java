class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(i%2==0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        int max=0;
        int res=-1;
        for(int i:map.keySet()){
                    if(map.get(i)==max){
                            res=Math.min(res,i);      
            
                    }
                 else if(map.get(i)>max){
                    res=i;   
                    max=map.get(i);

                  }
        }
        //  Collections.sort(list);
              
        //       if(list.size()!=0){
        //            res=  Math.max(res,list.get(0));   
        //       }
        return res;
        }
    }
