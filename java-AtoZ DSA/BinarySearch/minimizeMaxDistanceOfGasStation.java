package BinarySearch;

import java.util.*;

public class minimizeMaxDistanceOfGasStation {

    public static int findGasStationsRequired(int arr[], double mid) {
        int n = arr.length;
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int numberInBetween = (int)((arr[i] - arr[i-1]) / mid);
            if ((arr[i] - arr[i-1]) == (mid * numberInBetween)) {
                numberInBetween--;
            }
                cnt += numberInBetween;
        }
        return cnt;
    }

    public static double findMax(int arr[], int n, int k) {
        double low = 0;
        double high = 0;
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, (double)(arr[i + 1] - arr[i]));
        }
        double diff = 1e-6;
        while (high - low > diff) {
            double mid = (low + high) / (2.0);
            int cnt = findGasStationsRequired(arr, mid);
            if (cnt > k) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return high;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        double ans = findMax(arr, n, k);
        System.out.println(ans);
        sc.close();
    }
}
