package Arrays.Hard;

import java.util.*;

public class missingAndRepeating {
    public static int[] findMissingAndRepeatingBrute(int[] arr, int n) {
        int repeating = -1;
        int missing = -1;
        for (int i = 1; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    cnt++;
                }
            }
            if (cnt == 2)
                repeating = i;
            else if (cnt == 0)
                missing = i;

            if (repeating != -1 && missing != -1)
                break;
        }
        int ans[] = { repeating, missing };
        return ans;
    }

    public static int[] findMissingAndRepeatingBetter(int[] arr, int n){
        int repeating = -1;
        int missing = -1;
        int hash[] = new int[n+1];
        for(int i=0; i<n; i++){
            hash[arr[i]]++;
        }
        for(int i=1; i<=n; i++){
            if(hash[i] == 2) repeating = i;
            else if(hash[i] == 0) missing = i;

            if(repeating != -1 && missing != -1) break;
        }
        int ans[] = {repeating,missing};
        return ans;
    }

    public static int[] findMissingAndRepeating(int[] arr, int n) {
        int SN = (n * (n + 1)) / 2;
        int S2N = (n * (n + 1) * (2 * n + 1)) / 6;
        int S = 0;
        int S2 = 0;
        for (int i = 0; i < n; i++) {
            S += arr[i];
            S2 += arr[i] * arr[i];
        }
        int val1 = S - SN;
        int val2 = S2 - S2N;
        val2 = val2 / val1;
        int x = (val1 + val2) / 2;
        int y = x - val1;

        int ans[] = { x, y };
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int ans[] = findMissingAndRepeatingBrute(arr, n);
        // int ans[] = findMissingAndRepeatingBetter(arr, n);
        int ans[] = findMissingAndRepeating(arr, n);
        System.out.println(ans[0] + " " + ans[1]);
        sc.close();
    }

}
