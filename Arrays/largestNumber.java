package Arrays;

public class largestNumber{
    public static void main(String[] args){
        int[] arr1 = new int[]{3, 2, 5, 3, 3};
        
        int largest = arr1[0];
        for(int i = 1; i < arr1.length; i++){
            if(arr1[i] > largest){
                largest = arr1[i];
            }
        }
        
        System.out.println(largest);
    }
}