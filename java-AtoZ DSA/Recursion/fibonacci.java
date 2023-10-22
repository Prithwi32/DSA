import java.util.*;

public class fibonacci {

    static int findFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = findFibonacci(n);
        System.out.println(ans);
        sc.close();
    }
}
