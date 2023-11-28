package BinarySearch;

import java.util.*;

public class kthMissingNum {
    public static int findMissingBrute(int arr[], int n, int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] < k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }

    public static int findMissingOptimal(int arr[], int n, int k) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high + 1 + k;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        // int ans = findMissingBrute(arr, n, k);
        int ans = findMissingOptimal(arr, n, k);
        System.out.println("Kth missing Element is: " + ans);
        sc.close();

    }
}
