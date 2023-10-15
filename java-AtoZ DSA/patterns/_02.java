package patterns;

import java.util.*;

public class _02 {

   static void print12(int n) {
      int space = 2 * (n - 1);
      for (int i = 1; i <= n; i++) {
         // number
         for (int j = 1; j <= i; j++) {
            System.out.print(j);
         }

         // space
         for (int j = 1; j <= space; j++) {
            System.out.print(" ");
         }

         // number
         for (int j = i; j >= 1; j--) {
            System.out.print(j);
         }

         System.out.println();
         space -= 2;
      }
   }

   static void print13(int n) {
      int num = 1;
      for (int i = 0; i < n; i++) {
         for (int j = 0; j <= i; j++) {
            System.out.print(num + " ");
            num++;
         }
         System.out.println();
      }
   }

   static void print14(int n) {
      for (int i = 0; i < n; i++) {
         for (char ch = 'A'; ch <= 'A' + i; ch++) {
            System.out.print(ch);
         }
         System.out.println();
      }
   }

   static void print15(int n) {
      for (int i = 0; i < n; i++) {
         for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
            System.out.print(ch);
         }
         System.out.println();
      }
   }

   static void print16(int n) {
      for (int i = 0; i < n; i++) {
         char ch = (char) ((int) 'A' + i);
         for (int j = 0; j <= i; j++) {
            System.out.print(ch);
         }
         System.out.println();
      }
   }

   static void print17(int n) {
      for (int i = 0; i < n; i++) {

         // spaces
         for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
         }

         // characters
         char ch = 'A';
         int breakpoint = (2 * i + 1) / 2;
         for (int j = 1; j <= 2 * i + 1; j++) {
            System.out.print(ch);
            if (j <= breakpoint) {
               ch++;
            } else {
               ch--;
            }
         }

         // spaces
         for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
         }

         System.out.println();
      }
   }

   static void print18(int n) {
      for (int i = 0; i < n; i++) {
         for (char ch = (char) ((int) ('E') - i); ch <= 'E'; ch++) {
            System.out.print(ch);
         }
         System.out.println();
      }
   }

   static void print19(int n) {
      // PART 1:
      int spaces = 0;
      for (int i = 0; i < n; i++) {

         // stars
         for (int j = 1; j <= n - i; j++) {
            System.out.print("*");
         }

         // spaces
         for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
         }

         // stars
         for (int j = 1; j <= n - i; j++) {
            System.out.print("*");
         }
         spaces += 2;
         System.out.println();

      }

      // PART 2:
      spaces = 2*n - 2;
      for (int i = 1; i <= n; i++) {

         // stars
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }

         // spaces
         for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
         }

         // stars
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         spaces -= 2;
         System.out.println();

      }
   }

   static void print20(int n){
      int spaces = 2*n - 2;
      for(int i=1; i<= 2*n -1; i++){
         int stars = i;
         if(i>n) stars = 2*n-i;
         // stars
         for(int j=1; j<=stars; j++){
           System.out.print("*");
         }

         // spaces
         for(int j=0; j<spaces; j++){
            System.out.print(" ");
         }

         // stars
         for(int j=1; j<=stars; j++){
           System.out.print("*");
         }
         if(i<n){
            spaces -= 2;
         }else{
            spaces += 2;
         }
         System.out.println();
      }
   }

   static void print21(int n){
      for(int i=0; i<n; i++){
         for(int j=0; j<n; j++){
            if(i==0 || i==n-1 || j==0 || j==n-1){
               System.out.print("*");
            }else{
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }

   static void print22(int n){
      for(int i=0; i<2*n-1; i++){
         for(int j=0; j<2*n-1; j++){
            int top = i;
            int left = j;
            int right = (2*n-2)-j;
            int bottom = (2*n-2)-i;
            System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
         }
         System.out.println();
      }
   }

   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      print22(n);
      sc.close();
   }
}
