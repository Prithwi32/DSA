import java.util.Scanner;

public class reverseArray {
    /* Function to reverse arr[] from start to end */
    static void reverse(int l, int r, int arr[]) {
        int temp;
        if (l >= r)
            return;
        temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(l + 1, r - 1, arr);
    }

    /* Utility that prints out an array on a line */
    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(0, n - 1, arr);
        print(arr, n);
        sc.close();
    }
}

// import java.util.ArrayList;
// import java.util.Collections;
// ArrayList<Integer> arr = new ArrayList<>(n);
// Collections.swap(arr[n], l + 1, r - 1);
