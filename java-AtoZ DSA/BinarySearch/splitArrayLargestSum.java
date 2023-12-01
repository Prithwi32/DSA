// Painters Partition.

package BinarySearch;
import java.util.*;
public class splitArrayLargestSum {
    public static int findSum(int arr[], int mid){
        int n = arr.length;
        int partitions = 1;
        long subArraySum = 0;
        for(int i=0; i<n; i++){
            if(subArraySum + arr[i] <= mid){
                subArraySum += arr[i];
            }else{
                partitions++;
                subArraySum = arr[i];
            }
        }
        return partitions;
    }
    public static int findByBs(int arr[], int n, int k){
        int low = arr[0];
        int high = 0;
        for(int i=0; i<n; i++){
            low = Math.max(low, arr[i]);
            high += arr[i];
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            int partition = findSum(arr, mid);
            if(partition > k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = findByBs(arr, n, k);
        System.out.println(ans);
        sc.close();
    }
}
