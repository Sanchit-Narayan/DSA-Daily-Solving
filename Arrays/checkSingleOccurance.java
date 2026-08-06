package Arrays;
public class checkSingleOccurance{
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 1, 2, 3, 3, 4, 4};
        int XOR1 = 0;
        for(int i = 0; i < arr1.length; i++){
            XOR1 = XOR1 ^ arr1[i];
        }
        
        System.out.println(XOR1);
    }
}