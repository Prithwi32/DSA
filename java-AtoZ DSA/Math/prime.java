package Math;

import java.util.*;

public class prime {
    static void checkPrime(int n) {
        int count = 0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count >= 1) {
            System.out.println("false");
        } else if (n == 0 || n == 1) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkPrime(n);
        sc.close();
    }

}
