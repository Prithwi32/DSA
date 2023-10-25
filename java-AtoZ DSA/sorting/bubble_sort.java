package sorting;

import java.util.*;

public class bubble_sort {
    static void sort(int arr[], int n) {
        for (int i = n - 1; i >= 0; i--) {
            // int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    // didSwap = 1;
                    // System.out.println("runs");
                }
            }
            // if (didSwap == 0) {
            //     break;
            // }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
