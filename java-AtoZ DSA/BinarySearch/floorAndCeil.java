package BinarySearch;
import java.util.*;

public class floorAndCeil {
    public static int findFloor(int[] arr, int n, int x) {
        int floor = -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floor;
    }
    public static int findCeil(int[] arr, int n, int x) {
        int ceil = -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ceil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int ans1 = findFloor(arr, n, x);
        int ans2 = findCeil(arr, n, x);
        int ans[] = { ans1, ans2 };
        System.out.println("Floor:" + ans[0] + " Ceil:" + ans[1]);
        sc.close();
    }
}
