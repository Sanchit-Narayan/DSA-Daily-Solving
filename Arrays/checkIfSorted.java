package Arrays;

public class checkIfSorted{
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 2, 3, 4};
        
        int flag = 0;
        for(int i = 1; i < arr1.length; i++){
            if(arr1[i] >= arr1[i - 1]){
                continue;
            }else{
                flag = 1;
                break;
            }
        }
        
        if(flag == 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
    }
}