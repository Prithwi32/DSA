package Arrays;

import java.util.*;

public class moveZerosToEnd {
    static void bruteApproach(int[] arr, int n) {

        // Adding non-Zero numbers to temp
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        // replacing array elements by temp elements
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        // Adding zeros to remaining places of the array
        for (int i = temp.size(); i < n; i++) {
            arr[i] = 0;
        }
    }

    static void optimalApproach(int[] arr, int n) {
        int j = -1;
        // finding first 0 in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // swaping with non-zero element
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // bruteApproach(arr, n);
        optimalApproach(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
