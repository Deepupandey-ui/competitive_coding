import java.util.Arrays;

public class Missing_No {
    
    int missingNum(int arr[]) {
        // code here
        int n= arr.length;
      
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }
}

