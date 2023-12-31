import java.util.Scanner;

public class factorial {
    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
        sc.close();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)