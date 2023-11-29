
import java.util.*;

public class sqrtOfInteger {
    public static int findSqrt(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;
            if (val > (long)n) {
                high = (int)mid - 1;
            } else {
                low = (int)mid + 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = findSqrt(n);
        System.out.println(ans);
        sc.close();
    }
}
