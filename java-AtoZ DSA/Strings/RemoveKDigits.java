package Strings;
import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        if(k == num.length()) return "0";

        Stack<Character> stack = new Stack<>();
        int i = 0;

        while(i < num.length()){
            while(!stack.isEmpty() && k>0 && stack.peek() > num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }

        while(k-- > 0) stack.pop();

        StringBuilder sb = new StringBuilder();
        for( char c : stack) sb.append(c);

        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}

public class RemoveKDigits {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Input number and value of k
        String num = "1432219";
        int k = 3;

        // Call the removeKdigits method
        String result = solution.removeKdigits(num, k);

        // Print the result
        System.out.println("Original number: " + num);
        System.out.println("After removing " + k + " digits: " + result);
    }
}