package sorting;

import java.util.*;

public class quick_sort {
    static int f(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;
        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr.get(j);
                arr.set(j, arr.get(i));
                arr.set(i, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }

    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int p_index = f(arr, low, high);
            qs(arr, low, p_index - 1);
            qs(arr, p_index + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int arr[] = new int[n];
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        qs(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        sc.close();

    }
}



// public class Solution {

//     public static void quickSort(int[] input, int startIndex, int endIndex) {

//         if (startIndex < endIndex) {

//             int loc = Partition(input, startIndex, endIndex);

//             quickSort(input, startIndex, loc - 1);

//             quickSort(input, loc + 1, endIndex);

//         }

//     }

//     public static int Partition(int[] input, int startIndex, int endIndex) {

//         int pivot = input[startIndex];

//         int start = startIndex;

//         int end = endIndex;

//         while (start < end) {

//             while (start < endIndex && input[start] <= pivot) {

//                 start++;

//             }

//             while (end > startIndex && input[end] > pivot) {

//                 end--;

//             }

//             if (start < end) {

//                 int temp = input[start];

//                 input[start] = input[end];

//                 input[end] = temp;

//             }

//         }

//         input[startIndex] = input[end];

//         input[end] = pivot;

//         return end;

//     }

// }