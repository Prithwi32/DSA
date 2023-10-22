import java.util.Scanner;

public class sum {

    // 1. Parameterised way
    static void sum1(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sum1(i - 1, sum + i);
    }

    // 2. Functional Recursion
    static int sum2(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum2(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum1(n, 0);
        // int ans = sum2(n);
        // System.out.println("Sum is: " + ans);
        sc.close();
    }
}
