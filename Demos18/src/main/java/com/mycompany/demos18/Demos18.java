/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demos18;

/**
 *
 * @author ROHIL
 */
public class Demos18 {

    public static void main(String[] args) {
        /* 26/09/2025 */
 /* PRINTF --> AN OPTIONAL METHOD TO CONTROL, FORMAT, AND DISPLAY TEXT TO
         THE CONSOLE WINDOW.
         THW ARGUEMENTS = FORMAT + (OBJECT / VARRIABLE / VALUE)
         % [FLAGS] [PRECISION] [WIDTH]  [CONVERSION - CHARACTER]*/

        //System.out.printf("This Is A Format String %d", 123);
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Rohil";
        int myInt = 7;
        double myDouble = 10.1200;

        System.out.printf("%2b", myBoolean);            //Boolean
        System.out.printf("%2c", myChar);                  //Char
        System.out.printf("%2s", myString);                //String
        System.out.printf("%2d", myInt);                      //Int
        System.out.printf("%.2f", myDouble);                //Double

    }
}
