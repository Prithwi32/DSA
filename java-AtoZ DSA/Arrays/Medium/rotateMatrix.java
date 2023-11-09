package Arrays.Medium;

import java.util.*;

public class rotateMatrix {
    static int[][] rotate(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;

        // transpose
        for(int i=0; i<n; i++){
            for(int j=i+1; j<m; j++){
                int temp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = temp;
            }
        }

        // reverse
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
    return mat;
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
        rotate(mat);
        for (int i = 0; i < n; i++) {
            for(int j=0; j<m; j++){
            System.out.print(mat[i][j] + " ");
            }
        }
        sc.close();
    }
}
