package Arrays.Hard;

import java.util.*;

public class majorityElement {
    public static List<List<Integer>> findThreeSum(int[] arr, int n){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        //remove duplicates:
        for(int i=0; i<n; i++){
            if(i != 0 && arr[i] == arr[i-1]) continue;
        //moving 2 pointers:
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
            //skip the duplicates:
                    while(j<k && arr[j] == arr[j-1]) j++;
                    while(j<k && arr[k] == arr[k+1]) k--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = findThreeSum(arr, n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
