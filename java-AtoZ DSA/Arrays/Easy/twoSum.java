package Arrays.Easy;

import java.util.*;

public class twoSum {

    static String check(int[] arr, int n, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "Yes";
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        String ans = check(arr, n, target);
        System.out.println(ans);
        sc.close();
    }
}
