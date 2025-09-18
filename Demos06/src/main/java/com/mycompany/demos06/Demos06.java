/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos06;

import java.util.Scanner;

/**
 *
 * @author ROHIL
 */
public class Demos06 {

    public static void main(String[] args) {
        /* 20/08/2025 /*
        
        /*
         While Loops --> Executes a block of code as long as its condition remains true
        */
        
        Scanner scanner = new Scanner(System.in);
        
        String name = "";
        
        while(name.isBlank()){
            System.out.print("Enter Your Name: ");
            name = scanner.nextLine();
          }
           System.out.println("Hello " + name);

         
    }
}
