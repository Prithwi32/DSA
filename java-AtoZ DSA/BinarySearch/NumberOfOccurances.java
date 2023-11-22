package BinarySearch;
import java.util.*;

public class NumberOfOccurances {
    public static int findFirstOccurance(int arr[], int n, int x){
        int first = -1;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high) / 2;
            if(arr[mid] == x){
                first = mid;
                high = mid - 1;
            }else if(arr[mid] < x){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return first;
    }
    public static int findLastOccurance(int arr[], int n, int x){
        int last = -1;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high) / 2;
            if(arr[mid] == x){
                last = mid;
                low = mid + 1;
            }else if(arr[mid] < x){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int first = findFirstOccurance(arr, n, x);
        int last = findLastOccurance(arr, n, x);
        System.out.println(first - last + 1);
        sc.close();
    }
}
