package BinarySearch;
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        // if(num<=0)
        //     return false;
        // if(num % Math.sqrt(num)==0){
        //     return true;
        // }
        // return false;
        if(num==1){
            return true;
        }
        long left = 1;
        long right = num; 
        while(left<=right){
           long mid=left+(right-left)/2;
            if(mid*mid == num){
                return true;
            }
            else if(mid*mid<num){
                left=mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }
}

