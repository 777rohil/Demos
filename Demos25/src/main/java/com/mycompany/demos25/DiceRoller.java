/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demos25;

import java.util.Random;

/**
 *
 * @author ROHIL
 */
public class DiceRoller {

    Random random;            // They are now global as they are declared outside the method and the methods still have access to them 
    int number;

    // Create constructor 
    DiceRoller() {
         random = new Random();
        roll();                                                                       // Pass random and number as arguements to a method
    }

    // Create method to roll 
    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

}
