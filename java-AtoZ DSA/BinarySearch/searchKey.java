
import java.util.*;

public class searchKey {
    public static int doIterativeSearch(int[] arr, int n, int target){
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) high = mid-1;
            else low = mid + 1;
        }
        return -1;
    }

        public static int bs(int arr[], int low, int high,int target){
        int mid = (low+high) / 2;
        if(low > high) return -1;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target) return bs(arr, mid+1, high, target);
        return bs(arr, low, mid-1, target);
    }

    public static int doRecursiveSearch(int[] arr, int n, int target){
        return bs(arr, 0, n-1, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        // int ans = doIterativeSearch(arr, n, target);
        int ans = doRecursiveSearch(arr, n, target);
        System.out.println(ans);
        sc.close();
    }

}
