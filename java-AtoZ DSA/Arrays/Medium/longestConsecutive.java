package Arrays.Medium;

import java.util.*;

public class longestConsecutive {

    public static int findLongestConsecutive(int arr[], int n) {
        if (n == 0)
            return 0;

        Arrays.sort(arr);
        int longest = 1;
        int cnt = 0;
        int last_small = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == last_small) {
                cnt += 1;
                last_small = arr[i];
            } else if (arr[i] != last_small) {
                cnt = 1;
                last_small = arr[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static int findLongestConsecutiveOptimal(int arr[], int n){
        if(n==0) return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();
        // put all the array elements into set
        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }

        for(int it : set){
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
            while(set.contains(x+1)){
                x = x + 1;
                cnt = cnt + 1;
            }
            longest = Math.max(cnt, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int ans = findLongestConsecutive(arr, n);
        int ans = findLongestConsecutiveOptimal(arr, n);
        System.out.println(ans);
        sc.close();
    }

}
