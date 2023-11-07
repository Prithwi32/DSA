package Arrays.Medium;

import java.util.*;

public class leadersInArray {
    public static ArrayList<Integer> findLeader(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

public static ArrayList<Integer> findLeaderOptimal(int arr[], int n){
int maxi = Integer.MIN_VALUE;
ArrayList<Integer> ans = new ArrayList<>();
for(int i=n-1; i>=0; i--){
   if(arr[i] > maxi){
    ans.add(arr[i]);
   }
   maxi = Math.max(maxi, arr[i]);
}
// Collections.sort(ans);
return ans;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // ArrayList<Integer> ans = findLeader(arr, n);
        ArrayList<Integer> ans = findLeaderOptimal(arr, n);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        sc.close();
    }
}
