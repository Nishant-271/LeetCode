class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
         for(int i:nums1) s1.add(i);
         for(int i:nums2) s2.add(i);
    List<Integer> temp1=new ArrayList<>(s1);
       temp1.removeAll(s2);
    List<Integer> temp2=new ArrayList<>(s2);
       temp2.removeAll(s1);
      ans.add(temp1);
      ans.add(temp2);

return ans;
    }
}