package BinarySearch;
import java.util.*;

public class insertPosition {
        public static int findInsertPosition(int[] arr, int n, int x){
        int low = 0;
        int high = n-1;
        int ans = -1;
        while (low<=high) {
            int mid = (low+high) / 2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int ans = findInsertPosition(arr, n, x);
        System.out.println(ans);
        sc.close();
    }
}
