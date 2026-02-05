public class max_odd_Binary {
    public String maximumOddBinaryNumber(String s) {
       int left=0;
       int right=s.length()-1;
       char arr[]=s.toCharArray();
       while(left<=right){
    
        if(arr[left]=='1'){
            left++;
        }
        if(arr[right]=='0'){
            right--;
        }
        
       
       if(left<right && arr[right]=='1' && arr[left]=='0'){
          arr[right]='0';
          arr[left]='1';
        }
       }
       arr[right]='0';
       arr[s.length()-1]='1';
       return new String(arr);      
    }
} 

