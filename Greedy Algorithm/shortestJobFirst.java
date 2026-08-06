public class shortestJobFirst{
    private static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    private static int shortestJobsFirst(int[] arr){
        int time = 0; int waitTime = 0;
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++){
            waitTime += time;
            time += arr[i];
        }
        
        return (waitTime / arr.length);
    }
    
    public static void main(String[] args){
        int[] arr = {4, 3, 7, 1, 2};
        System.out.println(shortestJobsFirst(arr));
    }
}