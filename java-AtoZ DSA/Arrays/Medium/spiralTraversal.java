package Arrays.Medium;

import java.util.*;

public class spiralTraversal {
    static List<Integer> printSpiral(int mat[][]) {
        int n = mat.length; // no.of rows
        int m = mat[0].length; // no.of columns
        List<Integer> ans = new ArrayList<>();

        int left = 0, right = m - 1, top = 0, bottom = n - 1;

        while ( top <= bottom  && left <= right) {
            // traverse from left to right
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;
            // from top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;
            // from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }
            // from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        List<Integer> ans = printSpiral(mat);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        sc.close();

    }
}
