//Everything to the right of that particulr element should be smaller than the current element
//Last element will always be the leader
package Arrays;

import java.util.ArrayList;
import java.util.List;

//Brute Force
// public class leadersInArray {
//     public static void main(String[] args){
//         int[] arr1 = new int[]{10, 22, 12, 3, 0, 6};
        
//         int n = arr1.length;
//         List<Integer> answer = new ArrayList<>();
//         for(int i = 0; i < n; i++){
//             int leader = 0;
//             for(int j = (i+1); j < n; j++){
//                 if(arr1[j] > arr1[i]){
//                     leader = 1;
//                     break;
//                 }
//             }
//             if(leader == 0){
//                 answer.add(arr1[i]);
//             }
//         }
        
//         System.out.print(answer);
//     }
// }

//Optimal Solution
public class leadersInArray {
    public static void main(String[] args){
        int[] arr1 = new int[]{10, 22, 12, 3, 0, 6};
        int n = arr1.length;
        
        List<Integer> answer = new ArrayList<>();
        int maximum = Integer.MIN_VALUE;
        for(int i = (n-1); i >= 0; i--){
            if(arr1[i] > maximum){
                answer.add(arr1[i]);
            }
            
            maximum = Math.max(maximum, arr1[i]);
        }
        
        System.out.print(answer);
    }
}
