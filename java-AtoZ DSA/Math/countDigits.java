package Math;

import java.util.Scanner;

public class countDigits {
    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = count(n);
        System.out.println(ans);
        sc.close();
    }
}
