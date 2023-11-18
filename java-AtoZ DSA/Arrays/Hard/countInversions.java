package Arrays.Hard;

import java.util.*;

public class countInversions {
    public static int findCnt(int arr[], int n){
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
            if(arr[i] > arr[j] ) cnt++;
            }
        }
        return cnt;
    }
    public static int merge(int arr[], int low, int mid, int high) {
        int cnt = 0;
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                cnt += (mid - left + 1);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return cnt;
    }

    public static int doMergeSort(int arr[], int low, int high) {
        int cnt = 0;
        if (low >= high)
            return cnt;
        int mid = (low + high) / 2;
        cnt += doMergeSort(arr, low, mid);
        cnt += doMergeSort(arr, mid + 1, high);
        cnt += merge(arr, low, mid, high);
        return cnt;
    }

    public static int findCntOptimal(int arr[], int n) {
        return doMergeSort(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findCnt(arr, n);
       // int ans = findCntOptimal(arr, n);
        System.out.println(ans);
        sc.close();
    }

}
