package Arrays.Medium;

import java.util.*;

public class subArrayWithSumK {
    public static int countSubArray(int arr[], int n, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0;
        int cnt = 0;
        mpp.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            int remove = preSum - k;
            cnt += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
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
        int k = sc.nextInt();
        int cnt = countSubArray(arr, n, k);
        System.out.println(cnt);
        sc.close();
    }
}
