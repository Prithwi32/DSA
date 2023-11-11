package Arrays.Hard;

import java.util.*;

public class threeSumProblem {
    public static List<Integer> findEle(int arr[], int n) {
        int cnt1 = 0, cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && arr[i] != ele2) {
                cnt1 = 1;
                ele1 = arr[i];
            } else if (cnt2 == 0 && arr[i] != ele1) {
                cnt2 = 1;
                ele2 = arr[i];
            } else if (arr[i] == ele1) {
                cnt1++;
            } else if (arr[i] == ele2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> ls = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele1) {
                cnt1++;
            }
            if (arr[i] == ele2) {
                cnt2++;
            }
        }
            int mini = (int) (n / 3) + 1;
            if (cnt1 >= mini)
                ls.add(ele1);
            if (cnt2 >= mini)
                ls.add(ele2);

        return ls;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> ans = findEle(arr, n);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        sc.close();
    }
}
