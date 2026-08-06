package Arrays;

//Brute Force Approach
// public class shiftByD{
//     public static void main(String[] args){
//         int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
//         int d = 3;
        
//         int n = arr1.length;
//         int[] temp = new int[d];
//         for(int i = 0; i < d; i++){
//             temp[i] = arr1[i];
//         }
        
//         for(int i = d; i < n; i++){
//             arr1[i - d] = arr1[i];
//         }
        
//         for(int i = n - d; i < n; i++){
//             arr1[i] = temp[i - (n - d)];
//         }
        
//         for(int i = 0; i < n; i++){
//             System.out.print(arr1[i]+" ");
//         }
//     }
// }

//Optimal Solution
public class shiftByD{
    public static void Reverse(int[] arr1, int start, int end){
        while(start <= end){
            int temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        int n = arr1.length;
        
        Reverse(arr1, 0, (d-1));
        Reverse(arr1, d, (n-1));
        Reverse(arr1, 0, (n-1));
        
        for(int i = 0; i < n; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}