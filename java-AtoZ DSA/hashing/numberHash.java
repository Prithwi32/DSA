package hashing;

import java.util.*;

public class numberHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // precompute
        int hash[] = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // for (int i = 0; i < n; i++) {
        //     System.out.println(hash[i] + " ");
        // }

        int q;
        q = sc.nextInt();
        while (q-- != 0) {
        int num;
        num = sc.nextInt();

        // fetching
        System.out.println(hash[num]);
        }
        sc.close();

    }

}
