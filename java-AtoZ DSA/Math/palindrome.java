package Math;

import java.util.Scanner;

public class palindrome {
    public static boolean palindromeNumber(int n) {
        int originalNum = n;
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n /= 10;
        }
        if (originalNum == reverse) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindromeNumber(n));
        sc.close();
    }
}