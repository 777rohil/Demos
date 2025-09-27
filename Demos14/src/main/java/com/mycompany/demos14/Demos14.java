/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demos14;

import java.util.ArrayList;

/**
 *
 * @author ROHIL
 */
public class Demos14 {

    public static void main(String[] args) {
        /* 25/09/2025 */

 /* FOR-EACH LOOP --> ALSO KNOWN AS A ENHANCED FOR LOOP    */
        //String [] animals = {"Lion", "Dog", "Cat", "Rat"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Lion");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rat");

        for (String i : animals) {
            System.out.println(i);

        }
    }
}
