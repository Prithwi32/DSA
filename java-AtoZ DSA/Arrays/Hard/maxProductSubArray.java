package Arrays.Hard;

import java.util.*;

public class maxProductSubArray {

    public static int findMaxProductBrute(int arr[], int n) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int p = 1;
                for (int k = i; k <= j; k++) {
                    p *= arr[k];
                    result = Math.max(result, p);
                }
            }
        }
        return result;
    }

    public static int findMaxProductBetter(int arr[], int n) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int prod = 1;
            for (int j = i + 1; j < n; j++) {
                prod *= arr[j];
                result = Math.max(result, prod);
            }
            result = Math.max(result, prod);
        }
        return result;
    }

    public static int findMaxProductOptimal(int arr[], int n) {
        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            prefix *= arr[i];
            suffix *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(prefix, suffix));
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
        // int ans = findMaxProductBrute(arr, n);
        // int ans = findMaxProductBetter(arr, n);
        int ans = findMaxProductOptimal(arr, n);
        System.out.println(ans);
        sc.close();
    }
}
