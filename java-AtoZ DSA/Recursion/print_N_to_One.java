import java.util.*;

public class print_N_to_One{

// 1. By Recursion:
static void print1(int i, int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        print1(i-1,n);
    }

// 2. By Backtracking:
static void print2(int i, int n){
    if(i<1){
        return;
}
    print2(i-1,n);
    System.out.println(n-i+1);
}

static void print3(int i, int n){
if(i>n){
    return;
}
print3(i+1, n);
System.out.println(i);
}


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // print1(n,n);
        // print2(n,n);
        print3(1,n);
        sc.close();
    }
}