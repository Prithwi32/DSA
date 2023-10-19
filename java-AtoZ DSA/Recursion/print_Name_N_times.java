import java.util.*;

public class print_Name_N_times {

    static void print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Prithwi");
        print(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1, n);
        sc.close();
    }

}