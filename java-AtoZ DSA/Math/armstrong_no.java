package Math;

import java.util.*;

public class armstrong_no {

    static void armstrong(int n) {
        int originalNum = n;
        int count = 0;
        int temp = n;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int sum = 0;
        while (n != 0) {
            int ld = n % 10;
            sum += Math.pow(ld, count);
            n /= 10;
        }
        if (sum == originalNum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        armstrong(n);
        sc.close();
    }
}
