class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> st=new HashSet<>();
         HashSet<Integer> ans=new HashSet<>();

         for(int i:nums1){
            st.add(i);
         }
          for(int i:nums2){
            if(st.contains(i)){
                ans.add(i);
            }
          }
          int j=0;
       int arr[]=new int[ans.size()];
      for(int i:ans){
        arr[j++]=i;
      }
      return arr;
    }
}