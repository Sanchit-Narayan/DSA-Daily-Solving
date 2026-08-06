public class assignCookies{
    private static int assignCookie(int[] greed, int[] size){
        int n = greed.length;
        int m = size.length;
        
        int l = 0; int r = 0;
        bubbleSort(greed);
        bubbleSort(size);
        
        while(l < m && r < n){
            if(greed[r] <= size[l]){
                r = r + 1;
            }
            l = l + 1;
        }
        
        return r;
    }
    
    private static void bubbleSort(int[] arr){
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args){
        int[] greed = {1, 5, 3, 3, 4};
        int[] size = {4, 2, 1, 2, 1, 3};
        System.out.println(assignCookie(greed, size));
    }
}