import java.util.*;

public class removeOverlaps{
    public static int eraseOverlaps(int[][] array1){
        int n = array1.length;
        
        Arrays.sort(array1, (a, b)->{
            if(a[1] == b[1]){
                return a[0] - b[0];
            }
            return a[1] - b [1];
        });
        
        int count = 1;
        int lastEndTime = array1[0][1];
        
        for(int i = 1; i < n; i++){
            if(array1[i][0] > lastEndTime){
                count++;
                lastEndTime = array1[i][1];
            }
        }
        
        return (n - count);
    }
    
    public static void main(String[] args) {

        int[][] intervals = {
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 3}
        };

        int ans = eraseOverlaps(intervals);

        System.out.println("Minimum intervals to remove = " + ans);
    }
}