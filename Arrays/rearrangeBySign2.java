//If any of the positive or negative numbers are left, add them at the end without altering the order
package Arrays;

import java.util.ArrayList;
import java.util.List;

public class rearrangeBySign2 {
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 2, -4, -5, 3, 6};
        
        int n = arr1.length;
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            if(arr1[i] >= 0){
                positives.add(arr1[i]);
            }else{
                negatives.add(arr1[i]);
            }
        }
        
        int n1 = positives.size();
        int n2 = negatives.size();
        
        int[] answer = new int[n];
        
        if(n1 > n2){
            for(int i = 0; i < n2; i++){
                answer[2*i] = positives.get(i);
                answer[(2*i) + 1] = negatives.get(i);
            }
            
            int index = 2*n2;
            for(int i = n2; i < n1; i++){
                answer[index] = positives.get(i);
                index++;
            }
        }else{
            for(int i = 0; i < n1; i++){
                answer[2*i] = positives.get(i);
                answer[(2*i) + 1] = negatives.get(i);
            }
            
            int index = 2*n1;
            for(int i = n1; i < n2; i++){
                answer[index] = negatives.get(i);
                index++;
            }
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(answer[i]+" ");
        }
    }
}
