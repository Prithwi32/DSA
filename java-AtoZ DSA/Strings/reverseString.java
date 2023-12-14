package Strings;

import java.util.Scanner;

public class reverseString {
    public static String reverseString(String str){
        String arr[] = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str[] = sc.nextLine();
        // int n = str.length();
        // // String reverse = str.substring(0, n);
        // char reverse = 0;
        // // int j = 0;
        // for (int i = 0; i < n; i++) {
        //     reverse += str.charAt(i);
        // }
        // System.out.println(str);
        // System.out.println(reverse);
        // sc.close();

        // String str = "Prithwi Hegde";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = reverseString(str);
        System.out.println(ans);
    }
}