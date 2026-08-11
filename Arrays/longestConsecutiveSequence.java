package Arrays;

//Brute Force Approach
// public class longestConsecutiveSequence{
//     private static boolean linearSearch(int[] arr1, int num){
//         for(int i = 0; i < arr1.length; i++){
//             if(arr1[i] == num){
//                 return true;
//             }
//         }
        
//         return false;
//     }

//     public static void main(String[] args){
//         int[] arr1 = new int[]{102, 4, 100, 1, 101, 3, 2, 1, 1};
//         int n = arr1.length;
        
//         int longest = 1;
        
//         for(int i = 0; i < n; i++){
//             int element = arr1[i];
//             int count = 1;
            
//             while(linearSearch(arr1, element + 1) == true){
//                 count++;
//                 element++;
//             }
            
//             if(count > longest){
//                 longest = count;
//             }
//         }
        
//         System.out.print(longest);
//     }
// }

//Better Solution
public class longestConsecutiveSequence{
    public static void main(String[] args){
        int[] arr1 = new int[]{100, 102, 100, 101, 101, 4, 3, 2, 3, 2, 1, 1, 1, 2};
        int n = arr1.length;
        
        //Sort the array
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n - i - 1); j++){
                if(arr1[j] > arr1[j + 1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;
        
        for(int i = 0; i < n; i++){
            if(arr1[i] - 1 == lastSmaller){
                count++;
                lastSmaller = arr1[i];
            }else if(arr1[i] != lastSmaller){ //duplicate should not increment count
                count = 1;
                lastSmaller = arr1[i];
            }
            
            longest = Math.max(longest, count);
        }
        
        System.out.print(longest);
    }
}