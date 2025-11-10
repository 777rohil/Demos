/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos24;

/**
 *
 * @author ROHIL
 */
public class Demos24 {

    public static void main(String[] args) {
        /* 19/08/2025 */
        
        /* CONSTRUCTORS --> Special method that is called when an object is created (instantiated) */
        
        Human human1 = new Human("Jeff", 18, 65.00);
        Human human2 = new Human("Carlos", 21, 70.00);
        
        System.out.println(human1.name);
        System.out.println(human2.name);
        System.out.println();
        
        human1.drink();
        human2.eat();
        
        
    }
}
