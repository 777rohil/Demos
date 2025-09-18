/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos11;

/**
 *
 * @author ROHIL
 */
public class Demos11 {

    public static void main(String[] args) {
        /* 17/09/2025 */
         
        // String = A reference data type that can be used to stoe one or more characters
        // Reference data types have access to useful methods
        
        String name = "Rohil";
        
//       boolean result = name.equals("Rohil");  --> TRUE
//         boolean result = name.equals("rohil");  --> FALSE
//         boolean result = name.equalsIgnoreCase("rohil");  --> TRUE

//        int result = name.length(); --> How many letters

//        char result = name.charAt(0);  --> Displays the character at a specific number 
       
//        boolean result =name.isEmpty(); --> is the string empty?
          
//        String result = name.toUpperCase(); --> converts string to uppercase
//        String result = name.toLowerCase(); --> converts to lowercase

          String result = name.replace("Rohil", "Fireman");
        
        System.out.println(result);
        
    }
}
