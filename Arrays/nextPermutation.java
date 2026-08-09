package Arrays;

public class nextPermutation {
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 3, 2};
        
        int n = arr1.length;
        int index = -1;
        
        for(int i = (n-2); i >= 0; i--){
            if(arr1[i] < arr1[i+1]){
                index = i;
                break;
            }
        }
        
        if(index == -1){
            int left = 0;
            int right = (n - 1);
            
            while(left < right){
                int temp = arr1[left];
                arr1[left] = arr1[right];
                arr1[right] = temp;
                
                left++;
                right--;
            }
            
            for(int i = 0; i < n; i++){
                System.out.print(arr1[i]+" ");
            }
        }
        
        for(int i = (n - 1); i > index; i--){
            if(arr1[i] > arr1[index]){
                int temp = arr1[i];
                arr1[i] = arr1[index];
                arr1[index] = temp;
                
                break;
            }
        }
        
        int left = (index+1);
        int right = (n - 1);
        
        while(left < right){
            int temp = arr1[left];
            arr1[left] = arr1[right];
            arr1[right] = temp;
            
            left++;
            right--;
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
