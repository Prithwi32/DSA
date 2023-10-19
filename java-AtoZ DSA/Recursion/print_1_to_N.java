import java.util.*;

public class print_1_to_N{

    // By Recursion:
    static void print1(int i, int n){
    if(i>n){
        return;
}
    System.out.println(i);
    print1(i+1, n);
}

// By Backtracking:
static void print2(int i, int n){
    if(i<1){
    return;
}
print2(i-1, n);
System.out.println(i);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // print1(1,n);
        print2(n,n);
        sc.close();
    }
}