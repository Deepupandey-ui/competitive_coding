public class FindtheMiddleIndexArray {
    public int findMiddleIndex(int[] nums) {
    
    //   for(int i =0;i<nums.length;i++){
    //        int sumLeft = 0;
    //         for(int j=0;j<i;j++){
    //             sumLeft+=nums[j];
    //         }
    //       int sumRight =0;
    //      for(int j=i+1;j<nums.length;j++){
    //       sumRight+=nums[j];
    //     }
    //     if(sumLeft==sumRight){
    //         return i;
    //     }
    //   } 
      
    //     return -1;
      int total = 0;
      for(int i=0;i<nums.length;i++){
        total+=nums[i];
      }
       int leftSum=0;
       int rightSum = total;
       for(int i =0;i<nums.length;i++){
        rightSum -= nums[i];
        if(leftSum==rightSum){
            return i;
        }
        leftSum+=nums[i];
       }
       return -1;
    }
}

