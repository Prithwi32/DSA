package Arrays;

import java.util.*;

public class unionOfArrays {
    static ArrayList<Integer> doUnion(int[] arr1, int[] arr2, int m, int n) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                if (temp.size() == 0 || temp.get(temp.size() - 1) != arr1[i]) {
                    temp.add(arr1[i]);
                }
                i++;
            } else {
                if (temp.size() == 0 || temp.get(temp.size() - 1) != arr2[j]) {
                    temp.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < m) {
            if (temp.get(temp.size() - 1) != arr1[i]) {
                temp.add(arr1[i]);
            }
            i++;
        }
        while (j < n) {
            if (temp.get(temp.size() - 1) != arr2[j]) {
                temp.add(arr2[j]);
            }
            j++;
        }
        return temp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            arr2[j] = sc.nextInt();
        }

        ArrayList<Integer> Union = doUnion(arr1, arr2, m, n);
        sc.close();
        for (int i = 0; i < Union.size(); i++) {
        System.out.print(Union.get(i) + " ");
        }

        // for (int val : Union)
        //     System.out.print(val + " ");

    }
}
