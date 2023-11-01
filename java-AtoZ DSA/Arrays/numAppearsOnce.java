package Arrays;

import java.util.*;
public class numAppearsOnce {

    static int findNum(int arr[], int n){
        int xor = 0 ;
        for(int i=0; i<n; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = findNum(arr, n);
        System.out.println(ans);
        sc.close();

    }
}
