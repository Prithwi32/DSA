package Arrays.Medium;

import java.util.*;

public class sortAnArray {
    // Dutch national Flag Algorithm.
    static void optimalSort(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap mid and low
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // swap mid and high
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;

                high--;
            }
        }
    }

static void betterSort(int[] arr, int n){
    int count0 = 0, count1 = 0, count2 = 0;
    for(int i=0; i<n; i++){
        if(arr[i] == 0){
            count0++;
        }
        else if(arr[i] == 1){
            count1++;
        }
        else{
            count2++;
        }
    }
    for(int i=0; i<count0; i++){
        arr[i] = 0;
    }
    for(int i = count0; i<count0+count1; i++){
        arr[i] = 1;
    }
    for(int i=count0+count1; i<count0+count1+count2; i++){
        arr[i] = 2;
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        betterSort(arr, n);

        // optimalSort(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
