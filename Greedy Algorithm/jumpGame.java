public class jumpGame{
    private static boolean jumpGames(int[] arr){
        int maxIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(i > maxIndex){
                return false;
            }
            maxIndex = Math.max(maxIndex, i + arr[i]);
        }
        return true;
    }
    
    public static void main(String[] args){
        int[] arr = {4, 3, 7, 1, 2};
        System.out.println(jumpGames(arr));
    }
}