// based on two pointer problem
public class Move_All_Zero_To_END {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        int j=0;
        int temp;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                 temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            
        }
       
    }
}

