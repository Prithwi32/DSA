package Arrays.Medium;

import java.util.*;
public class maxSubArraySum{
    static long findMax(int[] arr, int n){
        int sum = 0;
        long maxi = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum > maxi){
                maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;
    return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        long ans = findMax(arr, n);
        System.out.println(ans);
        sc.close();
    }
}

/*
import java.util.* ;
import java.io.*;

public class Solution {

	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long maxi = 0;
	    long sum = 0;
		for(int i=0; i<n; i++){
			sum += arr[i];

			if(sum>maxi){
				maxi = sum;
			}

			if(sum<0){
				sum = 0;
			}
		}
		// if (maxi < 0) maxi = 0;
		return maxi;
	}
}
*/