/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos17;

/**
 *
 * @author ROHIL
 */
public class Demos17 {

    public static void main(String[] args) {
         /* 26/09/2025 */
         /*  OVERLOADED METHODS --> METHODS THAT SHARE THE SAME NAME BUT HAVE DIFFERENT PARAMETERS
          -->METHOD NAME + PARAMETERS = METHOD SIGNATURE
         */
        // int x = add(78, 2, 16, 56);
         double y = add(3.1, 3.9);
         System.out.println(y);
         
    }
     // Outside main
    static int add(int a, int b) {
        System.out.println("This Is Overloaded Method #1: ");
        return a + b;
    }
    
    static int add(int a, int b, int c){
        System.out.println("This Is Overloaded Method #2: ");
        return a + b + c;
    }
    
    static int add(int a, int b, int c, int d){
        System.out.println("This Is Overloaded Method #3: ");
        return a + b + c;
    }
    
    static double add(double a, double b){
        System.out.println("This Is Overloaded Method #4: ");
        return a + b;
    }
    
    static double add(double a, double b, double c){
        System.out.println("This Is Overloaded Method #5: ");
        return a + b + c;
    }
    
    static double add(double a, double b, double c, double d){
        System.out.println("Thisn Is Overloaded Method #6: ");
        return a + b + c + d;
    }
}
