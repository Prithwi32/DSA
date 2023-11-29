
import java.util.*;

public class singleElement {
    public static int findSingle(int arr[], int n) {
        if (n == 0)
            return arr[0];
        if (arr[0] != arr[1])
            return arr[0];
        if (arr[n - 1] != arr[n - 2])
            return arr[n - 1];

        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            // If arr[mid] is the single element:
            if (arr[mid - 1] != arr[mid] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            // We are in the left:
            if ((mid % 2 == 1 && arr[mid - 1] == arr[mid]) || mid % 2 == 0 && arr[mid + 1] == arr[mid]) {
                // Eliminate the left half:
                low = mid + 1;
            }
            // We are in the right:
            else {
                // Eliminate the right half:
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findSingle(arr, n);
        System.out.println(ans);
        sc.close();
    }
}
