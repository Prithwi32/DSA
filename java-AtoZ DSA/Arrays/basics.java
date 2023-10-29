// Arrays is a data-structure having similar type of elements.
// if we define an array globally all elements are initialized with Zero.
// Maximum size of array is 10^6 if declared inside main and 10^7 if its in globally.
// continuous memory location
// since the address we can't know accessing elements by address is not possible.

package Arrays;

import java.util.*;

public class basics {

    static void largest(int[] arr, int n) {
        int large = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println(large);
    }

    static void secLargest(int[] arr, int n) {
        int largest = arr[0];
        int slargest = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }

    static void secSmallest(int[] arr, int n) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }
        System.out.println(ssmallest);
    }

    static boolean checkSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }

    static int removeDuplicate(int[] arr, int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // largest(arr, n);

        // secLargest(arr, n);

        // secSmallest(arr, n);

        // boolean ans = checkSorted(arr, n);
        // System.out.println(ans);

        int ans = removeDuplicate(arr, n);
        System.out.println("Sorted array with unique elements: ");
        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
