class Solution {
    public int firstUniqChar(String s) {
//    BRUTE FORCE ::
   
    //     for(int i=0;i<s.length();i++){
    //         boolean flag=false;
    //         for(int j=0;j<s.length();j++){
    //             if(s.charAt(i)==s.charAt(j)&& i!=j){
    //                 flag=true;
    //                 break;
    //             }
    //         }
    //         if(flag==false){
    //            return i;
            
    //            }
    //       }
    //   return -1;
    
    
 
for(int i=0;i<s.length();i++){
    if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
    return i;
    }
}
    
    
    
    
    
return -1;    
    



    }
    }
