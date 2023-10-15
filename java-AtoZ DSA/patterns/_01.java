package patterns;

import java.util.*;

public class _01 {

    static void print1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void print2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void print3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void print4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void print5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void print6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void print7(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void print8(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void print9(int n) {
        print7(n);
        print8(n);
    }

    static void print10(int n) {
        // Outer loop for number of rows.
    for(int i=1;i<=2*n-1;i++){
        
        // stars would be equal to the row no. uptill first half
        int stars = i;
        
        // for the second half of the rotated triangle.
        if(i>n) stars = 2*n-i;
        
        // for printing the stars in each row.
        for(int j=1;j<=stars;j++){
            System.out.print("*");
        }
        
        // As soon as the stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        System.out.println();
    }
    }

    static void print11(int n){
        int start = 1;
        for(int i=0; i<n; i++){
            if(i%2==0) start = 1;
            for(int j=0; j<=i; j++){
                System.out.print(start);
                start = 1- start;
            }
            System.out.println();
        }
    }

    static void print13(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * n + 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print11(n);
        sc.close();

    }
}
