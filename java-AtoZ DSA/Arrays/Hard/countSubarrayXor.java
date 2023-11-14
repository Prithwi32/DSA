package Arrays.Hard;

import java.util.*;

public class countSubarrayXor {
    public static int countWithXorBetter(int arr[], int n, int target) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int xr = 0;
            for (int j = i; j < n; j++) {
                xr = xr ^ arr[j];
                if (xr == target) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int countWithXorOptimal(int arr[], int n, int target) {
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(xr, 1);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            xr = xr ^ arr[i];
            int x = xr ^ target;

            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = countWithXorBetter(arr, n, target);
        // int ans = countWithXorOptimal(arr, n, target);
        System.out.println(ans);
        sc.close();
    }
}
