package Arrays;

public class removeDuplicates{
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 1, 2, 2, 2, 3, 3};
        
        int i = 0;
        for(int j = 1; j < arr1.length; j++){
            if(arr1[j] != arr1[i]){
                arr1[i+1] = arr1[j];
                i++;
            }
        }
        
        System.out.println(i+1);
    }
}