package BinarySearch;
import java.util.*;

public class FindPeakElement {
    public static int find(int[] arr, int n) {
        if(n==1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;

        int low = 1;
        int high = n-2;
        while(low <= high){
        int mid = (low+high) / 2;
        if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
        return mid;
        }

        if(arr[mid-1] < arr[mid]) low = mid + 1;
        else high = mid - 1;
        }
        return -1;

        // Brute Force Solution
        // for (int i = 0; i < n; i++) {
        //     if ((i == 0 || arr[i - 1] < arr[i]) && (i == n - 1 || arr[i] > arr[i + 1])) {
        //         return i;
        //     }
        // }
        // return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = find(arr, n);
        System.out.println(ans);
        sc.close();
    }
}
