package Arrays;

public class secondLargest{
    public static void main(String[] args){
        int[] arr1 = new int[]{3, 2, 5, 3, 3};
        
        int largest = arr1[0];
        int sLargest = -1;
        
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] > largest){
                sLargest = largest;
                largest = arr1[i];
            }else if(arr1[i] < largest && arr1[i] > sLargest){
                sLargest = arr1[i];
            }
        }
        
        System.out.println(sLargest);
    }
}