
import java.util.*;

public class smallestDivisor {
    public static int sumByD(int arr[], int div) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) (arr[i]) / (double) (div));
        }
        return sum;
    }

    public static int find(int arr[], int limit) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        int low = 1;
        int high = maxi;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(arr, mid) <= limit) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int limit = sc.nextInt();
        int ans = find(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
        sc.close();
    }
}
