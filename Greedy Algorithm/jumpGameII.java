public class jumpGameII{
    static int[] arr;
    private static int jumpGamesII(int index, int jumps){
        if(index >= (arr.length - 1)){
            return jumps;
        }
        int mini = Integer.MAX_VALUE;
        
        for(int i = 1; i <= arr[index]; i++){
            mini = Math.min(mini, jumpGamesII(index + i, jumps + 1));
        }
        
        return mini;
    }
    
    public static void main(String[] args){
        arr = new int[]{2, 3, 1, 1, 4};
        System.out.println(jumpGamesII(0, 0));
    }
}