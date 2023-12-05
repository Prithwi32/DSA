package BinarySearch;

import java.util.ArrayList;
import java.util.Scanner;

public class kthElementInSortedArray {

    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        if(n>m) return kthElement(arr2, arr1, m, n, k);
        int low = Math.max(k-m, 0);
        int high = Math.min(k, n);
        int left = k;
        while(low <= high){
            int mid1 = (low+high) / 2;
            int mid2 = left - mid1;
            int l1 = (mid1>0) ? arr1.get(mid1-1) : Integer.MIN_VALUE;
            int l2 = (mid2>0) ? arr2.get(mid2-1) : Integer.MIN_VALUE;
            int r1 = (mid1<n) ? arr1.get(mid1) : Integer.MAX_VALUE;
            int r2 = (mid2<m) ? arr2.get(mid2) : Integer.MAX_VALUE;

            if(l1<=r2 && l2<=r1){
                return Math.max(l1, l2);
            }else if(l1>r2){
                high = mid1-1;
            }else{
                low = mid1+1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            arr1.add(x);
        }
        int n = sc.nextInt();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int  y = sc.nextInt();
            arr2.add(y);
        }
        int k = sc.nextInt();
        int ans = kthElement(arr1, arr2, m, n, k);
        System.out.println(ans);
        sc.close();
    }
}

