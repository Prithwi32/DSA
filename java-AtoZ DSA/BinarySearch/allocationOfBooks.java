package BinarySearch;

import java.util.*;

public class allocationOfBooks {
    public static int findStudents(ArrayList<Integer> arr, int mid) {
        int students = 1;
        int pages = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            if (pages + arr.get(i) <= mid) {
                pages += arr.get(i);
            } else {
                students++;
                pages = arr.get(i);
            }
        }
        return students;
    }

    public static int findUsingBs(ArrayList<Integer> arr, int n, int m) {
        if(m>n) return -1;
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            int students = findStudents(arr, mid) ;
            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // ArrayList<Integer> arr = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        //     arr.get(i);
        // }
        // int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int n = 5;
        int m = 4;
        int ans = findUsingBs(arr, n, m);
        System.out.println(ans);
       // sc.close();
    }
}