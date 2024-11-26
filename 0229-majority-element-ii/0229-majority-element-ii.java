class Solution {
    public List<Integer> majorityElement(int[] nums) {
     
    //  BRUTE FORCE :
//   List<Integer> ll=new ArrayList<>();
//     for(int i=0;i<nums.length;i++){
//       if(ll.size()==0 || ll.get(0)!=nums[i]){
//            int count=0;
//            for(int j=0;j<nums.length;j++){
//             if(nums[j]==nums[i]){
//                 count++;
//             }
//            }
//            if(count>nums.length/3){
//             ll.add(nums[i]);
//            }
//         if(ll.size()==2) break;
//       }
//     }

// return ll;






    //  BETTER APPROCH 
    //   List<Integer> arr=new ArrayList<>();
    //   HashMap<Integer,Integer> map=new HashMap<>();
    //   int max=(int)nums.length/3+1;
    //   for(int i:nums){
    //     map.put(i,map.getOrDefault(i,0)+1);
    //     if(map.get(i)==max){
    //         arr.add(i);
    //     }
    //     if(arr.size()==2) break;
    //   }

//  OPTIMAL SOLUTION : BOyer's moore's voting algorithm ::

List<Integer> arr=new ArrayList<>();
int count1=0,count2=0,el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
for(int i:nums){
    if(count1==0 && i!=el2){
        count1=1;
        el1=i;
    }
    else if(count2==0 && i!=el1){
        count2=1;
        el2=i;
    }
    else if(el1==i) count1++;
    else if(el2==i) count2++;

    else{
        count1--;
        count2--;
    }
}
 
count1=0; count2=0;
for(int i:nums){
    if(i==el1) count1++;
    if(i==el2) count2++;
}
if(count1>nums.length/3)
arr.add(el1);
if(count2>nums.length/3)
arr.add(el2);







return arr;
    }
}