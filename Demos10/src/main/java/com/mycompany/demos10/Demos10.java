/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demos10;

/**
 *
 * @author ROHIL
 */
public class Demos10 {

    public static void main(String[] args) {
       /* 07/09/025 */
       
       // 2D Arrays = an array of an array
       
       String[][] cars =      {
                                           {"Polo", "Toyota", "Perguet",},
                                           {  "Haval", "Hyundai", "Mercedes"},
                                           { "Ranger", "Beetle" , "Fortuner"}
                                     }; 
       
//       cars[0][0] = "Polo";
//       cars[0][1] = "Toyota";
//       cars[0][2] = "Perguet";
//       cars[1][0] = "Haval";
//       cars[1][1] = "Hyandui";
//       cars[1][2] = "Mercedes";
//       cars[2][0] = "Ranger";
//       cars[2][1] = "Beetle";
//       cars[2][2] = "Fortuner";
       
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars.length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
