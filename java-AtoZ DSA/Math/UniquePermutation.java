package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UniquePermutation {
    // class Solution {
    static void swap(ArrayList<Integer> arr,int i,int j){
        int temp=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    static void permutations(Set<ArrayList<Integer>> set, ArrayList<Integer> arr,int index){
        if(index==arr.size()){
            set.add(new ArrayList<>(arr));
            return;
        }
        for(int i=index;i<arr.size();i++){
            swap(arr,i,index);
            permutations(set,arr,index+1);
            swap(arr,i,index);
        }
    }
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        Set<ArrayList<Integer>> set=new HashSet<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        permutations(set,arr,0);
        for(ArrayList<Integer> curr:set) ans.add(curr);
        Collections.sort(ans,(x,y)->{
            for(int i=0;i<x.size();i++){
                if(x.get(i)!=y.get(i)) return x.get(i)-y.get(i);
            }
            return x.get(x.size())-y.get(y.size());
        });
        return ans;
    }
// };

public static void main(String[] args) {
    // Solution solution = new Solution();

    // Example usage
    ArrayList<Integer> inputList = new ArrayList<>();
    inputList.add(1);
    inputList.add(2);
    inputList.add(3);

    int n = inputList.size();

    ArrayList<ArrayList<Integer>> result = uniquePerms(inputList, n);

    // Print the result
    for (ArrayList<Integer> permutation : result) {
        System.out.println(permutation);
    }
}
}


// Backtracking Solution
// class Solution {

//     static List<List<Integer>> ans;
//     static void swap(int arr[], int i, int j){
//         int a = arr[i];
//         arr[i] = arr[j];
//         arr[j] = a;
//     }

//     static void helper(int arr[], int idx){
//         if(idx==arr.length-1){
//             ans.add(Arrays.stream(arr).boxed().toList());
//             return;
//         }

//         HashSet<Integer> hp = new HashSet<>();
//         for(int i=idx; i<arr.length; i++){
//             if(hp.contains(arr[i])) continue;
//             hp.add(arr[i]);
//             swap(arr,i,idx);
//             helper(arr,idx+1);
//             swap(arr,i,idx);
//         }
        
//     }
//     public List<List<Integer>> permuteUnique(int[] arr) {
//         ans = new ArrayList<>();
//         helper(arr,0);
//         return ans;
//     }
// }