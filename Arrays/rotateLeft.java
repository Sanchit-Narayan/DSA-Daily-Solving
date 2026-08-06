package Arrays;

public class rotateLeft{
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        
        int temp = arr1[0];
        int n = arr1.length;
        for(int i = 1; i < n; i++){
            arr1[i - 1] = arr1[i];
        }
        
        arr1[n - 1] = temp;
        
        for(int i = 0; i < n; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}