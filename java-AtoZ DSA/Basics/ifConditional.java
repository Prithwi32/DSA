import java.util.*;

public class ifConditional{
    public static void main(String[] args) {

        // 1. Check age to conclude adult or not
        //   Scanner sc = new Scanner(System.in);
        //   int age = sc.nextInt();

        // if(age>0 && age<18){
        //     System.out.println("You are not an Adult!");
        // }
        // else if(age>=18){
        //     System.out.println("You are Adult");
        // }else{
        //     System.out.println("Please Enter a valid Age");
        // }
        //  sc.close();


        // 2. Grading system 
        // Scanner sc = new Scanner(System.in);
        // int marks = sc.nextInt();

        // if(marks<25){
        //     System.out.println("GRADE : F");
        // }else if(marks<=44){
        //     System.out.println("GRADE : E");
        // }else if(marks<=49){
        //     System.out.println("GRADE : D");
        // }else if(marks<=59){
        //     System.out.println("GRADE : C");
        // }else if(marks<=79){
        //     System.out.println("GRADE : B");
        // }else if(marks<=100){
        //     System.out.println("GRADE : 100");
        // }else{
        //     System.out.println("Enter a valid marks!");
        // }
        // sc.close();
        

        // 3. Nested LOOP
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age<18){
            System.out.println("You are not eligible for job!");
        }else if(age <= 57){
            System.out.print("Eligible for job");
            if(age>=55){
                System.out.println(", but retirement soon.");
            }
        }else{
            System.out.println("Retirement time");
        }
        sc.close();


    }
   
}