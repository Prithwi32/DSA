package Arrays.Easy;

import java.util.*;

public class findMissingNum {
    static int findByXOR(int[] arr, int n) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ n;
        return xor1 ^ xor2;
    }

    static int find(int[] arr, int n){
        int sum =0;
        int actual = n*(n+1)/2;
        for(int i=0; i<=n-1; i++){
            sum += arr[i];
        }
        return (actual-sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }

        // int ans1 = find(arr, n);
        int ans2 = findByXOR(arr,n);
        System.out.println(ans2);
        sc.close();
    }
}
