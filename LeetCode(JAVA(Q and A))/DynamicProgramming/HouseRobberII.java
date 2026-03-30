package DynamicProgramming;
public class HouseRobberII {
    public int rob(int []nums){
        int n = nums.length;
        if(n==1) return nums[0];
        return Math.max(robtake(nums,0,n-2),robtake(nums,1,n-1));
    }
    public int robtake(int[] nums,int start,int end) {
        int prev1=0;
        int prev2=0;
        for(int i=start;i<=end;i++){
            int take = prev1+nums[i];
            int skip = prev2;
            int curr = Math.max(take,skip);
            prev1=prev2;
            prev2 = curr;
        }
        return prev2;
    }
}

