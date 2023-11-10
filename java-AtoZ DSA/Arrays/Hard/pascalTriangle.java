package Arrays.Hard;

import java.util.*;

public class pascalTriangle {
    public static List<Integer> generateRow(int row){
        List<Integer> eachRow = new ArrayList<>();
        long ans = 1;
        eachRow.add(1);
        for(int col=1; col<row; col++){
            ans = ans*(row-col);
            ans /= col;
            eachRow.add((int)ans);
        }
        return eachRow;
    }
    public static List<List<Integer>> printPascalTriangle(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1; row<=n; row++){
            ans.add(generateRow(row));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> ans = printPascalTriangle (n);
        for( List<Integer> it : ans){
            for(int ele : it){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// using array
/*
        int[][] arr = new int[N][];
        for (int i = 0; i < N; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    arr[i][j] = 1;
                else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        return arr;
    }
*/
