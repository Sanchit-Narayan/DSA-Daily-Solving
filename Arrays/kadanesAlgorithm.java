//Maximum Subarray Sum
//Kadane's Algorithm: Go through the sub-array, if the sum goes below 0 drop the sub-array.
package Arrays;

public class kadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr1 = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        
        int sum = 0;
        int maximum = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr1.length; i++){
            sum += arr1[i];
            
            if(sum > maximum){
                maximum = sum;
            }
            
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.print(maximum);   
    }
}