class Solution {
    public int thirdMax(int[] nums) {
            Set<Integer> st=new HashSet<>() ;
       for(int i : nums){
        st.add(i);
       }
     List<Integer> ll=new ArrayList<>(st);
     Collections.sort(ll,Collections.reverseOrder());

     if(ll.size()>=3){
        return ll.get(2);
     }
    return ll.get(0);
    
    }

}