import java.util.*;

public class _functions {
    public static int  sum(int num1, int num2){
        System.out.println("Sum of two numbers: " + (num1 + num2));
        return num1 + num2;
    }
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int result = sum(num1,num2);
        System.out.println("main block " + result);
        System.out.println("Num1: " + num1 + " and Num2: " + num2);
        
        sc.close();
    }
}
