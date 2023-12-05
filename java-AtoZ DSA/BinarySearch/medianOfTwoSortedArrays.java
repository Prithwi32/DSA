package BinarySearch;

import java.util.*;

public class medianOfTwoSortedArrays {
    public static double findMedian(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        if (n1 > n2)
            return findMedian(arr2, arr1);
        int n = (n1 + n2) / 2;
        int low = 0, high = n1;
        int left = (n1 + n2 + 1) / 2;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            int l1 = (mid1 > 0) ? arr1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? arr2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? arr1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid1 < n2) ? arr2[mid2] : Integer.MAX_VALUE;
            if (l1 <= r2 && l2 <= r1) {
                if(n%2 == 1){
                    return (double)Math.max(l1, l2);
                }else{
                    return ((double)(Math.max(l1, l2) + Math.min(r1, r2))) / 2;
                }
            }else if(l1>r2){
                high = mid1 - 1;
            }else{
                low = mid1 + 1;
            }
        }
    return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr1[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        // int[] arr1 = {1, 4, 7, 10, 12};
        // int[] arr2 = {2, 3, 6, 15};
        double ans = findMedian(arr1, arr2);
        System.out.println(ans);
        sc.close();
    }
}
