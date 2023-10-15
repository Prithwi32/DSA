/* Functions can be differentiated on the basis of parameter
Two ways to pass the parameters in functions: call by value and call by reference.
C/C++ supports the call by reference because in the call by reference we pass the address of actual parameters in the place of formal parameters using Pointers.
And "Java" does not support Pointers that’s why Java does not support Call by Reference but c/c++ support pointers hence these language support call by Reference.

There are some ways to achieve pass by reference in java in the place of the call by reference: 

1.  Make a particular variable of a particular datatype as a class member.
2.  Passing collections or Single element array as parameter.
3.  Update the Return value:
*/

import java.util.*;

public class passByRefernce {
    static int printNum(int num){
        System.out.println(num);
        num += 5;
        System.out.println(num);
        num += 5;
        System.out.println(num);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int UpdatedNum = printNum(num);
        System.out.println("Number as a result of pass  by value: " + num);
        System.out.println("Updated Number: " + UpdatedNum);

        sc.close();
    }
    
}
