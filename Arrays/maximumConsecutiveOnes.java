package Arrays;
public class maximumConsecutiveOnes{
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 1, 0, 1, 1, 1};
        int cnt = 0;
        int maximum = 0;
        
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == 1){
                cnt++;
                maximum = Math.max(cnt, maximum);
            }else{
                cnt = 0;
            }
        }
        
        System.out.print(maximum);
    }
}