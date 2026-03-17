import java.util.List;

public class FindHighestnumber {
    public int findPeakElement(List<Integer> a) {
        // Code here
       int i=0;
       int j=a.size()-1;
        while(i<j){
            int mid=(i+j)/2;
            if(a.get(mid)<a.get(mid+1)){
               i=mid+1;
            }
            else{
               j=mid;
            }
        }
        return a.get(i);
    }
}
