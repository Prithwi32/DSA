package Arrays.Easy;

import java.util.*;

public class longestSubArray {

/*
static int findSubArrayLength(int[] arr, int n, int target) {
        int left = 0;
        int right = 0;
        long sum = arr[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > target) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                maxLen = Math.max(right - left + 1, maxLen);
            }
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        return maxLen;
    }
*/

static int findUsingHashMap(int[] arr, int n, int target) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == target) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - target;
            if (mpp.containsKey(rem)) {
                int len = i - mpp.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!mpp.containsKey(sum)) {
                mpp.put(sum, i);
            }
        }
        return maxLen;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        // int len = findSubArrayLength(arr, n, target);
         int len = findUsingHashMap(arr, n, target);
        System.out.println(len);
        sc.close();
    }
}
