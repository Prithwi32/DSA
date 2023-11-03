package Arrays.Easy;

import java.util.*;

public class linearSearch {
    static int search(int[] arr, int n, int key) {
        int i;
        for ( i = 0; i < n; i++) {
            if (arr[i] == key) {
            break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        sc.close();
        int ans = search(arr, n, key);
        System.out.println(key + " is found at the index : " + ans);

    }
}
