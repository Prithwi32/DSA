package Arrays.Medium;

import java.util.*;

public class rearrangeSign {
    static ArrayList<Integer> rearr1(ArrayList<Integer> arr) {
        int posIndex = 0;
        int negIndex = 1;
        int n = arr.size();
        ArrayList<Integer> temp = new ArrayList<>(Collections.nCopies(n, 0));
        for (int i = 0; i < n; i++) {
            if (arr.get(i) < 0) {
                temp.set(negIndex, arr.get(i));
                negIndex += 2;
            } else {
                temp.set(posIndex, arr.get(i));
                posIndex += 2;
            }
        }
        return temp;
    }

    static ArrayList<Integer> rearr2(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Segregate the array into positives and negatives.
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > 0){
                pos.add(arr.get(i));
            }else{
                neg.add(arr.get(i));
            }
        }

        // If positives are greater than the negatives.
        if(pos.size() > neg.size()){

            // First, fill array alternatively till the point
            // where positives and negatives are equal in number.
            for(int i=0; i<neg.size(); i++){
                arr.set(i*2, pos.get(i));
                arr.set(i*2+1, neg.get(i));
            }
            // Fill the remaining positives at the end of the array.
            int ind = neg.size()*2;
            // for(int i=ind; i<arr.size(); i++){
            //     arr.set(i, pos.get(i));
            // }
            for (int i = neg.size(); i < neg.size(); i++) {
                arr.set(ind, neg.get(i));
                ind++;
            }
        }

        else{
            for(int i=0; i<pos.size(); i++){
                arr.set(i*2, pos.get(i));
                arr.set(i*2+1, neg.get(i));
            }
            int ind = pos.size()*2;
            for(int i=ind; i<arr.size(); i++){
                arr.set(i, neg.get(i));
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 1, -2, 2, 6, -9, -5, -4));
        // ArrayList<Integer> ans = rearr1(arr);

        ArrayList<Integer> ans = rearr2(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        sc.close();
    }
}
