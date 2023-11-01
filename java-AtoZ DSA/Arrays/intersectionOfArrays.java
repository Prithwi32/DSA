package Arrays;

import java.util.*;

public class intersectionOfArrays {

    public static ArrayList<Integer> doIntersection(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else {
                temp.add(a[i]);
                i++;
                j++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[m];
        int b[] = new int[n];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            b[j] = sc.nextInt();
        }

        // ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> ans = doIntersection(a, b);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

        sc.close();
    }
}
