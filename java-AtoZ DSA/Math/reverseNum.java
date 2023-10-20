package Math;

import java.util.Scanner;

public class reverseNum {
    public static int reverse(int num) {
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = reverse(num);
        System.out.println(ans);
        sc.close();
    }
}
