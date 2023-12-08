
public class findPeak {
    public static int findMaxIndex(int [][]mat, int n, int m, int col){
    int maxValue = -1;
    int index = -1;
    for(int i=0; i<n; i++){
        if(mat[i][col] > maxValue){
            maxValue = mat[i][col];
            index = i;
        }
    }
    return index;
}
    public static int[] findPeakGrid(int [][]mat){
    int arr[] = {-1, -1};
    int n = mat.length;
    int m = mat[0].length;
    int low = 0, high = m-1;
    while(low <= high){
        int mid = (low+high) / 2;
        int maxRowIndex = findMaxIndex(mat, n, m, mid);
        int left = mid-1 >= 0 ? mat[maxRowIndex][mid-1] : -1;
        int right = mid+1 < m ? mat[maxRowIndex][mid+1] : -1;
        if(mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right){
            arr[0] = maxRowIndex;
            arr[1] = mid;
            return arr;
        }else if(mat[maxRowIndex][mid] < left){
            high = mid - 1;
        }else{
            low = mid + 1;
        }
    }
    return arr;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 7 }, { 3, 4, 6, 0 }, { 1, 1, 4, 7 }, { 3, 9, 6, 8 } };
        int ans[] = findPeakGrid(arr);
        System.out.println("[ " + ans[0] + " " + ans[1] + " ]" );
    }
}

