package Arrays;

//Brute Force Solution
// class majorityElement1{
//     public static void main(String[] args){
//         int[] arr1 = new int[]{2, 2, 3, 3, 1, 2, 2};
//         int n = arr1.length;
        
//         for(int i = 0;  i < n; i++){
//             int count = 0;
//             for(int j = 0; j < n; j++){
//                 if(arr1[i] == arr1[j]){
//                     count++;
//                 }
//             }
            
//             if(count>(n/2)){
//                 System.out.print(arr1[i]);
//                 break;
//             }
//         }
//     }
// }

//Moore's Voting Algorithm
//Optimal Solution
class majorityElement1{
    public static void main(String[] args){
        int[] arr1 = new int[]{2, 2, 1, 3, 1, 1, 3, 1, 1};
        int count = 0;
        int el = 0;
        
        for(int i = 0; i < arr1.length; i++){
            if(count == 0){
                count = 1;
                el = arr1[i];
            }else if(arr1[i] == el){
                count++;
            }else{
                count--;
            }
        }
        
        int answer = 0;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == el){
                answer++;
            }
        }
        
        System.out.println(el+": "+answer);
    }
}