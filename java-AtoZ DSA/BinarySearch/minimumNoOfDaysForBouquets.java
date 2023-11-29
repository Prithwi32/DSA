
import java.util.*;

public class minimumNoOfDaysForBouquets {
    public static boolean possible(int arr[], int day, int m, int k) {
        int n = arr.length;
        int noOfB = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }

    public static int findBrute(int arr[], int m, int k) {
        int n = arr.length;
        long val = (long) m * k;
        if (val > n)
            return -1;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }
        for (int i = mini; i <= maxi; i++) {
            if (possible(arr, i, m, k)) {
                return i;
            }
        }
        return -1;
    }

    public static int findBs(int arr[], int m, int k) {
        int n = arr.length;
        long val = (long) m * k;
        if (val > n) {
            return -1;
        }
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }
        int low = mini;
        int high = maxi;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(arr, mid, m, k)) {
                high = mid - 1;
            }else{
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
        int m = sc.nextInt(); // no. of bouquets
        int k = sc.nextInt(); // adjacent flowers required.
        // int ans = findBrute(arr, m, k);
        int ans = findBs(arr, m, k);
        if (ans == -1) {
            System.out.println("We cannot make bouquets.");
        } else {
            System.out.println("We can make bouquets on day " + ans);
        }

        sc.close();
    }
}