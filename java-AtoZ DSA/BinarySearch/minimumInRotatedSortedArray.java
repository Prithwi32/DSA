
import java.util.*;

public class minimumInRotatedSortedArray {
    public static int findMinimum(int arr[], int n, int x) {
        int ans = Integer.MAX_VALUE;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            // optimization : if search space is sorted
            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            // if left part is sorted:
            if (arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int ans = findMinimum(arr, n, x);
        System.out.println(ans);
        sc.close();
    }
}
