package Math;

import java.util.*;

public class gcd {
    public static int gcdFind(int a, int b) {
        int gcdAnswer = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcdAnswer = i;
            }
        }
        return gcdAnswer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = gcdFind(a, b);
        System.out.println(ans);
        sc.close();
    }
}
