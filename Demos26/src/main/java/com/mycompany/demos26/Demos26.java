/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos26;

/**
 *
 * @author ROHIL
 */
public class Demos26 {

    public static void main(String[] args) {
       /*  /10/2025 */
       
       /* OVERLOADED CNSTRUCTORS */
       
       /* Overloaded constructors --> Multiple constructors within the same class, with the same name
                                                           but have different parameters.
       */
       
       // Create an instanceof the Pizza class
       Pizza p = new Pizza(" Sour dough", " mayonaise", " cheddar");
       
        System.out.printf("Here are your ingredients for the pizza: %-55s\n   %-55s\n  %-55s\n  %-55s" , p.bread , p.cheese , p.sauce , p.topings );
        
    }
}
