package Arrays;

//Brute Force
// class sortArrays{
//     public static void main(String[] args){
//         int[] arr1 = new int[]{0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//         int count0 = 0;
//         int count1 = 0;
//         int count2 = 0;
//         for(int i = 0; i < arr1.length; i++){
//             if(arr1[i] == 0){
//                 count0++;
//             }else if(arr1[i] == 1){
//                 count1++;
//             }else{
//                 count2++;
//             }
//         }
        
//         int counter = 0;
//         for(int i = 0; i < count0; i++){
//             arr1[counter] = 0;
//             counter++;
//         }
//         for(int i = 0; i < count1; i++){
//             arr1[counter] = 1;
//             counter++;
//         }
//         for(int i = 0; i < count2; i++){
//             arr1[counter] = 2;
//             counter++;
//         }
        
        
//         for(int i = 0; i < arr1.length; i++){
//             System.out.print(arr1[i]+" ");
//         }
//     }
// }

//Dutch National Flag Algorithm
//Optimal Solution
class sortArrays{
    public static void main(String[] args){
        int[] arr1 = new int[]{0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = arr1.length;
        
        int low = 0; 
        int mid = 0;
        int high = (n - 1);
        
        while(mid <= high){
            if(arr1[mid] == 0){
                int temp = arr1[low];
                arr1[low] = arr1[mid];
                arr1[mid] = temp;
                low++;
                mid++;
            }else if(arr1[mid] == 1){
                mid++;
            }else{
                int temp = arr1[mid];
                arr1[mid] = arr1[high];
                arr1[high] = temp;
                high--;
            }
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(arr1[i]);
        }
    }
}