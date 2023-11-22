package BinarySearch;

import java.util.*;

public class searchElementInRotatedSortedArray {
    public static int findElement(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x)
                return mid;

            // for duplicates
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
                continue;
            }
            // left sorted
            if (arr[low] <= arr[mid]) {
                // element exists
                if (arr[low] <= x && x <= arr[mid]) {
                    high = mid - 1;
                }
                // element not exits
                else {
                    low = mid + 1;
                }
            }
            // right sorted
            else {
                if (arr[mid] <= x && x <= arr[high]) {
                // element exists
                    low = mid + 1;
                }
                // element not exits
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        sc.close();
        int ans = findElement(arr, n, x);
        System.out.println(ans);
        //  boolean ans = findElement(arr, n, x);
    //     if (ans == false)
    //     System.out.println("Target is not present.");
    // else
    //     System.out.println("Target is present in the array.");
    }
}
