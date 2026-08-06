import java.util.Arrays;

public class minimumPlatforms {

    public static int findPlatform(int[] arr, int[] dep, int n) {

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0;
        int j = 0;

        int count = 0;
        int maxCount = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                count++;
                maxCount = Math.max(maxCount, count);
                i++;
            }
            else {
                count--;
                j++;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        int n = arr.length;

        System.out.println("Minimum Platforms Required = "
                + findPlatform(arr, dep, n));
    }
}