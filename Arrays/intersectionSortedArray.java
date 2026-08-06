package Arrays;
import java.util.*;

//Brute Force Approach
// public class intersectionSortedArray{
//     public static void main(String[] args){
//         int[] arr1 = new int[]{1, 1, 2, 3, 4, 5};
//         int[] arr2 = new int[]{2, 3, 4, 4, 5, 6};
//         int n1 = arr1.length;
//         int n2 = arr2.length;
//         int[] visited = new int[n2]; //Take the smaller array size
//         ArrayList<Integer> arrayList = new ArrayList<>();
        
//         for(int i = 0; i < n1; i++){
//             for(int j = 0; j < n2; j++){
//                 if(arr1[i]==arr2[j] && visited[j] == 0){
//                     arrayList.add(arr1[i]);
//                     break;
//                 }
                
//                 if(arr1[i] < arr2[j]){
//                     break;
//                 }
//             }
//         }
        
//         for(int i = 0; i < arrayList.size(); i++){
//             System.out.print(arrayList.get(i)+" ");
//         }
//     }
// }

//Optimal Solution
public class intersectionSortedArray{
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 1, 2, 3, 4, 5};
        int[] arr2 = new int[]{2, 3, 4, 4, 5, 6};
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        int i = 0;
        int j = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                arrayList.add(arr1[i]);
                i++;
                j++;
            }
        }
        
        for(int x = 0; x < arrayList.size(); x++){
            System.out.print(arrayList.get(x)+" ");
        }
    }
}