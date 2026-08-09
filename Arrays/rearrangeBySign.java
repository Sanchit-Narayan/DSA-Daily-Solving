//An array of size 2n contains n positive integers and n negative integers. Re-arrange them by signs, alternative positives and negatives.
package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Brute Force
// public class rearrangeBySign {
//     public static void main(String[] args) {
//         int[] arr1 = new int[]{3, 1, -2, -5, 2, -4};
//         int n = arr1.length;
//         List<Integer> positive = new ArrayList<>();
//         List<Integer> negative = new ArrayList<>();
        
//         for(int i = 0; i < n; i++){
//             if(arr1[i] >= 0){
//                 positive.add(arr1[i]);
//             }else{
//                 negative.add(arr1[i]);
//             }
//         }
        
//         int[] answer = new int[n];
//         for(int i = 0; i < n/2; i++){
//             answer[2*i] = positive.get(i);
//             answer[(2*i) + 1] = negative.get(i);
//         }
        
//         for(int i = 0; i < n; i++){
//             System.out.print(answer[i]+" ");
//         }
//     }
// }

//Optimal Solution
public class rearrangeBySign {
    public static void main(String[] args){
        int[] arr1 = new int[]{3, 1, -2, -5, 2, -4};
        int n = arr1.length;
        
        List<Integer> answer = new ArrayList<>(Collections.nCopies(n, 0));
        
        int posIndex = 0; 
        int negIndex = 1;
        
        for(int i = 0; i < n; i++){
            if(arr1[i] >= 0){
                answer.set(posIndex, arr1[i]);
                posIndex += 2;
            }else{
                answer.set(negIndex, arr1[i]);
                negIndex += 2;
            }
        }
        
        System.out.print(answer);
    }
}