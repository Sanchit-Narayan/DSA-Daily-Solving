package Arrays;
import java.util.*;

//Brute Force Approach
// public class unionSortedArrays{
//     public static void main(String[] args){
//         int[] arr1 = new int[]{1, 1, 2, 3, 4, 5};
//         int[] arr2 = new int[]{2, 3, 4, 4, 5, 6};
        
//         int n1 = arr1.length;
//         int n2 = arr2.length;
        
//         Set<Integer> set1 = new HashSet<>();
        
//         for(int i = 0; i < n1; i++){
//             set1.add(arr1[i]);
//         }
        
//         for(int i = 0; i < n2; i++){
//             set1.add(arr2[i]);
//         }
        
//         System.out.println(set1);
//     }
// }

//Optimal Solution
public class unionSortedArrays{
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 1, 2, 3, 4, 5};
        int[] arr2 = new int[]{2, 3, 4, 4, 5, 6};
        
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        int i = 0;
        int j = 0;
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                if(arrayList.size() == 0
                || arrayList.contains(arr1[i]) == false){
                    arrayList.add(arr1[i]);
                }
                i++;
            }
            else{
                if(arrayList.size() == 0
                || arrayList.contains(arr2[j]) == false){
                    arrayList.add(arr2[j]);
                }
                j++;
            }
        }
        
        while(j < n2){
            if(arrayList.size() == 0
            || arrayList.contains(arr2[j]) == false){
                arrayList.add(arr2[j]);
            }
            j++;
        }
        
        while(i < n1){
            if(arrayList.size() == 0
            || arrayList.contains(arr1[i]) == false){
                arrayList.add(arr1[i]);
            }
            i++;
        }
        
        for(int x = 0; x < arrayList.size(); x++){
            System.out.print(arrayList.get(x)+" ");
        }
    }
}