package Arrays;

//Brute Force Approach
// public class checkMissingNumber{
//     public static void main(String[] args){
//         int[] arr1 = new int[]{1, 2, 4, 5};
//         int n = 5;
        
//         for(int i = 1; i <= n; i++){
//             int flag = 0;
//             for(int j = 0; j < (n-1); j++){
//                 if(arr1[j] == i){
//                     flag = 1;
//                     break;
//                 }
//             }
//             if(flag == 0){
//                 System.out.print(i);
//             }
//         }
//     }
// }

//Better Solution
// public class checkMissingNumber{
//     public static void main(String[] args){
//         int[] arr1 = new int[]{1, 2, 4, 5};
//         int N = 5;
//         int[] temp = new int[N+1];
        
//         for(int i = 0; i < (N-1); i++){
//             temp[arr1[i]] = 1;
//         }
        
//         for(int i = 1; i < (N+1); i++){
//             if(temp[i] == 0){
//                 System.out.println(i);
//                 break;
//             }
//         }
//     }
// }

//Optimal Solution
// public class checkMissingNumber{
//     public static void main(String[] args){
//         int[] arr1 = new int[]{1, 2, 4, 5};
//         int N = 5;
//         int sum = (N*(N+1))/2;
        
//         int ansSum = 0;
//         for(int i = 0; i < (N-1); i++){
//             ansSum += arr1[i];
//         }
        
//         System.out.print(sum-ansSum);
//     }
// }

//Using XOR
public class checkMissingNumber{
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 2, 4, 5};
        int N = 5;
        int XOR1 = 0;
        for(int i = 1; i <= N; i++){
            XOR1 = XOR1 ^ i;
        }
        int XOR2 = 0;
        for(int i = 0; i < (N-1); i++){
            XOR2 = XOR2 ^ arr1[i];
        }

        System.out.print(XOR1^XOR2);
    }
}