package Arrays;
//Brute Force Approach
// public class moveZeroesToEnd{
//     public static void main(String[] args){
//         int[] arr1 = new int[]{1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
//         int n = arr1.length;
//         int[] temp = new int[n];
        
//         int cnt = 0;
//         for(int i = 0; i < n; i++){
//             if(arr1[i] != 0){
//                 temp[cnt] = arr1[i];
//                 cnt++;
//             }
//         }
        
//         for(int i = 0; i < n; i++){
//             System.out.print(temp[i]+" ");
//         }
//     }
// }

//Optimal Approach
public class moveZeroesToEnd{
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr1.length;
        int j = -1;
        
        for(int i = 0; i < n; i++){
            if(arr1[i] == 0){
                j = i;
                break;
            }
        }
        
        for(int i = (j + 1); i < n; i++){
            if(arr1[i] != 0){
                int temp = arr1[j];
                arr1[j] = arr1[i];
                arr1[i] = temp;
                j++;
            }
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}