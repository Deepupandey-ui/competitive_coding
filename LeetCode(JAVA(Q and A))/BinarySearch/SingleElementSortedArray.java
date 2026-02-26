package BinarySearch;

public class SingleElementSortedArray {
   
    public int singleNonDuplicate(int[] nums) {
    //     int n = nums.length;
    //     if(nums[0]!=nums[1]){
    //         return nums[0];
    //     }
    //     if(nums[n-1]!=nums[n-2]){
    //         return nums[n-1];
    //     }
    //    for(int i=1;i<n-1;i++){
    //     if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
    //      return nums[i]; 
    //     }
    //    } 
    //    return -1;
      int i = 0;
      int j = nums.length-1;
      while(i<j){
        int mid = (i+j)/2;
        if(mid%2==1){
            mid--;
        }
        if(nums[mid]==nums[mid+1]){
            i = mid+2;
        }
        else{
            j=mid;
        }
      }
      return nums[i];    
    }
}
