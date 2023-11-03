package Arrays.Medium;

import java.util.*;

public class majorityElement {
    // Moore's Voting Algorithm
    static int findMax(int[] arr, int n){
        int count = 0;
        int ele = 0;
        for(int i=0; i<n; i++){
            if(count == 0){
                count = 1;
                ele = arr[i];
            }
            else if(ele == arr[i]){
                count ++;
            }else{
                count--;
            }
        }
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == ele){
                cnt++;
            }
        }
        if(cnt > n/2){
            return ele;
        }
        return -1;
    }

    static int findMaxUsingHashMap(int arr[],  int n){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i<n; i++){
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i],value+1);
        }
        for(Map.Entry<Integer, Integer> it : mpp.entrySet()){
            if(it.getValue() > (n/2)){
                return it.getKey();
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
        // int ans = findMax(arr, n);
        int ans = findMaxUsingHashMap(arr, n);
        System.out.println(ans);
        sc.close();
    }
}
