package Arrays.Medium;

import java.util.*;

public class nextPermutation {

    static List<Integer> findNextPermutation(List<Integer> A) {
        int n = A.size();

        // Step 1: Find the break point:
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            Collections.reverse(A);
            return A;
        }

        // Step 2: Find the next greater element
        // and swap it with arr[ind]:
        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                int temp = A.get(ind);
                A.set(ind, A.get(i));
                A.set(i, temp);
                break;
            }
        }

        List<Integer> sublist = A.subList(ind+1, n);
        Collections.reverse(sublist);
        return A;
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(new Integer[] { 2, 1, 5, 4, 3, 0, 0 });
        List<Integer> ans = findNextPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");
    }
}
