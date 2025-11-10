/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demos27;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ROHIL
 */
public class Demos27 {

    public static void main(String[] args) {
        /* 23/10/2025 */

 /* EXCEPTIONS
                an event that interupts the normal flow of a program (Dividing by 0, file not found, mismatch input type)
                 surround any dangerous code with a try{} block
                  try{}, catch{}, finally{}*/
 
        Scanner kb = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = kb.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("That was not a number");
        } catch (ArithmeticException e) {
            System.out.println("You Cant Divide By Zero");
        } // Catching all exceptions is not good practise but you can use it as a safety net
        catch (Exception e) {
            System.out.println("Something went wrong ");
        } finally {
            kb.close();
            System.out.println("This always executes");
        }
    }
}
