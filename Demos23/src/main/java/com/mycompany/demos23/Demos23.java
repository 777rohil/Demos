/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos23;

/**
 *
 * @author ROHIL
 */
public class Demos23 {

    public static void main(String[] args) {
        /* 18/10/2025 */
        
        /* OBJECT ORIENTATED PROGRAMMING --> OOP */
        
        // Objects --> an instance of a class that may  contain attributes and methods 
        // Example --> phone, book, cup, ect.
        
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        
        System.out.println(myCar1.colour);
        System.out.println(myCar1.make);
        System.out.println(myCar1.modle);
        System.out.println(myCar1.price);
        System.out.println(myCar1.year);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.modle);
        
        myCar1.drive();
        
        myCar1.brake();
     
    }
}
