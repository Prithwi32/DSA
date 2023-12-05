package BinarySearch;
import java.util.*;

public class NumberOfTimesArrayRotated {
    public static int findRotation(int[] arr, int n) {
        int ans = Integer.MAX_VALUE;
        int low = 0;
        int high = n - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                break;
            }
            low = mid + 1;
            if (arr[low] <= arr[mid]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                low = mid + 1;
            } else {
                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findRotation(arr, n);
        System.out.println(ans);
        sc.close();
    }
}
