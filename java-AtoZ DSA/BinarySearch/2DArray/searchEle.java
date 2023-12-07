
import java.util.*;

public class searchEle {

    // In this question, all elements are sorted, if u strech the matrix u will get
    // 1d sorted array
    public static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
        int n = matrix.size();
        int m = matrix.get(0).size();
        int low = 0;
        int high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m;
            int col = mid % m;
            if (matrix.get(row).get(col) == target)
                return true;
            else if (matrix.get(row).get(col) > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }

    // in this matrix, only all rows and columns are sorted but not all elements
    public static boolean searchElement(ArrayList<ArrayList<Integer>> matrix, int target) {
        int n = matrix.size();
        int m = matrix.get(0).size();
        int row = 0;
        int col = m - 1;
        while (row < n && col >= 0) {
            if (matrix.get(row).get(col) == target)
                return true;
            else if (matrix.get(row).get(col) < target)
                row++;
            else col--;
        }
        return false;
    }

    public static void main(String[] args) {
        // ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        // matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        // matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        // matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

        // boolean result = searchMatrix(matrix, 8);
        // System.out.println(result ? "true" : "false");

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 4, 7, 11, 15)));
        matrix.add(new ArrayList<>(Arrays.asList(2, 5, 8, 12, 19)));
        matrix.add(new ArrayList<>(Arrays.asList(3, 6, 9, 16, 22)));
        matrix.add(new ArrayList<>(Arrays.asList(10, 13, 14, 17, 24)));
        matrix.add(new ArrayList<>(Arrays.asList(18, 21, 23, 26, 30)));

        boolean result = searchElement(matrix, 8);
        System.out.println(result ? "true" : "false");
    }
}
