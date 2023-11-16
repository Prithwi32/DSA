package Arrays.Hard;

import java.util.*;

public class mergeTwoSortedArray {
    public static void mergeBrute(int arr1[], int arr2[], int n, int m) {
        int left = 0;
        int right = 0;
        int idx = 0;
        int arr3[] = new int[n + m];

        // Insert the elements from the 2 arrays
        // into the 3rd array using left and right
        // pointers:
        while (left < n && right < m) {
            if (arr1[left] < arr2[right]) {
                arr3[idx] = arr1[left];
                idx++;
                left++;
            } else {
                arr3[idx] = arr2[right];
                idx++;
                right++;
            }
        }
        // If right pointer reaches the end:
        while (left < n) {
            arr3[idx++] = arr1[left++];
        }
        // If left pointer reaches the end:
        while (right < m) {
            arr3[idx++] = arr2[right++];
        }
        // Fill back the elements from arr3[]
        // to arr1[] and arr2[]:
        for (int i = 0; i < n + m; i++) {
            if (i < n) {
                arr1[i] = arr3[i];
            } else {
                arr2[i - n] = arr3[i];
            }
        }
    }

    public static void mergeOptimalOne(int arr1[], int arr2[], int n, int m) {
        int left = n - 1;
        int right = 0;

        // Swap the elements until arr1[left] is
        // smaller than arr2[right]:
        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                // swap
                int temp = arr2[right];
                arr2[right] = arr1[left];
                arr1[left] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        // Sort arr1[] and arr2[] individually:
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    // Using Gap Method : "Shell-Sort Concept"

    public static void swapIsGreater(int[] arr1, int[] arr2, int idx1, int idx2){
        if(arr1[idx1] > arr2[idx2]){
            int temp = arr1[idx1];
            arr1[idx1] = arr2[idx2];
            arr2[idx2] = temp;
        }
    }
    public static void mergeOptimalTwo(int arr1[], int arr2[], int n, int m) {
        int len = n + m;
        int gap = (len / 2) + (len % 2);
        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while(right < len){
                if(left < n && right >=n){
                    swapIsGreater(arr1, arr2, left, right-n);
                }else if(left >=n ){
                    swapIsGreater(arr2, arr2, left-n, right-n);
                }else{
                    swapIsGreater(arr1, arr1, left, right);
                }
                left++; right++;
            }
            if (gap == 1) {
                break;
            }
            gap = (gap / 2) + (gap % 2);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        // mergeBrute(arr1, arr2, n, m);
        // mergeOptimalOne(arr1, arr2, n, m);
        mergeOptimalTwo(arr1, arr2, n, m);
        sc.close();
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

}
