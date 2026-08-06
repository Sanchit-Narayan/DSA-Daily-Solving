package Arrays;
public class TwoSum{
    public static void main(String[] args){
        int[] arr1 = new int[]{2, 5, 6, 8, 11};
        int target = 14;
        
        int left = 0;
        int right = arr1.length - 1;
        int flag = 0;
        while(left < right){
            int sum = arr1[left] + arr1[right];
            if(sum == target){
                flag = 1;
                break;
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        
        if(flag == 0){
            System.out.print("False");
        }else{
            System.out.print("True");
        }
    }
}